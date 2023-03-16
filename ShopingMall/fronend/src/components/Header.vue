<template>
  <header>
  <div class="collapse bg-dark" id="navbarHeader">
    <div class="container">
      <div class="row">
        <div class="col-sm-4 py-4">
          <h4 class="text-white">사이트맵</h4>
          <ul class="list-unstyled">
            <li><router-link class="text-white" to="/">메인 화면</router-link></li>
            <li v-if="$store.state.account.id">
              <router-link class="text-white" to="/orders">주문 내역</router-link>
            </li>
            <li>
              <router-link class="text-white" to="/login" v-if="!$store.state.account.id">로그인</router-link>
              <a class="text-white" to="/login" @click="logout()" v-else >로그아웃</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="navbar navbar-dark bg-dark shadow-sm">
    <div class="container">
      <router-link to="/" class="navbar-brand d-flex align-items-center">
        <strong>Home</strong>
      </router-link>
      <router-link to="/cart" class="cart btn">
        <i class="fa fa-shopping-cart" aria-hidden="true"></i>
      </router-link>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </div>
</header>
</template>

<script>
import store from '@/scripts/store'
import router from '@/scripts/router'
import axios from 'axios'
export default {
  name: 'Header',
  setup(){
    const logout = ()=>{
      axios.post("/api/account/logout").then(()=>{
        store.commit('setAccount',0);
      // sessionStorage.removeItem("id");
      router.push({path:"/"})
      });
    }
    return {logout} 
  },
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
header .navbar .cart{
  margin-left: auto;
  color : white;
}
</style>
