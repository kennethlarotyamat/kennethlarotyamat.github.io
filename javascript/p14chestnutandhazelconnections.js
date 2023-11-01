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





$('.correctanswerQ1').on('click', function() {
  $('.feedbackquestion1').text("Excellent!");
 $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

 });   $('.alternativeresponseQ1dn').on('click', function() {
  $('.feedbackquestion1').text("why don't you have a scantron?");
 $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

 });   $('.alternativeresponseQ1bb').on('click', function() {
  $('.feedbackquestion1').text("you'll still need a scantron for the multiple choice section of the exam.");
 $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

 });   $('.alternativeresponseQ1gb').on('click', function() {
  $('.feedbackquestion1').text("I think that i'll just go ahead and give you a scantron.");
 $('.form-check-input1').attr('disabled',true).off('mouseenter mouseleave') ;

 });



    $('.correctanswerQ2').on('click', function() {
      $('.feedbackquestion2').text("Excellent!");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;
 
     });

     $('.alternativeresponseQ2').on('click', function() {
      $('.feedbackquestion2').text("Why didn't you bring a No. 2 Pencil?");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ2bap').on('click', function() {
      $('.feedbackquestion2').text("You'll still need a No. 2 Pencil for the multiple choice section of the exam.");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ2wof').on('click', function() {
      $('.feedbackquestion2').text("I can sell you a consonant for a fraction of what you'd spend on a vowel.");
     $('.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });

     $('.alternativeresponseQ2ae').on('click', function() {
      $('.feedbackquestion2').text("Anticipated? Is your computer powered by something other than electricity?");
     $('.form-check,.form-check-input2').attr('disabled',true).off('mouseenter mouseleave') ;

     });



         $('.correctanswerQ3').on('click', function() {
          $('.feedbackquestion3').text("Excellent!");
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
          $('.feedbackquestion3').text("It's your money.");
         $('.form-check-input3').attr('disabled',true).off('mouseenter mouseleave') ;
    
         });



$('.correctanswerQ4').on('click', function() {
  $('.feedbackquestion4').text("Better be Sure.");
 $('.form-check-input4').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ4acc').on('click', function() {
  $('.feedbackquestion4').text("Why didn't you put it on your credit card and submit the receipt to amazon career choice?");
 $('.form-check-input4').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ4uac').on('click', function() {
  $('.feedbackquestion4').text("that coupon gives you a discount of negative ten percent, which is the same as paying a premium of positive ten percent. it's basically an inverse discount. so you'll need to pay another $40.95.");
 $('.form-check-input4').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ4dcc').on('click', function() {
  $('.feedbackquestion4').text("that discount code gives you a price reduction of negative ten percent, which is the same as giving you a price increase of positive ten percent. it's basically an inverse price reduction. so you'll need to pay another $40.95.");
 $('.form-check-input4').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ4qref').on('click', function() {
  $('.feedbackquestion4').text("guess what? you don't qualify!");
 $('.form-check-input4').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 

 $('.correctanswerQ5').on('click', function() {
  $('.feedbackquestion5').text("that's probably not going to happen. here.");
 $('.form-check-input5').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ5lbpb').on('click', function() {
  $('.feedbackquestion5').text("Is there any reason you didn't use a plastic bag?");
 $('.form-check-input5').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ5lwbp').on('click', function() {
  $('.feedbackquestion5').text("only if you enjoy eating nuts. Do you want to eat nuts? go ahead and eat nuts");
 $('.form-check-input5').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ5ybbthesquarerootofsixtynineiseightsomethingrightivebeentryingtoworkitoutoh').on('click', function() {
  $('.feedbackquestion5').text("You better believe it, in fact: you best be believing!");
 $('.form-check-input5').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeresponseQ5oddue').on('click', function() {
  $('.feedbackquestion5').text("was it a shrimp and calamari pizza with extra anchovies? because I had to eat that pizza hours ago, it was starting to smell like fish, anyway, it had my name on it,  i'm the one who wrote my name on it, but, you know. it had my name on it. as a result.");
 $('.form-check-input5').attr('disabled',true).off('mouseenter mouseleave') ;

 });



$('.alternativeanswerQ6wth').on('click', function() {
  $('.feedbackquestion6').text("welcome to the nightmare your life will soon become!");
 $('.form-check-input6').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeanswerQ6jgs').on('click', function() {
  $('.feedbackquestion6').text("you're nightmare is just getting warmed up!");
 $('.form-check-input6').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.correctanswerQ6').on('click', function() {
  $('.feedbackquestion6').text("That's a lot of four-hundred ninety-five dollar fees you're racking up there, slow down! you know you can't pass this exam, it changes too fast, on the regular in fact, maybe even the daily.");
 $('.form-check-input6').attr('disabled',true).off('mouseenter mouseleave') ;

 });



 $('.alternativeanswerQ6cswr').on('click', function() {
  $('.feedbackquestion6').text("I don't understand, is that what you brought for lunch? You could have had something nicer for lunch, yet here you are, spending $495 on an exam, you could have eaten that money! for lunch!");
 $('.form-check-input6').attr('disabled',true).off('mouseenter mouseleave') ;

 });



$('.correctanswerQ7').on('click', function() {
  $('.feedbackquestion7').text("that's impossible, i haven't assigned seats yet.");
 $('.form-check-input7').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeanswerQ7imn').on('click', function() {
  $('.feedbackquestion7').text("that's fine, i usually only assign seats once everyone has taken a seat.");
 $('.form-check-input7').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeanswerQ7iwat').on('click', function() {
  $('.feedbackquestion7').text("they will be, now pick a seat. any seat.");
 $('.form-check-input7').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeanswerQ7nctm').on('click', function() {
  $('.feedbackquestion7').text("look pal: it's on an x and y axis, now  figure it out on your own!");
 $('.form-check-input7').attr('disabled',true).off('mouseenter mouseleave') ;

 });



$('.alternativeanswerQ8cc').on('click', function() {
  $('.feedbackquestion8').text("You didn't spend your entire college fund on dates with Destiny, did you? or Dallas? What's that Palomino girl's name again?");
 $('.form-check-input8').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeanswerQ8dd').on('click', function() {
  $('.feedbackquestion8').text("The deep dive is actually a really great course, i'd stay enrolled in that course and add the bootcamp to your schedule.");
 $('.form-check-input8').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.alternativeanswerQ8pt').on('click', function() {
  $('.feedbackquestion8').text("You didn't hire that Palomino girl as your private tutor did you? What's her name again? Dallas? Destiny? those sessions aren't qualified educational expenses unless you're enrolled in. i don't know. yoga.");
 $('.form-check-input8').attr('disabled',true).off('mouseenter mouseleave') ;

 });

 $('.correctanswerQ8').on('click', function() {
  $('.feedbackquestion8').text("Don't be a philosopher. just take the exam and get on with your life. that'll be $495 by the way.");
 $('.form-check-input8').attr('disabled',true).off('mouseenter mouseleave') ;

 });






 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion8').text(" ");
 $('.form-check-input8').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion7').text(" ");
 $('.form-check-input7').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion7').text(" ");
 $('.form-check-input7').attr('disabled',false).on('mouseenter mouseleave') ;

 });



$('#resetExamButton').on('click', function() {
  $('.feedbackquestion6').text(" ");
 $('.form-check-input6').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion5').text(" ");
 $('.form-check-input5').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion4').text(" ");
 $('.form-check-input4').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion3').text(" ");
 $('.form-check-input3').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion2').text(" ");
 $('.form-check-input2').attr('disabled',false).on('mouseenter mouseleave') ;

 });

 $('#resetExamButton').on('click', function() {
  $('.feedbackquestion1').text(" ");
 $('.form-check-input1').attr('disabled',false).on('mouseenter mouseleave') ;

 });







//  ... [Start Solution Area]













//  var x = 121;
 
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome() 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
 
 
 
 
 
 
 
 
 
 
 
 
//  ... [End Solution Area]
 
//  I just completed the codewars version, and I'm coming back here to my leet code version, and it just. the solution I came up with seems 
//  so alien to me. there's so much stuff going on outside of the function. the two versions are different. obviously. but one. in one case. the 
//  leet code case, it's more for numbers, there's even a follow - up challenge where, they suggest trying to solve the same problem using 
//  some kind of mathematical formula. that's not something that can be done with words.
 
//  but the word version, the codewars you have to deal with upper and lower case letters, which is something that isn't a problem or 
//  something to be concerned about when working with numbers. in fact, when i realized. well, it wasn't the only problem, but one 
//  problem I was having was the to lower case part of the function. Anyway. I'm really glad that's over.
 
//  on to the haccker rank palindrome problem.
 
 
 
 
 
//  [Working Area Start]
 
//  ... [Final Working Version]
 
 
 
//  var x = 121;
 
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome() 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
 
 
//  ... [Final Working Version] [works in leetcode problem]
 
//  /**
//   * @param {number} x
//   * @return {boolean}
//   */
//  var isPalindrome = function(x) {
 
//      var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
     
//  };
 
//  ...
 
 
//  let x;
 
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number);
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome(x) 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  ...
 
//  var x = number;
 
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome() 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
//  ...
 
//  let digits = x;
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome(x) 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
//  ...
 
//  var x;
//  var number = x;
 
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome() 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
//  ...
 
//  let x;
//  let number
 
 
//  var digits = number.string(x).split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome() 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
//  ...
 
//  var x = 121;
 
//  var digits = x.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome() 
//  {    
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }
//  } 
//  isPalindrome("");
 
//  console.log(isPalindrome(""));
 
//  ... 
 
//  let myString6 = "1215";
//  function reverseString6() 
//  {    
//      var splitString6 = myString6.split(""); 
//      var reverseArray6 = splitString6.reverse();  
//      var joinArray6 = reverseArray6.join("");     
//      return joinArray6; 
//  } 
//  reverseString6("");
//  console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));
 
//  ...
 
//  [Working Area End]
 
//  ...
 
//  function isPalindrome()
//  {
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }   
//  }
//  isPalindrome("");
//  console.log(isPalindrome);
//  ...
 
