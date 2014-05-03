/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.xml.contact;

public class Contact  implements java.io.Serializable {
    private java.lang.String contactId;

    private java.lang.String modId;

    private java.lang.String accountId;

    private java.lang.String assistantName;

    private java.lang.String assistantPhone;

    private java.lang.String cellularPhone;

    private java.lang.String description;

    private java.lang.String contactConcatField;

    private java.lang.String contactType;

    private java.lang.String createdDate;

    private java.lang.String department;

    private java.lang.String contactEmail;

    private java.lang.String externalSystemId;

    private java.lang.String workFax;

    private java.lang.String contactFirstName;

    private java.lang.String contactFullName;

    private java.lang.String integrationId;

    private java.lang.String jobTitle;

    private java.lang.String contactLastName;

    private java.lang.String leadSource;

    private java.lang.String mrMrs;

    private java.lang.String manager;

    private java.lang.String managerId;

    private java.lang.String middleName;

    private java.lang.String modifiedBy;

    private java.lang.String modifiedById;

    private java.lang.String modifiedDate;

    private java.lang.String ownerId;

    private java.lang.String owner;

    private java.lang.String ownerFullName;

    private java.lang.String _private;

    private java.lang.String alternateAddressId;

    private java.lang.String primaryAddressId;

    private java.lang.String alternateAddressExternalSystemId;

    private java.lang.String primaryCity;

    private java.lang.String primaryCountry;

    private java.lang.String primaryZipCode;

    private java.lang.String primaryStateProvince;

    private java.lang.String primaryAddress;

    private java.lang.String buyingRole;

    private java.lang.String neverEmail;

    private java.lang.String timeZoneName;

    private java.lang.String workPhone;

    private java.lang.String lastActivityDate;

    private java.lang.String dtSuggested_Next_Call_Date;

    private java.lang.String dSuggested_Next_Call_Date;

    private java.lang.String iCall_Frequency_days;

    private java.lang.String plCustomer_Tier;

    private java.lang.String plCustomer_Segment;

    private java.lang.String taxBracket;

    private java.lang.String stLast_Survey_Outcome;

    private java.lang.String stReferenceable;

    private java.lang.String stLikely_to_Recommend;

    private java.lang.String accountFuriganaName;

    private java.lang.String furiganaFirstName;

    private java.lang.String furiganaLastName;

    private java.lang.String sourceCampaignId;

    private java.lang.String sourceCampaignName;

    private java.lang.String territoryId;

    private java.lang.String createdBy;

    private java.lang.String bestTimeToCall;

    private java.lang.String callFrequency;

    private java.lang.String creditScore;

    private java.lang.String currentInvestmentMix;

    private java.lang.String customerId;

    private java.lang.String tier;

    private java.lang.String dateofBirth;

    private java.lang.String degree;

    private java.lang.String experienceLevel;

    private java.lang.String homePhone;

    private java.lang.String totalIncome;

    private java.lang.String investmentHorizon;

    private java.lang.String lastCallDate;

    private java.lang.String gender;

    private java.lang.String maritalStatus;

    private java.lang.String marketPotential;

    private java.lang.String objective;

    private java.lang.String ownorRent;

    private java.lang.String primaryGoal;

    private java.lang.String homeValue;

    private java.lang.String riskProfile;

    private java.lang.String route;

    private java.lang.String segment;

    private java.lang.String selfEmployed;

    private java.lang.String totalAssets;

    private java.lang.String totalExpenses;

    private java.lang.String totalLiabilities;

    private java.lang.String totalNetWorth;

    private java.lang.String YTDSales;

    private java.lang.String ownerEmailAddress;

    private java.lang.String PIMCompanyName;

    private java.lang.String managerExternalSystemId;

    private java.lang.String optIn;

    private java.lang.String optOut;

    private java.lang.String lifeEvent;

    private java.lang.String customObject1ExternalSystemId;

    private java.lang.String customObject1Name;

    private java.lang.String customObject1Id;

    private java.lang.String assessmentFilter4;

    private java.lang.String assessmentFilter3;

    private java.lang.String assessmentFilter2;

    private java.lang.String assessmentFilter1;

    private java.lang.String customObject2ExternalSystemId;

    private java.lang.String customObject2Id;

    private java.lang.String customObject2Name;

    private java.lang.String customObject3ExternalSystemId;

    private java.lang.String age;

    private java.lang.String customObject3Id;

    private java.lang.String createdbyEmailAddress;

    private java.lang.String lastAssessmentDate;

    private java.lang.String lastUpdated;

    private java.lang.String createdById;

    private java.lang.String modifiedbyEmailAddress;

    private java.lang.String ownerExternalSystemId;

    private java.lang.String primaryGroup;

    private java.lang.String accountExternalSystemId;

    private java.lang.String contactRole;

    private java.lang.String customObject3Name;

    private java.lang.String occamTerritory;

    private java.lang.String accountName;

    private java.lang.String currencyCode;

    private java.lang.String accountLocation;

    private java.lang.String primaryCounty;

    private java.lang.String primaryProvince;

    private java.lang.String primaryStreetAddress2;

    private java.lang.String primaryStreetAddress3;

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

    private java.lang.String alternateCounty;

    private java.lang.String alternateCity;

    private java.lang.String alternateCountry;

    private java.lang.String alternateZipCode;

    private java.lang.String alternateStateProvince;

    private java.lang.String alternateAddress1;

    private java.lang.String alternateAddress2;

    private java.lang.String alternateProvince;

    private java.lang.String alternateAddress3;

    private crmondemand.xml.contact.Activity[] listOfActivity;

    private crmondemand.xml.contact.Team[] listOfContactTeam;

    private crmondemand.xml.contact.RelatedContact[] listOfRelatedContact;

    private crmondemand.xml.contact.Account[] listOfAccount;

    private crmondemand.xml.contact.Note[] listOfNote;

    private crmondemand.xml.contact.Lead[] listOfLead;

    private crmondemand.xml.contact.Opportunity[] listOfOpportunity;

    private crmondemand.xml.contact.ListOfAlternateAddress listOfAlternateAddress;

    private crmondemand.xml.contact.ServiceRequest[] listOfServiceRequest;

    private crmondemand.xml.contact.Address[] listOfAddress;

    private crmondemand.xml.contact.Revenue[] listOfRevenue;

    private crmondemand.xml.contact.Asset[] listOfAsset;

    private crmondemand.xml.contact.Interests[] listOfInterests;

    private crmondemand.xml.contact.Campaign[] listOfCampaign;

    private crmondemand.xml.contact.CustomObject3[] listOfCustomObject3;

    private crmondemand.xml.contact.Book[] listOfBook;

    private crmondemand.xml.contact.Attachment[] listOfAttachment;

    private crmondemand.xml.contact.StateLicenses[] listOfStateLicenses;

    public Contact() {
    }

    public Contact(
           java.lang.String contactId,
           java.lang.String modId,
           java.lang.String accountId,
           java.lang.String assistantName,
           java.lang.String assistantPhone,
           java.lang.String cellularPhone,
           java.lang.String description,
           java.lang.String contactConcatField,
           java.lang.String contactType,
           java.lang.String createdDate,
           java.lang.String department,
           java.lang.String contactEmail,
           java.lang.String externalSystemId,
           java.lang.String workFax,
           java.lang.String contactFirstName,
           java.lang.String contactFullName,
           java.lang.String integrationId,
           java.lang.String jobTitle,
           java.lang.String contactLastName,
           java.lang.String leadSource,
           java.lang.String mrMrs,
           java.lang.String manager,
           java.lang.String managerId,
           java.lang.String middleName,
           java.lang.String modifiedBy,
           java.lang.String modifiedById,
           java.lang.String modifiedDate,
           java.lang.String ownerId,
           java.lang.String owner,
           java.lang.String ownerFullName,
           java.lang.String _private,
           java.lang.String alternateAddressId,
           java.lang.String primaryAddressId,
           java.lang.String alternateAddressExternalSystemId,
           java.lang.String primaryCity,
           java.lang.String primaryCountry,
           java.lang.String primaryZipCode,
           java.lang.String primaryStateProvince,
           java.lang.String primaryAddress,
           java.lang.String buyingRole,
           java.lang.String neverEmail,
           java.lang.String timeZoneName,
           java.lang.String workPhone,
           java.lang.String lastActivityDate,
           java.lang.String dtSuggested_Next_Call_Date,
           java.lang.String dSuggested_Next_Call_Date,
           java.lang.String iCall_Frequency_days,
           java.lang.String plCustomer_Tier,
           java.lang.String plCustomer_Segment,
           java.lang.String taxBracket,
           java.lang.String stLast_Survey_Outcome,
           java.lang.String stReferenceable,
           java.lang.String stLikely_to_Recommend,
           java.lang.String accountFuriganaName,
           java.lang.String furiganaFirstName,
           java.lang.String furiganaLastName,
           java.lang.String sourceCampaignId,
           java.lang.String sourceCampaignName,
           java.lang.String territoryId,
           java.lang.String createdBy,
           java.lang.String bestTimeToCall,
           java.lang.String callFrequency,
           java.lang.String creditScore,
           java.lang.String currentInvestmentMix,
           java.lang.String customerId,
           java.lang.String tier,
           java.lang.String dateofBirth,
           java.lang.String degree,
           java.lang.String experienceLevel,
           java.lang.String homePhone,
           java.lang.String totalIncome,
           java.lang.String investmentHorizon,
           java.lang.String lastCallDate,
           java.lang.String gender,
           java.lang.String maritalStatus,
           java.lang.String marketPotential,
           java.lang.String objective,
           java.lang.String ownorRent,
           java.lang.String primaryGoal,
           java.lang.String homeValue,
           java.lang.String riskProfile,
           java.lang.String route,
           java.lang.String segment,
           java.lang.String selfEmployed,
           java.lang.String totalAssets,
           java.lang.String totalExpenses,
           java.lang.String totalLiabilities,
           java.lang.String totalNetWorth,
           java.lang.String YTDSales,
           java.lang.String ownerEmailAddress,
           java.lang.String PIMCompanyName,
           java.lang.String managerExternalSystemId,
           java.lang.String optIn,
           java.lang.String optOut,
           java.lang.String lifeEvent,
           java.lang.String customObject1ExternalSystemId,
           java.lang.String customObject1Name,
           java.lang.String customObject1Id,
           java.lang.String assessmentFilter4,
           java.lang.String assessmentFilter3,
           java.lang.String assessmentFilter2,
           java.lang.String assessmentFilter1,
           java.lang.String customObject2ExternalSystemId,
           java.lang.String customObject2Id,
           java.lang.String customObject2Name,
           java.lang.String customObject3ExternalSystemId,
           java.lang.String age,
           java.lang.String customObject3Id,
           java.lang.String createdbyEmailAddress,
           java.lang.String lastAssessmentDate,
           java.lang.String lastUpdated,
           java.lang.String createdById,
           java.lang.String modifiedbyEmailAddress,
           java.lang.String ownerExternalSystemId,
           java.lang.String primaryGroup,
           java.lang.String accountExternalSystemId,
           java.lang.String contactRole,
           java.lang.String customObject3Name,
           java.lang.String occamTerritory,
           java.lang.String accountName,
           java.lang.String currencyCode,
           java.lang.String accountLocation,
           java.lang.String primaryCounty,
           java.lang.String primaryProvince,
           java.lang.String primaryStreetAddress2,
           java.lang.String primaryStreetAddress3,
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
           java.lang.String alternateCounty,
           java.lang.String alternateCity,
           java.lang.String alternateCountry,
           java.lang.String alternateZipCode,
           java.lang.String alternateStateProvince,
           java.lang.String alternateAddress1,
           java.lang.String alternateAddress2,
           java.lang.String alternateProvince,
           java.lang.String alternateAddress3,
           crmondemand.xml.contact.Activity[] listOfActivity,
           crmondemand.xml.contact.Team[] listOfContactTeam,
           crmondemand.xml.contact.RelatedContact[] listOfRelatedContact,
           crmondemand.xml.contact.Account[] listOfAccount,
           crmondemand.xml.contact.Note[] listOfNote,
           crmondemand.xml.contact.Lead[] listOfLead,
           crmondemand.xml.contact.Opportunity[] listOfOpportunity,
           crmondemand.xml.contact.ListOfAlternateAddress listOfAlternateAddress,
           crmondemand.xml.contact.ServiceRequest[] listOfServiceRequest,
           crmondemand.xml.contact.Address[] listOfAddress,
           crmondemand.xml.contact.Revenue[] listOfRevenue,
           crmondemand.xml.contact.Asset[] listOfAsset,
           crmondemand.xml.contact.Interests[] listOfInterests,
           crmondemand.xml.contact.Campaign[] listOfCampaign,
           crmondemand.xml.contact.CustomObject3[] listOfCustomObject3,
           crmondemand.xml.contact.Book[] listOfBook,
           crmondemand.xml.contact.Attachment[] listOfAttachment,
           crmondemand.xml.contact.StateLicenses[] listOfStateLicenses) {
           this.contactId = contactId;
           this.modId = modId;
           this.accountId = accountId;
           this.assistantName = assistantName;
           this.assistantPhone = assistantPhone;
           this.cellularPhone = cellularPhone;
           this.description = description;
           this.contactConcatField = contactConcatField;
           this.contactType = contactType;
           this.createdDate = createdDate;
           this.department = department;
           this.contactEmail = contactEmail;
           this.externalSystemId = externalSystemId;
           this.workFax = workFax;
           this.contactFirstName = contactFirstName;
           this.contactFullName = contactFullName;
           this.integrationId = integrationId;
           this.jobTitle = jobTitle;
           this.contactLastName = contactLastName;
           this.leadSource = leadSource;
           this.mrMrs = mrMrs;
           this.manager = manager;
           this.managerId = managerId;
           this.middleName = middleName;
           this.modifiedBy = modifiedBy;
           this.modifiedById = modifiedById;
           this.modifiedDate = modifiedDate;
           this.ownerId = ownerId;
           this.owner = owner;
           this.ownerFullName = ownerFullName;
           this._private = _private;
           this.alternateAddressId = alternateAddressId;
           this.primaryAddressId = primaryAddressId;
           this.alternateAddressExternalSystemId = alternateAddressExternalSystemId;
           this.primaryCity = primaryCity;
           this.primaryCountry = primaryCountry;
           this.primaryZipCode = primaryZipCode;
           this.primaryStateProvince = primaryStateProvince;
           this.primaryAddress = primaryAddress;
           this.buyingRole = buyingRole;
           this.neverEmail = neverEmail;
           this.timeZoneName = timeZoneName;
           this.workPhone = workPhone;
           this.lastActivityDate = lastActivityDate;
           this.dtSuggested_Next_Call_Date = dtSuggested_Next_Call_Date;
           this.dSuggested_Next_Call_Date = dSuggested_Next_Call_Date;
           this.iCall_Frequency_days = iCall_Frequency_days;
           this.plCustomer_Tier = plCustomer_Tier;
           this.plCustomer_Segment = plCustomer_Segment;
           this.taxBracket = taxBracket;
           this.stLast_Survey_Outcome = stLast_Survey_Outcome;
           this.stReferenceable = stReferenceable;
           this.stLikely_to_Recommend = stLikely_to_Recommend;
           this.accountFuriganaName = accountFuriganaName;
           this.furiganaFirstName = furiganaFirstName;
           this.furiganaLastName = furiganaLastName;
           this.sourceCampaignId = sourceCampaignId;
           this.sourceCampaignName = sourceCampaignName;
           this.territoryId = territoryId;
           this.createdBy = createdBy;
           this.bestTimeToCall = bestTimeToCall;
           this.callFrequency = callFrequency;
           this.creditScore = creditScore;
           this.currentInvestmentMix = currentInvestmentMix;
           this.customerId = customerId;
           this.tier = tier;
           this.dateofBirth = dateofBirth;
           this.degree = degree;
           this.experienceLevel = experienceLevel;
           this.homePhone = homePhone;
           this.totalIncome = totalIncome;
           this.investmentHorizon = investmentHorizon;
           this.lastCallDate = lastCallDate;
           this.gender = gender;
           this.maritalStatus = maritalStatus;
           this.marketPotential = marketPotential;
           this.objective = objective;
           this.ownorRent = ownorRent;
           this.primaryGoal = primaryGoal;
           this.homeValue = homeValue;
           this.riskProfile = riskProfile;
           this.route = route;
           this.segment = segment;
           this.selfEmployed = selfEmployed;
           this.totalAssets = totalAssets;
           this.totalExpenses = totalExpenses;
           this.totalLiabilities = totalLiabilities;
           this.totalNetWorth = totalNetWorth;
           this.YTDSales = YTDSales;
           this.ownerEmailAddress = ownerEmailAddress;
           this.PIMCompanyName = PIMCompanyName;
           this.managerExternalSystemId = managerExternalSystemId;
           this.optIn = optIn;
           this.optOut = optOut;
           this.lifeEvent = lifeEvent;
           this.customObject1ExternalSystemId = customObject1ExternalSystemId;
           this.customObject1Name = customObject1Name;
           this.customObject1Id = customObject1Id;
           this.assessmentFilter4 = assessmentFilter4;
           this.assessmentFilter3 = assessmentFilter3;
           this.assessmentFilter2 = assessmentFilter2;
           this.assessmentFilter1 = assessmentFilter1;
           this.customObject2ExternalSystemId = customObject2ExternalSystemId;
           this.customObject2Id = customObject2Id;
           this.customObject2Name = customObject2Name;
           this.customObject3ExternalSystemId = customObject3ExternalSystemId;
           this.age = age;
           this.customObject3Id = customObject3Id;
           this.createdbyEmailAddress = createdbyEmailAddress;
           this.lastAssessmentDate = lastAssessmentDate;
           this.lastUpdated = lastUpdated;
           this.createdById = createdById;
           this.modifiedbyEmailAddress = modifiedbyEmailAddress;
           this.ownerExternalSystemId = ownerExternalSystemId;
           this.primaryGroup = primaryGroup;
           this.accountExternalSystemId = accountExternalSystemId;
           this.contactRole = contactRole;
           this.customObject3Name = customObject3Name;
           this.occamTerritory = occamTerritory;
           this.accountName = accountName;
           this.currencyCode = currencyCode;
           this.accountLocation = accountLocation;
           this.primaryCounty = primaryCounty;
           this.primaryProvince = primaryProvince;
           this.primaryStreetAddress2 = primaryStreetAddress2;
           this.primaryStreetAddress3 = primaryStreetAddress3;
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
           this.alternateCounty = alternateCounty;
           this.alternateCity = alternateCity;
           this.alternateCountry = alternateCountry;
           this.alternateZipCode = alternateZipCode;
           this.alternateStateProvince = alternateStateProvince;
           this.alternateAddress1 = alternateAddress1;
           this.alternateAddress2 = alternateAddress2;
           this.alternateProvince = alternateProvince;
           this.alternateAddress3 = alternateAddress3;
           this.listOfActivity = listOfActivity;
           this.listOfContactTeam = listOfContactTeam;
           this.listOfRelatedContact = listOfRelatedContact;
           this.listOfAccount = listOfAccount;
           this.listOfNote = listOfNote;
           this.listOfLead = listOfLead;
           this.listOfOpportunity = listOfOpportunity;
           this.listOfAlternateAddress = listOfAlternateAddress;
           this.listOfServiceRequest = listOfServiceRequest;
           this.listOfAddress = listOfAddress;
           this.listOfRevenue = listOfRevenue;
           this.listOfAsset = listOfAsset;
           this.listOfInterests = listOfInterests;
           this.listOfCampaign = listOfCampaign;
           this.listOfCustomObject3 = listOfCustomObject3;
           this.listOfBook = listOfBook;
           this.listOfAttachment = listOfAttachment;
           this.listOfStateLicenses = listOfStateLicenses;
    }


