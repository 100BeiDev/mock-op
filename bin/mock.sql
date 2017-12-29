drop table if exists t_app;

drop table if exists t_group;

drop table if exists t_user;

/*==============================================================*/
/* Table: t_app                                                 */
/*==============================================================*/
create table t_app
(
   app_id               int not null auto_increment,
   group_name           varchar(32) comment '组名称',
   app_name             varchar(32) comment '应用服务名称',
   req_uri              varchar(32) comment '请求地址',
   req_input            varchar(512) comment '请求输入',
   req_output           varchar(512) comment '请求输出',
   valid_flag           bit comment '是否有效标识',
   method               varchar(32) comment '请求方法',
   mock_flag            bit comment '是否模拟标识',
   protocol             varchar(32) comment '协议类型',
   create_time          datetime,
   update_time          datetime,
   primary key (app_id)
);

/*==============================================================*/
/* Table: t_group                                               */
/*==============================================================*/
create table t_group
(
   group_id             int not null auto_increment,
   group_name           varchar(32) comment '组名称',
   app_name             varchar(32) comment '应用服务名称',
   create_time          datetime,
   update_time          datetime,
   primary key (group_id)
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   user_id              int not null auto_increment,
   user_name            varchar(32) comment '用户名',
   password             varchar(32) comment '登录密码',
   create_time          datetime,
   update_time          datetime,
   primary key (user_id)
);
