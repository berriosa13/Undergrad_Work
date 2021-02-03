'use strict';
const user_db = require('../models/user_db');

let userList = [
    {
        name: "Anthony",
        gender: "Male"
    }
];

exports.indexView = (req, res) => {
    res.render('index');
}

exports.showUserList = (req, res) => {
    console.log('Current Users: ', userList,'\n');
    res.render('users', {
        allUsers: userList
    });
}; 

exports.contactPage = (req, res) => {
    res.render('addContacts'); 
}

exports.updateUsers = (req, res) => {
    userList.push({name: req.body.name, gender: req.body.gender});
    res.render('users', {allUsers: userList});

    let addedUser = new user_db( {
        name: req.body.name,
        gender: req.body.gender
      } );

      addedUser.save((error, result)=> {
          if (error) res.send(error);
          console.log('Current Users: ', userList);
          
      });
}

exports.respondJSON = (req, res) => {
    res.json({
    status: 200,
    data: res.locals
    });
   }

   exports.errorJSON = (error, req, res, next) => {
    let errorObject;
    if (error) {
    errorObject = {
   status: httpStatus.INTERNAL_SERVER_ERROR,
   message: error.message
    };

    } else {
    errorObject = {
   status: httpStatus.INTERNAL_SERVER_ERROR,
   message: "Unknown Error."
    };
    }
    res.json(errorObject);
};
