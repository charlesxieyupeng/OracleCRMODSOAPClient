/**
 * ContactWS_ContactInsert_Output.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.ws.contact;

public class ContactWS_ContactInsert_Output  implements java.io.Serializable {
    private crmondemand.xml.contact.Contact[] listOfContact;

    public ContactWS_ContactInsert_Output() {
    }

    public ContactWS_ContactInsert_Output(
           crmondemand.xml.contact.Contact[] listOfContact) {
           this.listOfContact = listOfContact;
    }


    /**
     * Gets the listOfContact value for this ContactWS_ContactInsert_Output.
     * 
     * @return listOfContact
     */
    public crmondemand.xml.contact.Contact[] getListOfContact() {
        return listOfContact;
    }


    /**
     * Sets the listOfContact value for this ContactWS_ContactInsert_Output.
     * 
     * @param listOfContact
     */
    public void setListOfContact(crmondemand.xml.contact.Contact[] listOfContact) {
        this.listOfContact = listOfContact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactWS_ContactInsert_Output)) return false;
        ContactWS_ContactInsert_Output other = (ContactWS_ContactInsert_Output) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listOfContact==null && other.getListOfContact()==null) || 
             (this.listOfContact!=null &&
              java.util.Arrays.equals(this.listOfContact, other.getListOfContact())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListOfContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactWS_ContactInsert_Output.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsert_Output"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContact"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
