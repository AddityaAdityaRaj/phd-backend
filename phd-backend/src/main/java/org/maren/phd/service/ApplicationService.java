package org.maren.phd.service;

import org.maren.phd.entity.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    // Create
    Application createApplication(Application application);

    // Read ALL
    List<Application> fetchApplication();

    // Read by ID
    Optional<Application> fetchApplication(Long applicationId);
}
