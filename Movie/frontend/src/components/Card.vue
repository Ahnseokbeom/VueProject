<template>
    <div class="col">
        <div class="card shadow-sm">
          <span class="img" :style="{backgroundImage: `url(${item.img})`}" />
          <div class="card-body">
            <p class="card-text">
             <span>{{ item.title }} &nbsp;</span>
            <span class="discount badge bg-danger">{{ item.grade }}%</span>
          </p>
            <div class="d-flex justify-content-between align-items-center">
              <small class="price text-muted">{{ item.rate }}원</small>
              
              <small class="real text-danger">{{ lib.getNumberFormatted(item.price - (item.price*item.discount/100)) }}원</small>
            </div>
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
    setup(){
      
        }
    }
</script>
<style scoped>
.card .img{
  display: inline-block;
  width: 100%;
  height: 250px;
  background-size: cover;
  background-position: center;
}
.card .card-body .price{
  text-decoration: line-through;
}
</style>