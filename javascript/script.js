$(function(){
  $("body").on('hidden.bs.modal', function (e) {
    var $iframes = $(e.target).find("iframe");
    $iframes.each(function(index, iframe){
      $(iframe).attr("src", $(iframe).attr("src"));
    });
  });
});  

 
let bodya = document.querySelector(" .bodya");
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
  bodya.classList.toggle('dark-mode');
  footer.classList.toggle('dark-mode');
  main.classList.toggle('dark-mode');
  aside.classList.toggle('dark-mode');
  asideTwo.classList.toggle('dark-mode');
  subheadercenterheadertextbutton.classList.toggle('dark-mode');
  header.classList.toggle('dark-mode');
  contentouter.classList.toggle('dark-mode');
  sidebarouter.classList.toggle('dark-mode');
  bootstrapbuttonone.classList.toggle('dark-modebsbuttons');
  bootstrapbuttontwo.classList.toggle('dark-modebsbuttons');
  bootstrapbuttonthree.classList.toggle('dark-modebsbuttons');
  bootstrapbuttonfour.classList.toggle('dark-modebsbuttons');
  bootstrapbuttonfive.classList.toggle('dark-modebsbuttons');
  




  let modeMessage = bodya.classList.contains('dark-mode') ?
    'Grayscale' 
    : "Color";

  modeStatus.innerText =  modeMessage;
}

modeToggle.addEventListener('click', toggleMode);
