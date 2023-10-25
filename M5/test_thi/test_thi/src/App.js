import logo from './logo.svg';
import './App.css';
import React from "react";
import {Route, Routes} from "react-router-dom"

import 'react-toastify/dist/ReactToastify.css'
import {ToastContainer} from "react-toastify";
import {ShowProductList} from "./components/productList";
import {ShowCustomerList} from "./components/customerList";
function App() {
  return (
<>
  <Routes>
    <Route path="/" element={<ShowProductList></ShowProductList>}></Route>
    <Route path="/Customer" element={<ShowCustomerList></ShowCustomerList>}></Route>
  </Routes>
</>
  );
}

export default App;
