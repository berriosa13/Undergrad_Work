import 'react-bootstrap';
import React, { Component } from 'react';
import Form from 'react-bootstrap/Form';

export default class UserInput extends Component {
    
    constructor(props) {
        super(props)
        this.state = {
             studentName: '',
             credits: ''
             }
        }
        
        handleNameChange = (event) => {
            this.setState({
                studentName: event.target.value
            })
        }

        handleCreditChange = (event) => {
            this.setState({
                credits: event.target.value
            })
        }

    render() {
        return (
            
        <Form className="h5 bg-info text-white p-2">
            <Form.Group controlId="formBasicEmail">
                <Form.Label>Student Name:</Form.Label>
                <Form.Control type="name" value = {this.state.studentName}
                
                onChange = {this.handleNameChange}
                 />
         
            </Form.Group>

            <Form.Group controlId="formBasicPassword">
             <Form.Label>Total Transfer Credits:</Form.Label>
            <Form.Control type="transfer" value = {this.state.credits} 
            onChange = {this.handleCreditChange}>
            
            </Form.Control>
             <Form.Text>
            Please enter the total number of transferred credits.
            </Form.Text>
            </Form.Group>

            <Form.Group> 
            <Form.Label>Writing Emphasis for  </Form.Label>
            </Form.Group>
      </Form> 

        )  
    }
}
