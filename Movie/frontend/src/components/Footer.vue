<template>
    <v-footer color="transparent" absolute>
      <v-spacer />
      <div>&copy; {{ year }}, Made by <v-icon>mdi-vuetify</v-icon><a href="https://github.com/Ahnseokbeom">{{author}}</a></div>
    </v-footer>
  </template>
  
  <script>
  export default {
    props: {
      author: String
    },
    data() {
      return {
        year: ''
      }
    },
      mounted() {
      this.getCurrentYear()
    },
    methods: {
      getCurrentYear() {
        let myDate = new Date()
        this.year = myDate.getFullYear()
      }
    }
  }
  </script>
  
  <style>
  
  </style>