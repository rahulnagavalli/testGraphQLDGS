package com.example.demo.services;

import com.example.demo.generated.types.ShellInfo;

import java.util.List;

public interface ShellInfoService {
    List<ShellInfo> fetchShellInfo();
}
