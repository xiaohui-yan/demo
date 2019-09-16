package com.thunisoft.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.demo.pojo.AtyDept;

/**
 * 
 * AtyDeptMapper
 * 
 * @description AtyDeptMapper
 * @author  huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Mapper
public interface AtyDeptMapper extends BaseMapper<AtyDept, String> {

    
}
