import {useEffect, useState} from "react";
import axios from "axios";
import {Field, Form, Formik} from "formik";
import {useNavigate} from "react-router-dom"
import * as bookService from "../service/BookService"

export function Create_book() {
    const navigate = useNavigate();
    return (
        <>
            <Formik initialValues={{
                id: "",
                title: "",
                quantity: ""
            }} onSubmit={(values) => {
                const create = async () => {
                    await bookService.save(values)
                    navigate("/")
                }
                create()
            }
            }>
                <div className='container'>
                    <h1>Add a new Book</h1>
                    <Form>
                        <table className='table'>
                            <tr>
                                <td>ID</td>
                                <Field  type='text' name='id'></Field>
                            </tr>
                            <tr>
                                <td>Title</td>
                                <Field  type='text' name='title'></Field>
                            </tr>
                            <tr>
                                <td>Quantity</td>
                                <Field  type='text' name='quantity'></Field>
                            </tr>
                        </table>
                        <button type='submit' className='btn btn-primary'>Add</button>
                    </Form>
                </div>
            </Formik>
        </>
    )
}