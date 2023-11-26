// Get all the necessary DOM elements
const form = document.getElementById('exampleForm');
const submitButton = document.querySelector('.submit');
const successMessage = document.getElementById('form-submitted-msg');

// Store all form elements in an array by spreading the elements property of the form
const formElements = [...form.elements];

// Create function to check if all form elements are valid
const allInputsValid = () => {
  return form.checkValidity();
};

// Define a function to handle changes to any form element
const handleChange = () => {
  if (allInputsValid()) {
    submitButton.removeAttribute('disabled');
  } else {
    submitButton.setAttribute('disabled', '');
  }
};

// Define a function to handle form submission
const handleSubmit = (e) => {
  // Prevent the default form submission behavior
  e.preventDefault();

  // If all form elements are valid after the form submission, display a success message, reset the form, and disable the submit button
  if (allInputsValid()) {
    successMessage.style.display = 'block';
    form.reset();
    submitButton.setAttribute('disabled', '');

    // Hide the success message after 3 seconds
    setTimeout(() => {
      successMessage.style.display = 'none';
    }, 3000);
  }
};

// Add event listener to each form element
formElements.forEach((element) => {
  element.addEventListener('change', handleChange);
});

// Add submit listener to the form
form.addEventListener('submit', (e) => handleSubmit(e));
