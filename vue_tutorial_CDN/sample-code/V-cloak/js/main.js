console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
        message : 'String Property'
    }),
    methods: {
        clickHandler: function(event){
            this.message = this.message.split('').reverse().join('')
        }
    }
})
app.mount('#app')