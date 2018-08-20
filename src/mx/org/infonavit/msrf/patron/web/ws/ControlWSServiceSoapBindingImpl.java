package mx.org.infonavit.msrf.patron.web.ws;

import java.util.concurrent.Future;
import javax.xml.ws.Response;
import javax.xml.ws.AsyncHandler;



@javax.jws.WebService (endpointInterface="mx.org.infonavit.msrf.patron.web.ws.ControlWS", targetNamespace="http://ws.web.patron.msrf.infonavit.org.mx/", serviceName="ControlWSService", portName="ControlWSPort", wsdlLocation="WEB-INF/wsdl/control.wsdl")
public class ControlWSServiceSoapBindingImpl{

    public ResetPassDTO resetPassword(String correo) {
        return null;
    }

    public AccesoDTO getAccessInfo(String correo) {
        return null;
    }

	public Future<?> getAccessInfoAsync(String correo,
			AsyncHandler<GetAccessInfoResponse> asyncHandler) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public Response<GetAccessInfoResponse> getAccessInfoAsync(String correo) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public Future<?> resetPasswordAsync(String correo,
			AsyncHandler<ResetPasswordResponse> asyncHandler) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public Response<ResetPasswordResponse> resetPasswordAsync(String correo) {
		// TODO Auto-generated method stub
		return null;
		
	}

}