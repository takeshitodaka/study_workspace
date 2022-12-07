import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

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

export default App
