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
 * AtyRole
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_role}")
public class AtyRole  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    @NotBlank
    @Size(max=50)
    @Id
    @Column(name="c_id")
    private String id;

    /** 角色名称 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 描述 */
    @Size(max=300)
    @Column(name="c_descript")
    private String descript;

    /** 系统固有 */
    @Column(name="n_xtgy")
    private Integer xtgy;

    /** 是否有效 */
    @Column(name="n_valid")
    private Integer valid;

    /** 显示顺序 */
    @Column(name="n_order")
    private Integer order;


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
     * 获取 c_name
     *
     * @return 角色名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 c_descript
     *
     * @return 描述
     */
    @JSONField(name = "descript") 
    public String getDescript() {
        return descript;
    }

    /**
     * 设置 c_descript
     *
     * @param descript 描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }
    /**
     * 获取 n_xtgy
     *
     * @return 系统固有
     */
    @JSONField(name = "xtgy") 
    public Integer getXtgy() {
        return xtgy;
    }

    /**
     * 设置 n_xtgy
     *
     * @param xtgy 系统固有
     */
    public void setXtgy(Integer xtgy) {
        this.xtgy = xtgy;
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
