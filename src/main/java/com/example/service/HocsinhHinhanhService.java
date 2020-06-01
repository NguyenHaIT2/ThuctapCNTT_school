package com.example.service;

import com.example.entity.HocsinhDenEntity;
import com.example.entity.HocsinhEntity;
import com.example.entity.HocsinhHinhanhEntity;
import com.example.repository.HocsinhHinhanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HocsinhHinhanhService{
    @Autowired
    HocsinhHinhanhRepository repository;
    public List<HocsinhHinhanhEntity> getAllHocsinhHinhanh() {
        List<HocsinhHinhanhEntity> list = new ArrayList<HocsinhHinhanhEntity>();
        repository.findAll(Sort.by("mahocsinh").descending()).forEach(list::add);

        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhHinhanhEntity>();
        }
    }
    public List<HocsinhHinhanhEntity> getHocsinhHinhanhByMahocsinh(long mahocsinh ) throws Exception{
        List<HocsinhHinhanhEntity> list = new ArrayList<HocsinhHinhanhEntity>();
        repository.findByMahocsinh(mahocsinh).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhHinhanhEntity>();
        }
    }

    public List<HocsinhHinhanhEntity> getHocsinhHinhanhByMahinhanh(long mahinhanh) throws Exception{
        List<HocsinhHinhanhEntity> list = new ArrayList<HocsinhHinhanhEntity>();
        repository.findByMahinhanh(mahinhanh).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhHinhanhEntity>();
        }
    }
    public HocsinhHinhanhEntity createOrUpdateHocsinhhinhanh(HocsinhHinhanhEntity entity) throws Exception {

        Optional<HocsinhHinhanhEntity> hocsinhhinhanh  = repository.findById(entity.getId());

        if (hocsinhhinhanh.isPresent())
        {
        	HocsinhHinhanhEntity newEntity = hocsinhhinhanh.get();
            newEntity.setMahinhanh(entity.getMahinhanh());
            newEntity.setMahocsinh(entity.getMahocsinh());         
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }


}
