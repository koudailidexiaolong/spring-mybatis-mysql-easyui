/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/26 13:58:51                           */
/*==============================================================*/

drop function if exists fun_seq;

drop table if exists system_menu_button;

drop table if exists system_dictionary;

drop table if exists system_logger;

drop table if exists system_logger_exption;

drop table if exists system_menu;

drop table if exists system_org;

drop table if exists system_role;

drop table if exists system_role_menu_mapped;

drop table if exists system_user;

drop table if exists system_user_role_mapped;

/*==============================================================*/
/* Table: system_menu_button                                    */
/*==============================================================*/
create table system_menu_button
(
   button_id            VARCHAR(32) not null comment '按钮编号',
   button_name          VARCHAR(100) comment '按钮名称',
   button_code          VARCHAR(100) comment '按钮代码',
   button_url           VARCHAR(100) comment '按钮地址URL',
   button_status        VARCHAR(2) default '0' comment '按钮状态0：正常1：禁用',
   user_id              VARCHAR(32) comment '按钮创建人',
   button_ico           VARCHAR(100) comment '按钮图标',
   menu_id              VARCHAR(32) comment '菜单编号',
   button_order         double comment '按钮顺序',
   button_create_time   datetime not null default CURRENT_TIMESTAMP comment '按钮创建时间',
   button_update_time   datetime default CURRENT_TIMESTAMP comment '按钮修改时间',
   button_father        VARCHAR(100) comment '按钮节点',
   button_reserve_a     VARCHAR(1024) comment '备用字段1',
   button_reserve_b     VARCHAR(1024) comment '备用字段2',
   button_reserve_c     VARCHAR(1024) comment '备用字段3',
   primary key (button_id)
);

alter table system_button comment '系统菜单中按钮信息的存储';

/*==============================================================*/
/* Table: system_dictionary                                     */
/*==============================================================*/
create table system_dictionary
(
   dictionary_id        int not null  auto_increment comment '数据字典编号',
   org_id               VARCHAR(32) comment '组织机构编码',
   dictionary_type      VARCHAR(50) comment '节点类型',
   dictionary_code      VARCHAR(100) comment '节点编码',
   dictionary_name      VARCHAR(100) comment '节点名称',
   dictionary_desc      VARCHAR(100) comment '节点描述',
   dictionary_parent_code VARCHAR(100) comment '父级节点',
   dictionary_create_time datetime default CURRENT_TIMESTAMP comment '创建时间',
   dictionary_create_user_id VARCHAR(32) comment '创建人',
   dictionary_update_time datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间',
   dictionary_update_user_id VARCHAR(32) comment '修改人',
   dictionary_status    VARCHAR(10) default '0' comment '字典状态：0-正常1-禁用',
   dictionary_order     double default 1 comment '顺序 默认从1开始',
   dictionary_reserve_a VARCHAR(1024) comment '备用字段1',
   dictionary_reserve_b VARCHAR(1024) comment '备用字段2',
   dictionary_reserve_c VARCHAR(1024) comment '备用字段3',
   primary key (dictionary_id)
)
auto_increment = 1;

alter table system_dictionary comment '数据字典表存储一些公用的类型信息';

/*==============================================================*/
/* Table: system_logger                                         */
/*==============================================================*/
create table system_logger
(
   logger_id            VARCHAR(32) not null comment '日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列',
   org_id               VARCHAR(32) comment '组织机构编码',
   logger_type          VARCHAR(100) comment '日志类型',
   logger_type_name     VARCHAR(10) comment '日志类型名称',
   logger_create_time   datetime default CURRENT_TIMESTAMP comment '日志创建时间',
   user_id              VARCHAR(32) comment '用户编号',
   user_name            VARCHAR(100) comment '用户姓名',
   logger_ip            VARCHAR(100) comment '日志IP',
   logger_module        VARCHAR(100) comment '操作的业务模块',
   logger_module_method VARCHAR(100) comment '操作的业务模块的方法',
   logger_response_time VARCHAR(100) comment '访问响应时间 毫秒',
   logger_operating_system varchar(100) DEFAULT NULL COMMENT '浏览器使用的系统',
   logger_browser_type varchar(100) DEFAULT NULL COMMENT '浏览器类型',
   logger_browser_version varchar(100) DEFAULT NULL COMMENT '浏览器版本',
   logger_reserve_a     VARCHAR(1024) comment '备用字段1',
   logger_reserve_b     VARCHAR(1024) comment '备用字段2',
   logger_reserve_c     VARCHAR(1024) comment '备用字段3',
   primary key (logger_id)
);


