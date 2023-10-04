import logo from './logo.svg';
import './App.css';
import {To_do_list} from "./components/to_do_list";
import {ListBook} from "./components/book_management";
import {Routes,Route} from "react-router-dom"
import {Create_book} from "./components/create_book";
import {Update} from "./components/update_book";
function App() {
  return (
    <div className="App">
        <Routes>
            <Route path='/' element={<ListBook/>}> </Route>
            <Route path='/create' element={<Create_book/>}> </Route>
            <Route path='/update/:id' element={<Update/>}> </Route>
        </Routes>

    </div>
  );
}

export default App;
