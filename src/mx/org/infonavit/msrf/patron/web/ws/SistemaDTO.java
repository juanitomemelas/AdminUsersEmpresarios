/**
 * SistemaDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.org.infonavit.msrf.patron.web.ws;

public class SistemaDTO  implements java.io.Serializable {
    private java.lang.String descSistema;

    private java.lang.Integer idSistema;

    public SistemaDTO() {
    }

    public SistemaDTO(
           java.lang.String descSistema,
           java.lang.Integer idSistema) {
           this.descSistema = descSistema;
           this.idSistema = idSistema;
    }


    /**
     * Gets the descSistema value for this SistemaDTO.
     * 
     * @return descSistema
     */
    public java.lang.String getDescSistema() {
        return descSistema;
    }


    /**
     * Sets the descSistema value for this SistemaDTO.
     * 
     * @param descSistema
     */
    public void setDescSistema(java.lang.String descSistema) {
        this.descSistema = descSistema;
    }


    /**
     * Gets the idSistema value for this SistemaDTO.
     * 
     * @return idSistema
     */
    public java.lang.Integer getIdSistema() {
        return idSistema;
    }


    /**
     * Sets the idSistema value for this SistemaDTO.
     * 
     * @param idSistema
     */
    public void setIdSistema(java.lang.Integer idSistema) {
        this.idSistema = idSistema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SistemaDTO)) return false;
        SistemaDTO other = (SistemaDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descSistema==null && other.getDescSistema()==null) || 
             (this.descSistema!=null &&
              this.descSistema.equals(other.getDescSistema()))) &&
            ((this.idSistema==null && other.getIdSistema()==null) || 
             (this.idSistema!=null &&
              this.idSistema.equals(other.getIdSistema())));
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
        if (getDescSistema() != null) {
            _hashCode += getDescSistema().hashCode();
        }
        if (getIdSistema() != null) {
            _hashCode += getIdSistema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SistemaDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.patron.msrf.infonavit.org.mx/", "sistemaDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descSistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSistema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSistema"));
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