alter table system_logger comment '存储系统用户操作，如新增用户，菜单、按钮、机构等基础信息模块';

/*==============================================================*/
/* Table: system_logger_exption                                 */
/*==============================================================*/
create table system_logger_exption
(
   logger_exption_id    VARCHAR(32) not null comment '日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列',
   org_id               VARCHAR(32) comment '组织机构编码',
   logger_exption_type  VARCHAR(100) comment '日志类型',
   logger_exption_time  datetime default CURRENT_TIMESTAMP comment '日志创建时间',
   user_id              VARCHAR(32) comment '用户编号',
   user_name            VARCHAR(100) comment '用户姓名',
   logger_exption_ip    VARCHAR(100) comment '日志IP',
   logger_exption_module VARCHAR(100) comment '日志调用模块',
   logger_exption_method VARCHAR(10) comment '日志调用模块方法',
   logger_exption_desc  VARCHAR(1024) comment '日志描述',
   logger_exption_context text comment '日志异常信息',
   logger_operating_system varchar(100) DEFAULT NULL COMMENT '浏览器使用的系统',
   logger_browser_type varchar(100) DEFAULT NULL COMMENT '浏览器类型',
   logger_browser_version varchar(100) DEFAULT NULL COMMENT '浏览器版本',
   logger_exption_reserve_a VARCHAR(1024) comment '备用字段1',
   logger_exption_reserve_b VARCHAR(1024) comment '备用字段2',
   logger_exption_reserve_c VARCHAR(1024) comment '备用字段3',
   primary key (logger_exption_id)
);

alter table system_logger_exption comment '存储系统用户操作，如新增用户，菜单、按钮、机构等基础信息模块';

/*==============================================================*/
/* Table: system_menu                                           */
/*==============================================================*/
create table system_menu
(
   menu_id              VARCHAR(32) not null comment '菜单编号',
   menu_name            VARCHAR(100) comment '菜单名称',
   menu_code            VARCHAR(100) comment '菜单代码',
   menu_father_id       VARCHAR(100) comment '菜单父节点',
   menu_order           double comment '菜单顺序',
   menu_status          VARCHAR(10) default '0' comment '菜单状态：0正常1禁用',
   menu_update_time     datetime default CURRENT_TIMESTAMP comment '菜单修改时间',
   menu_url             VARCHAR(1024) comment '菜单地址URL',
   menu_create_time     datetime not null default CURRENT_TIMESTAMP comment '菜单创建时间',
   user_id              VARCHAR(32) comment '菜单创建人',
   menu_ico             VARCHAR(1024) comment '菜单图标',
   menu_level           VARCHAR(10) comment '是否有子节点',
   menu_reserve_a       VARCHAR(1024) comment '备用字段1',
   menu_reserve_b       VARCHAR(1024) comment '备用字段2',
   menu_reserve_c       VARCHAR(1024) comment '备用字段3',
   primary key (menu_id)
);

alter table system_menu comment '系统展示菜单信息的存储';

