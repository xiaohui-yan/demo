package com.thunisoft.demo.pojo;

import javax.validation.constraints.NotBlank;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import java.math.BigDecimal;
import javax.validation.constraints.Digits;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
import java.util.Date;
/**
 * 
 * Student
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_student}")
public class Student  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** uuid */
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 学生姓名 */
    @Size(max=50)
    @Column(name="c_name")
    private String name;

    /** 学生年龄 */
    @Digits(integer=3,fraction=0)
    @Column(name="n_age")
    private BigDecimal age;

    /** 学生生日 */
    @Column(name="d_birthday")
    private Date birthday;

    /** 学生名次 */
    @Size(max=300)
    @Column(name="c_desc")
    private String desc;


    /**
     * 获取 c_id
     *
     * @return uuid
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id uuid
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_name
     *
     * @return 学生姓名
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 学生姓名
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 n_age
     *
     * @return 学生年龄
     */
    @JSONField(name = "age") 
    public BigDecimal getAge() {
        return age;
    }

    /**
     * 设置 n_age
     *
     * @param age 学生年龄
     */
    public void setAge(BigDecimal age) {
        this.age = age;
    }
    /**
     * 获取 d_birthday
     *
     * @return 学生生日
     */
    @JSONField(name = "birthday") 
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置 d_birthday
     *
     * @param birthday 学生生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /**
     * 获取 c_desc
     *
     * @return 学生名次
     */
    @JSONField(name = "desc") 
    public String getDesc() {
        return desc;
    }

    /**
     * 设置 c_desc
     *
     * @param desc 学生名次
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
