package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "binhluan", schema = "school", catalog = "")
public class BinhluanEntity {
    private long id;
    private Long maphuhuynh;
    private Long mahinhanh;
    private Date ngay;
    private String gio;
    private String noidung;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "mahinhanh", nullable = true)
    public Long getMahinhanh() {
        return mahinhanh;
    }

    public void setMahinhanh(Long mahinhanh) {
        this.mahinhanh = mahinhanh;
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
    @Column(name = "noidung", nullable = true, length = 300)
    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinhluanEntity that = (BinhluanEntity) o;
        return id == that.id &&
                Objects.equals(maphuhuynh, that.maphuhuynh) &&
                Objects.equals(mahinhanh, that.mahinhanh) &&
                Objects.equals(ngay, that.ngay) &&
                Objects.equals(gio, that.gio) &&
                Objects.equals(noidung, that.noidung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maphuhuynh, mahinhanh, ngay, gio, noidung);
    }
}
