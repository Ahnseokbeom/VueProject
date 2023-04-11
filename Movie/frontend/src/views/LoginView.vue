<template>
   <v-app class="app">
       <v-app-bar app color="rgb(198, 186, 219)" dark >
        <v-col cols="2"></v-col>
        <v-col class="d-flex justify-space-around">
      <v-toolbar-title class="white--text"><h2><a href="/">GameRating </a></h2></v-toolbar-title>
    </v-col>
    <v-col cols="2" class="d-flex justify-end"> </v-col>
       </v-app-bar>
         <v-container
    class="fill-height"
    fluid
  >
    <v-row
      align="center"
      justify="center"
    >
      <v-col
        cols="12"
        sm="8"
        md="4"
      >
        <v-card class="elevation-12">
          <v-toolbar
            color="rgb(198, 186, 219)"
            dark
            flat
          >
            <v-toolbar-title>Login</v-toolbar-title>
            <v-spacer></v-spacer>
          </v-toolbar>
          <v-card-text>
            <v-form>
              <v-text-field label="Login" name="login" prepend-icon="mdi-account" type="text" v-model="user.id"></v-text-field>
              <v-text-field id="password" label="Password" name="password" prepend-icon="mdi-lock" type="password" v-model="user.password"></v-text-field>
            </v-form>
          </v-card-text>
          <v-card-actions>
            <v-btn color="rgb(198, 186, 219)" @click="$router.push('/signup')" style="color : white;">SignUp</v-btn>
            <v-spacer></v-spacer>
            <v-btn color="rgb(198, 186, 219)" style="color : white;">Login</v-btn>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
   </v-app>
</template>

<script>
export default {
  data:function(){
    return{
      user :{
        id : "",
        password : "",
      }
    }
  },
  methods:{
    login:function(){
      this.$http.post('api/users/login',{
        user : this.user,
      })
      .then((res)=>{
        alert(res.data.message);
      },
      (err)=>{
        alert('ID와 비밀번호를 확인해주세요.',err)
      })
      .catch((err)=>{
        alert(err);
      })
    }
  } 
};
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');
.app{
    font-family: 'Jua', sans-serif;
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
