/**
 * ServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.xml.contact;

public class ServiceRequest  implements java.io.Serializable {
    private java.lang.String subject;

    private java.lang.String area;

    private java.lang.String owner;

    private java.lang.String priority;

    private java.lang.String type;

    private java.lang.String cause;

    private java.lang.String source;

    private java.lang.String status;

    private java.lang.String accountId;

    private java.lang.String closedTime;

    private java.lang.String serviceRequestConcatField;

    private java.lang.String workPhone;

    private java.lang.String contactEmail;

    private java.lang.String contactFirstName;

    private java.lang.String contactFullName;

    private java.lang.String contactId;

    private java.lang.String contactLastName;

    private java.lang.String createdByName;

    private java.lang.String description;

    private java.lang.String externalSystemId;

    private java.lang.String integrationId;

    private java.lang.String modifiedBy;

    private java.lang.String modifiedById;

    private java.lang.String modifiedDate;

    private java.lang.String openedTime;

    private java.lang.String ownerId;

    private java.lang.String reassignOwner;

    private java.lang.String rowStatus;

    private java.lang.String SRNumber;

    private java.lang.String serialNumber;

    private java.lang.String subStatus;

    private java.lang.String dtOpened_Time_Custom;

    private java.lang.String stError_Message;

    private java.lang.String stLast_Survey_Outcome;

    private java.lang.String stNext_Step;

    private java.lang.String stOverall_Service_Experience;

    private java.lang.String createdById;

    private java.lang.String createdBy;

    private java.lang.String createdDate;

    private java.lang.String indexedBoolean0;

    private java.lang.String indexedCurrency0;

    private java.lang.String indexedDate0;

    private java.lang.String indexedLongText0;

    private java.lang.String indexedNumber0;

    private java.lang.String indexedPick0;

    private java.lang.String indexedPick1;

    private java.lang.String indexedPick2;

    private java.lang.String indexedPick3;

    private java.lang.String indexedPick4;

    private java.lang.String indexedPick5;

    private java.lang.String indexedShortText0;

    private java.lang.String indexedShortText1;

    private java.lang.String serviceRequestId;

    private java.lang.String currencyCode;

    public ServiceRequest() {
    }

    public ServiceRequest(
           java.lang.String subject,
           java.lang.String area,
           java.lang.String owner,
           java.lang.String priority,
           java.lang.String type,
           java.lang.String cause,
           java.lang.String source,
           java.lang.String status,
           java.lang.String accountId,
           java.lang.String closedTime,
           java.lang.String serviceRequestConcatField,
           java.lang.String workPhone,
           java.lang.String contactEmail,
           java.lang.String contactFirstName,
           java.lang.String contactFullName,
           java.lang.String contactId,
           java.lang.String contactLastName,
           java.lang.String createdByName,
           java.lang.String description,
           java.lang.String externalSystemId,
           java.lang.String integrationId,
           java.lang.String modifiedBy,
           java.lang.String modifiedById,
           java.lang.String modifiedDate,
           java.lang.String openedTime,
           java.lang.String ownerId,
           java.lang.String reassignOwner,
           java.lang.String rowStatus,
           java.lang.String SRNumber,
           java.lang.String serialNumber,
           java.lang.String subStatus,
           java.lang.String dtOpened_Time_Custom,
           java.lang.String stError_Message,
           java.lang.String stLast_Survey_Outcome,
           java.lang.String stNext_Step,
           java.lang.String stOverall_Service_Experience,
           java.lang.String createdById,
           java.lang.String createdBy,
           java.lang.String createdDate,
           java.lang.String indexedBoolean0,
           java.lang.String indexedCurrency0,
           java.lang.String indexedDate0,
           java.lang.String indexedLongText0,
           java.lang.String indexedNumber0,
           java.lang.String indexedPick0,
           java.lang.String indexedPick1,
           java.lang.String indexedPick2,
           java.lang.String indexedPick3,
           java.lang.String indexedPick4,
           java.lang.String indexedPick5,
           java.lang.String indexedShortText0,
           java.lang.String indexedShortText1,
           java.lang.String serviceRequestId,
           java.lang.String currencyCode) {
           this.subject = subject;
           this.area = area;
           this.owner = owner;
           this.priority = priority;
           this.type = type;
           this.cause = cause;
           this.source = source;
           this.status = status;
           this.accountId = accountId;
           this.closedTime = closedTime;
           this.serviceRequestConcatField = serviceRequestConcatField;
           this.workPhone = workPhone;
           this.contactEmail = contactEmail;
           this.contactFirstName = contactFirstName;
           this.contactFullName = contactFullName;
           this.contactId = contactId;
           this.contactLastName = contactLastName;
           this.createdByName = createdByName;
           this.description = description;
           this.externalSystemId = externalSystemId;
           this.integrationId = integrationId;
           this.modifiedBy = modifiedBy;
           this.modifiedById = modifiedById;
           this.modifiedDate = modifiedDate;
           this.openedTime = openedTime;
           this.ownerId = ownerId;
           this.reassignOwner = reassignOwner;
           this.rowStatus = rowStatus;
           this.SRNumber = SRNumber;
           this.serialNumber = serialNumber;
           this.subStatus = subStatus;
           this.dtOpened_Time_Custom = dtOpened_Time_Custom;
           this.stError_Message = stError_Message;
           this.stLast_Survey_Outcome = stLast_Survey_Outcome;
           this.stNext_Step = stNext_Step;
           this.stOverall_Service_Experience = stOverall_Service_Experience;
           this.createdById = createdById;
           this.createdBy = createdBy;
           this.createdDate = createdDate;
           this.indexedBoolean0 = indexedBoolean0;
           this.indexedCurrency0 = indexedCurrency0;
           this.indexedDate0 = indexedDate0;
           this.indexedLongText0 = indexedLongText0;
           this.indexedNumber0 = indexedNumber0;
           this.indexedPick0 = indexedPick0;
           this.indexedPick1 = indexedPick1;
           this.indexedPick2 = indexedPick2;
           this.indexedPick3 = indexedPick3;
           this.indexedPick4 = indexedPick4;
           this.indexedPick5 = indexedPick5;
           this.indexedShortText0 = indexedShortText0;
           this.indexedShortText1 = indexedShortText1;
           this.serviceRequestId = serviceRequestId;
           this.currencyCode = currencyCode;
    }


    /**
     * Gets the subject value for this ServiceRequest.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ServiceRequest.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the area value for this ServiceRequest.
     * 
     * @return area
     */
    public java.lang.String getArea() {
        return area;
    }


    /**
     * Sets the area value for this ServiceRequest.
     * 
     * @param area
     */
    public void setArea(java.lang.String area) {
        this.area = area;
    }


    /**
     * Gets the owner value for this ServiceRequest.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ServiceRequest.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the priority value for this ServiceRequest.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ServiceRequest.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the type value for this ServiceRequest.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ServiceRequest.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the cause value for this ServiceRequest.
     * 
     * @return cause
     */
    public java.lang.String getCause() {
        return cause;
    }


    /**
     * Sets the cause value for this ServiceRequest.
     * 
     * @param cause
     */
    public void setCause(java.lang.String cause) {
        this.cause = cause;
    }


    /**
     * Gets the source value for this ServiceRequest.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ServiceRequest.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the status value for this ServiceRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ServiceRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the accountId value for this ServiceRequest.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ServiceRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the closedTime value for this ServiceRequest.
     * 
     * @return closedTime
     */
    public java.lang.String getClosedTime() {
        return closedTime;
    }


    /**
     * Sets the closedTime value for this ServiceRequest.
     * 
     * @param closedTime
     */
    public void setClosedTime(java.lang.String closedTime) {
        this.closedTime = closedTime;
    }


    /**
     * Gets the serviceRequestConcatField value for this ServiceRequest.
     * 
     * @return serviceRequestConcatField
     */
    public java.lang.String getServiceRequestConcatField() {
        return serviceRequestConcatField;
    }


    /**
     * Sets the serviceRequestConcatField value for this ServiceRequest.
     * 
     * @param serviceRequestConcatField
     */
    public void setServiceRequestConcatField(java.lang.String serviceRequestConcatField) {
        this.serviceRequestConcatField = serviceRequestConcatField;
    }


    /**
     * Gets the workPhone value for this ServiceRequest.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this ServiceRequest.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }


    /**
     * Gets the contactEmail value for this ServiceRequest.
     * 
     * @return contactEmail
     */
    public java.lang.String getContactEmail() {
        return contactEmail;
    }


    /**
     * Sets the contactEmail value for this ServiceRequest.
     * 
     * @param contactEmail
     */
    public void setContactEmail(java.lang.String contactEmail) {
        this.contactEmail = contactEmail;
    }


    /**
     * Gets the contactFirstName value for this ServiceRequest.
     * 
     * @return contactFirstName
     */
    public java.lang.String getContactFirstName() {
        return contactFirstName;
    }


    /**
     * Sets the contactFirstName value for this ServiceRequest.
     * 
     * @param contactFirstName
     */
    public void setContactFirstName(java.lang.String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }


    /**
     * Gets the contactFullName value for this ServiceRequest.
     * 
     * @return contactFullName
     */
    public java.lang.String getContactFullName() {
        return contactFullName;
    }


    /**
     * Sets the contactFullName value for this ServiceRequest.
     * 
     * @param contactFullName
     */
    public void setContactFullName(java.lang.String contactFullName) {
        this.contactFullName = contactFullName;
    }


    /**
     * Gets the contactId value for this ServiceRequest.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this ServiceRequest.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the contactLastName value for this ServiceRequest.
     * 
     * @return contactLastName
     */
    public java.lang.String getContactLastName() {
        return contactLastName;
    }


    /**
     * Sets the contactLastName value for this ServiceRequest.
     * 
     * @param contactLastName
     */
    public void setContactLastName(java.lang.String contactLastName) {
        this.contactLastName = contactLastName;
    }


    /**
     * Gets the createdByName value for this ServiceRequest.
     * 
     * @return createdByName
     */
    public java.lang.String getCreatedByName() {
        return createdByName;
    }


    /**
     * Sets the createdByName value for this ServiceRequest.
     * 
     * @param createdByName
     */
    public void setCreatedByName(java.lang.String createdByName) {
        this.createdByName = createdByName;
    }


    /**
     * Gets the description value for this ServiceRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ServiceRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the externalSystemId value for this ServiceRequest.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this ServiceRequest.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the integrationId value for this ServiceRequest.
     * 
     * @return integrationId
     */
    public java.lang.String getIntegrationId() {
        return integrationId;
    }


    /**
     * Sets the integrationId value for this ServiceRequest.
     * 
     * @param integrationId
     */
    public void setIntegrationId(java.lang.String integrationId) {
        this.integrationId = integrationId;
    }


    /**
     * Gets the modifiedBy value for this ServiceRequest.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this ServiceRequest.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the modifiedById value for this ServiceRequest.
     * 
     * @return modifiedById
     */
    public java.lang.String getModifiedById() {
        return modifiedById;
    }


    /**
     * Sets the modifiedById value for this ServiceRequest.
     * 
     * @param modifiedById
     */
    public void setModifiedById(java.lang.String modifiedById) {
        this.modifiedById = modifiedById;
    }


    /**
     * Gets the modifiedDate value for this ServiceRequest.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ServiceRequest.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the openedTime value for this ServiceRequest.
     * 
     * @return openedTime
     */
    public java.lang.String getOpenedTime() {
        return openedTime;
    }


    /**
     * Sets the openedTime value for this ServiceRequest.
     * 
     * @param openedTime
     */
    public void setOpenedTime(java.lang.String openedTime) {
        this.openedTime = openedTime;
    }


    /**
     * Gets the ownerId value for this ServiceRequest.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this ServiceRequest.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the reassignOwner value for this ServiceRequest.
     * 
     * @return reassignOwner
     */
    public java.lang.String getReassignOwner() {
        return reassignOwner;
    }


    /**
     * Sets the reassignOwner value for this ServiceRequest.
     * 
     * @param reassignOwner
     */
    public void setReassignOwner(java.lang.String reassignOwner) {
        this.reassignOwner = reassignOwner;
    }


    /**
     * Gets the rowStatus value for this ServiceRequest.
     * 
     * @return rowStatus
     */
    public java.lang.String getRowStatus() {
        return rowStatus;
    }


    /**
     * Sets the rowStatus value for this ServiceRequest.
     * 
     * @param rowStatus
     */
    public void setRowStatus(java.lang.String rowStatus) {
        this.rowStatus = rowStatus;
    }


    /**
     * Gets the SRNumber value for this ServiceRequest.
     * 
     * @return SRNumber
     */
    public java.lang.String getSRNumber() {
        return SRNumber;
    }


    /**
     * Sets the SRNumber value for this ServiceRequest.
     * 
     * @param SRNumber
     */
    public void setSRNumber(java.lang.String SRNumber) {
        this.SRNumber = SRNumber;
    }


    /**
     * Gets the serialNumber value for this ServiceRequest.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ServiceRequest.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the subStatus value for this ServiceRequest.
     * 
     * @return subStatus
     */
    public java.lang.String getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this ServiceRequest.
     * 
     * @param subStatus
     */
    public void setSubStatus(java.lang.String subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the dtOpened_Time_Custom value for this ServiceRequest.
     * 
     * @return dtOpened_Time_Custom
     */
    public java.lang.String getDtOpened_Time_Custom() {
        return dtOpened_Time_Custom;
    }


    /**
     * Sets the dtOpened_Time_Custom value for this ServiceRequest.
     * 
     * @param dtOpened_Time_Custom
     */
    public void setDtOpened_Time_Custom(java.lang.String dtOpened_Time_Custom) {
        this.dtOpened_Time_Custom = dtOpened_Time_Custom;
    }


    /**
     * Gets the stError_Message value for this ServiceRequest.
     * 
     * @return stError_Message
     */
    public java.lang.String getStError_Message() {
        return stError_Message;
    }


    /**
     * Sets the stError_Message value for this ServiceRequest.
     * 
     * @param stError_Message
     */
    public void setStError_Message(java.lang.String stError_Message) {
        this.stError_Message = stError_Message;
    }


    /**
     * Gets the stLast_Survey_Outcome value for this ServiceRequest.
     * 
     * @return stLast_Survey_Outcome
     */
    public java.lang.String getStLast_Survey_Outcome() {
        return stLast_Survey_Outcome;
    }


    /**
     * Sets the stLast_Survey_Outcome value for this ServiceRequest.
     * 
     * @param stLast_Survey_Outcome
     */
    public void setStLast_Survey_Outcome(java.lang.String stLast_Survey_Outcome) {
        this.stLast_Survey_Outcome = stLast_Survey_Outcome;
    }


    /**
     * Gets the stNext_Step value for this ServiceRequest.
     * 
     * @return stNext_Step
     */
    public java.lang.String getStNext_Step() {
        return stNext_Step;
    }


    /**
     * Sets the stNext_Step value for this ServiceRequest.
     * 
     * @param stNext_Step
     */
    public void setStNext_Step(java.lang.String stNext_Step) {
        this.stNext_Step = stNext_Step;
    }


    /**
     * Gets the stOverall_Service_Experience value for this ServiceRequest.
     * 
     * @return stOverall_Service_Experience
     */
    public java.lang.String getStOverall_Service_Experience() {
        return stOverall_Service_Experience;
    }


    /**
     * Sets the stOverall_Service_Experience value for this ServiceRequest.
     * 
     * @param stOverall_Service_Experience
     */
    public void setStOverall_Service_Experience(java.lang.String stOverall_Service_Experience) {
        this.stOverall_Service_Experience = stOverall_Service_Experience;
    }


    /**
     * Gets the createdById value for this ServiceRequest.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ServiceRequest.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdBy value for this ServiceRequest.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ServiceRequest.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdDate value for this ServiceRequest.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ServiceRequest.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the indexedBoolean0 value for this ServiceRequest.
     * 
     * @return indexedBoolean0
     */
    public java.lang.String getIndexedBoolean0() {
        return indexedBoolean0;
    }


    /**
     * Sets the indexedBoolean0 value for this ServiceRequest.
     * 
     * @param indexedBoolean0
     */
    public void setIndexedBoolean0(java.lang.String indexedBoolean0) {
        this.indexedBoolean0 = indexedBoolean0;
    }


    /**
     * Gets the indexedCurrency0 value for this ServiceRequest.
     * 
     * @return indexedCurrency0
     */
    public java.lang.String getIndexedCurrency0() {
        return indexedCurrency0;
    }


    /**
     * Sets the indexedCurrency0 value for this ServiceRequest.
     * 
     * @param indexedCurrency0
     */
    public void setIndexedCurrency0(java.lang.String indexedCurrency0) {
        this.indexedCurrency0 = indexedCurrency0;
    }


    /**
     * Gets the indexedDate0 value for this ServiceRequest.
     * 
     * @return indexedDate0
     */
    public java.lang.String getIndexedDate0() {
        return indexedDate0;
    }


    /**
     * Sets the indexedDate0 value for this ServiceRequest.
     * 
     * @param indexedDate0
     */
    public void setIndexedDate0(java.lang.String indexedDate0) {
        this.indexedDate0 = indexedDate0;
    }


    /**
     * Gets the indexedLongText0 value for this ServiceRequest.
     * 
     * @return indexedLongText0
     */
    public java.lang.String getIndexedLongText0() {
        return indexedLongText0;
    }


    /**
     * Sets the indexedLongText0 value for this ServiceRequest.
     * 
     * @param indexedLongText0
     */
    public void setIndexedLongText0(java.lang.String indexedLongText0) {
        this.indexedLongText0 = indexedLongText0;
    }


    /**
     * Gets the indexedNumber0 value for this ServiceRequest.
     * 
     * @return indexedNumber0
     */
    public java.lang.String getIndexedNumber0() {
        return indexedNumber0;
    }


    /**
     * Sets the indexedNumber0 value for this ServiceRequest.
     * 
     * @param indexedNumber0
     */
    public void setIndexedNumber0(java.lang.String indexedNumber0) {
        this.indexedNumber0 = indexedNumber0;
    }


    /**
     * Gets the indexedPick0 value for this ServiceRequest.
     * 
     * @return indexedPick0
     */
    public java.lang.String getIndexedPick0() {
        return indexedPick0;
    }


    /**
     * Sets the indexedPick0 value for this ServiceRequest.
     * 
     * @param indexedPick0
     */
    public void setIndexedPick0(java.lang.String indexedPick0) {
        this.indexedPick0 = indexedPick0;
    }


    /**
     * Gets the indexedPick1 value for this ServiceRequest.
     * 
     * @return indexedPick1
     */
    public java.lang.String getIndexedPick1() {
        return indexedPick1;
    }


    /**
     * Sets the indexedPick1 value for this ServiceRequest.
     * 
     * @param indexedPick1
     */
    public void setIndexedPick1(java.lang.String indexedPick1) {
        this.indexedPick1 = indexedPick1;
    }


    /**
     * Gets the indexedPick2 value for this ServiceRequest.
     * 
     * @return indexedPick2
     */
    public java.lang.String getIndexedPick2() {
        return indexedPick2;
    }


    /**
     * Sets the indexedPick2 value for this ServiceRequest.
     * 
     * @param indexedPick2
     */
    public void setIndexedPick2(java.lang.String indexedPick2) {
        this.indexedPick2 = indexedPick2;
    }


    /**
     * Gets the indexedPick3 value for this ServiceRequest.
     * 
     * @return indexedPick3
     */
    public java.lang.String getIndexedPick3() {
        return indexedPick3;
    }


    /**
     * Sets the indexedPick3 value for this ServiceRequest.
     * 
     * @param indexedPick3
     */
    public void setIndexedPick3(java.lang.String indexedPick3) {
        this.indexedPick3 = indexedPick3;
    }


    /**
     * Gets the indexedPick4 value for this ServiceRequest.
     * 
     * @return indexedPick4
     */
    public java.lang.String getIndexedPick4() {
        return indexedPick4;
    }


    /**
     * Sets the indexedPick4 value for this ServiceRequest.
     * 
     * @param indexedPick4
     */
    public void setIndexedPick4(java.lang.String indexedPick4) {
        this.indexedPick4 = indexedPick4;
    }


    /**
     * Gets the indexedPick5 value for this ServiceRequest.
     * 
     * @return indexedPick5
     */
    public java.lang.String getIndexedPick5() {
        return indexedPick5;
    }


    /**
     * Sets the indexedPick5 value for this ServiceRequest.
     * 
     * @param indexedPick5
     */
    public void setIndexedPick5(java.lang.String indexedPick5) {
        this.indexedPick5 = indexedPick5;
    }


    /**
     * Gets the indexedShortText0 value for this ServiceRequest.
     * 
     * @return indexedShortText0
     */
    public java.lang.String getIndexedShortText0() {
        return indexedShortText0;
    }


    /**
     * Sets the indexedShortText0 value for this ServiceRequest.
     * 
     * @param indexedShortText0
     */
    public void setIndexedShortText0(java.lang.String indexedShortText0) {
        this.indexedShortText0 = indexedShortText0;
    }


    /**
     * Gets the indexedShortText1 value for this ServiceRequest.
     * 
     * @return indexedShortText1
     */
    public java.lang.String getIndexedShortText1() {
        return indexedShortText1;
    }


    /**
     * Sets the indexedShortText1 value for this ServiceRequest.
     * 
     * @param indexedShortText1
     */
    public void setIndexedShortText1(java.lang.String indexedShortText1) {
        this.indexedShortText1 = indexedShortText1;
    }


    /**
     * Gets the serviceRequestId value for this ServiceRequest.
     * 
     * @return serviceRequestId
     */
    public java.lang.String getServiceRequestId() {
        return serviceRequestId;
    }


    /**
     * Sets the serviceRequestId value for this ServiceRequest.
     * 
     * @param serviceRequestId
     */
    public void setServiceRequestId(java.lang.String serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
    }


    /**
     * Gets the currencyCode value for this ServiceRequest.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ServiceRequest.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRequest)) return false;
        ServiceRequest other = (ServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.area==null && other.getArea()==null) || 
             (this.area!=null &&
              this.area.equals(other.getArea()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.closedTime==null && other.getClosedTime()==null) || 
             (this.closedTime!=null &&
              this.closedTime.equals(other.getClosedTime()))) &&
            ((this.serviceRequestConcatField==null && other.getServiceRequestConcatField()==null) || 
             (this.serviceRequestConcatField!=null &&
              this.serviceRequestConcatField.equals(other.getServiceRequestConcatField()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone()))) &&
            ((this.contactEmail==null && other.getContactEmail()==null) || 
             (this.contactEmail!=null &&
              this.contactEmail.equals(other.getContactEmail()))) &&
            ((this.contactFirstName==null && other.getContactFirstName()==null) || 
             (this.contactFirstName!=null &&
              this.contactFirstName.equals(other.getContactFirstName()))) &&
            ((this.contactFullName==null && other.getContactFullName()==null) || 
             (this.contactFullName!=null &&
              this.contactFullName.equals(other.getContactFullName()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.contactLastName==null && other.getContactLastName()==null) || 
             (this.contactLastName!=null &&
              this.contactLastName.equals(other.getContactLastName()))) &&
            ((this.createdByName==null && other.getCreatedByName()==null) || 
             (this.createdByName!=null &&
              this.createdByName.equals(other.getCreatedByName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.integrationId==null && other.getIntegrationId()==null) || 
             (this.integrationId!=null &&
              this.integrationId.equals(other.getIntegrationId()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.modifiedById==null && other.getModifiedById()==null) || 
             (this.modifiedById!=null &&
              this.modifiedById.equals(other.getModifiedById()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.openedTime==null && other.getOpenedTime()==null) || 
             (this.openedTime!=null &&
              this.openedTime.equals(other.getOpenedTime()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.reassignOwner==null && other.getReassignOwner()==null) || 
             (this.reassignOwner!=null &&
              this.reassignOwner.equals(other.getReassignOwner()))) &&
            ((this.rowStatus==null && other.getRowStatus()==null) || 
             (this.rowStatus!=null &&
              this.rowStatus.equals(other.getRowStatus()))) &&
            ((this.SRNumber==null && other.getSRNumber()==null) || 
             (this.SRNumber!=null &&
              this.SRNumber.equals(other.getSRNumber()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.dtOpened_Time_Custom==null && other.getDtOpened_Time_Custom()==null) || 
             (this.dtOpened_Time_Custom!=null &&
              this.dtOpened_Time_Custom.equals(other.getDtOpened_Time_Custom()))) &&
            ((this.stError_Message==null && other.getStError_Message()==null) || 
             (this.stError_Message!=null &&
              this.stError_Message.equals(other.getStError_Message()))) &&
            ((this.stLast_Survey_Outcome==null && other.getStLast_Survey_Outcome()==null) || 
             (this.stLast_Survey_Outcome!=null &&
              this.stLast_Survey_Outcome.equals(other.getStLast_Survey_Outcome()))) &&
            ((this.stNext_Step==null && other.getStNext_Step()==null) || 
             (this.stNext_Step!=null &&
              this.stNext_Step.equals(other.getStNext_Step()))) &&
            ((this.stOverall_Service_Experience==null && other.getStOverall_Service_Experience()==null) || 
             (this.stOverall_Service_Experience!=null &&
              this.stOverall_Service_Experience.equals(other.getStOverall_Service_Experience()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.indexedBoolean0==null && other.getIndexedBoolean0()==null) || 
             (this.indexedBoolean0!=null &&
              this.indexedBoolean0.equals(other.getIndexedBoolean0()))) &&
            ((this.indexedCurrency0==null && other.getIndexedCurrency0()==null) || 
             (this.indexedCurrency0!=null &&
              this.indexedCurrency0.equals(other.getIndexedCurrency0()))) &&
            ((this.indexedDate0==null && other.getIndexedDate0()==null) || 
             (this.indexedDate0!=null &&
              this.indexedDate0.equals(other.getIndexedDate0()))) &&
            ((this.indexedLongText0==null && other.getIndexedLongText0()==null) || 
             (this.indexedLongText0!=null &&
              this.indexedLongText0.equals(other.getIndexedLongText0()))) &&
            ((this.indexedNumber0==null && other.getIndexedNumber0()==null) || 
             (this.indexedNumber0!=null &&
              this.indexedNumber0.equals(other.getIndexedNumber0()))) &&
            ((this.indexedPick0==null && other.getIndexedPick0()==null) || 
             (this.indexedPick0!=null &&
              this.indexedPick0.equals(other.getIndexedPick0()))) &&
            ((this.indexedPick1==null && other.getIndexedPick1()==null) || 
             (this.indexedPick1!=null &&
              this.indexedPick1.equals(other.getIndexedPick1()))) &&
            ((this.indexedPick2==null && other.getIndexedPick2()==null) || 
             (this.indexedPick2!=null &&
              this.indexedPick2.equals(other.getIndexedPick2()))) &&
            ((this.indexedPick3==null && other.getIndexedPick3()==null) || 
             (this.indexedPick3!=null &&
              this.indexedPick3.equals(other.getIndexedPick3()))) &&
            ((this.indexedPick4==null && other.getIndexedPick4()==null) || 
             (this.indexedPick4!=null &&
              this.indexedPick4.equals(other.getIndexedPick4()))) &&
            ((this.indexedPick5==null && other.getIndexedPick5()==null) || 
             (this.indexedPick5!=null &&
              this.indexedPick5.equals(other.getIndexedPick5()))) &&
            ((this.indexedShortText0==null && other.getIndexedShortText0()==null) || 
             (this.indexedShortText0!=null &&
              this.indexedShortText0.equals(other.getIndexedShortText0()))) &&
            ((this.indexedShortText1==null && other.getIndexedShortText1()==null) || 
             (this.indexedShortText1!=null &&
              this.indexedShortText1.equals(other.getIndexedShortText1()))) &&
            ((this.serviceRequestId==null && other.getServiceRequestId()==null) || 
             (this.serviceRequestId!=null &&
              this.serviceRequestId.equals(other.getServiceRequestId()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getArea() != null) {
            _hashCode += getArea().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getClosedTime() != null) {
            _hashCode += getClosedTime().hashCode();
        }
        if (getServiceRequestConcatField() != null) {
            _hashCode += getServiceRequestConcatField().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        if (getContactEmail() != null) {
            _hashCode += getContactEmail().hashCode();
        }
        if (getContactFirstName() != null) {
            _hashCode += getContactFirstName().hashCode();
        }
        if (getContactFullName() != null) {
            _hashCode += getContactFullName().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContactLastName() != null) {
            _hashCode += getContactLastName().hashCode();
        }
        if (getCreatedByName() != null) {
            _hashCode += getCreatedByName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getIntegrationId() != null) {
            _hashCode += getIntegrationId().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getModifiedById() != null) {
            _hashCode += getModifiedById().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getOpenedTime() != null) {
            _hashCode += getOpenedTime().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getReassignOwner() != null) {
            _hashCode += getReassignOwner().hashCode();
        }
        if (getRowStatus() != null) {
            _hashCode += getRowStatus().hashCode();
        }
        if (getSRNumber() != null) {
            _hashCode += getSRNumber().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getDtOpened_Time_Custom() != null) {
            _hashCode += getDtOpened_Time_Custom().hashCode();
        }
        if (getStError_Message() != null) {
            _hashCode += getStError_Message().hashCode();
        }
        if (getStLast_Survey_Outcome() != null) {
            _hashCode += getStLast_Survey_Outcome().hashCode();
        }
        if (getStNext_Step() != null) {
            _hashCode += getStNext_Step().hashCode();
        }
        if (getStOverall_Service_Experience() != null) {
            _hashCode += getStOverall_Service_Experience().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIndexedBoolean0() != null) {
            _hashCode += getIndexedBoolean0().hashCode();
        }
        if (getIndexedCurrency0() != null) {
            _hashCode += getIndexedCurrency0().hashCode();
        }
        if (getIndexedDate0() != null) {
            _hashCode += getIndexedDate0().hashCode();
        }
        if (getIndexedLongText0() != null) {
            _hashCode += getIndexedLongText0().hashCode();
        }
        if (getIndexedNumber0() != null) {
            _hashCode += getIndexedNumber0().hashCode();
        }
        if (getIndexedPick0() != null) {
            _hashCode += getIndexedPick0().hashCode();
        }
        if (getIndexedPick1() != null) {
            _hashCode += getIndexedPick1().hashCode();
        }
        if (getIndexedPick2() != null) {
            _hashCode += getIndexedPick2().hashCode();
        }
        if (getIndexedPick3() != null) {
            _hashCode += getIndexedPick3().hashCode();
        }
        if (getIndexedPick4() != null) {
            _hashCode += getIndexedPick4().hashCode();
        }
        if (getIndexedPick5() != null) {
            _hashCode += getIndexedPick5().hashCode();
        }
        if (getIndexedShortText0() != null) {
            _hashCode += getIndexedShortText0().hashCode();
        }
        if (getIndexedShortText1() != null) {
            _hashCode += getIndexedShortText1().hashCode();
        }
        if (getServiceRequestId() != null) {
            _hashCode += getServiceRequestId().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ClosedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRequestConcatField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequestConcatField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "WorkPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactFullName"));
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
        elemField.setFieldName("contactLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedByName"));
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
        elemField.setFieldName("externalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IntegrationId"));
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
        elemField.setFieldName("modifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModifiedById"));
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
        elemField.setFieldName("openedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OpenedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reassignOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ReassignOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RowStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SRNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Sub-Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtOpened_Time_Custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "dtOpened_Time_Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stError_Message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stError_Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stLast_Survey_Outcome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stLast_Survey_Outcome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stNext_Step");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stNext_Step"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stOverall_Service_Experience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stOverall_Service_Experience"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedBoolean0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedBoolean0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedCurrency0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedCurrency0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedDate0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedDate0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedLongText0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedLongText0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedNumber0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedNumber0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedPick0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedPick0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedPick1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedPick1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedPick2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedPick2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedPick3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedPick3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedPick4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedPick4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedPick5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedPick5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedShortText0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedShortText0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedShortText1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IndexedShortText1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CurrencyCode"));
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
