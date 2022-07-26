import axios from 'axios';
const baseUrl = "http://localhost:9080/api"

const getJuegoById = async(id)=>{
    const res = await axios.get(baseUrl + "/obtener/juegoById?idJuego="+id);
    //await axios.get(localhost:8080/api/obtener/autos)
    return res.data;
}

const guardarScoreUsuario = async(score)=>{
    //peticion con valor desde body
    const res = await axios.post(baseUrl+"/guardar/score", score);
    return res.data;
}


export {getJuegoById, guardarScoreUsuario}