
d3.select('#body')
  .append('div')
  .attr('id', 'myDiv')
d3.select('#myDiv')
  .append('h1')
  .text('OHLC Estimator')
const svg = d3.select('#body')
  .append('svg')
  .attr('width', 500)
  .attr('height', 500);






const data = [  ,   ,300,2,   ];
const dataOpen = [  , 2, , ,   ];
const dataClose = [  ,  , ,2 ,   ];
svg.selectAll('rect')  
  .data(data)  
  .enter() 
  .append('rect')  
  .attr('width', 100)  
  .attr('height', d => d)  
  .attr('x', (d, i) => i * 100)  
  .attr('y', d =>  450 - d)  
  .style('fill', 'blue')  





 
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