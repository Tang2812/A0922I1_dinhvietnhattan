import {useEffect, useState} from "react";

export function Count() {
    const [tmp1, setTmp1] = useState(0);
    const [tmp2, setTmp2] = useState(0);
    const [number1, setNumber1] = useState(0);
    const [number2, setNumber2] = useState(0);
    const count1 = () => {
        setTmp1(prevState => prevState + 1);
    }
    const count2 = () => {
        setTmp2(prevState => prevState + 2);
    }
    useEffect(() => {
        setNumber1(tmp1);
        setNumber2(tmp2);
    }, [tmp1, tmp2])
    return (
        <div>
            Count: {number1}
            <br/>
            <button onClick={count1}>Add 1</button>
            <br/>
            Count: {number2}
            <br/>
            <button onClick={count2}>Add 2</button>
        </div>
    )
}