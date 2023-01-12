import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'
import {router} from './routes/index.js'

Vue.config.productionTip = false
Vue.prototype.$http = axios;

new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
