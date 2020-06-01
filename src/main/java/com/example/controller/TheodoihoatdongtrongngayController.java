package com.example.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HinhanhService;
import com.example.service.HoatdongtrongngayService;
import com.example.service.HocsinhHinhanhService;
import com.example.service.HocsinhService;
import com.example.service.LopHoatdongService;
import com.example.service.LopService;
import com.example.entity.*;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class TheodoihoatdongtrongngayController {
	@Autowired
	HoatdongtrongngayService hoatdongtrongngayService;
	
	@Autowired
	HinhanhService hinhanhService;
	
	@Autowired
	HocsinhHinhanhService hocsinhinhanhService;
	
	@Autowired
	HocsinhService hocsinhService;
	
	//Danh sach hoat dong trong ngay. Trang chinh
	@RequestMapping(value = "/hoatdongtrongngay",method = RequestMethod.GET)
	public ResponseEntity<List<HoatdongtrongngayEntity>> listHoatdongtrongngay(){
		List<HoatdongtrongngayEntity> listHoatdongtrongngay = hoatdongtrongngayService.getAllHoatdong();
		if(listHoatdongtrongngay.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HoatdongtrongngayEntity>>(listHoatdongtrongngay,HttpStatus.OK);
	}
	
	//Them moi hoat dong trong ngay. 
	//Input: String image, Date : Thoi gian cua hoat dong
	//Output: Danh sach hinh anh da cap nhat
	@RequestMapping(value = "/hoatdongtrongngay/giaovien/capnhathoatdong",method = RequestMethod.POST)
	public ResponseEntity<List<HoatdongtrongngayEntity>> themHoatdongtrongngay(@RequestBody HoatdongtrongngayEntity hoatdongmoi) throws Exception{
//		HinhanhEntity newHinhanh = new HinhanhEntity();
//		newHinhanh.setId(hinhanhService.lastID()+1);
//		newHinhanh.setImage(image);
//		newHinhanh.setThoigian(thoigian);
//		hinhanhService.createOrUpdateHinhanh(newHinhanh);
//
//		HoatdongtrongngayEntity newHoatdong = new HoatdongtrongngayEntity();
//		newHoatdong.setId(hoatdongtrongngayService.lastID()+1);
//		newHoatdong.setNgay(thoigian);	
//		newHoatdong.setTen(image);
//		hoatdongtrongngayService.createOrUpdateHoatdong(newHoatdong);
//		
//		HocsinhHinhanhEntity newHocsinhhinhanh = new HocsinhHinhanhEntity();
//		List<HocsinhEntity> danhsachHocsinh = hocsinhService.getHocsinhByTenLike(tenhocsinh);
//		HocsinhEntity hocsinh = danhsachHocsinh.get(0);
//		newHocsinhhinhanh.setMahocsinh(hocsinh.getId());
//		newHocsinhhinhanh.setMahinhanh(newHinhanh.getId());
//		hocsinhinhanhService.createOrUpdateHocsinhhinhanh(newHocsinhhinhanh);
//		
//		List<HoatdongtrongngayEntity> listHoatdongtrongngay = hoatdongtrongngayService.getAllHoatdong();
//		if(listHoatdongtrongngay.isEmpty()) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//		return new ResponseEntity<List<HoatdongtrongngayEntity>>(listHoatdongtrongngay,HttpStatus.OK);
		hoatdongtrongngayService.createOrUpdateHoatdong(hoatdongmoi);
		List<HoatdongtrongngayEntity> listHoatdongtrongngay = hoatdongtrongngayService.getAllHoatdong();
		if(listHoatdongtrongngay.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HoatdongtrongngayEntity>>(listHoatdongtrongngay,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/hoatdongtrongngay/phuhuynh/timkiem/{id}/{thoigian}", method = RequestMethod.GET)
	public ResponseEntity<List<HinhanhEntity>> timkiemHoatdongtrongngay(@PathVariable("id") Long id,@PathVariable("thoigian") Date thoigian) throws Exception{
		HocsinhEntity hocsinh = hocsinhService.getHocsinhById(id);
		List<HocsinhHinhanhEntity> danhsachHSHinhanh = hocsinhinhanhService.getHocsinhHinhanhByMahocsinh(hocsinh.getId());
		List<HinhanhEntity> danhsachHinhanh = new ArrayList<HinhanhEntity>();
		for (HocsinhHinhanhEntity hshinhanhEntity : danhsachHSHinhanh) {
			HinhanhEntity result = hinhanhService.getHinhanhById(hshinhanhEntity.getMahinhanh());
			danhsachHinhanh.add(result);
		}
		if(danhsachHinhanh.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HinhanhEntity>>(danhsachHinhanh,HttpStatus.OK);
	}
	
}

