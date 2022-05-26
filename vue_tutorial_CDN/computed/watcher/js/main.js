const app  = Vue.createApp({
    data: () => ({
        //parameters
        message: 'String Property'
    }),
    watch : {
        message: function(newValue,oldValue){
            console.log('new:%s, old:%s', newValue,oldValue)
        }
    }
})
app.mount('#app')
