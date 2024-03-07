import {useEffect, useState} from "react";
import * as studentService from "../services/studentService"
import {NavLink} from "react-router-dom";
import {useNavigate} from "react-router-dom"
import {toast} from "react-toastify";

export function ShowList() {
    const [students, setStudent] = useState([])
    const [search, setSearch] = useState("");
    const navigate = useNavigate()
    useEffect(() => {
        const callApi = async () => {

                if (search === "") {
                const result = await studentService.findAll();
                setStudent(result)
            } else {
                const result = students.filter((student) =>
                    student.name.toLowerCase().includes(search.toLowerCase()) || student.age.includes(search)
            )
                setStudent(result)
                ;
            }


        }
        callApi()
    },[search,students])
    const deleteStudent = async (id) => {
        const result = await studentService.deleteStudent(id);
        toast("🐈Delete success!!!!")
        navigate("/")
    }

    function handleSearch() {

    }

    return (
        <>
            <h1>List Student
                <span> <NavLink to='/create' className='btn btn-primary'>Create a new student</NavLink></span>
            </h1>
            <input type="text" name="name" placeholder="Student name or age" value={search}
                   onChange={(e) => setSearch(e.target.value)}/>


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