(function(){"use strict";var t={488:function(t,n,i){var r=i(144),s=function(){var t=this,n=t._self._c;return n("div",{attrs:{id:"app"}},[n("router-view")],1)},e=[],o=i(736),a={},u=(0,o.Z)(a,s,e,!1,null,null,null),c=u.exports,l=i(945),v=i(201),d=function(){var t=this,n=t._self._c;return n("div",{staticClass:"wrap"},[n("h1",[t._v("5월 마지막주 영화 예매 순위")]),n("ul",{staticClass:"movies"},t._l(t.movies,(function(i){return n("li",{key:i.id,staticClass:"item"},[n("span",{staticClass:"rank"},[t._v(t._s(i.id))]),n("router-link",{attrs:{to:{name:"show",params:{id:i.id}}}},[n("img",{staticClass:"poster",attrs:{src:i.poster}})]),n("div",{staticClass:"detail"},[n("strong",{staticClass:"tit"},[t._v(t._s(i.name))]),n("br"),n("span",{staticClass:"rate"},[t._v("예매율 "),n("span",{staticClass:"num"},[t._v(t._s(i.rate))])]),n("br"),n("router-link",{staticClass:"link",attrs:{to:{name:"show",params:{id:i.id}}}},[t._v("자세히보기")])],1)],1)})),0)])},f=[],p={created(){this.$http.get("/api/movies").then((t=>{this.movies=t.data}))},data(){return{movies:[]}}},m=p,h=(0,o.Z)(m,d,f,!1,null,"aff6d222",null),_=h.exports,C=function(){var t=this,n=t._self._c;return n("div",{staticClass:"detail"},[n("h1",[t._v(t._s(t.movie.name))]),n("img",{staticClass:"poster",attrs:{src:t.movie.poster}}),n("section",[n("h2",[t._v("영화정보")]),n("dl",{staticClass:"info"},[n("dt",[t._v("감독")]),n("dd",[t._v(t._s(t.movie.director))]),n("dt",[t._v("출연")]),n("dd",[t._v(t._s(t.movie.actors))]),n("dt",[t._v("러닝타임")]),n("dd",[t._v(t._s(t.movie.time))])])]),n("section",[n("h2",[t._v("줄거리")]),n("p",{staticClass:"synopsis",domProps:{innerHTML:t._s(t.movie.synopsis)}})]),n("router-link",{staticClass:"link",attrs:{to:{name:"index",params:{id:t.movie.id}}}},[t._v("돌아가기")])],1)},b=[],w={created:function(){var t=this.$route.params.id;this.$http.get("/api/movies/"+t).then((t=>{this.movie=t.data[0]}))},data:function(){return{movie:{}}}},g=w,y=(0,o.Z)(g,C,b,!1,null,null,null),k=y.exports;r.ZP.use(v["default"]);const O=new v["default"]({mode:"history",routes:[{path:"/",name:"index",component:_},{path:"/:id",name:"show",component:k}]});r.ZP.config.productionTip=!1,r.ZP.prototype.$http=l.Z,new r.ZP({render:t=>t(c),router:O}).$mount("#app")}},n={};function i(r){var s=n[r];if(void 0!==s)return s.exports;var e=n[r]={exports:{}};return t[r](e,e.exports,i),e.exports}i.m=t,function(){var t=[];i.O=function(n,r,s,e){if(!r){var o=1/0;for(l=0;l<t.length;l++){r=t[l][0],s=t[l][1],e=t[l][2];for(var a=!0,u=0;u<r.length;u++)(!1&e||o>=e)&&Object.keys(i.O).every((function(t){return i.O[t](r[u])}))?r.splice(u--,1):(a=!1,e<o&&(o=e));if(a){t.splice(l--,1);var c=s();void 0!==c&&(n=c)}}return n}e=e||0;for(var l=t.length;l>0&&t[l-1][2]>e;l--)t[l]=t[l-1];t[l]=[r,s,e]}}(),function(){i.d=function(t,n){for(var r in n)i.o(n,r)&&!i.o(t,r)&&Object.defineProperty(t,r,{enumerable:!0,get:n[r]})}}(),function(){i.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){i.o=function(t,n){return Object.prototype.hasOwnProperty.call(t,n)}}(),function(){var t={143:0};i.O.j=function(n){return 0===t[n]};var n=function(n,r){var s,e,o=r[0],a=r[1],u=r[2],c=0;if(o.some((function(n){return 0!==t[n]}))){for(s in a)i.o(a,s)&&(i.m[s]=a[s]);if(u)var l=u(i)}for(n&&n(r);c<o.length;c++)e=o[c],i.o(t,e)&&t[e]&&t[e][0](),t[e]=0;return i.O(l)},r=self["webpackChunkfront"]=self["webpackChunkfront"]||[];r.forEach(n.bind(null,0)),r.push=n.bind(null,r.push.bind(r))}();var r=i.O(void 0,[998],(function(){return i(488)}));r=i.O(r)})();
//# sourceMappingURL=app.5e76cff4.js.map