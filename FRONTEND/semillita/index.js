//Instalar express y nodemon

const express = require('express')


app.listen(3002, () =>{

    console.log("Servidor corriendo")
});

app.post('http://localhost:3000/login', (req, res) => {
	const username = req.body.username;
    const password = req.body.password;

	semillitaDB.query(
        "SELECT * FROM login WHERE username = ? AND password = ?",
        [username, password],
        (err, result) => {
		    if (err) {
			res.send({err: err})
		    } else{
                if(result.length > 0){
                    res.send(result)
                }else{
                    res.send({message: "Usuario o Contraseña incorrecta"})
                }
		}
	})
})

