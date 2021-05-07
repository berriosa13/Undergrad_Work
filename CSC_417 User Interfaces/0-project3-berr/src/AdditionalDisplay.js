import React, { Component } from "react";
import { AdditionalEditor } from "./AdditionalEditor";
import { AdditionalTable } from "./AdditionalTable";

export class AdditionalDisplay extends Component {

    constructor(props) {
        super(props);
        this.state = {
            displayEditor: false,
            selected: null
        }
    }

    startEditing = (supplier) => {
        this.setState({ displayEditor: true, selected: supplier })
    }

    createSupplier = () => {
        this.setState({ displayEditor: true, selected: {} })
    }

    cancelEditing = () => {
        this.setState({ displayEditor: false, selected: null })
    }

    saveSupplier= (supplier) => {
        this.props.saveCallback(supplier);
        this.setState({ displayEditor: false, selected: null })        
    }

    render() {
        if (this.state.displayEditor) {
            return <AdditionalEditor
                key={ this.state.selected.id || -1 }
                supplier={ this.state.selected } 
                saveCallback={ this.saveSupplier }
                cancelCallback={ this.cancelEditing } />
        } else {
            return <div className="m-2">
                    <AdditionalTable additionals={ this.props.additionals }
                        editCallback={ this.startEditing }
                        deleteCallback={ this.props.deleteCallback }
                    />
                    <div className="text-center">
                        
                    </div>                        
            </div>        
        }
    }
}
