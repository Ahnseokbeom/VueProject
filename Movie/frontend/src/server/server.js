var mysql = require('mysql')
var express = require('express')
const app = express();
const port = 3000;

var connection = mysql.createConnection({
    host : '127.0.0.1',
    port : '3306',
    user : 'root',
    password : '4612',
    database : 'DiconPJ'
});
app.set('port',8082);
app.listen(port,() => {
    console.log('server is listening at localhost:'+port);
})
connection.connect(function (err){
    if(err){
        console.log('error');
        console.log(err);
        throw err;
    }
    console.log('connecting!!')
})


app.get('/game',(req,res) => {
    connection.query('select * from Game',(err,rows) => {
        if(err) console.log(err);
        res.send(rows);
        console.log(rows);
    })
})

app.get('/aos',(req,res) =>{
    connection.query('select * from Game where type = "AOS"',(err,rows) => {
        if(err) throw err;
        console.log('game info is : ',rows);
        res.send(rows);
    })
})

app.get('/rpg',(req,res) =>{
    connection.query('select * from Game where type = "rpg"',(err,rows) => {
        if(err) throw err;
        console.log('game info is : ',rows);
        res.send(rows);
    })
})

app.get('/sport',(req,res) =>{
    connection.query('select * from Game where type = "스포츠" or type="액션"',(err,rows) => {
        if(err) throw err;
        console.log('game info is : ',rows);
        res.send(rows);
    })
})

app.get('/top10',(req,res) =>{
    connection.query('select * from Game limit 0,10',(err,rows) => {
        if(err) throw err;
        console.log('game info is : ',rows);
        res.send(rows);
    })
})

app.get('/top10',(req,res) =>{
    connection.query('select * from Game limit 0,10',(err,rows) => {
        if(err) throw err;
        console.log('game info is : ',rows);
        res.send(rows);
    })
})




