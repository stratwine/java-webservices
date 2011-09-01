package com.github.wsclient;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import wsclient.Circle;
import wsclient.CircleFunctions;
import wsclient.CircleFunctionsService;
import wsclient.GetCircle;
import wsclient.GetCircleResponse;
import wsclient.ObjectFactory;


public class Consumer {
	
	//@Skaffman's answer:
	//Can use JAXBElement wrapper objects. 
	//Can get the JAXBElement wrappers from ObjectFactory
	
	/*
		http://stackoverflow.com/questions/819720/no-xmlrootelement-generated-by-jaxb
		http://stackoverflow.com/questions/953723/whats-the-point-of-jaxb-2s-objectfactory-classes/1367405#1367405
	*/
	
	//No more createXYZ()
	//http://weblogs.java.net/blog/kohsuke/archive/2005/08/a_story_of_migr.html
	
	/*
	 * http://stackoverflow.com/q/5780184/344927
	 * http://blog.bdoughan.com/2011/06/jaxb-and-factory-methods.html
	 */
	
	//Methods to have JAXBElement return types 
	
	/*
	 * reply #7:
	 * http://forum.springsource.org/showthread.php?40203-JAXB-unmarshalling-Exception-unexpected-element
	 */
	
	//Last snippet in Kosuke's blog: Marshalling with 
	/*
	 * http://weblogs.java.net/blog/2006/03/03/why-does-jaxb-put-xmlrootelement-sometimes-not-always
	 */
	
	public static void main(String[] args) throws JAXBException
	{
		Circle circle = new Consumer().getCircle();
		System.out.println(circle.getDescription());
		new Consumer().testObjectFactory();
	}
	
	/*
	http://weblogs.java.net/blog/kohsuke/archive/2005/10/101_ways_to_mar.html
	*/
	public Circle getCircle()
	{
		CircleFunctionsService circleFunctionsService = new CircleFunctionsService();
		CircleFunctions circleFunctions = circleFunctionsService.getCircleFunctionsPort();
		Circle circle = circleFunctions.getCircle();
		System.out.println(circle);
		return circle;
		
	}
	
	public void  testObjectFactory() throws JAXBException
	{
		ObjectFactory circleFunctionsObjectFactory = new ObjectFactory();
		GetCircle circle = circleFunctionsObjectFactory.createGetCircle();
		/*JAXBElement<GetCircle> jaxbElement = circleFunctionsObjectFactory.createGetCircle(circle);
		JAXBContext context = JAXBContext.newInstance("wsclient");

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		System.out.println("Marshalling...");
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(jaxbElement,byteArrayOutputStream);
		System.out.println(byteArrayOutputStream);

		
		System.out.println("Unmarshalling...");
		Unmarshaller unmarshaller  = context.createUnmarshaller();
		GetCircle cir = (GetCircle) unmarshaller.unmarshal(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
*/		
		//marshalWhenXMLRootElementIsNotPresent();
		marshalWhenXMLRootElementIsPresent();
	}

	public void marshalWhenXMLRootElementIsPresent() throws JAXBException {
		Circle myCircle = new Circle();
		myCircle.setDescription("Check this out !");
		myCircle.setRadius(5);
		
		System.out.println("Marshalling Circle...");
		JAXBContext jaxbContext = JAXBContext.newInstance(Circle.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		StringWriter writer = new StringWriter();
		marshaller.marshal(myCircle,writer);
		System.out.println(writer.toString());
	}
	
	@SuppressWarnings("restriction")
	public void marshalWhenXMLRootElementIsNotPresent() throws JAXBException {
		Circle myCircle = new Circle();
		myCircle.setDescription("Check this out !");
		myCircle.setRadius(5);
		
		ObjectFactory objectFactory = new ObjectFactory();
		GetCircle getCircle = new GetCircle();
		System.out.println("Marshalling Circle...");
		JAXBContext jaxbContext = JAXBContext.newInstance(Circle.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		StringWriter writer = new StringWriter();
		
		marshaller.marshal(myCircle,writer);
		System.out.println(writer.toString());
	}


}
