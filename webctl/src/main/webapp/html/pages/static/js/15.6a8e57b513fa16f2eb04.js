webpackJsonp([15],{dTAp:function(e,t,s){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=s("YGWM"),a=(s("9GaH"),{name:"organization",data:function(){return{addTypeText:["添加","修改"],addType:0,userType:0,userTypeList:[{id:0,name:"超级管理员用户"},{id:1,name:"机构管理员用户"},{id:2,name:"部门用户"}],pageNumber:1,pageSize:10,multipleSelection:[],currentPage:1,allTotal:null,userList:[],newUser:{},userDialog:!1,passwordDialog:!1,listAllDepartment:[],newPwd:{}}},watch:{userType:function(){this.goSearch()}},methods:{handleSelectionChange:function(e){this.multipleSelection=e},handleCurrentChange:function(e){this.pageNumber=e,this.getListUser()},handleSizeChange:function(e){this.pageSize=e,this.getListUser()},goSearch:function(){this.pageNumber=1,this.pageSize=10,this.getListUser()},addUser:function(){this.addType=0,this.userDialog=!0},editPassword:function(e){this.newPwd.id=this.userList[e].id,this.passwordDialog=!0},onSubmit:function(){this.addOrUpdateUser()},handleCloseDialog:function(e){this.newUser={},e()},getAllListDepartment:function(){var e=this;Object(n.j)().then(function(t){e.listAllDepartment=t.data}).catch(function(e){console.log(e)})},addOrUpdateUser:function(){var e=this;"是"===this.newUser.isRemenberPwd?this.newUser.isRemenberPwd=1:this.newUser.isRemenberPwd=0,"男"===this.newUser.sex?this.newUser.sex=1:this.newUser.sex=0,Object(n.c)(this.newUser).then(function(t){var s="";s=0===e.addType?"添加成功!":"编辑成功!",e.$message({type:"success",message:s}),e.getListUser(),e.userDialog=!1,e.newUser={},e.$refs.addNewForm.resetFields()}).catch(function(e){console.log(e)})},getListUser:function(){var e=this,t=this;Object(n.m)(t.pageNumber,t.pageSize,this.userType).then(function(s){t.userList=s.data,t.userList.length>0?e.allTotal=s.total:e.allTotal=0}).catch(function(e){console.log(e)})},editRow:function(e){var t=this;this.addType=1;var s=this;Object(n.i)(this.userList[e].id).then(function(e){1===e.data[0].isRemenberPwd?e.data[0].isRemenberPwd="是":e.data[0].isRemenberPwd="否",1===e.data[0].sex?e.data[0].sex="男":e.data[0].sex="女",s.newUser=e.data[0],console.log(s.newUser),t.userDialog=!0}).catch(function(e){console.log(e)})},deleteRow:function(e,t){var s=this,a=[];if(1===e)a.push(this.userList[t].id);else{if(!(this.multipleSelection.length>0))return this.$message({message:"请勾选需要删除的数据",type:"warning"}),!1;this.multipleSelection.forEach(function(e){a.push(e.id)})}this.$confirm("此操作将永久删除该文件, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(n.f)(a).then(function(e){s.$message({type:"success",message:"删除成功!"}),s.getListUser()}).catch(function(e){console.log(e)})}).catch(function(){s.$message({type:"info",message:"已取消删除"})})},handleClosePassDialog:function(e){this.newPwd={},e()},onSubmitNewPass:function(){var e=this;if(this.newPwd.newPwd=this.newPwd.newPwd.replace(/(^\s*)|(\s*$)/g,""),""===this.newPwd.newPwd||null===this.newPwd.newPwd||void 0===this.newPwd.newPwd)return this.$message({type:"error",message:"密码不得为空"}),!1;Object(n.o)(this.newPwd).then(function(t){e.$message({type:"success",message:"编辑成功"}),e.passwordDialog=!1,e.newPwd={}}).catch(function(e){console.log(e)})}},created:function(){this.getListUser(),this.getAllListDepartment()},destroyed:function(){}}),l={render:function(){var e=this,t=e.$createElement,s=e._self._c||t;return s("div",{staticClass:"system-container"},[s("div",{staticClass:"system-top clearfix"},[s("span",{staticStyle:{"padding-right":"10px"}},[e._v("用户类型:")]),e._v(" "),s("el-select",{attrs:{placeholder:"请选择"},model:{value:e.userType,callback:function(t){e.userType=t},expression:"userType"}},e._l(e.userTypeList,function(e){return s("el-option",{key:e.id,attrs:{label:e.name,value:e.id}})}))],1),e._v(" "),s("div",{staticClass:"system-center"},[s("div",{staticClass:"operation-bar"},[s("el-button",{attrs:{type:"primary"},on:{click:function(t){e.addUser()}}},[e._v("增加")]),e._v(" "),s("el-button",{on:{click:function(t){e.deleteRow(2)}}},[e._v("删除")])],1),e._v(" "),s("div",{staticClass:"data-list"},[s("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:e.userList,"tooltip-effect":"dark","header-row-class-name":"datalist-header"},on:{"selection-change":e.handleSelectionChange}},[s("el-table-column",{attrs:{fixed:"",type:"selection",width:"40"}}),e._v(" "),s("el-table-column",{attrs:{fixed:"",prop:"codeNumber",label:"编号",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{fixed:"",prop:"userName",label:"用户名",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{label:"用户类型",width:"100"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v("\n              "+e._s(e.userTypeList[t.row.userType].name)+"\n            ")]}}])}),e._v(" "),s("el-table-column",{attrs:{prop:"loginName",label:"登录名",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"place",label:"职位",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"phone",label:"电话号码",width:"120"}}),e._v(" "),s("el-table-column",{attrs:{prop:"email",label:"电子邮箱",width:"150"}}),e._v(" "),s("el-table-column",{attrs:{fixed:"right",label:"操作",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[s("el-button",{attrs:{type:"text",size:"small"},nativeOn:{click:function(s){s.preventDefault(),e.editRow(t.$index)}}},[e._v("\n                编辑\n              ")]),e._v(" "),s("el-button",{attrs:{type:"text",size:"small"},nativeOn:{click:function(s){s.preventDefault(),e.editPassword(t.$index)}}},[e._v("\n                修改密码\n              ")]),e._v(" "),s("el-button",{staticClass:"danger-text-btn",attrs:{type:"text",size:"small"},nativeOn:{click:function(s){s.preventDefault(),e.deleteRow(1,t.$index)}}},[e._v("\n                删除\n              ")])]}}])})],1)],1),e._v(" "),s("div",{staticClass:"pagelist-block"},[s("el-pagination",{attrs:{background:"","current-page":e.currentPage,"page-sizes":[10,20,50,100],"page-size":e.pageSize,layout:"total, sizes, prev, pager, next, jumper",total:e.allTotal},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)]),e._v(" "),s("el-dialog",{attrs:{title:e.addTypeText[e.addType]+"添加用户",visible:e.userDialog,"close-on-click-modal":!1,"close-on-press-escape":!1,center:"","before-close":e.handleCloseDialog},on:{"update:visible":function(t){e.userDialog=t}}},[s("el-form",{ref:"addNewForm",attrs:{"label-width":"120px"}},[s("el-form-item",{attrs:{label:"登录名"}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.loginName,callback:function(t){e.$set(e.newUser,"loginName",t)},expression:"newUser.loginName"}})],1),e._v(" "),0===e.addType?s("el-form-item",{attrs:{label:"密码",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.loginPwd,callback:function(t){e.$set(e.newUser,"loginPwd",t)},expression:"newUser.loginPwd"}})],1):e._e(),e._v(" "),s("el-form-item",{attrs:{label:"是否记住用户",required:""}},[s("el-radio-group",{model:{value:e.newUser.isRemenberPwd,callback:function(t){e.$set(e.newUser,"isRemenberPwd",t)},expression:"newUser.isRemenberPwd"}},[s("el-radio",{attrs:{label:"是"}}),e._v(" "),s("el-radio",{attrs:{label:"否"}})],1)],1),e._v(" "),s("el-form-item",{attrs:{label:"用户名",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.userName,callback:function(t){e.$set(e.newUser,"userName",t)},expression:"newUser.userName"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"性别",required:""}},[s("el-radio-group",{model:{value:e.newUser.sex,callback:function(t){e.$set(e.newUser,"sex",t)},expression:"newUser.sex"}},[s("el-radio",{attrs:{label:"男"}}),e._v(" "),s("el-radio",{attrs:{label:"女"}})],1)],1),e._v(" "),s("el-form-item",{attrs:{label:"年龄",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.age,callback:function(t){e.$set(e.newUser,"age",t)},expression:"newUser.age"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"电话号码",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.phone,callback:function(t){e.$set(e.newUser,"phone",t)},expression:"newUser.phone"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"电子邮箱",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.email,callback:function(t){e.$set(e.newUser,"email",t)},expression:"newUser.email"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"职位",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.place,callback:function(t){e.$set(e.newUser,"place",t)},expression:"newUser.place"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"编号",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newUser.codeNumber,callback:function(t){e.$set(e.newUser,"codeNumber",t)},expression:"newUser.codeNumber"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"用户类型",required:""}},[s("el-select",{model:{value:e.newUser.userType,callback:function(t){e.$set(e.newUser,"userType",t)},expression:"newUser.userType"}},e._l(e.userTypeList,function(e,t){return s("el-option",{key:t,attrs:{label:e.name,value:e.id}})}))],1),e._v(" "),s("el-form-item",{attrs:{label:"所属部门",required:""}},[s("el-select",{model:{value:e.newUser.nnlightctlInstitutionIdBelong,callback:function(t){e.$set(e.newUser,"nnlightctlInstitutionIdBelong",t)},expression:"newUser.nnlightctlInstitutionIdBelong"}},e._l(e.listAllDepartment,function(e,t){return s("el-option",{key:t,attrs:{label:e.departmentName,value:e.id}})}))],1)],1),e._v(" "),s("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[s("el-button",{on:{click:function(t){e.userDialog=!1}}},[e._v("取 消")]),e._v(" "),s("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("确 定")])],1)],1),e._v(" "),s("el-dialog",{attrs:{title:"修改密码",visible:e.passwordDialog,"close-on-click-modal":!1,"close-on-press-escape":!1,center:"","before-close":e.handleClosePassDialog},on:{"update:visible":function(t){e.passwordDialog=t}}},[s("el-form",{ref:"form",attrs:{"label-width":"100px"}},[s("el-form-item",{attrs:{label:"新密码",required:""}},[s("el-input",{staticClass:"width350",model:{value:e.newPwd.newPwd,callback:function(t){e.$set(e.newPwd,"newPwd",t)},expression:"newPwd.newPwd"}})],1)],1),e._v(" "),s("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[s("el-button",{on:{click:function(t){e.passwordDialog=!1}}},[e._v("取 消")]),e._v(" "),s("el-button",{attrs:{type:"primary"},on:{click:e.onSubmitNewPass}},[e._v("确 定")])],1)],1)],1)},staticRenderFns:[]};var i=s("VU/8")(a,l,!1,function(e){s("rscs"),s("qG6d")},"data-v-586b4d58",null);t.default=i.exports},qG6d:function(e,t){},rscs:function(e,t){}});
//# sourceMappingURL=15.6a8e57b513fa16f2eb04.js.map