    /**
     * Gets the contactId value for this Contact.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this Contact.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the modId value for this Contact.
     * 
     * @return modId
     */
    public java.lang.String getModId() {
        return modId;
    }


    /**
     * Sets the modId value for this Contact.
     * 
     * @param modId
     */
    public void setModId(java.lang.String modId) {
        this.modId = modId;
    }


    /**
     * Gets the accountId value for this Contact.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Contact.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the assistantName value for this Contact.
     * 
     * @return assistantName
     */
    public java.lang.String getAssistantName() {
        return assistantName;
    }


    /**
     * Sets the assistantName value for this Contact.
     * 
     * @param assistantName
     */
    public void setAssistantName(java.lang.String assistantName) {
        this.assistantName = assistantName;
    }


    /**
     * Gets the assistantPhone value for this Contact.
     * 
     * @return assistantPhone
     */
    public java.lang.String getAssistantPhone() {
        return assistantPhone;
    }


    /**
     * Sets the assistantPhone value for this Contact.
     * 
     * @param assistantPhone
     */
    public void setAssistantPhone(java.lang.String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }


    /**
     * Gets the cellularPhone value for this Contact.
     * 
     * @return cellularPhone
     */
    public java.lang.String getCellularPhone() {
        return cellularPhone;
    }


    /**
     * Sets the cellularPhone value for this Contact.
     * 
     * @param cellularPhone
     */
    public void setCellularPhone(java.lang.String cellularPhone) {
        this.cellularPhone = cellularPhone;
    }


    /**
     * Gets the description value for this Contact.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Contact.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the contactConcatField value for this Contact.
     * 
     * @return contactConcatField
     */
    public java.lang.String getContactConcatField() {
        return contactConcatField;
    }


    /**
     * Sets the contactConcatField value for this Contact.
     * 
     * @param contactConcatField
     */
    public void setContactConcatField(java.lang.String contactConcatField) {
        this.contactConcatField = contactConcatField;
    }


    /**
     * Gets the contactType value for this Contact.
     * 
     * @return contactType
     */
    public java.lang.String getContactType() {
        return contactType;
    }


    /**
     * Sets the contactType value for this Contact.
     * 
     * @param contactType
     */
    public void setContactType(java.lang.String contactType) {
        this.contactType = contactType;
    }


    /**
     * Gets the createdDate value for this Contact.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Contact.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the department value for this Contact.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Contact.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the contactEmail value for this Contact.
     * 
     * @return contactEmail
     */
    public java.lang.String getContactEmail() {
        return contactEmail;
    }


    /**
     * Sets the contactEmail value for this Contact.
     * 
     * @param contactEmail
     */
    public void setContactEmail(java.lang.String contactEmail) {
        this.contactEmail = contactEmail;
    }


    /**
     * Gets the externalSystemId value for this Contact.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this Contact.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the workFax value for this Contact.
     * 
     * @return workFax
     */
    public java.lang.String getWorkFax() {
        return workFax;
    }


    /**
     * Sets the workFax value for this Contact.
     * 
     * @param workFax
     */
    public void setWorkFax(java.lang.String workFax) {
        this.workFax = workFax;
    }


    /**
     * Gets the contactFirstName value for this Contact.
     * 
     * @return contactFirstName
     */
    public java.lang.String getContactFirstName() {
        return contactFirstName;
    }


    /**
     * Sets the contactFirstName value for this Contact.
     * 
     * @param contactFirstName
     */
    public void setContactFirstName(java.lang.String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }


    /**
     * Gets the contactFullName value for this Contact.
     * 
     * @return contactFullName
     */
    public java.lang.String getContactFullName() {
        return contactFullName;
    }


    /**
     * Sets the contactFullName value for this Contact.
     * 
     * @param contactFullName
     */
    public void setContactFullName(java.lang.String contactFullName) {
        this.contactFullName = contactFullName;
    }


    /**
     * Gets the integrationId value for this Contact.
     * 
     * @return integrationId
     */
    public java.lang.String getIntegrationId() {
        return integrationId;
    }


    /**
     * Sets the integrationId value for this Contact.
     * 
     * @param integrationId
     */
    public void setIntegrationId(java.lang.String integrationId) {
        this.integrationId = integrationId;
    }


    /**
     * Gets the jobTitle value for this Contact.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this Contact.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the contactLastName value for this Contact.
     * 
     * @return contactLastName
     */
    public java.lang.String getContactLastName() {
        return contactLastName;
    }


    /**
     * Sets the contactLastName value for this Contact.
     * 
     * @param contactLastName
     */
    public void setContactLastName(java.lang.String contactLastName) {
        this.contactLastName = contactLastName;
    }


