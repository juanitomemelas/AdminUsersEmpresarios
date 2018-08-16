/**
 * UsuarioWSImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public class UsuarioWSImplServiceLocator extends org.apache.axis.client.Service implements mx.org.infonavit.msrf.patron.web.ws.UsuarioWSImplService {

    public UsuarioWSImplServiceLocator() {
    }


    public UsuarioWSImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UsuarioWSImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UsuarioWSImplPort
    private java.lang.String UsuarioWSImplPort_address = "http://10.90.1.152/msrf-patron/services/usuario";

    public java.lang.String getUsuarioWSImplPortAddress() {
        return UsuarioWSImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UsuarioWSImplPortWSDDServiceName = "UsuarioWSImplPort";

    public java.lang.String getUsuarioWSImplPortWSDDServiceName() {
        return UsuarioWSImplPortWSDDServiceName;
    }

    public void setUsuarioWSImplPortWSDDServiceName(java.lang.String name) {
        UsuarioWSImplPortWSDDServiceName = name;
    }

    public mx.org.infonavit.msrf.patron.web.ws.UsuarioWS getUsuarioWSImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UsuarioWSImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUsuarioWSImplPort(endpoint);
    }

    public mx.org.infonavit.msrf.patron.web.ws.UsuarioWS getUsuarioWSImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.org.infonavit.msrf.patron.web.ws.UsuarioWSImplServiceSoapBindingStub _stub = new mx.org.infonavit.msrf.patron.web.ws.UsuarioWSImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUsuarioWSImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUsuarioWSImplPortEndpointAddress(java.lang.String address) {
        UsuarioWSImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.org.infonavit.msrf.patron.web.ws.UsuarioWS.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.org.infonavit.msrf.patron.web.ws.UsuarioWSImplServiceSoapBindingStub _stub = new mx.org.infonavit.msrf.patron.web.ws.UsuarioWSImplServiceSoapBindingStub(new java.net.URL(UsuarioWSImplPort_address), this);
                _stub.setPortName(getUsuarioWSImplPortWSDDServiceName());
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
        if ("UsuarioWSImplPort".equals(inputPortName)) {
            return getUsuarioWSImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "UsuarioWSImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "UsuarioWSImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UsuarioWSImplPort".equals(portName)) {
            setUsuarioWSImplPortEndpointAddress(address);
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
