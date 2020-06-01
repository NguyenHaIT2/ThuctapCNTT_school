package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "thetranghangthang", schema = "school", catalog = "")
public class ThetranghangthangEntity {
    private long id;
    private Integer chieucao;
    private Integer cannang;
    private Integer thang;
    private Integer nam;
    private Long mahocsinh;
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
    @Column(name = "chieucao", nullable = true)
    public Integer getChieucao() {
        return chieucao;
    }

    public void setChieucao(Integer chieucao) {
        this.chieucao = chieucao;
    }

    @Basic
    @Column(name = "cannang", nullable = true)
    public Integer getCannang() {
        return cannang;
    }

    public void setCannang(Integer cannang) {
        this.cannang = cannang;
    }

    @Basic
    @Column(name = "thang", nullable = true)
    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    @Basic
    @Column(name = "nam", nullable = true)
    public Integer getNam() {
        return nam;
    }

    public void setNam(Integer nam) {
        this.nam = nam;
    }

    @Basic
    @Column(name = "mahocsinh", nullable = true)
    public Long getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(Long mahocsinh) {
        this.mahocsinh = mahocsinh;
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
        ThetranghangthangEntity that = (ThetranghangthangEntity) o;
        return id == that.id &&
                Objects.equals(chieucao, that.chieucao) &&
                Objects.equals(cannang, that.cannang) &&
                Objects.equals(thang, that.thang) &&
                Objects.equals(nam, that.nam) &&
                Objects.equals(mahocsinh, that.mahocsinh) &&
                Objects.equals(magiaovien, that.magiaovien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chieucao, cannang, thang, nam, mahocsinh, magiaovien);
    }
}
