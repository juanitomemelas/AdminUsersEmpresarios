package mx.org.infonavit.msrf.patron.web.ws;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class ControlWSPortProxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private mx.org.infonavit.msrf.patron.web.ws.ControlWSService _service = null;
        private mx.org.infonavit.msrf.patron.web.ws.ControlWS _proxy = null;
        private Dispatch<Source> _dispatch = null;
        private boolean _useJNDIOnly = false;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new mx.org.infonavit.msrf.patron.web.ws.ControlWSService(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            try
            {
                InitialContext ctx = new InitialContext();
                _service = (mx.org.infonavit.msrf.patron.web.ws.ControlWSService)ctx.lookup("java:comp/env/service/ControlWSService");
            }
            catch (NamingException e)
            {
                if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
                    System.out.println("JNDI lookup failure: javax.naming.NamingException: " + e.getMessage());
                    e.printStackTrace(System.out);
                }
            }

            if (_service == null && !_useJNDIOnly)
                _service = new mx.org.infonavit.msrf.patron.web.ws.ControlWSService();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getControlWSPort();
        }

        public mx.org.infonavit.msrf.patron.web.ws.ControlWS getProxy() {
            return _proxy;
        }

        public void useJNDIOnly(boolean useJNDIOnly) {
            _useJNDIOnly = useJNDIOnly;
            init();
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("http://ws.web.patron.msrf.infonavit.org.mx/", "ControlWSPort");
                _dispatch = _service.createDispatch(portQName, Source.class, Service.Mode.MESSAGE);

                String proxyEndpointUrl = getEndpoint();
                BindingProvider bp = (BindingProvider) _dispatch;
                String dispatchEndpointUrl = (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
                if (!dispatchEndpointUrl.equals(proxyEndpointUrl))
                    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, proxyEndpointUrl);
            }
            return _dispatch;
        }

        public String getEndpoint() {
            BindingProvider bp = (BindingProvider) _proxy;
            return (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
        }

        public void setEndpoint(String endpointUrl) {
            BindingProvider bp = (BindingProvider) _proxy;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);

            if (_dispatch != null ) {
                bp = (BindingProvider) _dispatch;
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
            }
        }

        public void setMTOMEnabled(boolean enable) {
            SOAPBinding binding = (SOAPBinding) ((BindingProvider) _proxy).getBinding();
            binding.setMTOMEnabled(enable);
        }
    }

    public ControlWSPortProxy() {
        _descriptor = new Descriptor();
        _descriptor.setMTOMEnabled(false);
    }

    public ControlWSPortProxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
        _descriptor.setMTOMEnabled(false);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public Response<ResetPasswordResponse> resetPasswordAsync(String correo) {
        return _getDescriptor().getProxy().resetPasswordAsync(correo);
    }

    public Future<?> resetPasswordAsync(String correo, AsyncHandler<ResetPasswordResponse> asyncHandler) {
        return _getDescriptor().getProxy().resetPasswordAsync(correo,asyncHandler);
    }

    public ResetPassDTO resetPassword(String correo) {
        return _getDescriptor().getProxy().resetPassword(correo);
    }

    public Response<GetAccessInfoResponse> getAccessInfoAsync(String correo) {
        return _getDescriptor().getProxy().getAccessInfoAsync(correo);
    }

    public Future<?> getAccessInfoAsync(String correo, AsyncHandler<GetAccessInfoResponse> asyncHandler) {
        return _getDescriptor().getProxy().getAccessInfoAsync(correo,asyncHandler);
    }

    public AccesoDTO getAccessInfo(String correo) {
        return _getDescriptor().getProxy().getAccessInfo(correo);
    }

}