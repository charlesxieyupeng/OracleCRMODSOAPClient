/**
 * Activity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.xml.contact;

public class Activity  implements java.io.Serializable {
    private java.lang.String smartCall;

    private java.lang.String refNum;

    private java.lang.String paperSign;

    private java.lang.String objective;

    private java.lang.String duration;

    private java.lang.String cost;

    private java.lang.String address;

    private java.lang.String callType;

    private java.lang.String nextCall;

    private java.lang.String owner;

    private java.lang.String subject;

    private java.lang.String dueDate;

    private java.lang.String priority;

    private java.lang.String status;

    private java.lang.String type;

    private java.lang.String accountId;

    private java.lang.String account;

    private java.lang.String serviceRequestId;

    private java.lang.String campaignId;

    private java.lang.String campaign;

    private java.lang.String description;

    private java.lang.String contactPerId;

    private java.lang.String createdById;

    private java.lang.String createdDate;

    private java.lang.String currencyCode;

    private java.lang.String display;

    private java.lang.String externalSystemId;

    private java.lang.String lead;

    private java.lang.String leadId;

    private java.lang.String location;

    private java.lang.String modifiedById;

    private java.lang.String modifiedDate;

    private java.lang.String modifiedBy;

    private java.lang.String opportunity;

    private java.lang.String opportunityId;

    private java.lang.String ownerId;

    private java.lang.String parentActivityId;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String primaryContactId;

    private java.lang.String _private;

    private java.lang.String rowStatusOld;

    private java.lang.String serviceRequest;

    private java.lang.String dtReceived_Date;

    private java.lang.String iDuration_of_Call;

    private java.lang.String stRibbit_ID;

    private java.lang.String createdBy;

    private java.lang.String activityId;

    private java.lang.String integrationId;

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

    public Activity() {
    }

    public Activity(
           java.lang.String smartCall,
           java.lang.String refNum,
           java.lang.String paperSign,
           java.lang.String objective,
           java.lang.String duration,
           java.lang.String cost,
           java.lang.String address,
           java.lang.String callType,
           java.lang.String nextCall,
           java.lang.String owner,
           java.lang.String subject,
           java.lang.String dueDate,
           java.lang.String priority,
           java.lang.String status,
           java.lang.String type,
           java.lang.String accountId,
           java.lang.String account,
           java.lang.String serviceRequestId,
           java.lang.String campaignId,
           java.lang.String campaign,
           java.lang.String description,
           java.lang.String contactPerId,
           java.lang.String createdById,
           java.lang.String createdDate,
           java.lang.String currencyCode,
           java.lang.String display,
           java.lang.String externalSystemId,
           java.lang.String lead,
           java.lang.String leadId,
           java.lang.String location,
           java.lang.String modifiedById,
           java.lang.String modifiedDate,
           java.lang.String modifiedBy,
           java.lang.String opportunity,
           java.lang.String opportunityId,
           java.lang.String ownerId,
           java.lang.String parentActivityId,
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String primaryContactId,
           java.lang.String _private,
           java.lang.String rowStatusOld,
           java.lang.String serviceRequest,
           java.lang.String dtReceived_Date,
           java.lang.String iDuration_of_Call,
           java.lang.String stRibbit_ID,
           java.lang.String createdBy,
           java.lang.String activityId,
           java.lang.String integrationId,
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
           java.lang.String indexedShortText1) {
           this.smartCall = smartCall;
           this.refNum = refNum;
           this.paperSign = paperSign;
           this.objective = objective;
           this.duration = duration;
           this.cost = cost;
           this.address = address;
           this.callType = callType;
           this.nextCall = nextCall;
           this.owner = owner;
           this.subject = subject;
           this.dueDate = dueDate;
           this.priority = priority;
           this.status = status;
           this.type = type;
           this.accountId = accountId;
           this.account = account;
           this.serviceRequestId = serviceRequestId;
           this.campaignId = campaignId;
           this.campaign = campaign;
           this.description = description;
           this.contactPerId = contactPerId;
           this.createdById = createdById;
           this.createdDate = createdDate;
           this.currencyCode = currencyCode;
           this.display = display;
           this.externalSystemId = externalSystemId;
           this.lead = lead;
           this.leadId = leadId;
           this.location = location;
           this.modifiedById = modifiedById;
           this.modifiedDate = modifiedDate;
           this.modifiedBy = modifiedBy;
           this.opportunity = opportunity;
           this.opportunityId = opportunityId;
           this.ownerId = ownerId;
           this.parentActivityId = parentActivityId;
           this.startTime = startTime;
           this.endTime = endTime;
           this.primaryContactId = primaryContactId;
           this._private = _private;
           this.rowStatusOld = rowStatusOld;
           this.serviceRequest = serviceRequest;
           this.dtReceived_Date = dtReceived_Date;
           this.iDuration_of_Call = iDuration_of_Call;
           this.stRibbit_ID = stRibbit_ID;
           this.createdBy = createdBy;
           this.activityId = activityId;
           this.integrationId = integrationId;
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
    }


    /**
     * Gets the smartCall value for this Activity.
     * 
     * @return smartCall
     */
    public java.lang.String getSmartCall() {
        return smartCall;
    }


    /**
     * Sets the smartCall value for this Activity.
     * 
     * @param smartCall
     */
    public void setSmartCall(java.lang.String smartCall) {
        this.smartCall = smartCall;
    }


    /**
     * Gets the refNum value for this Activity.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this Activity.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the paperSign value for this Activity.
     * 
     * @return paperSign
     */
    public java.lang.String getPaperSign() {
        return paperSign;
    }


    /**
     * Sets the paperSign value for this Activity.
     * 
     * @param paperSign
     */
    public void setPaperSign(java.lang.String paperSign) {
        this.paperSign = paperSign;
    }


    /**
     * Gets the objective value for this Activity.
     * 
     * @return objective
     */
    public java.lang.String getObjective() {
        return objective;
    }


    /**
     * Sets the objective value for this Activity.
     * 
     * @param objective
     */
    public void setObjective(java.lang.String objective) {
        this.objective = objective;
    }


    /**
     * Gets the duration value for this Activity.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this Activity.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the cost value for this Activity.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Activity.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
    }


    /**
     * Gets the address value for this Activity.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Activity.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the callType value for this Activity.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this Activity.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the nextCall value for this Activity.
     * 
     * @return nextCall
     */
    public java.lang.String getNextCall() {
        return nextCall;
    }


    /**
     * Sets the nextCall value for this Activity.
     * 
     * @param nextCall
     */
    public void setNextCall(java.lang.String nextCall) {
        this.nextCall = nextCall;
    }


    /**
     * Gets the owner value for this Activity.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Activity.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the subject value for this Activity.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Activity.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the dueDate value for this Activity.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Activity.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the priority value for this Activity.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Activity.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the status value for this Activity.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Activity.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the type value for this Activity.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Activity.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the accountId value for this Activity.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Activity.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the account value for this Activity.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Activity.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the serviceRequestId value for this Activity.
     * 
     * @return serviceRequestId
     */
    public java.lang.String getServiceRequestId() {
        return serviceRequestId;
    }


    /**
     * Sets the serviceRequestId value for this Activity.
     * 
     * @param serviceRequestId
     */
    public void setServiceRequestId(java.lang.String serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
    }


    /**
     * Gets the campaignId value for this Activity.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Activity.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaign value for this Activity.
     * 
     * @return campaign
     */
    public java.lang.String getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this Activity.
     * 
     * @param campaign
     */
    public void setCampaign(java.lang.String campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the description value for this Activity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Activity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the contactPerId value for this Activity.
     * 
     * @return contactPerId
     */
    public java.lang.String getContactPerId() {
        return contactPerId;
    }


    /**
     * Sets the contactPerId value for this Activity.
     * 
     * @param contactPerId
     */
    public void setContactPerId(java.lang.String contactPerId) {
        this.contactPerId = contactPerId;
    }


    /**
     * Gets the createdById value for this Activity.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Activity.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Activity.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Activity.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyCode value for this Activity.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Activity.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the display value for this Activity.
     * 
     * @return display
     */
    public java.lang.String getDisplay() {
        return display;
    }


    /**
     * Sets the display value for this Activity.
     * 
     * @param display
     */
    public void setDisplay(java.lang.String display) {
        this.display = display;
    }


    /**
     * Gets the externalSystemId value for this Activity.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this Activity.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the lead value for this Activity.
     * 
     * @return lead
     */
    public java.lang.String getLead() {
        return lead;
    }


    /**
     * Sets the lead value for this Activity.
     * 
     * @param lead
     */
    public void setLead(java.lang.String lead) {
        this.lead = lead;
    }


    /**
     * Gets the leadId value for this Activity.
     * 
     * @return leadId
     */
    public java.lang.String getLeadId() {
        return leadId;
    }


    /**
     * Sets the leadId value for this Activity.
     * 
     * @param leadId
     */
    public void setLeadId(java.lang.String leadId) {
        this.leadId = leadId;
    }


    /**
     * Gets the location value for this Activity.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Activity.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the modifiedById value for this Activity.
     * 
     * @return modifiedById
     */
    public java.lang.String getModifiedById() {
        return modifiedById;
    }


    /**
     * Sets the modifiedById value for this Activity.
     * 
     * @param modifiedById
     */
    public void setModifiedById(java.lang.String modifiedById) {
        this.modifiedById = modifiedById;
    }


    /**
     * Gets the modifiedDate value for this Activity.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Activity.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedBy value for this Activity.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this Activity.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the opportunity value for this Activity.
     * 
     * @return opportunity
     */
    public java.lang.String getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this Activity.
     * 
     * @param opportunity
     */
    public void setOpportunity(java.lang.String opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the opportunityId value for this Activity.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this Activity.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the ownerId value for this Activity.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Activity.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the parentActivityId value for this Activity.
     * 
     * @return parentActivityId
     */
    public java.lang.String getParentActivityId() {
        return parentActivityId;
    }


    /**
     * Sets the parentActivityId value for this Activity.
     * 
     * @param parentActivityId
     */
    public void setParentActivityId(java.lang.String parentActivityId) {
        this.parentActivityId = parentActivityId;
    }


    /**
     * Gets the startTime value for this Activity.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this Activity.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this Activity.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this Activity.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the primaryContactId value for this Activity.
     * 
     * @return primaryContactId
     */
    public java.lang.String getPrimaryContactId() {
        return primaryContactId;
    }


    /**
     * Sets the primaryContactId value for this Activity.
     * 
     * @param primaryContactId
     */
    public void setPrimaryContactId(java.lang.String primaryContactId) {
        this.primaryContactId = primaryContactId;
    }


    /**
     * Gets the _private value for this Activity.
     * 
     * @return _private
     */
    public java.lang.String get_private() {
        return _private;
    }


    /**
     * Sets the _private value for this Activity.
     * 
     * @param _private
     */
    public void set_private(java.lang.String _private) {
        this._private = _private;
    }


    /**
     * Gets the rowStatusOld value for this Activity.
     * 
     * @return rowStatusOld
     */
    public java.lang.String getRowStatusOld() {
        return rowStatusOld;
    }


    /**
     * Sets the rowStatusOld value for this Activity.
     * 
     * @param rowStatusOld
     */
    public void setRowStatusOld(java.lang.String rowStatusOld) {
        this.rowStatusOld = rowStatusOld;
    }


    /**
     * Gets the serviceRequest value for this Activity.
     * 
     * @return serviceRequest
     */
    public java.lang.String getServiceRequest() {
        return serviceRequest;
    }


    /**
     * Sets the serviceRequest value for this Activity.
     * 
     * @param serviceRequest
     */
    public void setServiceRequest(java.lang.String serviceRequest) {
        this.serviceRequest = serviceRequest;
    }


    /**
     * Gets the dtReceived_Date value for this Activity.
     * 
     * @return dtReceived_Date
     */
    public java.lang.String getDtReceived_Date() {
        return dtReceived_Date;
    }


    /**
     * Sets the dtReceived_Date value for this Activity.
     * 
     * @param dtReceived_Date
     */
    public void setDtReceived_Date(java.lang.String dtReceived_Date) {
        this.dtReceived_Date = dtReceived_Date;
    }


    /**
     * Gets the iDuration_of_Call value for this Activity.
     * 
     * @return iDuration_of_Call
     */
    public java.lang.String getIDuration_of_Call() {
        return iDuration_of_Call;
    }


    /**
     * Sets the iDuration_of_Call value for this Activity.
     * 
     * @param iDuration_of_Call
     */
    public void setIDuration_of_Call(java.lang.String iDuration_of_Call) {
        this.iDuration_of_Call = iDuration_of_Call;
    }


    /**
     * Gets the stRibbit_ID value for this Activity.
     * 
     * @return stRibbit_ID
     */
    public java.lang.String getStRibbit_ID() {
        return stRibbit_ID;
    }


    /**
     * Sets the stRibbit_ID value for this Activity.
     * 
     * @param stRibbit_ID
     */
    public void setStRibbit_ID(java.lang.String stRibbit_ID) {
        this.stRibbit_ID = stRibbit_ID;
    }


    /**
     * Gets the createdBy value for this Activity.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Activity.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the activityId value for this Activity.
     * 
     * @return activityId
     */
    public java.lang.String getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this Activity.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.String activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the integrationId value for this Activity.
     * 
     * @return integrationId
     */
    public java.lang.String getIntegrationId() {
        return integrationId;
    }


    /**
     * Sets the integrationId value for this Activity.
     * 
     * @param integrationId
     */
    public void setIntegrationId(java.lang.String integrationId) {
        this.integrationId = integrationId;
    }


    /**
     * Gets the indexedBoolean0 value for this Activity.
     * 
     * @return indexedBoolean0
     */
    public java.lang.String getIndexedBoolean0() {
        return indexedBoolean0;
    }


    /**
     * Sets the indexedBoolean0 value for this Activity.
     * 
     * @param indexedBoolean0
     */
    public void setIndexedBoolean0(java.lang.String indexedBoolean0) {
        this.indexedBoolean0 = indexedBoolean0;
    }


    /**
     * Gets the indexedCurrency0 value for this Activity.
     * 
     * @return indexedCurrency0
     */
    public java.lang.String getIndexedCurrency0() {
        return indexedCurrency0;
    }


    /**
     * Sets the indexedCurrency0 value for this Activity.
     * 
     * @param indexedCurrency0
     */
    public void setIndexedCurrency0(java.lang.String indexedCurrency0) {
        this.indexedCurrency0 = indexedCurrency0;
    }


    /**
     * Gets the indexedDate0 value for this Activity.
     * 
     * @return indexedDate0
     */
    public java.lang.String getIndexedDate0() {
        return indexedDate0;
    }


    /**
     * Sets the indexedDate0 value for this Activity.
     * 
     * @param indexedDate0
     */
    public void setIndexedDate0(java.lang.String indexedDate0) {
        this.indexedDate0 = indexedDate0;
    }


    /**
     * Gets the indexedLongText0 value for this Activity.
     * 
     * @return indexedLongText0
     */
    public java.lang.String getIndexedLongText0() {
        return indexedLongText0;
    }


    /**
     * Sets the indexedLongText0 value for this Activity.
     * 
     * @param indexedLongText0
     */
    public void setIndexedLongText0(java.lang.String indexedLongText0) {
        this.indexedLongText0 = indexedLongText0;
    }


    /**
     * Gets the indexedNumber0 value for this Activity.
     * 
     * @return indexedNumber0
     */
    public java.lang.String getIndexedNumber0() {
        return indexedNumber0;
    }


    /**
     * Sets the indexedNumber0 value for this Activity.
     * 
     * @param indexedNumber0
     */
    public void setIndexedNumber0(java.lang.String indexedNumber0) {
        this.indexedNumber0 = indexedNumber0;
    }


    /**
     * Gets the indexedPick0 value for this Activity.
     * 
     * @return indexedPick0
     */
    public java.lang.String getIndexedPick0() {
        return indexedPick0;
    }


    /**
     * Sets the indexedPick0 value for this Activity.
     * 
     * @param indexedPick0
     */
    public void setIndexedPick0(java.lang.String indexedPick0) {
        this.indexedPick0 = indexedPick0;
    }


    /**
     * Gets the indexedPick1 value for this Activity.
     * 
     * @return indexedPick1
     */
    public java.lang.String getIndexedPick1() {
        return indexedPick1;
    }


    /**
     * Sets the indexedPick1 value for this Activity.
     * 
     * @param indexedPick1
     */
    public void setIndexedPick1(java.lang.String indexedPick1) {
        this.indexedPick1 = indexedPick1;
    }


    /**
     * Gets the indexedPick2 value for this Activity.
     * 
     * @return indexedPick2
     */
    public java.lang.String getIndexedPick2() {
        return indexedPick2;
    }


    /**
     * Sets the indexedPick2 value for this Activity.
     * 
     * @param indexedPick2
     */
    public void setIndexedPick2(java.lang.String indexedPick2) {
        this.indexedPick2 = indexedPick2;
    }


    /**
     * Gets the indexedPick3 value for this Activity.
     * 
     * @return indexedPick3
     */
    public java.lang.String getIndexedPick3() {
        return indexedPick3;
    }


    /**
     * Sets the indexedPick3 value for this Activity.
     * 
     * @param indexedPick3
     */
    public void setIndexedPick3(java.lang.String indexedPick3) {
        this.indexedPick3 = indexedPick3;
    }


    /**
     * Gets the indexedPick4 value for this Activity.
     * 
     * @return indexedPick4
     */
    public java.lang.String getIndexedPick4() {
        return indexedPick4;
    }


    /**
     * Sets the indexedPick4 value for this Activity.
     * 
     * @param indexedPick4
     */
    public void setIndexedPick4(java.lang.String indexedPick4) {
        this.indexedPick4 = indexedPick4;
    }


    /**
     * Gets the indexedPick5 value for this Activity.
     * 
     * @return indexedPick5
     */
    public java.lang.String getIndexedPick5() {
        return indexedPick5;
    }


    /**
     * Sets the indexedPick5 value for this Activity.
     * 
     * @param indexedPick5
     */
    public void setIndexedPick5(java.lang.String indexedPick5) {
        this.indexedPick5 = indexedPick5;
    }


    /**
     * Gets the indexedShortText0 value for this Activity.
     * 
     * @return indexedShortText0
     */
    public java.lang.String getIndexedShortText0() {
        return indexedShortText0;
    }


    /**
     * Sets the indexedShortText0 value for this Activity.
     * 
     * @param indexedShortText0
     */
    public void setIndexedShortText0(java.lang.String indexedShortText0) {
        this.indexedShortText0 = indexedShortText0;
    }


    /**
     * Gets the indexedShortText1 value for this Activity.
     * 
     * @return indexedShortText1
     */
    public java.lang.String getIndexedShortText1() {
        return indexedShortText1;
    }


    /**
     * Sets the indexedShortText1 value for this Activity.
     * 
     * @param indexedShortText1
     */
    public void setIndexedShortText1(java.lang.String indexedShortText1) {
        this.indexedShortText1 = indexedShortText1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activity)) return false;
        Activity other = (Activity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCall==null && other.getSmartCall()==null) || 
             (this.smartCall!=null &&
              this.smartCall.equals(other.getSmartCall()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.paperSign==null && other.getPaperSign()==null) || 
             (this.paperSign!=null &&
              this.paperSign.equals(other.getPaperSign()))) &&
            ((this.objective==null && other.getObjective()==null) || 
             (this.objective!=null &&
              this.objective.equals(other.getObjective()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.nextCall==null && other.getNextCall()==null) || 
             (this.nextCall!=null &&
              this.nextCall.equals(other.getNextCall()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.serviceRequestId==null && other.getServiceRequestId()==null) || 
             (this.serviceRequestId!=null &&
              this.serviceRequestId.equals(other.getServiceRequestId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.contactPerId==null && other.getContactPerId()==null) || 
             (this.contactPerId!=null &&
              this.contactPerId.equals(other.getContactPerId()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.display==null && other.getDisplay()==null) || 
             (this.display!=null &&
              this.display.equals(other.getDisplay()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.lead==null && other.getLead()==null) || 
             (this.lead!=null &&
              this.lead.equals(other.getLead()))) &&
            ((this.leadId==null && other.getLeadId()==null) || 
             (this.leadId!=null &&
              this.leadId.equals(other.getLeadId()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.modifiedById==null && other.getModifiedById()==null) || 
             (this.modifiedById!=null &&
              this.modifiedById.equals(other.getModifiedById()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.parentActivityId==null && other.getParentActivityId()==null) || 
             (this.parentActivityId!=null &&
              this.parentActivityId.equals(other.getParentActivityId()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.primaryContactId==null && other.getPrimaryContactId()==null) || 
             (this.primaryContactId!=null &&
              this.primaryContactId.equals(other.getPrimaryContactId()))) &&
            ((this._private==null && other.get_private()==null) || 
             (this._private!=null &&
              this._private.equals(other.get_private()))) &&
            ((this.rowStatusOld==null && other.getRowStatusOld()==null) || 
             (this.rowStatusOld!=null &&
              this.rowStatusOld.equals(other.getRowStatusOld()))) &&
            ((this.serviceRequest==null && other.getServiceRequest()==null) || 
             (this.serviceRequest!=null &&
              this.serviceRequest.equals(other.getServiceRequest()))) &&
            ((this.dtReceived_Date==null && other.getDtReceived_Date()==null) || 
             (this.dtReceived_Date!=null &&
              this.dtReceived_Date.equals(other.getDtReceived_Date()))) &&
            ((this.iDuration_of_Call==null && other.getIDuration_of_Call()==null) || 
             (this.iDuration_of_Call!=null &&
              this.iDuration_of_Call.equals(other.getIDuration_of_Call()))) &&
            ((this.stRibbit_ID==null && other.getStRibbit_ID()==null) || 
             (this.stRibbit_ID!=null &&
              this.stRibbit_ID.equals(other.getStRibbit_ID()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.integrationId==null && other.getIntegrationId()==null) || 
             (this.integrationId!=null &&
              this.integrationId.equals(other.getIntegrationId()))) &&
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
              this.indexedShortText1.equals(other.getIndexedShortText1())));
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
        if (getSmartCall() != null) {
            _hashCode += getSmartCall().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getPaperSign() != null) {
            _hashCode += getPaperSign().hashCode();
        }
        if (getObjective() != null) {
            _hashCode += getObjective().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getNextCall() != null) {
            _hashCode += getNextCall().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getServiceRequestId() != null) {
            _hashCode += getServiceRequestId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getContactPerId() != null) {
            _hashCode += getContactPerId().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDisplay() != null) {
            _hashCode += getDisplay().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getLead() != null) {
            _hashCode += getLead().hashCode();
        }
        if (getLeadId() != null) {
            _hashCode += getLeadId().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getModifiedById() != null) {
            _hashCode += getModifiedById().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getParentActivityId() != null) {
            _hashCode += getParentActivityId().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getPrimaryContactId() != null) {
            _hashCode += getPrimaryContactId().hashCode();
        }
        if (get_private() != null) {
            _hashCode += get_private().hashCode();
        }
        if (getRowStatusOld() != null) {
            _hashCode += getRowStatusOld().hashCode();
        }
        if (getServiceRequest() != null) {
            _hashCode += getServiceRequest().hashCode();
        }
        if (getDtReceived_Date() != null) {
            _hashCode += getDtReceived_Date().hashCode();
        }
        if (getIDuration_of_Call() != null) {
            _hashCode += getIDuration_of_Call().hashCode();
        }
        if (getStRibbit_ID() != null) {
            _hashCode += getStRibbit_ID().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getIntegrationId() != null) {
            _hashCode += getIntegrationId().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Activity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SmartCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paperSign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PaperSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objective");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Objective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CallType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextCall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "NextCall"));
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
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "DueDate"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Status"));
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
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Account"));
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
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Campaign"));
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
        elemField.setFieldName("contactPerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactPerId"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedDate"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("display");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Display"));
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
        elemField.setFieldName("lead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Lead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LeadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Location"));
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
        elemField.setFieldName("modifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OpportunityId"));
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
        elemField.setFieldName("parentActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ParentActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_private");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Private"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowStatusOld");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RowStatusOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtReceived_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "dtReceived_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDuration_of_Call");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "iDuration_of_Call"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stRibbit_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stRibbit_ID"));
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
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ActivityId"));
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
