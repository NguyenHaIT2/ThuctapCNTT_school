package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lop_hoatdong", schema = "school", catalog = "")
public class LopHoatdongEntity {
    private Long malop;
    private Long mahoatdong;
    private long id;

    @Basic
    @Column(name = "malop", nullable = true)
    public Long getMalop() {
        return malop;
    }

    public void setMalop(Long malop) {
        this.malop = malop;
    }

    @Basic
    @Column(name = "mahoatdong", nullable = true)
    public Long getMahoatdong() {
        return mahoatdong;
    }

    public void setMahoatdong(Long mahoatdong) {
        this.mahoatdong = mahoatdong;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LopHoatdongEntity that = (LopHoatdongEntity) o;
        return id == that.id &&
                Objects.equals(malop, that.malop) &&
                Objects.equals(mahoatdong, that.mahoatdong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(malop, mahoatdong, id);
    }
}
