package com.thunisoft.demo.pojo;

import com.thunisoft.artery.data.annotation.Dept;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.thunisoft.artery.data.annotation.Corp;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
/**
 * 
 * AtyUser
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_user}")
public class AtyUser  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** 帐号ID */
    @NotBlank
    @Size(max=50)
    @Id
    @Column(name="c_id")
    private String id;

    /** 登录标识 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_loginid")
    private String loginid;

    /** 姓名 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 密码 */
    @NotBlank
    @Size(max=32)
    @Column(name="c_password")
    private String password;

    /** 电子邮件 */
    @Size(max=300)
    @Column(name="c_mail")
    private String mail;

    /** IP */
    @Size(max=300)
    @Column(name="c_ip")
    private String ip;

    /** 姓名简拼 */
    @Size(max=300)
    @Column(name="c_xmjp")
    private String xmjp;

    /** 所在单位 */
    @Corp
    @Size(max=300)
    @Column(name="c_corp")
    private String corp;

    /** 所在部门 */
    @Dept
    @Size(max=300)
    @Column(name="c_dept")
    private String dept;

    /** 是否有效 */
    @NotNull
    @Column(name="n_valid")
    private Integer valid;

    /** 显示顺序 */
    @NotNull
    @Column(name="n_order")
    private Integer order;


    /**
     * 获取 c_id
     *
     * @return 帐号ID
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id 帐号ID
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_loginid
     *
     * @return 登录标识
     */
    @JSONField(name = "loginid") 
    public String getLoginid() {
        return loginid;
    }

    /**
     * 设置 c_loginid
     *
     * @param loginid 登录标识
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }
    /**
     * 获取 c_name
     *
     * @return 姓名
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 c_password
     *
     * @return 密码
     */
    @JSONField(name = "password") 
    public String getPassword() {
        return password;
    }

    /**
     * 设置 c_password
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 获取 c_mail
     *
     * @return 电子邮件
     */
    @JSONField(name = "mail") 
    public String getMail() {
        return mail;
    }

    /**
     * 设置 c_mail
     *
     * @param mail 电子邮件
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    /**
     * 获取 c_ip
     *
     * @return IP
     */
    @JSONField(name = "ip") 
    public String getIp() {
        return ip;
    }

    /**
     * 设置 c_ip
     *
     * @param ip IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**
     * 获取 c_xmjp
     *
     * @return 姓名简拼
     */
    @JSONField(name = "xmjp") 
    public String getXmjp() {
        return xmjp;
    }

    /**
     * 设置 c_xmjp
     *
     * @param xmjp 姓名简拼
     */
    public void setXmjp(String xmjp) {
        this.xmjp = xmjp;
    }
    /**
     * 获取 c_corp
     *
     * @return 所在单位
     */
    @JSONField(name = "corp") 
    public String getCorp() {
        return corp;
    }

    /**
     * 设置 c_corp
     *
     * @param corp 所在单位
     */
    public void setCorp(String corp) {
        this.corp = corp;
    }
    /**
     * 获取 c_dept
     *
     * @return 所在部门
     */
    @JSONField(name = "dept") 
    public String getDept() {
        return dept;
    }

    /**
     * 设置 c_dept
     *
     * @param dept 所在部门
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * 获取 n_valid
     *
     * @return 是否有效
     */
    @JSONField(name = "valid") 
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置 n_valid
     *
     * @param valid 是否有效
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }
    /**
     * 获取 n_order
     *
     * @return 显示顺序
     */
    @JSONField(name = "order") 
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置 n_order
     *
     * @param order 显示顺序
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

}
