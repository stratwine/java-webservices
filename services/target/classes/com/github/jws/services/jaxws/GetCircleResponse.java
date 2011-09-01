
package com.github.jws.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.github.stratwine.domain.Circle;

@XmlRootElement(name = "getCircleResponse", namespace = "http://services.jws.github.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCircleResponse", namespace = "http://services.jws.github.com/")
public class GetCircleResponse {

    @XmlElement(name = "return", namespace = "")
    private Circle _return;

    /**
     * 
     * @return
     *     returns Circle
     */
    public Circle getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Circle _return) {
        this._return = _return;
    }

}
