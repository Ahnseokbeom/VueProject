import {createRouter, createWebHistory} from 'vue-router'
import Home from '@/pages/Home'
const routes = [
    {path : '/',comments : Home},
]

const router = createRouter({
    history : createWebHistory(),
    routes
})
export default router;