//  var x = 123456;
 
//  var digits = num.toString().split('').reverse();
//  var reverseDigits = digits.map(Number)
//  console.log(reverseDigits);
 
//  var joinreverseDigits = reverseDigits.join('');
//  console.log(joinreverseDigits);
 
//  function isPalindrome
//  {
//        if (joinreverseDigits == x){
//            return true
//        } else {
//            return false
//        }   
//  }
 
//  console.log(isPalindrome);
 
//  ...
 
//  let myString6 = "1215";
//  function reverseString6() 
//  {    
//      var splitString6 = myString6.split(""); 
//      var reverseArray6 = splitString6.reverse();  
//      var joinArray6 = reverseArray6.join("");     
//      return joinArray6; 
//  } 
//  reverseString6("");
//  console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));
 
//  ...
 
//  /**
//   * @param {number} x
//   * @return {boolean}
//   */
//  // var isPalindrome = function(x) {
 
//  //     var result = Number(String(x).split('').reverse().join(''))
 
//  //     if (result == x){
//  //         return true
//  //     } else {
//  //         return false
//  //     }
     
//  // };
 
//  ...
 
//  [Reflections Start] 
 
//  I'm going to take a nap. this is a nightmare.
 
//  I really wanted to attend this: https://startupnv.org/maggie-saling-understanding-tam-sam-som-reno-nv/ 
 
//  Here is another thing I noticed, the person who used the same approach that I did, well, maybe 
//  it's more or less the most common approach. he used an if/else statement, and I used a Boolean.
 
//  I selected this palindrome problem because I've done it before in class. I don't know 
//  why I seem to have to learn JavaScript all over again every time I come around to it.
 
 
 
//  [Reflections End]
 
//  ... 
 
//  [working example]
 
//  let myString6 = "racecar";
//  function reverseString6() 
//  {    
//      var splitString6 = myString6.split(""); 
//      var reverseArray6 = splitString6.reverse();  
//      var joinArray6 = reverseArray6.join("");     
//      return joinArray6; 
//  } 
//  reverseString6("");
//  console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));
 
//  ...
 
//  ...
 
 
 
//  console.log("Part 1");
//  console.log(" ");
 
//  let myString = "This is not a palindrome";
 
 
//  // console.log(myString);
 
//  function reverseString() {
     
//      var splitString = myString.split(""); 
 
  
 
//      var reverseArray = splitString.reverse(); 
  
//      var joinArray = reverseArray.join(""); 
     
     
//      return joinArray; 
//  }
  
//  reverseString("");
 
//  console.log(reverseString());
 
//  console.log(" ");
//  console.log("Part 2");
//  console.log(" ");
 
//  let myString2 = "but it doesn't really matter anyway.";
 
//  function concatStrings() {
     
//      var twoStrings = myString.concat(", ",myString2); 
 
  
 
     
     
//      return twoStrings; 
//  }
//  concatStrings();
 
//  console.log(concatStrings());
 
