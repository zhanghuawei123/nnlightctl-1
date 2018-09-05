webpackJsonp([21],{"2Fv0":function(t,e){},"4FcJ":function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=n("YGWM"),a=(n("9GaH"),{name:"organization",data:function(){return{addTypeText:["添加","修改"],addType:0,pageNumber:1,pageSize:10,multipleSelection:[],currentPage:1,allTotal:null,newObject:{},addDialog:!1,listInstitution:[],listAllInstitution:[],addNewRules:{institutionName:[{required:!0,message:"填写内容不得为空",trigger:"blur"}]}}},methods:{handleSelectionChange:function(t){this.multipleSelection=t},handleCurrentChange:function(t){this.pageNumber=t,this.getListInstitution()},handleSizeChange:function(t){this.pageSize=t,this.getListInstitution()},addNewObject:function(){this.addType=0,this.addDialog=!0},onSubmit:function(){this.addOrUpdateInstitution()},handleCloseDialog:function(t){this.newObject={},this.$refs.addNewForm.resetFields(),t()},addOrUpdateInstitution:function(){var t=this;"是"===this.newObject.institutionLevel?this.newObject.institutionLevel=0:this.newObject.institutionLevel=1,Object(i.b)(this.newObject).then(function(e){t.$message({type:"success",message:"修改成功!"}),t.getListInstitution(),t.addDialog=!1,t.newObject={},t.$refs.addNewForm.resetFields()}).catch(function(t){console.log(t)})},getListInstitution:function(){var t=this,e=this;Object(i.k)(e.pageNumber,e.pageSize).then(function(n){e.listInstitution=n.data,e.listInstitution.length>0?t.allTotal=n.total:t.allTotal=0}).catch(function(t){console.log(t)})},getAllListInstitution:function(){var t=this;Object(i.k)().then(function(e){t.listAllInstitution=e.data}).catch(function(t){console.log(t)})},editRow:function(t){var e=this;this.addType=1;var n=this;Object(i.h)(this.listInstitution[t].id).then(function(t){0===t.data[0].institutionLevel?t.data[0].institutionLevel="是":t.data[0].institutionLevel="否",n.newObject=t.data[0],e.addDialog=!0}).catch(function(t){console.log(t)})},deleteRow:function(t,e){var n=this,a=[];if(1===t)a.push(this.listInstitution[e].id);else{if(!(this.multipleSelection.length>0))return this.$message({message:"请勾选需要删除的数据",type:"warning"}),!1;this.multipleSelection.forEach(function(t){a.push(t.id)})}this.$confirm("此操作将永久删除该文件, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(i.e)(a).then(function(t){n.$message({type:"success",message:"删除成功!"}),n.getListInstitution()}).catch(function(t){console.log(t)})}).catch(function(){n.$message({type:"info",message:"已取消删除"})})}},created:function(){this.getListInstitution(),this.getAllListInstitution()},destroyed:function(){}}),l={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"system-container"},[n("div",{staticClass:"system-top clearfix"},[n("el-input",{staticClass:"input-with-select",attrs:{placeholder:"请输入内容"}}),t._v(" "),n("el-button",{attrs:{slot:"append",type:"primary",icon:"el-icon-search"},slot:"append"})],1),t._v(" "),n("div",{staticClass:"system-center"},[n("div",{staticClass:"operation-bar"},[n("el-button",{attrs:{type:"primary"},on:{click:function(e){t.addNewObject()}}},[t._v("增加")]),t._v(" "),n("el-button",{on:{click:function(e){t.deleteRow(2)}}},[t._v("删除")])],1),t._v(" "),n("div",{staticClass:"data-list"},[n("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:t.listInstitution,"tooltip-effect":"dark","header-row-class-name":"datalist-header"},on:{"selection-change":t.handleSelectionChange}},[n("el-table-column",{attrs:{fixed:"",type:"selection",width:"40"}}),t._v(" "),n("el-table-column",{attrs:{prop:"institutionName",fixed:"left",label:"机构名称",width:"100"}}),t._v(" "),n("el-table-column",{attrs:{label:"最高级别机构",width:"120"},scopedSlots:t._u([{key:"default",fn:function(e){return[0==e.row.institutionLevel?n("span",[t._v("是")]):t._e()]}}])}),t._v(" "),n("el-table-column",{attrs:{label:"创建时间",width:"100"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n              "+t._s(t._f("timeFormat")(e.row.gmtCreated))+"\n            ")]}}])}),t._v(" "),n("el-table-column",{attrs:{label:"修改时间",width:"100"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n              "+t._s(t._f("timeFormat")(e.row.gmtUpdated))+"\n            ")]}}])}),t._v(" "),n("el-table-column",{attrs:{prop:"addr",label:"机构地址"}}),t._v(" "),n("el-table-column",{attrs:{fixed:"right",label:"操作",width:"120"},scopedSlots:t._u([{key:"default",fn:function(e){return[n("el-button",{attrs:{type:"text",size:"small"},nativeOn:{click:function(n){n.preventDefault(),t.editRow(e.$index)}}},[t._v("\n                编辑\n              ")]),t._v(" "),n("el-button",{staticClass:"danger-text-btn",attrs:{type:"text",size:"small"},nativeOn:{click:function(n){n.preventDefault(),t.deleteRow(1,e.$index)}}},[t._v("\n                删除\n              ")])]}}])})],1)],1),t._v(" "),n("div",{staticClass:"pagelist-block"},[n("el-pagination",{attrs:{background:"","current-page":t.currentPage,"page-sizes":[10,20,50,100],"page-size":t.pageSize,layout:"total, sizes, prev, pager, next, jumper",total:t.allTotal},on:{"size-change":t.handleSizeChange,"current-change":t.handleCurrentChange}})],1)]),t._v(" "),n("el-dialog",{attrs:{title:t.addTypeText[t.addType]+"机构",visible:t.addDialog,"close-on-click-modal":!1,"close-on-press-escape":!1,center:"","before-close":t.handleCloseDialog},on:{"update:visible":function(e){t.addDialog=e}}},[n("el-form",{ref:"addNewForm",attrs:{"label-width":"120px",model:t.newObject,rules:t.addNewRules}},[n("el-form-item",{attrs:{label:"机构名称",prop:"institutionName",required:""}},[n("el-input",{model:{value:t.newObject.institutionName,callback:function(e){t.$set(t.newObject,"institutionName",e)},expression:"newObject.institutionName"}})],1),t._v(" "),n("el-form-item",{attrs:{label:"父机构"}},[n("el-select",{model:{value:t.newObject.nnlightctlInstitutionIdParent,callback:function(e){t.$set(t.newObject,"nnlightctlInstitutionIdParent",e)},expression:"newObject.nnlightctlInstitutionIdParent"}},t._l(t.listAllInstitution,function(t,e){return n("el-option",{key:e,attrs:{label:t.institutionName,value:t.id}})}))],1),t._v(" "),n("el-form-item",{attrs:{label:"是否是最高级别",required:""}},[n("el-radio-group",{model:{value:t.newObject.institutionLevel,callback:function(e){t.$set(t.newObject,"institutionLevel",e)},expression:"newObject.institutionLevel"}},[n("el-radio",{attrs:{label:"是"}}),t._v(" "),n("el-radio",{attrs:{label:"否"}})],1)],1),t._v(" "),n("el-form-item",{attrs:{label:"机构地址"}},[n("el-input",{attrs:{type:"textarea",autosize:{minRows:2,maxRows:4},placeholder:"请输入内容"},model:{value:t.newObject.addr,callback:function(e){t.$set(t.newObject,"addr",e)},expression:"newObject.addr"}})],1),t._v(" "),n("el-form-item",{attrs:{label:"备注"}},[n("el-input",{attrs:{type:"textarea",autosize:{minRows:2,maxRows:4},placeholder:"请输入内容"},model:{value:t.newObject.mem,callback:function(e){t.$set(t.newObject,"mem",e)},expression:"newObject.mem"}})],1)],1),t._v(" "),n("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[n("el-button",{on:{click:function(e){t.addDialog=!1}}},[t._v("取 消")]),t._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:t.onSubmit}},[t._v("确 定")])],1)],1)],1)},staticRenderFns:[]};var s=n("VU/8")(a,l,!1,function(t){n("MxTB"),n("2Fv0")},"data-v-2ad2da22",null);e.default=s.exports},MxTB:function(t,e){}});
//# sourceMappingURL=21.e0a5fda9cc12d1f540a9.js.map