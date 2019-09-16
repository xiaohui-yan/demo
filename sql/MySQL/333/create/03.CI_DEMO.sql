-- auto create by SMD

use db_aty;

call pr_Drop_index_if_exists('T_Aty_Code','I_Aty_Code_Code');

create  index I_Aty_Code_Code on T_Aty_Code (C_Code);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Right','I_Aty_Right_RightKey');

create  index I_Aty_Right_RightKey on T_Aty_Right (C_RightKey);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User','I_Aty_User_LoginID');

create  index I_Aty_User_LoginID on T_Aty_User (C_LoginID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User','I_Aty_User_CORP');

create  index I_Aty_User_CORP on T_Aty_User (C_CORP);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User','I_Aty_User_DEPT');

create  index I_Aty_User_DEPT on T_Aty_User (C_DEPT);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User','I_Aty_User_Order');

create  index I_Aty_User_Order on T_Aty_User (N_Order);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Dept','I_Aty_Dept_CORP');

create  index I_Aty_Dept_CORP on T_Aty_Dept (C_CORP);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Dept','I_Aty_Dept_Order');

create  index I_Aty_Dept_Order on T_Aty_Dept (N_Order);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Role_Right','I_Aty_Role_Right_RoleID');

create  index I_Aty_Role_Right_RoleID on T_Aty_Role_Right (C_RoleID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Role_Right','I_Aty_Role_Right_RightKey');

create  index I_Aty_Role_Right_RightKey on T_Aty_Role_Right (C_RightKey);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User_Right','I_Aty_User_Right_UserID');

create  index I_Aty_User_Right_UserID on T_Aty_User_Right (C_UserID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User_Right','I_Aty_User_Right_RoleID');

create  index I_Aty_User_Right_RoleID on T_Aty_User_Right (C_RoleID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User_Right','I_Aty_User_Right_RightKey');

create  index I_Aty_User_Right_RightKey on T_Aty_User_Right (C_RightKey);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_CodeType','I_PK_T_Aty_CodeType');

create  index I_PK_T_Aty_CodeType on T_Aty_CodeType (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Code','I_PK_T_Aty_Code');

create  index I_PK_T_Aty_Code on T_Aty_Code (C_PID, C_Code);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Corp','I_PK_T_Aty_Corp');

create  index I_PK_T_Aty_Corp on T_Aty_Corp (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Dept','I_PK_T_Aty_Dept');

create  index I_PK_T_Aty_Dept on T_Aty_Dept (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User','I_PK_T_Aty_User');

create  index I_PK_T_Aty_User on T_Aty_User (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Right','I_PK_T_Aty_Right');

create  index I_PK_T_Aty_Right on T_Aty_Right (C_RightKey);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Role','I_PK_T_Aty_Role');

create  index I_PK_T_Aty_Role on T_Aty_Role (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_Role_Right','I_PK_T_Aty_Role_Right');

create  index I_PK_T_Aty_Role_Right on T_Aty_Role_Right (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Aty_User_Right','I_PK_T_Aty_User_Right');

create  index I_PK_T_Aty_User_Right on T_Aty_User_Right (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Eg_Book','I_PK_T_Eg_Book');

create  index I_PK_T_Eg_Book on T_Eg_Book (C_ID);


use db_aty;

call pr_Drop_index_if_exists('T_Student','I_PK_T_Student');

create  index I_PK_T_Student on T_Student (C_ID);


