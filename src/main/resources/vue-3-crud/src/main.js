import { createApp } from 'vue'
import App from './App.vue'
//导入bootstrap
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
//导入路由
import router from './router'

createApp(App).use(router).mount('#app')
