// const fs = require('fs');

// 1. Read the JSON file
// const rawData = fs.readFileSync('C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\project14v003.json');
// const data = JSON.parse(rawData);

// 3. Retrieve the necessary data
// const desiredData = data.tagline; 
// Replace 'key' with the specific key you want

// 4. Generate your statement
// const statement = `This is based on the data from the JSON file: ${desiredData}`;

// console.log(statement); 

// i don't understand these instructions.

// https://stackoverflow.com/questions/65341489/displaying-an-array-of-objects-one-screen-from-json-file
//  Sometimes it's not clear to me if I've found an answer or not.
// https://www.w3schools.com/js/js_json_intro.asp

// https://www.w3schools.com/js/tryit.asp?filename=tryjson_object_dot
// let personAge = obj.age;
// let personFirstName = obj.fname;
// let personMiddleName = obj.mname;
// let personLastName = obj.lname;
// let personTagline = obj.tagline;
// https://www.w3schools.com/js/tryit.asp?filename=tryjson_object_dot
// <!DOCTYPE html>
// <html>
// <body>

// <h2>Access a JavaScript Object</h2>
// <p id="demoTagline"></p>

// <script>
// const myJSON = '{"name":"Aud", "age":30, "car":null}';
// const myObj = JSON.parse(myJSON);
// document.getElementById("demo").innerHTML = myObj.age;
// </script>

// </body>
// </html>

// {"fname" : "Audrey ", "mname" : null, "lname" : "Hepburn","tagline" : "years of anger followinghours that float idly down "},

// const myJSON = '{"fname" : "Audrey ", "mname" : null, "lname" : "Hepburn","tagline" : "years of anger followinghours that float idly down "}';
// const myObj = JSON.parse(myJSON);
// document.getElementById("demo").innerHTML = myObj.tagline;

// here it goes [10:11 AM]
// C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\project14v003.json
const myJSON = { 
    "user001" : {"fname" : "Audrey ", "mname" : null, "lname" : "Hepburn","tagline" : "years of anger following hours that float idly down "},
    "user002" : {"fname" : "Elizabeth ", "mname" : null, "lname" : "Grant","tagline" : "the blizzard drifts its weight deeper and deeper for three days "},
    "user003" : {"fname" : "Josephine ", "mname" : null, "lname" : "McClellan","tagline" : "Then the sun! a clutter of yellow and blue flakes "},
    "user004" : {"fname" : "Marion ", "mname" : null, "lname" : "Silver","tagline" : " Hairy looking trees stand out in long alleys over a wild solitude. "},
    "user005" : {"fname" : "Alicia ", "mname" : null, "lname" : "Nash","tagline" : " The man turns and there — his solitary track stretched out upon the world. "},
    "user006" : {"fname" : "Madeleine ", "mname" : null, "lname" : "Bowen","tagline" : " the baby is sleeping and the sun is a flame-white disc in silken mists above shining trees "},
    "user007" : {"fname" : "Helen ", "mname" : null, "lname" : "Benson","tagline" : " Who shall say I am not the happy genius of my household? "},
    "user008" : {"fname" : "Janine ", "mname" : null, "lname" : "Gunders","tagline" : " Among the rain and lights I saw the figure 5 in gold on a red firetruck "},
    "user009" : {"fname" : "Gabriella ", "mname" : null, "lname" : "Darc","tagline" : "   moving tense  unheeded  to gong clangs  siren howls  and wheels rumbling  through the dark city. "},
    "user010" : {"fname" : "Claire ", "mname" : null, "lname" : "Hamilton","tagline" : "   a trouble  archaically fettered  to produce    E Pluribus Unum an island  in the sea "},
    "user011" : {"fname" : "Gloria ", "mname" : null, "lname" : "Harper","tagline" : " gross matters of the everyday world such as are never much hidden from a quick eye "},
    "user012" : {"fname" : "Emma ", "mname" : null, "lname" : "Darwin","tagline" : "Why pretend to remember the weather two years back? "},
    "user013" : {"fname" : "Gwen ", "mname" : null, "lname" : "Vanderveer","tagline" : " I lie here thinking of you "},
    "user014" : {"fname" : "Penelope ", "mname" : null, "lname" : "Benjamin","tagline" : " the horned branches that lean heavily against a smooth purple sky "},
    "user015" : {"fname" : "Eleanor ", "mname" : null, "lname" : "Abbott","tagline" : " I have eaten the plums that were in the icebox and which you were probably saving for breakfast "},
    "user016" : {"fname" : "Dawn ", "mname" : null, "lname" : "Dwyer","tagline" : " a purple mole at the center of each flower.  Each flower is a hand’s span  of her "},
    "user017" : {"fname" : "Amanda ", "mname" : null, "lname" : "Marsh","tagline" : " the whole field is an empty, single stem, a cluster, flower by flower, a pious wish "}
  } ;
// const myObj = JSON.parse(myJSON);
document.getElementById("demoTagline").innerHTML = myObj.tagline;

// onclick

// I did it, and it worked.
// https://www.w3schools.com/js/tryit.asp?filename=tryjson_object_dot
// it worked, but that was a nightmare.
// these are all from william carlos williams
//   C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\project14v003.json