    /**
     * Gets the leadSource value for this Contact.
     * 
     * @return leadSource
     */
    public java.lang.String getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Contact.
     * 
     * @param leadSource
     */
    public void setLeadSource(java.lang.String leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the mrMrs value for this Contact.
     * 
     * @return mrMrs
     */
    public java.lang.String getMrMrs() {
        return mrMrs;
    }


    /**
     * Sets the mrMrs value for this Contact.
     * 
     * @param mrMrs
     */
    public void setMrMrs(java.lang.String mrMrs) {
        this.mrMrs = mrMrs;
    }


    /**
     * Gets the manager value for this Contact.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this Contact.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerId value for this Contact.
     * 
     * @return managerId
     */
    public java.lang.String getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this Contact.
     * 
     * @param managerId
     */
    public void setManagerId(java.lang.String managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the middleName value for this Contact.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Contact.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the modifiedBy value for this Contact.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this Contact.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the modifiedById value for this Contact.
     * 
     * @return modifiedById
     */
    public java.lang.String getModifiedById() {
        return modifiedById;
    }


    /**
     * Sets the modifiedById value for this Contact.
     * 
     * @param modifiedById
     */
    public void setModifiedById(java.lang.String modifiedById) {
        this.modifiedById = modifiedById;
    }


    /**
     * Gets the modifiedDate value for this Contact.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Contact.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the ownerId value for this Contact.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Contact.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the owner value for this Contact.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Contact.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerFullName value for this Contact.
     * 
     * @return ownerFullName
     */
    public java.lang.String getOwnerFullName() {
        return ownerFullName;
    }


    /**
     * Sets the ownerFullName value for this Contact.
     * 
     * @param ownerFullName
     */
    public void setOwnerFullName(java.lang.String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }


    /**
     * Gets the _private value for this Contact.
     * 
     * @return _private
     */
    public java.lang.String get_private() {
        return _private;
    }


    /**
     * Sets the _private value for this Contact.
     * 
     * @param _private
     */
    public void set_private(java.lang.String _private) {
        this._private = _private;
    }


    /**
     * Gets the alternateAddressId value for this Contact.
     * 
     * @return alternateAddressId
     */
    public java.lang.String getAlternateAddressId() {
        return alternateAddressId;
    }


    /**
     * Sets the alternateAddressId value for this Contact.
     * 
     * @param alternateAddressId
     */
    public void setAlternateAddressId(java.lang.String alternateAddressId) {
        this.alternateAddressId = alternateAddressId;
    }


    /**
     * Gets the primaryAddressId value for this Contact.
     * 
     * @return primaryAddressId
     */
    public java.lang.String getPrimaryAddressId() {
        return primaryAddressId;
    }


    /**
     * Sets the primaryAddressId value for this Contact.
     * 
     * @param primaryAddressId
     */
    public void setPrimaryAddressId(java.lang.String primaryAddressId) {
        this.primaryAddressId = primaryAddressId;
    }


    /**
     * Gets the alternateAddressExternalSystemId value for this Contact.
     * 
     * @return alternateAddressExternalSystemId
     */
    public java.lang.String getAlternateAddressExternalSystemId() {
        return alternateAddressExternalSystemId;
    }


    /**
     * Sets the alternateAddressExternalSystemId value for this Contact.
     * 
     * @param alternateAddressExternalSystemId
     */
    public void setAlternateAddressExternalSystemId(java.lang.String alternateAddressExternalSystemId) {
        this.alternateAddressExternalSystemId = alternateAddressExternalSystemId;
    }


    /**
     * Gets the primaryCity value for this Contact.
     * 
     * @return primaryCity
     */
    public java.lang.String getPrimaryCity() {
        return primaryCity;
    }


    /**
     * Sets the primaryCity value for this Contact.
     * 
     * @param primaryCity
     */
    public void setPrimaryCity(java.lang.String primaryCity) {
        this.primaryCity = primaryCity;
    }


    /**
     * Gets the primaryCountry value for this Contact.
     * 
     * @return primaryCountry
     */
    public java.lang.String getPrimaryCountry() {
        return primaryCountry;
    }


    /**
     * Sets the primaryCountry value for this Contact.
     * 
     * @param primaryCountry
     */
    public void setPrimaryCountry(java.lang.String primaryCountry) {
        this.primaryCountry = primaryCountry;
    }


    /**
     * Gets the primaryZipCode value for this Contact.
     * 
     * @return primaryZipCode
     */
    public java.lang.String getPrimaryZipCode() {
        return primaryZipCode;
    }


    /**
     * Sets the primaryZipCode value for this Contact.
     * 
     * @param primaryZipCode
     */
    public void setPrimaryZipCode(java.lang.String primaryZipCode) {
        this.primaryZipCode = primaryZipCode;
    }


    /**
     * Gets the primaryStateProvince value for this Contact.
     * 
     * @return primaryStateProvince
     */
    public java.lang.String getPrimaryStateProvince() {
        return primaryStateProvince;
    }


    /**
     * Sets the primaryStateProvince value for this Contact.
     * 
     * @param primaryStateProvince
     */
    public void setPrimaryStateProvince(java.lang.String primaryStateProvince) {
        this.primaryStateProvince = primaryStateProvince;
    }


    /**
     * Gets the primaryAddress value for this Contact.
     * 
     * @return primaryAddress
     */
    public java.lang.String getPrimaryAddress() {
        return primaryAddress;
    }


    /**
     * Sets the primaryAddress value for this Contact.
     * 
     * @param primaryAddress
     */
    public void setPrimaryAddress(java.lang.String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }


    /**
     * Gets the buyingRole value for this Contact.
     * 
     * @return buyingRole
     */
    public java.lang.String getBuyingRole() {
        return buyingRole;
    }


    /**
     * Sets the buyingRole value for this Contact.
     * 
     * @param buyingRole
     */
    public void setBuyingRole(java.lang.String buyingRole) {
        this.buyingRole = buyingRole;
    }


    /**
     * Gets the neverEmail value for this Contact.
     * 
     * @return neverEmail
     */
    public java.lang.String getNeverEmail() {
        return neverEmail;
    }


    /**
     * Sets the neverEmail value for this Contact.
     * 
     * @param neverEmail
     */
    public void setNeverEmail(java.lang.String neverEmail) {
        this.neverEmail = neverEmail;
    }


    /**
     * Gets the timeZoneName value for this Contact.
     * 
     * @return timeZoneName
     */
    public java.lang.String getTimeZoneName() {
        return timeZoneName;
    }


    /**
     * Sets the timeZoneName value for this Contact.
     * 
     * @param timeZoneName
     */
    public void setTimeZoneName(java.lang.String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }


    /**
     * Gets the workPhone value for this Contact.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this Contact.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }


    /**
     * Gets the lastActivityDate value for this Contact.
     * 
     * @return lastActivityDate
     */
    public java.lang.String getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Contact.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.lang.String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the dtSuggested_Next_Call_Date value for this Contact.
     * 
     * @return dtSuggested_Next_Call_Date
     */
    public java.lang.String getDtSuggested_Next_Call_Date() {
        return dtSuggested_Next_Call_Date;
    }


    /**
     * Sets the dtSuggested_Next_Call_Date value for this Contact.
     * 
     * @param dtSuggested_Next_Call_Date
     */
    public void setDtSuggested_Next_Call_Date(java.lang.String dtSuggested_Next_Call_Date) {
        this.dtSuggested_Next_Call_Date = dtSuggested_Next_Call_Date;
    }


    /**
     * Gets the dSuggested_Next_Call_Date value for this Contact.
     * 
     * @return dSuggested_Next_Call_Date
     */
    public java.lang.String getDSuggested_Next_Call_Date() {
        return dSuggested_Next_Call_Date;
    }


    /**
     * Sets the dSuggested_Next_Call_Date value for this Contact.
     * 
     * @param dSuggested_Next_Call_Date
     */
    public void setDSuggested_Next_Call_Date(java.lang.String dSuggested_Next_Call_Date) {
        this.dSuggested_Next_Call_Date = dSuggested_Next_Call_Date;
    }


    /**
     * Gets the iCall_Frequency_days value for this Contact.
     * 
     * @return iCall_Frequency_days
     */
    public java.lang.String getICall_Frequency_days() {
        return iCall_Frequency_days;
    }


    /**
     * Sets the iCall_Frequency_days value for this Contact.
     * 
     * @param iCall_Frequency_days
     */
    public void setICall_Frequency_days(java.lang.String iCall_Frequency_days) {
        this.iCall_Frequency_days = iCall_Frequency_days;
    }


    /**
     * Gets the plCustomer_Tier value for this Contact.
     * 
     * @return plCustomer_Tier
     */
    public java.lang.String getPlCustomer_Tier() {
        return plCustomer_Tier;
    }


    /**
     * Sets the plCustomer_Tier value for this Contact.
     * 
     * @param plCustomer_Tier
     */
    public void setPlCustomer_Tier(java.lang.String plCustomer_Tier) {
        this.plCustomer_Tier = plCustomer_Tier;
    }


    /**
     * Gets the plCustomer_Segment value for this Contact.
     * 
     * @return plCustomer_Segment
     */
    public java.lang.String getPlCustomer_Segment() {
        return plCustomer_Segment;
    }


    /**
     * Sets the plCustomer_Segment value for this Contact.
     * 
     * @param plCustomer_Segment
     */
    public void setPlCustomer_Segment(java.lang.String plCustomer_Segment) {
        this.plCustomer_Segment = plCustomer_Segment;
    }


    /**
     * Gets the taxBracket value for this Contact.
     * 
     * @return taxBracket
     */
    public java.lang.String getTaxBracket() {
        return taxBracket;
    }


    /**
     * Sets the taxBracket value for this Contact.
     * 
     * @param taxBracket
     */
    public void setTaxBracket(java.lang.String taxBracket) {
        this.taxBracket = taxBracket;
    }


    /**
     * Gets the stLast_Survey_Outcome value for this Contact.
     * 
     * @return stLast_Survey_Outcome
     */
    public java.lang.String getStLast_Survey_Outcome() {
        return stLast_Survey_Outcome;
    }


    /**
     * Sets the stLast_Survey_Outcome value for this Contact.
     * 
     * @param stLast_Survey_Outcome
     */
    public void setStLast_Survey_Outcome(java.lang.String stLast_Survey_Outcome) {
        this.stLast_Survey_Outcome = stLast_Survey_Outcome;
    }


    /**
     * Gets the stReferenceable value for this Contact.
     * 
     * @return stReferenceable
     */
    public java.lang.String getStReferenceable() {
        return stReferenceable;
    }


    /**
     * Sets the stReferenceable value for this Contact.
     * 
     * @param stReferenceable
     */
    public void setStReferenceable(java.lang.String stReferenceable) {
        this.stReferenceable = stReferenceable;
    }


    /**
     * Gets the stLikely_to_Recommend value for this Contact.
     * 
     * @return stLikely_to_Recommend
     */
    public java.lang.String getStLikely_to_Recommend() {
        return stLikely_to_Recommend;
    }


    /**
     * Sets the stLikely_to_Recommend value for this Contact.
     * 
     * @param stLikely_to_Recommend
     */
    public void setStLikely_to_Recommend(java.lang.String stLikely_to_Recommend) {
        this.stLikely_to_Recommend = stLikely_to_Recommend;
    }


    /**
     * Gets the accountFuriganaName value for this Contact.
     * 
     * @return accountFuriganaName
     */
    public java.lang.String getAccountFuriganaName() {
        return accountFuriganaName;
    }


    /**
     * Sets the accountFuriganaName value for this Contact.
     * 
     * @param accountFuriganaName
     */
    public void setAccountFuriganaName(java.lang.String accountFuriganaName) {
        this.accountFuriganaName = accountFuriganaName;
    }


    /**
     * Gets the furiganaFirstName value for this Contact.
     * 
     * @return furiganaFirstName
     */
    public java.lang.String getFuriganaFirstName() {
        return furiganaFirstName;
    }


    /**
     * Sets the furiganaFirstName value for this Contact.
     * 
     * @param furiganaFirstName
     */
    public void setFuriganaFirstName(java.lang.String furiganaFirstName) {
        this.furiganaFirstName = furiganaFirstName;
    }


    /**
     * Gets the furiganaLastName value for this Contact.
     * 
     * @return furiganaLastName
     */
    public java.lang.String getFuriganaLastName() {
        return furiganaLastName;
    }


    /**
     * Sets the furiganaLastName value for this Contact.
     * 
     * @param furiganaLastName
     */
    public void setFuriganaLastName(java.lang.String furiganaLastName) {
        this.furiganaLastName = furiganaLastName;
    }


    /**
     * Gets the sourceCampaignId value for this Contact.
     * 
     * @return sourceCampaignId
     */
    public java.lang.String getSourceCampaignId() {
        return sourceCampaignId;
    }


    /**
     * Sets the sourceCampaignId value for this Contact.
     * 
     * @param sourceCampaignId
     */
    public void setSourceCampaignId(java.lang.String sourceCampaignId) {
        this.sourceCampaignId = sourceCampaignId;
    }


    /**
     * Gets the sourceCampaignName value for this Contact.
     * 
     * @return sourceCampaignName
     */
    public java.lang.String getSourceCampaignName() {
        return sourceCampaignName;
    }


    /**
     * Sets the sourceCampaignName value for this Contact.
     * 
     * @param sourceCampaignName
     */
    public void setSourceCampaignName(java.lang.String sourceCampaignName) {
        this.sourceCampaignName = sourceCampaignName;
    }


    /**
     * Gets the territoryId value for this Contact.
     * 
     * @return territoryId
     */
    public java.lang.String getTerritoryId() {
        return territoryId;
    }


    /**
     * Sets the territoryId value for this Contact.
     * 
     * @param territoryId
     */
    public void setTerritoryId(java.lang.String territoryId) {
        this.territoryId = territoryId;
    }


    /**
     * Gets the createdBy value for this Contact.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Contact.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the bestTimeToCall value for this Contact.
     * 
     * @return bestTimeToCall
     */
    public java.lang.String getBestTimeToCall() {
        return bestTimeToCall;
    }


    /**
     * Sets the bestTimeToCall value for this Contact.
     * 
     * @param bestTimeToCall
     */
    public void setBestTimeToCall(java.lang.String bestTimeToCall) {
        this.bestTimeToCall = bestTimeToCall;
    }


    /**
     * Gets the callFrequency value for this Contact.
     * 
     * @return callFrequency
     */
    public java.lang.String getCallFrequency() {
        return callFrequency;
    }


    /**
     * Sets the callFrequency value for this Contact.
     * 
     * @param callFrequency
     */
    public void setCallFrequency(java.lang.String callFrequency) {
        this.callFrequency = callFrequency;
    }


    /**
     * Gets the creditScore value for this Contact.
     * 
     * @return creditScore
     */
    public java.lang.String getCreditScore() {
        return creditScore;
    }


    /**
     * Sets the creditScore value for this Contact.
     * 
     * @param creditScore
     */
    public void setCreditScore(java.lang.String creditScore) {
        this.creditScore = creditScore;
    }


    /**
     * Gets the currentInvestmentMix value for this Contact.
     * 
     * @return currentInvestmentMix
     */
    public java.lang.String getCurrentInvestmentMix() {
        return currentInvestmentMix;
    }


    /**
     * Sets the currentInvestmentMix value for this Contact.
     * 
     * @param currentInvestmentMix
     */
    public void setCurrentInvestmentMix(java.lang.String currentInvestmentMix) {
        this.currentInvestmentMix = currentInvestmentMix;
    }


    /**
     * Gets the customerId value for this Contact.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Contact.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the tier value for this Contact.
     * 
     * @return tier
     */
    public java.lang.String getTier() {
        return tier;
    }


    /**
     * Sets the tier value for this Contact.
     * 
     * @param tier
     */
    public void setTier(java.lang.String tier) {
        this.tier = tier;
    }


    /**
     * Gets the dateofBirth value for this Contact.
     * 
     * @return dateofBirth
     */
    public java.lang.String getDateofBirth() {
        return dateofBirth;
    }


    /**
     * Sets the dateofBirth value for this Contact.
     * 
     * @param dateofBirth
     */
    public void setDateofBirth(java.lang.String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }


    /**
     * Gets the degree value for this Contact.
     * 
     * @return degree
     */
    public java.lang.String getDegree() {
        return degree;
    }


    /**
     * Sets the degree value for this Contact.
     * 
     * @param degree
     */
    public void setDegree(java.lang.String degree) {
        this.degree = degree;
    }


    /**
     * Gets the experienceLevel value for this Contact.
     * 
     * @return experienceLevel
     */
    public java.lang.String getExperienceLevel() {
        return experienceLevel;
    }


    /**
     * Sets the experienceLevel value for this Contact.
     * 
     * @param experienceLevel
     */
    public void setExperienceLevel(java.lang.String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }


    /**
     * Gets the homePhone value for this Contact.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Contact.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the totalIncome value for this Contact.
     * 
     * @return totalIncome
     */
    public java.lang.String getTotalIncome() {
        return totalIncome;
    }


    /**
     * Sets the totalIncome value for this Contact.
     * 
     * @param totalIncome
     */
    public void setTotalIncome(java.lang.String totalIncome) {
        this.totalIncome = totalIncome;
    }


    /**
     * Gets the investmentHorizon value for this Contact.
     * 
     * @return investmentHorizon
     */
    public java.lang.String getInvestmentHorizon() {
        return investmentHorizon;
    }


    /**
     * Sets the investmentHorizon value for this Contact.
     * 
     * @param investmentHorizon
     */
    public void setInvestmentHorizon(java.lang.String investmentHorizon) {
        this.investmentHorizon = investmentHorizon;
    }


    /**
     * Gets the lastCallDate value for this Contact.
     * 
     * @return lastCallDate
     */
    public java.lang.String getLastCallDate() {
        return lastCallDate;
    }


    /**
     * Sets the lastCallDate value for this Contact.
     * 
     * @param lastCallDate
     */
    public void setLastCallDate(java.lang.String lastCallDate) {
        this.lastCallDate = lastCallDate;
    }


    /**
     * Gets the gender value for this Contact.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Contact.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the maritalStatus value for this Contact.
     * 
     * @return maritalStatus
     */
    public java.lang.String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Contact.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the marketPotential value for this Contact.
     * 
     * @return marketPotential
     */
    public java.lang.String getMarketPotential() {
        return marketPotential;
    }


    /**
     * Sets the marketPotential value for this Contact.
     * 
     * @param marketPotential
     */
    public void setMarketPotential(java.lang.String marketPotential) {
        this.marketPotential = marketPotential;
    }


    /**
     * Gets the objective value for this Contact.
     * 
     * @return objective
     */
    public java.lang.String getObjective() {
        return objective;
    }


    /**
     * Sets the objective value for this Contact.
     * 
     * @param objective
     */
    public void setObjective(java.lang.String objective) {
        this.objective = objective;
    }


    /**
     * Gets the ownorRent value for this Contact.
     * 
     * @return ownorRent
     */
    public java.lang.String getOwnorRent() {
        return ownorRent;
    }


    /**
     * Sets the ownorRent value for this Contact.
     * 
     * @param ownorRent
     */
    public void setOwnorRent(java.lang.String ownorRent) {
        this.ownorRent = ownorRent;
    }


    /**
     * Gets the primaryGoal value for this Contact.
     * 
     * @return primaryGoal
     */
    public java.lang.String getPrimaryGoal() {
        return primaryGoal;
    }


    /**
     * Sets the primaryGoal value for this Contact.
     * 
     * @param primaryGoal
     */
    public void setPrimaryGoal(java.lang.String primaryGoal) {
        this.primaryGoal = primaryGoal;
    }


    /**
     * Gets the homeValue value for this Contact.
     * 
     * @return homeValue
     */
    public java.lang.String getHomeValue() {
        return homeValue;
    }


    /**
     * Sets the homeValue value for this Contact.
     * 
     * @param homeValue
     */
    public void setHomeValue(java.lang.String homeValue) {
        this.homeValue = homeValue;
    }


    /**
     * Gets the riskProfile value for this Contact.
     * 
     * @return riskProfile
     */
    public java.lang.String getRiskProfile() {
        return riskProfile;
    }


    /**
     * Sets the riskProfile value for this Contact.
     * 
     * @param riskProfile
     */
    public void setRiskProfile(java.lang.String riskProfile) {
        this.riskProfile = riskProfile;
    }


    /**
     * Gets the route value for this Contact.
     * 
     * @return route
     */
    public java.lang.String getRoute() {
        return route;
    }


    /**
     * Sets the route value for this Contact.
     * 
     * @param route
     */
    public void setRoute(java.lang.String route) {
        this.route = route;
    }


    /**
     * Gets the segment value for this Contact.
     * 
     * @return segment
     */
    public java.lang.String getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this Contact.
     * 
     * @param segment
     */
    public void setSegment(java.lang.String segment) {
        this.segment = segment;
    }


    /**
     * Gets the selfEmployed value for this Contact.
     * 
     * @return selfEmployed
     */
    public java.lang.String getSelfEmployed() {
        return selfEmployed;
    }


    /**
     * Sets the selfEmployed value for this Contact.
     * 
     * @param selfEmployed
     */
    public void setSelfEmployed(java.lang.String selfEmployed) {
        this.selfEmployed = selfEmployed;
    }


    /**
     * Gets the totalAssets value for this Contact.
     * 
     * @return totalAssets
     */
    public java.lang.String getTotalAssets() {
        return totalAssets;
    }


    /**
     * Sets the totalAssets value for this Contact.
     * 
     * @param totalAssets
     */
    public void setTotalAssets(java.lang.String totalAssets) {
        this.totalAssets = totalAssets;
    }


    /**
     * Gets the totalExpenses value for this Contact.
     * 
     * @return totalExpenses
     */
    public java.lang.String getTotalExpenses() {
        return totalExpenses;
    }


    /**
     * Sets the totalExpenses value for this Contact.
     * 
     * @param totalExpenses
     */
    public void setTotalExpenses(java.lang.String totalExpenses) {
        this.totalExpenses = totalExpenses;
    }


    /**
     * Gets the totalLiabilities value for this Contact.
     * 
     * @return totalLiabilities
     */
    public java.lang.String getTotalLiabilities() {
        return totalLiabilities;
    }


    /**
     * Sets the totalLiabilities value for this Contact.
     * 
     * @param totalLiabilities
     */
    public void setTotalLiabilities(java.lang.String totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }


    /**
     * Gets the totalNetWorth value for this Contact.
     * 
     * @return totalNetWorth
     */
    public java.lang.String getTotalNetWorth() {
        return totalNetWorth;
    }


    /**
     * Sets the totalNetWorth value for this Contact.
     * 
     * @param totalNetWorth
     */
    public void setTotalNetWorth(java.lang.String totalNetWorth) {
        this.totalNetWorth = totalNetWorth;
    }


    /**
     * Gets the YTDSales value for this Contact.
     * 
     * @return YTDSales
     */
    public java.lang.String getYTDSales() {
        return YTDSales;
    }


    /**
     * Sets the YTDSales value for this Contact.
     * 
     * @param YTDSales
     */
    public void setYTDSales(java.lang.String YTDSales) {
        this.YTDSales = YTDSales;
    }


    /**
     * Gets the ownerEmailAddress value for this Contact.
     * 
     * @return ownerEmailAddress
     */
    public java.lang.String getOwnerEmailAddress() {
        return ownerEmailAddress;
    }


    /**
     * Sets the ownerEmailAddress value for this Contact.
     * 
     * @param ownerEmailAddress
     */
    public void setOwnerEmailAddress(java.lang.String ownerEmailAddress) {
        this.ownerEmailAddress = ownerEmailAddress;
    }


    /**
     * Gets the PIMCompanyName value for this Contact.
     * 
     * @return PIMCompanyName
     */
    public java.lang.String getPIMCompanyName() {
        return PIMCompanyName;
    }


    /**
     * Sets the PIMCompanyName value for this Contact.
     * 
     * @param PIMCompanyName
     */
    public void setPIMCompanyName(java.lang.String PIMCompanyName) {
        this.PIMCompanyName = PIMCompanyName;
    }


    /**
     * Gets the managerExternalSystemId value for this Contact.
     * 
     * @return managerExternalSystemId
     */
    public java.lang.String getManagerExternalSystemId() {
        return managerExternalSystemId;
    }


    /**
     * Sets the managerExternalSystemId value for this Contact.
     * 
     * @param managerExternalSystemId
     */
    public void setManagerExternalSystemId(java.lang.String managerExternalSystemId) {
        this.managerExternalSystemId = managerExternalSystemId;
    }


    /**
     * Gets the optIn value for this Contact.
     * 
     * @return optIn
     */
    public java.lang.String getOptIn() {
        return optIn;
    }


    /**
     * Sets the optIn value for this Contact.
     * 
     * @param optIn
     */
    public void setOptIn(java.lang.String optIn) {
        this.optIn = optIn;
    }


    /**
     * Gets the optOut value for this Contact.
     * 
     * @return optOut
     */
    public java.lang.String getOptOut() {
        return optOut;
    }


    /**
     * Sets the optOut value for this Contact.
     * 
     * @param optOut
     */
    public void setOptOut(java.lang.String optOut) {
        this.optOut = optOut;
    }


    /**
     * Gets the lifeEvent value for this Contact.
     * 
     * @return lifeEvent
     */
    public java.lang.String getLifeEvent() {
        return lifeEvent;
    }


    /**
     * Sets the lifeEvent value for this Contact.
     * 
     * @param lifeEvent
     */
    public void setLifeEvent(java.lang.String lifeEvent) {
        this.lifeEvent = lifeEvent;
    }


    /**
     * Gets the customObject1ExternalSystemId value for this Contact.
     * 
     * @return customObject1ExternalSystemId
     */
    public java.lang.String getCustomObject1ExternalSystemId() {
        return customObject1ExternalSystemId;
    }


    /**
     * Sets the customObject1ExternalSystemId value for this Contact.
     * 
     * @param customObject1ExternalSystemId
     */
    public void setCustomObject1ExternalSystemId(java.lang.String customObject1ExternalSystemId) {
        this.customObject1ExternalSystemId = customObject1ExternalSystemId;
    }


    /**
     * Gets the customObject1Name value for this Contact.
     * 
     * @return customObject1Name
     */
    public java.lang.String getCustomObject1Name() {
        return customObject1Name;
    }


    /**
     * Sets the customObject1Name value for this Contact.
     * 
     * @param customObject1Name
     */
    public void setCustomObject1Name(java.lang.String customObject1Name) {
        this.customObject1Name = customObject1Name;
    }


    /**
     * Gets the customObject1Id value for this Contact.
     * 
     * @return customObject1Id
     */
    public java.lang.String getCustomObject1Id() {
        return customObject1Id;
    }


    /**
     * Sets the customObject1Id value for this Contact.
     * 
     * @param customObject1Id
     */
    public void setCustomObject1Id(java.lang.String customObject1Id) {
        this.customObject1Id = customObject1Id;
    }


    /**
     * Gets the assessmentFilter4 value for this Contact.
     * 
     * @return assessmentFilter4
     */
    public java.lang.String getAssessmentFilter4() {
        return assessmentFilter4;
    }


    /**
     * Sets the assessmentFilter4 value for this Contact.
     * 
     * @param assessmentFilter4
     */
    public void setAssessmentFilter4(java.lang.String assessmentFilter4) {
        this.assessmentFilter4 = assessmentFilter4;
    }


    /**
     * Gets the assessmentFilter3 value for this Contact.
     * 
     * @return assessmentFilter3
     */
    public java.lang.String getAssessmentFilter3() {
        return assessmentFilter3;
    }


    /**
     * Sets the assessmentFilter3 value for this Contact.
     * 
     * @param assessmentFilter3
     */
    public void setAssessmentFilter3(java.lang.String assessmentFilter3) {
        this.assessmentFilter3 = assessmentFilter3;
    }


    /**
     * Gets the assessmentFilter2 value for this Contact.
     * 
     * @return assessmentFilter2
     */
    public java.lang.String getAssessmentFilter2() {
        return assessmentFilter2;
    }


    /**
     * Sets the assessmentFilter2 value for this Contact.
     * 
     * @param assessmentFilter2
     */
    public void setAssessmentFilter2(java.lang.String assessmentFilter2) {
        this.assessmentFilter2 = assessmentFilter2;
    }


    /**
     * Gets the assessmentFilter1 value for this Contact.
     * 
     * @return assessmentFilter1
     */
    public java.lang.String getAssessmentFilter1() {
        return assessmentFilter1;
    }


    /**
     * Sets the assessmentFilter1 value for this Contact.
     * 
     * @param assessmentFilter1
     */
    public void setAssessmentFilter1(java.lang.String assessmentFilter1) {
        this.assessmentFilter1 = assessmentFilter1;
    }


    /**
     * Gets the customObject2ExternalSystemId value for this Contact.
     * 
     * @return customObject2ExternalSystemId
     */
    public java.lang.String getCustomObject2ExternalSystemId() {
        return customObject2ExternalSystemId;
    }


    /**
     * Sets the customObject2ExternalSystemId value for this Contact.
     * 
     * @param customObject2ExternalSystemId
     */
    public void setCustomObject2ExternalSystemId(java.lang.String customObject2ExternalSystemId) {
        this.customObject2ExternalSystemId = customObject2ExternalSystemId;
    }


    /**
     * Gets the customObject2Id value for this Contact.
     * 
     * @return customObject2Id
     */
    public java.lang.String getCustomObject2Id() {
        return customObject2Id;
    }


    /**
     * Sets the customObject2Id value for this Contact.
     * 
     * @param customObject2Id
     */
    public void setCustomObject2Id(java.lang.String customObject2Id) {
        this.customObject2Id = customObject2Id;
    }


    /**
     * Gets the customObject2Name value for this Contact.
     * 
     * @return customObject2Name
     */
    public java.lang.String getCustomObject2Name() {
        return customObject2Name;
    }


    /**
     * Sets the customObject2Name value for this Contact.
     * 
     * @param customObject2Name
     */
    public void setCustomObject2Name(java.lang.String customObject2Name) {
        this.customObject2Name = customObject2Name;
    }


    /**
     * Gets the customObject3ExternalSystemId value for this Contact.
     * 
     * @return customObject3ExternalSystemId
     */
    public java.lang.String getCustomObject3ExternalSystemId() {
        return customObject3ExternalSystemId;
    }


    /**
     * Sets the customObject3ExternalSystemId value for this Contact.
     * 
     * @param customObject3ExternalSystemId
     */
    public void setCustomObject3ExternalSystemId(java.lang.String customObject3ExternalSystemId) {
        this.customObject3ExternalSystemId = customObject3ExternalSystemId;
    }


    /**
     * Gets the age value for this Contact.
     * 
     * @return age
     */
    public java.lang.String getAge() {
        return age;
    }


    /**
     * Sets the age value for this Contact.
     * 
     * @param age
     */
    public void setAge(java.lang.String age) {
        this.age = age;
    }


    /**
     * Gets the customObject3Id value for this Contact.
     * 
     * @return customObject3Id
     */
    public java.lang.String getCustomObject3Id() {
        return customObject3Id;
    }


    /**
     * Sets the customObject3Id value for this Contact.
     * 
     * @param customObject3Id
     */
    public void setCustomObject3Id(java.lang.String customObject3Id) {
        this.customObject3Id = customObject3Id;
    }


    /**
     * Gets the createdbyEmailAddress value for this Contact.
     * 
     * @return createdbyEmailAddress
     */
    public java.lang.String getCreatedbyEmailAddress() {
        return createdbyEmailAddress;
    }


    /**
     * Sets the createdbyEmailAddress value for this Contact.
     * 
     * @param createdbyEmailAddress
     */
    public void setCreatedbyEmailAddress(java.lang.String createdbyEmailAddress) {
        this.createdbyEmailAddress = createdbyEmailAddress;
    }


    /**
     * Gets the lastAssessmentDate value for this Contact.
     * 
     * @return lastAssessmentDate
     */
    public java.lang.String getLastAssessmentDate() {
        return lastAssessmentDate;
    }


    /**
     * Sets the lastAssessmentDate value for this Contact.
     * 
     * @param lastAssessmentDate
     */
    public void setLastAssessmentDate(java.lang.String lastAssessmentDate) {
        this.lastAssessmentDate = lastAssessmentDate;
    }


    /**
     * Gets the lastUpdated value for this Contact.
     * 
     * @return lastUpdated
     */
    public java.lang.String getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this Contact.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.lang.String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the createdById value for this Contact.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Contact.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the modifiedbyEmailAddress value for this Contact.
     * 
     * @return modifiedbyEmailAddress
     */
    public java.lang.String getModifiedbyEmailAddress() {
        return modifiedbyEmailAddress;
    }


    /**
     * Sets the modifiedbyEmailAddress value for this Contact.
     * 
     * @param modifiedbyEmailAddress
     */
    public void setModifiedbyEmailAddress(java.lang.String modifiedbyEmailAddress) {
        this.modifiedbyEmailAddress = modifiedbyEmailAddress;
    }


    /**
     * Gets the ownerExternalSystemId value for this Contact.
     * 
     * @return ownerExternalSystemId
     */
    public java.lang.String getOwnerExternalSystemId() {
        return ownerExternalSystemId;
    }


    /**
     * Sets the ownerExternalSystemId value for this Contact.
     * 
     * @param ownerExternalSystemId
     */
    public void setOwnerExternalSystemId(java.lang.String ownerExternalSystemId) {
        this.ownerExternalSystemId = ownerExternalSystemId;
    }


    /**
     * Gets the primaryGroup value for this Contact.
     * 
     * @return primaryGroup
     */
    public java.lang.String getPrimaryGroup() {
        return primaryGroup;
    }


    /**
     * Sets the primaryGroup value for this Contact.
     * 
     * @param primaryGroup
     */
    public void setPrimaryGroup(java.lang.String primaryGroup) {
        this.primaryGroup = primaryGroup;
    }


    /**
     * Gets the accountExternalSystemId value for this Contact.
     * 
     * @return accountExternalSystemId
     */
    public java.lang.String getAccountExternalSystemId() {
        return accountExternalSystemId;
    }


    /**
     * Sets the accountExternalSystemId value for this Contact.
     * 
     * @param accountExternalSystemId
     */
    public void setAccountExternalSystemId(java.lang.String accountExternalSystemId) {
        this.accountExternalSystemId = accountExternalSystemId;
    }


    /**
     * Gets the contactRole value for this Contact.
     * 
     * @return contactRole
     */
    public java.lang.String getContactRole() {
        return contactRole;
    }


    /**
     * Sets the contactRole value for this Contact.
     * 
     * @param contactRole
     */
    public void setContactRole(java.lang.String contactRole) {
        this.contactRole = contactRole;
    }


    /**
     * Gets the customObject3Name value for this Contact.
     * 
     * @return customObject3Name
     */
    public java.lang.String getCustomObject3Name() {
        return customObject3Name;
    }


    /**
     * Sets the customObject3Name value for this Contact.
     * 
     * @param customObject3Name
     */
    public void setCustomObject3Name(java.lang.String customObject3Name) {
        this.customObject3Name = customObject3Name;
    }


    /**
     * Gets the occamTerritory value for this Contact.
     * 
     * @return occamTerritory
     */
    public java.lang.String getOccamTerritory() {
        return occamTerritory;
    }


    /**
     * Sets the occamTerritory value for this Contact.
     * 
     * @param occamTerritory
     */
    public void setOccamTerritory(java.lang.String occamTerritory) {
        this.occamTerritory = occamTerritory;
    }


    /**
     * Gets the accountName value for this Contact.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this Contact.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the currencyCode value for this Contact.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Contact.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the accountLocation value for this Contact.
     * 
     * @return accountLocation
     */
    public java.lang.String getAccountLocation() {
        return accountLocation;
    }


    /**
     * Sets the accountLocation value for this Contact.
     * 
     * @param accountLocation
     */
    public void setAccountLocation(java.lang.String accountLocation) {
        this.accountLocation = accountLocation;
    }


    /**
     * Gets the primaryCounty value for this Contact.
     * 
     * @return primaryCounty
     */
    public java.lang.String getPrimaryCounty() {
        return primaryCounty;
    }


    /**
     * Sets the primaryCounty value for this Contact.
     * 
     * @param primaryCounty
     */
    public void setPrimaryCounty(java.lang.String primaryCounty) {
        this.primaryCounty = primaryCounty;
    }


    /**
     * Gets the primaryProvince value for this Contact.
     * 
     * @return primaryProvince
     */
    public java.lang.String getPrimaryProvince() {
        return primaryProvince;
    }


    /**
     * Sets the primaryProvince value for this Contact.
     * 
     * @param primaryProvince
     */
    public void setPrimaryProvince(java.lang.String primaryProvince) {
        this.primaryProvince = primaryProvince;
    }


    /**
     * Gets the primaryStreetAddress2 value for this Contact.
     * 
     * @return primaryStreetAddress2
     */
    public java.lang.String getPrimaryStreetAddress2() {
        return primaryStreetAddress2;
    }


    /**
     * Sets the primaryStreetAddress2 value for this Contact.
     * 
     * @param primaryStreetAddress2
     */
    public void setPrimaryStreetAddress2(java.lang.String primaryStreetAddress2) {
        this.primaryStreetAddress2 = primaryStreetAddress2;
    }


    /**
     * Gets the primaryStreetAddress3 value for this Contact.
     * 
     * @return primaryStreetAddress3
     */
    public java.lang.String getPrimaryStreetAddress3() {
        return primaryStreetAddress3;
    }


    /**
     * Sets the primaryStreetAddress3 value for this Contact.
     * 
     * @param primaryStreetAddress3
     */
    public void setPrimaryStreetAddress3(java.lang.String primaryStreetAddress3) {
        this.primaryStreetAddress3 = primaryStreetAddress3;
    }


    /**
     * Gets the indexedBoolean0 value for this Contact.
     * 
     * @return indexedBoolean0
     */
    public java.lang.String getIndexedBoolean0() {
        return indexedBoolean0;
    }


    /**
     * Sets the indexedBoolean0 value for this Contact.
     * 
     * @param indexedBoolean0
     */
    public void setIndexedBoolean0(java.lang.String indexedBoolean0) {
        this.indexedBoolean0 = indexedBoolean0;
    }


    /**
     * Gets the indexedCurrency0 value for this Contact.
     * 
     * @return indexedCurrency0
     */
    public java.lang.String getIndexedCurrency0() {
        return indexedCurrency0;
    }


    /**
     * Sets the indexedCurrency0 value for this Contact.
     * 
     * @param indexedCurrency0
     */
    public void setIndexedCurrency0(java.lang.String indexedCurrency0) {
        this.indexedCurrency0 = indexedCurrency0;
    }


    /**
     * Gets the indexedDate0 value for this Contact.
     * 
     * @return indexedDate0
     */
    public java.lang.String getIndexedDate0() {
        return indexedDate0;
    }


    /**
     * Sets the indexedDate0 value for this Contact.
     * 
     * @param indexedDate0
     */
    public void setIndexedDate0(java.lang.String indexedDate0) {
        this.indexedDate0 = indexedDate0;
    }


    /**
     * Gets the indexedLongText0 value for this Contact.
     * 
     * @return indexedLongText0
     */
    public java.lang.String getIndexedLongText0() {
        return indexedLongText0;
    }


    /**
     * Sets the indexedLongText0 value for this Contact.
     * 
     * @param indexedLongText0
     */
    public void setIndexedLongText0(java.lang.String indexedLongText0) {
        this.indexedLongText0 = indexedLongText0;
    }


    /**
     * Gets the indexedNumber0 value for this Contact.
     * 
     * @return indexedNumber0
     */
    public java.lang.String getIndexedNumber0() {
        return indexedNumber0;
    }


    /**
     * Sets the indexedNumber0 value for this Contact.
     * 
     * @param indexedNumber0
     */
    public void setIndexedNumber0(java.lang.String indexedNumber0) {
        this.indexedNumber0 = indexedNumber0;
    }


    /**
     * Gets the indexedPick0 value for this Contact.
     * 
     * @return indexedPick0
     */
    public java.lang.String getIndexedPick0() {
        return indexedPick0;
    }


    /**
     * Sets the indexedPick0 value for this Contact.
     * 
     * @param indexedPick0
     */
    public void setIndexedPick0(java.lang.String indexedPick0) {
        this.indexedPick0 = indexedPick0;
    }


    /**
     * Gets the indexedPick1 value for this Contact.
     * 
     * @return indexedPick1
     */
    public java.lang.String getIndexedPick1() {
        return indexedPick1;
    }


    /**
     * Sets the indexedPick1 value for this Contact.
     * 
     * @param indexedPick1
     */
    public void setIndexedPick1(java.lang.String indexedPick1) {
        this.indexedPick1 = indexedPick1;
    }


    /**
     * Gets the indexedPick2 value for this Contact.
     * 
     * @return indexedPick2
     */
    public java.lang.String getIndexedPick2() {
        return indexedPick2;
    }


    /**
     * Sets the indexedPick2 value for this Contact.
     * 
     * @param indexedPick2
     */
    public void setIndexedPick2(java.lang.String indexedPick2) {
        this.indexedPick2 = indexedPick2;
    }


    /**
     * Gets the indexedPick3 value for this Contact.
     * 
     * @return indexedPick3
     */
    public java.lang.String getIndexedPick3() {
        return indexedPick3;
    }


    /**
     * Sets the indexedPick3 value for this Contact.
     * 
     * @param indexedPick3
     */
    public void setIndexedPick3(java.lang.String indexedPick3) {
        this.indexedPick3 = indexedPick3;
    }


    /**
     * Gets the indexedPick4 value for this Contact.
     * 
     * @return indexedPick4
     */
    public java.lang.String getIndexedPick4() {
        return indexedPick4;
    }


    /**
     * Sets the indexedPick4 value for this Contact.
     * 
     * @param indexedPick4
     */
    public void setIndexedPick4(java.lang.String indexedPick4) {
        this.indexedPick4 = indexedPick4;
    }


    /**
     * Gets the indexedPick5 value for this Contact.
     * 
     * @return indexedPick5
     */
    public java.lang.String getIndexedPick5() {
        return indexedPick5;
    }


    /**
     * Sets the indexedPick5 value for this Contact.
     * 
     * @param indexedPick5
     */
    public void setIndexedPick5(java.lang.String indexedPick5) {
        this.indexedPick5 = indexedPick5;
    }


    /**
     * Gets the indexedShortText0 value for this Contact.
     * 
     * @return indexedShortText0
     */
    public java.lang.String getIndexedShortText0() {
        return indexedShortText0;
    }


    /**
     * Sets the indexedShortText0 value for this Contact.
     * 
     * @param indexedShortText0
     */
    public void setIndexedShortText0(java.lang.String indexedShortText0) {
        this.indexedShortText0 = indexedShortText0;
    }


    /**
     * Gets the indexedShortText1 value for this Contact.
     * 
     * @return indexedShortText1
     */
    public java.lang.String getIndexedShortText1() {
        return indexedShortText1;
    }


    /**
     * Sets the indexedShortText1 value for this Contact.
     * 
     * @param indexedShortText1
     */
    public void setIndexedShortText1(java.lang.String indexedShortText1) {
        this.indexedShortText1 = indexedShortText1;
    }


    /**
     * Gets the alternateCounty value for this Contact.
     * 
     * @return alternateCounty
     */
    public java.lang.String getAlternateCounty() {
        return alternateCounty;
    }


    /**
     * Sets the alternateCounty value for this Contact.
     * 
     * @param alternateCounty
     */
    public void setAlternateCounty(java.lang.String alternateCounty) {
        this.alternateCounty = alternateCounty;
    }


    /**
     * Gets the alternateCity value for this Contact.
     * 
     * @return alternateCity
     */
    public java.lang.String getAlternateCity() {
        return alternateCity;
    }


    /**
     * Sets the alternateCity value for this Contact.
     * 
     * @param alternateCity
     */
    public void setAlternateCity(java.lang.String alternateCity) {
        this.alternateCity = alternateCity;
    }


    /**
     * Gets the alternateCountry value for this Contact.
     * 
     * @return alternateCountry
     */
    public java.lang.String getAlternateCountry() {
        return alternateCountry;
    }


    /**
     * Sets the alternateCountry value for this Contact.
     * 
     * @param alternateCountry
     */
    public void setAlternateCountry(java.lang.String alternateCountry) {
        this.alternateCountry = alternateCountry;
    }


    /**
     * Gets the alternateZipCode value for this Contact.
     * 
     * @return alternateZipCode
     */
    public java.lang.String getAlternateZipCode() {
        return alternateZipCode;
    }


    /**
     * Sets the alternateZipCode value for this Contact.
     * 
     * @param alternateZipCode
     */
    public void setAlternateZipCode(java.lang.String alternateZipCode) {
        this.alternateZipCode = alternateZipCode;
    }


    /**
     * Gets the alternateStateProvince value for this Contact.
     * 
     * @return alternateStateProvince
     */
    public java.lang.String getAlternateStateProvince() {
        return alternateStateProvince;
    }


    /**
     * Sets the alternateStateProvince value for this Contact.
     * 
     * @param alternateStateProvince
     */
    public void setAlternateStateProvince(java.lang.String alternateStateProvince) {
        this.alternateStateProvince = alternateStateProvince;
    }


    /**
     * Gets the alternateAddress1 value for this Contact.
     * 
     * @return alternateAddress1
     */
    public java.lang.String getAlternateAddress1() {
        return alternateAddress1;
    }


    /**
     * Sets the alternateAddress1 value for this Contact.
     * 
     * @param alternateAddress1
     */
    public void setAlternateAddress1(java.lang.String alternateAddress1) {
        this.alternateAddress1 = alternateAddress1;
    }


    /**
     * Gets the alternateAddress2 value for this Contact.
     * 
     * @return alternateAddress2
     */
    public java.lang.String getAlternateAddress2() {
        return alternateAddress2;
    }


    /**
     * Sets the alternateAddress2 value for this Contact.
     * 
     * @param alternateAddress2
     */
    public void setAlternateAddress2(java.lang.String alternateAddress2) {
        this.alternateAddress2 = alternateAddress2;
    }


    /**
     * Gets the alternateProvince value for this Contact.
     * 
     * @return alternateProvince
     */
    public java.lang.String getAlternateProvince() {
        return alternateProvince;
    }


    /**
     * Sets the alternateProvince value for this Contact.
     * 
     * @param alternateProvince
     */
    public void setAlternateProvince(java.lang.String alternateProvince) {
        this.alternateProvince = alternateProvince;
    }


    /**
     * Gets the alternateAddress3 value for this Contact.
     * 
     * @return alternateAddress3
     */
    public java.lang.String getAlternateAddress3() {
        return alternateAddress3;
    }


    /**
     * Sets the alternateAddress3 value for this Contact.
     * 
     * @param alternateAddress3
     */
    public void setAlternateAddress3(java.lang.String alternateAddress3) {
        this.alternateAddress3 = alternateAddress3;
    }


    /**
     * Gets the listOfActivity value for this Contact.
     * 
     * @return listOfActivity
     */
    public crmondemand.xml.contact.Activity[] getListOfActivity() {
        return listOfActivity;
    }


    /**
     * Sets the listOfActivity value for this Contact.
     * 
     * @param listOfActivity
     */
    public void setListOfActivity(crmondemand.xml.contact.Activity[] listOfActivity) {
        this.listOfActivity = listOfActivity;
    }


    /**
     * Gets the listOfContactTeam value for this Contact.
     * 
     * @return listOfContactTeam
     */
    public crmondemand.xml.contact.Team[] getListOfContactTeam() {
        return listOfContactTeam;
    }


    /**
     * Sets the listOfContactTeam value for this Contact.
     * 
     * @param listOfContactTeam
     */
    public void setListOfContactTeam(crmondemand.xml.contact.Team[] listOfContactTeam) {
        this.listOfContactTeam = listOfContactTeam;
    }


    /**
     * Gets the listOfRelatedContact value for this Contact.
     * 
     * @return listOfRelatedContact
     */
    public crmondemand.xml.contact.RelatedContact[] getListOfRelatedContact() {
        return listOfRelatedContact;
    }


    /**
     * Sets the listOfRelatedContact value for this Contact.
     * 
     * @param listOfRelatedContact
     */
    public void setListOfRelatedContact(crmondemand.xml.contact.RelatedContact[] listOfRelatedContact) {
        this.listOfRelatedContact = listOfRelatedContact;
    }


    /**
     * Gets the listOfAccount value for this Contact.
     * 
     * @return listOfAccount
     */
    public crmondemand.xml.contact.Account[] getListOfAccount() {
        return listOfAccount;
    }


    /**
     * Sets the listOfAccount value for this Contact.
     * 
     * @param listOfAccount
     */
    public void setListOfAccount(crmondemand.xml.contact.Account[] listOfAccount) {
        this.listOfAccount = listOfAccount;
    }


    /**
     * Gets the listOfNote value for this Contact.
     * 
     * @return listOfNote
     */
    public crmondemand.xml.contact.Note[] getListOfNote() {
        return listOfNote;
    }


    /**
     * Sets the listOfNote value for this Contact.
     * 
     * @param listOfNote
     */
    public void setListOfNote(crmondemand.xml.contact.Note[] listOfNote) {
        this.listOfNote = listOfNote;
    }


    /**
     * Gets the listOfLead value for this Contact.
     * 
     * @return listOfLead
     */
    public crmondemand.xml.contact.Lead[] getListOfLead() {
        return listOfLead;
    }


    /**
     * Sets the listOfLead value for this Contact.
     * 
     * @param listOfLead
     */
    public void setListOfLead(crmondemand.xml.contact.Lead[] listOfLead) {
        this.listOfLead = listOfLead;
    }


    /**
     * Gets the listOfOpportunity value for this Contact.
     * 
     * @return listOfOpportunity
     */
    public crmondemand.xml.contact.Opportunity[] getListOfOpportunity() {
        return listOfOpportunity;
    }


    /**
     * Sets the listOfOpportunity value for this Contact.
     * 
     * @param listOfOpportunity
     */
    public void setListOfOpportunity(crmondemand.xml.contact.Opportunity[] listOfOpportunity) {
        this.listOfOpportunity = listOfOpportunity;
    }


    /**
     * Gets the listOfAlternateAddress value for this Contact.
     * 
     * @return listOfAlternateAddress
     */
    public crmondemand.xml.contact.ListOfAlternateAddress getListOfAlternateAddress() {
        return listOfAlternateAddress;
    }


    /**
     * Sets the listOfAlternateAddress value for this Contact.
     * 
     * @param listOfAlternateAddress
     */
    public void setListOfAlternateAddress(crmondemand.xml.contact.ListOfAlternateAddress listOfAlternateAddress) {
        this.listOfAlternateAddress = listOfAlternateAddress;
    }


    /**
     * Gets the listOfServiceRequest value for this Contact.
     * 
     * @return listOfServiceRequest
     */
    public crmondemand.xml.contact.ServiceRequest[] getListOfServiceRequest() {
        return listOfServiceRequest;
    }


    /**
     * Sets the listOfServiceRequest value for this Contact.
     * 
     * @param listOfServiceRequest
     */
    public void setListOfServiceRequest(crmondemand.xml.contact.ServiceRequest[] listOfServiceRequest) {
        this.listOfServiceRequest = listOfServiceRequest;
    }


    /**
     * Gets the listOfAddress value for this Contact.
     * 
     * @return listOfAddress
     */
    public crmondemand.xml.contact.Address[] getListOfAddress() {
        return listOfAddress;
    }


    /**
     * Sets the listOfAddress value for this Contact.
     * 
     * @param listOfAddress
     */
    public void setListOfAddress(crmondemand.xml.contact.Address[] listOfAddress) {
        this.listOfAddress = listOfAddress;
    }


    /**
     * Gets the listOfRevenue value for this Contact.
     * 
     * @return listOfRevenue
     */
    public crmondemand.xml.contact.Revenue[] getListOfRevenue() {
        return listOfRevenue;
    }


    /**
     * Sets the listOfRevenue value for this Contact.
     * 
     * @param listOfRevenue
     */
    public void setListOfRevenue(crmondemand.xml.contact.Revenue[] listOfRevenue) {
        this.listOfRevenue = listOfRevenue;
    }


    /**
     * Gets the listOfAsset value for this Contact.
     * 
     * @return listOfAsset
     */
    public crmondemand.xml.contact.Asset[] getListOfAsset() {
        return listOfAsset;
    }


    /**
     * Sets the listOfAsset value for this Contact.
     * 
     * @param listOfAsset
     */
    public void setListOfAsset(crmondemand.xml.contact.Asset[] listOfAsset) {
        this.listOfAsset = listOfAsset;
    }


    /**
     * Gets the listOfInterests value for this Contact.
     * 
     * @return listOfInterests
     */
    public crmondemand.xml.contact.Interests[] getListOfInterests() {
        return listOfInterests;
    }


    /**
     * Sets the listOfInterests value for this Contact.
     * 
     * @param listOfInterests
     */
    public void setListOfInterests(crmondemand.xml.contact.Interests[] listOfInterests) {
        this.listOfInterests = listOfInterests;
    }


    /**
     * Gets the listOfCampaign value for this Contact.
     * 
     * @return listOfCampaign
     */
    public crmondemand.xml.contact.Campaign[] getListOfCampaign() {
        return listOfCampaign;
    }


    /**
     * Sets the listOfCampaign value for this Contact.
     * 
     * @param listOfCampaign
     */
    public void setListOfCampaign(crmondemand.xml.contact.Campaign[] listOfCampaign) {
        this.listOfCampaign = listOfCampaign;
    }


    /**
     * Gets the listOfCustomObject3 value for this Contact.
     * 
     * @return listOfCustomObject3
     */
    public crmondemand.xml.contact.CustomObject3[] getListOfCustomObject3() {
        return listOfCustomObject3;
    }


    /**
     * Sets the listOfCustomObject3 value for this Contact.
     * 
     * @param listOfCustomObject3
     */
    public void setListOfCustomObject3(crmondemand.xml.contact.CustomObject3[] listOfCustomObject3) {
        this.listOfCustomObject3 = listOfCustomObject3;
    }


    /**
     * Gets the listOfBook value for this Contact.
     * 
     * @return listOfBook
     */
    public crmondemand.xml.contact.Book[] getListOfBook() {
        return listOfBook;
    }


    /**
     * Sets the listOfBook value for this Contact.
     * 
     * @param listOfBook
     */
    public void setListOfBook(crmondemand.xml.contact.Book[] listOfBook) {
        this.listOfBook = listOfBook;
    }


    /**
     * Gets the listOfAttachment value for this Contact.
     * 
     * @return listOfAttachment
     */
    public crmondemand.xml.contact.Attachment[] getListOfAttachment() {
        return listOfAttachment;
    }


    /**
     * Sets the listOfAttachment value for this Contact.
     * 
     * @param listOfAttachment
     */
    public void setListOfAttachment(crmondemand.xml.contact.Attachment[] listOfAttachment) {
        this.listOfAttachment = listOfAttachment;
    }


    /**
     * Gets the listOfStateLicenses value for this Contact.
     * 
     * @return listOfStateLicenses
     */
    public crmondemand.xml.contact.StateLicenses[] getListOfStateLicenses() {
        return listOfStateLicenses;
    }


    /**
     * Sets the listOfStateLicenses value for this Contact.
     * 
     * @param listOfStateLicenses
     */
    public void setListOfStateLicenses(crmondemand.xml.contact.StateLicenses[] listOfStateLicenses) {
        this.listOfStateLicenses = listOfStateLicenses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.modId==null && other.getModId()==null) || 
             (this.modId!=null &&
              this.modId.equals(other.getModId()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.assistantName==null && other.getAssistantName()==null) || 
             (this.assistantName!=null &&
              this.assistantName.equals(other.getAssistantName()))) &&
            ((this.assistantPhone==null && other.getAssistantPhone()==null) || 
             (this.assistantPhone!=null &&
              this.assistantPhone.equals(other.getAssistantPhone()))) &&
            ((this.cellularPhone==null && other.getCellularPhone()==null) || 
             (this.cellularPhone!=null &&
              this.cellularPhone.equals(other.getCellularPhone()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.contactConcatField==null && other.getContactConcatField()==null) || 
             (this.contactConcatField!=null &&
              this.contactConcatField.equals(other.getContactConcatField()))) &&
            ((this.contactType==null && other.getContactType()==null) || 
             (this.contactType!=null &&
              this.contactType.equals(other.getContactType()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.contactEmail==null && other.getContactEmail()==null) || 
             (this.contactEmail!=null &&
              this.contactEmail.equals(other.getContactEmail()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.workFax==null && other.getWorkFax()==null) || 
             (this.workFax!=null &&
              this.workFax.equals(other.getWorkFax()))) &&
            ((this.contactFirstName==null && other.getContactFirstName()==null) || 
             (this.contactFirstName!=null &&
              this.contactFirstName.equals(other.getContactFirstName()))) &&
            ((this.contactFullName==null && other.getContactFullName()==null) || 
             (this.contactFullName!=null &&
              this.contactFullName.equals(other.getContactFullName()))) &&
            ((this.integrationId==null && other.getIntegrationId()==null) || 
             (this.integrationId!=null &&
              this.integrationId.equals(other.getIntegrationId()))) &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.contactLastName==null && other.getContactLastName()==null) || 
             (this.contactLastName!=null &&
              this.contactLastName.equals(other.getContactLastName()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.mrMrs==null && other.getMrMrs()==null) || 
             (this.mrMrs!=null &&
              this.mrMrs.equals(other.getMrMrs()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.managerId==null && other.getManagerId()==null) || 
             (this.managerId!=null &&
              this.managerId.equals(other.getManagerId()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.modifiedById==null && other.getModifiedById()==null) || 
             (this.modifiedById!=null &&
              this.modifiedById.equals(other.getModifiedById()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerFullName==null && other.getOwnerFullName()==null) || 
             (this.ownerFullName!=null &&
              this.ownerFullName.equals(other.getOwnerFullName()))) &&
            ((this._private==null && other.get_private()==null) || 
             (this._private!=null &&
              this._private.equals(other.get_private()))) &&
            ((this.alternateAddressId==null && other.getAlternateAddressId()==null) || 
             (this.alternateAddressId!=null &&
              this.alternateAddressId.equals(other.getAlternateAddressId()))) &&
            ((this.primaryAddressId==null && other.getPrimaryAddressId()==null) || 
             (this.primaryAddressId!=null &&
              this.primaryAddressId.equals(other.getPrimaryAddressId()))) &&
            ((this.alternateAddressExternalSystemId==null && other.getAlternateAddressExternalSystemId()==null) || 
             (this.alternateAddressExternalSystemId!=null &&
              this.alternateAddressExternalSystemId.equals(other.getAlternateAddressExternalSystemId()))) &&
            ((this.primaryCity==null && other.getPrimaryCity()==null) || 
             (this.primaryCity!=null &&
              this.primaryCity.equals(other.getPrimaryCity()))) &&
            ((this.primaryCountry==null && other.getPrimaryCountry()==null) || 
             (this.primaryCountry!=null &&
              this.primaryCountry.equals(other.getPrimaryCountry()))) &&
            ((this.primaryZipCode==null && other.getPrimaryZipCode()==null) || 
             (this.primaryZipCode!=null &&
              this.primaryZipCode.equals(other.getPrimaryZipCode()))) &&
            ((this.primaryStateProvince==null && other.getPrimaryStateProvince()==null) || 
             (this.primaryStateProvince!=null &&
              this.primaryStateProvince.equals(other.getPrimaryStateProvince()))) &&
            ((this.primaryAddress==null && other.getPrimaryAddress()==null) || 
             (this.primaryAddress!=null &&
              this.primaryAddress.equals(other.getPrimaryAddress()))) &&
            ((this.buyingRole==null && other.getBuyingRole()==null) || 
             (this.buyingRole!=null &&
              this.buyingRole.equals(other.getBuyingRole()))) &&
            ((this.neverEmail==null && other.getNeverEmail()==null) || 
             (this.neverEmail!=null &&
              this.neverEmail.equals(other.getNeverEmail()))) &&
            ((this.timeZoneName==null && other.getTimeZoneName()==null) || 
             (this.timeZoneName!=null &&
              this.timeZoneName.equals(other.getTimeZoneName()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.dtSuggested_Next_Call_Date==null && other.getDtSuggested_Next_Call_Date()==null) || 
             (this.dtSuggested_Next_Call_Date!=null &&
              this.dtSuggested_Next_Call_Date.equals(other.getDtSuggested_Next_Call_Date()))) &&
            ((this.dSuggested_Next_Call_Date==null && other.getDSuggested_Next_Call_Date()==null) || 
             (this.dSuggested_Next_Call_Date!=null &&
              this.dSuggested_Next_Call_Date.equals(other.getDSuggested_Next_Call_Date()))) &&
            ((this.iCall_Frequency_days==null && other.getICall_Frequency_days()==null) || 
             (this.iCall_Frequency_days!=null &&
              this.iCall_Frequency_days.equals(other.getICall_Frequency_days()))) &&
            ((this.plCustomer_Tier==null && other.getPlCustomer_Tier()==null) || 
             (this.plCustomer_Tier!=null &&
              this.plCustomer_Tier.equals(other.getPlCustomer_Tier()))) &&
            ((this.plCustomer_Segment==null && other.getPlCustomer_Segment()==null) || 
             (this.plCustomer_Segment!=null &&
              this.plCustomer_Segment.equals(other.getPlCustomer_Segment()))) &&
            ((this.taxBracket==null && other.getTaxBracket()==null) || 
             (this.taxBracket!=null &&
              this.taxBracket.equals(other.getTaxBracket()))) &&
            ((this.stLast_Survey_Outcome==null && other.getStLast_Survey_Outcome()==null) || 
             (this.stLast_Survey_Outcome!=null &&
              this.stLast_Survey_Outcome.equals(other.getStLast_Survey_Outcome()))) &&
            ((this.stReferenceable==null && other.getStReferenceable()==null) || 
             (this.stReferenceable!=null &&
              this.stReferenceable.equals(other.getStReferenceable()))) &&
            ((this.stLikely_to_Recommend==null && other.getStLikely_to_Recommend()==null) || 
             (this.stLikely_to_Recommend!=null &&
              this.stLikely_to_Recommend.equals(other.getStLikely_to_Recommend()))) &&
            ((this.accountFuriganaName==null && other.getAccountFuriganaName()==null) || 
             (this.accountFuriganaName!=null &&
              this.accountFuriganaName.equals(other.getAccountFuriganaName()))) &&
            ((this.furiganaFirstName==null && other.getFuriganaFirstName()==null) || 
             (this.furiganaFirstName!=null &&
              this.furiganaFirstName.equals(other.getFuriganaFirstName()))) &&
            ((this.furiganaLastName==null && other.getFuriganaLastName()==null) || 
             (this.furiganaLastName!=null &&
              this.furiganaLastName.equals(other.getFuriganaLastName()))) &&
            ((this.sourceCampaignId==null && other.getSourceCampaignId()==null) || 
             (this.sourceCampaignId!=null &&
              this.sourceCampaignId.equals(other.getSourceCampaignId()))) &&
            ((this.sourceCampaignName==null && other.getSourceCampaignName()==null) || 
             (this.sourceCampaignName!=null &&
              this.sourceCampaignName.equals(other.getSourceCampaignName()))) &&
            ((this.territoryId==null && other.getTerritoryId()==null) || 
             (this.territoryId!=null &&
              this.territoryId.equals(other.getTerritoryId()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.bestTimeToCall==null && other.getBestTimeToCall()==null) || 
             (this.bestTimeToCall!=null &&
              this.bestTimeToCall.equals(other.getBestTimeToCall()))) &&
            ((this.callFrequency==null && other.getCallFrequency()==null) || 
             (this.callFrequency!=null &&
              this.callFrequency.equals(other.getCallFrequency()))) &&
            ((this.creditScore==null && other.getCreditScore()==null) || 
             (this.creditScore!=null &&
              this.creditScore.equals(other.getCreditScore()))) &&
            ((this.currentInvestmentMix==null && other.getCurrentInvestmentMix()==null) || 
             (this.currentInvestmentMix!=null &&
              this.currentInvestmentMix.equals(other.getCurrentInvestmentMix()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.tier==null && other.getTier()==null) || 
             (this.tier!=null &&
              this.tier.equals(other.getTier()))) &&
            ((this.dateofBirth==null && other.getDateofBirth()==null) || 
             (this.dateofBirth!=null &&
              this.dateofBirth.equals(other.getDateofBirth()))) &&
            ((this.degree==null && other.getDegree()==null) || 
             (this.degree!=null &&
              this.degree.equals(other.getDegree()))) &&
            ((this.experienceLevel==null && other.getExperienceLevel()==null) || 
             (this.experienceLevel!=null &&
              this.experienceLevel.equals(other.getExperienceLevel()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.totalIncome==null && other.getTotalIncome()==null) || 
             (this.totalIncome!=null &&
              this.totalIncome.equals(other.getTotalIncome()))) &&
            ((this.investmentHorizon==null && other.getInvestmentHorizon()==null) || 
             (this.investmentHorizon!=null &&
              this.investmentHorizon.equals(other.getInvestmentHorizon()))) &&
            ((this.lastCallDate==null && other.getLastCallDate()==null) || 
             (this.lastCallDate!=null &&
              this.lastCallDate.equals(other.getLastCallDate()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.marketPotential==null && other.getMarketPotential()==null) || 
             (this.marketPotential!=null &&
              this.marketPotential.equals(other.getMarketPotential()))) &&
            ((this.objective==null && other.getObjective()==null) || 
             (this.objective!=null &&
              this.objective.equals(other.getObjective()))) &&
            ((this.ownorRent==null && other.getOwnorRent()==null) || 
             (this.ownorRent!=null &&
              this.ownorRent.equals(other.getOwnorRent()))) &&
            ((this.primaryGoal==null && other.getPrimaryGoal()==null) || 
             (this.primaryGoal!=null &&
              this.primaryGoal.equals(other.getPrimaryGoal()))) &&
            ((this.homeValue==null && other.getHomeValue()==null) || 
             (this.homeValue!=null &&
              this.homeValue.equals(other.getHomeValue()))) &&
            ((this.riskProfile==null && other.getRiskProfile()==null) || 
             (this.riskProfile!=null &&
              this.riskProfile.equals(other.getRiskProfile()))) &&
            ((this.route==null && other.getRoute()==null) || 
             (this.route!=null &&
              this.route.equals(other.getRoute()))) &&
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              this.segment.equals(other.getSegment()))) &&
            ((this.selfEmployed==null && other.getSelfEmployed()==null) || 
             (this.selfEmployed!=null &&
              this.selfEmployed.equals(other.getSelfEmployed()))) &&
            ((this.totalAssets==null && other.getTotalAssets()==null) || 
             (this.totalAssets!=null &&
              this.totalAssets.equals(other.getTotalAssets()))) &&
            ((this.totalExpenses==null && other.getTotalExpenses()==null) || 
             (this.totalExpenses!=null &&
              this.totalExpenses.equals(other.getTotalExpenses()))) &&
            ((this.totalLiabilities==null && other.getTotalLiabilities()==null) || 
             (this.totalLiabilities!=null &&
              this.totalLiabilities.equals(other.getTotalLiabilities()))) &&
            ((this.totalNetWorth==null && other.getTotalNetWorth()==null) || 
             (this.totalNetWorth!=null &&
              this.totalNetWorth.equals(other.getTotalNetWorth()))) &&
            ((this.YTDSales==null && other.getYTDSales()==null) || 
             (this.YTDSales!=null &&
              this.YTDSales.equals(other.getYTDSales()))) &&
            ((this.ownerEmailAddress==null && other.getOwnerEmailAddress()==null) || 
             (this.ownerEmailAddress!=null &&
              this.ownerEmailAddress.equals(other.getOwnerEmailAddress()))) &&
            ((this.PIMCompanyName==null && other.getPIMCompanyName()==null) || 
             (this.PIMCompanyName!=null &&
              this.PIMCompanyName.equals(other.getPIMCompanyName()))) &&
            ((this.managerExternalSystemId==null && other.getManagerExternalSystemId()==null) || 
             (this.managerExternalSystemId!=null &&
              this.managerExternalSystemId.equals(other.getManagerExternalSystemId()))) &&
            ((this.optIn==null && other.getOptIn()==null) || 
             (this.optIn!=null &&
              this.optIn.equals(other.getOptIn()))) &&
            ((this.optOut==null && other.getOptOut()==null) || 
             (this.optOut!=null &&
              this.optOut.equals(other.getOptOut()))) &&
            ((this.lifeEvent==null && other.getLifeEvent()==null) || 
             (this.lifeEvent!=null &&
              this.lifeEvent.equals(other.getLifeEvent()))) &&
            ((this.customObject1ExternalSystemId==null && other.getCustomObject1ExternalSystemId()==null) || 
             (this.customObject1ExternalSystemId!=null &&
              this.customObject1ExternalSystemId.equals(other.getCustomObject1ExternalSystemId()))) &&
            ((this.customObject1Name==null && other.getCustomObject1Name()==null) || 
             (this.customObject1Name!=null &&
              this.customObject1Name.equals(other.getCustomObject1Name()))) &&
            ((this.customObject1Id==null && other.getCustomObject1Id()==null) || 
             (this.customObject1Id!=null &&
              this.customObject1Id.equals(other.getCustomObject1Id()))) &&
            ((this.assessmentFilter4==null && other.getAssessmentFilter4()==null) || 
             (this.assessmentFilter4!=null &&
              this.assessmentFilter4.equals(other.getAssessmentFilter4()))) &&
            ((this.assessmentFilter3==null && other.getAssessmentFilter3()==null) || 
             (this.assessmentFilter3!=null &&
              this.assessmentFilter3.equals(other.getAssessmentFilter3()))) &&
            ((this.assessmentFilter2==null && other.getAssessmentFilter2()==null) || 
             (this.assessmentFilter2!=null &&
              this.assessmentFilter2.equals(other.getAssessmentFilter2()))) &&
            ((this.assessmentFilter1==null && other.getAssessmentFilter1()==null) || 
             (this.assessmentFilter1!=null &&
              this.assessmentFilter1.equals(other.getAssessmentFilter1()))) &&
            ((this.customObject2ExternalSystemId==null && other.getCustomObject2ExternalSystemId()==null) || 
             (this.customObject2ExternalSystemId!=null &&
              this.customObject2ExternalSystemId.equals(other.getCustomObject2ExternalSystemId()))) &&
            ((this.customObject2Id==null && other.getCustomObject2Id()==null) || 
             (this.customObject2Id!=null &&
              this.customObject2Id.equals(other.getCustomObject2Id()))) &&
            ((this.customObject2Name==null && other.getCustomObject2Name()==null) || 
             (this.customObject2Name!=null &&
              this.customObject2Name.equals(other.getCustomObject2Name()))) &&
            ((this.customObject3ExternalSystemId==null && other.getCustomObject3ExternalSystemId()==null) || 
             (this.customObject3ExternalSystemId!=null &&
              this.customObject3ExternalSystemId.equals(other.getCustomObject3ExternalSystemId()))) &&
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.customObject3Id==null && other.getCustomObject3Id()==null) || 
             (this.customObject3Id!=null &&
              this.customObject3Id.equals(other.getCustomObject3Id()))) &&
            ((this.createdbyEmailAddress==null && other.getCreatedbyEmailAddress()==null) || 
             (this.createdbyEmailAddress!=null &&
              this.createdbyEmailAddress.equals(other.getCreatedbyEmailAddress()))) &&
            ((this.lastAssessmentDate==null && other.getLastAssessmentDate()==null) || 
             (this.lastAssessmentDate!=null &&
              this.lastAssessmentDate.equals(other.getLastAssessmentDate()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.modifiedbyEmailAddress==null && other.getModifiedbyEmailAddress()==null) || 
             (this.modifiedbyEmailAddress!=null &&
              this.modifiedbyEmailAddress.equals(other.getModifiedbyEmailAddress()))) &&
            ((this.ownerExternalSystemId==null && other.getOwnerExternalSystemId()==null) || 
             (this.ownerExternalSystemId!=null &&
              this.ownerExternalSystemId.equals(other.getOwnerExternalSystemId()))) &&
            ((this.primaryGroup==null && other.getPrimaryGroup()==null) || 
             (this.primaryGroup!=null &&
              this.primaryGroup.equals(other.getPrimaryGroup()))) &&
            ((this.accountExternalSystemId==null && other.getAccountExternalSystemId()==null) || 
             (this.accountExternalSystemId!=null &&
              this.accountExternalSystemId.equals(other.getAccountExternalSystemId()))) &&
            ((this.contactRole==null && other.getContactRole()==null) || 
             (this.contactRole!=null &&
              this.contactRole.equals(other.getContactRole()))) &&
            ((this.customObject3Name==null && other.getCustomObject3Name()==null) || 
             (this.customObject3Name!=null &&
              this.customObject3Name.equals(other.getCustomObject3Name()))) &&
            ((this.occamTerritory==null && other.getOccamTerritory()==null) || 
             (this.occamTerritory!=null &&
              this.occamTerritory.equals(other.getOccamTerritory()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.accountLocation==null && other.getAccountLocation()==null) || 
             (this.accountLocation!=null &&
              this.accountLocation.equals(other.getAccountLocation()))) &&
            ((this.primaryCounty==null && other.getPrimaryCounty()==null) || 
             (this.primaryCounty!=null &&
              this.primaryCounty.equals(other.getPrimaryCounty()))) &&
            ((this.primaryProvince==null && other.getPrimaryProvince()==null) || 
             (this.primaryProvince!=null &&
              this.primaryProvince.equals(other.getPrimaryProvince()))) &&
            ((this.primaryStreetAddress2==null && other.getPrimaryStreetAddress2()==null) || 
             (this.primaryStreetAddress2!=null &&
              this.primaryStreetAddress2.equals(other.getPrimaryStreetAddress2()))) &&
            ((this.primaryStreetAddress3==null && other.getPrimaryStreetAddress3()==null) || 
             (this.primaryStreetAddress3!=null &&
              this.primaryStreetAddress3.equals(other.getPrimaryStreetAddress3()))) &&
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
            ((this.alternateCounty==null && other.getAlternateCounty()==null) || 
             (this.alternateCounty!=null &&
              this.alternateCounty.equals(other.getAlternateCounty()))) &&
            ((this.alternateCity==null && other.getAlternateCity()==null) || 
             (this.alternateCity!=null &&
              this.alternateCity.equals(other.getAlternateCity()))) &&
            ((this.alternateCountry==null && other.getAlternateCountry()==null) || 
             (this.alternateCountry!=null &&
              this.alternateCountry.equals(other.getAlternateCountry()))) &&
            ((this.alternateZipCode==null && other.getAlternateZipCode()==null) || 
             (this.alternateZipCode!=null &&
              this.alternateZipCode.equals(other.getAlternateZipCode()))) &&
            ((this.alternateStateProvince==null && other.getAlternateStateProvince()==null) || 
             (this.alternateStateProvince!=null &&
              this.alternateStateProvince.equals(other.getAlternateStateProvince()))) &&
            ((this.alternateAddress1==null && other.getAlternateAddress1()==null) || 
             (this.alternateAddress1!=null &&
              this.alternateAddress1.equals(other.getAlternateAddress1()))) &&
            ((this.alternateAddress2==null && other.getAlternateAddress2()==null) || 
             (this.alternateAddress2!=null &&
              this.alternateAddress2.equals(other.getAlternateAddress2()))) &&
            ((this.alternateProvince==null && other.getAlternateProvince()==null) || 
             (this.alternateProvince!=null &&
              this.alternateProvince.equals(other.getAlternateProvince()))) &&
            ((this.alternateAddress3==null && other.getAlternateAddress3()==null) || 
             (this.alternateAddress3!=null &&
              this.alternateAddress3.equals(other.getAlternateAddress3()))) &&
            ((this.listOfActivity==null && other.getListOfActivity()==null) || 
             (this.listOfActivity!=null &&
              java.util.Arrays.equals(this.listOfActivity, other.getListOfActivity()))) &&
            ((this.listOfContactTeam==null && other.getListOfContactTeam()==null) || 
             (this.listOfContactTeam!=null &&
              java.util.Arrays.equals(this.listOfContactTeam, other.getListOfContactTeam()))) &&
            ((this.listOfRelatedContact==null && other.getListOfRelatedContact()==null) || 
             (this.listOfRelatedContact!=null &&
              java.util.Arrays.equals(this.listOfRelatedContact, other.getListOfRelatedContact()))) &&
            ((this.listOfAccount==null && other.getListOfAccount()==null) || 
             (this.listOfAccount!=null &&
              java.util.Arrays.equals(this.listOfAccount, other.getListOfAccount()))) &&
            ((this.listOfNote==null && other.getListOfNote()==null) || 
             (this.listOfNote!=null &&
              java.util.Arrays.equals(this.listOfNote, other.getListOfNote()))) &&
            ((this.listOfLead==null && other.getListOfLead()==null) || 
             (this.listOfLead!=null &&
              java.util.Arrays.equals(this.listOfLead, other.getListOfLead()))) &&
            ((this.listOfOpportunity==null && other.getListOfOpportunity()==null) || 
             (this.listOfOpportunity!=null &&
              java.util.Arrays.equals(this.listOfOpportunity, other.getListOfOpportunity()))) &&
            ((this.listOfAlternateAddress==null && other.getListOfAlternateAddress()==null) || 
             (this.listOfAlternateAddress!=null &&
              this.listOfAlternateAddress.equals(other.getListOfAlternateAddress()))) &&
            ((this.listOfServiceRequest==null && other.getListOfServiceRequest()==null) || 
             (this.listOfServiceRequest!=null &&
              java.util.Arrays.equals(this.listOfServiceRequest, other.getListOfServiceRequest()))) &&
            ((this.listOfAddress==null && other.getListOfAddress()==null) || 
             (this.listOfAddress!=null &&
              java.util.Arrays.equals(this.listOfAddress, other.getListOfAddress()))) &&
            ((this.listOfRevenue==null && other.getListOfRevenue()==null) || 
             (this.listOfRevenue!=null &&
              java.util.Arrays.equals(this.listOfRevenue, other.getListOfRevenue()))) &&
            ((this.listOfAsset==null && other.getListOfAsset()==null) || 
             (this.listOfAsset!=null &&
              java.util.Arrays.equals(this.listOfAsset, other.getListOfAsset()))) &&
            ((this.listOfInterests==null && other.getListOfInterests()==null) || 
             (this.listOfInterests!=null &&
              java.util.Arrays.equals(this.listOfInterests, other.getListOfInterests()))) &&
            ((this.listOfCampaign==null && other.getListOfCampaign()==null) || 
             (this.listOfCampaign!=null &&
              java.util.Arrays.equals(this.listOfCampaign, other.getListOfCampaign()))) &&
            ((this.listOfCustomObject3==null && other.getListOfCustomObject3()==null) || 
             (this.listOfCustomObject3!=null &&
              java.util.Arrays.equals(this.listOfCustomObject3, other.getListOfCustomObject3()))) &&
            ((this.listOfBook==null && other.getListOfBook()==null) || 
             (this.listOfBook!=null &&
              java.util.Arrays.equals(this.listOfBook, other.getListOfBook()))) &&
            ((this.listOfAttachment==null && other.getListOfAttachment()==null) || 
             (this.listOfAttachment!=null &&
              java.util.Arrays.equals(this.listOfAttachment, other.getListOfAttachment()))) &&
            ((this.listOfStateLicenses==null && other.getListOfStateLicenses()==null) || 
             (this.listOfStateLicenses!=null &&
              java.util.Arrays.equals(this.listOfStateLicenses, other.getListOfStateLicenses())));
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
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getModId() != null) {
            _hashCode += getModId().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAssistantName() != null) {
            _hashCode += getAssistantName().hashCode();
        }
        if (getAssistantPhone() != null) {
            _hashCode += getAssistantPhone().hashCode();
        }
        if (getCellularPhone() != null) {
            _hashCode += getCellularPhone().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getContactConcatField() != null) {
            _hashCode += getContactConcatField().hashCode();
        }
        if (getContactType() != null) {
            _hashCode += getContactType().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getContactEmail() != null) {
            _hashCode += getContactEmail().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getWorkFax() != null) {
            _hashCode += getWorkFax().hashCode();
        }
        if (getContactFirstName() != null) {
            _hashCode += getContactFirstName().hashCode();
        }
        if (getContactFullName() != null) {
            _hashCode += getContactFullName().hashCode();
        }
        if (getIntegrationId() != null) {
            _hashCode += getIntegrationId().hashCode();
        }
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getContactLastName() != null) {
            _hashCode += getContactLastName().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getMrMrs() != null) {
            _hashCode += getMrMrs().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getManagerId() != null) {
            _hashCode += getManagerId().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
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
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerFullName() != null) {
            _hashCode += getOwnerFullName().hashCode();
        }
        if (get_private() != null) {
            _hashCode += get_private().hashCode();
        }
        if (getAlternateAddressId() != null) {
            _hashCode += getAlternateAddressId().hashCode();
        }
        if (getPrimaryAddressId() != null) {
            _hashCode += getPrimaryAddressId().hashCode();
        }
        if (getAlternateAddressExternalSystemId() != null) {
            _hashCode += getAlternateAddressExternalSystemId().hashCode();
        }
        if (getPrimaryCity() != null) {
            _hashCode += getPrimaryCity().hashCode();
        }
        if (getPrimaryCountry() != null) {
            _hashCode += getPrimaryCountry().hashCode();
        }
        if (getPrimaryZipCode() != null) {
            _hashCode += getPrimaryZipCode().hashCode();
        }
        if (getPrimaryStateProvince() != null) {
            _hashCode += getPrimaryStateProvince().hashCode();
        }
        if (getPrimaryAddress() != null) {
            _hashCode += getPrimaryAddress().hashCode();
        }
        if (getBuyingRole() != null) {
            _hashCode += getBuyingRole().hashCode();
        }
        if (getNeverEmail() != null) {
            _hashCode += getNeverEmail().hashCode();
        }
        if (getTimeZoneName() != null) {
            _hashCode += getTimeZoneName().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getDtSuggested_Next_Call_Date() != null) {
            _hashCode += getDtSuggested_Next_Call_Date().hashCode();
        }
        if (getDSuggested_Next_Call_Date() != null) {
            _hashCode += getDSuggested_Next_Call_Date().hashCode();
        }
        if (getICall_Frequency_days() != null) {
            _hashCode += getICall_Frequency_days().hashCode();
        }
        if (getPlCustomer_Tier() != null) {
            _hashCode += getPlCustomer_Tier().hashCode();
        }
        if (getPlCustomer_Segment() != null) {
            _hashCode += getPlCustomer_Segment().hashCode();
        }
        if (getTaxBracket() != null) {
            _hashCode += getTaxBracket().hashCode();
        }
        if (getStLast_Survey_Outcome() != null) {
            _hashCode += getStLast_Survey_Outcome().hashCode();
        }
        if (getStReferenceable() != null) {
            _hashCode += getStReferenceable().hashCode();
        }
        if (getStLikely_to_Recommend() != null) {
            _hashCode += getStLikely_to_Recommend().hashCode();
        }
        if (getAccountFuriganaName() != null) {
            _hashCode += getAccountFuriganaName().hashCode();
        }
        if (getFuriganaFirstName() != null) {
            _hashCode += getFuriganaFirstName().hashCode();
        }
        if (getFuriganaLastName() != null) {
            _hashCode += getFuriganaLastName().hashCode();
        }
        if (getSourceCampaignId() != null) {
            _hashCode += getSourceCampaignId().hashCode();
        }
        if (getSourceCampaignName() != null) {
            _hashCode += getSourceCampaignName().hashCode();
        }
        if (getTerritoryId() != null) {
            _hashCode += getTerritoryId().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getBestTimeToCall() != null) {
            _hashCode += getBestTimeToCall().hashCode();
        }
        if (getCallFrequency() != null) {
            _hashCode += getCallFrequency().hashCode();
        }
        if (getCreditScore() != null) {
            _hashCode += getCreditScore().hashCode();
        }
        if (getCurrentInvestmentMix() != null) {
            _hashCode += getCurrentInvestmentMix().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getTier() != null) {
            _hashCode += getTier().hashCode();
        }
        if (getDateofBirth() != null) {
            _hashCode += getDateofBirth().hashCode();
        }
        if (getDegree() != null) {
            _hashCode += getDegree().hashCode();
        }
        if (getExperienceLevel() != null) {
            _hashCode += getExperienceLevel().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getTotalIncome() != null) {
            _hashCode += getTotalIncome().hashCode();
        }
        if (getInvestmentHorizon() != null) {
            _hashCode += getInvestmentHorizon().hashCode();
        }
        if (getLastCallDate() != null) {
            _hashCode += getLastCallDate().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getMarketPotential() != null) {
            _hashCode += getMarketPotential().hashCode();
        }
        if (getObjective() != null) {
            _hashCode += getObjective().hashCode();
        }
        if (getOwnorRent() != null) {
            _hashCode += getOwnorRent().hashCode();
        }
        if (getPrimaryGoal() != null) {
            _hashCode += getPrimaryGoal().hashCode();
        }
        if (getHomeValue() != null) {
            _hashCode += getHomeValue().hashCode();
        }
        if (getRiskProfile() != null) {
            _hashCode += getRiskProfile().hashCode();
        }
        if (getRoute() != null) {
            _hashCode += getRoute().hashCode();
        }
        if (getSegment() != null) {
            _hashCode += getSegment().hashCode();
        }
        if (getSelfEmployed() != null) {
            _hashCode += getSelfEmployed().hashCode();
        }
        if (getTotalAssets() != null) {
            _hashCode += getTotalAssets().hashCode();
        }
        if (getTotalExpenses() != null) {
            _hashCode += getTotalExpenses().hashCode();
        }
        if (getTotalLiabilities() != null) {
            _hashCode += getTotalLiabilities().hashCode();
        }
        if (getTotalNetWorth() != null) {
            _hashCode += getTotalNetWorth().hashCode();
        }
        if (getYTDSales() != null) {
            _hashCode += getYTDSales().hashCode();
        }
        if (getOwnerEmailAddress() != null) {
            _hashCode += getOwnerEmailAddress().hashCode();
        }
        if (getPIMCompanyName() != null) {
            _hashCode += getPIMCompanyName().hashCode();
        }
        if (getManagerExternalSystemId() != null) {
            _hashCode += getManagerExternalSystemId().hashCode();
        }
        if (getOptIn() != null) {
            _hashCode += getOptIn().hashCode();
        }
        if (getOptOut() != null) {
            _hashCode += getOptOut().hashCode();
        }
        if (getLifeEvent() != null) {
            _hashCode += getLifeEvent().hashCode();
        }
        if (getCustomObject1ExternalSystemId() != null) {
            _hashCode += getCustomObject1ExternalSystemId().hashCode();
        }
        if (getCustomObject1Name() != null) {
            _hashCode += getCustomObject1Name().hashCode();
        }
        if (getCustomObject1Id() != null) {
            _hashCode += getCustomObject1Id().hashCode();
        }
        if (getAssessmentFilter4() != null) {
            _hashCode += getAssessmentFilter4().hashCode();
        }
        if (getAssessmentFilter3() != null) {
            _hashCode += getAssessmentFilter3().hashCode();
        }
        if (getAssessmentFilter2() != null) {
            _hashCode += getAssessmentFilter2().hashCode();
        }
        if (getAssessmentFilter1() != null) {
            _hashCode += getAssessmentFilter1().hashCode();
        }
        if (getCustomObject2ExternalSystemId() != null) {
            _hashCode += getCustomObject2ExternalSystemId().hashCode();
        }
        if (getCustomObject2Id() != null) {
            _hashCode += getCustomObject2Id().hashCode();
        }
        if (getCustomObject2Name() != null) {
            _hashCode += getCustomObject2Name().hashCode();
        }
        if (getCustomObject3ExternalSystemId() != null) {
            _hashCode += getCustomObject3ExternalSystemId().hashCode();
        }
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getCustomObject3Id() != null) {
            _hashCode += getCustomObject3Id().hashCode();
        }
        if (getCreatedbyEmailAddress() != null) {
            _hashCode += getCreatedbyEmailAddress().hashCode();
        }
        if (getLastAssessmentDate() != null) {
            _hashCode += getLastAssessmentDate().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getModifiedbyEmailAddress() != null) {
            _hashCode += getModifiedbyEmailAddress().hashCode();
        }
        if (getOwnerExternalSystemId() != null) {
            _hashCode += getOwnerExternalSystemId().hashCode();
        }
        if (getPrimaryGroup() != null) {
            _hashCode += getPrimaryGroup().hashCode();
        }
        if (getAccountExternalSystemId() != null) {
            _hashCode += getAccountExternalSystemId().hashCode();
        }
        if (getContactRole() != null) {
            _hashCode += getContactRole().hashCode();
        }
        if (getCustomObject3Name() != null) {
            _hashCode += getCustomObject3Name().hashCode();
        }
        if (getOccamTerritory() != null) {
            _hashCode += getOccamTerritory().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getAccountLocation() != null) {
            _hashCode += getAccountLocation().hashCode();
        }
        if (getPrimaryCounty() != null) {
            _hashCode += getPrimaryCounty().hashCode();
        }
        if (getPrimaryProvince() != null) {
            _hashCode += getPrimaryProvince().hashCode();
        }
        if (getPrimaryStreetAddress2() != null) {
            _hashCode += getPrimaryStreetAddress2().hashCode();
        }
        if (getPrimaryStreetAddress3() != null) {
            _hashCode += getPrimaryStreetAddress3().hashCode();
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
        if (getAlternateCounty() != null) {
            _hashCode += getAlternateCounty().hashCode();
        }
        if (getAlternateCity() != null) {
            _hashCode += getAlternateCity().hashCode();
        }
        if (getAlternateCountry() != null) {
            _hashCode += getAlternateCountry().hashCode();
        }
        if (getAlternateZipCode() != null) {
            _hashCode += getAlternateZipCode().hashCode();
        }
        if (getAlternateStateProvince() != null) {
            _hashCode += getAlternateStateProvince().hashCode();
        }
        if (getAlternateAddress1() != null) {
            _hashCode += getAlternateAddress1().hashCode();
        }
        if (getAlternateAddress2() != null) {
            _hashCode += getAlternateAddress2().hashCode();
        }
        if (getAlternateProvince() != null) {
            _hashCode += getAlternateProvince().hashCode();
        }
        if (getAlternateAddress3() != null) {
            _hashCode += getAlternateAddress3().hashCode();
        }
        if (getListOfActivity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfActivity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfActivity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfContactTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfContactTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfContactTeam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfRelatedContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfRelatedContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfRelatedContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfLead() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfLead());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfLead(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfOpportunity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfAlternateAddress() != null) {
            _hashCode += getListOfAlternateAddress().hashCode();
        }
        if (getListOfServiceRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfServiceRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfServiceRequest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfAsset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfAsset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfAsset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfInterests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfInterests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfInterests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfCampaign() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfCampaign());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfCampaign(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfCustomObject3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfCustomObject3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfCustomObject3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfStateLicenses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfStateLicenses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfStateLicenses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactId"));
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
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistantName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssistantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistantPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssistantPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellularPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CellularPhone"));
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
        elemField.setFieldName("contactConcatField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactConcatField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactType"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Department"));
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
        elemField.setFieldName("externalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workFax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "WorkFax"));
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
        elemField.setFieldName("integrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "IntegrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "JobTitle"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LeadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrMrs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "MrMrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "MiddleName"));
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
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerId"));
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
        elemField.setFieldName("ownerFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerFullName"));
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
        elemField.setFieldName("alternateAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAddressExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateAddressExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryStateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryStateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "BuyingRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neverEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "NeverEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TimeZoneName"));
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
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSuggested_Next_Call_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "dtSuggested_Next_Call_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSuggested_Next_Call_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "dSuggested_Next_Call_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICall_Frequency_days");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "iCall_Frequency_days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plCustomer_Tier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "plCustomer_Tier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plCustomer_Segment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "plCustomer_Segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxBracket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TaxBracket"));
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
        elemField.setFieldName("stReferenceable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stReferenceable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stLikely_to_Recommend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stLikely_to_Recommend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFuriganaName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountFuriganaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("furiganaFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "FuriganaFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("furiganaLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "FuriganaLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SourceCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCampaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SourceCampaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TerritoryId"));
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
        elemField.setFieldName("bestTimeToCall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "BestTimeToCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CallFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreditScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentInvestmentMix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CurrentInvestmentMix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Tier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateofBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "DateofBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degree");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Degree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experienceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ExperienceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "HomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TotalIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investmentHorizon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "InvestmentHorizon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LastCallDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketPotential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "MarketPotential"));
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
        elemField.setFieldName("ownorRent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnorRent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryGoal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryGoal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "HomeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RiskProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Route"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfEmployed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SelfEmployed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TotalAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TotalExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLiabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TotalLiabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetWorth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "TotalNetWorth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YTDSales");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "YTDSales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIMCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PIMCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ManagerExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OptIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optOut");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OptOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LifeEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject1ExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject1ExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject1Name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject1Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentFilter4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssessmentFilter4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentFilter3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssessmentFilter3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentFilter2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssessmentFilter2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentFilter1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssessmentFilter1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject2ExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject2ExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject2Name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject2Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject3ExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3ExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdbyEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CreatedbyEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAssessmentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LastAssessmentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "LastUpdated"));
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
        elemField.setFieldName("modifiedbyEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ModifiedbyEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountExternalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountExternalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObject3Name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occamTerritory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OccamTerritory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountName"));
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
        elemField.setFieldName("accountLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryStreetAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryStreetAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryStreetAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PrimaryStreetAddress3"));
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
        elemField.setFieldName("alternateCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateStateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AlternateAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Activity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Activity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfContactTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfContactTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Team"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Team"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfRelatedContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfRelatedContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RelatedContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RelatedContact"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Account"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Note"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Note"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Lead"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Lead"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Opportunity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Opportunity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAlternateAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAlternateAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAlternateAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfServiceRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfServiceRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ServiceRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Asset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Asset"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfInterests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfInterests"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Interests"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Interests"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Campaign"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfCustomObject3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfCustomObject3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "CustomObject3"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Book"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Book"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfStateLicenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ListOfStateLicenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StateLicenses"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StateLicenses"));
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
