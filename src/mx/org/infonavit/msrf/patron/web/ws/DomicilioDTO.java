/**
 * DomicilioDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public class DomicilioDTO  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 963820787423187493L;

	private java.lang.String calleNumero;

    private java.lang.String colonia;

    private java.lang.String códigoPostal;

    private java.lang.String entidad;

    private java.lang.String municipio;

    public DomicilioDTO() {
    }

    public DomicilioDTO(
           java.lang.String calleNumero,
           java.lang.String colonia,
           java.lang.String códigoPostal,
           java.lang.String entidad,
           java.lang.String municipio) {
           this.calleNumero = calleNumero;
           this.colonia = colonia;
           this.códigoPostal = códigoPostal;
           this.entidad = entidad;
           this.municipio = municipio;
    }


    /**
     * Gets the calleNumero value for this DomicilioDTO.
     * 
     * @return calleNumero
     */
    public java.lang.String getCalleNumero() {
        return calleNumero;
    }


    /**
     * Sets the calleNumero value for this DomicilioDTO.
     * 
     * @param calleNumero
     */
    public void setCalleNumero(java.lang.String calleNumero) {
        this.calleNumero = calleNumero;
    }


    /**
     * Gets the colonia value for this DomicilioDTO.
     * 
     * @return colonia
     */
    public java.lang.String getColonia() {
        return colonia;
    }


    /**
     * Sets the colonia value for this DomicilioDTO.
     * 
     * @param colonia
     */
    public void setColonia(java.lang.String colonia) {
        this.colonia = colonia;
    }


    /**
     * Gets the códigoPostal value for this DomicilioDTO.
     * 
     * @return códigoPostal
     */
    public java.lang.String getCódigoPostal() {
        return códigoPostal;
    }


    /**
     * Sets the códigoPostal value for this DomicilioDTO.
     * 
     * @param códigoPostal
     */
    public void setCódigoPostal(java.lang.String códigoPostal) {
        this.códigoPostal = códigoPostal;
    }


    /**
     * Gets the entidad value for this DomicilioDTO.
     * 
     * @return entidad
     */
    public java.lang.String getEntidad() {
        return entidad;
    }


    /**
     * Sets the entidad value for this DomicilioDTO.
     * 
     * @param entidad
     */
    public void setEntidad(java.lang.String entidad) {
        this.entidad = entidad;
    }


    /**
     * Gets the municipio value for this DomicilioDTO.
     * 
     * @return municipio
     */
    public java.lang.String getMunicipio() {
        return municipio;
    }


    /**
     * Sets the municipio value for this DomicilioDTO.
     * 
     * @param municipio
     */
    public void setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomicilioDTO)) return false;
        DomicilioDTO other = (DomicilioDTO) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calleNumero==null && other.getCalleNumero()==null) || 
             (this.calleNumero!=null &&
              this.calleNumero.equals(other.getCalleNumero()))) &&
            ((this.colonia==null && other.getColonia()==null) || 
             (this.colonia!=null &&
              this.colonia.equals(other.getColonia()))) &&
            ((this.códigoPostal==null && other.getCódigoPostal()==null) || 
             (this.códigoPostal!=null &&
              this.códigoPostal.equals(other.getCódigoPostal()))) &&
            ((this.entidad==null && other.getEntidad()==null) || 
             (this.entidad!=null &&
              this.entidad.equals(other.getEntidad()))) &&
            ((this.municipio==null && other.getMunicipio()==null) || 
             (this.municipio!=null &&
              this.municipio.equals(other.getMunicipio())));
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
        if (getCalleNumero() != null) {
            _hashCode += getCalleNumero().hashCode();
        }
        if (getColonia() != null) {
            _hashCode += getColonia().hashCode();
        }
        if (getCódigoPostal() != null) {
            _hashCode += getCódigoPostal().hashCode();
        }
        if (getEntidad() != null) {
            _hashCode += getEntidad().hashCode();
        }
        if (getMunicipio() != null) {
            _hashCode += getMunicipio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomicilioDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "domicilioDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calleNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calleNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colonia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colonia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("códigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "códigoPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "municipio"));
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
           java.lang.String mechType, 
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
