import {useState} from "react";
import {UseIncrement} from "./useIncrment";

export function Couter1(){
    const [count,setCount]=UseIncrement(1);
return(
    <div>
        Count: {count}
        <br/>
        <button onClick={setCount}>Add 1</button>
    </div>
)
}