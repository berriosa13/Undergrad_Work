
import './App.css';
import React from 'react';
import { CourseDisplay } from './CourseDisplay';

export default class App extends React.Component {

    constructor(props) {
      super(props)
    
      this.state = {
        courseItems: [
          {id: 1, description:"Writing1", semester:"Fall", prefix: "ENG", number: "368/371", grade: ""}, 
          {id: 2, description:"Writing2", semester:"", prefix: "", number: "", grade: ""},
          {id: 3, description:"Writing3", semester:"", prefix: "", number: "", grade: ""} 
        ]
      }
      this.idCounter = 100;
    }

    saveData = (collection, item) => {
      if (item.id === "") {
          item.id = this.idCounter++;
          this.setState(state => state[collection] 
              = state[collection].concat(item));
      } else {
          this.setState(state => state[collection] 
              = state[collection].map(stored => 
                    stored.id === item.id ? item: stored))
      } 
  }

  cancelChange = () => {
 
  }

  render () {
    return (
      <div>
      <CourseDisplay
      name="IDontKnowWhatIsThisFor"
      coursesDisplayed={this.state.courseItems}
      saveCourseDisplayCallBack= {p => this.saveData("courseItems", p)}
      cancelChange={this.cancelChange}
       />
    </div>
    );
  }
  
}

