import React, { Component } from "react";
import { AcademicTableRow } from "./AcademicTableRow";

export class AcademicTable extends Component {

    render() {
        return <table className="table table-sm table-bordered table-dark table-hover">
                <thead>
                    <tr>
                        <th colSpan="7" 
                                className="bg-primary text-white text-center h4 p-2">
                            Academic Foundation 
                        </th>
                    </tr>
                    <tr>
                        <th>ID</th><th>Description</th><th>Semester</th><th>Prefix</th><th>Number</th><th>Grade</th><th>Editor</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.props.courses.map(c => 
                            <AcademicTableRow product={ c } 
                                key={ c.id }
                                editCallback={ this.props.editCallback }
                                deleteCallback={ this.props.deleteCallback } />)
                    }
                </tbody>
            </table>        
    }
}
