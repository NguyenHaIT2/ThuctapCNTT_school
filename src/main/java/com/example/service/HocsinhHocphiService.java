package com.example.service;

import com.example.entity.HocsinhEntity;
import com.example.entity.HocsinhHocphiEntity;
import com.example.entity.LopEntity;
import com.example.repository.HocsinhHocphiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HocsinhHocphiService{
    @Autowired
    HocsinhHocphiRepository repository;
    public List<HocsinhHocphiEntity> getAll() {
        List<HocsinhHocphiEntity> list = new ArrayList<HocsinhHocphiEntity>();
        repository.findAll().forEach(list::add);

        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhHocphiEntity>();
        }
    }
    public HocsinhHocphiEntity getHocsinHocphihById(long id) throws Exception {
        Optional<HocsinhHocphiEntity> t  = repository.findById(id);

        if (t.isPresent()) {
            return t.get();
        } else {
            throw new Exception("No obj record exist for given id");
        }
    }
    public List<HocsinhHocphiEntity> getHocphiByTinhtrang(int t) throws Exception{
        List<HocsinhHocphiEntity> tt = new ArrayList<HocsinhHocphiEntity>();
        repository.findByTinhtrang(t).forEach(tt::add);
        if (tt.size() > 0) {
            return tt;
        } else {
            return new ArrayList<HocsinhHocphiEntity>();
        }
    }

    public List<HocsinhHocphiEntity> getHocphiByThang(int nam, int thang) throws Exception{
        List<HocsinhHocphiEntity> t = new ArrayList<HocsinhHocphiEntity>();
        repository.findByNamAndThang(nam, thang).forEach(t::add);
        if (t.size() > 0) {
            return t;
        } else {
            return new ArrayList<HocsinhHocphiEntity>();
        }
    }
    public List<HocsinhHocphiEntity> getHocphiByHocsinh(long mahocsinh ) throws Exception{
        List<HocsinhHocphiEntity> tt = new ArrayList<HocsinhHocphiEntity>();
        repository.findByMahocsinh(mahocsinh).forEach(tt::add);
        if (tt.size() > 0) {
            return tt;
        } else {
            return new ArrayList<HocsinhHocphiEntity>();
        }
    }
    public HocsinhHocphiEntity createOrUpdateHocphi(HocsinhHocphiEntity entity) throws Exception {
        Optional<HocsinhHocphiEntity> hp  = repository.findById(entity.getId());

        if (hp.isPresent())
        {
            HocsinhHocphiEntity newEntity = hp.get();
            newEntity.setMahocsinh(entity.getMahocsinh());
            newEntity.setThang(entity.getThang());
            newEntity.setNam(entity.getNam());
            newEntity.setTinhtrang(entity.getTinhtrang());
            newEntity.setSotien(entity.getSotien());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    // cap nhạt trang thai thanh toan
    public HocsinhHocphiEntity capnhattrangthai(HocsinhHocphiEntity entity) throws Exception {
        Optional<HocsinhHocphiEntity> hp  = repository.findById(entity.getId());

        if (hp.isPresent())
        {
            HocsinhHocphiEntity newEntity = hp.get();
            newEntity.setTinhtrang(entity.getTinhtrang());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteHocPhiById(long id) throws Exception {
        Optional<HocsinhHocphiEntity> lop  = repository.findById(id);

        if (lop.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No obj record exist for given id");
        }
    }
}
