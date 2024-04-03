// [Modal Autoplay Shutoff Start]

$(function(){
  $("body").on('hidden.bs.modal', function (e) {
    var $iframes = $(e.target).find("iframe");
    $iframes.each(function(index, iframe){
      $(iframe).attr("src", $(iframe).attr("src"));
    });
  });
});

// [Modal Autoplay Shutoff End]

// [11/04/2023 23:00] fixed links to this page and html page [kennethlarotyamat.github.io\javascript\p14chconnectionsdistindex.js]