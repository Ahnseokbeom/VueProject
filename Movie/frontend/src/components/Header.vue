<template>
    <header>
        <div class="collapse bg-dark" id="navbarHeader">
    <div class="container">
      <div class="row">
        <div class="col-sm-4 py-4">
          <h4 class="text-white">사이트맵</h4>
          <ul class="list-unstyled">
            <li><router-link class="text-white" to="/">메인 화면</router-link></li>
            <li><router-link class="text-white" to="/movie">zz 화면</router-link></li>
            <li>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="navbar navbar-dark bg-dark shadow-sm">
    <div class="container">
      <a href="#" class="navbar-brand d-flex align-items-center">
        <strong>Movie</strong>
      </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </div>
</header>
</template>
<script>
export default{
    name : 'Header'
}
</script>