/*==============================================================*/
/* Table: system_org                                            */
/*==============================================================*/
create table system_org
(
   org_id               VARCHAR(32) not null comment '组织机构编码',
   org_phone            VARCHAR(1000) comment '机构电话',
   org_full_name        VARCHAR(100) not null comment '组织机构名称全称',
   org_name             VARCHAR(100) comment '组织机构名称简称',
   org_parent_id        VARCHAR(32) not null comment '组织机构父级节点编码',
   org_parent_name      VARCHAR(100) comment '组织机构父级节点名称',
   org_leaf             VARCHAR(2) not null comment '是否有节点 0：是1：否',
   org_address          VARCHAR(1000) comment '组织机构地址',
   org_level            VARCHAR(2) comment '组织机构等级',
   org_type             VARCHAR(10) comment '组织机构类型',
   org_area             VARCHAR(100) comment '组织机构行政区划名称',
   org_area_code        VARCHAR(30) comment '组织机构行政区划编码',
   org_create_date      DATE comment '成立日期',
   org_status           VARCHAR(10) not null default '0' comment '组织机构状态：0：正常1：禁用',
   org_create_time      datetime default CURRENT_TIMESTAMP comment '组织机构创建时间',
   org_create_user_id   VARCHAR(32) comment '组织机构创建人',
   org_update_time      datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '组织机构修改时间',
   org_update_user_ld   VARCHAR(32) comment '组织机构修改人',
   org_desc             VARCHAR(4000) comment '机构备注',
   org_reserve_a        VARCHAR(1024) comment '备用字段1',
   org_reserve_b        VARCHAR(1024) comment '备用字段2',
   org_reserve_c        VARCHAR(1024) comment '备用字段3',
   primary key (org_id)
);

alter table system_org comment '系统组织机构信息的存储';

/*==============================================================*/
/* Table: system_role                                           */
/*==============================================================*/
create table system_role
(
   role_id              int not null  AUTO_INCREMENT comment '角色编号',
   org_id               VARCHAR(32) comment '组织机构编码',
   role_name            VARCHAR(100) comment '角色名称',
   role_desc            VARCHAR(100) comment '角色描述',
   role_type            VARCHAR(10) comment '角色类型',
   role_create_time     datetime not null default CURRENT_TIMESTAMP comment '角色创建时间',
   role_create_user_id  VARCHAR(32) comment '角色创建人',
   role_update_time     datetime default CURRENT_TIMESTAMP comment '角色修改时间',
   role_update_user_id  VARCHAR(32) comment '角色修改人',
   role_status          VARCHAR(10) comment '角色状态：0：正常1：禁用',
   role_reserve_a       VARCHAR(1024) comment '备用字段1',
   role_reserve_b       VARCHAR(1024) comment '备用字段2',
   role_reserve_c       VARCHAR(1024) comment '备用字段3',
   primary key (role_id)
)
auto_increment = 1;

alter table system_role comment '系统角色定义信息';

/*==============================================================*/
/* Table: system_role_menu_mapped                               */
/*==============================================================*/
create table system_role_menu_mapped
(
   mapped_id            int not null  AUTO_INCREMENT comment '角色菜单关系编号',
   role_id              int comment '角色编号',
   menu_id              VARCHAR(32) comment '菜单编号',
   org_id               VARCHAR(32) comment '组织机构编码',
   mapped_menu_array    VARCHAR(4000) comment '菜单按钮数组以，区分',
   mapped_desc          VARCHAR(1024) comment '角色菜单关系描述',
   mapped_create_time   datetime not null default CURRENT_TIMESTAMP comment '角色菜单关系创建时间',
   user_id              VARCHAR(32) comment '角色菜单关系创建人',
   mapped_update_time   datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '角色菜单关系修改时间',
   mapped_status        VARCHAR(10) comment '角色菜单关系状态:0正常1禁用',
   mapped_reserve_a     VARCHAR(1024) comment '备用字段1',
   mapped_reserve_b     VARCHAR(1024) comment '备用字段2',
   mapped_reserve_c     VARCHAR(1024) comment '备用字段3',
   primary key (mapped_id)
)
auto_increment = 1;

alter table system_role_menu_mapped comment '系统菜单角色与菜单和按钮的关系存储';

