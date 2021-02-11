"use strict";

function NumberList(props) {
  var numbers = props.numbers;
  var listItems = numbers.map(function (number) {
    return React.createElement("li", null, number);
  });
  return React.createElement("ul", null, listItems);
}

var numbers = [6, 5, 4, 3, 2, 1];
ReactDOM.render(React.createElement(NumberList, {
  numbers: numbers
}), document.getElementById('content2'));