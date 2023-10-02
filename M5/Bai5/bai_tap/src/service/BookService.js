import axios from "axios";

export const findAll = async () => {
    try {
        const result = await axios.get("http://localhost:8000/book")
        return result.data;
    } catch (e) {
        console.log(e);
    }
}
export const save= async (book)=>{
    try {
        const result = await axios.post("http://localhost:8000/book",book)
        return result.data;
    }catch (e) {
        console.log(e);
    }
}
export const detail= async (id)=>{
    try {
        const result = await axios.get("http://localhost:8000/book/"+id)
        return result.data;
    } catch (e) {
        console.log(e);
    }
}
export const update= async (id,book)=>{
    try {
        const result = await axios.put("http://localhost:8000/book/"+id,book)
        return result.data;
    } catch (e) {
        console.log(e);
    }
}
export const Delete= async (id)=>{
    try {
        const result = await axios.delete("http://localhost:8000/book/"+id)
        return result.data;
    } catch (e) {
        console.log(e);
    }
}