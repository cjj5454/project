import { high } from 'nc-lightapp-front';

const { Refer } = high;
export default function (props = {}) {
var conf = {
refType: 'tree',
refName: '部门分类',/* 国际化处理： 部门分类*/
rootNode: {
refname: "部门分类",
refpk: "root"
},
queryTreeUrl: "/nccloud/asdf/ref/DemotreeVOTreeRef.do",
treeConfig: {
name: ["编码", "名称"],
code: ["refcode", "refname"]
},

};
return <Refer {...Object.assign(conf, props)} />
}
