<template>
   <v-app class="app">
       <v-app-bar app color="rgb(198, 186, 219)" dark >
        <v-col cols="2">
      ...
       </v-col>
        <v-col class="d-flex justify-space-around">
      <v-toolbar-title class="white--text"><h2><a href="/">GameRating </a></h2></v-toolbar-title>
    </v-col>
    <v-col cols="2" class="d-flex justify-end"> </v-col>
       </v-app-bar>
      <v-content>
         <v-container fluid fill-height>
            <v-layout align-center justify-center>
               <v-flex xs12 sm8 md4>
                 
                
               </v-flex>
            </v-layout>
         </v-container>
      </v-content>
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
            <v-toolbar-title>SignUp</v-toolbar-title>
            <v-spacer></v-spacer>
            
          </v-toolbar>
          <v-card-text>
            <v-form>
              <v-text-field label="ID" name="id" prepend-icon="mdi-account" type="text" v-model="user.id">
              </v-text-field>
              <v-text-field id="password" label="Password"
                name="password" prepend-icon="mdi-lock" type="password" v-model="user.password"></v-text-field>

              <v-text-field id="confirm" label="Confirm Password"
name="confirm" prepend-icon="mdi-alert-circle-check" type="password" v-model="user.confirm" ></v-text-field>
            </v-form>
          </v-card-text>
          <v-card-actions>
            <v-btn color="rgb(198, 186, 219)" to="/" style="color : white;">홈으로</v-btn>
            <v-spacer></v-spacer>
            <v-btn color="rgb(198, 186, 219)" @click="signup" style="color : white;">SignUp</v-btn>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
   </v-app>
</template>

<script>
export default{
  data(){
    return {
      user : {
        id : "",
        password : "",
        confirm : "",
      }
    }
  },
  methods: {
    signup(){
      if(this.user.id=='')
        alert('ID를 입력해주세요.')
      if(this.user.password!=this.user.confirm)
        alert('비밀번호를 확인해주세요.')
      if(this.user.password=='' || this.user.confirm=='') alert('비밀번호를 입력해주세요.')
      alert('회원가입 완료!')
      this.$router.push('/')
    }
  }
}
      // console.log("Signup",this.id, this.password, this.confirm)
      // if(!this.id){
      //   alert("아이디를 확인하여 주십시오.")
      // }
      // if(!this.password){
      //   alert("암호를 입력하여 주십시오.");
      //   return;
      // }
      // if(!this.confirm){
      //   alert("암호를 다시 확인해주시기 바랍니다.");
      //   return;
      // }
      // if(this.password!=this.confirm){
      //   alert("입력하신 암호가 일치하지 않습니다.");
      //   return;
      // }
      // alert("회원가입 완료")
         // this.$router.push('/')
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
