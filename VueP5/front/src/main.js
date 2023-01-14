import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'
import {router} from './routes/index.js'
import vuetify from './plugins/vuetify';

Vue.config.productionTip = false
Vue.prototype.$http = axios;

new Vue({
  render: h => h(App),
  router,
  vuetify,
}).$mount('#app')
