import React from "react";

import {Field, Form, Formik} from "formik";
import {useNavigate} from "react-router-dom"
import * as studentService from "../services/studentService"
import {toast} from "react-toastify";


export function Create() {
    const navigate = useNavigate();
    return (
        <>
            <Formik initialValues={{
                id: "",
                name: "",
                age: 0,
                languages: []
            }
            } onSubmit={(values, {setSubmitting}) => {
                const create = async () => {
                    setSubmitting(false)
                    await studentService.save(values)
                    toast("😺 Create successful!!!")
                    navigate("/")
                }
                create()
            }}>
                <div>
                    <h1>Create New Student</h1>
                    <Form>
                        <div>
                            <label>Id</label>
                            <Field type='text' name='id'/>
                        </div>
                        <div>
                            <label>Name</label>
                            <Field type='text' name='name'/>
                        </div>
                        <div>
                            <label>age</label>
                            <Field type='text' name='age'/>
                        </div>
                        <label>Languages</label>
                        <div>
                            <Field type='checkbox'
                                   name='languages' value='Java'/>
                            <label>Java</label>
                        </div>
                        <div>
                            <Field type='checkbox'
                                   name='languages' value='C++'/>
                            <label>C++</label>
                        </div>
                        <div>
                            <Field type='checkbox'
                                   name='languages' value='Php'/>
                            <label>Php</label>
                        </div>
                        <div>
                            <button type='submit' className='btn btn-primary'>Submit</button>
                        </div>

                    </Form>
                </div>

            </Formik>
        </>
    )
}