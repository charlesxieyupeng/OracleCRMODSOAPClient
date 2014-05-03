/**
 * ContactWS_ContactQueryPage_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.ws.contact;

public class ContactWS_ContactQueryPage_Input  implements java.io.Serializable {
    private java.lang.String bookName;

    private java.lang.String useChildAnd;

    private java.lang.String bookId;

    private java.lang.String pageSize;

    private crmondemand.xml.contact.Contact[] listOfContact;

    private java.lang.String includeSubBooks;

    private java.lang.String startRowNum;

    public ContactWS_ContactQueryPage_Input() {
    }

    public ContactWS_ContactQueryPage_Input(
           java.lang.String bookName,
           java.lang.String useChildAnd,
           java.lang.String bookId,
           java.lang.String pageSize,
           crmondemand.xml.contact.Contact[] listOfContact,
           java.lang.String includeSubBooks,
           java.lang.String startRowNum) {
           this.bookName = bookName;
           this.useChildAnd = useChildAnd;
           this.bookId = bookId;
           this.pageSize = pageSize;
           this.listOfContact = listOfContact;
           this.includeSubBooks = includeSubBooks;
           this.startRowNum = startRowNum;
    }


    /**
     * Gets the bookName value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return bookName
     */
    public java.lang.String getBookName() {
        return bookName;
    }


    /**
     * Sets the bookName value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param bookName
     */
    public void setBookName(java.lang.String bookName) {
        this.bookName = bookName;
    }


    /**
     * Gets the useChildAnd value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return useChildAnd
     */
    public java.lang.String getUseChildAnd() {
        return useChildAnd;
    }


    /**
     * Sets the useChildAnd value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param useChildAnd
     */
    public void setUseChildAnd(java.lang.String useChildAnd) {
        this.useChildAnd = useChildAnd;
    }


    /**
     * Gets the bookId value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return bookId
     */
    public java.lang.String getBookId() {
        return bookId;
    }


    /**
     * Sets the bookId value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param bookId
     */
    public void setBookId(java.lang.String bookId) {
        this.bookId = bookId;
    }


    /**
     * Gets the pageSize value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return pageSize
     */
    public java.lang.String getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.String pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the listOfContact value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return listOfContact
     */
    public crmondemand.xml.contact.Contact[] getListOfContact() {
        return listOfContact;
    }


    /**
     * Sets the listOfContact value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param listOfContact
     */
    public void setListOfContact(crmondemand.xml.contact.Contact[] listOfContact) {
        this.listOfContact = listOfContact;
    }


    /**
     * Gets the includeSubBooks value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return includeSubBooks
     */
    public java.lang.String getIncludeSubBooks() {
        return includeSubBooks;
    }


    /**
     * Sets the includeSubBooks value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param includeSubBooks
     */
    public void setIncludeSubBooks(java.lang.String includeSubBooks) {
        this.includeSubBooks = includeSubBooks;
    }


    /**
     * Gets the startRowNum value for this ContactWS_ContactQueryPage_Input.
     * 
     * @return startRowNum
     */
    public java.lang.String getStartRowNum() {
        return startRowNum;
    }


    /**
     * Sets the startRowNum value for this ContactWS_ContactQueryPage_Input.
     * 
     * @param startRowNum
     */
    public void setStartRowNum(java.lang.String startRowNum) {
        this.startRowNum = startRowNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactWS_ContactQueryPage_Input)) return false;
        ContactWS_ContactQueryPage_Input other = (ContactWS_ContactQueryPage_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookName==null && other.getBookName()==null) || 
             (this.bookName!=null &&
              this.bookName.equals(other.getBookName()))) &&
            ((this.useChildAnd==null && other.getUseChildAnd()==null) || 
             (this.useChildAnd!=null &&
              this.useChildAnd.equals(other.getUseChildAnd()))) &&
            ((this.bookId==null && other.getBookId()==null) || 
             (this.bookId!=null &&
              this.bookId.equals(other.getBookId()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.listOfContact==null && other.getListOfContact()==null) || 
             (this.listOfContact!=null &&
              java.util.Arrays.equals(this.listOfContact, other.getListOfContact()))) &&
            ((this.includeSubBooks==null && other.getIncludeSubBooks()==null) || 
             (this.includeSubBooks!=null &&
              this.includeSubBooks.equals(other.getIncludeSubBooks()))) &&
            ((this.startRowNum==null && other.getStartRowNum()==null) || 
             (this.startRowNum!=null &&
              this.startRowNum.equals(other.getStartRowNum())));
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
        if (getBookName() != null) {
            _hashCode += getBookName().hashCode();
        }
        if (getUseChildAnd() != null) {
            _hashCode += getUseChildAnd().hashCode();
        }
        if (getBookId() != null) {
            _hashCode += getBookId().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getListOfContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeSubBooks() != null) {
            _hashCode += getIncludeSubBooks().hashCode();
        }
        if (getStartRowNum() != null) {
            _hashCode += getStartRowNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactWS_ContactQueryPage_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactQueryPage_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "BookName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useChildAnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "UseChildAnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "BookId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContact"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSubBooks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "IncludeSubBooks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "StartRowNum"));
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
