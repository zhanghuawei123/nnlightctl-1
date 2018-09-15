webpackJsonp([38],{jISL:function(t,s,i){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var e=i("M9A7"),a={name:"index",data:function(){var t=this;return{isLogin:!0,loginOperation:"登录",loginFormVisible:!1,registerFormVisible:!1,username:"",form:{username:"",password:""},registerFormData:{username:"",password:"",confirmpassword:""},myRules:{username:[{required:!0,message:"请输入用户名",trigger:"blur"},{min:4,max:12,message:"长度在 4 到 12 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:4,max:20,message:"长度在 4 到 20 个字符",trigger:"blur"}]},myRegisterRules:{username:[{validator:function(t,s,i){if(!s)return i(new Error("用户名不能为空"));setTimeout(function(){s.length>20||s.length<3?i(new Error("用户长度在3-20字符")):i()},1e3)},trigger:"blur"}],password:[{validator:function(s,i,e){""===i?e(new Error("请输入密码")):(""!==t.registerFormData.confirmpassword&&t.$refs.registerForm.validateField("confirmpassword"),e())},trigger:"blur"}],confirmpassword:[{validator:function(s,i,e){""===i?e(new Error("请再次输入密码")):i!==t.registerFormData.password?e(new Error("两次输入密码不一致!")):e()},trigger:"blur"}]},formLabelWidth:"120px"}},methods:{linkModule:function(t){console.log(t),t&&this.$router.push(t)},handleloginSend:function(){var t=this;console.log("登录发送请求"),this.$refs.loginForm.validate(function(s){if(!s)return!1;Object(e.b)(t.form.username,t.form.password).then(function(s){if(console.log(s,"登录返回信息"),s.code){window.localStorage.setItem("username",t.form.username),widnow.localStorage.setItem("password",t.form.password);var i=new Date;window.localStorage.setItem("loginDate",i)}else t.$message({showClose:!0,message:s})})})},handleLoginOut:function(){this.isLogin=!1,console.log(this.isLogin),console.log("登出"),window.localStorage.removeItem("username"),widnow.localStorage.removeItem("password"),window.localStorage.removeItem("loginDate")},handleRegister:function(){var t=this;console.log("注册"),this.registerFormVisible=!0,Object(e.d)(this.registerFormData.username,this.registerFormData.password).then(function(s){s.data?t.$message({showClose:!0,message:"恭喜您注册成功!"}):t.$message({showClose:!0,message:s})})},handleLogin:function(){console.log("登录"),this.loginFormVisible=!0}},created:function(){window.localStorage.getItem("username")&&window.localStorage.getItem("password")&&(this.isLogin=!0,this.username=window.localStorage.getItem("password"))}},r={render:function(){var t=this,s=t.$createElement,e=t._self._c||s;return e("div",{staticClass:"container"},[e("div",{staticClass:"index-header clearfix"},[t._m(0),t._v(" "),e("div",{staticClass:"user-area f-r"},[1==t.isLogin?e("div",{staticClass:"user-info dis-inline"},[e("img",{attrs:{src:i("k+Qw")}}),t._v(" "),e("span",[t._v(t._s(t.username))]),t._v(" "),e("span",[t._v(" | ")]),t._v(" "),e("span",{staticClass:"logout",on:{click:function(s){t.handleLoginOut()}}},[t._v("退出")])]):e("div",{staticClass:"login-register dis-inline"},[e("span",{staticClass:"logout",on:{click:function(s){t.handleRegister()}}},[t._v("注册")]),t._v(" "),e("span",[t._v(" | ")]),t._v(" "),e("span",{staticClass:"logout",on:{click:function(s){t.handleLogin()}}},[t._v(t._s(t.loginOperation))])])]),t._v(" "),e("el-dialog",{attrs:{title:"用户登录",visible:t.loginFormVisible},on:{"update:visible":function(s){t.loginFormVisible=s}}},[e("el-form",{ref:"loginForm",attrs:{model:t.form,"status-icon":"",rules:t.myRules}},[e("el-form-item",{staticClass:"inp-width",attrs:{label:"用户名","label-width":t.formLabelWidth,prop:"username"}},[e("el-input",{attrs:{autocomplete:"off"},model:{value:t.form.username,callback:function(s){t.$set(t.form,"username",s)},expression:"form.username"}})],1),t._v(" "),e("el-form-item",{staticClass:"inp-width",attrs:{label:"密 码","label-width":t.formLabelWidth,prop:"password"}},[e("el-input",{attrs:{type:"password",autocomplete:"off"},model:{value:t.form.password,callback:function(s){t.$set(t.form,"password",s)},expression:"form.password"}})],1)],1),t._v(" "),e("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[e("el-button",{on:{click:function(s){t.loginFormVisible=!1}}},[t._v("取 消")]),t._v(" "),e("el-button",{attrs:{type:"primary"},on:{click:function(s){t.handleloginSend()}}},[t._v("登 录")])],1)],1),t._v(" "),e("el-dialog",{attrs:{title:"新用户注册","status-icon":"",visible:t.registerFormVisible},on:{"update:visible":function(s){t.registerFormVisible=s}}},[e("el-form",{ref:"registerForm",attrs:{model:t.registerFormData,rules:t.myRegisterRules}},[e("el-form-item",{staticClass:"inp-width",attrs:{label:"用户名","label-width":t.formLabelWidth,prop:"username"}},[e("el-input",{attrs:{autocomplete:"off"},model:{value:t.registerFormData.username,callback:function(s){t.$set(t.registerFormData,"username",s)},expression:"registerFormData.username"}})],1),t._v(" "),e("el-form-item",{staticClass:"inp-width",attrs:{label:"密 码","label-width":t.formLabelWidth,prop:"password"}},[e("el-input",{attrs:{type:"password",autocomplete:"off"},model:{value:t.registerFormData.password,callback:function(s){t.$set(t.registerFormData,"password",s)},expression:"registerFormData.password"}})],1),t._v(" "),e("el-form-item",{staticClass:"inp-width",attrs:{label:"确认密码","label-width":t.formLabelWidth,prop:"confirmpassword"}},[e("el-input",{attrs:{type:"password",autocomplete:"off"},model:{value:t.registerFormData.confirmpassword,callback:function(s){t.$set(t.registerFormData,"confirmpassword",s)},expression:"registerFormData.confirmpassword"}})],1)],1),t._v(" "),e("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[e("el-button",{on:{click:function(s){t.registerFormVisible=!1}}},[t._v("取 消")]),t._v(" "),e("el-button",{attrs:{type:"primary"},on:{click:function(s){t.handleRegister()}}},[t._v("注 册")])],1)],1)],1),t._v(" "),e("div",{staticClass:"index-module"},[e("div",{staticClass:"clearfix"},[e("div",{staticClass:"grid-content gird-1"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/gisservice")}}},[t._m(1)])]),t._v(" "),e("div",{staticClass:"grid-content gird-2"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/assetadmin")}}},[t._m(2)])])]),t._v(" "),e("div",{staticClass:"clearfix"},[e("div",{staticClass:"grid-content gird-9 clearfix"},[e("div",{staticClass:"grid-content gird-3"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/eventwarning")}}},[t._m(3)])]),t._v(" "),e("div",{staticClass:"grid-content gird-4"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/workorder")}}},[t._m(4)])]),t._v(" "),e("div",{staticClass:"grid-content gird-5"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/projectadmin")}}},[t._m(5)])]),t._v(" "),e("div",{staticClass:"grid-content gird-6"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/ucenter")}}},[t._m(6)])])]),t._v(" "),e("div",{staticClass:"grid-content gird-7"},[e("div",{staticClass:"gird-wrap",on:{click:function(s){t.linkModule("/roadlighting")}}},[t._m(7)])]),t._v(" "),t._m(8)])])])},staticRenderFns:[function(){var t=this.$createElement,s=this._self._c||t;return s("a",{staticClass:"menu-link"},[s("i",{staticClass:"iconfont"},[this._v("")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("GIS地理信息系统")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("资产管理系统")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle f-mid"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("事件报警")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle f-mid"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("工单管理")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle f-mid"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("项目管理")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle f-mid"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("用户中心")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"trans-middle"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("道路照明系统")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"grid-content gird-8"},[s("div",{staticClass:"gird-wrap"},[s("div",{staticClass:"trans-middle"},[s("p",{staticClass:"p1"},[s("i",{staticClass:"iconfont"},[this._v("")])]),this._v(" "),s("p",[this._v("能耗分析")])])])])}]};var o=i("VU/8")(a,r,!1,function(t){i("tPeX")},"data-v-55817e40",null);s.default=o.exports},tPeX:function(t,s){}});
//# sourceMappingURL=38.7910a7b1117b07fd6a61.js.map