insert into sm_appregister(pk_appregister,app_desc,apptype,code,creationtime,creator,dr,fun_property,funtype,height,help_name,image_src,iscauserusable,iscopypage,isenable,mdid,modifiedtime,modifier,mountid,name,orgtypecode,own_module,parent_id,pk_group,resid,source_app_code,target_path,ts,uselicense_load,width)
values('0001ZZZZZZ0000CH0101','',0,'CH0101','2020-05-06 18:48:21','~',0,null,null,null,'',null,null,'N','Y','~',null,'~',null,'单表练习2',null,'CH01','CH01','~','',null,null,'2020-05-06 18:48:21',null,null);
go



insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ4b3c1e14469f',null,null,0,null,'CH','asdf',null,'~','1004Z510000000000FFL',null,'2020-05-06 18:48:21');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ8c686d96c453',null,null,0,null,'CH01','asdf','CH','~','1004Z510000000000FFL',null,'2020-05-06 18:48:21');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ71699334d421',null,null,0,null,'CH0101','demoedittable2','CH01','~','1004Z510000000000FFL',null,'2020-05-06 18:48:21');
go


