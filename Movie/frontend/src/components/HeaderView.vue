<template>
    <v-app class=app>
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
          <v-toolbar-title><h2><a href="/">Movie </a></h2></v-toolbar-title>
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
            <v-list-item-title><span><a href="/sport" style="color : black; text-decoration: none;">스포츠</a></span></v-list-item-title>
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
        <v-spacer></v-spacer>
          <v-btn icon href="/search" text><v-icon>mdi-magnify</v-icon></v-btn>
      </v-app-bar>
          <v-footer class="footer">
        <v-spacer/> 201736023 안석범
        <v-btn href="https://github.com/ahnseokbeom" target="_blank" text>
          <span style="color : white;">github</span>
          </v-btn>
      </v-footer>
    </v-app>
  </template>
  <style scoped>
  @import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');
  .app{
      font-family: 'Jua', sans-serif;
  }
  img {
      width:300px;
      height: 200px;
  }
  table.ranking {
    font-size: 20px;
    border-collapse: separate;
    border-spacing: 1px;
    text-align: center;
    line-height: 1.5;
    border-top: 1px solid #ccc;
    margin: 20px 10px;
  }
  table.ranking th{
    width: 150px;
    padding: 10px;
    font-weight: bold;
    color : white;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
    background: rgb(149, 192, 230);
  }
  table.ranking tr {
    /* text-align: left; */
    width: 350px;
    padding: 10px;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
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