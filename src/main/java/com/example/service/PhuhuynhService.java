package com.example.service;

import com.example.entity.GiaovienEntity;
import com.example.entity.PhuhuynhEntity;
import com.example.repository.PhuhuynhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PhuhuynhService{
    @Autowired
    PhuhuynhRepository repository;
    public List<PhuhuynhEntity> getAllPhuhuynh() {
        List<PhuhuynhEntity> phuhuynhlist = new ArrayList<PhuhuynhEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(phuhuynhlist::add);

        if (phuhuynhlist.size() > 0) {
            return phuhuynhlist;
        } else {
            return new ArrayList<PhuhuynhEntity>();
        }
    }
    public List<PhuhuynhEntity> getPhuhuynhByTenLike(String ten) {
        List<PhuhuynhEntity> phuhuynhlist = new ArrayList<PhuhuynhEntity>();
        repository.findPhuhuynhEntityByTen(ten).forEach(phuhuynhlist::add);
        if (phuhuynhlist.size() > 0) {
            return phuhuynhlist;
        } else {
            return new ArrayList<PhuhuynhEntity>();
        }
    }
    public PhuhuynhEntity getPhuhuynhById(long id) throws Exception {
        Optional<PhuhuynhEntity> phuhuynh = repository.findById(id);

        if (phuhuynh.isPresent()) {
            return phuhuynh.get();
        } else {
            throw new Exception("No phu huynh record exist for given id");
        }
    }
    public PhuhuynhEntity createOrUpdatePhuhuynh(PhuhuynhEntity entity) throws Exception {
        Optional<PhuhuynhEntity> phuhuynh  = repository.findById(entity.getId());

        if (phuhuynh.isPresent())
        {
            PhuhuynhEntity newEntity = phuhuynh.get();
            newEntity.setTen(entity.getTen());
            newEntity.setEmail(entity.getEmail());
            newEntity.setMatkhau(entity.getMatkhau());
            newEntity.setSdt(entity.getSdt());
            newEntity.setGroupid(entity.getGroupid());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deletePhuhuynhById(long id) throws Exception {
        Optional<PhuhuynhEntity> phuhuynh  = repository.findById(id);

        if (phuhuynh.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No phu huynh record exist for given id");
        }
    }
}
