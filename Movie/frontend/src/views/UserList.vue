<template>
    <div class="hello">
        <div v-for="(user,idx) in users" :key="idx" class="user-wrap">
        <h2>No. {{idx+1}}</h2>
        <dl>
            <dt>아이디</dt>
            <dd>{{user.id}}</dd>
        </dl>
        </div>
    </div>
</template>
<script>
export default{
    data(){
        return {
            users:[],
        }
    },
    created(){
        this.$http.get('/api/users').then((response)=>{
            this.users = response.data;
        })
    }
}
</script>
