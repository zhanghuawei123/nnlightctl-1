webpackJsonp([40],{"55Qz":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l={name:"linkman",data:function(){return{input5:"",currentPage:1,dialogTableVisible:!1,dialogFormVisible:!1,form:{name:"",region:"",date1:"",date2:"",delivery:!1,type:[],resource:"",desc:""},formLabelWidth:"120px",tableData3:[{date:"2016-05-03",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-02",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-04",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-01",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-08",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-06",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-07",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"}]}},methods:{handleSelectionChange:function(e){this.multipleSelection=e},handleEdit:function(e,t){console.log(e,t),this.dialogFormVisible=!0},handleDelete:function(e,t){console.log(e,t)},handleSizeChange:function(e){console.log("每页 "+e+" 条")},handleCurrentChange:function(e){console.log("当前页: "+e)},open3:function(){var e=this;this.$prompt("请输入邮箱","提示",{confirmButtonText:"确定",cancelButtonText:"取消",inputPattern:/[\w!#$%&'*+/=?^_`{|}~-]+(?:\.[\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\w](?:[\w-]*[\w])?\.)+[\w](?:[\w-]*[\w])?/,inputErrorMessage:"邮箱格式不正确"}).then(function(t){var a=t.value;e.$message({type:"success",message:"你的邮箱是: "+a})}).catch(function(){e.$message({type:"info",message:"取消输入"})})}}},o={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"box"},[a("div",{staticClass:"seach_top"},[a("el-input",{staticClass:"input-with-select",attrs:{placeholder:"请输入内容"},model:{value:e.input5,callback:function(t){e.input5=t},expression:"input5"}},[a("el-button",{attrs:{slot:"append",icon:"el-icon-search"},slot:"append"})],1)],1),e._v(" "),a("div",{staticClass:"addData"},[a("div",[a("el-button",{attrs:{type:"primary",icon:"el-icon-plus"},on:{click:function(t){e.dialogFormVisible=!0}}},[e._v("增加")])],1),e._v(" "),a("div",[a("el-button",{attrs:{plain:"",icon:"el-icon-delete"}},[e._v("批量删除")])],1)]),e._v(" "),a("el-dialog",{attrs:{title:"添加联系人",visible:e.dialogFormVisible},on:{"update:visible":function(t){e.dialogFormVisible=t}}},[a("el-form",{staticStyle:{margin:"0 auto"},attrs:{model:e.form}},[a("el-form-item",{attrs:{label:"单位","label-width":e.formLabelWidth}},[a("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"联系人","label-width":e.formLabelWidth}},[a("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"联系电话","label-width":e.formLabelWidth}},[a("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"邮编","label-width":e.formLabelWidth}},[a("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"地址","label-width":e.formLabelWidth}},[a("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"备注","label-width":e.formLabelWidth}},[a("el-input",{attrs:{"auto-complete":"off"},model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1)],1),e._v(" "),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(t){e.dialogFormVisible=!1}}},[e._v("取 消")]),e._v(" "),a("el-button",{attrs:{type:"primary"},on:{click:function(t){e.dialogFormVisible=!1}}},[e._v("确 定")])],1)],1),e._v(" "),a("div",{staticClass:"table"},[[a("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:e.tableData3,"tooltip-effect":"dark"},on:{"selection-change":e.handleSelectionChange}},[a("el-table-column",{attrs:{type:"selection",width:"55"}}),e._v(" "),a("el-table-column",{attrs:{label:"单位",width:"120"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(e._s(t.row.date))]}}])}),e._v(" "),a("el-table-column",{attrs:{prop:"name",label:"联系人",width:"120"}}),e._v(" "),a("el-table-column",{attrs:{prop:"address",label:"联系电话","show-overflow-tooltip":""}}),e._v(" "),a("el-table-column",{attrs:{prop:"address",label:"邮编","show-overflow-tooltip":""}}),e._v(" "),a("el-table-column",{attrs:{prop:"address",label:"地址","show-overflow-tooltip":""}}),e._v(" "),a("el-table-column",{attrs:{prop:"address",label:"备注","show-overflow-tooltip":""}}),e._v(" "),a("el-table-column",{attrs:{prop:"address",label:"编辑时间","show-overflow-tooltip":""}}),e._v(" "),a("el-table-column",{attrs:{label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{size:"mini"},on:{click:function(a){e.handleEdit(t.$index,t.row)}}},[e._v("编辑")]),e._v(" "),a("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(a){e.handleDelete(t.$index,t.row)}}},[e._v("删除")])]}}])})],1)],e._v(" "),a("el-pagination",{attrs:{"current-page":e.currentPage,"page-sizes":[100,200,300,400],"page-size":100,layout:"total, sizes, prev, pager, next, jumper",total:400},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],2)],1)},staticRenderFns:[]};var n=a("VU/8")(l,o,!1,function(e){a("rd5L")},"data-v-167e3ada",null);t.default=n.exports},rd5L:function(e,t){}});
//# sourceMappingURL=40.1b361122a746fb180149.js.map