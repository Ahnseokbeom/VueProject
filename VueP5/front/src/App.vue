<template>
  <v-app>
      <moviePage />
    <Header />
    <Footer />
  <v-btn class="top_scroll" fab @click="$vuetify.goTo(0,opticons)">
      <v-icon color="primary">mdi-arrow-up-thick</v-icon>
    </v-btn>
  </v-app>
</template>

<script>
import moviePage from './components/MovieIndexPage.vue';
import Header from './components/HeaderView.vue';
import Footer from './components/FooterView.vue'

export default {
  name: 'App',

  components: {
    moviePage,
    Header,
    Footer,
  },

  data: () => ({
    //
  }),
};
</script>

<style scoped>
.top_scroll {
  position: fixed;
  bottom: 5vh;
  right: 2vw;
}
</style>
