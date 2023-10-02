import {useEffect, useState} from "react";
import axios from "axios";
import {Field, Form, Formik} from "formik";
import * as bookService from "../service/BookService"

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
                                <a href="#"><button className='btn btn-danger'>Delete</button></a>
                                <a href="#"><button className='btn btn-primary' >Update</button></a>
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    )
}