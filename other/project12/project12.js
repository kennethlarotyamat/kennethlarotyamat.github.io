$(function(){
    $("body").on('hidden.bs.modal', function (e) {
      var $iframes = $(e.target).find("iframe");
      $iframes.each(function(index, iframe){
        $(iframe).attr("src", $(iframe).attr("src"));
      });
    });
  });  
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


$(document).ready(function() {
  const form = $('.exampleForm');
  const submitButton = $('.submit');
  const successMessage = $('#form-submitted-msg');

  const formElements = form.find(':input');

  const allInputsValid = () => {
    const valid = formElements.toArray().every((element) => {
      if (element.nodeName === 'SELECT') {
        return element.value !== 'Please select an option';
      } else {
        return element.checkValidity();
      }
    });

    return valid;
  };

  const handleChange = () => {
    formElements.each(function() {
      const element = $(this);

      if (
        !element[0].checkValidity() &&
        element[0].nodeName !== 'BUTTON' &&
        element[0].nodeName !== 'SELECT' &&
        element[0].type !== 'checkbox' &&
        element[0].type !== 'radio'
      ) {
        element.css('border-color', 'red');
        element.next().css('color', 'red');
        element.next().css('display', 'block');
        element.prev().css('color', 'red');
      }

      if (
        element[0].checkValidity() &&
        element[0].nodeName !== 'BUTTON' &&
        element[0].nodeName !== 'SELECT' &&
        element[0].type !== 'checkbox' &&
        element[0].type !== 'radio'
      ) {
        element.css('border-color', '#CED4DA');
        element.next().css('color', '#CED4DA');
        element.next().css('display', 'none');
        element.prev().css('color', '#212529');
      }

      if (
        !element[0].checkValidity() &&
        (element[0].type === 'checkbox' || element[0].type === 'radio')
      ) {
        element.css('border-color', 'red');
        element.next().css('color', 'red');
      }

      if (
        element[0].checkValidity() &&
        (element[0].type === 'checkbox' || element[0].type === 'radio')
      ) {
        element.css('border-color', '#CED4DA');
        element.next().css('color', '#212529');
      }

      if (
        element[0].nodeName === 'SELECT' &&
        element.val() === 'Please select an option'
      ) {
        element.css('border-color', 'red');
        element.next().css('color', 'red');
        element.next().css('display', 'block');
        element.prev().css('color', 'red');
      }

      if (
        element[0].nodeName === 'SELECT' &&
        element.val() !== 'Please select an option'
      ) {
        element.css('border-color', '#CED4DA');
        element.next().css('color', '#CED4DA');
        element.next().css('display', 'none');
        element.prev().css('color', '#212529');
      }
    });

    if (allInputsValid()) {
      submitButton.removeAttr('disabled');
    } else {
      submitButton.attr('disabled', '');
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (allInputsValid()) {
      successMessage.css('display', 'block');
      form[0].reset();
      submitButton.attr('disabled', '');

      setTimeout(() => {
        successMessage.css('display', 'none');
      }, 9000);
    }
  };

  formElements.on('change', handleChange);

  form.on('submit', (e) => handleSubmit(e));
});


