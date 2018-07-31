package mx.org.infonavit.msrf.patron.web.ws;

public class UsuarioWSProxy implements mx.org.infonavit.msrf.patron.web.ws.UsuarioWS {
  private String _endpoint = null;
  private mx.org.infonavit.msrf.patron.web.ws.UsuarioWS usuarioWS = null;
  
  public UsuarioWSProxy() {
    _initUsuarioWSProxy();
  }
  
  public UsuarioWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initUsuarioWSProxy();
  }
  
  private void _initUsuarioWSProxy() {
    try {
      usuarioWS = (new mx.org.infonavit.msrf.patron.web.ws.UsuarioWSImplServiceLocator()).getUsuarioWSImplPort();
      if (usuarioWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)usuarioWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)usuarioWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (usuarioWS != null)
      ((javax.xml.rpc.Stub)usuarioWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.UsuarioWS getUsuarioWS() {
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS;
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO autenticarContacto(java.lang.String nrp, java.lang.String correo, java.lang.String password) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.AuthenticationException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.autenticarContacto(nrp, correo, password);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO validarContacto(java.lang.String nrp, java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.validarContacto(nrp, correo);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO CUDContactos(java.lang.String movimiento, mx.org.infonavit.msrf.patron.web.ws.ContactoDTO contacto) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.CUDContactos(movimiento, contacto);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[] getContactos(java.lang.String nrp) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.getContactos(nrp);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO activarContactoCorreo(java.lang.String nrp, java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.activarContactoCorreo(nrp, correo);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO recuperarPassword(java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.recuperarPassword(correo);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO cambiarPassword(java.lang.String correo, java.lang.String passwordOld, java.lang.String passwordNew) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.cambiarPassword(correo, passwordOld, passwordNew);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO activarContacto(java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.activarContacto(correo);
  }
  
  public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO registrarRL(mx.org.infonavit.msrf.patron.web.ws.RepresentanteDTO representante) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException{
    if (usuarioWS == null)
      _initUsuarioWSProxy();
    return usuarioWS.registrarRL(representante);
  }
  
  
}