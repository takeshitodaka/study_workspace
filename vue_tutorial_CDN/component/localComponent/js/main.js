const helloComponent = {
    template: '<p>Hello Component!!</p>'
}

const app  = Vue.createApp({
    data: () => ({
        
    }),
    components:{
        'hello-component': helloComponent
    }
})

app.mount('#app')
