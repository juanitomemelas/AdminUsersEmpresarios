/**
 * UsuarioWSImplServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public class UsuarioWSImplServiceSoapBindingStub extends org.apache.axis.client.Stub implements mx.org.infonavit.msrf.patron.web.ws.UsuarioWS {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("autenticarContacto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nrp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "correo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "empresaDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "AuthenticationException"),
                      "mx.org.infonavit.msrf.patron.web.ws.AuthenticationException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarContacto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nrp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "correo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CUDContactos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "movimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contacto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "contactoDTO"), mx.org.infonavit.msrf.patron.web.ws.ContactoDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activarContactoCorreo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nrp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "correo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContactos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nrp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "contactoDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperarPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "correo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cambiarPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "correo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passwordOld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passwordNew"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activarContacto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "correo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarRL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "representante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "representanteDTO"), mx.org.infonavit.msrf.patron.web.ws.RepresentanteDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO"));
        oper.setReturnClass(mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"),
                      "mx.org.infonavit.msrf.patron.web.ws.MSRFException",
                      new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public UsuarioWSImplServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UsuarioWSImplServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UsuarioWSImplServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "AuthenticationException");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.AuthenticationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "contactoDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.ContactoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "domicilioDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.DomicilioDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "empresaDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "MSRFException");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.MSRFException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "perfilDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.PerfilDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "representanteDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.RepresentanteDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "responseDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "sistemaDTO");
            cachedSerQNames.add(qName);
            cls = mx.org.infonavit.msrf.patron.web.ws.SistemaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO autenticarContacto(java.lang.String nrp, java.lang.String correo, java.lang.String password) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.AuthenticationException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "autenticarContacto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nrp, correo, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.AuthenticationException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO validarContacto(java.lang.String nrp, java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "validarContacto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nrp, correo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO CUDContactos(java.lang.String movimiento, mx.org.infonavit.msrf.patron.web.ws.ContactoDTO contacto) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "CUDContactos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {movimiento, contacto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO activarContactoCorreo(java.lang.String nrp, java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "activarContactoCorreo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nrp, correo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[] getContactos(java.lang.String nrp) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "getContactos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nrp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO recuperarPassword(java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "recuperarPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {correo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO cambiarPassword(java.lang.String correo, java.lang.String passwordOld, java.lang.String passwordNew) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "cambiarPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {correo, passwordOld, passwordNew});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO activarContacto(java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "activarContacto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {correo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO registrarRL(mx.org.infonavit.msrf.patron.web.ws.RepresentanteDTO representante) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "registrarRL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {representante});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.org.infonavit.msrf.patron.web.ws.ResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.org.infonavit.msrf.patron.web.ws.ResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.org.infonavit.msrf.patron.web.ws.MSRFException) {
              throw (mx.org.infonavit.msrf.patron.web.ws.MSRFException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
