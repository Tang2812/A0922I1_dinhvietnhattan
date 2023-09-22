import {useEffect, useState} from "react";

export function Car() {
    const [car, setCar] = useState({name: "none", color: "none"});
    const chonMau = (value) => {
        setCar({...car, color: value});

    }
    const chonTen = (value) => {
        setCar({...car, name: value});
    }
    return (
        <div>
            <table>
                <tr>
                    <td>Select a Car</td>
                    <td><select onChange={e => {
                        chonTen(e.target.value)
                    }}>
                        <option value="random"></option>
                        <option>Toyota</option>
                        <option>Mercedes-Benz</option>
                        <option>BMW</option>
                        <option>Honda</option>
                    </select>
                    </td>
                </tr>

                <tr>
                    <td>Select color</td>
                    <td>
                        <select onChange={e => {
                            chonMau(e.target.value)
                        }}>
                            <option value="random"></option>
                            <option value="Back">Black</option>
                            <option value="Red">Red</option>
                            <option value="Gray">Gray</option>
                            <option value="Brown">Brown</option>
                        </select>

                    </td>
                </tr>
                <tr>
                    <td> You selected a</td>
                    <td>{car.name} – {car.color}</td>
                </tr>
            </table>
        </div>
    )
}