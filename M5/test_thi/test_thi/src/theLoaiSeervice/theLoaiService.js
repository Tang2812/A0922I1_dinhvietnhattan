import axios from "axios";

export const findAllTheLoai=async ()=>{
    try{
        const result=await axios.get("http://localhost:8000/theLoaiThuoc");
        return result.data
    }catch (e) {
        console.log(e);
    }
}