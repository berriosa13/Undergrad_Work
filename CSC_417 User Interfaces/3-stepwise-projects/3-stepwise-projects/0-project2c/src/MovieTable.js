import React, { Component } from "react";
import { MovieTableRow } from "./MovieTableRow";

export class MovieTable extends Component {

    render() {
        return <table className="table table-sm table-striped table-bordered">
                <thead>
                    <tr>
                        <th colSpan="5" 
                                className="bg-primary text-white text-center h4 p-2">
                            Movie
                        </th>
                    </tr>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.props.allMovies.map(p => 
                            <MovieTableRow aMovie={ p } 
                                key={ p.id }
                                editCallback={ this.props.editCallback }
                                />)
                    }
                </tbody>
            </table>        
    }
}
