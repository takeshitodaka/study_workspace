const app  = Vue.createApp({
    data: () => ({
        //parameters
        message : ''
    }),
    methods:{
        clickHandler: function(arg){
            console.log(arg)
            this.message = arg
        }
    }
    

    
})
app.mount('#app')
