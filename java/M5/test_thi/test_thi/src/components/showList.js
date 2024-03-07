import {useEffect, useState} from "react";
import * as productService from "../productService/productService"
import * as theLoaiService from "../theLoaiSeervice/theLoaiService"
import {NavLink} from "react-router-dom";
import {toast} from "react-toastify";
import {useNavigate} from "react-router-dom"

export function ShowList() {
    const navigate = useNavigate()
    const [search, setSearch] = useState("")
    const [search2, setSearch2] = useState(0)
    const [productsSearch, setProductsSearch] = useState([])
    const [products, setProducts] = useState([]);
    const [theLoais, setTheLoais] = useState([]);
    useEffect(() => {
        const fetchApi = async () => {
            const products = await productService.findAll();
            setProducts(products);
            const theLoai = await theLoaiService.findAllTheLoai();
            setTheLoais(theLoai);
        }
        fetchApi();
    }, [])
    useEffect(() => {
        const searchAll = () => {
            const result = products.filter((product) =>
                product.ten.toLowerCase().includes(search.toLowerCase())).sort((a, b) => a.ten.localeCompare(b.ten));
            setProductsSearch(result);
        }
        searchAll();
    }, [search, products])

    return productsSearch !== [] ? (
        <>
            <h1>Product List
                <span> <NavLink to="/Create" className="btn btn-primary">Create</NavLink></span>
            </h1>
            <form>
                <input type="text" placeholder="Search" value={search}
                       onChange={(e) => {
                           setSearch(e.target.value)
                       }}/>

            </form>

            <table className="table">
                <thead>
                <tr>
                    <th>Ma San Pham</th>
                    <th>Ten san pham</th>
                    <th>The loai</th>
                    <th>So luong</th>
                    <th>Gia</th>
                    <th>Ngay nhap</th>
                </tr>
                </thead>
                <tbody>
                {productsSearch.sort().map((product => (
                    <tr key={product.id}>
                        <td>{product.id}</td>
                        <td>{product.ten}</td>
                        <td>
                            {theLoais.find(theLoai => String(theLoai.id) === String(product.theLoai))?.ten}
                        </td>
                        <td>{product.soLuong}</td>
                        <td>{product.gia}</td>
                        <td>{product.ngayNhap}</td>
                    </tr>
                )))}
                </tbody>
            </table>
        </>

    ) : ""
}