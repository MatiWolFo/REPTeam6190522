import axios from 'axios';

const baseUrl = "http://localhost:9080/api"

const getAll = async() =>{

    const res = await axios.get(baseUrl + "/usuario/obtener")

    console.log(res.data)
    return res.data
}

const saveUsuario = async(usuario) =>{

    const res = await axios.post (baseUrl + "/guardar/usuario", usuario)
    return res.data;
}

export {getAll,saveUsuario}