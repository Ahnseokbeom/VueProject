<template>
    <div class="window">
      <div v-for="(da, index) in data" :key="index" class="list">
      <p style="font-size:30px;"> {{ da.Title }}</p>
      <div class="datebox">
        <a :href="da.Link"><img :src="da.Thumbnail"></a>
        <p style="font-size:25px;"> 날짜: {{ da.Date }}</p>
        <p style="font-size:25px;"> 끝나는 날짜:{{ da.EndDate }}</p>
      </div>
      </div>
    </div>
  </template>
    
  <script>
  import axios from 'axios'
  const url = 'https://developer-lostark.game.onstove.com'
  export default {
    name : 'Event',
    data(){
      return {
        data:[]
        }
    },
    mounted(){
      const APIKEY = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyIsImtpZCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyJ9.eyJpc3MiOiJodHRwczovL2x1ZHkuZ2FtZS5vbnN0b3ZlLmNvbSIsImF1ZCI6Imh0dHBzOi8vbHVkeS5nYW1lLm9uc3RvdmUuY29tL3Jlc291cmNlcyIsImNsaWVudF9pZCI6IjEwMDAwMDAwMDAyNDgwODcifQ.kS6L1DF8vstXPLytai0lFDJCI55G45eTeuhFA9LSYVUKhne3dE2w0ff7SJ7lk-sKfst9PE2yaMWHO7ONpgmpjTCy-KfI_eEBDg1Zy2061aUuZHnwNDzqhxjOuZoSMfZc2W-OroXOpxyhCYx8Yh6RhUcvWSTBs_5th_oBFFi5O-y52XiMx0hKJtCyXA4UiJmiiqYEroJoYR5cXtemYLRg7DEsUpsJA7EUoYraXJZ-xpZk77Dw50y5WiYv8D6MHge1vgurtsqD3ysLNhWaSrJFhh8Nx2VRCSy6GH5F94Hx3eyrWjbgxM0Xpm-CMDwPhvr2-dr7hC9Gg_CpubX_GwU4xg';
      axios.get(url+'/news/events', {
        headers:{
            'accept': 'application/json',
            authorization: 'bearer ' + APIKEY
        }
      })
      .then((res)=>{
        console.log(res.data)
        this.data = res.data
      })
      .catch((err)=>{
        console.log(err)
      })
    }
  }
  </script>
  
  <style scoped>
  
  .window{
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
  }
  .list{
    margin : 10px;
  
  }
  .datebox{
    border: 1px solid black;
  }
  
  </style>