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
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking<=5">{{item.ranking}}</th>
                <tr v-if="item.ranking<=5">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking<=5">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking<=5"><img :src= "item.image" /></tr>
                <tr v-if="item.ranking<=5">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>5 && item.ranking<=10">{{item.ranking}}</th>
                <tr v-if="item.ranking>5 && item.ranking<=10">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>5 && item.ranking<=10">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>5 && item.ranking<=10"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>5 && item.ranking<=10">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>10 && item.ranking<=15">{{item.ranking}}</th>
                <tr v-if="item.ranking>10 && item.ranking<=15">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>10 && item.ranking<=15">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>10 && item.ranking<=15"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>10 && item.ranking<=15">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>15 && item.ranking<=20">{{item.ranking}}</th>
                <tr v-if="item.ranking>15 && item.ranking<=20">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>15 && item.ranking<=20">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>15 && item.ranking<=20"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>15 && item.ranking<=20">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>20 && item.ranking<=25">{{item.ranking}}</th>
                <tr v-if="item.ranking>20 && item.ranking<=25">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>20 && item.ranking<=25">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>20 && item.ranking<=25"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>20 && item.ranking<=25">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>25 && item.ranking<=30">{{item.ranking}}</th>
                <tr v-if="item.ranking>25 && item.ranking<=30">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>25 && item.ranking<=30">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>25 && item.ranking<=30"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>25 && item.ranking<=30">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>30 && item.ranking<=35">{{item.ranking}}</th>
                <tr v-if="item.ranking>30 && item.ranking<=35">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>30 && item.ranking<=35">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>30 && item.ranking<=35"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>30 && item.ranking<=35">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>35 && item.ranking<=40">{{item.ranking}}</th>
                <tr v-if="item.ranking>35 && item.ranking<=40">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>35 && item.ranking<=40">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>35 && item.ranking<=40"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>35 && item.ranking<=40">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>40 && item.ranking<=45">{{item.ranking}}</th>
                <tr v-if="item.ranking>40 && item.ranking<=45">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>40 && item.ranking<=45">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>40 && item.ranking<=45"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>40 && item.ranking<=45">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
        <table class="ranking" style="margin-left: auto;margin-right: auto;">
        <td v-for="item in rankings" v-bind="item.ranking" :key="item.ranking" >
                <th v-if="item.ranking>45">{{item.ranking}}</th>
                <tr v-if="item.ranking>45">이름 : {{item.name}}</tr>
                <tr v-if="item.ranking>45">장르 : {{item.type}}</tr>
                <tr v-if="item.ranking>45"><img :src="item.image" /></tr>
                <tr v-if="item.ranking>45">
                  <v-btn @click="item.heart++" class="mx-2" fab dark small color="pink">
                    <v-icon dark>mdi-heart</v-icon></v-btn>{{item.heart}}</tr>
        </td>
        </table>
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
import ranking from '../Json/ranking.json';
export default{
    name : 'rankingList',
    computed:{
        rank(){
            return ranking.map((items)=>{
                return items;
            })
        }
    },
    data(){
        return {
            rankings : ranking,
        }
    }
}
</script>

<style scoped>
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
img {
  border-radius: 3%;
    width:300px;
    height: 200px;
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