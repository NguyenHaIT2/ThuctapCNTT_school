package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hoatdongtrongngay", schema = "school", catalog = "")
public class HoatdongtrongngayEntity {
    private long id;
    private Date ngay;
    private String gio;
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
    @Column(name = "ngay", nullable = true)
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Basic
    @Column(name = "gio", nullable = true, length = 45)
    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 300)
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
        HoatdongtrongngayEntity that = (HoatdongtrongngayEntity) o;
        return id == that.id &&
                Objects.equals(ngay, that.ngay) &&
                Objects.equals(gio, that.gio) &&
                Objects.equals(ten, that.ten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ngay, gio, ten);
    }
}
