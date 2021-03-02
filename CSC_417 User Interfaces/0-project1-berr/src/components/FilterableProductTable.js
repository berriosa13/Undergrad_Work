import React from 'react'
import SearchBar from './SearchBar'
import ProductTable from './ProductTable'

class FilterableProductTable extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      filterText: '',
      inStockOnly: false
    };
    
    this.handleFilterTextChange = this.handleFilterTextChange.bind(this);
    this.handleInStockChange = this.handleInStockChange.bind(this);
  }
  
  handleFilterTextChange(filterText) {
    this.setState({
      filterText: filterText
    });
  }
  
  handleInStockChange(inStockOnly) {
    this.setState({
      inStockOnly: inStockOnly
    })
  }

  render() {
    return (
      <div>
        <SearchBar
          filterText={this.state.filterText}
          inStockOnly={this.state.inStockOnly}
          onFilterTextChange={this.handleFilterTextChange}
          onInStockChange={this.handleInStockChange}
        />
        <ProductTable
          products={this.props.products}
          filterText={this.state.filterText}
          inStockOnly={this.state.inStockOnly}
        />
        
      </div>
    );
    
  }
  
  
}
const PRODUCTS = [
  {category: 'NVIDIA GPUs', price: '$399.99', stocked: true, name: 'RTX 3060ti'},
  {category: 'NVIDIA GPUs', price: '$499.99', stocked: true, name: 'RTX 3070'},
  {category: 'NVIDIA GPUs', price: '$699.99', stocked: false, name: 'RTX 2080ti'},
  {category: 'AMD GPUs', price: '$580.00', stocked: true, name: 'RX 6800'},
  {category: 'AMD GPUs', price: '$650.00', stocked: false, name: 'RX 6800 XT'},
  {category: 'AMD GPUs', price: '$1,000.00', stocked: true, name: 'RX 6900 XT'},
]

export { PRODUCTS }
export default FilterableProductTable
