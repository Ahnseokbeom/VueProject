import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import NotFound from '../views/NotFound.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path:'/manager',
    name:'manager',
    component:()=> import('../views/ManagerQnaView.vue')
  },
  {
    path : '/qna',
    name : 'qna',
    component: ()=> import('../views/QnAView.vue')
  },
  {
    path : '/login',
    name : 'login',
    component:() => import('../views/LoginView.vue')
  },
  {
    path : '/game',
    name : 'game',
    component:()=> import('../views/GameView.vue')
  },
  {
    path : '/evaluation',
    name : 'evaluation',
    component:()=> import('../views/EvaluationView.vue')
  },
  {
    path : '/ranking',
    name : 'ranking',
    component:()=> import('../views/RankView.vue')
  },
  {
    path : '/signup',
    name : 'signup',
    component:()=> import('../views/SignupView.vue')
  },
  {
    path : '/search',
    name : 'search',
    component:()=> import('../views/SearchView.vue')
  },
  {
    path:'/aos',
    name : 'aos',
    component:()=> import('../views/AosView.vue')
  },
  {
    path:'/fps',
    name : 'fps',
    component:()=> import('../views/FpsView.vue')
  },
  {
    path:'/sport',
    name : 'sport',
    component:()=> import('../views/SportView.vue')
  },
  {
    path:'/rpg',
    name : 'rpg',
    component:()=> import('../views/RpgView.vue')
  },
    {
      path: "*",
      component: NotFound
    },
    {
      path:'/rpgdetail',
      name : 'rpgdetail',
      component:()=> import('../views/RpgDetailView.vue')
    },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})
export default router
