package com.thunisoft.demo.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.thunisoft.artery.data.annotation.User;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
/**
 * 
 * AtyUserRight
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_user_right}")
public class AtyUserRight  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 帐号ID */
    @User
    @NotBlank
    @Size(max=300)
    @Column(name="c_userid")
    private String userid;

    /** 类型 */
    @NotNull
    @Column(name="n_type")
    private Integer type;

    /** 角色ID */
    @Size(max=300)
    @Column(name="c_roleid")
    private String roleid;

    /** 权限字 */
    @Size(max=300)
    @Column(name="c_rightkey")
    private String rightkey;


    /**
     * 获取 c_id
     *
     * @return ID
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_userid
     *
     * @return 帐号ID
     */
    @JSONField(name = "userid") 
    public String getUserid() {
        return userid;
    }

    /**
     * 设置 c_userid
     *
     * @param userid 帐号ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * 获取 n_type
     *
     * @return 类型
     */
    @JSONField(name = "type") 
    public Integer getType() {
        return type;
    }

    /**
     * 设置 n_type
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 获取 c_roleid
     *
     * @return 角色ID
     */
    @JSONField(name = "roleid") 
    public String getRoleid() {
        return roleid;
    }

    /**
     * 设置 c_roleid
     *
     * @param roleid 角色ID
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
    /**
     * 获取 c_rightkey
     *
     * @return 权限字
     */
    @JSONField(name = "rightkey") 
    public String getRightkey() {
        return rightkey;
    }

    /**
     * 设置 c_rightkey
     *
     * @param rightkey 权限字
     */
    public void setRightkey(String rightkey) {
        this.rightkey = rightkey;
    }

}
