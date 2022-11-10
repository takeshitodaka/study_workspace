// htmlで定義したid='canvas1'のアイテムを取得

const canvas = document.getElementById('canvas1')
const ctx = canvas.getContext('2d')

// アニメ選択のプルダウン

// デフォルトのアニメーション名
let animationName = "walk"

// 選択肢変更のイベントを拾う
const dropdown = document.getElementById('animations')
dropdown.addEventListener('change', function(e){
    
    animationName=e.target.value
})

// 速度
let staggerFrame=10;
// 選択肢変更のイベントを拾う
const speedChange = document.getElementById('speed')
speedChange.addEventListener('change', function(e){
    console.log(e.target.value)
    staggerFrame=Number(e.target.value)
})


//canvasのサイズ
const CANVAS_WIDTH = canvas.width = 600
const CANVAS_HEIGHT = canvas.height = 600

// アニメーション用画像ファイル
const playerImage = new Image()
// 画像ファイルのソース
playerImage.src='img/anime.png'
// 1キャラ画像の幅・高さ
const spriteWidth = 500
const spriteHeight = 500


// ゲームの速度倍率（小さいほど早い0がMAX)
let gameFrame=0

// アニメーション画像の座標を配列で保持
const spriteAnimations = []
const animationStates = [
    {
        name:'walk',
        frames:5
    },
    {
        name:'run',
        frames:5
    }
]

animationStates.forEach((state, index)=>{
    let frames = {
        loc: [],
    }
    //オリジナル画像上の座標をフレーム数分計算して取得
    for(let j = 0; j < state.frames; j++){
        let positionX = j*spriteWidth
        let positionY = index*spriteHeight

        frames.loc.push({x: positionX, y: positionY})

    }
    spriteAnimations[state.name]= frames
})

function animate(){
    ctx.clearRect(0,0,CANVAS_WIDTH,CANVAS_HEIGHT)
    let position = Math.floor(gameFrame/staggerFrame) % spriteAnimations[animationName].loc.length 
    let frameX = spriteWidth * position
    let frameY =spriteAnimations[animationName].loc[position].y
    ctx.drawImage(playerImage, frameX, frameY, spriteWidth,spriteHeight, 0, 0, spriteWidth, spriteHeight)

    gameFrame++;
    requestAnimationFrame(animate)

}
animate();

