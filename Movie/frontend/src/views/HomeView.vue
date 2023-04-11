<template>
  <v-app class="app">
    <v-app-bar app color="rgb(198, 186, 219)" dark >
      <div class="d-flex align-center">
        <v-menu offset-y open-on-hover>
          <template v-slot:activator="{ on, attrs }">
        <v-btn v-bind="attrs" v-on="on" text><v-app-bar-nav-icon x-large></v-app-bar-nav-icon></v-btn>
      </template>
      <v-list>
        <v-list-item link>
          <v-list-item-title><span><a href="/game" style="color : black; text-decoration: none;">게임</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/ranking" style="color : black; text-decoration: none;">랭킹</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/evaluation" style="color : black; text-decoration: none;">게임 평가</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/qna" style="color : black; text-decoration: none;">게시판</a></span></v-list-item-title>
        </v-list-item>
      </v-list>
        </v-menu>
        <v-toolbar-title><h2><a href="/">GameRating </a></h2></v-toolbar-title>
        </div>
      <v-container class="top">
        <v-menu offset-y open-on-hover>
          <template v-slot:activator="{ on, attrs }">
        <v-btn href="/game" v-bind="attrs" v-on="on" text><h2>게임</h2></v-btn>
      </template>
      <v-list>
        <v-list-item link>
          <v-list-item-title><span><a href="/aos" style="color : black; text-decoration: none;">AOS</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/rpg" style="color : black; text-decoration: none;">RPG</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/fps" style="color : black; text-decoration: none;">FPS</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/sport" style="color : black; text-decoration: none;">ACT/SPT</a></span></v-list-item-title>
        </v-list-item>
      </v-list>
        </v-menu>
      </v-container>
      <v-container class="top">
        <v-btn href="/ranking" text><h2>랭킹</h2></v-btn>
      </v-container>
      <v-container class="top">
        <v-btn href="/evaluation" text><h2>게임 평가</h2></v-btn>
      </v-container>
      <v-container class="top">
        <v-btn href="/qna" text><h2>게시판</h2></v-btn>
      </v-container>
    </v-app-bar>
    <v-main>
      <div class="album py-5 bg-light">
  <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          <div class="col" v-for="(item, idx) in state.items" :key="idx">
              <Card :item="item" />
      </div>
  </div>
</div>
</div>
        </v-main>
        <v-footer class="footer">
      <v-spacer/> <span class="foot">201736023 안석범 졸업 작품</span>
      <v-btn href="https://github.com/ahnseokbeom" target="_blank" text>
        <span style="color : white;">github</span>
        </v-btn>
    </v-footer>
  </v-app>
</template>
<script>
import { reactive } from 'vue'
import axios from 'axios'
import Card from '../components/Card.vue'
export default{ 
    name : "test",
    components:{ Card },
    setup(){
      const state = reactive({
          items : []
      })
      axios.get("/api/game").then(({data})=>{
          state.items = data;
          console.log(data);
      })
      return {state}
    }
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');
img.top{
  margin-right : 50%;
  width: 30%;
  height: 100%;
}
img.top:hover{
  transition: 1s;
  transform: scale(1.2);
  filter: none;
}
.app{
  font-family: 'Jua', sans-serif;
}
span {
  font-family: 'Jua', sans-serif;
}
.font{
  font-family: 'Jua', sans-serif;
}
img {
    border-radius: 3%;
    width:300px;
    height: 200px;
}
img:hover {
  filter: brightness(0.5);
}
table.ranking {
  font-size: 20px;
  border-collapse: separate;
  border-spacing: 1px;
  text-align: center;
  line-height: 1.5;
  margin: 20px 10px;
}

table.ranking th{
  border-radius: 3%;
  width: 150px;
  padding: 10px;
  font-weight: bold;
  color : white;
  vertical-align: top;
  background: rgb(198, 186, 219);
}
table.ranking tr {
  /* text-align: left; */
  width: 350px;
  padding: 10px;
  vertical-align: top;
}
.footer {
  z-index: 2;
  color:white;
  background: rgb(198, 186, 219);
}
h2>a {
  color : white;
  text-decoration: none;
}
.top{
  margin-left: 100px;
  font-size: 20px;
}
</style>
