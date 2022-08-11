package com.example.demo.generated.datafetchers;

import com.example.demo.generated.types.ShellInfo;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class FetchShellInfoDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "fetchShellInfo"
  )
  public List<ShellInfo> getFetchShellInfo(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
