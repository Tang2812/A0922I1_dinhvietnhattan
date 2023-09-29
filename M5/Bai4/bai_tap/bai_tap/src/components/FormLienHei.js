import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from 'yup'
export function FormLienHe() {
    return (
        <>
            <Formik initialValues={{
                name: "",
                email: "",
                numberPhone: "",
                message: ""

            }} onSubmit={() => {
                alert("Tao Form Lien He Thanh Cong!!!")
            }}
            validationSchema={Yup.object({
                name:Yup.string()
                    .required('Bat buoc nhap'),
                email:Yup.string()
                        .required('Bat buoc nhap')
                    .matches(/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,'nhap dinh dang email'),
                numberPhone:Yup.string()
                    .required('Bat buoc nhap'),

            })}
            >
                <div className='container'>
                    <h1>Tao Form Lien He</h1>
                    <Form>
                        <table className='table'>


                        <div className='mb-3'>
                            <label className='form-label' htmlFor='name'>Name</label>
                            <Field classname='form-control' type='text' id='name' name='name'/>
                            <ErrorMessage name='name' component='span'/>
                        </div>
                        <div className='mb-3'>
                            <label className='form-label'  htmlFor='email'>Email</label>
                            <Field classname='form-control' type='text' id='email' name='email'/>
                            <ErrorMessage name='email' component='span'/>
                        </div>
                        <div className='mb-3'>
                            <label className='form-label'  htmlFor='numberPhone'>Phone Number</label>
                            <Field classname='form-control' type='text' id='numberPhone' name='numberPhone'/>
                            <ErrorMessage name='numberPhone' component='numberPhone'/>
                        </div>
                        <div className='mb-3' >
                            <label className='form-label'  htmlFor='message'>Message</label>
                            <Field classname='form-control' type='text' id='message' name='message'/>
                            <ErrorMessage name='message' component='message'/>
                        </div>
                        <button className='btn btn-primary' type='submit'>Submit</button>
                        </table>
                    </Form>
                </div>
            </Formik>
        </>
    )
}
