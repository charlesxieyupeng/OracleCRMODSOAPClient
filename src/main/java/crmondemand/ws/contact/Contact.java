/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.ws.contact;

public interface Contact extends javax.xml.rpc.Service {
    public java.lang.String getDefaultAddress();

    public crmondemand.ws.contact.Default_Binding_Contact getDefault() throws javax.xml.rpc.ServiceException;

    public crmondemand.ws.contact.Default_Binding_Contact getDefault(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
