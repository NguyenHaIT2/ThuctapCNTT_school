package com.example.service;

import com.example.entity.HocsinhEntity;
import com.example.repository.HocsinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HocsinhService{
    @Autowired
    HocsinhRepository repository;
    public List<HocsinhEntity> getAllHocsinh() {
        List<HocsinhEntity> HocsinhList = new ArrayList<HocsinhEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(HocsinhList::add);

        if (HocsinhList.size() > 0) {
            return HocsinhList;
        } else {
            return new ArrayList<HocsinhEntity>();
        }
    }

    public List<HocsinhEntity> getHocsinhByTenLike(String ten) {
        List<HocsinhEntity> HocsinhList = new ArrayList<HocsinhEntity>();
        repository.findHocsinhByTenLike(ten).forEach(HocsinhList::add);
        if (HocsinhList.size() > 0) {
            return HocsinhList;
        } else {
            return new ArrayList<HocsinhEntity>();
        }
    }

    public List<HocsinhEntity> getHocsinhByGiaovienLike(long ma) {
        List<HocsinhEntity> HocsinhList = new ArrayList<HocsinhEntity>();
        repository.findHocsinhByMagiaovien(ma).forEach(HocsinhList::add);
        if (HocsinhList.size() > 0) {
            return HocsinhList;
        } else {
            return new ArrayList<HocsinhEntity>();
        }
    }
    public List<HocsinhEntity> getHocsinhByLopLike(long ma) {
        List<HocsinhEntity> HocsinhList = new ArrayList<HocsinhEntity>();
        repository.findHocsinhByMalop(ma).forEach(HocsinhList::add);
        if (HocsinhList.size() > 0) {
            return HocsinhList;
        } else {
            return new ArrayList<HocsinhEntity>();
        }
    }

    public HocsinhEntity getHocsinhById(long id) throws Exception {
        Optional<HocsinhEntity> hocsinh  = repository.findById(id);

        if (hocsinh.isPresent()) {
            return hocsinh.get();
        } else {
            throw new Exception("No hoc sinh record exist for given id");
        }
    }

    public HocsinhEntity createOrUpdateHocsinh(HocsinhEntity entity) throws Exception {
        Optional<HocsinhEntity> hocsinh  = repository.findById(entity.getId());

        if (hocsinh.isPresent())
        {
            HocsinhEntity newEntity = hocsinh.get();
            newEntity.setTen(entity.getTen());
            newEntity.setNgaysinh(entity.getNgaysinh());
            newEntity.setMagiaovien(entity.getMagiaovien());
            newEntity.setMaphuhuynh(entity.getMaphuhuynh());
            newEntity.setMalop(entity.getMalop());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteHocsinhById(long id) throws Exception {
        Optional<HocsinhEntity> hocsinh  = repository.findById(id);

        if (hocsinh.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No hinh anh record exist for given id");
        }
    }


}
