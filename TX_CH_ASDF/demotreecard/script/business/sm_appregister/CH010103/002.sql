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
                '0001ZZZZ6acb8d9a8f51',
                '',
                1,
                'CH010103',
                '2020-04-30 14:52:05',
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
                '树卡练习',
                'GLOBLE00000000000000',
                'CH01',
                '0001ZZZZZZ0000CH0101',
                '~',
                '',
                'CH010103',
                NULL,
                '2020-04-30 14:52:05',
                'Y',
                1
        );
go

insert into sm_apppage(pk_apppage,creationtime,creator,dr,iscarddefault,isdefault,modifiedtime,modifier,pagecode,pagedesc,pagename,pageurl,parent_id,parentcode,resid,ts) values('0001ZZZZ97a9afdc87ed',null,'~',0,null,'Y',null,'~','CH010103_demotreeVO',null,'树卡练习','/nccloud/resources/asdf/demotreecard/ch010103/main/index.html#','0001ZZZZ6acb8d9a8f51','CH010103','CH010103_demotreeVO','2020-04-30 14:52:05');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ7a7e1d0be296','CH010103','0001ZZZZ6acb8d9a8f51',0,'树卡练习','CH010103','demotreecard','CH0101','~','1004Z510000000000FFL','APPCH010103','2020-04-30 14:52:05');
go


insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ73b56faffb8b','0001ZZZZ6acb8d9a8f51','header-action','Save','button_main',null,'保存',1,'general_btn',0,'Y',null,'ctrl+s',null,'CH010103_demotreeVO','saveGroup',null,'2020-04-30 14:52:05');
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZeeae30546f01','0001ZZZZ6acb8d9a8f51','header-action','SaveAdd','button_secondary',null,'保存新增',2,'general_btn',0,'Y',null,'alt+s',null,'CH010103_demotreeVO','saveGroup',null,'2020-04-30 14:52:05');
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZ9c41cc5f2280','0001ZZZZ6acb8d9a8f51','header-action','Cancel','button_secondary',null,'取消',3,'general_btn',0,'Y',null,'alt+q',null,'CH010103_demotreeVO',null,null,'2020-04-30 14:52:05');
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZe6dbdfe8e2a5','0001ZZZZ6acb8d9a8f51','header-action','Refresh','button_secondary',null,null,7,'general_btn',0,'Y',null,null,null,'CH010103_demotreeVO',null,null,'2020-04-30 14:52:05');
go
insert into sm_appbutnregister(pk_btn,appid,btnarea,btncode,btncolor,btndesc,btnname,btnorder,btntype,dr,isenable,iskeyfunc,keyboard,pageareacode,pagecode,parent_code,resid,ts) values('0001ZZZZafa7bd45c39f','0001ZZZZ6acb8d9a8f51','header-action','saveGroup','button_secondary',null,null,0,'buttongroup',0,'Y',null,null,null,'CH010103_demotreeVO',null,null,'2020-04-30 14:52:05');
go




