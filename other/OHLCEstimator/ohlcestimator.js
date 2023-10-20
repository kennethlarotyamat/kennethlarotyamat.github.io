
d3.select('#body')
  .append('div')
  .attr('id', 'myDiv')


d3.select('#myDiv')
  .append('h1')
  .text('OHLC Estimator')

// STEP 1: Create an SVG element with a width of 500, a height of 300, and a solid blue border 2 pixels wide
const svg = d3.select('#body')
  .append('svg')
  .style('border', '2px solid blue')
  .attr('width', 500)
  .attr('height', 300);


// STEP 2: Create an array of data
const data = [10, 20, 30, 40, 50];


// STEP 3: Create a rectangle for each data point
svg.selectAll('rect') // Select all existing rect elements
  // Bind the data array to the selection
  .data(data)
  // Create a placeholder for each data point that doesn't have a corresponding rect element yet
  .enter()
  // Append a rect element for each placeholder
  .append('rect')
  // Set the width of each rect element to 50
  .attr('width', 50)
  // Set the height of each rect element to the corresponding data value
  .attr('height', d => d)
  // STEP 4: Position each rectangle along the x-axis based on its index in the data array
  .attr('x', (d, i) => i * 60)
  // Invert the y-axis and set the y-position of each rect element based on its data value
  .attr('y', d => 300 - d)
  // STEP 5: Set the fill color of each rectangle to blue using the style method
  .style('fill', 'blue');


const body = document.querySelector('body');
const modeToggle = document.getElementById('mode-toggle');
const modeStatus = document.querySelector('.mode-status');

function toggleMode() {
  body.classList.toggle('dark-mode');

  const modeMessage = body.classList.contains('dark-mode') ?
    'Candlestick' 
    : "Bar"

  modeStatus.innerText = modeMessage;
}

modeToggle.addEventListener('click', toggleMode);