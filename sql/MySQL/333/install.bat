rem ÊÊÓÃÓÚMYSQL 5.1¼°ÆäÒÔÉÏ°æ±¾
set MYSQL="C:/Program Files/MySQL/MySQL Server 5.5/bin/mysql" -h localhost -u root -proot  --default-character-set=utf8 
set character_set_results = utf8;
%MYSQL% < create/02.CT_DEMO.SQL
%MYSQL% < create/03.CI_DEMO.sql
%MYSQL% < insert/02.I_T_Aty_Code_DEMO.sql
%MYSQL% < insert/02.I_T_Aty_CodeType_DEMO.sql
%MYSQL% < insert/02.I_T_Aty_Right_DEMO.sql
%MYSQL% < insert/02.I_T_Aty_User_DEMO.sql
%MYSQL% < insert/02.I_T_Eg_Book_DEMO.sql
%MYSQL% < insert/02.I_T_Student_DEMO.sql
