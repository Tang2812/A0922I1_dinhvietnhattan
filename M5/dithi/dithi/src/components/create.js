    import {useNavigate} from "react-router-dom"
    import {ErrorMessage,Field, Form, Formik} from "formik";
    import {useEffect, useState} from "react";

    import * as Yup from "yup"
    import {toast} from "react-toastify";
    import * as productService from "../Product_service/productService"
    import * as categoryService from "../Category_service/categoryService"
    export function CreateProduct() {
        const nagivate = useNavigate();
        const [categories, setCategories] = useState([])
        useEffect(() => {
            findAll();
        }, []);
        const findAll = async () => {
            const result = await categoryService.findAllCategory();
            setCategories(result)
        }
        return (
            <>
                <Formik initialValues={{
                    id: 0,
                    name: "",
                    quantity: "",
                    category: 1,
                    status: ""
                }
                }
                        validationSchema={Yup.object({
                            name:Yup.string().required("khong duoc bo trong!!!")
                        })}
                        onSubmit={(values, {setSubmitting}) => {
                            const create = async () => {
                                console.log(values)
                                setSubmitting(false)
                                await productService.createProduct(values);

                            }
                            toast("😺 Create successful!!!")
                            nagivate("/")
                            create();
                        }}>
                    <div>
                        <h1>Create new product</h1>
                        <Form className="form">
                            <div>
                                <label>Id</label>
                                <Field type="text" name="id"/>
                            </div>
                            <div>
                                <label>Name</label>
                                <Field type="text" name="name" id="name"/>
                                <ErrorMessage name="name" component="span" className="text-danger"/>

                            </div>
                            <div>
                                <label>Quantity</label>
                                <Field type="text" name="quantity"/>
                            </div>
                            <div>
                                <label>Category</label>
                                <Field name="category" as="select">
                                    {categories.map((category) => (
                                        <option value={(category.id)}>{category.nameCategory}</option>
                                    ))}
                                </Field>
                            </div>
                            <div>
                                <label>Status</label>
                                <Field type="text" name="status"/>
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