import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Bai1 from "./bai1";
import Bai2 from "./Bai2";
import Bai3 from "./Bai3";

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
<React.StrictMode>

    {/*<Bai1>*/}
    {/*</Bai1>*/}
    {/*<Bai2></Bai2>*/}
    <Bai3></Bai3>
</React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
