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