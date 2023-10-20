
d3.select('#body')
  .append('div')
  .attr('id', 'myDiv')


d3.select('#myDiv')
  .append('h1')
  .text('OHLC Estimator')


const svg = d3.select('#body')
  .append('svg')
  .style('border', '2px solid black')
  .attr('width', 500)
  .attr('height', 500);


const data = [  ,2,50,2,   ];



svg.selectAll('rect')
  
  .data(data)
  
  .enter()
 
  .append('rect')
  
  .attr('width', 2)
  
  .attr('height', d => d)
  
  .attr('x', (d, i) => i * 125)
  
  .attr('y', d => 300 - d)
  
  .style('fill', 'blue');




 
const body = document.querySelector('body');
const modeToggle = document.getElementById('mode-toggle');
const modeStatus = document.querySelector('.mode-status');

function toggleMode() {
  body.classList.toggle('candlestick-mode');

  const modeMessage = body.classList.contains('candlestick-mode') ?
    'Candlestick' 
    : "Bar"

  modeStatus.innerText = modeMessage;
}

modeToggle.addEventListener('click', toggleMode);