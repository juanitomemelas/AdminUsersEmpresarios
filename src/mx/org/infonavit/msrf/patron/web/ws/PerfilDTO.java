/**
 * PerfilDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public class PerfilDTO  implements java.io.Serializable {
    private java.lang.String descPerfil;

    private java.lang.Integer idPerfil;

    public PerfilDTO() {
    }

    public PerfilDTO(
           java.lang.String descPerfil,
           java.lang.Integer idPerfil) {
           this.descPerfil = descPerfil;
           this.idPerfil = idPerfil;
    }


    /**
     * Gets the descPerfil value for this PerfilDTO.
     * 
     * @return descPerfil
     */
    public java.lang.String getDescPerfil() {
        return descPerfil;
    }


    /**
     * Sets the descPerfil value for this PerfilDTO.
     * 
     * @param descPerfil
     */
    public void setDescPerfil(java.lang.String descPerfil) {
        this.descPerfil = descPerfil;
    }


    /**
     * Gets the idPerfil value for this PerfilDTO.
     * 
     * @return idPerfil
     */
    public java.lang.Integer getIdPerfil() {
        return idPerfil;
    }


    /**
     * Sets the idPerfil value for this PerfilDTO.
     * 
     * @param idPerfil
     */
    public void setIdPerfil(java.lang.Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerfilDTO)) return false;
        PerfilDTO other = (PerfilDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descPerfil==null && other.getDescPerfil()==null) || 
             (this.descPerfil!=null &&
              this.descPerfil.equals(other.getDescPerfil()))) &&
            ((this.idPerfil==null && other.getIdPerfil()==null) || 
             (this.idPerfil!=null &&
              this.idPerfil.equals(other.getIdPerfil())));
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
        if (getDescPerfil() != null) {
            _hashCode += getDescPerfil().hashCode();
        }
        if (getIdPerfil() != null) {
            _hashCode += getIdPerfil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerfilDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "perfilDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
