package com.example.demo.datafetchers;

import com.example.demo.generated.types.ShellInfo;
import com.example.demo.services.ShellInfoService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ShellInfoDataFetcher {

    private final ShellInfoService shellInfoService;

    public ShellInfoDataFetcher(ShellInfoService shellInfoService) {
        this.shellInfoService = shellInfoService;
    }

    @DgsQuery
    public List<ShellInfo> fetchShellInfo(@InputArgument("rateCardId") String rateCardId) {
       if (rateCardId != null)
            return shellInfoService.fetchShellInfo().stream().filter(entry -> entry.getRateCardId().equals(rateCardId)).collect(Collectors.toList());
       else return shellInfoService.fetchShellInfo();
    }

}
