import { useState , Component} from 'react'
import reactLogo from './assets/react.svg'
import './App.css'
import Rect from './React'

class App extends Component {
  data=[]
  area={
    width:"500px",
    height:"500px",
    border:"1px solid blue"
    
  }

  constructor(props){
    super(props)
    this.state={
      msg : 'Hello State',
      count:0,
      flg:true,
      list:this.data
    }
    this.title = props.title
    // let timer = setInterval(()=>{
    //   this.setState({
    //     count: this.state.count + 1,
    //     msg:"[count: "+this.state.count + "]"
    //   })
    // },1000)
    this.doAction=this.doAction.bind(this)
  }
  doAction(e){
    let x = e.pageX
    let y = e.pageY
    this.data.push({x:x,y:y})
    this.setState({
      count: this.state.count + 1,
      msg:"[count: "+this.state.count + "]",
      flg: !this.state.flg,
      list:this.data
    })
  }

  draw(d){
    let s = {
      position:"absolute",
      left:(d.x - 25)+"px",
      top:(d.y - 25)+"px",
      width: "50px",
      height: "50px",
      backgroundColor:"#66f3"
    }
    return <div style = {s}></div>
  }
  //     count: this.state.count + 1,
    //     msg:"[count: "+this.state.count + "]"

  render(){
    return (
      <div className="App">
        <h1 className="bg-primary  text-white display-4">React</h1>
        <div className='container'>
          <p className='subtitle'>{this.title}</p>
          <p>{this.message}</p>
          <p className='subtitle'>draw rectangle.</p>
          <Rect x="200" y="200" w="200" h="200" c="#6ff9" r="25" />
          <Rect x="300" y="300" w="200" h="200" c="#f6f9" r="75" />
          <Rect x="400" y="400" w="200" h="200" c="#6669" r="100" />

          <p className='subtitle'>show message</p>
          <p className='alert alert-warning'>{this.state.msg}</p>
          <p className='alert alert-dark'>{this.props.message}</p>

          <p className='alert alert-primary'>show Flag</p>
          {this.state.flg?
            <div className="alert alert-warning text-end">
              <p className="h5">{this.state.msg}</p>
            </div>
            :
            <div className="alert alert-warning text-start">
              <p className="h5">{this.state.msg}です。</p>
            </div>

          }

          <button className="btn btn-primary" onClick={this.doAction}>Click</button>
        </div>
        <p className='subtitle'>draw rectangle.</p>
        <div style={this.area} onClick={this.doAction}></div>
          {this.data.map((value)=>this.draw(value))}
      </div>
    )
  }
}

export default App
