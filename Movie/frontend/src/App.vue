<template>
  <v-app>
    <Header/>
    <v-main>
    </v-main>
    <Footer author = "Seokbeom"/>
  </v-app>
</template>

<script>
import Header from './components/Header.vue'
import Footer from './components/Footer.vue'

export default {
  name: 'App',

  components: {
    Header,
    Footer,
  },

  data: () => ({
    //
  }),
}
</script>
