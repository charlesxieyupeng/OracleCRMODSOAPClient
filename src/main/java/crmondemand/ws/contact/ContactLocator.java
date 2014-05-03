/**
 * ContactLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.ws.contact;

public class ContactLocator extends org.apache.axis.client.Service implements crmondemand.ws.contact.Contact {

    public ContactLocator() {
    }


    public ContactLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContactLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Default
    private java.lang.String Default_address = "https://secure-ausomxdsa.crmondemand.com/Services/Integration";

    public java.lang.String getDefaultAddress() {
        return Default_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DefaultWSDDServiceName = "Default";

    public java.lang.String getDefaultWSDDServiceName() {
        return DefaultWSDDServiceName;
    }

    public void setDefaultWSDDServiceName(java.lang.String name) {
        DefaultWSDDServiceName = name;
    }

    public crmondemand.ws.contact.Default_Binding_Contact getDefault() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Default_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDefault(endpoint);
    }

    public crmondemand.ws.contact.Default_Binding_Contact getDefault(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            crmondemand.ws.contact.Default_BindingStub _stub = new crmondemand.ws.contact.Default_BindingStub(portAddress, this);
            _stub.setPortName(getDefaultWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDefaultEndpointAddress(java.lang.String address) {
        Default_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (crmondemand.ws.contact.Default_Binding_Contact.class.isAssignableFrom(serviceEndpointInterface)) {
                crmondemand.ws.contact.Default_BindingStub _stub = new crmondemand.ws.contact.Default_BindingStub(new java.net.URL(Default_address), this);
                _stub.setPortName(getDefaultWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Default".equals(inputPortName)) {
            return getDefault();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "Contact");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "Default"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Default".equals(portName)) {
            setDefaultEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
