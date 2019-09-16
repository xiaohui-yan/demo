package com.thunisoft.demo.pojo;

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
 * AtyDept
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_dept}")
public class AtyDept  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** 标识 */
    @NotBlank
    @Size(max=50)
    @Id
    @Column(name="c_id")
    private String id;

    /** 部门名称 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 父代码 */
    @Size(max=300)
    @Column(name="c_pid")
    private String pid;

    /** 所属单位 */
    @Corp
    @Size(max=300)
    @Column(name="c_corp")
    private String corp;

    /** 简称 */
    @Size(max=300)
    @Column(name="c_alias")
    private String alias;

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
     * @return 标识
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id 标识
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_name
     *
     * @return 部门名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 c_pid
     *
     * @return 父代码
     */
    @JSONField(name = "pid") 
    public String getPid() {
        return pid;
    }

    /**
     * 设置 c_pid
     *
     * @param pid 父代码
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
    /**
     * 获取 c_corp
     *
     * @return 所属单位
     */
    @JSONField(name = "corp") 
    public String getCorp() {
        return corp;
    }

    /**
     * 设置 c_corp
     *
     * @param corp 所属单位
     */
    public void setCorp(String corp) {
        this.corp = corp;
    }
    /**
     * 获取 c_alias
     *
     * @return 简称
     */
    @JSONField(name = "alias") 
    public String getAlias() {
        return alias;
    }

    /**
     * 设置 c_alias
     *
     * @param alias 简称
     */
    public void setAlias(String alias) {
        this.alias = alias;
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
