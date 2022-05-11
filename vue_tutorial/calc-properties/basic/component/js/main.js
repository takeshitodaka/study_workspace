const app  = Vue.createApp({
    data: () => ({
        //parameters
        //str
        message : 'String Property',
    }),
    computed:{
        reversedMessage: function(){
            return this.message.split('').reverse().join('')  
        }
    }
})
app.mount('#app')
