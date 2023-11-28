import {useEffect, useState} from "react";
import axios from "axios";
import {Field, Form, Formik} from "formik";
import {useNavigate} from "react-router-dom"
import * as bookService from "../service/BookService"
import {useParams} from "react-router-dom";

export function Update() {
    const navigate = useNavigate()
    const {id} = useParams();
    const [book, setBook] = useState({
        id: '',
        title: '',
        quantity: ''
    })

    async function getBookById() {
        try {
            const value = await bookService.detail(id);
            if (value) {
                setBook(value);
            }
        } catch (e) {
            console.log(e)
        }
    }

    useEffect(() => {
        getBookById()
    }, [])

    return book.title !== "" ? (

        <Formik initialValues={{
            id: book.id,
            title: book.title,
            quantity: book.quantity
        }}
                onSubmit={(values) => {
                    const update = async (book) => {

                        const result = await bookService.update(id, book)

                        navigate('/');

                    }
                    update(values);

                }}>
            <div className='container'>
                <h1>Update Book</h1>
                <Form>
                    <table className='table'>

                        <tr>
                            <td>Title</td>
                            <Field type='text' name='title'/>
                        </tr>
                        <tr>
                            <td>Quantity</td>
                            <Field type='text' name='quantity'/>
                        </tr>
                    </table>
                    <button type='submit' className='btn btn-primary'>Add</button>
                </Form>
            </div>

        </Formik>
    ) : ""
}