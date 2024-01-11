// 用于创建路由实例
import { createWebHistory, createRouter} from "vue-router";
// routes 的数组，包含了应用的不同路由配置。每个路由对象都包含了 path（路径）、name（名称）和 component（组件）等属性。这些属性定义了当用户访问不同路径时所呈现的组件。
const routes = [
    {
        path: "/",
        alias: "/tutorials",
        name: "tutorials",
        component: () => import("./components/TutorialsList")
    },
    {
        path: "/tutorials/:id",
        name: "tutorial-details",
        component: () => import("./components/MyTutorial.vue")
    },
    {
        path: "/add",
        name: "add",
        component: () => import("./components/AddTutorial")
    }
];
// 使用 createRouter 方法创建了一个新的路由实例，并传入了一个配置对象。
// 其中，history 属性使用了 createWebHistory 方法来创建一个基于浏览器历史记录的路由模式。routes 属性则指定了之前定义的路由配置数组。
const router = createRouter({
    history: createWebHistory(),
    routes,
});
// 通过 export default 将创建的路由实例暴露出来，以便在其他地方使用。
export default router;