import React, {Component} from 'react';
import Table from 'react-bootstrap/Table';

export default class MyCourseTable extends Component {
    render() {
        return (
            <div className="col-4">
            <Table bordered striped hover>
           
                <thead>
                <tr>
                <th>#</th>
                <th>Prefix</th>
                <th>Course no.</th>
                <th>Course name</th>
                </tr>
                </thead>
            
           <tbody>
                <tr>
                <td>1</td>
                <td>WRT</td>
                <td>131</td>
                <td>Technical Writing</td>
                </tr>
                <tr>
                <td>2</td>
                <td>WRT</td>
                <td>230</td>
                <td>Business Writing</td>
                </tr>
                <tr>
                <td>3</td>
                <td colSpan="2">WRT 330</td>
                <td>Larry the Bird</td>
                </tr>
            </tbody>
            
            </Table></div>
        )
    }
}

