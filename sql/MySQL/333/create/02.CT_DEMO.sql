-- auto create by SMD

use db_aty;

-- 代码类型表

drop table if exists T_Aty_CodeType;

create table db_aty.T_Aty_CodeType
(
    C_ID                 varchar(50)                          NOT NULL     comment '代码类型编号',
    C_Name               varchar(300)                         NOT NULL     comment '代码类型名称',
    N_Valid              int             default 1            NOT NULL     comment '是否有效',
    N_SFKWH              int             default 2            NOT NULL     comment '是否可维护'
) comment = '代码类型表' ;


use db_aty;

-- 代码表

drop table if exists T_Aty_Code;

create table db_aty.T_Aty_Code
(
    C_PID                varchar(50)     default '0'          NOT NULL     comment '代码类型编号',
    C_Code               varchar(50)                          NOT NULL     comment '代码',
    C_Name               varchar(300)                         NOT NULL     comment '代码名称',
    N_KWH                int             default 2            NOT NULL     comment '可否维护',
    C_LevelInfo          varchar(300)                         NULL         comment '分级信息',
    N_Valid              int             default 1            NOT NULL     comment '是否有效',
    N_Order              int             default 1            NOT NULL     comment '显示顺序',
    C_Dmjp               varchar(300)                         NULL         comment '代码简拼'
) comment = '代码表' ;


use db_aty;

-- 单位表

drop table if exists T_Aty_Corp;

create table db_aty.T_Aty_Corp
(
    C_ID                 varchar(50)                          NOT NULL     comment '标识',
    C_Name               varchar(300)                         NOT NULL     comment '单位名称',
    C_PID                varchar(300)                         NULL         comment '父代码',
    N_Level              int             default 4            NOT NULL     comment '单位层级',
    C_GBM                varchar(300)                         NULL         comment '国标码',
    C_Alias              varchar(300)                         NULL         comment '简称',
    N_Valid              int             default 1            NOT NULL     comment '是否有效',
    N_Order              int             default 1            NOT NULL     comment '显示顺序'
) comment = '单位表' ;


use db_aty;

-- 部门表

drop table if exists T_Aty_Dept;

create table db_aty.T_Aty_Dept
(
    C_ID                 varchar(50)                          NOT NULL     comment '标识',
    C_Name               varchar(300)                         NOT NULL     comment '部门名称',
    C_PID                varchar(300)                         NULL         comment '父代码',
    C_CORP               varchar(300)                         NULL         comment '所属单位',
    C_Alias              varchar(300)                         NULL         comment '简称',
    N_Valid              int             default 1            NOT NULL     comment '是否有效',
    N_Order              int             default 1            NOT NULL     comment '显示顺序'
) comment = '部门表' ;


use db_aty;

-- 帐户表

drop table if exists T_Aty_User;

create table db_aty.T_Aty_User
(
    C_ID                 varchar(50)                          NOT NULL     comment '帐号ID',
    C_LoginID            varchar(300)                         NOT NULL     comment '登录标识',
    C_Name               varchar(300)                         NOT NULL     comment '姓名',
    C_Password           varchar(32)     default 'D41D8CD98F00B204E9800998ECF8427E' NOT NULL     comment '密码',
    C_Mail               varchar(300)                         NULL         comment '电子邮件',
    C_IP                 varchar(300)                         NULL         comment 'IP',
    C_XMJP               varchar(300)                         NULL         comment '姓名简拼',
    C_CORP               varchar(300)                         NULL         comment '所在单位',
    C_DEPT               varchar(300)                         NULL         comment '所在部门',
    N_Valid              int             default 1            NOT NULL     comment '是否有效',
    N_Order              int             default 1            NOT NULL     comment '显示顺序'
) comment = '帐户表' ;


use db_aty;

-- 权限表

drop table if exists T_Aty_Right;

