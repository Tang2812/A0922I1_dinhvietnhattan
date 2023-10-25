import axios from "axios";

export const findAll = async () => {
    try {
        const result = await axios.get("http://localhost:8080/students")
        return result.data;
    } catch (e) {
        console.log(e)
    }

}
export const findById = async (id) => {
    try {
        const result = await axios.get("http://localhost:8080/students/" + id)
        return result.data;
    } catch (e) {
        console.log(e)
    }
}
export const save = async (student) => {
    try {
        const result = await axios.post("http://localhost:8080/students/", student);
        return result.data;
    } catch (e) {
        console.log(e)
    }

}
export const updateStudent = async (id, student) => {
    try {
        const result = await axios.put("http://localhost:8080/students/" + id, student)
        return result.data;
    } catch (e) {
        console.log(e)
    }
}
export const deleteStudent = async (id) => {
    try {
        const result = await axios.delete("http://localhost:8080/students/" + id)
        return result.data;
    } catch (e) {
        console.log(e)
    }
}

export const find = async(name, age)=>
{

    try {
        if (name ==="") {
            const result = await axios.get("http://localhost:8080/students?age="+ age)
            return result.data;
        }else{
        if(age ===""){
            const   result=await axios.get("http://localhost:8080/students?name_like="+name)
            return result.data;
        }else{
            const result=await axios.get("http://localhost:8080/students?name_like="+name+"&age="+age)
            return result.data;
        }
        }

    }catch (e) {
        console.log(e)
    }

    }