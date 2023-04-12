<template>
  <v-app class=app >
    <v-app-bar app color="rgb(149, 192, 230)" dark >
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
      <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          <div class="col" v-for="(item, idx) in state.items" :key="idx">
            <th>{{ idx+1 }}</th>
            <tr>이름 : {{ item.name }}</tr>
            <tr>장르 : {{ item.type }}</tr>
            <tr><a :href="item.url"><img :src= "item.image" /></a></tr>
      </div>
  </div>
</div>
    </v-main>
        <v-footer class="footer">
      <v-spacer/> 201736023 안석범
      <v-btn href="https://github.com/ahnseokbeom" target="_blank" text>
        <span style="color : white;">github</span>
        </v-btn>
    </v-footer>
  </v-app>
</template>
<script>
import { reactive } from 'vue'
import axios from 'axios'
export default{ 
    name : "AOS",
    setup(){
      const state = reactive({
          items : []
      })
      axios.get("/api/aos").then(({data})=>{
          state.items = data;
          console.log(data);
      })
      return {state}
    }
}
</script>
<style scoped>
.card .img{
  display: inline-block;
  width: 1000px;
  height: 250px;
  background-size: cover;
  background-position: center;
}
.card .card-body .price{
  text-decoration: line-through;
}
img {
    border-radius: 3%;
    width:300px;
    height: 200px;
}
img:hover {
  filter: brightness(0.5);
}
th{
  border-radius: 3%;
  width: 15vw;
  padding: 10px;
  font-weight: bold;
  color : white;
  vertical-align: top;
  background: rgb(149, 192, 230);
}
tr {
  text-align: center;
  font-size: 110%;
  width: 350px;
  padding: 10px;
  vertical-align: top;
}
@import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');
.app{
    font-family: 'Jua', sans-serif;
}
span {
  font-family: 'Jua', sans-serif;
}
.font{
  font-family: 'Jua', sans-serif;
}
.footer {
  color:white;
  background: rgb(149, 192, 230);
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