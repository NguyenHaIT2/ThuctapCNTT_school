package com.example.service;

import com.example.entity.HocsinhEntity;
import com.example.repository.DiemdanhdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemdanhdenService{
    @Autowired
    DiemdanhdenRepository repository;
}
