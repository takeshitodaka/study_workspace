console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
        message : 'String Property'
    })
})
app.mount('#app')