//  console.log(" ");
//  console.log("Part 3");
//  console.log(" ");
 
//  let partThree = concatStrings()
 
//  function vowelSearch() {
     
//      var lowerCaseString = partThree.toLowerCase(myString.concat(", ",myString2));
//      var splitLcs = lowerCaseString.split("")
//      // var findA = splitLcs.replace("a","1")
//      // var findA = splitLcs.find("a")
//      // var findA = splitLcs.find(a)
//      // var findA = splitLcs.find("a")
//      // var findA = splitLcs.filter()
//      return splitLcs; 
//  }
//  vowelSearch();
//  // console.log(vowelSearch());
 
//  let vowelSearchArray = vowelSearch()
 
//  // console.log(vowelSearchArray);
 
//  const newArrayA = vowelSearchArray.filter(function(element) {
//    return element == "a";
//  });
 
//  // console.log(newArrayA);
 
//  const newArrayE = vowelSearchArray.filter(function(element) {
//    return element == "e";
//  });
 
//  // console.log(newArrayE);
 
//  const newArrayI = vowelSearchArray.filter(function(element) {
//    return element == "i";
//  });
 
//  // console.log(newArrayI);
 
//  const newArrayO = vowelSearchArray.filter(function(element) {
//    return element == "o";
//  });
 
//  // console.log(newArrayO);
 
//  const newArrayU = vowelSearchArray.filter(function(element) {
//    return element == "u";
//  });
 
//  // console.log(newArrayU);
 
//  // let myArray13 = ["a", "b", "c", "d", "e", "f", "a","e","e",];
//  // const newArray21 = myArray13.filter(function(element) {
//  //   return element == "e";
 
//  // });
 
//  // console.log(  newArray21);  
 
//  let allVowels = newArrayA.concat(newArrayE, newArrayI, newArrayO, newArrayU);
 
//  // console.log(  allVowels)
 
//  let numberOfVowels = allVowels.length;
 
//  console.log(  "Number of Vowels in String = " + numberOfVowels);
 
//  console.log(" ");
//  console.log("Part 4");
//  console.log(" ");
 
//  let p4String = (  myString + ", " + myString2 + " Number of Vowels in String = " + numberOfVowels);
 
//  // console.log(p4String);
 
//  function vowelSwap() {
     
//      var aForOh = p4String.replace(/a/g, "o"); 
 
  
 
     
     
//      return aForOh; 
//  }
//  vowelSwap();
 
//  console.log(vowelSwap());
 
//  console.log(" ");
//  console.log("Part 5");
//  console.log(" ");
 
//  let p5sTring = vowelSwap();
 
//  function noSpace() {
     
//      var iGottaBlankSpaceBaby = p5sTring.replace(/ /g, ""); 
 
  
 
     
     
//      return iGottaBlankSpaceBaby; 
//  }
//  noSpace();
 
//  console.log(noSpace());
 
//  console.log(" ");
//  console.log("Part 6");
//  console.log(" ");
 
//  let myString6 = "racecar";
 
 
//  // console.log(myString);
 
//  function reverseString6() {
     
//      var splitString6 = myString6.split(""); 
 
  
 
//      var reverseArray6 = splitString6.reverse(); 
  
//      var joinArray6 = reverseArray6.join(""); 
     
     
//      return joinArray6; 
//  }
  
//  reverseString6("");
 
//  console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));
 
//  console.log(" ");
//  console.log("Part 7");
//  console.log(" ");
 
//  let myString7 = "appkhgkgkjhghjkgkjhbkhjb8les";
 
//  function isStringAlphaNumeric() {
 
//      var toLowerCase7 = myString7.toLowerCase("");
//      var splitString7 = toLowerCase7.split(""); 
//      var trueFalse7 = splitString7.includes("q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","1","2","3","4","5","6","7","8","9","0",);
     
 
     
     
//      return trueFalse7 ; 
//  }
 
//  console.log(isStringAlphaNumeric());
 
//  ...
 
//  https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map
 
//  ...
 
//  [Good Lord. This is such a minor victory point]
 
//  var num = 123456;
 
//  var digits = num.toString().split('').reverse();
//  var realDigits = digits.map(Number)
//  console.log(realDigits);
 
//  var joinRealDigits = realDigits.join('');
//  console.log(joinRealDigits);
 
//  ...
 
 
 
//  var num = 123456;
//  var digits = num.toString().split('').reverse().join('');
//  var realDigits = digits.map(Number)
//  console.log(realDigits);
 
 
//  ...
 
 
 
//  var Number = 123456;
//  var digits = Number.toString().split('').reverse();
//  var realDigits = digits.map(Number);
//  console.log(realDigits);
 
 
 
 
//      {Number(String(x).split('').reverse().join(''))        }
 
 
 
 
//  https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toString
 
 
 
 
//  var num = 123456;
//  var digits = num.toString().split('').reverse().join('');
//  var realDigits = digits.map(Number)
//  console.log(realDigits);
 
 
 
 
//  var num = 123456;
//  var digits = num.toString().split('').reverse();
//  var realDigits = digits.map(Number)
//  console.log(realDigits);
 
 
 
//  var num = 123456;
//  var digits = num.toString().split(' ');
//  var realDigits = digits.map(Number);
//  console.log(realDigits);
 
 
 
//  var num = 123456;
//  var digits = num.toString().split('');
//  var realDigits = digits.map(Number)
//  console.log(realDigits);
 
 
 
 
//  Number(String(x).split('')
 
 
 
//  .join('')
 
 
 
//  )
 
 
 
//  file:///C:/Users/KLYam/OneDrive/Documents/GitHub/miscellaneous/other/project13/LeetCode/console.html
 
//  https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_split6
 
//  https://www.w3schools.com/jsref/jsref_split.asp
 
 
 
 
//  var num = 123456;
//  var digits = num.toString().split('');
//  var realDigits = digits.map(Number)
//  console.log(realDigits);
 
 
 
 
//  let text = 121;
//  const chars = text.split("");
//  console.log(chars);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
//  Number(String(x).split('').reverse().join(''))
 
//  let text = "121";
//  const myArray = text.split(" ");
//  console.log(myArray);
 
 
 
 
 
//  let x = 121;
 
//  var number = x;
//  const myArray = number.split(" ");
//  console.log(myArray);
 
 
 
//  let x = 121;
 
//  let text = x;
//  const myArray = text.split(" ");
//  console.log(myArray);
 
 
 
 
 
 
//  let x = 121;
 
//  console.log(x);
 
//  let text = x;
//  const myArray = text.split(" ");
 
//  console.log(myArray);
 