create table db_aty.T_Aty_Right
(
    C_RightKey           varchar(150)                         NOT NULL     comment '权限字',
    C_Name               varchar(300)                         NOT NULL     comment '权限名称',
    C_Descript           varchar(300)                         NULL         comment '描述',
    N_Order              int                                  NULL         comment '显示顺序'
) comment = '权限表' ;


use db_aty;

-- 角色表

drop table if exists T_Aty_Role;

create table db_aty.T_Aty_Role
(
    C_ID                 varchar(50)                          NOT NULL     comment 'ID',
    C_Name               varchar(300)                         NOT NULL     comment '角色名称',
    C_Descript           varchar(300)                         NULL         comment '描述',
    N_XTGY               int             default 2            NULL         comment '系统固有',
    N_Valid              int             default 1            NULL         comment '是否有效',
    N_Order              int             default 1            NULL         comment '显示顺序'
) comment = '角色表' ;


use db_aty;

-- 角色-权限关系表

drop table if exists T_Aty_Role_Right;

create table db_aty.T_Aty_Role_Right
(
    C_ID                 varchar(32)                          NOT NULL     comment 'ID',
    C_RoleID             varchar(300)                         NOT NULL     comment '角色ID',
    C_RightKey           varchar(300)                         NOT NULL     comment '权限字'
) comment = '角色-权限关系表' ;


use db_aty;

-- 帐号-权限关系表

drop table if exists T_Aty_User_Right;

create table db_aty.T_Aty_User_Right
(
    C_ID                 varchar(32)                          NOT NULL     comment 'ID',
    C_UserID             varchar(300)                         NOT NULL     comment '帐号ID',
    N_Type               int             default 1            NOT NULL     comment '类型',
    C_RoleID             varchar(300)                         NULL         comment '角色ID',
    C_RightKey           varchar(300)                         NULL         comment '权限字'
) comment = '帐号-权限关系表' ;


use db_aty;

-- 图书表

drop table if exists T_Eg_Book;

create table db_aty.T_Eg_Book
(
    C_ID                 varchar(32)                          NOT NULL     comment 'uuid',
    C_NAME               varchar(300)                         NOT NULL     comment '图书名称',
    C_AUTH               varchar(300)                         NULL         comment '作者',
    C_PUBLISHER          varchar(300)                         NULL         comment '出版社',
    F_PRICE              decimal(6, 2)                        NULL         comment '单价',
    D_PUBLISHER          datetime                             NULL         comment '出版日期',
    D_BUY                datetime                             NULL         comment '购买日期',
    C_LIBRARYID          varchar(32)                          NOT NULL     comment '图书室id',
    C_ISBN               varchar(300)                         NULL         comment 'ISBN',
    C_VERSION            varchar(300)                         NULL         comment '第几版',
    I_PHOTO              longblob                             NULL         comment '图书封面',
    T_ABST               text                                 NULL         comment '摘要',
    N_VALID              int             default 1            NULL         comment '是否有效',
    T_INVALIDREASON      text                                 NULL         comment '删除此图书的原因',
    N_TYPE               int                                  NULL         comment '类别',
    I_ATTACH             longblob                             NULL         comment '附件',
    D_BOOKING            datetime                             NULL         comment '预订时间',
    N_BOOKINGUSERID      decimal(17, 2)                       NULL         comment '预订人',
    N_LENDUSERID         decimal(17, 2)                       NULL         comment '借出用户',
    D_LEND               datetime                             NULL         comment '借出人'
) comment = '图书表' ;


use db_aty;

-- 学生表

drop table if exists T_Student;

create table db_aty.T_Student
(
    C_ID                 varchar(32)                          NOT NULL     comment 'uuid',
    C_NAME               varchar(50)                          NULL         comment '学生姓名',
    N_AGE                decimal(3, 0)                        NULL         comment '学生年龄',
    D_BIRTHDAY           datetime                             NULL         comment '学生生日',
    C_DESC               varchar(300)                         NULL         comment '学生名次'
) comment = '学生表' ;


