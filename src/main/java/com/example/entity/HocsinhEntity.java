package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hocsinh", schema = "school", catalog = "")
public class HocsinhEntity {
    private long id;
    private String ten;
    private Date ngaysinh;
    private Long magiaovien;
    private Long maphuhuynh;
    private Long malop;

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
    @Column(name = "ngaysinh", nullable = true)
    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Basic
    @Column(name = "magiaovien", nullable = true)
    public Long getMagiaovien() {
        return magiaovien;
    }

    public void setMagiaovien(Long magiaovien) {
        this.magiaovien = magiaovien;
    }

    @Basic
    @Column(name = "maphuhuynh", nullable = true)
    public Long getMaphuhuynh() {
        return maphuhuynh;
    }

    public void setMaphuhuynh(Long maphuhuynh) {
        this.maphuhuynh = maphuhuynh;
    }

    @Basic
    @Column(name = "malop", nullable = true)
    public Long getMalop() {
        return malop;
    }

    public void setMalop(Long malop) {
        this.malop = malop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocsinhEntity that = (HocsinhEntity) o;
        return id == that.id &&
                Objects.equals(ten, that.ten) &&
                Objects.equals(ngaysinh, that.ngaysinh) &&
                Objects.equals(magiaovien, that.magiaovien) &&
                Objects.equals(maphuhuynh, that.maphuhuynh) &&
                Objects.equals(malop, that.malop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten, ngaysinh, magiaovien, maphuhuynh, malop);
    }
}
