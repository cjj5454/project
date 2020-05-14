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
                '0001ZZZZ8af5d0ada875',
                '',
                1,
                'CH010105',
                '2020-05-06 18:48:21',
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
                '单表练习2',
                'GLOBLE00000000000000',
                'CH01',
                '0001ZZZZZZ0000CH0101',
                '~',
                '',
                'CH010105',
                NULL,
                '2020-05-06 18:48:21',
                'Y',
                1
        );
go

insert into sm_apppage(pk_apppage,creationtime,creator,dr,iscarddefault,isdefault,modifiedtime,modifier,pagecode,pagedesc,pagename,pageurl,parent_id,parentcode,resid,ts) values('0001ZZZZee4a1b49ee96',null,'~',0,null,'Y',null,'~','CH010105_DemoEtid2',null,'单表练习2','/nccloud/resources/asdf/demoedittable2/ch010105/main/index.html#','0001ZZZZ8af5d0ada875','CH010105','CH010105_DemoEtid2','2020-05-06 18:48:21');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ89a2d7193b61','CH010105','0001ZZZZ8af5d0ada875',0,'单表练习2','CH010105','demoedittable2','CH0101','~','1004Z510000000000FFL','APPCH010105','2020-05-06 18:48:21');
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ231157d85716','0001ZZZZ8af5d0ada875','header','Add','button_main','新增','新增',1,'general_btn',0,'Y',null,'ctrl+/',null,'CH010105_DemoEtid2','group1','CH010105_DemoEtid2_Add','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZf46f68d7eeaf','0001ZZZZ8af5d0ada875','header','Edit','button_secondary','修改','修改',2,'general_btn',0,'Y',null,'alt+p',null,'CH010105_DemoEtid2','group1','CH010105_DemoEtid2_Edit','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ8d15bba56392','0001ZZZZ8af5d0ada875','header','Delete','button_secondary','删除','删除',3,'general_btn',0,'Y',null,'ctrl+del',null,'CH010105_DemoEtid2','group1','CH010105_DemoEtid2_Delete','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZe9c2dea4f295','0001ZZZZ8af5d0ada875','header','Refresh','button_secondary','刷新',null,8,'general_btn',0,'Y',null,null,null,'CH010105_DemoEtid2',null,null,'2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ12fa47769309','0001ZZZZ8af5d0ada875','header','Save','button_main','保存','保存',9,'general_btn',0,'Y',null,'ctrl+s',null,'CH010105_DemoEtid2',null,'CH010105_DemoEtid2_Save','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ3aeb1713784b','0001ZZZZ8af5d0ada875','header','Cancel','button_secondary','取消','取消',10,'general_btn',0,'Y',null,'alt+q',null,'CH010105_DemoEtid2',null,'CH010105_DemoEtid2_Cancel','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ165fb640a371','0001ZZZZ8af5d0ada875','table-opr-area','EditLine','button_secondary','修改行','修改',11,'general_btn',0,'Y',null,null,null,'CH010105_DemoEtid2',null,'CH010105_DemoEtid2_EditLine','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZff743818a610','0001ZZZZ8af5d0ada875','table-opr-area','DelLine','button_secondary','删除行','删除',13,'general_btn',0,'Y',null,null,null,'CH010105_DemoEtid2',null,'CH010105_DemoEtid2_DelLine','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ8bfda7ba88ba','0001ZZZZ8af5d0ada875','table-opr-area','Spread','button_secondary','展开','展开',12,'general_btn',0,'Y','N',null,null,'CH010105_DemoEtid2',null,'CH010105_DemoEtid2_Spread','2020-05-06 18:48:21')
;
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ2c7453f093c5','0001ZZZZ8af5d0ada875','header','group1','button_secondary','新增修改删除按钮组',null,0,'buttongroup',0,'Y','N',null,null,'CH010105_DemoEtid2',null,null,'2020-05-06 18:48:21')
;
go

