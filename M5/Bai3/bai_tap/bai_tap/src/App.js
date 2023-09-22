import logo from './logo.svg';
import './App.css';
import {Count} from "./components/count";
import {Car} from "./components/car";
import {Couter1} from "./components/Couter1";
import {Counter2} from "./components/Couter2";

function App() {
  return (
    <div className="App">
        {/*<Counter1></Counter1>*/}
        <Couter1></Couter1>
        <Counter2></Counter2>
    {/*<Car></Car>*/}
    </div>

  );
}

export default App;
