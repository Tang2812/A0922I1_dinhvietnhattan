import {Field, Form, Formik} from "formik";
import {useNavigate} from "react-router-dom"
export function CreateProduct() {
const nagivate=useNavigate();
return(
<>
<Formik initialValues={{
    id:0,
    name:'',
    cost:0,
    quantity:0,
    type:'',
}}
        onSubmit={}>

</Formik>
</>
)
}