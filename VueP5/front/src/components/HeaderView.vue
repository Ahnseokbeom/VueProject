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
            <v-list-item-title><span><a href="/movie" style="color : black; text-decoration: none;">영화</a></span></v-list-item-title>
          </v-list-item>
          <v-list-item link>
            <v-list-item-title><span><a href="/ranking" style="color : black; text-decoration: none;">랭킹</a></span></v-list-item-title>
          </v-list-item>
          <v-list-item link>
            <v-list-item-title><span><a href="/evaluation" style="color : black; text-decoration: none;">영화 추천</a></span></v-list-item-title>
          </v-list-item>
        </v-list>
          </v-menu>
          <v-toolbar-title><h2><a href="/">Movie </a></h2></v-toolbar-title>
          </div>
        <v-container class="top">
          <v-menu offset-y open-on-hover>
            <template v-slot:activator="{ on, attrs }">
          <v-btn href="/movie" v-bind="attrs" v-on="on" text><h2>영화</h2></v-btn>
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
          <v-btn href="/evaluation" text><h2>영화 추천</h2></v-btn>
        </v-container>
        <v-spacer></v-spacer>
          <v-btn icon href="/search" text><v-icon>mdi-magnify</v-icon></v-btn>
      </v-app-bar>
    </v-app>
  </template>
  <style scoped>
  @import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');
  .app{
      font-family: 'Jua', sans-serif;
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