insert into sm_appregister(pk_appregister,app_desc,apptype,code,creationtime,creator,dr,fun_property,funtype,height,help_name,image_src,iscauserusable,iscopypage,isenable,mdid,modifiedtime,modifier,mountid,name,orgtypecode,own_module,parent_id,pk_group,resid,source_app_code,target_path,ts,uselicense_load,width)
values('0001ZZZZZZ0000CH0101','',0,'CH0101','2020-04-30 14:41:25','~',0,null,null,null,'',null,null,'N','Y','~',null,'~',null,'单表练习',null,'CH01','CH01','~','',null,null,'2020-04-30 14:41:25',null,null);
go



insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ7e103bc84ad4',null,null,0,null,'CH','asdf',null,'~','1004Z510000000000FFL',null,'2020-04-30 14:41:25');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ864357a767fc',null,null,0,null,'CH01','asdf','CH','~','1004Z510000000000FFL',null,'2020-04-30 14:41:25');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ0710c8d127f4',null,null,0,null,'CH0101','demoedittable','CH01','~','1004Z510000000000FFL',null,'2020-04-30 14:41:25');
go


