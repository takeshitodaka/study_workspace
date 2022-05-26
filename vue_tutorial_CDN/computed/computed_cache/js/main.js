const app  = Vue.createApp({
    data: () => ({
        //parameters
        basePrice: 'String Property',
    }),
    computed: {
        computedNumber: function(){
            console.log('Computed!')
            return Math.random()
        }
    },
    methods: {
        methodsNumber: function(){
            console.log('Methods!')
            return Math.random()
        }
    }
})
app.mount('#app')
