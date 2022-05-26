const app  = Vue.createApp({
    data: () => ({
        //parameters
        basePrice: 'String Property',
    }),
    computed: {
        taxIncludedPrice: {
            get: function(){
                return this.basePrice * 1.1
            },
            set: function(value){
                this.basePrice = value / 1.1
            }
        }
    }
})
app.mount('#app')
