package com.codegym.service;

import com.codegym.model.SmartPhone;
import com.codegym.repository.ISmartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartPhoneService {

    @Autowired
    ISmartRepository smartRepository;
    @Override
    public Iterable<SmartPhone> findAll() {
        return smartRepository.findAll();
    }

    @Override
    public Optional<SmartPhone> findById(Long id) {
        return smartRepository.findById(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return smartRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartRepository.deleteById(id);
    }
}
