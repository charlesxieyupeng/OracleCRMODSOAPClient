/**
 * Default_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.ws.contact;

public class Default_BindingStub extends org.apache.axis.client.Stub implements crmondemand.ws.contact.Default_Binding_Contact {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactDeleteChild");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactDeleteChild_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDeleteChild_Input"), crmondemand.ws.contact.ContactWS_ContactDeleteChild_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDeleteChild_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactDeleteChild_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactDeleteChild_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactQueryPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactQueryPage_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactQueryPage_Input"), crmondemand.ws.contact.ContactWS_ContactQueryPage_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactQueryPage_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactQueryPage_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactQueryPage_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactInsertOrUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactInsertOrUpdate_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertOrUpdate_Input"), crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertOrUpdate_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactInsertOrUpdate_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactInsert_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsert_Input"), crmondemand.ws.contact.ContactWS_ContactInsert_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsert_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactInsert_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactInsert_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactInsertChild");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactInsertChild_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertChild_Input"), crmondemand.ws.contact.ContactWS_ContactInsertChild_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertChild_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactInsertChild_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactInsertChild_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactUpdate_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdate_Input"), crmondemand.ws.contact.ContactWS_ContactUpdate_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdate_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactUpdate_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactUpdate_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactUpdateChild");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactUpdateChild_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdateChild_Input"), crmondemand.ws.contact.ContactWS_ContactUpdateChild_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdateChild_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactUpdateChild_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactUpdateChild_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ContactDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactDelete_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDelete_Input"), crmondemand.ws.contact.ContactWS_ContactDelete_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDelete_Output"));
        oper.setReturnClass(crmondemand.ws.contact.ContactWS_ContactDelete_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", "ContactWS_ContactDelete_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public Default_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Default_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Default_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Account");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Activity");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Address");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateAddress");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.AlternateAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Asset");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Asset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Book");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Book.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Campaign");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Contact");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.CustomObject3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Interests");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Interests.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Lead");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Lead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAccount");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Account[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Account");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Account");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfActivity");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Activity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Activity");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Activity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAddress");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Address[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Address");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Address");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAlternateAddress");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.ListOfAlternateAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAsset");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Asset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Asset");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Asset");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAttachment");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfBook");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Book[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Book");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Book");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfCampaign");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Campaign[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Campaign");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Campaign");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContact");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Contact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Contact");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Contact");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContactTeam");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Team[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Team");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Team");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfCustomObject3");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.CustomObject3[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfInterests");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Interests[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Interests");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Interests");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfLead");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Lead[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Lead");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Lead");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfNote");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Note[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Note");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Note");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfOpportunity");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Opportunity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Opportunity");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Opportunity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfRelatedContact");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.RelatedContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RelatedContact");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RelatedContact");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfRevenue");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Revenue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfServiceRequest");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.ServiceRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfStateLicenses");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.StateLicenses[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StateLicenses");
            qName2 = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StateLicenses");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Note");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Opportunity");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Opportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RelatedContact");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.RelatedContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Revenue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.ServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SiebelXmlAttachmentType");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.SiebelXmlAttachmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StateLicenses");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.StateLicenses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string1");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string10");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string100");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string120");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string15");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string1500");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string1999");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string200");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string2000");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string25");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string250");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string255");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string30");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string315");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string400");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string50");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string64");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string75");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "string82");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Team");
            cachedSerQNames.add(qName);
            cls = crmondemand.xml.contact.Team.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDelete_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactDelete_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDelete_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactDelete_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDeleteChild_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactDeleteChild_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactDeleteChild_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactDeleteChild_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsert_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactInsert_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsert_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactInsert_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertChild_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactInsertChild_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertChild_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactInsertChild_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertOrUpdate_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactInsertOrUpdate_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactQueryPage_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactQueryPage_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactQueryPage_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactQueryPage_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdate_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactUpdate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdate_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactUpdate_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdateChild_Input");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactUpdateChild_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:crmondemand/ws/contact/10/2004", ">ContactWS_ContactUpdateChild_Output");
            cachedSerQNames.add(qName);
            cls = crmondemand.ws.contact.ContactWS_ContactUpdateChild_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public crmondemand.ws.contact.ContactWS_ContactDeleteChild_Output contactDeleteChild(crmondemand.ws.contact.ContactWS_ContactDeleteChild_Input contactWS_ContactDeleteChild_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactDeleteChild");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactDeleteChild"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactDeleteChild_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactDeleteChild_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactDeleteChild_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactDeleteChild_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactQueryPage_Output contactQueryPage(crmondemand.ws.contact.ContactWS_ContactQueryPage_Input contactWS_ContactQueryPage_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactQueryPage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactQueryPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactQueryPage_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactQueryPage_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactQueryPage_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactQueryPage_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Output contactInsertOrUpdate(crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Input contactWS_ContactInsertOrUpdate_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactInsertOrUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactInsertOrUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactInsertOrUpdate_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactInsertOrUpdate_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactInsert_Output contactInsert(crmondemand.ws.contact.ContactWS_ContactInsert_Input contactWS_ContactInsert_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactInsert_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactInsert_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactInsert_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactInsert_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactInsertChild_Output contactInsertChild(crmondemand.ws.contact.ContactWS_ContactInsertChild_Input contactWS_ContactInsertChild_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactInsertChild");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactInsertChild"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactInsertChild_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactInsertChild_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactInsertChild_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactInsertChild_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactUpdate_Output contactUpdate(crmondemand.ws.contact.ContactWS_ContactUpdate_Input contactWS_ContactUpdate_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactUpdate_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactUpdate_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactUpdate_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactUpdate_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactUpdateChild_Output contactUpdateChild(crmondemand.ws.contact.ContactWS_ContactUpdateChild_Input contactWS_ContactUpdateChild_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactUpdateChild");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactUpdateChild"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactUpdateChild_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactUpdateChild_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactUpdateChild_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactUpdateChild_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public crmondemand.ws.contact.ContactWS_ContactDelete_Output contactDelete(crmondemand.ws.contact.ContactWS_ContactDelete_Input contactWS_ContactDelete_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/urn:crmondemand/ws/contact/10/2004:ContactDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ContactDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactWS_ContactDelete_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (crmondemand.ws.contact.ContactWS_ContactDelete_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (crmondemand.ws.contact.ContactWS_ContactDelete_Output) org.apache.axis.utils.JavaUtils.convert(_resp, crmondemand.ws.contact.ContactWS_ContactDelete_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
