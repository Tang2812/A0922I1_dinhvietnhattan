import {useEffect, useState} from "react";
import axios from "axios";
import * as productService from "../product_service/ProductService"
import {NavLink} from "react-router-dom";

export function ShowProductList() {
    const [products, setProducts] = useState([])
    useEffect(() => {
        const callApi = async () => {
            try {
                const result = await productService.findAll();
                setProducts(result);
            } catch (e) {
                console.log(e);
            }
        }
        callApi()
    }, [])
    return (
        <>
            <NavLink to="/"
                     className="btn btn-primary">Product
            </NavLink>
            <NavLink to="/Customer"
                     className="btn btn-danger">Customer
            </NavLink>

            <h1> List Product <span>
            <NavLink to="/Create"
                     className="btn btn-danger">Create
            </NavLink>
           </span></h1>

            <table className="table">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>Quantity</th>
                    <th>Type</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {products.map(product => (
                    <tr key={product.id}>
                        <td>{product.id}</td>
                        <td>{product.name}</td>
                        <td>{product.cost}</td>
                        <td>{product.quantity}</td>
                        <td>{product.type}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    )
}