//  <!DOCTYPE html>
//  <html>
//  <body>
 
//  <h1>JavaScript Strings</h1>
//  <h2>The split() Method</h2>
 
//  <p>split() splits a string into an array of substrings, and returns the array:</p>
 
//  <p id="demo"></p>
 
//  <script>
//  let text = "How are you doing today?";
//  const myArray = text.split(" ");
 
//  document.getElementById("demo").innerHTML = myArray; 
//  </script>
 
//  </body>
//  </html>
 
 
 
 
 
 
 
 
//  let x = 121;
 
//  console.log(x);
 
//  var isPalindrome = function(x) {
 
//      var palindromeTester = Number(String(x).split('').reverse().join(''))
 
//      if (result == x){
//          return true
//      } else {
//          return false
//      }
     
//  };
 
//  console.log(isPalindrome);
 
 
//  [End]
 
//  let palindromeTester
 
//  var isPalindrome = function(x) {
 
//      var palindromeTester = Number(String(x).split('').reverse().join(''))
 
//      if (result == x){
//          return true
//      } else {
//          return false
//      }
     
//  };
 
//  console.log(palindromeTester);
 
 
 
 
 
 
//  [Notes]
 
//  Intro to Variables
//  Variables are used in programming to store and manipulate data. In JavaScript, there are three different keywords used for declaring variables: var, let, and const. The main difference between these is something called “scope” which we will cover later.
//  var:
//  The var keyword is used to declare a variable globally or locally in a function. Variables declared with var are function-scoped, meaning they are only accessible within the function in which they are declared or in the global scope if they are declared outside a function
//  let:
//  The let keyword is used to declare a block-scoped variable. This means that variables declared with let are only accessible within the block they are declared in, including any nested blocks.
//  const:
//  The const keyword is used to declare a block-scoped variable that cannot be reassigned. This means that once a variable is declared with const, its value cannot be changed. However, note that the value of an object or an array declared with const can be modified, but the variable cannot be reassigned to a different value.
//  💡 PRO TIP: The var keyword, though it is still valid, is an older way of declaring variables. Almost all modern JavaScript will use either let or const!
//  When deciding between let and const, think about whether the value of the variable should be allowed to change or not. If it should not be changed, use const; otherwise, use let.
//  Next, let’s talk briefly about naming conventions. This applies to naming both variables and functions, when the name given is made up of several words. The most common convention in JavaScript is to use what is called camel case. This means that the first letter of the first word in the name is lowercase, while in each subsequent word in the name the first letter is uppercase. Let’s look at an example to illustrate this:
//  mySuperAwesomeVariableName
//  While this example may be a bit over the top, it illustrates the point. The reason why this is the most commonly used naming convention is because it helps greatly with code readability.
//  With that in mind, let’s move on to another important point – namely, the difference between declaring a variable and initializing a variable. Declaring a variable means simply creating a variable (e.g. - let myVariable), while initializing a variable means giving it an initial value. With let you can declare a variable without initializing it; with const, however, you MUST also give it an initial value.
//  Let’s look at some examples of declaring variables and constants in JavaScript:
 
 
 
 
 
//  let x = 10;
//  x += 5; // equivalent to x = x + 5;
 
//  console.log(x); // output: 15
 
 
//  let y = 20;
//  y -= 10; // equivalent to y = y - 10;
 
//  console.log(y); // output: 10
 
//  let num1 = 10;
//  let num2 = 5;
 
//  let additionExample = num1 + num2;
 
//  console.log(additionExample); // Output: 15
 
//  function logMessage() {
//    console.log("Hello, world!");
//  }
 
 
//  setInterval(logMessage, 1000);
 
//  const arr1 = [1, 2, 3];
//  const arr2 = [4, 5, 6];
//  const combinedArr = [...arr1, ...arr2];
//  console.log(combinedArr); // Output: [1, 2, 3, 4, 5, 6]
 
//  [End]
 
//  var x = 121
//  var isPalindrome = function(x) {
 
//      var result = Number(String(x).split('').reverse().join(''))
 
//      if (result == x){
//          return true
//      } else {
//          return false
//      }
 
//  };
 
//  console.log(isPalindrome);
 
//  if (x == isPalindrome) {
//    console.log("This is a palindrome.");
//  } else {
//    console.log("This is not a palindrome.");
//  }
 
//  console.log(isPalindrome);    
 
//  [Start]
 
//  var x = 1215
//  var isPalindrome = function(palindromeTester) {
 
 
//   var reverse = 0;
//      var copy = x;
 
//      while (copy > 0) {
//        const digit = copy % 10;
//        reverse = reverse * 10 + digit;
//        copy = ~~(copy / 10);
//      }
 
//      return reverse == x;
//  }
 
//  console.log(isPalindrome);
 
//  if (x == isPalindrome) {
//    console.log("This is a palindrome.");
//  } else {
//    console.log("This is not a palindrome.");
//  }
 
//  [End]
 
//  [Reflections Start]
 
//  I think that I'm slowly figuring this out.
 
//  ...
 
//  What happened. well I found that there is a hide button on Slack, and I can basically
//  tune out anyone who I really don't need to waste time interacting with. It's useless to 
//  tell me that I don't know something, after I've clearly stated that I don't know something,
//  and that I'm seeking information about how to resolve it. Useless. Aggravating.
 
//  Anyway. I looked at other LeetCode solutions in the solutions section, and they work in LeetCode, but 
//  I don't know how to make them work in a regular environment, and so, like. learning things in LeetCode
//  are going to be useless unless I can figure out how to use these lessons in a regular environment.
 
//  I can't believe it's Saturday already.
 
//  [Reflections Start]
 
//  [Notes from Course Material Start]
 
//  Comparison Operators
 
//  Comparison operators are used in JavaScript to compare values and return a Boolean value (true or false). 
 
//  There are several comparison operators available in JavaScript:
 
//  Equal to (==): Returns true if two values are equal, regardless of their data types.
//  Not equal to (!=): Returns true if two values are not equal.
//  Strict equal to (===): Returns true if two values are equal and have the same data type.
//  Strict not equal to (!==): Returns true if two values are not equal or do not have the same data type.
//  Greater than (>): Returns true if one value is greater than another.
//  Less than (<): Returns true if one value is less than another.
//  Greater than or equal to (>=): Returns true if one value is greater than or equal to another.
//  Less than or equal to (<=): Returns true if one value is less than or equal to another.
 
//  [Notes from Course Material End]
 
//  [LeetCode Reflections Start]
 
