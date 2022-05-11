console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
        message : "String Property",
        //int
        count:99,
        //object
        user: {
            lastName: 'Todaka',
            firstName: 'Takeshi',
            prefecture: 'Fukuoka'
        },
        //argument
        colors: ['Red', 'Green', 'Blue'],
        //boolean
        toggle: false

    })
})
app.mount('#app')