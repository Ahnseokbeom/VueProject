const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: [
    'vuetify'
  ]
})

module.exports = {
  devServer : {
    proxy : {
      '/api' : {
        target : 'http://localhost:3000/api',
        changeOrigin : true,
        pathRewrite : {
          '^/api' : ''
        }
      }
    }
  },
  outputDir : '../back/public',
  transpileDependencies: [
    'vuetify'
  ]
}
