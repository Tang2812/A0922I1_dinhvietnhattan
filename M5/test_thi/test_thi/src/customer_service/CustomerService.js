import axios from "axios";

export const findAll=async ()=>{
    try {
        const result= await axios.get("http://localhost:8000/customer")
        return result.data;
    }catch (e) {
        console.log(e)
    }
}
export const findById=async (id)=>{
    try {
        const result=await axios.get("http://localhost:8000/customer/"+id)
        return result.data;
    }catch (e) {
        console.log(e)
    }
}
export const save=async (customer)=>{
    try{
        const result=await axios.post("http://localhost:8000/customer/"+customer);
        return  result.data;
    }catch (e) {
        console.log(e);
    }
}
export const update=async (id,customer)=>{
    try {
        const result=await axios.put("http://localhost:8000/customer/"+id,customer)
        return result.data
    }catch (e) {
        console.log(e)
    }
}
export const deleteCustomer=async (id)=>{
    try{
        const result=await axios.delete("http://localhost:8000/customer/"+id)
        return result.data
    }catch (e) {
        console.log(e)
    }
}