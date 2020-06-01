package com.example.controller;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import com.example.service.HoatdongtrongngayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.service.HocsinhHocphiService;
import com.example.service.HocsinhService;

import com.example.entity.*;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class TheodoihocphiController {
    @Autowired
    HocsinhHocphiService hocsinhHocphiService;

    @Autowired
    HocsinhService hocsinhService;

    //Danh sach tinh trang hoc phi của moi hoc sinh
    @RequestMapping(value = "/hocsinhhocphi/",method = RequestMethod.GET)
    public ResponseEntity<List<HocsinhHocphiEntity>> listHocsinhHocphi(){
        List<HocsinhHocphiEntity> listHocsinhHocphi = hocsinhHocphiService.getAll();
        if(listHocsinhHocphi.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhHocphiEntity>>(listHocsinhHocphi,HttpStatus.OK);
    }

    //Danh sach tinh trang hoc phi Theo hoc sinh
    @RequestMapping(value = "/hocsinhhocphi/phuhuynh/timkiemhocphitheohocsinh",method = RequestMethod.GET)
    public ResponseEntity<List<HocsinhHocphiEntity>> listHocsinhHocphiByHocsinh(long mahocsinh) throws Exception {
        List<HocsinhHocphiEntity> listHocsinhHocphi = hocsinhHocphiService.getHocphiByHocsinh(mahocsinh);
        if(listHocsinhHocphi.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhHocphiEntity>>(listHocsinhHocphi,HttpStatus.OK);
    }

    //Danh sach tinh trang hoc phi Theo Thang
    @RequestMapping(value = "/hocsinhhocphi/giaovien/timkiemhocphitheothang",method = RequestMethod.GET)
    public ResponseEntity<List<HocsinhHocphiEntity>> listHocsinhHocphiByThang(int nam, int thang) throws Exception {
        List<HocsinhHocphiEntity> listHocsinhHocphi = hocsinhHocphiService.getHocphiByThang(nam, thang);
        if(listHocsinhHocphi.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhHocphiEntity>>(listHocsinhHocphi,HttpStatus.OK);
    }

    // Cap nhat trang thang thanh toan
    @RequestMapping(value = "/hocsinhhocphi/giaovien/capnhattrangthai/",method = RequestMethod.POST)
    public ResponseEntity<List<HocsinhHocphiEntity>> capnhattinhtrang(int tinhtrang) throws Exception{

        HocsinhHocphiEntity newobj = new HocsinhHocphiEntity();
        newobj.setTinhtrang(tinhtrang);
        hocsinhHocphiService.capnhattrangthai(newobj);

        List<HocsinhHocphiEntity> listHocsinhHocphi = hocsinhHocphiService.getAll();
        if(listHocsinhHocphi.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HocsinhHocphiEntity>>(listHocsinhHocphi,HttpStatus.OK);
    }

}
