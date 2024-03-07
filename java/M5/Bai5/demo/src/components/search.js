import {useEffect, useState} from "react";
import {useSearchParams} from "react-router-dom";
import * as studentService from "../services/studentService";
import {NavLink} from "react-router-dom";
import {useNavigate} from "react-router-dom";
import {toast} from "react-toastify";

export function Search() {
    const [searchParams, setSearchParams] = useSearchParams();

    const name = searchParams.get('name');
    const age = searchParams.get('age');

    const [students, setStudent] = useState([])
    const navigate = useNavigate()
    useEffect(() => {
        const callApi = async () => {
            const result = await studentService.find(name,age);
            setStudent(result)
        }
        callApi()
    }, [students])
    const deleteStudent = async (id) => {
        const result = await studentService.deleteStudent(id);
        toast("🐈Delete success!!!!")
        navigate("/")
    }

    return (
        <>
            <h1>List Student
                <span> <NavLink to='/create' className='btn btn-primary'>Create a new student</NavLink></span>
            </h1>
            <form action="/search" method="get">
                <input type="text" name="name" placeholder="Student name"/>
                <input type="text" name="age" placeholder="Age"/>
                <button type="submit" className='btn btn-primary'>Search</button>
            </form>
            <table className="table">
                <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>age</th>
                    <th>Languages</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {students.map(student => (
                    <tr>
                        <td>{student.id}</td>
                        <td>{student.name}</td>
                        <td>{student.age}</td>
                        <td>{student.languages.map(lan => (
                            <span key={lan}>{lan + " "}</span>
                        ))}</td>

                        <td>
                            <NavLink to={`/edit/${student.id}`} className='btn btn-primary'>Edit</NavLink>
                            <button onClick={fn => deleteStudent(student.id)} className='btn btn-danger'>Delete</button>

                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    )
}