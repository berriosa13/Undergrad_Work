import React, { Component } from "react";

export class MovieEditor extends Component {

    constructor(props) {
        super(props);
        this.state = {
            formData: {
                id: props.movie.id || "",
                name: props.movie.name || "",  
                price: props.movie.price || ""
            }
        }
    }

    handleChange = (ev) => {
        console.log("*** MovieEditor, handleClick()"+ this.state.formData[ev.target.name]);
        ev.persist();
        this.setState(state => state.formData[ev.target.name] =  ev.target.value);
    }

    handleClick = () => {
        console.log("*** MovieEditor, handleClick()"+ this.state.formData.price);
        this.props.saveEditChanges(this.state.formData);
    }

    render() {
        return <div className="m-2">
            <div className="form-group">
                <label>ID</label>
                <input className="form-control" name="id"
                    disabled
                    value={ this.state.formData.id }
                    onChange={ this.handleChange } />
            </div>
            <div className="form-group">
                <label>Name</label>
                <input className="form-control" name="name"
                    value={ this.state.formData.name }
                    onChange={ this.handleChange } />
            </div>                     
            <div className="form-group">
                <label>Price</label>
                <input className="form-control" name="price"
                    value={ this.state.formData.price }
                    onChange={ this.handleChange } />
            </div>                          
            <div className="text-center">
                <button className="btn btn-primary m-1" 
                        onClick={ this.handleClick }>
                    Save
                </button>
                <button className="btn btn-secondary" 
                        onClick={ this.props.cancelChange }>
                    Cancel
                </button>                
            </div>
        </div>
    }
}
