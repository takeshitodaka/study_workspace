const app  = Vue.createApp({
    data: () => ({
        //parameters
        counter : 0,
        message : ''
    }),
    methods:{
        // 発火したイベントを引数で受け取る
        clickHandler: function($event, message){
            this.counter++
            this.message = message
            console.log($event)

        }
    }
    

    
})
app.mount('#app')
