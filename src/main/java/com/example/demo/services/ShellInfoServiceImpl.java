package com.example.demo.services;

import com.example.demo.generated.types.ShellInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ShellInfoServiceImpl implements ShellInfoService {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    public List<ShellInfo> fetchShellInfo() {
        List<ShellInfo> shellInfo = null;
        ShellInfo[] shellInfo1 = restTemplate().getForObject("http://localhost:8993/getShellRatecards", ShellInfo[].class);
        if (shellInfo != null && shellInfo1.length != 0)
            return Arrays.asList(shellInfo1);
        else
            return shellInfo;
    }
}
