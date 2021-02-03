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
mongoose.connect('mongodb://localhost/project_1', {
    useNewUrlParser: true, useUnifiedTopology: true}
);

app.set('view engine', 'ejs');
app.listen(port);
console.log( `The server has started and is listening on port number: ${port}` );

app.use( express.urlencoded( {
    extended: false
  } ) );

app.use(express.json()); 

app.use('/', router);

app.use("/api", apiRoutes);



