import logo from './logo.svg';
import './App.css';
import {Route, Routes} from "react-router-dom"
import {ShowList} from "./components/showList";
import {CreateProduct} from "./components/create";
import {Edit} from "./components/edit";
import 'react-toastify/dist/ReactToastify.css'
import {ToastContainer} from "react-toastify";
function App() {
  return (
<div>
  <Routes>
    <Route path={'/'} element={<ShowList></ShowList>}></Route>
    <Route path={'/Create'} element={<CreateProduct></CreateProduct>}></Route>
    <Route path={'/edit/:id'} element={<Edit></Edit>}></Route>
  </Routes>
  <ToastContainer/>
</div>
  );
}

export default App;
