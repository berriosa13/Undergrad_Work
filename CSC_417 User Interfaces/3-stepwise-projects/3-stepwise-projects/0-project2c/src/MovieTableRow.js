import React, { Component } from "react";

export class MovieTableRow extends Component {

    render() {
        let p = this.props.aMovie;
        return <tr>
            <td>{ p.id }</td>
            <td>{ p.name }</td>
            <td>{ p.price}</td>
            <td className="text-right">${ Number(p.price).toFixed(2) }</td>
            <td>
                <button className="btn btn-sm btn-warning m-1"
                    onClick={ () => this.props.editCallback(p) }>
                        Edit
                </button>
                                   
            </td>
        </tr>
    }
}
