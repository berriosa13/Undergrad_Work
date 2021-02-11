class EssayForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      value: 'Please write an essay about your favorite DOM element.',
      flavor: ''
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
    alert('An essay was submitted: ' + this.state.value);
    event.preventDefault();
  }

  onChange(event) {
    this.setState(()=>this.setState({flavor: event.target.flavor}));
    alert('Flavor selected is ' + this.state.flavor)
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          Essay:
          <textarea value={this.state.value} onChange={this.handleChange} />
        </label>
        <br />
        <label>
          Please select the flavor you like:
          <select multiple={true} onSelect={this.onChange}>
              <option value="grapefruit">Grapefruit</option>
              <option value="lime">Lime</option>
              <option defaultValue="coconut">Coconut</option>
              <option value="mango">Mango</option>
        </select>

        </label>
        
        <input type="submit" value="Submit" />
      </form>
    );
  }
}

const element = <EssayForm />;

ReactDOM.render(element, document.getElementById('contents'));