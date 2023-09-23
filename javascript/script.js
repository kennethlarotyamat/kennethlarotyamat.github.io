$(function(){
  $("body").on('hidden.bs.modal', function (e) {
    var $iframes = $(e.target).find("iframe");
    $iframes.each(function(index, iframe){
      $(iframe).attr("src", $(iframe).attr("src"));
    });
  });
});  


let body = document.querySelector(" body");
let footer = document.querySelector(" footer");
let main = document.querySelector(" main");
let aside = document.querySelector(" aside");
let asideTwo = document.querySelector(".aside-two");

let modeToggle = document.getElementById('mode-toggle');
let modeStatus = document.querySelector('.mode-status');

function toggleMode() {  
  body.classList.toggle('dark-mode');
  footer.classList.toggle('dark-mode');
  main.classList.toggle('dark-mode');
  aside.classList.toggle('dark-mode');
  asideTwo.classList.toggle('dark-mode');




  let modeMessage = body.classList.contains('dark-mode') ?
    'Grayscale' 
    : "Color";

  modeStatus.innerText =  modeMessage;
}

modeToggle.addEventListener('click', toggleMode);

// let asideTwoColorToggler00 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler01 = document.querySelector("#subheadercenterheadertextbutton");
// let asideTwoColorToggler02 = document.querySelector(".header");
// let asideTwoColorToggler03 = document.querySelector(".contentouter");
// let asideTwoColorToggler04 = document.querySelector(".sidebarouter");
// let asideTwoColorToggler05 = document.querySelector(".containeroverouter");
// let asideTwoColorToggler06 = document.querySelector(".aside-one");
// let asideTwoColorToggler07 = document.querySelector(".aside-two");
// let asideTwoColorToggler08 = document.querySelector("body");
// let asideTwoColorToggler09 = document.querySelector(".footer");
// let asideTwoColorToggler10 = document.querySelector("footer");


// let asideTwoColorToggler11 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler12 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler13 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler14 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler15 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler16 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler17 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler18 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler19 = document.querySelector("#bodyid1651231");
// let asideTwoColorToggler20 = document.querySelector("#bodyid1651231");





// asideTwoColorToggler00.classList.toggle('dark-mode');
// asideTwoColorToggler01.classList.toggle('dark-mode');
// asideTwoColorToggler02.classList.toggle('dark-mode');
// asideTwoColorToggler03.classList.toggle('dark-mode');
// asideTwoColorToggler04.classList.toggle('dark-mode');
// asideTwoColorToggler05.classList.toggle('dark-mode');
// asideTwoColorToggler06.classList.toggle('dark-mode');
// asideTwoColorToggler07.classList.toggle('dark-mode');
// asideTwoColorToggler08.classList.toggle('dark-mode');
// asideTwoColorToggler09.classList.toggle('dark-mode');
// asideTwoColorToggler10.classList.toggle('dark-mode');
// asideTwoColorToggler11.classList.toggle('dark-mode');
// asideTwoColorToggler12.classList.toggle('dark-mode');
// asideTwoColorToggler13.classList.toggle('dark-mode');
// asideTwoColorToggler14.classList.toggle('dark-mode');
// asideTwoColorToggler15.classList.toggle('dark-mode');
// asideTwoColorToggler16.classList.toggle('dark-mode');
// asideTwoColorToggler17.classList.toggle('dark-mode');
// asideTwoColorToggler18.classList.toggle('dark-mode');
// asideTwoColorToggler19.classList.toggle('dark-mode');
// asideTwoColorToggler20.classList.toggle('dark-mode');