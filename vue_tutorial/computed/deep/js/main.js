const app  = Vue.createApp({
    data: () => ({
        //parameters
        colors: [
            {name: 'Red'},
            {name: 'Green'},
            {name: 'Blue'}
        ]
    }),
    watch: {
        colors:{
            handler: function(newValue ,oldValue){
                console.log('Updated!')
            },
            // 監視対象の配列の要素ないにあるプロパティまで監視できる！
             deep:true
        }
 
    },
    methods: {
        onClick: function(event){
            this.colors[1].name='white'
        }
    }
})
app.mount('#app')
