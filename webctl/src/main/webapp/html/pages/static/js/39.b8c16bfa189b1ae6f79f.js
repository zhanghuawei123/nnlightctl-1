webpackJsonp([39],{"55Qz":function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=o("pjge"),l={name:"linkman",data:function(){return{input5:"",currentPage:1,dialogTableVisible:!1,dialogFormVisible:!1,dialogFormVisible2:!1,form:{uid:"",repertoryName:"",repertoryAddress:"",repertoryPhone:"",repertoryZipCode:"",nnlightctlUserId:""},formLabelWidth:"120px",tableData3:[]}},created:function(){var e=this;Object(r.u)().then(function(t){e.tableData3=t.data})},methods:{handleSelectionChange:function(e){this.multipleSelection=e},handleEdit:function(e,t){var o=this;console.log(e,t),this.dialogFormVisible2=!0,Object(r.o)(t.id).then(function(e){o.form=e.data[0]})},handleDelete:function(e,t){console.log(e,t);var o=[];o.push(t.id);var l=this;Object(r.m)(o).then(function(e){l.$message({type:"success",message:"删除成功"}),Object(r.u)().then(function(e){l.tableData3=e.data})})},linkmanContact:function(e){var t=this,o=this;this.$refs[e].validate(function(e){if(!e)return!1;Object(r.h)(o.form.id,o.form.uid,o.form.repertoryName,o.form.repertoryAddress,o.form.repertoryPhone,o.form.repertoryZipCode,o.form.nnlightctlUserId).then(function(e){o.$message({type:"success",message:"添加成功"}),t.dialogFormVisible2=!1,Object(r.u)().then(function(e){o.tableData3=e.data})})})},alldelte:function(){for(var e=this,t=[],o=0;o<this.multipleSelection.length;o++)t.push(this.multipleSelection[o].id);Object(r.m)(t).then(function(t){e.$message({type:"success",message:"删除成功"}),Object(r.u)().then(function(t){e.tableData3=t.data})})},handleSizeChange:function(e){console.log("每页 "+e+" 条")},handleCurrentChange:function(e){console.log("当前页: "+e)},linkmanAdd:function(e){var t=this,o=this;this.$refs[e].validate(function(e){if(!e)return!1;Object(r.d)(o.form.uid,o.form.repertoryName,o.form.repertoryAddress,o.form.repertoryPhone,o.form.repertoryZipCode,o.form.nnlightctlUserId).then(function(e){o.$message({type:"success",message:"添加成功"}),t.dialogFormVisible=!1,Object(r.u)().then(function(e){o.tableData3=e.data})})})}}},a={render:function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"box"},[o("div",{staticClass:"seach_top"},[o("el-input",{staticClass:"input-with-select",attrs:{placeholder:"请输入内容"},model:{value:e.input5,callback:function(t){e.input5=t},expression:"input5"}},[o("el-button",{attrs:{slot:"append",icon:"el-icon-search"},slot:"append"})],1)],1),e._v(" "),o("div",{staticClass:"addData"},[o("div",[o("el-button",{attrs:{type:"primary",icon:"el-icon-plus"},on:{click:function(t){e.dialogFormVisible=!0}}},[e._v("增加")])],1),e._v(" "),o("div",[o("el-button",{attrs:{plain:"",icon:"el-icon-delete"},on:{click:e.alldelte}},[e._v("批量删除")])],1)]),e._v(" "),o("el-dialog",{attrs:{title:"添加仓库",visible:e.dialogFormVisible},on:{"update:visible":function(t){e.dialogFormVisible=t}}},[o("el-form",{ref:"form",staticStyle:{margin:"0 auto"},attrs:{model:e.form}},[o("el-form-item",{attrs:{label:"仓库UID","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.uid,callback:function(t){e.$set(e.form,"uid",t)},expression:"form.uid"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"仓库名称","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryName,callback:function(t){e.$set(e.form,"repertoryName",t)},expression:"form.repertoryName"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"仓库地址","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryAddress,callback:function(t){e.$set(e.form,"repertoryAddress",t)},expression:"form.repertoryAddress"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"仓库电话","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryPhone,callback:function(t){e.$set(e.form,"repertoryPhone",t)},expression:"form.repertoryPhone"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"邮编","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryZipCode,callback:function(t){e.$set(e.form,"repertoryZipCode",t)},expression:"form.repertoryZipCode"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"管理员","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.nnlightctlUserId,callback:function(t){e.$set(e.form,"nnlightctlUserId",t)},expression:"form.nnlightctlUserId"}})],1)],1),e._v(" "),o("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[o("el-button",{on:{click:function(t){e.dialogFormVisible=!1}}},[e._v("取 消")]),e._v(" "),o("el-button",{attrs:{type:"primary"},on:{click:function(t){e.linkmanAdd("form")}}},[e._v("确 定")])],1)],1),e._v(" "),o("el-dialog",{attrs:{title:"编辑仓库",visible:e.dialogFormVisible2},on:{"update:visible":function(t){e.dialogFormVisible2=t}}},[o("el-form",{ref:"form",staticStyle:{margin:"0 auto"},attrs:{model:e.form}},[o("el-form-item",{attrs:{label:"仓库UID","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.uid,callback:function(t){e.$set(e.form,"uid",t)},expression:"form.uid"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"仓库名称","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryName,callback:function(t){e.$set(e.form,"repertoryName",t)},expression:"form.repertoryName"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"仓库地址","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryAddress,callback:function(t){e.$set(e.form,"repertoryAddress",t)},expression:"form.repertoryAddress"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"仓库电话","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryPhone,callback:function(t){e.$set(e.form,"repertoryPhone",t)},expression:"form.repertoryPhone"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"邮编","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.repertoryZipCode,callback:function(t){e.$set(e.form,"repertoryZipCode",t)},expression:"form.repertoryZipCode"}})],1),e._v(" "),o("el-form-item",{attrs:{label:"管理员","label-width":e.formLabelWidth}},[o("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.nnlightctlUserId,callback:function(t){e.$set(e.form,"nnlightctlUserId",t)},expression:"form.nnlightctlUserId"}})],1)],1),e._v(" "),o("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[o("el-button",{on:{click:function(t){e.dialogFormVisible2=!1}}},[e._v("取 消")]),e._v(" "),o("el-button",{attrs:{type:"primary"},on:{click:function(t){e.linkmanContact("form")}}},[e._v("确 定")])],1)],1),e._v(" "),o("div",{staticClass:"table"},[[o("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:e.tableData3,"tooltip-effect":"dark"},on:{"selection-change":e.handleSelectionChange}},[o("el-table-column",{attrs:{type:"selection",width:"55"}}),e._v(" "),o("el-table-column",{attrs:{prop:"uid",label:"仓库UID",width:"120"}}),e._v(" "),o("el-table-column",{attrs:{prop:"repertoryName",label:"仓库名称","show-overflow-tooltip":""}}),e._v(" "),o("el-table-column",{attrs:{prop:"repertoryAddress",label:"仓库地址","show-overflow-tooltip":""}}),e._v(" "),o("el-table-column",{attrs:{prop:"repertoryPhone",label:"仓库电话","show-overflow-tooltip":""}}),e._v(" "),o("el-table-column",{attrs:{prop:"repertoryZipCode",label:"邮编","show-overflow-tooltip":""}}),e._v(" "),o("el-table-column",{attrs:{prop:"nnlightctlUserId",label:"管理员","show-overflow-tooltip":""}}),e._v(" "),o("el-table-column",{attrs:{label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[o("el-button",{attrs:{size:"mini"},on:{click:function(o){e.handleEdit(t.$index,t.row)}}},[e._v("编辑")]),e._v(" "),o("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(o){e.handleDelete(t.$index,t.row)}}},[e._v("删除")])]}}])})],1)],e._v(" "),o("el-pagination",{attrs:{"current-page":e.currentPage,"page-sizes":[100,200,300,400],"page-size":100,layout:"total, sizes, prev, pager, next, jumper",total:400},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],2)],1)},staticRenderFns:[]};var i=o("VU/8")(l,a,!1,function(e){o("NiPg")},"data-v-3682a142",null);t.default=i.exports},NiPg:function(e,t){}});
//# sourceMappingURL=39.b8c16bfa189b1ae6f79f.js.map