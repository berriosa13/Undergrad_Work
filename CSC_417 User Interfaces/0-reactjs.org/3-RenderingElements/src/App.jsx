const element = <h1>Hello, world from App.jsx, First!</h1>;
ReactDOM.render(element, document.getElementById('contents'));

function tick() {
    const element = (
      <div>
        <h1>Hello, world! Second Time</h1>
        <h2>It is {new Date().toLocaleTimeString()}.</h2>
      </div>
    );
    ReactDOM.render(element, document.getElementById('root'));
}
  
setInterval(tick, 1000);


