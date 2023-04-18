import { createApp } from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'
import router from './router/router.js'

loadFonts()

new Vue({
  router,
})
createApp(App)
  .use(vuetify)
  .mount('#app')
