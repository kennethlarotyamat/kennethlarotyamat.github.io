Sources for Rubén Darío 

https://www.gutenberg.org/ebooks/search/?query=Rub%C3%A9n+Dar%C3%ADo+&submit_search=Go%21


https://www.gutenberg.org/cache/epub/52894/pg52894.txt

...

I'm going to forget about messing around with fixing the
project 11 contact form, for whatever reason, it does not 
work. It's the same thing as what i have on my landing page,
so I don't know why it doesn't work. so dumn. I might try one
more thing. but then again, I really have to work on my
translations project, and this is just something I'm messing
around with.
...

I'm putting together the texts that I'll be translating for 
this project. I'm also working on my YouTube videos. For video
editing, I'm mostly just consolidating and speeding up videos
and adding music, and uploading them, and I can't really do this
while playing the games themselves because my computer slows down
a lot.

Buying a new gaming laptop is something that I thought about, but
I think that I'll wait to do it. A gaming computer that can play
the games I want to play doesn't look too expensive, but I really
have to wait to spend that kind of money right now.


Two Spanish Language Authors have been replaced

César Vallejo with José de Espronceda
& 
Pablo Neruda with Antonio Machado

I created a few additional javascript functions to allow
the contact forms to be visible inside the ifram and clickable
inside the list.

...

I think that everything has been set up, once everything is
deployed, then I can focus on making translations for the
pages that I've set up.

...

So I set up the .md files for the four authors that I'm going
to translate from English to Spanish, and the four authors
that I'm going to translate from Spanish to English. I selected
all authors whose work I expect to be in the Public Domain.

...

Getting the Readme iFrame and Document Title swap to work is complete,
the next stage in this project is to pick 4 authors to translate.

I'll pick four authors to translate from English to Spanish,
and 4 authors to translate from Spanish to English.

For English to Spanish:

William Carlos Williams
T. S. Eliot
Wallace Stevens
E. E. Cummings

For Spanish to English:

Rubén Darío
César Vallejo
Pablo Neruda
Miguel de Unamuno

...

This is awesome! it actually works, the title and the document
change when clicked! I'm going to come back around to this and
continue to work on it later.

...

Certainly! Here's an example of a JavaScript function that changes the text of an `<h1>` element when a button is clicked:

HTML:
```html
<!DOCTYPE html>
<html>
<head>
<title>Change Text</title>
</head>
<body>
<h1 id="heading">Original Heading</h1>
<button onclick="changeHeadingText()">Change Text</button>

<script>
function changeHeadingText() {
var newHeadingText = "New Heading Text";
document.getElementById("heading").innerText = newHeadingText;
}
</script>
</body>
</html>
```

In this example, when the button is clicked, the `changeHeadingText()` function is triggered. Inside this function, it gets the `<h1>` element by its ID ("heading") and updates its `innerText` property to a new value ("New Heading Text"). You can modify the `newHeadingText` variable to set any text you want for the `<h1>` element.

...

I put the code that ChatGPT recommended into the page, and now
I just need to wait for the javascript file to deploy on GitHub.

...

Copy code
<button id="changeSrcBtn">Change iframe source</button>
<iframe id="myIframe" src="https://www.example.com" width="600" height="400"></iframe>
JavaScript:

html
Copy code
<script>
document.getElementById('changeSrcBtn').addEventListener('click', function() {
var newSource = 'https://www.newsource.com'; // Replace this URL with your desired source

var iframe = document.getElementById('myIframe');
iframe.src = newSource;
});
</script>

...

I'm not sure if I'm going to use .md or .txt files for the text area, or, if maybe I want to change this to an HTML file.

This might be like the Chestnut + Hazel Connections Version 4. where I need a button that changes the source for the iframe, but also
changes the Title,

for example, it's going to start with the Development Commentary Title, with the Development Commentary .md file, 
but then changes to Translation Title when the Translation Title File is selected.

...

It's not possible to put an image into a .md file as far as I can tell.

...

![Chat GPT Response](https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png)

<img src="https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png" alt="Chat GPT Response" width="100%" height="600">

![Chat GPT Response](https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png|alt=ChatGPTResponse)  

![Chat GPT Response](https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png)  
![Chat GPT Response](https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png|alt=ChatGPTResponse)  

