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


// form-check:hover hover-effect removeClass("form-check:hover") unbind('mouseenter mouseleave')   
// References: https://stackoverflow.com/questions/805133/how-do-i-unbind-hover-in-jquery
//             https://www.bing.com/search?pglt=171&q=jquery+off+hover&cvid=9831d1818c5441e487a44ae8a86106d3&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDM5MjBqMGoxqAIAsAIA&FORM=ANSPA1&PC=ACTS
//             https://stackoverflow.com/questions/805133/how-do-i-unbind-hover-in-jquery

    // Question 1

   $('.correctanswerQ1').on('click', function() {
     $('.feedbackquestion1').text("Excellent");
    $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

    });

    $('.alternativeresponseQ1').on('click', function() {
      $('.feedbackquestion1').text("Why don't you have a scantron?");
     $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ1BB').on('click', function() {
      $('.feedbackquestion1').text("You'll still need a scantron for the multiple choice section");
     $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ1GB').on('click', function() {
      $('.feedbackquestion1').text("I think I'll just give you a scantron");
     $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

     });

    //  Question 2

    $('.correctanswerQ2').on('click', function() {
      $('.feedbackquestion2').text("Excellent");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;
 
     });

     $('.alternativeresponseQ2').on('click', function() {
      $('.feedbackquestion2').text("Why didn't you bring a No. 2 Pencil?");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ2bap').on('click', function() {
      $('.feedbackquestion2').text("You'll still need a No. 2 Pencil for the multiple choice section");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ2wof').on('click', function() {
      $('.feedbackquestion2').text("I can sell you a consonant for a fraction of what you'd spend on a vowel");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ2ae').on('click', function() {
      $('.feedbackquestion2').text("Anticipated? Is your computer powered by something other than electricity?");
     $('.form-check,.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

         //  Question 3

         $('.correctanswerQ3').on('click', function() {
          $('.feedbackquestion3').text("Excellent");
         $('.form-check-input3').attr('disabled',true).off('mouseenter mouseleave') ;
     
         });

         $('.alternativeresponseQ3ihn').on('click', function() {
          $('.feedbackquestion3').text("Why Haven't you prepared for this exam?");
         $('.form-check-input3').attr('disabled',true).off('mouseenter mouseleave') ;
    
         });

         $('.alternativeresponseQ3imh').on('click', function() {
          $('.feedbackquestion3').text("Are you sure? Nevermind.");
         $('.form-check-input3').attr('disabled',true).off('mouseenter mouseleave') ;
    
         });

         $('.alternativeresponseQ3dts').on('click', function() {
          $('.feedbackquestion3').text("It's your money");
         $('.form-check-input3').attr('disabled',true).off('mouseenter mouseleave') ;
    
         });