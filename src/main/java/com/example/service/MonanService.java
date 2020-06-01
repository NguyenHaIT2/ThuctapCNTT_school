package com.example.service;

import com.example.repository.MonanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonanService{
    @Autowired
    MonanRepository repository;
}
