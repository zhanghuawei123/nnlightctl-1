webpackJsonp([24],{"7E4A":function(t,s,a){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var i=a("EMlb"),n={name:"Project",data:function(){return{allTotal:0,kzTotal:0,dTotal:0,countryList:{}}},methods:{getListProject:function(){var t=this,s=this,a={};Object(i.l)().then(function(i){if(s.projectList=i.data,s.projectList.length>0)for(var n in i.data){var e=i.data[n],l=e.contryName;a[l]?a[l]+=1:a[l]=1,t.allTotal=t.allTotal+i.total,t.kzTotal=t.kzTotal+e.eleboxs,t.dTotal=t.dTotal+e.lights}t.countryList=a}).catch(function(t){console.log(t)})}},created:function(){this.getListProject()},destroyed:function(){}},e={render:function(){var t=this,s=t.$createElement,a=t._self._c||s;return a("div",{staticClass:"project-container"},[a("div",{staticClass:"module-item module-item1"},[a("p",{staticClass:"title"},[t._v("\n      全球项目概况\n    ")]),t._v(" "),a("div",{staticClass:"item-list"},t._l(t.countryList,function(s,i){return a("span",{key:i,staticClass:"item"},[a("span",[t._v(t._s(i))]),t._v(" "),a("span",{staticClass:"sub-num"},[t._v(t._s(s))])])}))]),t._v(" "),a("div",{staticClass:"module-item module-item2"},[a("p",{staticClass:"title"},[t._v("\n      全球统计数据\n    ")]),t._v(" "),a("div",{staticClass:"item-list"},[a("span",{staticClass:"item"},[a("i",{staticClass:"iconfont"},[t._v("")]),t._v(" "),a("span",[t._v("项目")]),t._v(" "),a("span",{staticClass:"sub-num"},[t._v(t._s(t.allTotal))])]),t._v(" "),a("span",{staticClass:"item"},[a("i",{staticClass:"iconfont"},[t._v("")]),t._v(" "),a("span",[t._v("控制柜")]),t._v(" "),a("span",{staticClass:"sub-num"},[t._v(t._s(t.kzTotal))])]),t._v(" "),a("span",{staticClass:"item"},[a("i",{staticClass:"iconfont"},[t._v("")]),t._v(" "),a("span",[t._v("灯具")]),t._v(" "),a("span",{staticClass:"sub-num"},[t._v(t._s(t.dTotal))])])])])])},staticRenderFns:[]};var l=a("VU/8")(n,e,!1,function(t){a("Bqox"),a("aO/Q")},"data-v-012b5335",null);s.default=l.exports},Bqox:function(t,s){},"aO/Q":function(t,s){}});
//# sourceMappingURL=24.b980b526bf0f45553d1c.js.map