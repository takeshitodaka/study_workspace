const app  = Vue.createApp({
    data: () => ({
        //parameters
        largeClass:{
            'large': true,
            'bg-gray':true
        },
        dangerClass:{
            'text-danger': true
        },
        isLarge: true
    })
        
})
app.mount('#app')
