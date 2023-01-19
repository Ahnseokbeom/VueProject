import Vue from 'vue';
import VueRouter from 'vue-router';
import List from '@/comments/UserList';
import Login from '@/comments/LoginView';
import SignUp from '@/comments/SignUp';

Vue.use(VueRouter)

const routes = [
    {
        path : '/',
        name : 'list',
        component : List
    },
    {
        path : '/login',
        name : 'login',
        component : Login
    },
    {
        path : '/signUp',
        name : 'signup',
        component : SignUp
    }
]
const router = new VueRouter({
    mode : 'history',
    routes
})
export default router