'use strict';

const mongoose = require( 'mongoose' );

var userSchema = mongoose.Schema( {
  name: String,
  gender: String,
} );

module.exports = mongoose.model( 'user_db', userSchema );