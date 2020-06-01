package com.example.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.service.NoidunghoctapService;
import com.example.service.LopNoidunghoctapService;
import com.example.service.LopService;
import com.example.service.ThucdonService;
import com.example.service.SukientruongService;
import com.example.entity.*;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class TheodoichuongtrinhhocController {
    @Autowired
    NoidunghoctapService noidunghoctapService;

    @Autowired
    LopNoidunghoctapService lopNoidunghoctapService;

    @Autowired
    LopService lopService;

    //Danh sach noi dung hoc tap. Trang chinh
    @RequestMapping(value = "/noidunghoctap",method = RequestMethod.GET)
    public ResponseEntity<List<NoidunghoctapEntity>> listNoidunghoctap(){
        List<NoidunghoctapEntity> listNoidunghoctap = noidunghoctapService.getAllNoidung();
        if(listNoidunghoctap.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<NoidunghoctapEntity>>(listNoidunghoctap,HttpStatus.OK);
    }

    // Tim kiem noi dung hoc tap theo thoi gian
    @RequestMapping(value = "/phuhuynh/timkiemnoidunghoctaptheothoigian/{nam}/{thang}/{tuan}",method = RequestMethod.GET)
    public ResponseEntity<List<NoidunghoctapEntity>> listNoidunghoctapByTime(@PathVariable("nam") int nam, @PathVariable("thang") int thang, @PathVariable("tuan") int tuan) throws Exception {
        List<NoidunghoctapEntity> listNoidunghoctap = noidunghoctapService.getNoidungByThoigian(nam, thang, tuan);
        if(listNoidunghoctap.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<NoidunghoctapEntity>>(listNoidunghoctap,HttpStatus.OK);
    }

    // Danh sach noi dung hoc tap theo lop
    @RequestMapping(value = "/noidunghoctaptheolop/{malop}",method = RequestMethod.GET)
    public ResponseEntity<List<LopNoidunghoctapEntity>> listNoidunghoctapByMalop(@PathVariable("malop") long malop) throws Exception {
        List<LopNoidunghoctapEntity> listNoidunghoctap = lopNoidunghoctapService.getLopNoidunghoctapByMalop(malop);
        if(listNoidunghoctap.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<LopNoidunghoctapEntity>>(listNoidunghoctap,HttpStatus.OK);
    }

    // Them noi dung hoc tap
    /*@RequestMapping(value = "/giaovien/capnhapnoidunghoctap",method = RequestMethod.POST)
    public ResponseEntity<List<NoidunghoctapEntity>> themNoidunghoctap(@PathVariable("ten") String ten, @PathVariable("nam") int nam,@PathVariable("thang") int thang, @PathVariable("tuan")int tuan) throws Exception{

        NoidunghoctapEntity newNoidung = new NoidunghoctapEntity();
        newNoidung.setId(noidunghoctapService.lastID()+1);
        newNoidung.setTen(ten);
        newNoidung.setNam(nam);
        newNoidung.setThang(thang);
        newNoidung.setTuan(tuan);
        noidunghoctapService.createOrUpdateNoidung(newNoidung);

        List<NoidunghoctapEntity> list = noidunghoctapService.getAllNoidung();
        if(list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<NoidunghoctapEntity>>(list,HttpStatus.OK);
    }*/

    @RequestMapping(value = "/themnoidunghoctap",method = RequestMethod.POST)
    public ResponseEntity<NoidunghoctapEntity> createOrUpdatenoidung( @RequestBody(required = false) NoidunghoctapEntity t) throws Exception {
        NoidunghoctapEntity updated = noidunghoctapService.createOrUpdateNoidung(t);
        return new ResponseEntity<NoidunghoctapEntity>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/xoanoidunghoctap/{id}",method = RequestMethod.DELETE)
    public HttpStatus deleteNoidunghoctap(@PathVariable("id") long id) throws Exception {
        noidunghoctapService.deleteNoidungById(id);
        return HttpStatus.FORBIDDEN;
    }



}
