import axios from 'axios';

const baseUrl = "http://localhost:8080/api"

const saveAuto = async(auto) =>{

    const res = await axios.post (baseUrl + "/guardar/auto", auto)
    return res.data;
}

export default {saveAuto}