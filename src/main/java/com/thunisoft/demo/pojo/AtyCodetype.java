package com.thunisoft.demo.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
/**
 * 
 * AtyCodetype
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_aty_codetype}")
public class AtyCodetype  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** 代码类型编号 */
    @NotBlank
    @Size(max=50)
    @Id
    @Column(name="c_id")
    private String id;

    /** 代码类型名称 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 是否有效 */
    @NotNull
    @Column(name="n_valid")
    private Integer valid;

    /** 是否可维护 */
    @NotNull
    @Column(name="n_sfkwh")
    private Integer sfkwh;


    /**
     * 获取 c_id
     *
     * @return 代码类型编号
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id 代码类型编号
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_name
     *
     * @return 代码类型名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 代码类型名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取 n_sfkwh
     *
     * @return 是否可维护
     */
    @JSONField(name = "sfkwh") 
    public Integer getSfkwh() {
        return sfkwh;
    }

    /**
     * 设置 n_sfkwh
     *
     * @param sfkwh 是否可维护
     */
    public void setSfkwh(Integer sfkwh) {
        this.sfkwh = sfkwh;
    }

}
