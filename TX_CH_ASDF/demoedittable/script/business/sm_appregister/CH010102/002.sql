INSERT INTO sm_appregister (
        pk_appregister,
        app_desc,
        apptype,
        code,
        creationtime,
        creator,
        dr,
        fun_property,
        funtype,
        height,
        help_name,
        image_src,
        iscauserusable,
        iscopypage,
        isenable,
        mdid,
        modifiedtime,
        modifier,
        mountid,
        name,
        orgtypecode,
        own_module,
        parent_id,
        pk_group,
        resid,
        source_app_code,
        target_path,
        ts,
        uselicense_load,
        width
)
VALUES
        (
                '0001ZZZZ11b1b4dc322e',
                '',
                1,
                'CH010102',
                '2020-04-30 14:41:25',
                '~',
                0,
                0,
                0,
                1,
                '',
                'businessprocess',
                'N',
                'N',
                'Y',
                '~',
                NULL,
                '~',
                NULL,
                '单表练习',
                'GLOBLE00000000000000',
                'CH01',
                '0001ZZZZZZ0000CH0101',
                '~',
                '',
                'CH010102',
                NULL,
                '2020-04-30 14:41:25',
                'Y',
                1
        );
go

insert into sm_apppage(pk_apppage,creationtime,creator,dr,iscarddefault,isdefault,modifiedtime,modifier,pagecode,pagedesc,pagename,pageurl,parent_id,parentcode,resid,ts) values('0001ZZZZfe3d39587141',null,'~',0,null,'Y',null,'~','CH010102_demoEtidVO',null,'单表练习','/nccloud/resources/asdf/demoedittable/ch010102/main/index.html#','0001ZZZZ11b1b4dc322e','CH010102','CH010102_demoEtidVO','2020-04-30 14:41:25');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZf7aa63e66eb0','CH010102','0001ZZZZ11b1b4dc322e',0,'单表练习','CH010102','demoedittable','CH0101','~','1004Z510000000000FFL','APPCH010102','2020-04-30 14:41:25');
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ969c9a31bd6e','0001ZZZZ11b1b4dc322e','header','Add','button_main','新增','新增',1,'general_btn',0,'Y',null,'ctrl+/',null,'CH010102_demoEtidVO','group1','CH010102_demoEtidVO_Add','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ7468513fceb5','0001ZZZZ11b1b4dc322e','header','Edit','button_secondary','修改','修改',2,'general_btn',0,'Y',null,'alt+p',null,'CH010102_demoEtidVO','group1','CH010102_demoEtidVO_Edit','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ605e6d956b96','0001ZZZZ11b1b4dc322e','header','Delete','button_secondary','删除','删除',3,'general_btn',0,'Y',null,'ctrl+del',null,'CH010102_demoEtidVO','group1','CH010102_demoEtidVO_Delete','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ40aa1dbe8f2f','0001ZZZZ11b1b4dc322e','header','Refresh','button_secondary','刷新',null,8,'general_btn',0,'Y',null,null,null,'CH010102_demoEtidVO',null,null,'2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ79f763745d1e','0001ZZZZ11b1b4dc322e','header','Save','button_main','保存','保存',9,'general_btn',0,'Y',null,'ctrl+s',null,'CH010102_demoEtidVO',null,'CH010102_demoEtidVO_Save','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ15f713e5b326','0001ZZZZ11b1b4dc322e','header','Cancel','button_secondary','取消','取消',10,'general_btn',0,'Y',null,'alt+q',null,'CH010102_demoEtidVO',null,'CH010102_demoEtidVO_Cancel','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ764d628055d7','0001ZZZZ11b1b4dc322e','table-opr-area','EditLine','button_secondary','修改行','修改',11,'general_btn',0,'Y',null,null,null,'CH010102_demoEtidVO',null,'CH010102_demoEtidVO_EditLine','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ3bbefbab347a','0001ZZZZ11b1b4dc322e','table-opr-area','DelLine','button_secondary','删除行','删除',13,'general_btn',0,'Y',null,null,null,'CH010102_demoEtidVO',null,'CH010102_demoEtidVO_DelLine','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZf15587f8b7cb','0001ZZZZ11b1b4dc322e','table-opr-area','Spread','button_secondary','展开','展开',12,'general_btn',0,'Y','N',null,null,'CH010102_demoEtidVO',null,'CH010102_demoEtidVO_Spread','2020-04-30 14:41:25')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ39fa1f8b177f','0001ZZZZ11b1b4dc322e','header','group1','button_secondary','新增修改删除按钮组',null,0,'buttongroup',0,'Y','N',null,null,'CH010102_demoEtidVO',null,null,'2020-04-30 14:41:25')
;
go

