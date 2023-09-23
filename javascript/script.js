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