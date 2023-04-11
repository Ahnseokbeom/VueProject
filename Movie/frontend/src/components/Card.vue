<template>
    <div class="col">
        <div class="card shadow-sm">
          <div class="card-body">
                <table>
                    <th class="title">{{ item.ranking }}</th>
                    <tr>이름 : {{ item.name }}</tr>
                    <tr>장르 : {{ item.type }}</tr>
                    <tr><a :href="item.url"><img :src= "item.image" /></a></tr>
                </table>
          </div>
        </div>
      </div>
</template>
<script>
export default {
    name : "Card",
    props :{
      item : Object 
    },
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
/* .title {
    font-size: 200px;
    text-align: center;
} */
table th{
  border-radius: 3%;
  width: 150px;
  padding: 10px;
  font-weight: bold;
  color : white;
  vertical-align: top;
  background: rgb(198, 186, 219);
}
table tr {
  text-align: center;
  font-size: 110%;
  width: 350px;
  padding: 10px;
  vertical-align: top;
}
</style>