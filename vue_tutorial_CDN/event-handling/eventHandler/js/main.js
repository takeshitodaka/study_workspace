const app  = Vue.createApp({
    data: () => ({
        //parameters
        counter : 0
    }),
    methods:{
        // 発火したイベントを引数で受け取る
        clickHandler: function(event){
            this.counter++
            // 中身を見てみる
            console.log(event)
            // イベントを発火した要素を取得
            console.log(event.target)
            // イベントを発火した要素のタグ名を取得
            console.log(event.target.tagName)
            // イベントを発火した要素のタグ内のHTMLを取得
            console.log(event.target.innerHTML)
            // イベントのタイプを取得
            console.log(event.target.type)
            //イベントを発火した要素のidを取得
            console.log(event.target.id)

        }
    }
    

    
})
app.mount('#app')
