import React, { Component } from 'react';
import { CourseTable } from "./CourseTable";
import { CourseEditor } from "./CourseEditor"; 

export class CourseDisplay extends Component {

    constructor(props) {
        super(props);
        this.state = { 
            showEditor: false,
            selectedCourse: null
        }
    }

    startEditing = (course) => {
        this.setState({ showEditor: true, selectedCourse: course })
    }

    saveCourse = (course) => {
        console.log("*** in CourseDisplay, saveCourse(): " + course.id + " "+course.price);
        this.props.saveCourseDisplayCallBack(course); // died here uncaught error type
        this.setState({ showEditor: false, selectedCourse: null })        
    }

    cancelCourse = (course) => {
        console.log("*** in CourseDisplay, cancelCourse(): ");
        this.setState({ showEditor: false, selectedCourse: null })        
    }

    render() {
        if (this.state.showEditor) {
            return <CourseEditor 
                key={ this.state.selectedCourse.id || -1 }
                course={ this.state.selectedCourse } 
                saveEditChanges={ this.saveCourse}
                cancelChange = { this.cancelCourse }
                />
                
        } else {
            return <div className="m-2">
                <CourseTable courses={ this.props.coursesDisplayed }
                    editCallback={ this.startEditing }
                     />                                  
            </div>
        }
    }
}

