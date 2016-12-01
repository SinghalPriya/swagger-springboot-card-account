package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * CardDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T18:09:28.587+05:30")
@JsonIgnoreProperties({"id", "revision"})
public class CardDetails   {
  @JsonProperty("Card_No")
  private Integer cardNumber = null;

  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("_rev")
  private String revision;
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }
  @JsonProperty("Customer_ID")
  private String customer_Id = null;




  public String getCustomer_Id() {
    return customer_Id;
  }

  public void setCustomer_Id(String customer_Id) {
    this.customer_Id = customer_Id;
  }

  @JsonProperty("Card_Type")
  private String cardType = null;

  @JsonProperty("Card_Status")
  private String cardStatus = null;

  @JsonProperty("Card_Start_date")
  private String startDate = null;

  @JsonProperty("Card_Exp_End_date")
  private String expiryDate = null;

  @JsonProperty("Card_Apply_Mode")
  private String cardApplyMode = null;

  public CardDetails cardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CardDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CardDetails cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public CardDetails cardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

   /**
   * Get cardStatus
   * @return cardStatus
  **/
  @ApiModelProperty(value = "")
  public String getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
  }

  public CardDetails startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CardDetails expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public CardDetails cardApplyMode(String cardApplyMode) {
    this.cardApplyMode = cardApplyMode;
    return this;
  }

   /**
   * Get cardApplyMode
   * @return cardApplyMode
  **/
  @ApiModelProperty(value = "")
  public String getCardApplyMode() {
    return cardApplyMode;
  }

  public void setCardApplyMode(String cardApplyMode) {
    this.cardApplyMode = cardApplyMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.cardNumber, cardDetails.cardNumber) &&
        Objects.equals(this.customer_Id, cardDetails.customer_Id) &&
        Objects.equals(this.cardType, cardDetails.cardType) &&
        Objects.equals(this.cardStatus, cardDetails.cardStatus) &&
        Objects.equals(this.startDate, cardDetails.startDate) &&
        Objects.equals(this.expiryDate, cardDetails.expiryDate) &&
        Objects.equals(this.cardApplyMode, cardDetails.cardApplyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, customer_Id, cardType, cardStatus, startDate, expiryDate, cardApplyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    customer_Id: ").append(toIndentedString(customer_Id)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    cardApplyMode: ").append(toIndentedString(cardApplyMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

