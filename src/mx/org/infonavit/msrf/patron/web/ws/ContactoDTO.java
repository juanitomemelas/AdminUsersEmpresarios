/**
 * ContactoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public class ContactoDTO  implements java.io.Serializable {
	private static final long serialVersionUID = -1530800515046970089L;

	private String apMaterno;

    private String apPaterno;

    private String correo;

    private String curp;

    private String estatus;

    private String fechaUltimoAcceso;

    private String nombre;

    private String nrp;

    private mx.org.infonavit.msrf.patron.web.ws.PerfilDTO perfil;

    private String rfc;

    private mx.org.infonavit.msrf.patron.web.ws.SistemaDTO[] servicios;

    private String telefono;

    public ContactoDTO() {
    }

    public ContactoDTO(
           String apMaterno,
           String apPaterno,
           String correo,
           String curp,
           String estatus,
           String fechaUltimoAcceso,
           String nombre,
           String nrp,
           mx.org.infonavit.msrf.patron.web.ws.PerfilDTO perfil,
           String rfc,
           SistemaDTO[] servicios,
           String telefono) {
           this.apMaterno = apMaterno;
           this.apPaterno = apPaterno;
           this.correo = correo;
           this.curp = curp;
           this.estatus = estatus;
           this.fechaUltimoAcceso = fechaUltimoAcceso;
           this.nombre = nombre;
           this.nrp = nrp;
           this.perfil = perfil;
           this.rfc = rfc;
           this.servicios = servicios;
           this.telefono = telefono;
    }


    /**
     * Gets the apMaterno value for this ContactoDTO.
     * 
     * @return apMaterno
     */
    public String getApMaterno() {
        return apMaterno;
    }


    /**
     * Sets the apMaterno value for this ContactoDTO.
     * 
     * @param apMaterno
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }


    /**
     * Gets the apPaterno value for this ContactoDTO.
     * 
     * @return apPaterno
     */
    public String getApPaterno() {
        return apPaterno;
    }


    /**
     * Sets the apPaterno value for this ContactoDTO.
     * 
     * @param apPaterno
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }


    /**
     * Gets the correo value for this ContactoDTO.
     * 
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this ContactoDTO.
     * 
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }


    /**
     * Gets the curp value for this ContactoDTO.
     * 
     * @return curp
     */
    public String getCurp() {
        return curp;
    }


    /**
     * Sets the curp value for this ContactoDTO.
     * 
     * @param curp
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }


    /**
     * Gets the estatus value for this ContactoDTO.
     * 
     * @return estatus
     */
    public String getEstatus() {
        return estatus;
    }


    /**
     * Sets the estatus value for this ContactoDTO.
     * 
     * @param estatus
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }


    /**
     * Gets the fechaUltimoAcceso value for this ContactoDTO.
     * 
     * @return fechaUltimoAcceso
     */
    public String getFechaUltimoAcceso() {
        return fechaUltimoAcceso;
    }


    /**
     * Sets the fechaUltimoAcceso value for this ContactoDTO.
     * 
     * @param fechaUltimoAcceso
     */
    public void setFechaUltimoAcceso(String fechaUltimoAcceso) {
        this.fechaUltimoAcceso = fechaUltimoAcceso;
    }


    /**
     * Gets the nombre value for this ContactoDTO.
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ContactoDTO.
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the nrp value for this ContactoDTO.
     * 
     * @return nrp
     */
    public String getNrp() {
        return nrp;
    }


    /**
     * Sets the nrp value for this ContactoDTO.
     * 
     * @param nrp
     */
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }


    /**
     * Gets the perfil value for this ContactoDTO.
     * 
     * @return perfil
     */
    public mx.org.infonavit.msrf.patron.web.ws.PerfilDTO getPerfil() {
        return perfil;
    }


    /**
     * Sets the perfil value for this ContactoDTO.
     * 
     * @param perfil
     */
    public void setPerfil(mx.org.infonavit.msrf.patron.web.ws.PerfilDTO perfil) {
        this.perfil = perfil;
    }


    /**
     * Gets the rfc value for this ContactoDTO.
     * 
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }


    /**
     * Sets the rfc value for this ContactoDTO.
     * 
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }


    /**
     * Gets the servicios value for this ContactoDTO.
     * 
     * @return servicios
     */
    public mx.org.infonavit.msrf.patron.web.ws.SistemaDTO[] getServicios() {
        return servicios;
    }


    /**
     * Sets the servicios value for this ContactoDTO.
     * 
     * @param servicios
     */
    public void setServicios(mx.org.infonavit.msrf.patron.web.ws.SistemaDTO[] servicios) {
        this.servicios = servicios;
    }

    public mx.org.infonavit.msrf.patron.web.ws.SistemaDTO getServicios(int i) {
        return this.servicios[i];
    }

    public void setServicios(int i, mx.org.infonavit.msrf.patron.web.ws.SistemaDTO _value) {
        this.servicios[i] = _value;
    }


    /**
     * Gets the telefono value for this ContactoDTO.
     * 
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this ContactoDTO.
     * 
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactoDTO)) return false;
        ContactoDTO other = (ContactoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apMaterno==null && other.getApMaterno()==null) || 
             (this.apMaterno!=null &&
              this.apMaterno.equals(other.getApMaterno()))) &&
            ((this.apPaterno==null && other.getApPaterno()==null) || 
             (this.apPaterno!=null &&
              this.apPaterno.equals(other.getApPaterno()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.curp==null && other.getCurp()==null) || 
             (this.curp!=null &&
              this.curp.equals(other.getCurp()))) &&
            ((this.estatus==null && other.getEstatus()==null) || 
             (this.estatus!=null &&
              this.estatus.equals(other.getEstatus()))) &&
            ((this.fechaUltimoAcceso==null && other.getFechaUltimoAcceso()==null) || 
             (this.fechaUltimoAcceso!=null &&
              this.fechaUltimoAcceso.equals(other.getFechaUltimoAcceso()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.nrp==null && other.getNrp()==null) || 
             (this.nrp!=null &&
              this.nrp.equals(other.getNrp()))) &&
            ((this.perfil==null && other.getPerfil()==null) || 
             (this.perfil!=null &&
              this.perfil.equals(other.getPerfil()))) &&
            ((this.rfc==null && other.getRfc()==null) || 
             (this.rfc!=null &&
              this.rfc.equals(other.getRfc()))) &&
            ((this.servicios==null && other.getServicios()==null) || 
             (this.servicios!=null &&
              java.util.Arrays.equals(this.servicios, other.getServicios()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono())));
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
        if (getApMaterno() != null) {
            _hashCode += getApMaterno().hashCode();
        }
        if (getApPaterno() != null) {
            _hashCode += getApPaterno().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getCurp() != null) {
            _hashCode += getCurp().hashCode();
        }
        if (getEstatus() != null) {
            _hashCode += getEstatus().hashCode();
        }
        if (getFechaUltimoAcceso() != null) {
            _hashCode += getFechaUltimoAcceso().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getNrp() != null) {
            _hashCode += getNrp().hashCode();
        }
        if (getPerfil() != null) {
            _hashCode += getPerfil().hashCode();
        }
        if (getRfc() != null) {
            _hashCode += getRfc().hashCode();
        }
        if (getServicios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "contactoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUltimoAcceso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaUltimoAcceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "perfilDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "sistemaDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
           String mechType, 
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
           String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