//  [References:]   [https://firefox-source-docs.mozilla.org/devtools-user/web_console/index.html]
//                  [https://stackoverflow.com/questions/20256760/javascript-console-log-to-html]
//                  [https://en.wikipedia.org/wiki/Major-General%27s_Song]
//                  [https://stackoverflow.com/questions/20256760/javascript-console-log-to-html]
 
//  One of the issues that I'm having with JavaScript is that I can't really see what 
//  I'm doing.
 
//  ...
 
//  I really don't know how to work with this LeetCode stuff.
//  I started off with this one problem, but, I had to shift to a different
//  one.
 
//  I'm shifting to the palindrome question.
 
//  [LeetCode Reflections End]
 
//  [Thread Start]
 
//  Kenneth Larot Yamat
 
//  This company reached out to me on LinkedIn, but when I looked at 
//  their website it appeared rife with irregularities - https://thinkfish.co - 
//  but it got me thinking about pitching a business idea and seeking funding, but 
//  I really don't know much about that process other than what I've seen on 
//  SharkTank and a college elective that I took 14 years ago.
 
//  Classmate
 
//  The fact that you referenced a staged reality show and a singular 
//  class you took 14 yrs ago as your know-how. I would suggest that you 
//  stick with this and make it work. I promise pitching and gathering 
//  funding for an on-the-whim idea is absolutely not as simple as TV makes it seem.
 
//  Kenneth Larot Yamat
 
//  My business idea would either be a software program or 
//  a website, or some kind of mobile app. 
 
//  [Thread End]
 
//  Kenneth Larot Yamat [Reflections Start]
 
//  I need to stay away from people like this. I already noted that I don't really 
//  have experience pitching business ideas and seeking funding, but she seems to 
//  flip it around as though I was listing it as a kind of extensive expertise or something. 
 
//  There isn't really an option to block people in slack, but, people who are cynical in 
//  a way that really isn't helpful, like, I don't know what to do about that.
 
//  Saying that it's not easy is something that I'm already aware of, and telling me that 
//  I don't know how to do it is something that I'm also already aware of. I was posting
//  it to see if anyone had any ideas about how the process worked. 
 
//  I don't need someone to tell me I don't know how to do something. I already know that.
//  The other thing is that she seems to put forward the idea that starting a business, and 
//  attending class are in some way mutually exclusive, and I try to point out that the two are 
//  actually concurrent.
 
//  I don't know what it is, but I always come across this:
//  I ask for help, and the response is usually: 
//  You don't know what you're doing.
//  and.
 
//  I'm just thinking: well that couldn't be more obvious, if 
//  I knew what I was doing, I wouldn't 
//  be asking for help. There was another one of these situations.
 
//  Kenneth Larot Yamat [Reflections End]
 
//  [Thread Start]
 
//  Kenneth Larot Yamat
 
//  A role that I applied for stated: Experience in front-end 
//  frameworks like Angular, React, Backbone, and JQuery
//  I listed bootstrap as a front-end framework that I have 
//  experience with, but do these other frameworks work in 
//  essentially the same way as bootstrap?
 
//  Classmate
 
//  no, bootstrap is just for design, and don't list 
//  things you don't know in resume just to pass ATS
 
//  [Thread End]
 
//  Kenneth Larot Yamat [Reflections Start]
 
//  This was another aggravating conversation. This person insunuates that I plan on lying on my resume. 
//  The other thing is that I think of front-end as referring to design, rather than function. This was 
//  another person I wanted to block. I already deal with a lot of useless stuff as it is. right. I don't 
//  need more useless conversations, especially ones that aggravate me.
 
//  The other thing is: These might not be real people, they might just be cynical remark chatbot or 
//  negative energy chatbots or cynical remark text generators. so I shouldn't pay too much attention
//  to these kind of comments.
 
//  Are you a cynical remark text generator? My business idea would either 
//  be a software program or a website, or some kind of mobile app.
 
//  Are you a cynical remark text generator? 
 
//  I changed that. I don't need to be as toxic as other people.
 
//  Kenneth Larot Yamat [Reflections End]
 
 
 
 
 
 
// ... [Start Solution Area]













// var x = 121;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));













// ... [End Solution Area]

// I just completed the codewars version, and I'm coming back here to my leet code version, and it just. the solution I came up with seems 
// so alien to me. there's so much stuff going on outside of the function. the two versions are different. obviously. but one. in one case. the 
// leet code case, it's more for numbers, there's even a follow - up challenge where, they suggest trying to solve the same problem using 
// some kind of mathematical formula. that's not something that can be done with words.

// but the word version, the codewars you have to deal with upper and lower case letters, which is something that isn't a problem or 
// something to be concerned about when working with numbers. in fact, when i realized. well, it wasn't the only problem, but one 
// problem I was having was the to lower case part of the function. Anyway. I'm really glad that's over.

// on to the haccker rank palindrome problem.





// [Working Area Start]

// ... [Final Working Version]



// var x = 121;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));



// ... [Final Working Version] [works in leetcode problem]

// /**
//  * @param {number} x
//  * @return {boolean}
//  */
// var isPalindrome = function(x) {

//     var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
    
// };

// ...


// let x;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number);
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome(x) 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// ...

// var x = number;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// let digits = x;
// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome(x) 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// var x;
// var number = x;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// let x;
// let number


// var digits = number.string(x).split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// var x = 121;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ... 

// let myString6 = "1215";
// function reverseString6() 
// {    
//     var splitString6 = myString6.split(""); 
//     var reverseArray6 = splitString6.reverse();  
//     var joinArray6 = reverseArray6.join("");     
//     return joinArray6; 
// } 
// reverseString6("");
// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// ...

// [Working Area End]

// ...

// function isPalindrome()
// {
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }   
// }
// isPalindrome("");
// console.log(isPalindrome);
// ...

// var x = 123456;

// var digits = num.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome
// {
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }   
// }

// console.log(isPalindrome);

// ...

// let myString6 = "1215";
// function reverseString6() 
// {    
//     var splitString6 = myString6.split(""); 
//     var reverseArray6 = splitString6.reverse();  
//     var joinArray6 = reverseArray6.join("");     
//     return joinArray6; 
// } 
// reverseString6("");
// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// ...

// /**
//  * @param {number} x
//  * @return {boolean}
//  */
// // var isPalindrome = function(x) {

// //     var result = Number(String(x).split('').reverse().join(''))

// //     if (result == x){
// //         return true
// //     } else {
// //         return false
// //     }
    
// // };

// ...

// [Reflections Start] 

// I'm going to take a nap. this is a nightmare.

