package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface HocsinhRepository extends JpaRepository<HocsinhEntity, Long> {
    @Query("SELECT hs FROM HocsinhEntity hs WHERE hs.ten like concat(concat('%', :ten), '%')")
    List<HocsinhEntity> findHocsinhByTenLike(@Param("ten") String ten);

    @Query("SELECT hs FROM HocsinhEntity hs WHERE hs.magiaovien = ?1")
    List<HocsinhEntity> findHocsinhByMagiaovien(@Param("magiaovien") long magiaovien);

    @Query("SELECT hs FROM HocsinhEntity hs WHERE hs.malop = ?1")
    List<HocsinhEntity> findHocsinhByMalop(@Param("malop") long malop);
}
