package com.example.controller;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.HocsinhEntity;
import com.example.service.HocsinhService;

import com.example.entity.DiemdanhdenEntity;
import com.example.service.DiemdanhdenService;

import com.example.entity.DiemdanhveEntity;
import com.example.service.DiemdanhveService;

import com.example.entity.*;
import com.example.service.*;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin 
@RequestMapping("/api")
public class DiemdanhController {
    @Autowired
    HocsinhService hocsinhService;

    @Autowired
    DiemdanhdenService diemdanhdenService;

    @Autowired
    DiemdanhveService diemdangveService;

    @Autowired
    HocsinhDenService hocsinhdenService;

    @Autowired
    HocsinhVeService hocsinhveService;


    //Danh sach hoc sinh
    @RequestMapping(value= "/danhsachhocsinh", method = RequestMethod.GET)
    public ResponseEntity<List<HocsinhEntity>> listdanhsachhocsinh(){
        List<HocsinhEntity> listdanhsachhocsinh = hocsinhService.getAllHocsinh();
        if(listdanhsachhocsinh.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhEntity>>(listdanhsachhocsinh , HttpStatus.OK);
    }
    //Hien Thi Danh sach hoc sinh den
    @RequestMapping(value= "/danhsachhocsinhden", method = RequestMethod.GET)
    public ResponseEntity<List<HocsinhDenEntity>> listdanhsachhocsinhden(){
        List<HocsinhDenEntity> listdanhsachhocsinhden = hocsinhdenService.getAllHocsinhDen();
        if(listdanhsachhocsinhden.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhDenEntity>>(listdanhsachhocsinhden , HttpStatus.OK);
    }

    //Update bang Danhsach hoc sinh den

    /*@RequestMapping(value = "/danhsachhocsinhden/giaovien/capnhapden", method = RequestMethod.PUT)
    public ResponseEntity<HocsinhDenEntity> updateHocSinhden(long id,String image) throws Exception{
        List<HocsinhDenEntity> updateden = hocsinhdenService.getHocsinhDenByMahocsinh(id);
        if(updateden == null){
            return ResponseEntity.notFound().build();
        }
        updateden.get(0).setMaden(1);
        updateden.get(0).setImage(image);

        HocsinhDenEntity updatedden = hocsinhdenService.createOrUpdateHocsinhDen(updateden.get(0));
        return ResponseEntity.ok(updatedden);
    }

    //Hien Thi Danh sach hoc sinh ve
    @RequestMapping(value= "/danhsachhocsinhve", method = RequestMethod.GET)
    public ResponseEntity<List<HocsinhVeEntity>> listdanhsachhocsinhve(){
        List<HocsinhVeEntity> listdanhsachhocsinhve = hocsinhveService.getAllHocsinhVe();
        if(listdanhsachhocsinhve.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhVeEntity>>(listdanhsachhocsinhve , HttpStatus.OK);
    }

    //Update bang Danhsach hoc sinh ve

    @RequestMapping(value = "/danhsachhocsinhden/giaovien/capnhapden", method = RequestMethod.PUT)
    public ResponseEntity<HocsinhVeEntity> updateHocSinhve(long id,String image) throws Exception{
        List<HocsinhVeEntity> updateve = hocsinhveService.getHocsinhVeByMahocsinh(id);
        if(updateve == null){
            return ResponseEntity.notFound().build();
        }
        updateve.get(0).setMave(1);
        updateve.get(0).setImage(image);

        HocsinhVeEntity updatedve = hocsinhveService.createOrUpdateHocsinhVE(updateve.get(0));
        return ResponseEntity.ok(updatedve);
    }*/
}
