import {ErrorMessage,Form ,Field, Formik} from "formik";
import * as Yup from 'yup'
export function ToKhaiYTe() {
    return (<>
        <Formik initialValues={{
            name: "",
            cmnd: "",
            namSinh: undefined,
            gioiTinh: "",
            quocTich: "",
            company: "",
            boPhanLamViec: "",
            baoHiemYTe: '1',
            tinh: "",
            huyen: "",
            xa: "",
            soNha: '',
            dienThoai: "",
            email: "",
            trieuChung: [],
            tiepXuc: [],
        }}
                validationSchema={Yup.object({
                    name: Yup.string()
                        .required("Required"),
                    cmnd: Yup.string()
                        .required("Required"),
                    namSinh: Yup.number()
                        .required("Required")
                        .min(1990,"nhap nam sinh lon hon 1990"),
                    quocTich:Yup.string()
                        .required("Required"),



                    tinh: Yup.string()
                        .required("Required"),
                    huyen: Yup.string()
                        .required("Required"),
                    xa: Yup.string()
                        .required("Required"),
                    soNha: Yup.number()
                        .required("Required"),
                    dienThoai: Yup.string()
                        .required("Required"),
                    email:Yup.string()
                        .required("Required")
                        .matches(/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,'nhap dinh dang email'),

                })}
                onSubmit={() => {
                    alert("Tao Form khai bao thanh cong!!!")
                    console.log("da tao thanh cong")
                }}>
            {/*/////////////////////////////////////////////////////////*/}
            <div className='container'>
                <h1>To Khai y te</h1>
                <Form>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='name'>Ho ten</label><br/>
                        <Field className='form-control' type='text' id='name' name='name'/>
                        <ErrorMessage name='name' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='cmnd'>So CMND</label><br/>
                        <Field className='form-control' type='text' id='cmnd' name='cmnd'/>
                        <ErrorMessage name='cmnd' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='namSinh'>Nam sinh</label><br/>
                        <Field className='form-control' type='text' id='namSinh' name='namSinh'/>
                        <ErrorMessage name='namSinh' component='span'/>
                    </div>
                    <label className='form-label' htmlFor='gioiTinh'>Gioi Tinh</label><br/>
                    <div className='form-check'>
                        <div className='form-check form-check-inline'>
                            <Field className='form-check-input' type='radio' id='gt1'
                                   value="nam"
                                   name='gioiTinh'
                            ></Field>
                            <label className='form-check-label' htmlFor="gt1">Nam</label>
                        </div>
                        <div className='form-check form-check-inline'>
                            <Field className='form-check-input' type='radio' id='gt2'
                                   value="nu"
                                   name='gioiTinh'
                            ></Field>
                            <label className='form-check-label' htmlFor="gt2">Nu</label>
                        </div>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='quocTich'>Quoc Tich</label><br/>
                        <Field className='form-control' type='text' id='quocTich' name='quocTich'/>
                        <ErrorMessage name='quocTich' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='company'>Cong ty lam viec</label><br/>
                        <Field className='form-control' type='text' id='company' name='company'/>
                        <ErrorMessage name='company' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className="form-label">Co the bao hiem y te</label>
                        <Field className="form-check-input" type="checkbox" id="yes"
                               name='baoHiemYTe'
                               value='1'
                        ></Field>
                    </div>
                    <h1>Dia chi lien lac tai Viet Nam</h1>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='tinh'>Tinh thanh</label><br/>
                        <Field className='form-control' type='text' id='tinh' name='tinh'/>
                        <ErrorMessage name='tinh' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='huyen'>Quan/huyen</label><br/>
                        <Field className='form-control' type='text' id='huyen' name='huyen'/>
                        <ErrorMessage name='huyen' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='xa'>Phuong/xa</label><br/>
                        <Field className='form-control' type='text' id='xa' name='xa'/>
                        <ErrorMessage name='xa' component='span'/>
                    </div>

                    <div className='mb-3'>
                        <label className='form-label' htmlFor='soNha'>So nha</label><br/>
                        <Field className='form-control' type='text' id='soNha' name='soNha'/>
                        <ErrorMessage name='soNha' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='dienThoai'>Dien thoai</label><br/>
                        <Field className='form-control' type='text' id='dienThoai' name='dienThoai'/>
                        <ErrorMessage name='dienThoai' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className='form-label' htmlFor='email'>Email</label><br/>
                        <Field className='form-control' type='text' id='email' name='email'/>
                        <ErrorMessage name='email' component='span'/>
                    </div>
                    <div className='mb-3'>
                        <label className="form-label">Trong vong 14 ngay qua, anh/chi co xuar hien dau hieu nao sau day
                            khong </label>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tc1"
                                   name='trieuChung'
                                   value='sot'
                            ></Field>
                            <label className="form-label" htmlFor='tc1'>Sot</label>
                        </div>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tc2"
                                   name='trieuChung'
                                   value='ho'
                            ></Field>
                            <label className="form-label" htmlFor='tc2'>Ho</label>
                        </div>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tc3"
                                   name='trieuChung'
                                   value='kho tho'
                            ></Field>
                            <label className="form-label" htmlFor='tc3'>Kho tho</label>
                        </div>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tc4"
                                   name='trieuChung'
                                   value='viem phoi'
                            ></Field>
                            <label className="form-label" htmlFor='tc4'>Viem phoi</label>
                        </div>
                    </div>
                    <div className='mb-3'>
                        <label className="form-label">Trong vong 14 ngay qua, anh/chi co tiep xuc voi? </label>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tx1"
                                   name='tiepXuc'
                                   value='nguoi benh'
                            ></Field>
                            <label className="form-label" htmlFor='tx1'>Nguoi co benh covid 19</label>
                        </div>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tx2"
                                   name='tiepXuc'
                                   value='quoc gia co benh'
                            ></Field>
                            <label className="form-label" htmlFor='tx2'>Nguoi tu quoc gia co benh covid 19</label>
                        </div>
                        <div>
                            <Field className="form-check-input" type="checkbox" id="tx3"
                                   name='tiepXuc'
                                   value='nguoi co bieu hien'
                            ></Field>
                            <label className="form-label" htmlFor='tx3'>Nguoi co bieu hien covid 19</label>
                        </div>
                    </div>
                    <button type='submit' className='btn btn-primary'>Submit</button>
                </Form>
            </div>
        </Formik>
    </>)
}