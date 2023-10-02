import logo from './logo.svg';
import './App.css';
import {To_do_list} from "./components/to_do_list";
import {ListBook} from "./components/book_management";

function App() {
  return (
    <div className="App">
   {/*<To_do_list></To_do_list>*/}
   <ListBook></ListBook>
    </div>
  );
}

export default App;
