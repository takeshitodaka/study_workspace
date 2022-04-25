alert('hello')
console.log(Vue.version)
const app  = Vue.createApp({
    data: () => ({
        //str
        message : "String Property",
        //int
        count:99,
        //オブジェクト
        user: {
            lastName: 'Todaka',
            firstName: 'Takeshi',
            prefecture: 'Fukuoka'
        },
        //配列
        colors: ['Red', 'Green', 'Blue']

    })
})
app.mount('#app')