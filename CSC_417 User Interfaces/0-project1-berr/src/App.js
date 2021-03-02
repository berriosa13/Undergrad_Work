import logo from './logo.svg'
import './App.css'
import ProductCategoryRow from './components/ProductCategoryRow'
import ProductRow from './components/ProductRow'
import ProductTable from './components/ProductTable'
import SearchBar from './components/SearchBar'
import FilterableProductTable from './components/FilterableProductTable'

function App() {
  return (
    <div className="App">
      <FilterableProductTable/> 
      <SearchBar/> 
      <ProductTable/>
      <ProductCategoryRow/> 
      <ProductRow/>
    
    </div>
  );
}

export default App;
