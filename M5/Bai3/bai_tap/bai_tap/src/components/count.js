import {useEffect, useState} from "react";

export function Count() {
    const [tmp1, setTmp1] = useState(0);
    const [tmp2, setTmp2] = useState(0);
    const [number1, setNumber1] = useState(0);
    const count =(value)  => {
        setNumber1(value);
    }

    useEffect(() => {
        if(number1===1) {
            setTmp1(prevState => prevState + 1);
        }
        if(number1===2) {
            setTmp2(prevState => prevState + 2);
        }
    },[number1])
    return (
        <div>
            Count: {tmp1}
            <br/>
            <button onClick={e=>{count(1)}}>Add 1</button>
            <br/>
            Count: {tmp2}
            <br/>
            <button  onClick={e=>{count(1)}}>Add 2</button>
        </div>
    )
}