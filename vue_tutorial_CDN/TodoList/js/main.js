console.log("this app created with Vue.js version " + Vue.version)
const app  = Vue.createApp({
    data: () => ({
        // テキストボックスのデータバインド
        newItemName: '',
        // リスト格納用の配列
        todoItems:[]

    }),
    methods:{
        // Addボタンクリック時の実行メソッド
        addItem: function(event){
            // console.log('Clicked!')
            if(this.newItemName === '') return;
            let todoItem = {
                // アイテム名用の変数
                itemName: this.newItemName,
                // ステータス管理のフラグ
                isDone: false
            }
            this.todoItems.push(todoItem)
            this.newItemName = ''
        },
        deleteItem: function(index){　
            // console.log('Delete!')
            // console.log(index)
            // 配列クラス(Array)のspliceメソッドでアイテムを削除
            this.todoItems.splice(index,1)
        }
    }
})
app.mount('#app')