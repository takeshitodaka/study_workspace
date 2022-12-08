import { useState , Component} from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

class App extends Component {

  constructor(props){
    super()
    
  }
  

  render(){
    return (
      <div className="App">
        <h1 className="bg-primary  text-white display-4">React</h1>
        <div className='container'>
          <p className='subtitle'>This is sample component.</p>
          <p>これはサンプルのコンポーネントやで</p>
          <p>簡単なメッセージを表示</p>

        </div>
      </div>
    )
  }
}

export default App
