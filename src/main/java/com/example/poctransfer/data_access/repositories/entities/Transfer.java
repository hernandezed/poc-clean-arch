package com.example.poctransfer.data_access.repositories.entities;

import com.example.poctransfer.business.domain.BeneficiaryType;
import com.example.poctransfer.data_access.repositories.converter.AdditionalDataConverter;
import com.example.poctransfer.enums.ConceptType;
import com.example.poctransfer.enums.ConsumerType;
import com.example.poctransfer.enums.OperationType;
import org.hibernate.type.CurrencyType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class Transfer {

    @Id
    private BigInteger id;
    @Enumerated(EnumType.STRING)
    protected ConsumerType consumerType;
    @Enumerated(EnumType.STRING)
    protected OperationType operationType;
    @Lob
    @Convert(converter = AdditionalDataConverter.class)
    protected String jsonAdditionalData;
    protected String legacyCode;
    private String issuerAccountId;
    private String issuerTaxPayerId;
    @Enumerated(EnumType.STRING)
    private BeneficiaryType beneficiaryType;
    private String beneficiaryValue;
    private String beneficiaryTaxPayerId;
    private String beneficiaryBankCode;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private CurrencyType currency;
    @Enumerated(EnumType.STRING)
    private ConceptType concept;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public ConsumerType getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(ConsumerType consumerType) {
        this.consumerType = consumerType;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public String getJsonAdditionalData() {
        return jsonAdditionalData;
    }

    public void setJsonAdditionalData(String jsonAdditionalData) {
        this.jsonAdditionalData = jsonAdditionalData;
    }

    public String getLegacyCode() {
        return legacyCode;
    }

    public void setLegacyCode(String legacyCode) {
        this.legacyCode = legacyCode;
    }

    public String getIssuerAccountId() {
        return issuerAccountId;
    }

    public void setIssuerAccountId(String issuerAccountId) {
        this.issuerAccountId = issuerAccountId;
    }

    public String getIssuerTaxPayerId() {
        return issuerTaxPayerId;
    }

    public void setIssuerTaxPayerId(String issuerTaxPayerId) {
        this.issuerTaxPayerId = issuerTaxPayerId;
    }

    public BeneficiaryType getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(BeneficiaryType beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public String getBeneficiaryValue() {
        return beneficiaryValue;
    }

    public void setBeneficiaryValue(String beneficiaryValue) {
        this.beneficiaryValue = beneficiaryValue;
    }

    public String getBeneficiaryTaxPayerId() {
        return beneficiaryTaxPayerId;
    }

    public void setBeneficiaryTaxPayerId(String beneficiaryTaxPayerId) {
        this.beneficiaryTaxPayerId = beneficiaryTaxPayerId;
    }

    public String getBeneficiaryBankCode() {
        return beneficiaryBankCode;
    }

    public void setBeneficiaryBankCode(String beneficiaryBankCode) {
        this.beneficiaryBankCode = beneficiaryBankCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public ConceptType getConcept() {
        return concept;
    }

    public void setConcept(ConceptType concept) {
        this.concept = concept;
    }
}
