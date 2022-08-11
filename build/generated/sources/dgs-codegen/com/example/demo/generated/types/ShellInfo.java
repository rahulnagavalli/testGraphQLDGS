package com.example.demo.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ShellInfo {
  private String offerName;

  private String offerId;

  private String rateCardId;

  private Integer dateAdded;

  public ShellInfo() {
  }

  public ShellInfo(String offerName, String offerId, String rateCardId, Integer dateAdded) {
    this.offerName = offerName;
    this.offerId = offerId;
    this.rateCardId = rateCardId;
    this.dateAdded = dateAdded;
  }

  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public String getRateCardId() {
    return rateCardId;
  }

  public void setRateCardId(String rateCardId) {
    this.rateCardId = rateCardId;
  }

  public Integer getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(Integer dateAdded) {
    this.dateAdded = dateAdded;
  }

  @Override
  public String toString() {
    return "ShellInfo{" + "offerName='" + offerName + "'," +"offerId='" + offerId + "'," +"rateCardId='" + rateCardId + "'," +"dateAdded='" + dateAdded + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShellInfo that = (ShellInfo) o;
        return java.util.Objects.equals(offerName, that.offerName) &&
                            java.util.Objects.equals(offerId, that.offerId) &&
                            java.util.Objects.equals(rateCardId, that.rateCardId) &&
                            java.util.Objects.equals(dateAdded, that.dateAdded);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(offerName, offerId, rateCardId, dateAdded);
  }

  public static com.example.demo.generated.types.ShellInfo.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String offerName;

    private String offerId;

    private String rateCardId;

    private Integer dateAdded;

    public ShellInfo build() {
                  com.example.demo.generated.types.ShellInfo result = new com.example.demo.generated.types.ShellInfo();
                      result.offerName = this.offerName;
          result.offerId = this.offerId;
          result.rateCardId = this.rateCardId;
          result.dateAdded = this.dateAdded;
                      return result;
    }

    public com.example.demo.generated.types.ShellInfo.Builder offerName(String offerName) {
      this.offerName = offerName;
      return this;
    }

    public com.example.demo.generated.types.ShellInfo.Builder offerId(String offerId) {
      this.offerId = offerId;
      return this;
    }

    public com.example.demo.generated.types.ShellInfo.Builder rateCardId(String rateCardId) {
      this.rateCardId = rateCardId;
      return this;
    }

    public com.example.demo.generated.types.ShellInfo.Builder dateAdded(Integer dateAdded) {
      this.dateAdded = dateAdded;
      return this;
    }
  }
}
