package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface LopRepository extends JpaRepository<LopEntity, Long> {
    @Query("SELECT u FROM LopEntity u WHERE u.ten like concat(concat('%', :ten), '%')")
    List<LopEntity> findLopEntitiesByTen(@Param("ten") String ten);

    @Query("SELECT u FROM LopEntity u WHERE u.magiaovien = ?1")
    List<LopEntity> findLopByMagiaovien(@Param("magiaovien") long magiaovien);

}
