package com.thunisoft.demo.controller;

import javax.servlet.http.HttpServletRequest;

import com.thunisoft.artery.data.QueryManager;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.data.model.IQueryInfo;
import com.thunisoft.demo.mapper.StudentMapper;
import com.thunisoft.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DemoController Controller
 * 
 *
 * @author huayu
 * @date 2019-09-16
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private StudentMapper studentMapper;
    @ExceptionTips("查询表格数据异常")
    @DataTranslate    //能将列表中的代码维护1，2转为中文描述
    @ResponseBody
    @RequestMapping("/rs1")
    public Object getTableData(IQueryInfo qb){

        return  QueryManager.datas(qb, Student.class,studentMapper::selectAll);
    }

    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "demo";
 	}
}