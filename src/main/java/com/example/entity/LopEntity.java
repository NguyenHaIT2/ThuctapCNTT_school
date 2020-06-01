package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lop", schema = "school", catalog = "")
public class LopEntity {
    private long id;
    private String ten;
    private Long magiaovien;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 100)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "magiaovien", nullable = true)
    public Long getMagiaovien() {
        return magiaovien;
    }

    public void setMagiaovien(Long magiaovien) {
        this.magiaovien = magiaovien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LopEntity lopEntity = (LopEntity) o;
        return id == lopEntity.id &&
                Objects.equals(ten, lopEntity.ten) &&
                Objects.equals(magiaovien, lopEntity.magiaovien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten, magiaovien);
    }
}
