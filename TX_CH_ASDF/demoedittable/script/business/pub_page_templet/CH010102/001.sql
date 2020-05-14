insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ8fb8e76b8b39','CH010102',null,'CH010102_demoEtidVO',null,'~',0,'head','Y',null,null,'~','单表练习','CH010102_demoEtidVO','root',null,null,'CH010102_0001',null,null,'2020-04-30 14:41:25');
go

insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ5096faea0356','单表练习查询模板',null,0,null,'search','2020-04-30 14:41:25','~',0,'Y','594cd059-db2e-4646-9aff-dc096da2dee6','demoEtid','asdf.demoEtidTable',null,'~','单表练习查询模板','false',1,null,'CH010102_0002','0001ZZZZ8fb8e76b8b39','2020-04-30 14:41:25');
go

insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZa99cb690f620','单表练习',null,2,'nc.vo.asdf.demoetidtable.DemoEtidVO','head','2020-04-30 14:41:25','~',0,'Y','594cd059-db2e-4646-9aff-dc096da2dee6','demoEtid','asdf.demoEtidTable',null,'~','单表练习','false',2,null,'CH010102_0003','0001ZZZZ8fb8e76b8b39','2020-04-30 14:41:25');
go


            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ14086a199fac','0001ZZZZ5096faea0356','594cd059-db2e-4646-9aff-dc096da2dee6','pk_demoetid',null,null,'~',1,'','','','','','','','N',0,'N','N','N','N','N','Y','Y','Y','input','主键',20,NULL,'pk_demoetid','=@','等于@',1,'9850b3df-65f2-41f2-9830-50fc73fa1378','','/common-ref/','-99','N','','refpk',1,'','2020-04-30 14:41:25','N','N',null,1);
            go
            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ60c63a69a9ab','0001ZZZZ5096faea0356','594cd059-db2e-4646-9aff-dc096da2dee6','demo_name',null,null,'~',1,'','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','input','名称',50,NULL,'demo_name','=@','等于@',3,'ecdc9ea0-d050-4e8e-8cb3-6fbd4db267a2','','/common-ref/','-99','N','','refpk',1,'','2020-04-30 14:41:25','N','Y',null,1);
            go
            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ564da329e267','0001ZZZZ5096faea0356','594cd059-db2e-4646-9aff-dc096da2dee6','demo_age',null,null,'~',1,'','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','input','年龄',50,NULL,'demo_age','=@','等于@',4,'73b2e485-5471-4c9e-94bd-0f7bc8c48456','','/common-ref/','-99','N','','refpk',1,'','2020-04-30 14:41:25','N','Y',null,1);
            go
            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ013b6cc89340','0001ZZZZ5096faea0356','594cd059-db2e-4646-9aff-dc096da2dee6','demo_sex',null,null,'~',203,'男=1,女=2','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','select','性别',50,NULL,'demo_sex','=@','等于@',5,'d8227e00-3df4-4ed4-8557-ab152f855f49','','/common-ref/','-99','N','','refpk',1,'','2020-04-30 14:41:25','N','Y',null,1);
            go
            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ8d9c73c932ff','0001ZZZZ5096faea0356','594cd059-db2e-4646-9aff-dc096da2dee6','demo_depa',null,null,'~',1,'','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','input','部门',50,NULL,'demo_depa','=@','等于@',6,'976d364f-1c7d-4b63-aca3-15c16ef4509d','','/common-ref/','-99','N','','refpk',1,'','2020-04-30 14:41:25','N','Y',null,1);
            go
            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ9fd5f6f8d30a','0001ZZZZ5096faea0356','594cd059-db2e-4646-9aff-dc096da2dee6','pk_group',null,null,'~',204,'','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','refer','集团',20,'uap.group.name','pk_group','=@','等于@',2,'cd31a95d-12f8-490a-a84e-dad6b7b7e8d3','','uap/refer/riart/groupTreeRef/index','集团','N','','refpk',1,'','2020-04-30 14:41:25','N','Y',null,1);
            go


        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZ51e4c9775000','0001ZZZZa99cb690f620','594cd059-db2e-4646-9aff-dc096da2dee6','pk_demoetid','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','主键',20,NULL,'','pk_demoetid',null,'~',1,'522d2dd1-cfe4-4177-b890-0370b27f7774','/common-ref/','-99',null,'Y','',null,null,'2020-04-30 14:41:25',null,'N',null);
        go
        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZ51e4c9775001','0001ZZZZa99cb690f620','594cd059-db2e-4646-9aff-dc096da2dee6','demo_name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','名称',50,NULL,'','demo_name',null,'~',3,'c67fdfb6-8160-4f4f-a7c7-2e91dde52e07','/common-ref/','-99',null,'N','',null,null,'2020-04-30 14:41:25',null,'Y',null);
        go
        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZ51e4c9775002','0001ZZZZa99cb690f620','594cd059-db2e-4646-9aff-dc096da2dee6','demo_age','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','年龄',50,NULL,'','demo_age',null,'~',4,'a7f2b24f-ea98-4750-a999-26e31136779d','/common-ref/','-99',null,'N','',null,null,'2020-04-30 14:41:25',null,'Y',null);
        go
        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZ51e4c9775003','0001ZZZZa99cb690f620','594cd059-db2e-4646-9aff-dc096da2dee6','demo_sex','1','#111111',null,'~',203,'男=1,女=2', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','select','性别',50,NULL,'','demo_sex',null,'~',5,'fc57af58-35c9-41e2-be37-94b184981ca8','/common-ref/','-99',null,'N','',null,null,'2020-04-30 14:41:25',null,'Y',null);
        go
        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZ51e4c9775004','0001ZZZZa99cb690f620','594cd059-db2e-4646-9aff-dc096da2dee6','demo_depa','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','部门',50,NULL,'','demo_depa',null,'~',6,'cb9a3c5a-37a4-4426-8b0b-ee50422a2ca4','/common-ref/','-99',null,'N','',null,null,'2020-04-30 14:41:25',null,'Y',null);
        go
        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZ51e4c9775005','0001ZZZZa99cb690f620','594cd059-db2e-4646-9aff-dc096da2dee6','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',20,'uap.group.name','','pk_group',null,'~',2,'b66809e7-02c1-437c-a247-9b0aa1c311f6','uap/refer/riart/groupTreeRef/index','集团',null,'N','',null,null,'2020-04-30 14:41:25',null,'Y',null);
        go

