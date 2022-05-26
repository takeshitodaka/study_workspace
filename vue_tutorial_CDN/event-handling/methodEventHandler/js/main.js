const app  = Vue.createApp({
    data: () => ({
        //parameters
        counter : 0
    }),
    methods:{
        clickHandler: function(){
            this.counter++
        }
    }
    

    
})
app.mount('#app')
