import 'react-bootstrap';
import React, { Component } from 'react';
import Form from 'react-bootstrap/Form';
//import Button from 'react-bootstrap/Button';

export default class UserInput extends Component {
   render() {
       return (
      <Form className="h5 bg-info text-white p-2">
        <Form.Group controlId="formBasicEmail">
          <Form.Label>Full Name</Form.Label>
          <Form.Control type="name" placeholder="Enter full name" />
         
        </Form.Group>


        <Form.Group controlId="formBasicPassword">
          <Form.Label>Transferred Credits</Form.Label>
          <Form.Control type="transfer" placeholder="Transfer" />
          <Form.Text className="text-muted">
            Please enter the total number of transferred credits.
          </Form.Text>
        </Form.Group>
       
      
      </Form> 
       )
   }
   
   
  
}
