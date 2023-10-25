import {useEffect, useState} from "react";
import * as productService from "../Product_service/productService"
import * as categoryService from "../Category_service/categoryService"
import {NavLink} from "react-router-dom";
import {toast} from "react-toastify";
import {useNavigate} from "react-router-dom"
export function ShowList() {
    const navigate=useNavigate()
    const [search,setSearch]=useState("")
    const [productsSearch,setProductsSearch]= useState([])
    const [products, setProducts] = useState([]);
    const [categories, setCategories] = useState([]);
    useEffect(() => {
        const fetchApi = async () => {
            const products = await productService.findAll();
            setProducts(products);
            const categories = await categoryService.findAllCategory();
            setCategories(categories);
        }

        fetchApi();
    }, [])
    //=========================DELETE========================================================
    const deleteProduct = async (id) => {
        const result = await productService.deleteProduct(id);
        toast("🐈Delete success!!!!")
        navigate("/")

    }
    //==========================Search===================================
    useEffect(()=>{
        const searchAll=()=>{
            const result=products.filter((product)=>
                product.name.toLowerCase().includes(search.toLowerCase()) || product.quantity.includes(search)
            );
            setProductsSearch(result);
        }
        searchAll();
    },[search,products])
    return (
        <>

            <h1>Product List
                <span> <NavLink to="/Create" className="btn btn-primary">Create</NavLink></span>
            </h1>
            <form>
                <input type="text" placeholder="Search" value={search}
                onChange={(e)=>{setSearch(e.target.value)}}/>
            </form>
            <table className="table">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Category</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {productsSearch.map(product => (
                    <tr key={product.id}>
                        <td>{product.id}</td>
                        <td>{product.name}</td>
                        <td>{product.quantity}</td>
                        <td>{
                            categories.find(category => String(category.id) === String(product.category))?.nameCategory
                        }</td>
                        <td>{product.status}</td>
                        <td>
                            <NavLink to={`/edit/${product.id}`} className="btn btn-primary"> Edit</NavLink>
                            <button onClick={fn => deleteProduct(product.id)} className='btn btn-danger'>Delete</button>
                        </td>
                    </tr>

                ))}
                </tbody>
            </table>
        </>
    )

}