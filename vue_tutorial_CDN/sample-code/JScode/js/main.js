console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
        message : 'String Property',
        number : 100,
        OK: true

    })
})
app.mount('#app')