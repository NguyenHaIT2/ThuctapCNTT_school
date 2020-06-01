package com.example.service;

import com.example.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService{
    @Autowired
    GroupRepository repository;
}
