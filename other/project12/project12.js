   





// Start Iframe video auto shutoff

$(function(){
    $("body").on('hidden.bs.modal', function (e) {
      var $iframes = $(e.target).find("iframe");
      $iframes.each(function(index, iframe){
        $(iframe).attr("src", $(iframe).attr("src"));
      });
    });
  });  
  
  // End Iframe video auto shutoff
  
  
// Start Color - Grayscale Toggler


$(function() {
  "use strict";

  let bodyA = $(".bodya");
  let footer = $(".footer");
  let main = $(".main");
  let aside = $("aside");
  let subheadercenterheadertextbutton = $(".subheadercenterheadertextbutton");
  let header = $(".header");
  let contentouter = $(".contentouter");
  let modeToggle = $("#mode-toggle");
  let modeStatus = $(".mode-status");

  function toggleMode() {
    bodyA.toggleClass("dark-modefields");
    footer.toggleClass("dark-modefields");
    main.toggleClass("dark-modefields");
    aside.toggleClass("dark-modefields");
    subheadercenterheadertextbutton.toggleClass("dark-modefields");
    header.toggleClass("dark-modefields");
    contentouter.toggleClass("dark-mode");

    const modeMessage = contentouter.hasClass("dark-mode") ?
      "Grayscale" : "Color";

    modeStatus.text(modeMessage);
  }

  modeToggle.click(toggleMode);
});







// End Color - Grayscale Toggler



// Start Exam Page Form 






  const form = document.getElementById('exampleForm',)
  const formA = document.getElementById('exampleFormA',)
  const submitButton = document.querySelector('.submit')
  const successMessage = document.getElementById('form-submitted-msg')
   
  
  const formElements = [ ...form.elements ]
  

  const allInputsValid = () => {
    const valid = formElements.every((element) => {
      if (element.nodeName === 'SELECT') {
        return element.value !== 'Please select an option'
      } else {
        return element.checkValidity()
      }
    })
   
  
    return valid
  }
  

  const handleChange = () => {

    formElements.forEach((element) => {

      if (!element.checkValidity()
            && element.nodeName !== 'BUTTON'
            && element.nodeName !== 'SELECT'  
            && element.type !== 'checkbox'
            && element.type !== 'radio'
      ) {
        element.style.borderColor = 'red'
        element.nextElementSibling.style.color = 'red' 
        element.nextElementSibling.style.display = 'block' 
        element.previousElementSibling.style.color = 'red'
      }
  

      if (element.checkValidity()
            && element.nodeName !== 'BUTTON'
            && element.nodeName !== 'SELECT'
            && element.type !== 'checkbox'
            && element.type !== 'radio'
      ) {
        element.style.borderColor = '#CED4DA'
        element.nextElementSibling.style.color = '#CED4DA'
        element.nextElementSibling.style.display = 'none'
        element.previousElementSibling.style.color = '#212529'
      }
  

      if (!element.checkValidity()
            && (element.type === 'checkbox'
                || element.type === 'radio')
      ) {
        element.style.borderColor = 'red'
        element.nextElementSibling.style.color = 'red'
      }
  

      if (element.checkValidity()
            && (element.type === 'checkbox'
                || element.type === 'radio')
      ) {
        element.style.borderColor = '#CED4DA'
        element.nextElementSibling.style.color = '#212529'
      }
  

      if (element.nodeName === 'SELECT'
            && element.value === 'Please select an option'
      ) {
        element.style.borderColor = 'red'
        element.nextElementSibling.style.color = 'red'
        element.nextElementSibling.style.display = 'block'
        element.previousElementSibling.style.color = 'red'
      }
  

      if (element.nodeName === 'SELECT'
            && element.value !== 'Please select an option'
      ) {
        element.style.borderColor = '#CED4DA'
        element.nextElementSibling.style.color = '#CED4DA'
        element.nextElementSibling.style.display = 'none'
        element.previousElementSibling.style.color = '#212529'

      }
    })
  
  

  
  

    if (allInputsValid()) {
      submitButton.removeAttribute('disabled', '')
    } else {
      submitButton.setAttribute('disabled', '')
    }
  }
  

  const handleSubmit = (e) => {

    e.preventDefault()
  

    if (allInputsValid()) {
      successMessage.style.display = 'block'
      form.reset()
      submitButton.setAttribute('disabled', '')
  

      setTimeout(() => {
        successMessage.style.display = 'none'
      }, 9000)
    }
  }
  

  formElements.forEach((element) => {
    element.addEventListener('change', handleChange)
  })
  

  form.addEventListener('submit', (e) => handleSubmit(e))

// Start Exam Page Form 