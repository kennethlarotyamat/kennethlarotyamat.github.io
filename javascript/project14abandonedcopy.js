
// [Color / Grayscale Toggle Start]

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
      "Pinkscale" : "Color";

    modeStatus.text(modeMessage);
  }

  modeToggle.click(toggleMode);
});

// [Color / Grayscale Toggle End]  



// [Swipe Left / Swipe Right Start]
const images = document.querySelectorAll('#sliderproject10 iframe');
const previousImage = document.getElementById("prevproject10");
const nextImage = document.getElementById("nextproject10");

let currentIndex = 0;
 
function reset() {
  for (let i = 0; i < images.length; i++) {
    images[i].classList.remove('active');
  }
}

function initializeSlider() {
  reset();
  images[currentIndex].classList.add('active');
} 
 
function slideLeft() {
  reset();
  currentIndex--;
  if (currentIndex < 0) {
    currentIndex = images.length - 1;
  }
  images[currentIndex].classList.add('active');
}
 
function slideRight() {
  reset();
  currentIndex++;
  if (currentIndex >= images.length) {
    currentIndex = 0;
  }
  images[currentIndex].classList.add('active');
}

initializeSlider();

previousImage.addEventListener('click', function() {
  slideLeft();
});

nextImage.addEventListener('click', function() {
  slideRight();
});

// [Swipe Left / Swipe Right End]

// [Name Toggle Start]




const userNameDisplay = document.querySelector('.usernamedisplay');
const modeToggleR = document.getElementById("nextproject10");
const modeStatusCN = document.querySelector('.mode-statusCN');

function toggleModeCN() {
userNameDisplay.classList.toggle('EGdark-mode');
const modeMessageCN = userNameDisplay.classList.contains('EGdark-mode') ?
'Elizabeth Grant'
: "Audrey Hepburn";
modeStatusCN.innerText = "Currently Viewing " + modeMessageCN;}
modeToggleR.addEventListener('click', toggleModeCN);








function                                                 toggleModeCNjm() {
  userNameDisplay.classList.toggle                       ('jmEGdark-mode');
  const                                                  modeMessageCNjm = userNameDisplay.classList.contains     
                                                         ('jmEGdark-mode') ?
                                                          'Elizabeth Grant '
                                                           : " Josephine McClellan " ;
  modeStatusCN.innerText = "Currently Viewing " +          modeMessageCNjm;}
  modeToggleR.addEventListener('click',                    toggleModeCNjm);

  // this is working, but it's going to take forever, and once I'm finished, I would have to do this for the left button.







































// const userNameDisplay = document.querySelector('usernamedisplay');
// const modeStatusCN = document.querySelector('.mode-statusCN');

// function toggleUserNameMode() {



  // Toggle the class "dark-mode" on the <body>. If the class exists, it is removed; if it does not exist, it is added.
  // body.classList.toggle('dark-mode');
  // Check if the "dark-mode" class is present on the <body>. If so, set "modeMessage" to "Dark Mode", otherwise set it to "Light Mode".

  // const modeMessage = usernamedisplay.classList.contains('dark-mode') ?


  //     'Dark Mode'
  //     : "Light Mode";



  // Update the text of the "modeStatus" element (the <h2>) to reflect the current mode.
//   modeStatus.innerText = "Currently in " + modeMessage;

// }
// Add a "click" event listener to the "modeToggle" element (the checkbox). When the checkbox is clicked, the "toggleMode" function is called.
// modeToggle.addEventListener('click', toggleUserNameMode);




// import users from 'C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\project14usersv2.json' assert { type: 'json' }
 // I'm pretty sure a lot of things broke right now. 
// const usersValuesArray = Object.values(users)
/* // I'm pretty sure a lot of things broke right now.  */

// https://stackoverflow.com/questions/57990898/how-to-replace-json-text-value-in-the-textarea-by-giving-input-to-the-text-box

// import users from "C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\project14users.json" assert { type: 'json' }
// I have to come back around to this, because, I'm already tired. I think. Sometimes i delete comments prematurely, but there is an issue with 
// I had deleted comments that could have been useful, from my html file, not having them didn't mess things up too much, but, I think that.
// I'll have to put them back in.
// I'm really hungry.
// The json module only showed or only explained how to format information inside of a JSON file, so
// so basically it wasn't really. it wasn't entirely what I was looking for. I have to go back and
// look at the trivia game app and see how it works, but, the game doesn't work from github, I have to 
// go back to codio.

// work area





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
