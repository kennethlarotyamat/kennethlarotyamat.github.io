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
let main = document.querySelector(" .main");
let aside = document.querySelector(" aside");
let asideTwo = document.querySelector(".aside-two");
let subheadercenterheadertextbutton = document.querySelector(".subheadercenterheadertextbutton");
let header = document.querySelector(".header");
let contentouter = document.querySelector(".contentouter");
let sidebarouter = document.querySelector(".sidebarouter");
let bootstrapbuttonone = document.querySelector(".bootstrapbuttonone");
let bootstrapbuttontwo = document.querySelector(".bootstrapbuttontwo");
let bootstrapbuttonthree = document.querySelector(".bootstrapbuttonthree");
let bootstrapbuttonfour = document.querySelector(".bootstrapbuttonfour");
let bootstrapbuttonfive = document.querySelector(".bootstrapbuttonfive");

let modeToggle = document.getElementById('mode-toggle');
let modeStatus = document.querySelector('.mode-status');

function toggleMode() {  
  body.classList.toggle('dark-mode[style]');
  footer.classList.toggle('dark-mode[style]');
  main.classList.toggle('dark-mode[style]');
  aside.classList.toggle('dark-mode[style]');
  asideTwo.classList.toggle('dark-mode[style]');
  subheadercenterheadertextbutton.classList.toggle('dark-mode[style]');
  header.classList.toggle('dark-mode[style]');
  contentouter.classList.toggle('dark-mode[style]');
  sidebarouter.classList.toggle('dark-mode[style]');
  bootstrapbuttonone.classList.toggle('dark-modebsbuttons[style]');
  bootstrapbuttontwo.classList.toggle('dark-modebsbuttons[style]');
  bootstrapbuttonthree.classList.toggle('dark-modebsbuttons[style]');
  bootstrapbuttonfour.classList.toggle('dark-modebsbuttons[style]');
  bootstrapbuttonfive.classList.toggle('dark-modebsbuttons[style]');
  




  let modeMessage = body.classList.contains('dark-mode[style]') ?
    'Grayscale' 
    : "Color";

  modeStatus.innerText =  modeMessage;
}

modeToggle.addEventListener('click', toggleMode);
