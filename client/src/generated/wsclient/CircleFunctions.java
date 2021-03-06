
package wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CircleFunctions", targetNamespace = "http://services.jws.github.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CircleFunctions {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getArea", targetNamespace = "http://services.jws.github.com/", className = "wsclient.GetArea")
    @ResponseWrapper(localName = "getAreaResponse", targetNamespace = "http://services.jws.github.com/", className = "wsclient.GetAreaResponse")
    public double getArea(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCircumference", targetNamespace = "http://services.jws.github.com/", className = "wsclient.GetCircumference")
    @ResponseWrapper(localName = "getCircumferenceResponse", targetNamespace = "http://services.jws.github.com/", className = "wsclient.GetCircumferenceResponse")
    public double getCircumference(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @return
     *     returns wsclient.Circle
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCircle", targetNamespace = "http://services.jws.github.com/", className = "wsclient.GetCircle")
    @ResponseWrapper(localName = "getCircleResponse", targetNamespace = "http://services.jws.github.com/", className = "wsclient.GetCircleResponse")
    public Circle getCircle();

}
