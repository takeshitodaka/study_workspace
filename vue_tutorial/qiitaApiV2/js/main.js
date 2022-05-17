const app  = Vue.createApp({
    data: () => ({
        //parameters
        items: null,
        keyword: '',
        message: ''
    }),
    watch : {
        keyword: function(newKeyword, oldKeyword){
            console.log(newKeyword)
            //入力中に待ってるよのメッセージ
            this.message = 'Waiting for you to stop typing...'
            this.debouncedGetAnswer()
        }
    },
    mounted: function(){
        // this.keyword = 'JavaScript'
        // this.getAnswer()
        this.debouncedGetAnswer = _.debounce(this.getAnswer, 1000)

    },
    methods: {
        getAnswer: function(){
            if(this.keyword === ''){
                console.log('karamoji')
                this.items = null
                return
            }
            // 空文字じゃなければローディングメッセージ
            this.message = 'Loading...'
            // ローカル変数に格納
            const vm = this
            // axiosにわたす引数
            const params = {page:1, per_page: 20, query: this.keyword}
            axios.get('https://qiita.com/api/v2/items', {params})
            // レスポンスが帰ってきたときの処理を.thenメソッドに書く引数のresponseが返却値
                .then(function(response){
                    console.log(response)
                    vm.items = response.data
                })
                // 例外処理、引数のerrorにエラー内容が格納されている。
                .catch(function(error){
                    vm.message = 'Error!'+error
                })
                // 最終処理（初期化）
                .finally(function(){
                    vm.message = ''
                })
        }

    }
})
app.mount('#app')
