import React from  "react"
//import logo from './logo.svg';
import './App.css';
import MyCourseTable from "./MyCourseTable";
//import FilterableCourseTable from './FilterableCourseTable';
//import writingCourses from './FilterableCourseTable';
import UserInput from  './UserInput';

class  App extends React.Component {
  render () {
    return (
      <div>
        <UserInput />
        <MyCourseTable />
      </div>
    );
  }
  
}

export default App;
