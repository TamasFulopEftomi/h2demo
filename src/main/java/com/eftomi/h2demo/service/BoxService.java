package com.eftomi.h2demo.service;

import com.eftomi.h2demo.model.Box;
import com.eftomi.h2demo.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxService {

    @Autowired
    private BoxRepository boxRepository;

    public List<Box> getBoxes() {
        return (List<Box>) boxRepository.findAll();
    }
}
