import React, { Component } from "react";
import { MovieTable } from "./MovieTable"
import { MovieEditor } from "./MovieEditor";

export class MovieDisplay extends Component {

    constructor(props) {
        super(props);
        this.state = {
            showEditor: false,
            selectedMovie: null
        }
    }

    startEditing = (movie) => {
        this.setState({ showEditor: true, selectedMovie: movie })
    }


    saveMovie = (movie) => {
        console.log("*** in MovieDisplay, saveMovie(): " + movie.id + " "+movie.price);
        this.props.saveMovieDisplayCallBack(movie); // died here uncaught error type
        this.setState({ showEditor: false, selectedMovie: null })        
    }

    cancelMovie = (movie) => {
        console.log("*** in MovieDisplay, cancelMovie(): ");
        this.setState({ showEditor: false, selectedMovie: null })        
    }

    render() {
        if (this.state.showEditor) {
            return <MovieEditor 
                key={ this.state.selectedMovie.id || -1 }
                movie={ this.state.selectedMovie } 
                saveEditChanges={ this.saveMovie }
                cancelChange = { this.cancelMovie }
                />
        } else {
            return <div className="m-2">
                <MovieTable allMovies={ this.props.moviesDisplayed }
                    editCallback={ this.startEditing }
                     />                                  
            </div>
        }
    }
}
