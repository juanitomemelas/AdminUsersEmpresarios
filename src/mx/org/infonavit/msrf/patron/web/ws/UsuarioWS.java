/**
 * UsuarioWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public interface UsuarioWS extends java.rmi.Remote {
    public mx.org.infonavit.msrf.patron.web.ws.EmpresaDTO autenticarContacto(java.lang.String nrp, java.lang.String correo, java.lang.String password) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.AuthenticationException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO validarContacto(java.lang.String nrp, java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO CUDContactos(java.lang.String movimiento, mx.org.infonavit.msrf.patron.web.ws.ContactoDTO contacto) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ContactoDTO[] getContactos(java.lang.String nrp) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO activarContactoCorreo(java.lang.String nrp, java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO recuperarPassword(java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO cambiarPassword(java.lang.String correo, java.lang.String passwordOld, java.lang.String passwordNew) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO activarContacto(java.lang.String correo) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
    public mx.org.infonavit.msrf.patron.web.ws.ResponseDTO registrarRL(mx.org.infonavit.msrf.patron.web.ws.RepresentanteDTO representante) throws java.rmi.RemoteException, mx.org.infonavit.msrf.patron.web.ws.MSRFException;
}
