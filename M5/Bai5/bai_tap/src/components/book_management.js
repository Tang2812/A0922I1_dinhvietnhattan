import {useEffect, useState} from "react";
import axios from "axios";
import {Field, Form, Formik} from "formik";
import * as bookService from "../service/BookService"
import {NavLink} from "react-router-dom";

export function ListBook() {
    const [bookList, setBookList] = useState([])
    useEffect(() => {
        const fetchApi = async () => {
            const result = await bookService.findAll()
            setBookList(result)
        }
        fetchApi();
    }, []);
    return (
        <>
            <h1>Library</h1>
<NavLink to='/create' className='btn btn-primary'>Create</NavLink>
            <table className='table'>
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Quantity</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {
                    bookList.map((book) => (
                        <tr key={book.id}>
                            <td>{book.title}</td>
                            <td>{book.quantity}</td>
                            <td>
                                <NavLink to={`/update/${book.id}`} className="btn btn-primary">Edit</NavLink>
                                <NavLink to={`/delete/${book.id}`} className='btn btn-danger'>Delete</NavLink>
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    )
}