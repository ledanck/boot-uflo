package com.m.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "role")
@DynamicInsert
public class Role implements Serializable {
    /**
     * 自增id主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    /**
     * 角色名
     */
    @Column(name = "name")
    private String name;
    /**
     * 角色类型
     */
    @Column(name = "type")
    private Integer type;
    /**
     * 角色描述
     */
    @Column(name = "remarks")
    private String remarks;
    /**
     *  创建时间
     */
    @Column(name = "created_time")
    private LocalDate createdTime;
    /**
     *  状态
     */
    @Column(name = "status")
    private Short status;
}
