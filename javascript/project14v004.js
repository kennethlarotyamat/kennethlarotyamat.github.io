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