/*==============================================================*/
/* Table: system_user                                           */
/*==============================================================*/
create table system_user
(
   user_id              VARCHAR(32) not null comment '用户登录名',
   org_id               VARCHAR(32) comment '组织机构编码',
   user_password        VARCHAR(100) not null comment '用户登录密码',
   user_name            VARCHAR(30) not null comment '用户姓名',
   user_age             VARCHAR(3) comment '用户年龄：1-999',
   user_sex             VARCHAR(4) default '0' comment '用户性别：0：男 1：女2：未知',
   user_identity        VARCHAR(18) not null comment '用户身份证号码',
   user_address         VARCHAR(1024) comment '用户地址',
   user_phone           VARCHAR(20) comment '用户电话',
   user_mail            VARCHAR(100) comment '用户邮箱',
   user_desc            VARCHAR(1024) comment '用户描述',
   user_image           VARCHAR(1024) comment '用户图像url',
   user_create_time     datetime default CURRENT_TIMESTAMP comment '用户创建时间',
   user_create_user_id  VARCHAR(32) comment '用户创建人',
   user_update_time     datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '用户修改时间',
   user_update_user_id  VARCHAR(32) comment '用户修改人',
   user_update_password_time datetime default CURRENT_TIMESTAMP comment '用户密码修改时间',
   user_status          VARCHAR(10) default '0' comment '用户状态：0：正常1：停用',
   user_skin            VARCHAR(100) comment '用户皮肤',
   user_level           VARCHAR(4) comment '用户等级',
   user_reserve_a       VARCHAR(1024) comment '备用字段1',
   user_reserve_b       VARCHAR(1024) comment '备用字段2',
   user_reserve_c       VARCHAR(1024) comment '备用字段3',
   primary key (user_id)
);

alter table system_user comment '系统使用者用户的信息存储';

/*==============================================================*/
/* Table: system_user_role_mapped                               */
/*==============================================================*/
create table system_user_role_mapped
(
   mapped_id            int not null  AUTO_INCREMENT comment '用户角色关系编号',
   user_id              VARCHAR(32) comment '用户编号',
   role_id              int comment '角色编号',
   org_id               VARCHAR(32) comment '组织机构编码',
   mapped_status        VARCHAR(10) comment '用户角色关系状态：0正常1：停用禁用',
   mapped_create_time   datetime default CURRENT_TIMESTAMP comment '用户角色关系创建时间',
   mapped_create_user_id VARCHAR(10) comment '用户角色关系创建人',
   mapped_reserve_a     VARCHAR(1024) comment '备用字段1',
   mapped_reserve_b     VARCHAR(1024) comment '备用字段2',
   mapped_reserve_c     VARCHAR(1024) comment '备用字段3',
   primary key (mapped_id)
)
auto_increment = 1;

alter table system_user_role_mapped comment '用户与角色的关系信息表';


drop table if exists system_role_button_mapped;

/*==============================================================*/
/* Table: system_role_button_mapped                             */
/*==============================================================*/
create table system_role_button_mapped
(
   mapped_id            int not null  auto_increment comment '角色菜单关系编号',
   role_id              int comment '角色编号',
   menu_id              VARCHAR(32) comment '菜单编号',
   button_id            VARCHAR(32)comment '按钮编号',
   org_id               VARCHAR(32) comment '组织机构编码',
   mapped_desc          VARCHAR(1024) comment '角色菜单关系描述',
   mapped_create_time   datetime not null default CURRENT_TIMESTAMP comment '角色菜单关系创建时间',
   user_id              VARCHAR(32) comment '角色菜单关系创建人',
   mapped_update_time   datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '角色菜单关系修改时间',
   mapped_status        VARCHAR(10) comment '角色菜单关系状态:0正常1禁用',
   mapped_reserve_a     VARCHAR(1024) comment '备用字段1',
   mapped_reserve_b     VARCHAR(1024) comment '备用字段2',
   mapped_reserve_c     VARCHAR(1024) comment '备用字段3',
   primary key (mapped_id)
)
auto_increment = 1;

alter table system_role_button_mapped comment '系统菜单角色与按钮的关系存储';

CREATE  FUNCTION fun_seq(department varchar(32)) RETURNS varchar(32) CHARSET utf8
BEGIN
    declare  datetimes varchar(14);
	declare seq varchar(6);
    declare returnSEQ varchar(32);
    select date_format(now(),'%Y%m%d%H%i%s') INTO datetimes;
	select lpad(FLOOR(RAND()*1000000),6,'0') into seq;
 if (trim(department) is null or department = '') then
  SET returnSEQ = CONCAT(datetimes,seq);
  else
  SET returnSEQ = CONCAT(department,datetimes,seq) ;
  end if;
RETURN returnSEQ;
END;

