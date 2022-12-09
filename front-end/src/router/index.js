import Vue from 'vue'
import VueRouter from 'vue-router'
// import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  // Home
  {
    path: '/',
    name: 'home',
    component: () => import('../views/HomeView.vue')
  },

  // services 
  {
    path: '/services',
    name: 'services',
    component: () => import('../views/ServicesView.vue')
  },

  // desert 
  {
    path: '/desert',
    name: 'desert',
    component: () => import('../views/DesertView.vue')
  },

  // gallery 
  {
    path: '/gallery',
    name: 'gallery',
    component: () => import('../views/GalleryView.vue')
  },

  // qna 
  {
    path: '/qna',
    name: 'qna',
    component: () => import('../views/qna/QnaView.vue')
  },

  // AddQna 
  {
    path: '/add-qna',
    name: 'add-qna',
    component: () => import('../views/qna/AddQnaView.vue')
  },

  // QnaDetail 
  {
    path: '/qna/:qno',
    name: 'qna-detail',
    component: () => import('../views/qna/QnaDetailView.vue')
  },

  // 일본음식 
  {
    path: '/japaneseFood',
    name: 'japaneseFood',
    component: () => import('../views/dropdown/JapaneseFood/JapaneseFoodView.vue')
  },

  // 한국음식 
  {
    path: '/koreaFood',
    name: 'koreaFood',
    component: () => import('../views/dropdown/Koreafood/KoreaFoodView.vue')
  },

  // add-koreaFood 
  {
    path: '/add-koreaFood',
    name: 'add-koreaFood',
    component: () => import('../views/dropdown/Koreafood/AddKoreaFood.vue')
  },

  // koreaFooddetail 
  {
    path: '/koreaFood/:kno',
    name: 'koreaFood-detail',
    component: () => import('../views/dropdown/Koreafood/KoreaFoodDetail.vue')
  },

  // 중국음식 
  {
    path: '/chineseFood',
    name: 'chineseFood',
    component: () => import('../views/dropdown/ChineseFood/ChineseFoodView.vue')
  },

  // add-chineseFood 
  {
    path: '/add-chineseFood',
    name: 'add-chineseFood',
    component: () => import('../views/dropdown/ChineseFood/AddChineseFood.vue')
  },

  // chineseFooddetail 
  {
    path: '/chineseFood/:cno',
    name: 'chineseFood-detail',
    component: () => import('../views/dropdown/ChineseFood/ChineseFoodDetail.vue')
  },

  // 서양음식 
  {
    path: '/westernFood',
    name: 'westernFood',
    component: () => import('../views/dropdown/WesternFoodView.vue')
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
