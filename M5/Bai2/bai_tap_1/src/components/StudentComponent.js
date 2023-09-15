import {Component} from "react";


export class StudentComponent extends Component {
    constructor() {
        super();
        this.state = {
            students: [
                {
                    id: 1,
                    name: 'Nhat Tan',
                    address: 'GiaLai',
                    age: 20
                },
                {
                    id: 2,
                    name: 'Trung Kien',
                    address: 'Quy Nhon',
                    age: 16
                }
            ]
        }

    }

    render() {
        return (
            <div>
                <table border={1}>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>age</th>
                        <th>address</th>
                    </tr>

                    {this.state.students.map(student => (
                        <tr>
                            <td>{student.id}</td>
                            <td>{student.name}</td>
                            <td>{student.age}</td>
                            <td>{student.address}</td>
                        </tr>
                    ))}
                </table>
            </div>
        )
    }

}