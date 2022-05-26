<template>
  <section class="container">
      <h1>{{message}}</h1>
      <hr>
      <router-link to="/price">Price Page</router-link>
  </section>
</template>
 
  
<script>
export default {
  data: function(){
    return {
      message: 'Hello World!'
    }
  }
}
</script>
