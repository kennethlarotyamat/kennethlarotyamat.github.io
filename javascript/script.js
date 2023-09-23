$(function(){
  $("body").on('hidden.bs.modal', function (e) {
    var $iframes = $(e.target).find("iframe");
    $iframes.each(function(index, iframe){
      $(iframe).attr("src", $(iframe).attr("src"));
    });
  });
});  


let body = document.querySelector("body");

let footer = document.querySelector("footer");

let modeToggle = document.getElementById('mode-toggle');
let modeStatus = document.querySelector('.mode-status');

function toggleMode() {
  body.classList.toggle('dark-mode');
  footer.classList.toggle('dark-mode');

  let modeMessage = body.classList.contains('dark-mode') ?
    'Grayscale' 
    : "Color";

  modeStatus.innerText =  modeMessage;
}

modeToggle.addEventListener('click', toggleMode);