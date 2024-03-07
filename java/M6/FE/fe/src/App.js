import logo from './logo.svg';
import './App.css';
import {Route, Routes} from "react-router-dom";
import 'react-toastify/dist/ReactToastify.css'
import {ToastContainer} from "react-toastify";
import {ResgiterTopic} from "./components/ResgiterTopic";
import {ResgiterGroupStudent} from "./components/ResgiterGroup";

function App() {
    return (
        <div>

            <Routes>
                <Route path={'/CreateTopic'} element={<ResgiterTopic/>}/>
                <Route path={'/CreateGroup'} element={<ResgiterGroupStudent/>}/>
            </Routes>

            <ToastContainer/>
        </div>
    );
}

export default App;
