package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lop_noidunghoctap", schema = "school", catalog = "")
public class LopNoidunghoctapEntity {
    private Long malop;
    private Long manoidunghoctap;
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
    @Column(name = "manoidunghoctap", nullable = true)
    public Long getManoidunghoctap() {
        return manoidunghoctap;
    }

    public void setManoidunghoctap(Long manoidunghoctap) {
        this.manoidunghoctap = manoidunghoctap;
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
        LopNoidunghoctapEntity that = (LopNoidunghoctapEntity) o;
        return id == that.id &&
                Objects.equals(malop, that.malop) &&
                Objects.equals(manoidunghoctap, that.manoidunghoctap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(malop, manoidunghoctap, id);
    }
}
