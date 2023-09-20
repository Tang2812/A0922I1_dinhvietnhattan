import {useState} from "react";
export function Count() {
    let [number,setNumber] =useState(0)
    const handleClick=()=>{
        setNumber(prevState => prevState+1)
    }
    return(
        <div>
            Number: {number}
            <div>
                <button onClick={handleClick}>Increase</button>

            </div>
        </div>
    )
}
