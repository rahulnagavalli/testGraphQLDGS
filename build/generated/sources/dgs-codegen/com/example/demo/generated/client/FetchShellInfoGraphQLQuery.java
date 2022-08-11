package com.example.demo.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class FetchShellInfoGraphQLQuery extends GraphQLQuery {
  public FetchShellInfoGraphQLQuery(String offerId, String rateCardId, Set<String> fieldsSet) {
    super("query");
    if (offerId != null || fieldsSet.contains("offerId")) {
        getInput().put("offerId", offerId);
    }if (rateCardId != null || fieldsSet.contains("rateCardId")) {
        getInput().put("rateCardId", rateCardId);
    }
  }

  public FetchShellInfoGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "fetchShellInfo";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String offerId;

    private String rateCardId;

    public FetchShellInfoGraphQLQuery build() {
      return new FetchShellInfoGraphQLQuery(offerId, rateCardId, fieldsSet);
               
    }

    public Builder offerId(String offerId) {
      this.offerId = offerId;
      this.fieldsSet.add("offerId");
      return this;
    }

    public Builder rateCardId(String rateCardId) {
      this.rateCardId = rateCardId;
      this.fieldsSet.add("rateCardId");
      return this;
    }
  }
}
