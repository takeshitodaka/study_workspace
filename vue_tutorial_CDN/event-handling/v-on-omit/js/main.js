const app  = Vue.createApp({
    data: () => ({
        //parameters
        message : ''
    }),
    methods:{
        // 発火したイベントを引数で受け取る
        clickHandler: function(){
            this.message = new Date().toLocaleTimeString()
            

        }
    }
    

    
})
app.mount('#app')
