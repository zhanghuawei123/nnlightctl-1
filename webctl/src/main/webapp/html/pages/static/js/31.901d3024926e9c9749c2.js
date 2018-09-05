webpackJsonp([31],{"3FYV":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=a("XLwt"),n=a.n(o),i=a("LA2t"),l={name:"TerReport",data:function(){return{form:{eleboxId:"",region:"",date1:"",date2:""},rules:{eleboxId:[{required:!0,message:"请输入控制柜ID",trigger:"blur"}],date1:[{required:!0,message:"请输入开始日期",trigger:"blur"}],date2:[{required:!0,message:"请输入结束日期",trigger:"blur"}]},powerData:null,nonPowerData:null,voltageOption:{title:{text:"一天用电量分布",subtext:"纯属虚构"},tooltip:{trigger:"axis",axisPointer:{type:"cross"}},toolbox:{show:!0,feature:{saveAsImage:{}}},xAxis:{type:"category",boundaryGap:!1,data:["00:00","01:15","02:30","03:45","05:00","06:15","07:30","08:45","10:00","11:15","12:30","13:45","15:00","16:15","17:30","18:45","20:00","21:15","22:30","23:45"]},yAxis:[{type:"value",name:"耗电量（kw/h）",nameLocation:"middle",nameTextStyle:{fontWeight:"bold",verticalAlign:"top",padding:10,fontSize:16},min:0,max:1.2}],visualMap:{show:!1,dimension:0,pieces:[{lte:6,color:"green"},{gt:6,lte:8,color:"red"},{gt:8,lte:14,color:"green"},{gt:14,lte:17,color:"red"},{gt:17,color:"green"}]},series:[{name:"用电量",type:"line",smooth:!0,data:[300,280,250,260,270,300,550,500,400,390,380,390,400,500,600,750,800,700,600,400],markArea:{data:[[{name:"早高峰",xAxis:"07:30"},{xAxis:"10:00"}],[{name:"晚高峰",xAxis:"17:30"},{xAxis:"21:15"}]]}}]},powerOption:{title:{text:"有功功率：（kw）"},xAxis:[{type:"category",name:"日期",nameTextStyle:{fontWeight:"normal",verticalAlign:"bottom",padding:50,fontSize:16},data:["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"]}],yAxis:[{type:"value",name:"有功功率（kw）",nameLocation:"middle",nameTextStyle:{fontWeight:"normal",verticalAlign:"top",padding:20,fontSize:16},min:0,max:1.5,interval:.25}],series:[{name:"用电量",type:"line",smooth:!0,data:[0,1,.25,1.25,1.5,.6,.5,1.3,1,.25,1.25,1.5,.6,.5,1.3]}]},nonPowerOption:{title:{text:"无功功率：（kw）"},xAxis:[{type:"category",name:"日期",nameTextStyle:{fontWeight:"normal",verticalAlign:"bottom",padding:50,fontSize:16},data:["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"]}],yAxis:[{type:"value",name:"无功功率（kw）",nameLocation:"middle",nameTextStyle:{fontWeight:"normal",verticalAlign:"top",padding:20,fontSize:16},min:0,max:1.5,interval:.25}],series:[{name:"用电量",type:"line",smooth:!0,data:[0,1,.25,1.25,1.5,.6,.5,1.3,1,.25,1.25,1.5,.6,.5,1.3]}]},electricityOption:{title:{text:"无功功率：（kw）"},xAxis:[{type:"category",name:"日期",nameTextStyle:{fontWeight:"normal",verticalAlign:"bottom",padding:50,fontSize:16},data:["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"]}],yAxis:[{type:"value",name:"无功功率（kw）",nameLocation:"middle",nameTextStyle:{fontWeight:"normal",verticalAlign:"top",padding:20,fontSize:16},min:0,max:1.5,interval:.25}],series:[{name:"用电量",type:"line",smooth:!0,data:[0,1,.25,1.25,1.5,.6,.5,1.3,1,.25,1.25,1.5,.6,.5,1.3]}]},electricEnergyOption:{title:{text:"无功功率：（kw）"},xAxis:[{type:"category",name:"日期",nameTextStyle:{fontWeight:"normal",verticalAlign:"bottom",padding:50,fontSize:16},data:["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"]}],yAxis:[{type:"value",name:"无功功率（kw）",nameLocation:"middle",nameTextStyle:{fontWeight:"normal",verticalAlign:"top",padding:20,fontSize:16},min:0,max:1.5,interval:.25}],series:[{name:"用电量",type:"line",smooth:!0,data:[0,1,.25,1.25,1.5,.6,.5,1.3,1,.25,1.25,1.5,.6,.5,1.3]}]},powerFactorOption:{title:{text:"无功功率：（kw）"},xAxis:[{type:"category",name:"日期",nameTextStyle:{fontWeight:"normal",verticalAlign:"bottom",padding:50,fontSize:16},data:["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"]}],yAxis:[{type:"value",name:"无功功率（kw）",nameLocation:"middle",nameTextStyle:{fontWeight:"normal",verticalAlign:"top",padding:20,fontSize:16},min:0,max:1.5,interval:.25}],series:[{name:"用电量",type:"line",smooth:!0,data:[0,1,.25,1.25,1.5,.6,.5,1.3,1,.25,1.25,1.5,.6,.5,1.3]}]},activeName:"power"}},methods:{handleClick:function(e,t){console.log(this.activeName)},changeData:function(){var e=this;console.log(this.form.eleboxId,"eleboxId"),console.log("尝试改变数据"),console.log(this.$refs.searchForm),this.$refs.searchForm.validate(function(t){if(!t)return console.log("error submit!!"),!1;var a={eleboxId:e.form.eleboxId,startDate:new Date(e.form.date1),endDate:new Date(e.form.date2)},o=new Date(e.form.date1);switch(console.log(o),console.log(a,"params"),e.activeName){case"power":Object(i.d)(a).then(function(e){console.log(e,"请求功率数据")});break;case"electricity":Object(i.b)(a).then(function(e){console.log(e,"请求功率数据")});break;case"voltage":Object(i.e)(a).then(function(e){console.log(e,"请求功率数据")});break;case"electricEnergy":Object(i.c)(a).then(function(e){console.log(e,"请求功率数据")});break;case"powerFactor":Object(i.d)(a).then(function(e){console.log(e,"请求功率数据")})}}),n.a.init(document.getElementById("power")).setOption(this.powerOption)}},mounted:function(){n.a.init(document.getElementById("voltage")).setOption(this.voltageOption),n.a.init(document.getElementById("power")).setOption(this.powerOption),n.a.init(document.getElementById("nonPower")).setOption(this.nonPowerOption),n.a.init(document.getElementById("electricity")).setOption(this.electricityOption),n.a.init(document.getElementById("electricEnergy")).setOption(this.electricEnergyOption),n.a.init(document.getElementById("powerFactor")).setOption(this.powerFactorOption)}},r={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"ter-report"},[a("div",{staticClass:"cont-inpts"},[a("el-form",{ref:"searchForm",attrs:{model:e.form,rules:e.rules,"label-width":"80px"}},[a("el-row",{staticClass:"row-bg",attrs:{type:"flex"}},[a("el-col",{attrs:{span:6}},[a("el-form-item",{attrs:{label:"控制柜",prop:"eleboxId"}},[a("el-input",{model:{value:e.form.eleboxId,callback:function(t){e.$set(e.form,"eleboxId",t)},expression:"form.eleboxId"}})],1)],1),e._v(" "),a("el-col",{attrs:{span:16}},[a("el-form-item",{attrs:{label:"日期从",prop:"date1"}},[a("el-col",{attrs:{span:11}},[a("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",placeholder:"选择日期",format:"yyyy 年 MM 月 dd 日","value-format":"yyyy-MM-dd"},model:{value:e.form.date1,callback:function(t){e.$set(e.form,"date1",t)},expression:"form.date1"}})],1),e._v(" "),a("el-col",{staticClass:"line",attrs:{span:2}},[e._v("到")]),e._v(" "),a("el-col",{attrs:{span:11}},[a("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",placeholder:"选择日期",format:"yyyy 年 MM 月 dd 日","value-format":"yyyy-MM-dd"},model:{value:e.form.date2,callback:function(t){e.$set(e.form,"date2",t)},expression:"form.date2"}})],1)],1)],1)],1),e._v(" "),a("el-row",[a("el-form-item",[a("el-button",{attrs:{type:"primary",plain:""},on:{click:this.changeData}},[e._v("查询")])],1)],1)],1)],1),e._v(" "),a("div",{staticClass:"echarts-lines"},[a("el-tabs",{on:{"tab-click":e.handleClick},model:{value:e.activeName,callback:function(t){e.activeName=t},expression:"activeName"}},[a("el-tab-pane",{attrs:{label:"功率",name:"power"}},[a("div",{attrs:{id:"power"}}),e._v(" "),a("div",{attrs:{id:"nonPower"}})]),e._v(" "),a("el-tab-pane",{attrs:{label:"电流",name:"electricity"}},[a("div",{attrs:{id:"electricity"}})]),e._v(" "),a("el-tab-pane",{attrs:{label:"电压",name:"voltage"}},[a("div",{attrs:{id:"voltage"}},[e._v("sddsd")])]),e._v(" "),a("el-tab-pane",{attrs:{label:"电能",name:"electricEnergy"}},[a("div",{attrs:{id:"electricEnergy"}})]),e._v(" "),a("el-tab-pane",{attrs:{label:"功率因素",name:"powerFactor"}},[a("div",{attrs:{id:"powerFactor"}})])],1)],1)])},staticRenderFns:[]};var s=a("VU/8")(l,r,!1,function(e){a("rvha")},null,null);t.default=s.exports},rvha:function(e,t){}});
//# sourceMappingURL=31.901d3024926e9c9749c2.js.map