function NumberList(props) {
    const numbers = props.numbers;
    const listItems = numbers.map((number) =>
      <li>{number}</li>
    );
    return (
      <ul>{listItems}</ul>
    );
}
  
const numbers = [6,5,4,3,2,1];
ReactDOM.render(
  <NumberList numbers={numbers} />,
  document.getElementById('content2')
);
