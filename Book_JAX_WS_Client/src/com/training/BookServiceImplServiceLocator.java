/**
 * BookServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.training;

public class BookServiceImplServiceLocator extends org.apache.axis.client.Service implements com.training.BookServiceImplService {

    public BookServiceImplServiceLocator() {
    }


    public BookServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookServiceImplPort
    private java.lang.String BookServiceImplPort_address = "http://localhost:9000/bookService";

    public java.lang.String getBookServiceImplPortAddress() {
        return BookServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookServiceImplPortWSDDServiceName = "BookServiceImplPort";

    public java.lang.String getBookServiceImplPortWSDDServiceName() {
        return BookServiceImplPortWSDDServiceName;
    }

    public void setBookServiceImplPortWSDDServiceName(java.lang.String name) {
        BookServiceImplPortWSDDServiceName = name;
    }

    public com.training.BookService getBookServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookServiceImplPort(endpoint);
    }

    public com.training.BookService getBookServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.training.BookServiceImplPortBindingStub _stub = new com.training.BookServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getBookServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookServiceImplPortEndpointAddress(java.lang.String address) {
        BookServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.training.BookService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.training.BookServiceImplPortBindingStub _stub = new com.training.BookServiceImplPortBindingStub(new java.net.URL(BookServiceImplPort_address), this);
                _stub.setPortName(getBookServiceImplPortWSDDServiceName());
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
        if ("BookServiceImplPort".equals(inputPortName)) {
            return getBookServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://training.com/", "BookServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://training.com/", "BookServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookServiceImplPort".equals(portName)) {
            setBookServiceImplPortEndpointAddress(address);
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
