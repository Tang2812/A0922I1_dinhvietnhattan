import './App.css';
import React from "react";
import {Route, Routes} from "react-router-dom"
import {ShowList} from "./components/studentList";
import {Create} from "./components/create";
import {Search} from "./components/search";
import {EditStudent} from "./components/editStudent";
import 'react-toastify/dist/ReactToastify.css'
import {ToastContainer} from "react-toastify";


function App() {
    return (
        <div>
            <Routes>
                <Route path={'/'} element={<ShowList> </ShowList>}> </Route>
                <Route path={'/create'} element={<Create> </Create>}> </Route>
                <Route path={'/edit/:id'} element={<EditStudent> </EditStudent>}> </Route>
                <Route path={'/search'} element={<Search></Search>}></Route>
            </Routes>
            <ToastContainer/>
        </div>
    )
}

export default App;
