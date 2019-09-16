package com.thunisoft.demo.pojo;

import javax.validation.constraints.NotBlank;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
/**
 * 
 * AtyRoleRight
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_role_right}")
public class AtyRoleRight  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 角色ID */
    @NotBlank
    @Size(max=300)
    @Column(name="c_roleid")
    private String roleid;

    /** 权限字 */
    @NotBlank
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
