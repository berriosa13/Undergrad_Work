import React from  "react";
import './App.css';
import { MovieDisplay }   from "./MovieDisplay";

export default class  App extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      movieItems: [
        {id: 1, name:"Gone with the Wind", price:20.0},
        {id: 2, name:"Mamamia", price:30.0},
        {id: 3, name:"Song of the Music", price:40},
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
        <MovieDisplay
        name="IDontKnowWhatIsThisFor"
        moviesDisplayed={this.state.movieItems}
        saveMovieDisplayCallBack= {p => this.saveData("movieItems", p)}
        cancelChange={this.cancelChange}
         />
      </div>
    );
  }
  
  
}
