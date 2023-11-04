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

const myJSON = '{"fname" : "Audrey ", "mname" : null, "lname" : "Hepburn","tagline" : "years of anger following hours that float idly down "}';
const myObj = JSON.parse(myJSON);
document.getElementById("demoTagline").innerHTML = myObj.tagline;

// I did it, and it worked.
// https://www.w3schools.com/js/tryit.asp?filename=tryjson_object_dot
// it worked, but that was a nightmare.
// these are all from william carlos williams
//   C:\Users\KLYam\OneDrive\Documents\GitHub\kennethlarotyamat.github.io\javascript\project14v003.json