package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "thucdon", schema = "school", catalog = "")
public class ThucdonEntity {
    private long id;
    private Long mamonan;
    private Date ngay;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mamonan", nullable = true)
    public Long getMamonan() {
        return mamonan;
    }

    public void setMamonan(Long mamonan) {
        this.mamonan = mamonan;
    }

    @Basic
    @Column(name = "ngay", nullable = true)
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThucdonEntity that = (ThucdonEntity) o;
        return id == that.id &&
                Objects.equals(mamonan, that.mamonan) &&
                Objects.equals(ngay, that.ngay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mamonan, ngay);
    }
}