// I really wanted to attend this: https://startupnv.org/maggie-saling-understanding-tam-sam-som-reno-nv/ 

// Here is another thing I noticed, the person who used the same approach that I did, well, maybe 
// it's more or less the most common approach. he used an if/else statement, and I used a Boolean.

// I selected this palindrome problem because I've done it before in class. I don't know 
// why I seem to have to learn JavaScript all over again every time I come around to it.



// [Reflections End]

// ... 

// [working example]

// let myString6 = "racecar";
// function reverseString6() 
// {    
//     var splitString6 = myString6.split(""); 
//     var reverseArray6 = splitString6.reverse();  
//     var joinArray6 = reverseArray6.join("");     
//     return joinArray6; 
// } 
// reverseString6("");
// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// ...

// ...



// console.log("Part 1");
// console.log(" ");

// let myString = "This is not a palindrome";


// // console.log(myString);

// function reverseString() {
    
//     var splitString = myString.split(""); 

 

//     var reverseArray = splitString.reverse(); 
 
//     var joinArray = reverseArray.join(""); 
    
    
//     return joinArray; 
// }
 
// reverseString("");

// console.log(reverseString());

// console.log(" ");
// console.log("Part 2");
// console.log(" ");

// let myString2 = "but it doesn't really matter anyway.";

// function concatStrings() {
    
//     var twoStrings = myString.concat(", ",myString2); 

 

    
    
//     return twoStrings; 
// }
// concatStrings();

// console.log(concatStrings());

// console.log(" ");
// console.log("Part 3");
// console.log(" ");

// let partThree = concatStrings()

// function vowelSearch() {
    
//     var lowerCaseString = partThree.toLowerCase(myString.concat(", ",myString2));
//     var splitLcs = lowerCaseString.split("")
//     // var findA = splitLcs.replace("a","1")
//     // var findA = splitLcs.find("a")
//     // var findA = splitLcs.find(a)
//     // var findA = splitLcs.find("a")
//     // var findA = splitLcs.filter()
//     return splitLcs; 
// }
// vowelSearch();
// // console.log(vowelSearch());

// let vowelSearchArray = vowelSearch()

// // console.log(vowelSearchArray);

// const newArrayA = vowelSearchArray.filter(function(element) {
//   return element == "a";
// });

// // console.log(newArrayA);

// const newArrayE = vowelSearchArray.filter(function(element) {
//   return element == "e";
// });

// // console.log(newArrayE);

// const newArrayI = vowelSearchArray.filter(function(element) {
//   return element == "i";
// });

// // console.log(newArrayI);

// const newArrayO = vowelSearchArray.filter(function(element) {
//   return element == "o";
// });

// // console.log(newArrayO);

// const newArrayU = vowelSearchArray.filter(function(element) {
//   return element == "u";
// });

// // console.log(newArrayU);

// // let myArray13 = ["a", "b", "c", "d", "e", "f", "a","e","e",];
// // const newArray21 = myArray13.filter(function(element) {
// //   return element == "e";

// // });

// // console.log(  newArray21);  

// let allVowels = newArrayA.concat(newArrayE, newArrayI, newArrayO, newArrayU);

// // console.log(  allVowels)

// let numberOfVowels = allVowels.length;

// console.log(  "Number of Vowels in String = " + numberOfVowels);

// console.log(" ");
// console.log("Part 4");
// console.log(" ");

// let p4String = (  myString + ", " + myString2 + " Number of Vowels in String = " + numberOfVowels);

// // console.log(p4String);

// function vowelSwap() {
    
//     var aForOh = p4String.replace(/a/g, "o"); 

 

    
    
//     return aForOh; 
// }
// vowelSwap();

// console.log(vowelSwap());

// console.log(" ");
// console.log("Part 5");
// console.log(" ");

// let p5sTring = vowelSwap();

// function noSpace() {
    
//     var iGottaBlankSpaceBaby = p5sTring.replace(/ /g, ""); 

 

    
    
//     return iGottaBlankSpaceBaby; 
// }
// noSpace();

// console.log(noSpace());

// console.log(" ");
// console.log("Part 6");
// console.log(" ");

// let myString6 = "racecar";


// // console.log(myString);

// function reverseString6() {
    
//     var splitString6 = myString6.split(""); 

 

//     var reverseArray6 = splitString6.reverse(); 
 
//     var joinArray6 = reverseArray6.join(""); 
    
    
//     return joinArray6; 
// }
 
// reverseString6("");

// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// console.log(" ");
// console.log("Part 7");
// console.log(" ");

// let myString7 = "appkhgkgkjhghjkgkjhbkhjb8les";

// function isStringAlphaNumeric() {

//     var toLowerCase7 = myString7.toLowerCase("");
//     var splitString7 = toLowerCase7.split(""); 
//     var trueFalse7 = splitString7.includes("q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","1","2","3","4","5","6","7","8","9","0",);
    

    
    
//     return trueFalse7 ; 
// }

// console.log(isStringAlphaNumeric());

// ...

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map

// ...

// [Good Lord. This is such a minor victory point]

// var num = 123456;

// var digits = num.toString().split('').reverse();
// var realDigits = digits.map(Number)
// console.log(realDigits);

// var joinRealDigits = realDigits.join('');
// console.log(joinRealDigits);

// ...



// var num = 123456;
// var digits = num.toString().split('').reverse().join('');
// var realDigits = digits.map(Number)
// console.log(realDigits);


// ...



// var Number = 123456;
// var digits = Number.toString().split('').reverse();
// var realDigits = digits.map(Number);
// console.log(realDigits);




//     {Number(String(x).split('').reverse().join(''))        }




// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toString




// var num = 123456;
// var digits = num.toString().split('').reverse().join('');
// var realDigits = digits.map(Number)
// console.log(realDigits);




// var num = 123456;
// var digits = num.toString().split('').reverse();
// var realDigits = digits.map(Number)
// console.log(realDigits);



// var num = 123456;
// var digits = num.toString().split(' ');
// var realDigits = digits.map(Number);
// console.log(realDigits);



// var num = 123456;
// var digits = num.toString().split('');
// var realDigits = digits.map(Number)
// console.log(realDigits);




// Number(String(x).split('')



// .join('')



// )



// file:///C:/Users/KLYam/OneDrive/Documents/GitHub/miscellaneous/other/project13/LeetCode/console.html

// https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_split6

// https://www.w3schools.com/jsref/jsref_split.asp




// var num = 123456;
// var digits = num.toString().split('');
// var realDigits = digits.map(Number)
// console.log(realDigits);




// let text = 121;
// const chars = text.split("");
// console.log(chars);




















