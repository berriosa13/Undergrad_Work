import React, { Component } from 'react';
import { CourseTableRow } from './CourseTableRow';
import Form from 'react-bootstrap/Form';

export class CourseTable extends Component {
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
        
        const name = this.state.studentName; 
        const credits = this.state.credits; 
        const courses = this.props.courses; 
        
        const rows = [];
        courses.forEach((c) => {
            if(credits < 40) {
                console.log("You need to take 3 Writing Emphasis classes");
                rows.push(
                    <CourseTableRow
                        course = {c}
                        key = {c.id}
                        editCallback= { this.props.editCallback }
                    />  
                );
            }
            if (credits > 40 && credits < 70) {
                console.log("You need to take 2 Writing Emphasis classes");
                rows.push(
                    <CourseTableRow
                        course = {c}
                        key = {c.id}
                        editCallback= { this.props.editCallback }
                    />  
                );
             }
             if (credits > 70) {
                console.log("You only need to take 1 Writing Emphasis class");
                rows.push(
                    <CourseTableRow
                        course = {c}
                        key = {c.id}
                        editCallback= { this.props.editCallback }
                    />  
                );
             }
        });

        return (
            <div>
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
        
            </Form.Group>
      </Form> 
                <table className="table table-sm table-striped table-bordered">
                    <thead>
                        <tr>
                            <th colSpan="7" 
                            className="bg-primary text-white text-center h4 p-2">
                                Writing Emphasis For {name}
                            </th>
                        </tr>
                            <tr>
                                <th>ID</th>
                                <th>Description</th>
                                <th>Semester</th>
                                <th>Prefix</th>
                                <th>Number</th>
                                <th>Grade</th>
                                <th>Editing</th>
                            </tr>
                    </thead>
                        <tbody>
                            {
                                this.props.courses.map(p => 
                                    <CourseTableRow aCourse={ p } 
                                        key={ p.id }
                                        editCallback={ this.props.editCallback }
                                        />)
                            }
                        </tbody>
                </table>
            </div>
             ) 
        }
    }       
    
