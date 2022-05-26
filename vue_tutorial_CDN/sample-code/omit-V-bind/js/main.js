console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
       url: 'https://www.google.com'

    })
})
app.mount('#app')