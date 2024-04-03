// Select the <body> element from the DOM and assign it to the constant "body".
const body = document.querySelector('body');

// Select the HTML element with the ID "mode-toggle". This is the <input> checkbox for toggling between light and dark modes.
const modeToggle = document.getElementById('mode-toggle');

// Select the HTML element with the class "mode-status". This is the <h2> element that displays the current mode.
const modeStatus = document.querySelector('.mode-status');

// Define a function named "toggleMode".






function toggleMode() {



  // Toggle the class "dark-mode" on the <body>. If the class exists, it is removed; if it does not exist, it is added.
  body.classList.toggle('dark-mode');



  // Check if the "dark-mode" class is present on the <body>. If so, set "modeMessage" to "Dark Mode", otherwise set it to "Light Mode".
  const modeMessage = body.classList.contains('dark-mode') ?


      'Dark Mode'
      : "Light Mode";



  // Update the text of the "modeStatus" element (the <h2>) to reflect the current mode.
  modeStatus.innerText = "Currently in " + modeMessage;

}



// Add a "click" event listener to the "modeToggle" element (the checkbox). When the checkbox is clicked, the "toggleMode" function is called.
modeToggle.addEventListener('click', toggleMode);