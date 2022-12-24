package org.maren.phd.controller;


import org.maren.phd.entity.Application;
import org.maren.phd.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/application")
    public Application createApplication(
            @RequestBody Application application) {
        return applicationService.createApplication(application);
    }

    @GetMapping("/application")
    public List<Application> fetchApplication() {
        return applicationService.fetchApplication();
    }

    @GetMapping("/application{id}")
    public Optional<Application> fetchApplication(@PathVariable("id") Long applicationId) {
        return applicationService.fetchApplication(applicationId);
    }
}
