
package wsclient;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCircle }
     * 
     */
    public GetCircle createGetCircle() {
        return new GetCircle();
    }

    /**
     * Create an instance of {@link GetAreaResponse }
     * 
     */
    public GetAreaResponse createGetAreaResponse() {
        return new GetAreaResponse();
    }

    /**
     * Create an instance of {@link GetCircumferenceResponse }
     * 
     */
    public GetCircumferenceResponse createGetCircumferenceResponse() {
        return new GetCircumferenceResponse();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link GetCircleResponse }
     * 
     */
    public GetCircleResponse createGetCircleResponse() {
        return new GetCircleResponse();
    }

    /**
     * Create an instance of {@link GetCircumference }
     * 
     */
    public GetCircumference createGetCircumference() {
        return new GetCircumference();
    }

    /**
     * Create an instance of {@link GetArea }
     * 
     */
    public GetArea createGetArea() {
        return new GetArea();
    }

}
