package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public
interface HoatdongtrongngayRepository extends JpaRepository<HoatdongtrongngayEntity, Long> {
    @Query("SELECT hd FROM HoatdongtrongngayEntity hd WHERE hd.ten like concat(concat('%', :ten), '%')")
    List<HoatdongtrongngayEntity> findHoatdongByTenLike(@Param("ten") String ten);

    @Query("SELECT hd FROM HoatdongtrongngayEntity hd WHERE hd.ngay = ?1")
    List<HoatdongtrongngayEntity> findHoatdongByNgay(@Param("ngay") Date ngay);
}
