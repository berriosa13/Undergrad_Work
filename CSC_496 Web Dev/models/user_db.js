'use strict';

const mongoose = require( 'mongoose' );

const userSchema = mongoose.Schema( {
  name: String,
  gender: String,
} );

module.exports = mongoose.model( 'user_db', userSchema );