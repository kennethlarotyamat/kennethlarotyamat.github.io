// iframe document swap Start

document.getElementById('changeSrcBtn').addEventListener('click', function() {
var newSource = 'https://kennethlarotyamat.github.io/media/text/fmop10mREADME.md'; // Replace this URL with your desired source

var iframe = document.getElementById('myIframe');
iframe.src = newSource;
});

document.getElementById('changeSrcBtn2').addEventListener('click', function() {
  var newSource2 = 'https://kennethlarotyamat.github.io/media/text/fmop10mREADME.md'; // Replace this URL with your desired source
  
  var iframe = document.getElementById('myIframe');
  iframe.src = newSource2;
  });
// iframe document swap end

// Modal shutoff Start

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

  // Modal shutoff End

  // Grayscale Toggle Start

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

  // Grayscale Toggle End