[[https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png|alt=ChatGPTResponse]]
![Chat GPT Response](https://kennethlarotyamat.github.io/miscellaneous/media/images/Screenshot2023-11-22-214506.png "Chat GPT Response")

...

User
i need an anchor button that changes a src within an iframe
ChatGPT
Certainly! You can create an anchor <button> element that changes the src attribute of an <iframe> using JavaScript. Here's an example:

HTML:

html
Copy code
<button id="changeSrcBtn">Change iframe source</button>
<iframe id="myIframe" src="https://www.example.com" width="600" height="400"></iframe>
JavaScript:

html
Copy code
<script>
document.getElementById('changeSrcBtn').addEventListener('click', function() {
var newSource = 'https://www.newsource.com'; // Replace this URL with your desired source

var iframe = document.getElementById('myIframe');
iframe.src = newSource;
});
</script>
Replace 'https://www.newsource.com' with the URL you want to set as the new source for the iframe.

When the button with the ID changeSrcBtn is clicked, the src attribute of the iframe with the ID myIframe will be updated to the new source URL specified in the JavaScript code.





Is this conversation helpful so far?



Message ChatGPT…

ChatGPT can make mistakes. Consider checking important information.

...

C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\html\indexTranslations.html


[11/06/2023 08:56 AM] [Leaflet Update Point]

Development Notes - I want to bring the swipe left and right text down slightly, and 
kind of change the fields to that swiping left and right 
doesn't have to be exactly on the text, but in the general colored field 
file:///C:/Users/KLYam/OneDrive/Documents/GitHub/kennethlarotyamat.github.io/html/project14v004.html 



[11/06/2023 06:16 AM] checking page Looks good.

[11/06/2023 01:53 AM]   [ Resources ] [ https://dev.to/ingosteinke/inspecting-the-wrong-elements-in-the-browser--3jce ]
[Development Notes]     refer to [Oct 28] course material to figure out map stuff to figure out how to use
leaflet or maps for the [meet me at our spot] section. [Oct 2.3] [11/06/2023 01:53 AM] it's
in, it's working, meet me at our spot button is working with leaflet.
[11/06/2023 01:53 AM] I'm going to leave this page for now and continue working on project 14
version 4 and continue the leaflet aspect of the project. [11/06/2023 01:53 AM]
[11/06/2023 01:53 AM]   checking page. [11/06/2023 01:53 AM] [11/06/2023 01:53 AM] 

<!-- [11/05/2023 06:00 AM] align="center"  align="center" Image from https://leafletjs.com/index.html -->

<!-- [11/05/2023 09:45 AM] [Deployment Test] [11/05/2023 06:00 AM] [11/05/2023 05:56 AM]  moved development notes to a central location. These will be moved to a dedicated text file 
        once this part of the project is completed. or. once they. once it makes sense to free up the space.
-->





<!-- migration test -->
<!--

[11/05/2023 05:50] Removed Video Material From Repository 

[11/05/2023 05:50] [Quiz] [https://sekllanchenruan.github.io/anime-quiz-app/]
I need to review how to do this. I think that he managed to use
a JSON file for his quiz project, I couldn't figure out how to do it.

[11/04/2023 23:29] [11/04/2023 23:25] kennethlarotyamat.github.io/html/project10index.html 
I moved a number of files around to make things easier for me to look at.
kennethlarotyamat.github.io/html/project10index.html
I moved a number of files around into different directories, this created a 
number of problems are are being fixed as I come across them.
[11/04/2023 23:25]

[11/04/2023 23:29] [Needs to be fixed] [11/04/2023 23:29]
https://kennethlarotyamat.github.io/html/project10index.html
file:///C:/Users/KLYam/OneDrive/Documents/GitHub/kennethlarotyamat.github.io/html/project10index%20copy.html
https://kennethlarotyamat.github.io/html/project10index.html
[11/04/2023 23:29] 

-->

<!-- [11/05/2023 05:50] -->
<!-- [11/05/2023 04:46] checking page -->
<!-- [11/05/2023 04:46] page works -->
<!--  [11/05/2023 04:46] i still can't figure out why the favicon doesn't work on this page. -->
<!-- https://www.learnwithjason.dev/blog/get-form-values-as-json -->
<!-- form start, collect information in JSON format [11/04/2023 23:10] Need to Fix This, Collect response in JSON FORMAT [11/05/2023 02:40]-->
<!-- [11/04/2023 23:03] https://kennethlarotyamat.github.io  C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\script.js -->
<!-- [Work Area - Need to put maps into the Chestnut and Hazel Connections Carousel - For Mobile] [11/05/2023 06:00 AM] -->
<!-- assignment11index.html need to fix this link [Should be fixed. will check] -->
<!-- [https://codepen.io/kennethlarotyamat/full/XWyLXvm] [ need to fix images for hamburger project ]  -->
<!-- [11/06/2023 08:56 AM] [Leaflet Update Point] [11/05/2023 06:00 AM] I want to make revisions to the hamburger project. I could probably do the map thing there. Leaflet. It's called Leaflet. -->


...

There isn't anything here right now. I'm just posting this so that this page is deployed for when I'm ready to put something here.
I will put something here, but right now, there is nothing here. 