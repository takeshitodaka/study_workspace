console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
        message : 'String <span style="color:red">Property</span>'
    }),
    methods: {
        clickHandler: function(event){
            this.message = this.message.split('').reverse().join('')
        }
    }
})
app.mount('#app')