// Number(String(x).split('').reverse().join(''))

// let text = "121";
// const myArray = text.split(" ");
// console.log(myArray);





// let x = 121;

// var number = x;
// const myArray = number.split(" ");
// console.log(myArray);



// let x = 121;

// let text = x;
// const myArray = text.split(" ");
// console.log(myArray);






// let x = 121;

// console.log(x);

// let text = x;
// const myArray = text.split(" ");

// console.log(myArray);

// <!DOCTYPE html>
// <html>
// <body>

// <h1>JavaScript Strings</h1>
// <h2>The split() Method</h2>

// <p>split() splits a string into an array of substrings, and returns the array:</p>

// <p id="demo"></p>

// <script>
// let text = "How are you doing today?";
// const myArray = text.split(" ");

// document.getElementById("demo").innerHTML = myArray; 
// </script>

// </body>
// </html>








// let x = 121;

// console.log(x);

// var isPalindrome = function(x) {

//     var palindromeTester = Number(String(x).split('').reverse().join(''))

//     if (result == x){
//         return true
//     } else {
//         return false
//     }
    
// };

// console.log(isPalindrome);


// [End]

// let palindromeTester

// var isPalindrome = function(x) {

//     var palindromeTester = Number(String(x).split('').reverse().join(''))

//     if (result == x){
//         return true
//     } else {
//         return false
//     }
    
// };

// console.log(palindromeTester);






// [Notes]

// Intro to Variables
// Variables are used in programming to store and manipulate data. In JavaScript, there are three different keywords used for declaring variables: var, let, and const. The main difference between these is something called “scope” which we will cover later.
// var:
// The var keyword is used to declare a variable globally or locally in a function. Variables declared with var are function-scoped, meaning they are only accessible within the function in which they are declared or in the global scope if they are declared outside a function
// let:
// The let keyword is used to declare a block-scoped variable. This means that variables declared with let are only accessible within the block they are declared in, including any nested blocks.
// const:
// The const keyword is used to declare a block-scoped variable that cannot be reassigned. This means that once a variable is declared with const, its value cannot be changed. However, note that the value of an object or an array declared with const can be modified, but the variable cannot be reassigned to a different value.
// 💡 PRO TIP: The var keyword, though it is still valid, is an older way of declaring variables. Almost all modern JavaScript will use either let or const!
// When deciding between let and const, think about whether the value of the variable should be allowed to change or not. If it should not be changed, use const; otherwise, use let.
// Next, let’s talk briefly about naming conventions. This applies to naming both variables and functions, when the name given is made up of several words. The most common convention in JavaScript is to use what is called camel case. This means that the first letter of the first word in the name is lowercase, while in each subsequent word in the name the first letter is uppercase. Let’s look at an example to illustrate this:
// mySuperAwesomeVariableName
// While this example may be a bit over the top, it illustrates the point. The reason why this is the most commonly used naming convention is because it helps greatly with code readability.
// With that in mind, let’s move on to another important point – namely, the difference between declaring a variable and initializing a variable. Declaring a variable means simply creating a variable (e.g. - let myVariable), while initializing a variable means giving it an initial value. With let you can declare a variable without initializing it; with const, however, you MUST also give it an initial value.
// Let’s look at some examples of declaring variables and constants in JavaScript:





// let x = 10;
// x += 5; // equivalent to x = x + 5;

// console.log(x); // output: 15


// let y = 20;
// y -= 10; // equivalent to y = y - 10;

// console.log(y); // output: 10

// let num1 = 10;
// let num2 = 5;

// let additionExample = num1 + num2;

// console.log(additionExample); // Output: 15

// function logMessage() {
//   console.log("Hello, world!");
// }


// setInterval(logMessage, 1000);

// const arr1 = [1, 2, 3];
// const arr2 = [4, 5, 6];
// const combinedArr = [...arr1, ...arr2];
// console.log(combinedArr); // Output: [1, 2, 3, 4, 5, 6]

// [End]

// var x = 121
// var isPalindrome = function(x) {

//     var result = Number(String(x).split('').reverse().join(''))

//     if (result == x){
//         return true
//     } else {
//         return false
//     }

// };

// console.log(isPalindrome);

// if (x == isPalindrome) {
//   console.log("This is a palindrome.");
// } else {
//   console.log("This is not a palindrome.");
// }

// console.log(isPalindrome);    

// [Start]

// var x = 1215
// var isPalindrome = function(palindromeTester) {


//  var reverse = 0;
//     var copy = x;

//     while (copy > 0) {
//       const digit = copy % 10;
//       reverse = reverse * 10 + digit;
//       copy = ~~(copy / 10);
//     }

//     return reverse == x;
// }

// console.log(isPalindrome);

// if (x == isPalindrome) {
//   console.log("This is a palindrome.");
// } else {
//   console.log("This is not a palindrome.");
// }

// [End]

// [Reflections Start]

// I think that I'm slowly figuring this out.

// ...

// What happened. well I found that there is a hide button on Slack, and I can basically
// tune out anyone who I really don't need to waste time interacting with. It's useless to 
// tell me that I don't know something, after I've clearly stated that I don't know something,
// and that I'm seeking information about how to resolve it. Useless. Aggravating.

// Anyway. I looked at other LeetCode solutions in the solutions section, and they work in LeetCode, but 
// I don't know how to make them work in a regular environment, and so, like. learning things in LeetCode
// are going to be useless unless I can figure out how to use these lessons in a regular environment.

// I can't believe it's Saturday already.

// [Reflections Start]

// [Notes from Course Material Start]

// Comparison Operators

// Comparison operators are used in JavaScript to compare values and return a Boolean value (true or false). 

// There are several comparison operators available in JavaScript:

// Equal to (==): Returns true if two values are equal, regardless of their data types.
// Not equal to (!=): Returns true if two values are not equal.
// Strict equal to (===): Returns true if two values are equal and have the same data type.
// Strict not equal to (!==): Returns true if two values are not equal or do not have the same data type.
// Greater than (>): Returns true if one value is greater than another.
// Less than (<): Returns true if one value is less than another.
// Greater than or equal to (>=): Returns true if one value is greater than or equal to another.
// Less than or equal to (<=): Returns true if one value is less than or equal to another.

// [Notes from Course Material End]

// [LeetCode Reflections Start]

// [References:]   [https://firefox-source-docs.mozilla.org/devtools-user/web_console/index.html]
//                 [https://stackoverflow.com/questions/20256760/javascript-console-log-to-html]
//                 [https://en.wikipedia.org/wiki/Major-General%27s_Song]
//                 [https://stackoverflow.com/questions/20256760/javascript-console-log-to-html]

