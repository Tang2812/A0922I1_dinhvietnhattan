import {UseIncrement} from "./useIncrment";

export function Counter2() {
    const [count,setCount]=UseIncrement(2);
    return(
        <div>
            Count: {count}
            <br/>
            <button onClick={setCount}>Add 2</button>
        </div>
    )
}
