webpackJsonp([27],{BtW5:function(e,t){},gNYp:function(e,t,l){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=l("ZgHW"),n=l("PJh5"),o=l.n(n),r=(l("9GaH"),{name:"Elebox",data:function(){return{alarmDetailVisible:!1,formInline:{elebox:"",states:"",level:"",uid:""},selectIds:[],alarmDetailData:[{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"}],tableData:[{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"},{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"},{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"},{state:"良好",alarmLevel:"三级警报",codeNumber:"控制柜一/上海市普陀区金沙江路 1518 弄",alarmSource:"上海xxxx",name:"XXX警报",ctype:"普通灯警报",gmtCreated:"e222323",gmtUpdated:"201-121",nnlightctlAlarmConfigId:"11",alarmTime:"2016-05-02",msg:"事件报警",alarmCount:"3"}],currentPage3:5}},computed:{},methods:{getListAlarm:function(e,t){var l=this;Object(a.d)(e,t).then(function(e){console.log(e,"初始化shuju"),l.tableData=e.data})},handleAlarmDetailOk:function(){this.detailAlarmVisible=!0},handleGetDetail:function(e){this.alarmDetailVisible=!0,console.log(e.nnlightctlAlarmConfigId,"获取详细信息");var t=e.nnlightctlAlarmConfigId?e.nnlightctlAlarmConfigId:1;t&&Object(a.c)(t).then(function(e){console.log(e,"详细信息")})},handleDeletAlarm:function(){console.log("删除警报信息");var e=[];this.selectIds&&(e=this.selectIds),Object(a.a)(e).then(function(e){console.log(e,"删除警报信息")})},handleImportAlarm:function(){console.log("导入信息")},dateFormat:function(e,t){var l=e[t.property];return void 0==l?"":o()(l).format("YYYY-MM-DD HH:mm:ss")},onSubmit:function(){console.log("submit!")},onResume:function(){console.log("resume")},toggleSelection:function(e){var t=this;e?e.forEach(function(e){t.$refs.multipleTable.toggleRowSelection(e)}):this.$refs.multipleTable.clearSelection()},handleSelectionChange:function(e){this.multipleSelection=e,e&&(this.selectIds=e.map(function(e,t){return e.nnlightctlAlarmConfigId})),console.log(this.selectIds)},handleSizeChange:function(e){console.log("每页 "+e+" 条")},handleCurrentChange:function(e){console.log("当前页: "+e)}},created:function(){this.getListAlarm(1,20)}}),i={render:function(){var e=this,t=e.$createElement,l=e._self._c||t;return l("div",{attrs:{id:"EleboxWarning"}},[l("div",{attrs:{id:"searchForm"}},[l("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0,model:e.formInline}},[l("el-form-item",{attrs:{label:"防盗"}},[l("el-select",{attrs:{placeholder:"控制柜"},model:{value:e.formInline.elebox,callback:function(t){e.$set(e.formInline,"elebox",t)},expression:"formInline.elebox"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"状态"}},[l("el-select",{attrs:{placeholder:"状态"},model:{value:e.formInline.states,callback:function(t){e.$set(e.formInline,"states",t)},expression:"formInline.states"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"等级"}},[l("el-select",{attrs:{placeholder:"等级"},model:{value:e.formInline.level,callback:function(t){e.$set(e.formInline,"level",t)},expression:"formInline.level"}},[l("el-option",{attrs:{label:"区域一",value:"shanghai"}}),e._v(" "),l("el-option",{attrs:{label:"区域二",value:"beijing"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"UID"}},[l("el-input",{attrs:{placeholder:"uid"},model:{value:e.formInline.uid,callback:function(t){e.$set(e.formInline,"uid",t)},expression:"formInline.uid"}})],1),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("查询")])],1),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.onResume}},[e._v("重置")])],1)],1)],1),e._v(" "),l("div",{attrs:{id:"dataTable"}},[l("div",{staticClass:"operator"},[l("el-button",{attrs:{type:"primary",icon:"el-icon-delete"},on:{click:function(t){e.handleDeletAlarm()}}},[e._v("清理警报")]),e._v(" "),l("el-button",{attrs:{type:"primary",icon:"el-icon-download"},on:{click:function(t){e.handleImportAlarm()}}},[e._v("导入")])],1),e._v(" "),l("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData},on:{"selection-change":e.handleSelectionChange}},[l("el-table-column",{attrs:{type:"selection",width:"55"}}),e._v(" "),l("el-table-column",{attrs:{prop:"state",label:"状态",width:"80"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmLevel",label:"等级",width:"80"}}),e._v(" "),l("el-table-column",{attrs:{prop:"codeNumber",label:"控制柜/区域",width:"120"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmSource",label:"来自",width:"120"}}),e._v(" "),l("el-table-column",{attrs:{prop:"gmtCreated",formatter:e.dateFormat,label:"创建时间",width:"150"}}),e._v(" "),l("el-table-column",{attrs:{prop:"gmtUpdated",formatter:e.dateFormat,label:"更新时间",width:"150"}}),e._v(" "),l("el-table-column",{attrs:{prop:"ctype",label:"类型"}}),e._v(" "),l("el-table-column",{attrs:{prop:"nnlightctlAlarmConfigId",label:"警報配置ID"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmTime",formatter:e.dateFormat,label:"报警/解除时间"}}),e._v(" "),l("el-table-column",{attrs:{prop:"msg",label:"消息"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmCount",label:"次数"}}),e._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[l("el-button",{attrs:{type:"text",size:"small"},on:{click:function(l){e.handleGetDetail(t.row)}}},[e._v("查看详细信息")])]}}])})],1),e._v(" "),l("el-dialog",{attrs:{title:"详细信息",visible:e.alarmDetailVisible,width:"80%"},on:{"update:visible":function(t){e.alarmDetailVisible=t}}},[l("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData}},[l("el-table-column",{attrs:{prop:"state",label:"状态",width:"80"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmLevel",label:"等级",width:"80"}}),e._v(" "),l("el-table-column",{attrs:{prop:"codeNumber",label:"控制柜/区域",width:"120"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmSource",label:"来自",width:"120"}}),e._v(" "),l("el-table-column",{attrs:{prop:"gmtCreated",formatter:e.dateFormat,label:"创建时间",width:"150"}}),e._v(" "),l("el-table-column",{attrs:{prop:"gmtUpdated",formatter:e.dateFormat,label:"更新时间",width:"150"}}),e._v(" "),l("el-table-column",{attrs:{prop:"ctype",label:"类型"}}),e._v(" "),l("el-table-column",{attrs:{prop:"nnlightctlAlarmConfigId",label:"警報配置ID"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmTime",formatter:e.dateFormat,label:"报警/解除时间"}}),e._v(" "),l("el-table-column",{attrs:{prop:"msg",label:"消息"}}),e._v(" "),l("el-table-column",{attrs:{prop:"alarmCount",label:"次数"}}),e._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[l("el-button",{attrs:{type:"text",size:"small"},on:{click:function(l){e.handleGetDetail(t.row)}}},[e._v("查看")])]}}])})],1),e._v(" "),l("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[l("el-button",{on:{click:function(t){e.detailAlarmVisible=!1}}},[e._v("取 消")]),e._v(" "),l("el-button",{attrs:{type:"primary"},on:{click:function(t){e.handleAlarmDetailOk()}}},[e._v("确 定")])],1)],1),e._v(" "),l("div",{staticClass:"pagelist-block"},[l("el-pagination",{attrs:{"current-page":e.currentPage3,"page-size":10,layout:"prev, pager, next, jumper",total:39},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange,"update:currentPage":function(t){e.currentPage3=t}}})],1)],1)])},staticRenderFns:[]};var m=l("VU/8")(r,i,!1,function(e){l("BtW5")},"data-v-7d5efccc",null);t.default=m.exports}});
//# sourceMappingURL=27.3265ec9ed5a4a90fabf1.js.map