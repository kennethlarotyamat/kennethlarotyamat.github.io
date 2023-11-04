// <!-- 
//         [References]                    [https://codepen.io/shafferma08] [https://codepen.io/marnee] [https://codepen.io/shafferma08/pen/NWERvOr]
//                                         [https://codepen.io/shafferma08/pen/KKrjwjL] [https://codepen.io/shafferma08/pen/NWERvOr]
//                                         [https://en.wikipedia.org/wiki/CSS_Flexible_Box_Layout]
//                                         [https://css-tricks.com/snippets/css/a-guide-to-flexbox/]
//                                         [https://css-tricks.com/snippets/css/a-guide-to-flexbox/]
//                                         [https://www.w3schools.com/bootstrap5/bootstrap_carousel.php]
//                                         [https://www.w3schools.com/tags/tag_span.asp] [<script src="https://kennethlarotyamat.github.io/javascript/project14v002.js"></script>]
//                                         [ <link rel="stylesheet" href="   https://kennethlarotyamat.github.io/CSS/project14v002.css   "> ]
//                                         [class="yellowRight carousel-control-next" type="button" data-bs-target="#demo1,#demo2" data-bs-slide="next"]
//                                         [<button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next"><span class="hazelText" >Swipe</span><br> <span class="sanguineText" >Right</span> </button>]
//                                         [https://codepen.io/shafferma08/pen/KKrjwjL] [https://kennethlarotyamat.github.io/html/project14v004.html] [https://stackoverflow.com/questions/77422567/bootstrap-carousel-issues-bootstrap-version-5]
        
//         [Development Commentary]        One of the issues that I had with the carousel, was that I had a different bootstrap version
//                                         in place than the documentation example that I was following, I had version 5 active, and the
//                                         documentation example used version 3. continue revisions based on the original project.
//                                         [C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\html\project14.html]
//                                         a lot of the issues come from clashes that occur between flex, block, and grid display. with
//                                         this newer version, I went with all flex. or, the main containers are all flex. [10/04/2023 14:46]
//                                         this project took pretty much forever, and it's still not quite finished.
// --></link>
// // window.onload = function () {
//     var e = document.getElementById("db_info");
//     e.innerHTML='Found you';
// };
//              guess what? This is a nightmare!
//             [Resources]      [https://stackoverflow.com/questions/77422567/bootstrap-carousel-issues-bootstrap-version-5]
//                              [https://kennethlarotyamat.github.io/html/project14.html]
//                              [https://stackoverflow.com/questions/36972571/bootstrap-carousel-issue]
//                              sometimes I can't even understand what I'm reading.
//                              [https://stackoverflow.com/questions/36972571/bootstrap-carousel-issue]
//                              [https://stackoverflow.com/questions/67120095/bootstrap-5-carousel-with-multiple-items]
//                              [https://kennethlarotyamat.github.io/html/project14.html]
//                              [https://kennethlarotyamat.github.io/html/project14.html]
//                              [https://strategywiki.org/wiki/SimCity_4/Other_Transportation]
//                              [https://www.chestnutandhazel.com/]





const images = document.querySelectorAll('#sliderproject10 iframe');

const nextImage = document.getElementById("nextproject10");

const previousImage = document.getElementById("prevproject10");

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



