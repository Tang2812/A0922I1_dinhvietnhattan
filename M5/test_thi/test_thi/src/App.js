import logo from './logo.svg';
import './App.css';
import React from "react";
import {Route, Routes} from "react-router-dom"

import 'react-toastify/dist/ReactToastify.css'
import {ToastContainer} from "react-toastify";
import {ShowList} from "./components/showList";
import {CreateProduct} from "./components/create";


function App() {
  return (
<>
<Routes>
<Route path="/" element={<ShowList></ShowList>}></Route>
<Route path="/Create" element={<CreateProduct></CreateProduct>}></Route>
</Routes>
  <ToastContainer/>
</>
  );
}

export default App;
