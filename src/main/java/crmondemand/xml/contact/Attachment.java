/**
 * Attachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.xml.contact;

public class Attachment  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String displayFileName;

    private java.lang.String fileNameOrURL;

    private java.lang.String fileExtension;

    private java.lang.String fileDate;

    private java.lang.String fileSize;

    private java.lang.String contactId;

    private java.lang.String externalSystemId;

    private java.lang.String description;

    private java.lang.String createdDate;

    private java.lang.String createdById;

    private java.lang.String createdBy;

    private java.lang.String modId;

    private java.lang.String modifiedDate;

    private java.lang.String modifiedById;

    private java.lang.String modifiedBy;

    private crmondemand.xml.contact.SiebelXmlAttachmentType attachment;

    public Attachment() {
    }

    public Attachment(
           java.lang.String id,
           java.lang.String displayFileName,
           java.lang.String fileNameOrURL,
           java.lang.String fileExtension,
           java.lang.String fileDate,
           java.lang.String fileSize,
           java.lang.String contactId,
           java.lang.String externalSystemId,
           java.lang.String description,
           java.lang.String createdDate,
           java.lang.String createdById,
           java.lang.String createdBy,
           java.lang.String modId,
           java.lang.String modifiedDate,
           java.lang.String modifiedById,
           java.lang.String modifiedBy,
           crmondemand.xml.contact.SiebelXmlAttachmentType attachment) {
           this.id = id;
           this.displayFileName = displayFileName;
           this.fileNameOrURL = fileNameOrURL;
           this.fileExtension = fileExtension;
           this.fileDate = fileDate;
           this.fileSize = fileSize;
           this.contactId = contactId;
           this.externalSystemId = externalSystemId;
           this.description = description;
           this.createdDate = createdDate;
           this.createdById = createdById;
           this.createdBy = createdBy;
           this.modId = modId;
           this.modifiedDate = modifiedDate;
           this.modifiedById = modifiedById;
           this.modifiedBy = modifiedBy;
           this.attachment = attachment;
    }


    /**
     * Gets the id value for this Attachment.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Attachment.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the displayFileName value for this Attachment.
     * 
     * @return displayFileName
     */
    public java.lang.String getDisplayFileName() {
        return displayFileName;
    }


    /**
     * Sets the displayFileName value for this Attachment.
     * 
     * @param displayFileName
     */
    public void setDisplayFileName(java.lang.String displayFileName) {
        this.displayFileName = displayFileName;
    }


    /**
     * Gets the fileNameOrURL value for this Attachment.
     * 
     * @return fileNameOrURL
     */
    public java.lang.String getFileNameOrURL() {
        return fileNameOrURL;
    }


    /**
     * Sets the fileNameOrURL value for this Attachment.
     * 
     * @param fileNameOrURL
     */
    public void setFileNameOrURL(java.lang.String fileNameOrURL) {
        this.fileNameOrURL = fileNameOrURL;
    }


    /**
     * Gets the fileExtension value for this Attachment.
     * 
     * @return fileExtension
     */
    public java.lang.String getFileExtension() {
        return fileExtension;
    }


    /**
     * Sets the fileExtension value for this Attachment.
     * 
     * @param fileExtension
     */
    public void setFileExtension(java.lang.String fileExtension) {
        this.fileExtension = fileExtension;
    }


    /**
     * Gets the fileDate value for this Attachment.
     * 
     * @return fileDate
     */
    public java.lang.String getFileDate() {
        return fileDate;
    }


    /**
     * Sets the fileDate value for this Attachment.
     * 
     * @param fileDate
     */
    public void setFileDate(java.lang.String fileDate) {
        this.fileDate = fileDate;
    }


    /**
     * Gets the fileSize value for this Attachment.
     * 
     * @return fileSize
     */
    public java.lang.String getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this Attachment.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.String fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the contactId value for this Attachment.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this Attachment.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the externalSystemId value for this Attachment.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this Attachment.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the description value for this Attachment.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Attachment.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the createdDate value for this Attachment.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Attachment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdById value for this Attachment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Attachment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdBy value for this Attachment.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Attachment.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the modId value for this Attachment.
     * 
     * @return modId
     */
    public java.lang.String getModId() {
        return modId;
    }


    /**
     * Sets the modId value for this Attachment.
     * 
     * @param modId
     */
    public void setModId(java.lang.String modId) {
        this.modId = modId;
    }


    /**
     * Gets the modifiedDate value for this Attachment.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Attachment.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedById value for this Attachment.
     * 
     * @return modifiedById
     */
    public java.lang.String getModifiedById() {
        return modifiedById;
    }


    /**
     * Sets the modifiedById value for this Attachment.
     * 
     * @param modifiedById
     */
    public void setModifiedById(java.lang.String modifiedById) {
        this.modifiedById = modifiedById;
    }


    /**
     * Gets the modifiedBy value for this Attachment.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this Attachment.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the attachment value for this Attachment.
     * 
     * @return attachment
     */
    public crmondemand.xml.contact.SiebelXmlAttachmentType getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this Attachment.
     * 
     * @param attachment
     */
    public void setAttachment(crmondemand.xml.contact.SiebelXmlAttachmentType attachment) {
        this.attachment = attachment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attachment)) return false;
        Attachment other = (Attachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.displayFileName==null && other.getDisplayFileName()==null) || 
             (this.displayFileName!=null &&
              this.displayFileName.equals(other.getDisplayFileName()))) &&
            ((this.fileNameOrURL==null && other.getFileNameOrURL()==null) || 
             (this.fileNameOrURL!=null &&
              this.fileNameOrURL.equals(other.getFileNameOrURL()))) &&
            ((this.fileExtension==null && other.getFileExtension()==null) || 
             (this.fileExtension!=null &&
              this.fileExtension.equals(other.getFileExtension()))) &&
            ((this.fileDate==null && other.getFileDate()==null) || 
             (this.fileDate!=null &&
              this.fileDate.equals(other.getFileDate()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.modId==null && other.getModId()==null) || 
             (this.modId!=null &&
              this.modId.equals(other.getModId()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.modifiedById==null && other.getModifiedById()==null) || 
             (this.modifiedById!=null &&
              this.modifiedById.equals(other.getModifiedById()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.attachment==null && other.getAttachment()==null) || 
             (this.attachment!=null &&
              this.attachment.equals(other.getAttachment())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDisplayFileName() != null) {
            _hashCode += getDisplayFileName().hashCode();
        }
        if (getFileNameOrURL() != null) {
            _hashCode += getFileNameOrURL().hashCode();
        }
        if (getFileExtension() != null) {
            _hashCode += getFileExtension().hashCode();
        }
        if (getFileDate() != null) {
            _hashCode += getFileDate().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getModId() != null) {
            _hashCode += getModId().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getModifiedById() != null) {
            _hashCode += getModifiedById().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getAttachment() != null) {
            _hashCode += getAttachment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "DisplayFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNameOrURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "FileNameOrURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "FileExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "FileDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SiebelXmlAttachmentType"));
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
