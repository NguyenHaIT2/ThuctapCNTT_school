package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sukientruong", schema = "school", catalog = "")
public class SukientruongEntity {
    private long id;
    private Date thoigianbatdau;
    private Date thoigianketthuc;
    private String ten;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "thoigianbatdau", nullable = true)
    public Date getThoigianbatdau() {
        return thoigianbatdau;
    }

    public void setThoigianbatdau(Date thoigianbatdau) {
        this.thoigianbatdau = thoigianbatdau;
    }

    @Basic
    @Column(name = "thoigianketthuc", nullable = true)
    public Date getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(Date thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 200)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SukientruongEntity that = (SukientruongEntity) o;
        return id == that.id &&
                Objects.equals(thoigianbatdau, that.thoigianbatdau) &&
                Objects.equals(thoigianketthuc, that.thoigianketthuc) &&
                Objects.equals(ten, that.ten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, thoigianbatdau, thoigianketthuc, ten);
    }
}
