"use strict";

var element = React.createElement("h1", null, "Hello, world from App.jsx, First!");
ReactDOM.render(element, document.getElementById('contents'));

function tick() {
  var element = React.createElement("div", null, React.createElement("h1", null, "Hello, world! Second Time"), React.createElement("h2", null, "It is ", new Date().toLocaleTimeString(), "."));
  ReactDOM.render(element, document.getElementById('root'));
}

setInterval(tick, 1000);