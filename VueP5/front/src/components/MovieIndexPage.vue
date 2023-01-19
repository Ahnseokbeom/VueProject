<template>
  <v-container justify-center>
    <div style="margin-top: 5%; margin-right: -25%; margin-left: 5%;">
      <h1>영화 예매 순위</h1>
      <ul class="movies" style="padding-right: -600px;">
        <li v-for="movie in movies" class="item" :key="movie.id">
          <router-link :to="{ name: 'show', params: { id: movie.id }}">
            <br>
            <img v-bind:src="movie.img" class="img">
          </router-link>
          <div class="detail">
            <strong class="title">{{movie.grade}} {{movie.title}}</strong><br>
            <span class="rate">예매율 <span class="num">{{movie.rate}}%</span></span><br>
            <span class="release">개봉일 <span class="num">{{movie.release}}</span></span><br>
          </div>
        </li>
      </ul>
    </div>
  </v-container>
  </template>
  <script>
  export default {
    created () {         
      this.$http.get('/api/movies')
          .then((response) => {
            this.movies = response.data
          })
    },
    data () {
      return {
        movies: []
      }
    }
  }
  </script>
  <style scoped>
.detail {
  width: 100%;
}
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display :inline-block;
  }
  a {
    color: #42b983;
  }
  img {
    width: 30%;
    height: 30%;
  }
  </style>