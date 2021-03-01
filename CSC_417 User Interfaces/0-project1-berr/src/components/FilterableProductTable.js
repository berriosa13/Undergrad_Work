import React, { Component } from 'react'
import ProductTable from './components/ProductTable'
import SearchBar from './components/SearchBar'

class FilterableProductTable extends Component {
    render() {
        return (
          <div>
            <SearchBar/>
            <ProductTable products={this.props.products} />
          </div>
        );
      }      
}

export default FilterableProductTable
