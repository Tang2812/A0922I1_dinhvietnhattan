import {useEffect, useState} from "react";
import * as customerService from "../customer_service/CustomerService"
import {NavLink} from "react-router-dom";

export function ShowCustomerList() {
    const [customers, setCustomers] = useState([])
    useEffect(() => {
        const callApi = async () => {
            try {
                const result = await customerService.findAll();
                setCustomers(result);
            } catch (e) {
                console.log(e);
            }
        }
        callApi()
    }, [[]])
    return (
        <>

            <NavLink to="/"
                     className="btn btn-primary">Product
            </NavLink>
            <NavLink to="/Customer"
                     className="btn btn-danger">Customer
            </NavLink>
            <h1> List Customer</h1>
            <table className="table">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                {customers.map(customer=>(
                    <tr key={customer.id}>
                        <td>{customer.id}</td>
                        <td>{customer.name}</td>
                        <td>{customer.status!==1?"da mua hang":"da  tra hang"}</td>
                    </tr>
                ))}
                </thead>
            </table>
        </>
    )
}