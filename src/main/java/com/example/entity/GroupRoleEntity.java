package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "group_role", schema = "school", catalog = "")
public class GroupRoleEntity {
    private Integer groupid;
    private Integer roleid;
    private long id;

    @Basic
    @Column(name = "groupid", nullable = true)
    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    @Basic
    @Column(name = "roleid", nullable = true)
    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
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
        GroupRoleEntity that = (GroupRoleEntity) o;
        return id == that.id &&
                Objects.equals(groupid, that.groupid) &&
                Objects.equals(roleid, that.roleid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupid, roleid, id);
    }
}
