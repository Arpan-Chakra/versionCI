package com.versionci.restservice;

import com.versionci.model.MyApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@Service
public class VersionCIController {

    private static final String description = "pre-interview technical test";
    private static final String lastCommitSha = "0aa89dd70841fd2fba2520ed458b7e8cc6b04f45"; //Retrieved from git log
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/version")
    public MyApplication fetchAppVersionDetails() {
        return new MyApplication(counter.incrementAndGet(), lastCommitSha, description);
    }
}
