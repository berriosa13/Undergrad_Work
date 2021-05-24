'use strict';

const express = require('express');
const app = express();
const port = 3000;
const router = require( './routes/homeRoutes' );
const apiRoutes = require('./routes/apiRoutes');

/*
    configuring mongoose
*/

const mongoose = require('mongoose');
const url = 'mongodb://localhost/project_1';
mongoose.connect(url, {useNewUrlParser: true, useUnifiedTopology: true});

// Testing connection
const db = mongoose.connection
db.once('open', _ => {
    console.log('Database connected:', url)
})

db.once('error', _ => {
    console.error('connection error:', url)
})

app.set('view engine', 'ejs');
app.listen(port);
console.log( `The server has started and is listening on port number: ${port}` );

app.use( express.urlencoded( {
    extended: false
  } ) );

app.use(express.json()); 

app.use('/', router);

app.use("/api", apiRoutes);



