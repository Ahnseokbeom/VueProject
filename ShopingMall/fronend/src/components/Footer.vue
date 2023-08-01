<template>
  <footer class="text-muted py-5">
  <div class="container">
    <p class="float-end mb-1">
      <a href="#">top</a>
    </p>
  </div>
</footer>
</template>

<script>
export default {
  name: 'Footer',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
a{
  text-decoration: none;
  border-radius: 20px;
}
</style>
