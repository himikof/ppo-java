
package ru.ifmo.kt15.ofitserov.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "multiplyResponse", namespace = "http://ofitserov.kt15.ifmo.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyResponse", namespace = "http://ofitserov.kt15.ifmo.ru/")
public class MultiplyResponse {

    @XmlElement(name = "return", namespace = "")
    private double _return;

    /**
     * 
     * @return
     *     returns double
     */
    public double getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(double _return) {
        this._return = _return;
    }

}
