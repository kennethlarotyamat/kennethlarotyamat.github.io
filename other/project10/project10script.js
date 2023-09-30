// 09 23 2023 09 40 00







$(function(){
  $("body").on('hidden.bs.modal', function (e) {
    var $iframes = $(e.target).find("iframe");
    $iframes.each(function(index, iframe){
      $(iframe).attr("src", $(iframe).attr("src"));
    });
  });
});  

// can create a new claass and use query selector all in the fucntion use a for each or for each loop use for each and selector all function create branch to try alternative approach
 
let bodyA = document.querySelector(" .bodya");
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
  bodyA.classList.toggle('dark-modefields');
  footer.classList.toggle('dark-modefields');
  main.classList.toggle('dark-modefields');
  aside.classList.toggle('dark-modefields');
  asideTwo.classList.toggle('dark-modefields');
  subheadercenterheadertextbutton.classList.toggle('dark-modefields');
  header.classList.toggle('dark-modefields');
  contentouter.classList.toggle('dark-mode');
  sidebarouter.classList.toggle('dark-modefields');
  bootstrapbuttonone.classList.toggle('dark-modebsbuttons');
  bootstrapbuttontwo.classList.toggle('dark-modebsbuttons');
  bootstrapbuttonthree.classList.toggle('dark-modebsbuttons');
  bootstrapbuttonfour.classList.toggle('dark-modebsbuttons');
  bootstrapbuttonfive.classList.toggle('dark-modebsbuttons');
  




  let modeMessage = bodyA.classList.contains('dark-modefields') ?
    'Grayscale' 
    : "Color";

  modeStatus.innerText =  modeMessage;
}

modeToggle.addEventListener('click', toggleMode);


const images = document.querySelectorAll('#sliderproject10 img');
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