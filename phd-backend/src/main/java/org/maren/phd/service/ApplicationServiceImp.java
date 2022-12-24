package org.maren.phd.service;

import org.maren.phd.entity.Application;
import org.maren.phd.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImp implements ApplicationService{

    @Autowired
    private ApplicationRepository applicationRepository;


    @Override
    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public List<Application> fetchApplication() {
        return (List<Application>) applicationRepository.findAll();
    }

    @Override
    public Optional<Application> fetchApplication(Long applicationId) {
        return applicationRepository.findById(applicationId);
    }
}
