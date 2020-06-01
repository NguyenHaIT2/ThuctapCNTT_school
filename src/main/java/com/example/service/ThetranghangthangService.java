package com.example.service;

import com.example.repository.ThetranghangthangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThetranghangthangService{
    @Autowired
    ThetranghangthangRepository repository;
}
