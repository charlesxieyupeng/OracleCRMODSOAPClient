/**
 * Revenue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crmondemand.xml.contact;

public class Revenue  implements java.io.Serializable {
    private java.lang.String assetCurrency;

    private java.lang.String externalSystemId;

    private java.lang.String product;

    private java.lang.String productId;

    private java.lang.String productExternalId;

    private java.lang.String productIntegrationId;

    private java.lang.String status;

    private java.lang.String productCategoryId;

    private java.lang.String productCategory;

    private java.lang.String productCategoryExternalId;

    private java.lang.String productCategoryIntegrationId;

    private java.lang.String quantity;

    private java.lang.String partNumber;

    private java.lang.String purchasePrice;

    private java.lang.String forecast;

    private java.lang.String revenue;

    private java.lang.String contactFullName;

    private java.lang.String frequency;

    private java.lang.String numberOfPeriods;

    private java.lang.String description;

    private java.lang.String revenueId;

    private java.lang.String bReset_Dates;

    private java.lang.String stOriginal_Dates;

    private java.lang.String integrationId;

    private java.lang.String type;

    private java.lang.String startCloseDate;

    private java.lang.String createdDate;

    private java.lang.String createdById;

    private java.lang.String createdBy;

    private java.lang.String modifiedDate;

    private java.lang.String modifiedById;

    private java.lang.String modifiedBy;

    private java.lang.String accountName;

    private java.lang.String accountId;

    private java.lang.String accountIntegrationId;

    private java.lang.String accountExternalId;

    private java.lang.String contactId;

    private java.lang.String contactIntegrationId;

    private java.lang.String contactExternalId;

    private java.lang.String ownerId;

    private java.lang.String owner;

    private java.lang.String ownerIntegrationId;

    private java.lang.String ownerExternalId;

    private java.lang.String opportunityName;

    private java.lang.String opportunityIntegrationId;

    private java.lang.String opportunityExternalId;

    private java.lang.String opportunityId;

    private java.lang.String salesStage;

    private java.lang.String productType;

    private java.lang.String productStatus;

    private java.lang.String expectedRevenue;

    private java.lang.String assetValue;

    private java.lang.String premium;

    private java.lang.String shipDate;

    private java.lang.String purchaseDate;

    private java.lang.String serialNumber;

    private java.lang.String warranty;

    private java.lang.String probability;

    private java.lang.String contract;

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

    public Revenue() {
    }

    public Revenue(
           java.lang.String assetCurrency,
           java.lang.String externalSystemId,
           java.lang.String product,
           java.lang.String productId,
           java.lang.String productExternalId,
           java.lang.String productIntegrationId,
           java.lang.String status,
           java.lang.String productCategoryId,
           java.lang.String productCategory,
           java.lang.String productCategoryExternalId,
           java.lang.String productCategoryIntegrationId,
           java.lang.String quantity,
           java.lang.String partNumber,
           java.lang.String purchasePrice,
           java.lang.String forecast,
           java.lang.String revenue,
           java.lang.String contactFullName,
           java.lang.String frequency,
           java.lang.String numberOfPeriods,
           java.lang.String description,
           java.lang.String revenueId,
           java.lang.String bReset_Dates,
           java.lang.String stOriginal_Dates,
           java.lang.String integrationId,
           java.lang.String type,
           java.lang.String startCloseDate,
           java.lang.String createdDate,
           java.lang.String createdById,
           java.lang.String createdBy,
           java.lang.String modifiedDate,
           java.lang.String modifiedById,
           java.lang.String modifiedBy,
           java.lang.String accountName,
           java.lang.String accountId,
           java.lang.String accountIntegrationId,
           java.lang.String accountExternalId,
           java.lang.String contactId,
           java.lang.String contactIntegrationId,
           java.lang.String contactExternalId,
           java.lang.String ownerId,
           java.lang.String owner,
           java.lang.String ownerIntegrationId,
           java.lang.String ownerExternalId,
           java.lang.String opportunityName,
           java.lang.String opportunityIntegrationId,
           java.lang.String opportunityExternalId,
           java.lang.String opportunityId,
           java.lang.String salesStage,
           java.lang.String productType,
           java.lang.String productStatus,
           java.lang.String expectedRevenue,
           java.lang.String assetValue,
           java.lang.String premium,
           java.lang.String shipDate,
           java.lang.String purchaseDate,
           java.lang.String serialNumber,
           java.lang.String warranty,
           java.lang.String probability,
           java.lang.String contract,
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
           this.assetCurrency = assetCurrency;
           this.externalSystemId = externalSystemId;
           this.product = product;
           this.productId = productId;
           this.productExternalId = productExternalId;
           this.productIntegrationId = productIntegrationId;
           this.status = status;
           this.productCategoryId = productCategoryId;
           this.productCategory = productCategory;
           this.productCategoryExternalId = productCategoryExternalId;
           this.productCategoryIntegrationId = productCategoryIntegrationId;
           this.quantity = quantity;
           this.partNumber = partNumber;
           this.purchasePrice = purchasePrice;
           this.forecast = forecast;
           this.revenue = revenue;
           this.contactFullName = contactFullName;
           this.frequency = frequency;
           this.numberOfPeriods = numberOfPeriods;
           this.description = description;
           this.revenueId = revenueId;
           this.bReset_Dates = bReset_Dates;
           this.stOriginal_Dates = stOriginal_Dates;
           this.integrationId = integrationId;
           this.type = type;
           this.startCloseDate = startCloseDate;
           this.createdDate = createdDate;
           this.createdById = createdById;
           this.createdBy = createdBy;
           this.modifiedDate = modifiedDate;
           this.modifiedById = modifiedById;
           this.modifiedBy = modifiedBy;
           this.accountName = accountName;
           this.accountId = accountId;
           this.accountIntegrationId = accountIntegrationId;
           this.accountExternalId = accountExternalId;
           this.contactId = contactId;
           this.contactIntegrationId = contactIntegrationId;
           this.contactExternalId = contactExternalId;
           this.ownerId = ownerId;
           this.owner = owner;
           this.ownerIntegrationId = ownerIntegrationId;
           this.ownerExternalId = ownerExternalId;
           this.opportunityName = opportunityName;
           this.opportunityIntegrationId = opportunityIntegrationId;
           this.opportunityExternalId = opportunityExternalId;
           this.opportunityId = opportunityId;
           this.salesStage = salesStage;
           this.productType = productType;
           this.productStatus = productStatus;
           this.expectedRevenue = expectedRevenue;
           this.assetValue = assetValue;
           this.premium = premium;
           this.shipDate = shipDate;
           this.purchaseDate = purchaseDate;
           this.serialNumber = serialNumber;
           this.warranty = warranty;
           this.probability = probability;
           this.contract = contract;
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
     * Gets the assetCurrency value for this Revenue.
     * 
     * @return assetCurrency
     */
    public java.lang.String getAssetCurrency() {
        return assetCurrency;
    }


    /**
     * Sets the assetCurrency value for this Revenue.
     * 
     * @param assetCurrency
     */
    public void setAssetCurrency(java.lang.String assetCurrency) {
        this.assetCurrency = assetCurrency;
    }


    /**
     * Gets the externalSystemId value for this Revenue.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this Revenue.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the product value for this Revenue.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Revenue.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the productId value for this Revenue.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this Revenue.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the productExternalId value for this Revenue.
     * 
     * @return productExternalId
     */
    public java.lang.String getProductExternalId() {
        return productExternalId;
    }


    /**
     * Sets the productExternalId value for this Revenue.
     * 
     * @param productExternalId
     */
    public void setProductExternalId(java.lang.String productExternalId) {
        this.productExternalId = productExternalId;
    }


    /**
     * Gets the productIntegrationId value for this Revenue.
     * 
     * @return productIntegrationId
     */
    public java.lang.String getProductIntegrationId() {
        return productIntegrationId;
    }


    /**
     * Sets the productIntegrationId value for this Revenue.
     * 
     * @param productIntegrationId
     */
    public void setProductIntegrationId(java.lang.String productIntegrationId) {
        this.productIntegrationId = productIntegrationId;
    }


    /**
     * Gets the status value for this Revenue.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Revenue.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the productCategoryId value for this Revenue.
     * 
     * @return productCategoryId
     */
    public java.lang.String getProductCategoryId() {
        return productCategoryId;
    }


    /**
     * Sets the productCategoryId value for this Revenue.
     * 
     * @param productCategoryId
     */
    public void setProductCategoryId(java.lang.String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }


    /**
     * Gets the productCategory value for this Revenue.
     * 
     * @return productCategory
     */
    public java.lang.String getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this Revenue.
     * 
     * @param productCategory
     */
    public void setProductCategory(java.lang.String productCategory) {
        this.productCategory = productCategory;
    }


    /**
     * Gets the productCategoryExternalId value for this Revenue.
     * 
     * @return productCategoryExternalId
     */
    public java.lang.String getProductCategoryExternalId() {
        return productCategoryExternalId;
    }


    /**
     * Sets the productCategoryExternalId value for this Revenue.
     * 
     * @param productCategoryExternalId
     */
    public void setProductCategoryExternalId(java.lang.String productCategoryExternalId) {
        this.productCategoryExternalId = productCategoryExternalId;
    }


    /**
     * Gets the productCategoryIntegrationId value for this Revenue.
     * 
     * @return productCategoryIntegrationId
     */
    public java.lang.String getProductCategoryIntegrationId() {
        return productCategoryIntegrationId;
    }


    /**
     * Sets the productCategoryIntegrationId value for this Revenue.
     * 
     * @param productCategoryIntegrationId
     */
    public void setProductCategoryIntegrationId(java.lang.String productCategoryIntegrationId) {
        this.productCategoryIntegrationId = productCategoryIntegrationId;
    }


    /**
     * Gets the quantity value for this Revenue.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Revenue.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the partNumber value for this Revenue.
     * 
     * @return partNumber
     */
    public java.lang.String getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this Revenue.
     * 
     * @param partNumber
     */
    public void setPartNumber(java.lang.String partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the purchasePrice value for this Revenue.
     * 
     * @return purchasePrice
     */
    public java.lang.String getPurchasePrice() {
        return purchasePrice;
    }


    /**
     * Sets the purchasePrice value for this Revenue.
     * 
     * @param purchasePrice
     */
    public void setPurchasePrice(java.lang.String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    /**
     * Gets the forecast value for this Revenue.
     * 
     * @return forecast
     */
    public java.lang.String getForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this Revenue.
     * 
     * @param forecast
     */
    public void setForecast(java.lang.String forecast) {
        this.forecast = forecast;
    }


    /**
     * Gets the revenue value for this Revenue.
     * 
     * @return revenue
     */
    public java.lang.String getRevenue() {
        return revenue;
    }


    /**
     * Sets the revenue value for this Revenue.
     * 
     * @param revenue
     */
    public void setRevenue(java.lang.String revenue) {
        this.revenue = revenue;
    }


    /**
     * Gets the contactFullName value for this Revenue.
     * 
     * @return contactFullName
     */
    public java.lang.String getContactFullName() {
        return contactFullName;
    }


    /**
     * Sets the contactFullName value for this Revenue.
     * 
     * @param contactFullName
     */
    public void setContactFullName(java.lang.String contactFullName) {
        this.contactFullName = contactFullName;
    }


    /**
     * Gets the frequency value for this Revenue.
     * 
     * @return frequency
     */
    public java.lang.String getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this Revenue.
     * 
     * @param frequency
     */
    public void setFrequency(java.lang.String frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the numberOfPeriods value for this Revenue.
     * 
     * @return numberOfPeriods
     */
    public java.lang.String getNumberOfPeriods() {
        return numberOfPeriods;
    }


    /**
     * Sets the numberOfPeriods value for this Revenue.
     * 
     * @param numberOfPeriods
     */
    public void setNumberOfPeriods(java.lang.String numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }


    /**
     * Gets the description value for this Revenue.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Revenue.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the revenueId value for this Revenue.
     * 
     * @return revenueId
     */
    public java.lang.String getRevenueId() {
        return revenueId;
    }


    /**
     * Sets the revenueId value for this Revenue.
     * 
     * @param revenueId
     */
    public void setRevenueId(java.lang.String revenueId) {
        this.revenueId = revenueId;
    }


    /**
     * Gets the bReset_Dates value for this Revenue.
     * 
     * @return bReset_Dates
     */
    public java.lang.String getBReset_Dates() {
        return bReset_Dates;
    }


    /**
     * Sets the bReset_Dates value for this Revenue.
     * 
     * @param bReset_Dates
     */
    public void setBReset_Dates(java.lang.String bReset_Dates) {
        this.bReset_Dates = bReset_Dates;
    }


    /**
     * Gets the stOriginal_Dates value for this Revenue.
     * 
     * @return stOriginal_Dates
     */
    public java.lang.String getStOriginal_Dates() {
        return stOriginal_Dates;
    }


    /**
     * Sets the stOriginal_Dates value for this Revenue.
     * 
     * @param stOriginal_Dates
     */
    public void setStOriginal_Dates(java.lang.String stOriginal_Dates) {
        this.stOriginal_Dates = stOriginal_Dates;
    }


    /**
     * Gets the integrationId value for this Revenue.
     * 
     * @return integrationId
     */
    public java.lang.String getIntegrationId() {
        return integrationId;
    }


    /**
     * Sets the integrationId value for this Revenue.
     * 
     * @param integrationId
     */
    public void setIntegrationId(java.lang.String integrationId) {
        this.integrationId = integrationId;
    }


    /**
     * Gets the type value for this Revenue.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Revenue.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the startCloseDate value for this Revenue.
     * 
     * @return startCloseDate
     */
    public java.lang.String getStartCloseDate() {
        return startCloseDate;
    }


    /**
     * Sets the startCloseDate value for this Revenue.
     * 
     * @param startCloseDate
     */
    public void setStartCloseDate(java.lang.String startCloseDate) {
        this.startCloseDate = startCloseDate;
    }


    /**
     * Gets the createdDate value for this Revenue.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Revenue.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdById value for this Revenue.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Revenue.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdBy value for this Revenue.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Revenue.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the modifiedDate value for this Revenue.
     * 
     * @return modifiedDate
     */
    public java.lang.String getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Revenue.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.lang.String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedById value for this Revenue.
     * 
     * @return modifiedById
     */
    public java.lang.String getModifiedById() {
        return modifiedById;
    }


    /**
     * Sets the modifiedById value for this Revenue.
     * 
     * @param modifiedById
     */
    public void setModifiedById(java.lang.String modifiedById) {
        this.modifiedById = modifiedById;
    }


    /**
     * Gets the modifiedBy value for this Revenue.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this Revenue.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the accountName value for this Revenue.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this Revenue.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the accountId value for this Revenue.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Revenue.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountIntegrationId value for this Revenue.
     * 
     * @return accountIntegrationId
     */
    public java.lang.String getAccountIntegrationId() {
        return accountIntegrationId;
    }


    /**
     * Sets the accountIntegrationId value for this Revenue.
     * 
     * @param accountIntegrationId
     */
    public void setAccountIntegrationId(java.lang.String accountIntegrationId) {
        this.accountIntegrationId = accountIntegrationId;
    }


    /**
     * Gets the accountExternalId value for this Revenue.
     * 
     * @return accountExternalId
     */
    public java.lang.String getAccountExternalId() {
        return accountExternalId;
    }


    /**
     * Sets the accountExternalId value for this Revenue.
     * 
     * @param accountExternalId
     */
    public void setAccountExternalId(java.lang.String accountExternalId) {
        this.accountExternalId = accountExternalId;
    }


    /**
     * Gets the contactId value for this Revenue.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this Revenue.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the contactIntegrationId value for this Revenue.
     * 
     * @return contactIntegrationId
     */
    public java.lang.String getContactIntegrationId() {
        return contactIntegrationId;
    }


    /**
     * Sets the contactIntegrationId value for this Revenue.
     * 
     * @param contactIntegrationId
     */
    public void setContactIntegrationId(java.lang.String contactIntegrationId) {
        this.contactIntegrationId = contactIntegrationId;
    }


    /**
     * Gets the contactExternalId value for this Revenue.
     * 
     * @return contactExternalId
     */
    public java.lang.String getContactExternalId() {
        return contactExternalId;
    }


    /**
     * Sets the contactExternalId value for this Revenue.
     * 
     * @param contactExternalId
     */
    public void setContactExternalId(java.lang.String contactExternalId) {
        this.contactExternalId = contactExternalId;
    }


    /**
     * Gets the ownerId value for this Revenue.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Revenue.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the owner value for this Revenue.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Revenue.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerIntegrationId value for this Revenue.
     * 
     * @return ownerIntegrationId
     */
    public java.lang.String getOwnerIntegrationId() {
        return ownerIntegrationId;
    }


    /**
     * Sets the ownerIntegrationId value for this Revenue.
     * 
     * @param ownerIntegrationId
     */
    public void setOwnerIntegrationId(java.lang.String ownerIntegrationId) {
        this.ownerIntegrationId = ownerIntegrationId;
    }


    /**
     * Gets the ownerExternalId value for this Revenue.
     * 
     * @return ownerExternalId
     */
    public java.lang.String getOwnerExternalId() {
        return ownerExternalId;
    }


    /**
     * Sets the ownerExternalId value for this Revenue.
     * 
     * @param ownerExternalId
     */
    public void setOwnerExternalId(java.lang.String ownerExternalId) {
        this.ownerExternalId = ownerExternalId;
    }


    /**
     * Gets the opportunityName value for this Revenue.
     * 
     * @return opportunityName
     */
    public java.lang.String getOpportunityName() {
        return opportunityName;
    }


    /**
     * Sets the opportunityName value for this Revenue.
     * 
     * @param opportunityName
     */
    public void setOpportunityName(java.lang.String opportunityName) {
        this.opportunityName = opportunityName;
    }


    /**
     * Gets the opportunityIntegrationId value for this Revenue.
     * 
     * @return opportunityIntegrationId
     */
    public java.lang.String getOpportunityIntegrationId() {
        return opportunityIntegrationId;
    }


    /**
     * Sets the opportunityIntegrationId value for this Revenue.
     * 
     * @param opportunityIntegrationId
     */
    public void setOpportunityIntegrationId(java.lang.String opportunityIntegrationId) {
        this.opportunityIntegrationId = opportunityIntegrationId;
    }


    /**
     * Gets the opportunityExternalId value for this Revenue.
     * 
     * @return opportunityExternalId
     */
    public java.lang.String getOpportunityExternalId() {
        return opportunityExternalId;
    }


    /**
     * Sets the opportunityExternalId value for this Revenue.
     * 
     * @param opportunityExternalId
     */
    public void setOpportunityExternalId(java.lang.String opportunityExternalId) {
        this.opportunityExternalId = opportunityExternalId;
    }


    /**
     * Gets the opportunityId value for this Revenue.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this Revenue.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the salesStage value for this Revenue.
     * 
     * @return salesStage
     */
    public java.lang.String getSalesStage() {
        return salesStage;
    }


    /**
     * Sets the salesStage value for this Revenue.
     * 
     * @param salesStage
     */
    public void setSalesStage(java.lang.String salesStage) {
        this.salesStage = salesStage;
    }


    /**
     * Gets the productType value for this Revenue.
     * 
     * @return productType
     */
    public java.lang.String getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this Revenue.
     * 
     * @param productType
     */
    public void setProductType(java.lang.String productType) {
        this.productType = productType;
    }


    /**
     * Gets the productStatus value for this Revenue.
     * 
     * @return productStatus
     */
    public java.lang.String getProductStatus() {
        return productStatus;
    }


    /**
     * Sets the productStatus value for this Revenue.
     * 
     * @param productStatus
     */
    public void setProductStatus(java.lang.String productStatus) {
        this.productStatus = productStatus;
    }


    /**
     * Gets the expectedRevenue value for this Revenue.
     * 
     * @return expectedRevenue
     */
    public java.lang.String getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this Revenue.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(java.lang.String expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the assetValue value for this Revenue.
     * 
     * @return assetValue
     */
    public java.lang.String getAssetValue() {
        return assetValue;
    }


    /**
     * Sets the assetValue value for this Revenue.
     * 
     * @param assetValue
     */
    public void setAssetValue(java.lang.String assetValue) {
        this.assetValue = assetValue;
    }


    /**
     * Gets the premium value for this Revenue.
     * 
     * @return premium
     */
    public java.lang.String getPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this Revenue.
     * 
     * @param premium
     */
    public void setPremium(java.lang.String premium) {
        this.premium = premium;
    }


    /**
     * Gets the shipDate value for this Revenue.
     * 
     * @return shipDate
     */
    public java.lang.String getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this Revenue.
     * 
     * @param shipDate
     */
    public void setShipDate(java.lang.String shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the purchaseDate value for this Revenue.
     * 
     * @return purchaseDate
     */
    public java.lang.String getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this Revenue.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(java.lang.String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the serialNumber value for this Revenue.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this Revenue.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the warranty value for this Revenue.
     * 
     * @return warranty
     */
    public java.lang.String getWarranty() {
        return warranty;
    }


    /**
     * Sets the warranty value for this Revenue.
     * 
     * @param warranty
     */
    public void setWarranty(java.lang.String warranty) {
        this.warranty = warranty;
    }


    /**
     * Gets the probability value for this Revenue.
     * 
     * @return probability
     */
    public java.lang.String getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Revenue.
     * 
     * @param probability
     */
    public void setProbability(java.lang.String probability) {
        this.probability = probability;
    }


    /**
     * Gets the contract value for this Revenue.
     * 
     * @return contract
     */
    public java.lang.String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this Revenue.
     * 
     * @param contract
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }


    /**
     * Gets the indexedBoolean0 value for this Revenue.
     * 
     * @return indexedBoolean0
     */
    public java.lang.String getIndexedBoolean0() {
        return indexedBoolean0;
    }


    /**
     * Sets the indexedBoolean0 value for this Revenue.
     * 
     * @param indexedBoolean0
     */
    public void setIndexedBoolean0(java.lang.String indexedBoolean0) {
        this.indexedBoolean0 = indexedBoolean0;
    }


    /**
     * Gets the indexedCurrency0 value for this Revenue.
     * 
     * @return indexedCurrency0
     */
    public java.lang.String getIndexedCurrency0() {
        return indexedCurrency0;
    }


    /**
     * Sets the indexedCurrency0 value for this Revenue.
     * 
     * @param indexedCurrency0
     */
    public void setIndexedCurrency0(java.lang.String indexedCurrency0) {
        this.indexedCurrency0 = indexedCurrency0;
    }


    /**
     * Gets the indexedDate0 value for this Revenue.
     * 
     * @return indexedDate0
     */
    public java.lang.String getIndexedDate0() {
        return indexedDate0;
    }


    /**
     * Sets the indexedDate0 value for this Revenue.
     * 
     * @param indexedDate0
     */
    public void setIndexedDate0(java.lang.String indexedDate0) {
        this.indexedDate0 = indexedDate0;
    }


    /**
     * Gets the indexedLongText0 value for this Revenue.
     * 
     * @return indexedLongText0
     */
    public java.lang.String getIndexedLongText0() {
        return indexedLongText0;
    }


    /**
     * Sets the indexedLongText0 value for this Revenue.
     * 
     * @param indexedLongText0
     */
    public void setIndexedLongText0(java.lang.String indexedLongText0) {
        this.indexedLongText0 = indexedLongText0;
    }


    /**
     * Gets the indexedNumber0 value for this Revenue.
     * 
     * @return indexedNumber0
     */
    public java.lang.String getIndexedNumber0() {
        return indexedNumber0;
    }


    /**
     * Sets the indexedNumber0 value for this Revenue.
     * 
     * @param indexedNumber0
     */
    public void setIndexedNumber0(java.lang.String indexedNumber0) {
        this.indexedNumber0 = indexedNumber0;
    }


    /**
     * Gets the indexedPick0 value for this Revenue.
     * 
     * @return indexedPick0
     */
    public java.lang.String getIndexedPick0() {
        return indexedPick0;
    }


    /**
     * Sets the indexedPick0 value for this Revenue.
     * 
     * @param indexedPick0
     */
    public void setIndexedPick0(java.lang.String indexedPick0) {
        this.indexedPick0 = indexedPick0;
    }


    /**
     * Gets the indexedPick1 value for this Revenue.
     * 
     * @return indexedPick1
     */
    public java.lang.String getIndexedPick1() {
        return indexedPick1;
    }


    /**
     * Sets the indexedPick1 value for this Revenue.
     * 
     * @param indexedPick1
     */
    public void setIndexedPick1(java.lang.String indexedPick1) {
        this.indexedPick1 = indexedPick1;
    }


    /**
     * Gets the indexedPick2 value for this Revenue.
     * 
     * @return indexedPick2
     */
    public java.lang.String getIndexedPick2() {
        return indexedPick2;
    }


    /**
     * Sets the indexedPick2 value for this Revenue.
     * 
     * @param indexedPick2
     */
    public void setIndexedPick2(java.lang.String indexedPick2) {
        this.indexedPick2 = indexedPick2;
    }


    /**
     * Gets the indexedPick3 value for this Revenue.
     * 
     * @return indexedPick3
     */
    public java.lang.String getIndexedPick3() {
        return indexedPick3;
    }


    /**
     * Sets the indexedPick3 value for this Revenue.
     * 
     * @param indexedPick3
     */
    public void setIndexedPick3(java.lang.String indexedPick3) {
        this.indexedPick3 = indexedPick3;
    }


    /**
     * Gets the indexedPick4 value for this Revenue.
     * 
     * @return indexedPick4
     */
    public java.lang.String getIndexedPick4() {
        return indexedPick4;
    }


    /**
     * Sets the indexedPick4 value for this Revenue.
     * 
     * @param indexedPick4
     */
    public void setIndexedPick4(java.lang.String indexedPick4) {
        this.indexedPick4 = indexedPick4;
    }


    /**
     * Gets the indexedPick5 value for this Revenue.
     * 
     * @return indexedPick5
     */
    public java.lang.String getIndexedPick5() {
        return indexedPick5;
    }


    /**
     * Sets the indexedPick5 value for this Revenue.
     * 
     * @param indexedPick5
     */
    public void setIndexedPick5(java.lang.String indexedPick5) {
        this.indexedPick5 = indexedPick5;
    }


    /**
     * Gets the indexedShortText0 value for this Revenue.
     * 
     * @return indexedShortText0
     */
    public java.lang.String getIndexedShortText0() {
        return indexedShortText0;
    }


    /**
     * Sets the indexedShortText0 value for this Revenue.
     * 
     * @param indexedShortText0
     */
    public void setIndexedShortText0(java.lang.String indexedShortText0) {
        this.indexedShortText0 = indexedShortText0;
    }


    /**
     * Gets the indexedShortText1 value for this Revenue.
     * 
     * @return indexedShortText1
     */
    public java.lang.String getIndexedShortText1() {
        return indexedShortText1;
    }


    /**
     * Sets the indexedShortText1 value for this Revenue.
     * 
     * @param indexedShortText1
     */
    public void setIndexedShortText1(java.lang.String indexedShortText1) {
        this.indexedShortText1 = indexedShortText1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Revenue)) return false;
        Revenue other = (Revenue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetCurrency==null && other.getAssetCurrency()==null) || 
             (this.assetCurrency!=null &&
              this.assetCurrency.equals(other.getAssetCurrency()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productExternalId==null && other.getProductExternalId()==null) || 
             (this.productExternalId!=null &&
              this.productExternalId.equals(other.getProductExternalId()))) &&
            ((this.productIntegrationId==null && other.getProductIntegrationId()==null) || 
             (this.productIntegrationId!=null &&
              this.productIntegrationId.equals(other.getProductIntegrationId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.productCategoryId==null && other.getProductCategoryId()==null) || 
             (this.productCategoryId!=null &&
              this.productCategoryId.equals(other.getProductCategoryId()))) &&
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              this.productCategory.equals(other.getProductCategory()))) &&
            ((this.productCategoryExternalId==null && other.getProductCategoryExternalId()==null) || 
             (this.productCategoryExternalId!=null &&
              this.productCategoryExternalId.equals(other.getProductCategoryExternalId()))) &&
            ((this.productCategoryIntegrationId==null && other.getProductCategoryIntegrationId()==null) || 
             (this.productCategoryIntegrationId!=null &&
              this.productCategoryIntegrationId.equals(other.getProductCategoryIntegrationId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.purchasePrice==null && other.getPurchasePrice()==null) || 
             (this.purchasePrice!=null &&
              this.purchasePrice.equals(other.getPurchasePrice()))) &&
            ((this.forecast==null && other.getForecast()==null) || 
             (this.forecast!=null &&
              this.forecast.equals(other.getForecast()))) &&
            ((this.revenue==null && other.getRevenue()==null) || 
             (this.revenue!=null &&
              this.revenue.equals(other.getRevenue()))) &&
            ((this.contactFullName==null && other.getContactFullName()==null) || 
             (this.contactFullName!=null &&
              this.contactFullName.equals(other.getContactFullName()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.numberOfPeriods==null && other.getNumberOfPeriods()==null) || 
             (this.numberOfPeriods!=null &&
              this.numberOfPeriods.equals(other.getNumberOfPeriods()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.revenueId==null && other.getRevenueId()==null) || 
             (this.revenueId!=null &&
              this.revenueId.equals(other.getRevenueId()))) &&
            ((this.bReset_Dates==null && other.getBReset_Dates()==null) || 
             (this.bReset_Dates!=null &&
              this.bReset_Dates.equals(other.getBReset_Dates()))) &&
            ((this.stOriginal_Dates==null && other.getStOriginal_Dates()==null) || 
             (this.stOriginal_Dates!=null &&
              this.stOriginal_Dates.equals(other.getStOriginal_Dates()))) &&
            ((this.integrationId==null && other.getIntegrationId()==null) || 
             (this.integrationId!=null &&
              this.integrationId.equals(other.getIntegrationId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.startCloseDate==null && other.getStartCloseDate()==null) || 
             (this.startCloseDate!=null &&
              this.startCloseDate.equals(other.getStartCloseDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.modifiedById==null && other.getModifiedById()==null) || 
             (this.modifiedById!=null &&
              this.modifiedById.equals(other.getModifiedById()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountIntegrationId==null && other.getAccountIntegrationId()==null) || 
             (this.accountIntegrationId!=null &&
              this.accountIntegrationId.equals(other.getAccountIntegrationId()))) &&
            ((this.accountExternalId==null && other.getAccountExternalId()==null) || 
             (this.accountExternalId!=null &&
              this.accountExternalId.equals(other.getAccountExternalId()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.contactIntegrationId==null && other.getContactIntegrationId()==null) || 
             (this.contactIntegrationId!=null &&
              this.contactIntegrationId.equals(other.getContactIntegrationId()))) &&
            ((this.contactExternalId==null && other.getContactExternalId()==null) || 
             (this.contactExternalId!=null &&
              this.contactExternalId.equals(other.getContactExternalId()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerIntegrationId==null && other.getOwnerIntegrationId()==null) || 
             (this.ownerIntegrationId!=null &&
              this.ownerIntegrationId.equals(other.getOwnerIntegrationId()))) &&
            ((this.ownerExternalId==null && other.getOwnerExternalId()==null) || 
             (this.ownerExternalId!=null &&
              this.ownerExternalId.equals(other.getOwnerExternalId()))) &&
            ((this.opportunityName==null && other.getOpportunityName()==null) || 
             (this.opportunityName!=null &&
              this.opportunityName.equals(other.getOpportunityName()))) &&
            ((this.opportunityIntegrationId==null && other.getOpportunityIntegrationId()==null) || 
             (this.opportunityIntegrationId!=null &&
              this.opportunityIntegrationId.equals(other.getOpportunityIntegrationId()))) &&
            ((this.opportunityExternalId==null && other.getOpportunityExternalId()==null) || 
             (this.opportunityExternalId!=null &&
              this.opportunityExternalId.equals(other.getOpportunityExternalId()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.salesStage==null && other.getSalesStage()==null) || 
             (this.salesStage!=null &&
              this.salesStage.equals(other.getSalesStage()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.productStatus==null && other.getProductStatus()==null) || 
             (this.productStatus!=null &&
              this.productStatus.equals(other.getProductStatus()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.assetValue==null && other.getAssetValue()==null) || 
             (this.assetValue!=null &&
              this.assetValue.equals(other.getAssetValue()))) &&
            ((this.premium==null && other.getPremium()==null) || 
             (this.premium!=null &&
              this.premium.equals(other.getPremium()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.warranty==null && other.getWarranty()==null) || 
             (this.warranty!=null &&
              this.warranty.equals(other.getWarranty()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
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
        if (getAssetCurrency() != null) {
            _hashCode += getAssetCurrency().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductExternalId() != null) {
            _hashCode += getProductExternalId().hashCode();
        }
        if (getProductIntegrationId() != null) {
            _hashCode += getProductIntegrationId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProductCategoryId() != null) {
            _hashCode += getProductCategoryId().hashCode();
        }
        if (getProductCategory() != null) {
            _hashCode += getProductCategory().hashCode();
        }
        if (getProductCategoryExternalId() != null) {
            _hashCode += getProductCategoryExternalId().hashCode();
        }
        if (getProductCategoryIntegrationId() != null) {
            _hashCode += getProductCategoryIntegrationId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getPurchasePrice() != null) {
            _hashCode += getPurchasePrice().hashCode();
        }
        if (getForecast() != null) {
            _hashCode += getForecast().hashCode();
        }
        if (getRevenue() != null) {
            _hashCode += getRevenue().hashCode();
        }
        if (getContactFullName() != null) {
            _hashCode += getContactFullName().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getNumberOfPeriods() != null) {
            _hashCode += getNumberOfPeriods().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRevenueId() != null) {
            _hashCode += getRevenueId().hashCode();
        }
        if (getBReset_Dates() != null) {
            _hashCode += getBReset_Dates().hashCode();
        }
        if (getStOriginal_Dates() != null) {
            _hashCode += getStOriginal_Dates().hashCode();
        }
        if (getIntegrationId() != null) {
            _hashCode += getIntegrationId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStartCloseDate() != null) {
            _hashCode += getStartCloseDate().hashCode();
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
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getModifiedById() != null) {
            _hashCode += getModifiedById().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountIntegrationId() != null) {
            _hashCode += getAccountIntegrationId().hashCode();
        }
        if (getAccountExternalId() != null) {
            _hashCode += getAccountExternalId().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContactIntegrationId() != null) {
            _hashCode += getContactIntegrationId().hashCode();
        }
        if (getContactExternalId() != null) {
            _hashCode += getContactExternalId().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerIntegrationId() != null) {
            _hashCode += getOwnerIntegrationId().hashCode();
        }
        if (getOwnerExternalId() != null) {
            _hashCode += getOwnerExternalId().hashCode();
        }
        if (getOpportunityName() != null) {
            _hashCode += getOpportunityName().hashCode();
        }
        if (getOpportunityIntegrationId() != null) {
            _hashCode += getOpportunityIntegrationId().hashCode();
        }
        if (getOpportunityExternalId() != null) {
            _hashCode += getOpportunityExternalId().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getSalesStage() != null) {
            _hashCode += getSalesStage().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getProductStatus() != null) {
            _hashCode += getProductStatus().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getAssetValue() != null) {
            _hashCode += getAssetValue().hashCode();
        }
        if (getPremium() != null) {
            _hashCode += getPremium().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getWarranty() != null) {
            _hashCode += getWarranty().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
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
        new org.apache.axis.description.TypeDesc(Revenue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssetCurrency"));
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
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productIntegrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductIntegrationId"));
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
        elemField.setFieldName("productCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategoryExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductCategoryExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategoryIntegrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductCategoryIntegrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Forecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Revenue"));
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
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "NumberOfPeriods"));
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
        elemField.setFieldName("revenueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "RevenueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BReset_Dates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "bReset_Dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stOriginal_Dates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "stOriginal_Dates"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "StartCloseDate"));
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
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountName"));
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
        elemField.setFieldName("accountIntegrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountIntegrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AccountExternalId"));
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
        elemField.setFieldName("contactIntegrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactIntegrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ContactExternalId"));
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
        elemField.setFieldName("ownerIntegrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerIntegrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OwnerExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OpportunityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityIntegrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OpportunityIntegrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "OpportunityExternalId"));
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
        elemField.setFieldName("salesStage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "SalesStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ProductStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ExpectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "AssetValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premium");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Premium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "PurchaseDate"));
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
        elemField.setFieldName("warranty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Warranty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:/crmondemand/xml/contact", "Contract"));
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
