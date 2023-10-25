import React, {useEffect, useState} from "react";
import {useParams} from "react-router-dom";
import {useNavigate} from "react-router-dom"

import {Field, Form, Formik} from "formik";
import {toast} from "react-toastify";
import * as studentService from "../services/studentService"
export function EditStudent() {
    const navigate = useNavigate();
    const {id} = useParams();

    const [student, setStudent] = useState({
        id: "",
        name: '',
        age: 0,
        languages: []
    })
    useEffect(() => {
        const findById = async () => {
            try {
                const result = await studentService.findById(id);
                    setStudent(result);

            } catch (e) {
                console.log(e)
            }
        }
        findById();
    }, [])
    return student.name !== "" ? (
        <Formik initialValues={{
            id: student.id,
            name: student.name,
            age: student.age,
            languages: student.languages
        }} onSubmit={(studentEditted) => {
            const update = async () => {
                try {
                    const result = await studentService.updateStudent(id, studentEditted);
                    toast(`🦁 Edit student ${student.name} successful!!!`)
                    navigate("/");
                } catch (e) {
                    console.log(e)
                }
            }
            update();
        }}>
            <div className='container'>
                <h1>Update Student</h1>
                <Form>
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
                    <button type='submit' className='btn btn-primary'>Submit</button>
                </Form>
            </div>

        </Formik>
    ) : ""
}