import {useNavigate} from "react-router-dom"
import {ErrorMessage,Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";
import * as Yup from "yup"
import {NavLink} from "react-router-dom";
import {toast} from "react-toastify";
import * as productService from "../productService/productService"
import * as theLoaiService from "../theLoaiSeervice/theLoaiService"
export function CreateProduct() {
    const nagivate = useNavigate();
    const [theLoais, setTheLoais] = useState([])
    useEffect(() => {
        findAll();
    }, []);
    const findAll = async () => {
        const result = await theLoaiService.findAllTheLoai();
        setTheLoais(result)
    }
    return (
        <>
            <Formik initialValues={{
                id: "",
                ten: "",
                theLoai: 1,
                soLuong: 0,
                gia: "",
                ngayNhap: "",
                moTa: ""
            }
            }
                    validationSchema={Yup.object({
                        id:Yup.number().required("khong duoc bo trong!!!"),
                        ten:Yup.string().required("khong duoc bo trong"),
                        soLuong:Yup.number().required("khong duoc bo trong!!").min(1,"phai lon hon 0"),
                        gia:Yup.string().required("khong duoc bo trong!!"),
                        ngayNhap:Yup.string().required("khong duoc bo trong!!"),
                        moTa:Yup.string().required("khong duoc bo trong!!"),
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
                        <table className="table" border={4}>
                        <tr>
                            <td>
                                <label>Id</label>
                            </td>
                         <td>
                             <Field type="text" name="id" id="id"/>
                         </td>
                             <td>
                             <ErrorMessage name="id" component="span" className="text-danger"/>
                         </td>

                        </tr>
                        <tr>
                            <td>
                            <label>Ten Thuoc</label>
                            </td>
                            <td>
                            <Field type="text" name="ten" id="ten"/>
                            </td>
                            <td>
                            <ErrorMessage name="ten" component="span" className="text-danger"/>
                            </td>

                        </tr>
                        <tr>
                            <td>
                            <label>The Loai</label>
                            </td>
                            <td>
                            <Field name="theLoai" as="select">
                                {theLoais.map((theLoai) => (
                                    <option value={(theLoai.id)}>{theLoai.ten}</option>
                                ))}
                            </Field>
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                            <label>So Luong</label>
                            </td>
                            <td>
                            <Field type="number" name="soLuong" id="soLuong"/>
                            </td>
                            <td>
                            <ErrorMessage name="soLuong" component="span" className="text-danger"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <label>Gia</label>
                            </td>
                            <td>
                            <Field type="text" name="gia" id="gia"/>
                            </td>
                            <td>
                            <ErrorMessage name="gia" component="span" className="text-danger"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <label>Ngay nhap</label>
                            </td>
                            <td>
                            <Field type="text" name="ngayNhap" id="ngayNhap"/>
                            </td>
                            <td>
                            <ErrorMessage name="ngayNhap" component="span" className="text-danger"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <label>Mo ta</label>
                            </td>
                            <td>
                            <Field type="text" name="moTa" id="moTa"/>
                            </td>
                            <td>
                            <ErrorMessage name="moTa" component="span" className="text-danger"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <NavLink to={"/"} className="btn btn-primary">Huy</NavLink>
                                <button type='submit' className='btn btn-danger'>Submit</button>
                            </td>
                            <td>

                            </td>
                        </tr>

                        </table>
                    </Form>
                </div>

            </Formik>
        </>
    )
}