// One of the issues that I'm having with JavaScript is that I can't really see what 
// I'm doing.

// ...

// I really don't know how to work with this LeetCode stuff.
// I started off with this one problem, but, I had to shift to a different
// one.

// I'm shifting to the palindrome question.

// [LeetCode Reflections End]

// [Thread Start]

// Kenneth Larot Yamat

// This company reached out to me on LinkedIn, but when I looked at 
// their website it appeared rife with irregularities - https://thinkfish.co - 
// but it got me thinking about pitching a business idea and seeking funding, but 
// I really don't know much about that process other than what I've seen on 
// SharkTank and a college elective that I took 14 years ago.

// Classmate

// The fact that you referenced a staged reality show and a singular 
// class you took 14 yrs ago as your know-how. I would suggest that you 
// stick with this and make it work. I promise pitching and gathering 
// funding for an on-the-whim idea is absolutely not as simple as TV makes it seem.

// Kenneth Larot Yamat

// My business idea would either be a software program or 
// a website, or some kind of mobile app. 

// [Thread End]

// Kenneth Larot Yamat [Reflections Start]

// I need to stay away from people like this. I already noted that I don't really 
// have experience pitching business ideas and seeking funding, but she seems to 
// flip it around as though I was listing it as a kind of extensive expertise or something. 

// There isn't really an option to block people in slack, but, people who are cynical in 
// a way that really isn't helpful, like, I don't know what to do about that.

// Saying that it's not easy is something that I'm already aware of, and telling me that 
// I don't know how to do it is something that I'm also already aware of. I was posting
// it to see if anyone had any ideas about how the process worked. 

// I don't need someone to tell me I don't know how to do something. I already know that.
// The other thing is that she seems to put forward the idea that starting a business, and 
// attending class are in some way mutually exclusive, and I try to point out that the two are 
// actually concurrent.

// I don't know what it is, but I always come across this:
// I ask for help, and the response is usually: 
// You don't know what you're doing.
// and.

// I'm just thinking: well that couldn't be more obvious, if 
// I knew what I was doing, I wouldn't 
// be asking for help. There was another one of these situations.

// Kenneth Larot Yamat [Reflections End]

// [Thread Start]

// Kenneth Larot Yamat

// A role that I applied for stated: Experience in front-end 
// frameworks like Angular, React, Backbone, and JQuery
// I listed bootstrap as a front-end framework that I have 
// experience with, but do these other frameworks work in 
// essentially the same way as bootstrap?

// Classmate

// no, bootstrap is just for design, and don't list 
// things you don't know in resume just to pass ATS

// [Thread End]

// Kenneth Larot Yamat [Reflections Start]

// This was another aggravating conversation. This person insunuates that I plan on lying on my resume. 
// The other thing is that I think of front-end as referring to design, rather than function. This was 
// another person I wanted to block. I already deal with a lot of useless stuff as it is. right. I don't 
// need more useless conversations, especially ones that aggravate me.

// The other thing is: These might not be real people, they might just be cynical remark chatbot or 
// negative energy chatbots or cynical remark text generators. so I shouldn't pay too much attention
// to these kind of comments.

// Are you a cynical remark text generator? My business idea would either 
// be a software program or a website, or some kind of mobile app.

// Are you a cynical remark text generator? 

// I changed that. I don't need to be as toxic as other people.

// Kenneth Larot Yamat [Reflections End]

/* <!-- <script src="https://kennethlarotyamat.github.io/miscellaneous/index.js"></script> -->

<!-- <script src="https://[username].github.io/[repository]/[filename].js"></script> -->

<!-- <link rel="stylesheet" href="https://kennethlarotyamat.github.io/miscellaneous/index.css"> -->
<!-- <script src="https://kennethlarotyamat.github.io/miscellaneous/index.css"></script> -->

<!-- <script src="https://kennethlarotyamat.github.io/miscellaneous/index.js"></script> -->

<!-- <script src="https://[username].github.io/[repository]/[filename].js"></script> -->
 */

// <!-- <link rel="stylesheet" href="https://kennethlarotyamat.github.io/miscellaneous/index.css"> -->
// <!-- <script src="https://kennethlarotyamat.github.io/miscellaneous/index.css"></script> -->

// <!-- <script src="https://kennethlarotyamat.github.io/miscellaneous/index.js"></script> -->

// <!-- <script src="https://[username].github.io/[repository]/[filename].js"></script> -->

/* Chestnut + Hazel's Miscellaneous Repository README.md

...

"Everything I had done has to be done 
over; I was on the wrong track entirely, 
and after working hard most of that time: 
I'm still only at the beginning." 

- Gustave Flaubert

...

This repository was created as a requirement for
completing project 13. I honestly did not want to
create a whole new repository, but, here we are.

...

William Carlos Williams

"The Young Housewife"  (1916)

At ten A.M. the young housewife
moves about in negligee behind
the wooden walls of her husband's house.
I pass solitary in my car.

Then again she comes to the curb
to call the ice-man, fish-man, and stands
shy, uncorseted, tucking in
stray ends of hair, and I compare her
to a fallen leaf.

The noiseless wheels of my car
rush with a crackling sound over
dried leaves as I bow and pass smiling.

...

WILLIAM CARLOS WILLIAMS

"The Red Wheelbarrow" (1938)

so much depends
upon

a red wheel
barrow

glazed with rain
water

beside the white
chickens

...

William Carlos Williams

"This Is Just To Say" (1962)

I have eaten
the plums
that were in
the icebox

and which
you were probably
saving
for breakfast

Forgive me
they were delicious
so sweet
and so cold

...

Kenneth Larot Yamat

"This Is Just To Say Something About The Young Housewife" (2023)

I totally ate all of the  so many    fried turkeys
that were hanging out
by the red wheelbarrow
you know     the one glazed with
soy sauce and beside the 
                      kentucky fried 
                             kung pao chickens
           which 
themselves were drenched in
              tabasco sauce

I request neither forgiveness
nor do I intend to apologize for
          my actions 

because 

I spent several hours
of quality time
with a certain young housewife

                    who

braless and dressed in negligee 

          and 

whose wild hair suggested
she spent even more additional
even higher quality time with
both the ice man
and the fish man

       either sequentially 
               or 
              simultaneously 
                     neither would surprise me

left me    breathless    exhausted
as well as      famished

I thought I gave a good
account of myself

but then along came 
          the milkman
and    she             still
   had enough energy 
       for 
    round four

I was there
I saw it all

... */




   