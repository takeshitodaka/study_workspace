console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
    }),
})

app.component('hello-component',{
    template: '<p>Hello!</p>'
})
app.mount('#app')