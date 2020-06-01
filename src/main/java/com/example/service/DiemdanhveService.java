package com.example.service;

import com.example.repository.DiemdanhveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiemdanhveService{
    @Autowired
    DiemdanhveRepository repository;
}
