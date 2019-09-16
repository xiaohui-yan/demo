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
 * AtyRight
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_right}")
public class AtyRight  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** 权限字 */
    @NotBlank
    @Size(max=150)
    @Id
    @Column(name="c_rightkey")
    private String rightkey;

    /** 权限名称 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 描述 */
    @Size(max=300)
    @Column(name="c_descript")
    private String descript;

    /** 显示顺序 */
    @Column(name="n_order")
    private Integer order;


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
    /**
     * 获取 c_name
     *
     * @return 权限名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 权限名称
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
