import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

export default new VueRouter({
	mode:'history', //해쉬값 제거 방식
    routes: [
        {
        path: '/',
        component: () => import('../views/Main.vue'),
    }],
});