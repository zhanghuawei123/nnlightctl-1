webpackJsonp([33],{"9w5l":function(e,t,l){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=l("ZgHW"),n=(l("9GaH"),l("PJh5")),r=l.n(n),o={name:"Elebox",data:function(){return{formInline:{elebox:"",states:"",level:"",type:"",date:"",uid:""},tableData:[{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"},{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"},{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"},{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"}],currentPage3:5}},computed:{},methods:{getHisAlarmData:function(e,t){Object(a.b)(e,t).then(function(e){console.log(e,"历史数据")})},dateFormat:function(e,t){var l=e[t.property];return void 0==l?"":r()(l).format("YYYY-MM-DD HH:mm:ss")},onSubmit:function(){console.log("submit!")},onResume:function(){console.log("resume")},toggleSelection:function(e){var t=this;e?e.forEach(function(e){t.$refs.multipleTable.toggleRowSelection(e)}):this.$refs.multipleTable.clearSelection()},handleSelectionChange:function(e){this.multipleSelection=e},handleSizeChange:function(e){console.log("每页 "+e+" 条")},handleCurrentChange:function(e){console.log("当前页: "+e)}},created:function(){this.getHisAlarmData(1,20)}},i={render:function(){var e=this,t=e.$createElement,l=e._self._c||t;return l("div",{attrs:{id:"EleboxWarning"}},[l("div",{attrs:{id:"searchForm"}},[l("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0,model:e.formInline}},[l("el-form-item",{attrs:{label:"控制柜"}},[l("el-select",{attrs:{placeholder:"控制柜"},model:{value:e.formInline.elebox,callback:function(t){e.$set(e.formInline,"elebox",t)},expression:"formInline.elebox"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"状态"}},[l("el-select",{attrs:{placeholder:"状态"},model:{value:e.formInline.states,callback:function(t){e.$set(e.formInline,"states",t)},expression:"formInline.states"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"类型"}},[l("el-select",{attrs:{placeholder:"类型"},model:{value:e.formInline.type,callback:function(t){e.$set(e.formInline,"type",t)},expression:"formInline.type"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"UID"}},[l("el-input",{attrs:{placeholder:"uid"},model:{value:e.formInline.uid,callback:function(t){e.$set(e.formInline,"uid",t)},expression:"formInline.uid"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"等级"}},[l("el-select",{attrs:{placeholder:"等级"},model:{value:e.formInline.level,callback:function(t){e.$set(e.formInline,"level",t)},expression:"formInline.level"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"日期"}},[l("el-date-picker",{attrs:{type:"date",placeholder:"选择日期"},model:{value:e.formInline.date,callback:function(t){e.$set(e.formInline,"date",t)},expression:"formInline.date"}})],1),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("查询")])],1),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.onResume}},[e._v("重置")])],1)],1)],1),e._v(" "),l("div",{attrs:{id:"dataTable"}},[l("div",{staticClass:"operator"}),e._v(" "),l("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData},on:{"selection-change":e.handleSelectionChange}},[l("el-table-column",{attrs:{type:"selection",width:"55"}}),e._v(" "),l("el-table-column",{attrs:{prop:"state",label:"状态",width:"80"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmLevel",label:"等级",width:"80"}}),e._v(" "),l("el-table-column",{attrs:{prop:"codeNumber",label:"控制柜/区域",width:"120"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmSource",label:"来自",width:"120"}}),e._v(" "),l("el-table-column",{attrs:{prop:"gmtCreated",formatter:e.dateFormat,label:"创建时间",width:"150"}}),e._v(" "),l("el-table-column",{attrs:{prop:"gmtUpdated",formatter:e.dateFormat,label:"更新时间",width:"150"}}),e._v(" "),l("el-table-column",{attrs:{prop:"ctype",label:"类型"}}),e._v(" "),l("el-table-column",{attrs:{prop:"nnlightctlAlarmConfigId",label:"警報配置ID"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmTime",formatter:e.dateFormat,label:"报警/解除时间"}}),e._v(" "),l("el-table-column",{attrs:{prop:"msg",label:"消息"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmCount",label:"次数"}})],1),e._v(" "),l("div",{staticClass:"pagelist-block"},[l("el-pagination",{attrs:{"current-page":e.currentPage3,"page-size":10,layout:"prev, pager, next, jumper",total:39},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange,"update:currentPage":function(t){e.currentPage3=t}}})],1)],1)])},staticRenderFns:[]};var m=l("VU/8")(o,i,!1,function(e){l("C+jX")},"data-v-5b1c9ba8",null);t.default=m.exports},"C+jX":function(e,t){}});
//# sourceMappingURL=33.05aae8202f2648f96321.js.map