import logo from './logo.svg';
import './App.css';
import React from "react";
const name="Your name";
const fruits=[
  "Apple",
  "Banana",
  "Orange",
  "Apricot",
  "Black rowan"
]
function App() {
  return (
    <div className="App">

        <h1>List of fruits</h1>
        <ul>
          {fruits.map(item =>(
              <li>{item}</li>
          ))}
        </ul>
    </div>
  );
}

export default App;
