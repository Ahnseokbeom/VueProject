import Vue from 'vue';
import App from './App.vue';
import vuetify from './plugins/vuetify';
// import {createWepHistory, createRouter} from 'vue-router';

Vue.config.productionTip = false

// const routes = [
//   {
//     path : '/movie',
//     component : ''
//   },
// ]

// const router = createRouter({
//   history : createWepHistory(),
//   routes,
// })
new Vue({
  vuetify,
  render: h => h(App)
}).$mount('#app')

// export default router;
