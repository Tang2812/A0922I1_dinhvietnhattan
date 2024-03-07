import {useState} from "react";

export function UseIncrement(value) {
    const [count, setCount] = useState(0);
    const increase = () => {
        setCount(prevState => prevState + value);
    }
    return (
        [count, increase]
    )
}