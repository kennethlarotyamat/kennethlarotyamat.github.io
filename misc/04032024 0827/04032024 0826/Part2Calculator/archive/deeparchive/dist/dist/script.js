// Define a class named Calculator
 class Calculator {

  // Define the constructor method for the Calculator class
  constructor() {
    // Initialize the calculator display elements
    this.previousOperandElement = document.getElementById("previous-operand")
    this.currentOperandElement = document.getElementById("current-operand")
    this.display = document.getElementById("display")
    this.clearButton = document.getElementById("clear")
    this.signButton = document.getElementById("sign")
    this.percentButton = document.getElementById("percent")
    this.divideButton = document.getElementById("divide")
    this.sevenButton = document.getElementById("seven")
    this.eightButton = document.getElementById("eight")
    this.nineButton = document.getElementById("nine")
    this.multiplyButton = document.getElementById("multiply")
    this.fourButton = document.getElementById("four")
    this.fiveButton = document.getElementById("five")
    this.sixButton = document.getElementById("six")
    this.subtractButton = document.getElementById("subtract")
    this.oneButton = document.getElementById("one")
    this.twoButton = document.getElementById("two")
    this.threeButton = document.getElementById("three")
    this.addButton = document.getElementById("add")
    this.zeroButton = document.getElementById("zero")
    this.decimalButton = document.getElementById("decimal")
    this.equalsButton = document.getElementById("equals")

    // Set default values for the current and previous operands and operation
    this.currentOperand = "0"
    this.previousOperand = ""
    this.operation = undefined

    // Update the calculator display
    this.updateDisplay()
   
  }

// Define the method to clear the calculator
  clear() {
    this.currentOperand = "0"
    this.previousOperand = ""
    this.operation = undefined
  }

  // Define the method to delete the last digit from the current operand
  delete() {
    this.currentOperand = this.currentOperand.toString().slice(0, -1)
  }

  // Define the method to append a new number to the current operand
  appendNumber(number) {
    // Check for duplicate decimal points
    if (number === "." && this.currentOperand.includes(".")) return

    // Replace 0 with the new number if the current operand is 0
    if (this.currentOperand === "0" && number !== ".") {
      this.currentOperand = number
    } else {
      // Append the new number to the current operand
      this.currentOperand += number
    }
  }

  // Define the method to choose an operation
  chooseOperation(operation) {
    // Don't allow operation selection if current operand is empty
    if (this.currentOperand === "") return

    // Perform the previous operation if one exists
    if (this.previousOperand !== "") {
      this.compute()
    }

    // Set the new operation and move the current operand to the previous operand
    this.operation = operation
    this.previousOperand = this.currentOperand
    this.currentOperand = ""
    // Update the calculator display
    this.updateDisplay()
  }

  // Define the method to compute the result of the current operation
  compute() {
    // Initialize variables for the previous and current operands
    let computation
    const prev = parseFloat(this.previousOperand)
    const current = parseFloat(this.currentOperand)

    // Don't allow computation if either operand is NaN
    if (isNaN(prev) || isNaN(current)) return

    // Perform the appropriate operation based on the selected operation
    switch (this.operation) {
      case "+":
        computation = prev + current
        break
      case "-":
        computation = prev - current
        break
      case "*":
        computation = prev * current
        break
      case "/":
        computation = prev / current
        break
      default:
        return
    }

    // Update the current operand with the computed result and reset the operation and previous operand
    this.currentOperand = computation.toString()
    this.operation = undefined
    this.previousOperand = ""
  }

  // Define the method to format a number for display on the calculator
  getDisplayNumber(number) {
    const stringNumber = number.toString()
    const integerDigits = parseFloat(stringNumber.split(".")[0])
    const decimalDigits = stringNumber.split(".")[1]
    let integerDisplay
    
    if (isNaN(integerDigits)) {
      integerDisplay = ""
    } else {
      integerDisplay = integerDigits.toLocaleString("en", {
        maximumFractionDigits: 0,
      })
    }
    if (decimalDigits != null) {
      return `${integerDisplay}.${decimalDigits}`
    } else {
      return integerDisplay
    }
  }

  // Define the method to update the calculator display
  updateDisplay() {
    // Display the appropriate content based on whether an operation has been selected
    if (this.operation != null) {
      this.display.value = `${this.getDisplayNumber(this.previousOperand)} ${this.operation} ${this.currentOperand ? this.currentOperand : ''}`
    } else {
      this.display.value = this.getDisplayNumber(this.currentOperand)
    }
  }
 }

 // Create a new instance of the Calculator class
const calculator = new Calculator()


// Add event listeners for each button to update the calculator display based on user input
calculator.clearButton.addEventListener("click", () => {
  calculator.clear()
  calculator.updateDisplay()
})

calculator.signButton.addEventListener("click", () => {
  calculator.currentOperand = calculator.currentOperand * -1
  calculator.updateDisplay()
})

calculator.percentButton.addEventListener("click", () => {
  calculator.currentOperand = calculator.currentOperand / 100
  calculator.updateDisplay()
})

calculator.divideButton.addEventListener("click", () => {
  calculator.chooseOperation("/")
  calculator.updateDisplay()
})

calculator.multiplyButton.addEventListener("click", () => {
  calculator.chooseOperation("*")
  calculator.updateDisplay()
})

calculator.subtractButton.addEventListener("click", () => {
  calculator.chooseOperation("-")
  calculator.updateDisplay()
})

calculator.addButton.addEventListener("click", () => {
  calculator.chooseOperation("+")
  calculator.updateDisplay()
})

calculator.equalsButton.addEventListener("click", () => {
  calculator.compute()
  calculator.updateDisplay()
})

calculator.zeroButton.addEventListener("click", () => {
  calculator.appendNumber("0")
  calculator.updateDisplay()
})

calculator.oneButton.addEventListener("click", () => {
  calculator.appendNumber("1")
  calculator.updateDisplay()
})

calculator.twoButton.addEventListener("click", () => {
  calculator.appendNumber("2")
  calculator.updateDisplay()
})

calculator.threeButton.addEventListener("click", () => {
  calculator.appendNumber("3")
  calculator.updateDisplay()
})

calculator.fourButton.addEventListener("click", () => {
  calculator.appendNumber("4")
  calculator.updateDisplay()
})

calculator.fiveButton.addEventListener("click", () => {
  calculator.appendNumber("5")
  calculator.updateDisplay()
})

calculator.sixButton.addEventListener("click", () => {
  calculator.appendNumber("6")
  calculator.updateDisplay()
})

calculator.sevenButton.addEventListener("click", () => {
  calculator.appendNumber("7")
  calculator.updateDisplay()
})

calculator.eightButton.addEventListener("click", () => {
  calculator.appendNumber("8")
  calculator.updateDisplay()
})

calculator.nineButton.addEventListener("click", () => {
  calculator.appendNumber("9")
  calculator.updateDisplay()
})

calculator.decimalButton.addEventListener("click", () => {
  calculator.appendNumber(".")
  calculator.updateDisplay()
})


// ... [Start Solution Area]













// var x = 121;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));













// ... [End Solution Area]

// I just completed the codewars version, and I'm coming back here to my leet code version, and it just. the solution I came up with seems 
// so alien to me. there's so much stuff going on outside of the function. the two versions are different. obviously. but one. in one case. the 
// leet code case, it's more for numbers, there's even a follow - up challenge where, they suggest trying to solve the same problem using 
// some kind of mathematical formula. that's not something that can be done with words.

// but the word version, the codewars you have to deal with upper and lower case letters, which is something that isn't a problem or 
// something to be concerned about when working with numbers. in fact, when i realized. well, it wasn't the only problem, but one 
// problem I was having was the to lower case part of the function. Anyway. I'm really glad that's over.

// on to the haccker rank palindrome problem.





// [Working Area Start]

// ... [Final Working Version]



// var x = 121;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));



// ... [Final Working Version] [works in leetcode problem]

// /**
//  * @param {number} x
//  * @return {boolean}
//  */
// var isPalindrome = function(x) {

//     var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
    
// };

// ...


// let x;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number);
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome(x) 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// ...

// var x = number;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// let digits = x;
// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome(x) 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// var x;
// var number = x;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// let x;
// let number


// var digits = number.string(x).split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ...

// var x = 121;

// var digits = x.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome() 
// {    
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }
// } 
// isPalindrome("");

// console.log(isPalindrome(""));

// ... 

// let myString6 = "1215";
// function reverseString6() 
// {    
//     var splitString6 = myString6.split(""); 
//     var reverseArray6 = splitString6.reverse();  
//     var joinArray6 = reverseArray6.join("");     
//     return joinArray6; 
// } 
// reverseString6("");
// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// ...

// [Working Area End]

// ...

// function isPalindrome()
// {
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }   
// }
// isPalindrome("");
// console.log(isPalindrome);
// ...

// var x = 123456;

// var digits = num.toString().split('').reverse();
// var reverseDigits = digits.map(Number)
// console.log(reverseDigits);

// var joinreverseDigits = reverseDigits.join('');
// console.log(joinreverseDigits);

// function isPalindrome
// {
//       if (joinreverseDigits == x){
//           return true
//       } else {
//           return false
//       }   
// }

// console.log(isPalindrome);

// ...

// let myString6 = "1215";
// function reverseString6() 
// {    
//     var splitString6 = myString6.split(""); 
//     var reverseArray6 = splitString6.reverse();  
//     var joinArray6 = reverseArray6.join("");     
//     return joinArray6; 
// } 
// reverseString6("");
// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// ...

// /**
//  * @param {number} x
//  * @return {boolean}
//  */
// // var isPalindrome = function(x) {

// //     var result = Number(String(x).split('').reverse().join(''))

// //     if (result == x){
// //         return true
// //     } else {
// //         return false
// //     }
    
// // };

// ...

// [Reflections Start] 

// I'm going to take a nap. this is a nightmare.

// I really wanted to attend this: https://startupnv.org/maggie-saling-understanding-tam-sam-som-reno-nv/ 

// Here is another thing I noticed, the person who used the same approach that I did, well, maybe 
// it's more or less the most common approach. he used an if/else statement, and I used a Boolean.

// I selected this palindrome problem because I've done it before in class. I don't know 
// why I seem to have to learn JavaScript all over again every time I come around to it.



// [Reflections End]

// ... 

// [working example]

// let myString6 = "racecar";
// function reverseString6() 
// {    
//     var splitString6 = myString6.split(""); 
//     var reverseArray6 = splitString6.reverse();  
//     var joinArray6 = reverseArray6.join("");     
//     return joinArray6; 
// } 
// reverseString6("");
// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// ...

// ...



// console.log("Part 1");
// console.log(" ");

// let myString = "This is not a palindrome";


// // console.log(myString);

// function reverseString() {
    
//     var splitString = myString.split(""); 

 

//     var reverseArray = splitString.reverse(); 
 
//     var joinArray = reverseArray.join(""); 
    
    
//     return joinArray; 
// }
 
// reverseString("");

// console.log(reverseString());

// console.log(" ");
// console.log("Part 2");
// console.log(" ");

// let myString2 = "but it doesn't really matter anyway.";

// function concatStrings() {
    
//     var twoStrings = myString.concat(", ",myString2); 

 

    
    
//     return twoStrings; 
// }
// concatStrings();

// console.log(concatStrings());

// console.log(" ");
// console.log("Part 3");
// console.log(" ");

// let partThree = concatStrings()

// function vowelSearch() {
    
//     var lowerCaseString = partThree.toLowerCase(myString.concat(", ",myString2));
//     var splitLcs = lowerCaseString.split("")
//     // var findA = splitLcs.replace("a","1")
//     // var findA = splitLcs.find("a")
//     // var findA = splitLcs.find(a)
//     // var findA = splitLcs.find("a")
//     // var findA = splitLcs.filter()
//     return splitLcs; 
// }
// vowelSearch();
// // console.log(vowelSearch());

// let vowelSearchArray = vowelSearch()

// // console.log(vowelSearchArray);

// const newArrayA = vowelSearchArray.filter(function(element) {
//   return element == "a";
// });

// // console.log(newArrayA);

// const newArrayE = vowelSearchArray.filter(function(element) {
//   return element == "e";
// });

// // console.log(newArrayE);

// const newArrayI = vowelSearchArray.filter(function(element) {
//   return element == "i";
// });

// // console.log(newArrayI);

// const newArrayO = vowelSearchArray.filter(function(element) {
//   return element == "o";
// });

// // console.log(newArrayO);

// const newArrayU = vowelSearchArray.filter(function(element) {
//   return element == "u";
// });

// // console.log(newArrayU);

// // let myArray13 = ["a", "b", "c", "d", "e", "f", "a","e","e",];
// // const newArray21 = myArray13.filter(function(element) {
// //   return element == "e";

// // });

// // console.log(  newArray21);  

// let allVowels = newArrayA.concat(newArrayE, newArrayI, newArrayO, newArrayU);

// // console.log(  allVowels)

// let numberOfVowels = allVowels.length;

// console.log(  "Number of Vowels in String = " + numberOfVowels);

// console.log(" ");
// console.log("Part 4");
// console.log(" ");

// let p4String = (  myString + ", " + myString2 + " Number of Vowels in String = " + numberOfVowels);

// // console.log(p4String);

// function vowelSwap() {
    
//     var aForOh = p4String.replace(/a/g, "o"); 

 

    
    
//     return aForOh; 
// }
// vowelSwap();

// console.log(vowelSwap());

// console.log(" ");
// console.log("Part 5");
// console.log(" ");

// let p5sTring = vowelSwap();

// function noSpace() {
    
//     var iGottaBlankSpaceBaby = p5sTring.replace(/ /g, ""); 

 

    
    
//     return iGottaBlankSpaceBaby; 
// }
// noSpace();

// console.log(noSpace());

// console.log(" ");
// console.log("Part 6");
// console.log(" ");

// let myString6 = "racecar";


// // console.log(myString);

// function reverseString6() {
    
//     var splitString6 = myString6.split(""); 

 

//     var reverseArray6 = splitString6.reverse(); 
 
//     var joinArray6 = reverseArray6.join(""); 
    
    
//     return joinArray6; 
// }
 
// reverseString6("");

// console.log(myString6 + " is a palindrome:" + " " + Boolean(reverseString6("") === myString6));

// console.log(" ");
// console.log("Part 7");
// console.log(" ");

// let myString7 = "appkhgkgkjhghjkgkjhbkhjb8les";

// function isStringAlphaNumeric() {

//     var toLowerCase7 = myString7.toLowerCase("");
//     var splitString7 = toLowerCase7.split(""); 
//     var trueFalse7 = splitString7.includes("q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","1","2","3","4","5","6","7","8","9","0",);
    

    
    
//     return trueFalse7 ; 
// }

// console.log(isStringAlphaNumeric());

// ...

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map

// ...

// [Good Lord. This is such a minor victory point]

// var num = 123456;

// var digits = num.toString().split('').reverse();
// var realDigits = digits.map(Number)
// console.log(realDigits);

// var joinRealDigits = realDigits.join('');
// console.log(joinRealDigits);

// ...



// var num = 123456;
// var digits = num.toString().split('').reverse().join('');
// var realDigits = digits.map(Number)
// console.log(realDigits);


// ...



// var Number = 123456;
// var digits = Number.toString().split('').reverse();
// var realDigits = digits.map(Number);
// console.log(realDigits);




//     {Number(String(x).split('').reverse().join(''))        }




// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toString




// var num = 123456;
// var digits = num.toString().split('').reverse().join('');
// var realDigits = digits.map(Number)
// console.log(realDigits);




// var num = 123456;
// var digits = num.toString().split('').reverse();
// var realDigits = digits.map(Number)
// console.log(realDigits);



// var num = 123456;
// var digits = num.toString().split(' ');
// var realDigits = digits.map(Number);
// console.log(realDigits);



// var num = 123456;
// var digits = num.toString().split('');
// var realDigits = digits.map(Number)
// console.log(realDigits);




// Number(String(x).split('')



// .join('')



// )



// file:///C:/Users/KLYam/OneDrive/Documents/GitHub/miscellaneous/other/project13/LeetCode/console.html

// https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_split6

// https://www.w3schools.com/jsref/jsref_split.asp




// var num = 123456;
// var digits = num.toString().split('');
// var realDigits = digits.map(Number)
// console.log(realDigits);




// let text = 121;
// const chars = text.split("");
// console.log(chars);




















// Number(String(x).split('').reverse().join(''))

// let text = "121";
// const myArray = text.split(" ");
// console.log(myArray);





// let x = 121;

// var number = x;
// const myArray = number.split(" ");
// console.log(myArray);



// let x = 121;

// let text = x;
// const myArray = text.split(" ");
// console.log(myArray);






// let x = 121;

// console.log(x);

// let text = x;
// const myArray = text.split(" ");

// console.log(myArray);

// <!DOCTYPE html>
// <html>
// <body>

// <h1>JavaScript Strings</h1>
// <h2>The split() Method</h2>

// <p>split() splits a string into an array of substrings, and returns the array:</p>

// <p id="demo"></p>

// <script>
// let text = "How are you doing today?";
// const myArray = text.split(" ");

// document.getElementById("demo").innerHTML = myArray; 
// </script>

// </body>
// </html>








// let x = 121;

// console.log(x);

// var isPalindrome = function(x) {

//     var palindromeTester = Number(String(x).split('').reverse().join(''))

//     if (result == x){
//         return true
//     } else {
//         return false
//     }
    
// };

// console.log(isPalindrome);


// [End]

// let palindromeTester

// var isPalindrome = function(x) {

//     var palindromeTester = Number(String(x).split('').reverse().join(''))

//     if (result == x){
//         return true
//     } else {
//         return false
//     }
    
// };

// console.log(palindromeTester);






// [Notes]

// Intro to Variables
// Variables are used in programming to store and manipulate data. In JavaScript, there are three different keywords used for declaring variables: var, let, and const. The main difference between these is something called “scope” which we will cover later.
// var:
// The var keyword is used to declare a variable globally or locally in a function. Variables declared with var are function-scoped, meaning they are only accessible within the function in which they are declared or in the global scope if they are declared outside a function
// let:
// The let keyword is used to declare a block-scoped variable. This means that variables declared with let are only accessible within the block they are declared in, including any nested blocks.
// const:
// The const keyword is used to declare a block-scoped variable that cannot be reassigned. This means that once a variable is declared with const, its value cannot be changed. However, note that the value of an object or an array declared with const can be modified, but the variable cannot be reassigned to a different value.
// 💡 PRO TIP: The var keyword, though it is still valid, is an older way of declaring variables. Almost all modern JavaScript will use either let or const!
// When deciding between let and const, think about whether the value of the variable should be allowed to change or not. If it should not be changed, use const; otherwise, use let.
// Next, let’s talk briefly about naming conventions. This applies to naming both variables and functions, when the name given is made up of several words. The most common convention in JavaScript is to use what is called camel case. This means that the first letter of the first word in the name is lowercase, while in each subsequent word in the name the first letter is uppercase. Let’s look at an example to illustrate this:
// mySuperAwesomeVariableName
// While this example may be a bit over the top, it illustrates the point. The reason why this is the most commonly used naming convention is because it helps greatly with code readability.
// With that in mind, let’s move on to another important point – namely, the difference between declaring a variable and initializing a variable. Declaring a variable means simply creating a variable (e.g. - let myVariable), while initializing a variable means giving it an initial value. With let you can declare a variable without initializing it; with const, however, you MUST also give it an initial value.
// Let’s look at some examples of declaring variables and constants in JavaScript:





// let x = 10;
// x += 5; // equivalent to x = x + 5;

// console.log(x); // output: 15


// let y = 20;
// y -= 10; // equivalent to y = y - 10;

// console.log(y); // output: 10

// let num1 = 10;
// let num2 = 5;

// let additionExample = num1 + num2;

// console.log(additionExample); // Output: 15

// function logMessage() {
//   console.log("Hello, world!");
// }


// setInterval(logMessage, 1000);

// const arr1 = [1, 2, 3];
// const arr2 = [4, 5, 6];
// const combinedArr = [...arr1, ...arr2];
// console.log(combinedArr); // Output: [1, 2, 3, 4, 5, 6]

// [End]

// var x = 121
// var isPalindrome = function(x) {

//     var result = Number(String(x).split('').reverse().join(''))

//     if (result == x){
//         return true
//     } else {
//         return false
//     }

// };

// console.log(isPalindrome);

// if (x == isPalindrome) {
//   console.log("This is a palindrome.");
// } else {
//   console.log("This is not a palindrome.");
// }

// console.log(isPalindrome);    

// [Start]

// var x = 1215
// var isPalindrome = function(palindromeTester) {


//  var reverse = 0;
//     var copy = x;

//     while (copy > 0) {
//       const digit = copy % 10;
//       reverse = reverse * 10 + digit;
//       copy = ~~(copy / 10);
//     }

//     return reverse == x;
// }

// console.log(isPalindrome);

// if (x == isPalindrome) {
//   console.log("This is a palindrome.");
// } else {
//   console.log("This is not a palindrome.");
// }

// [End]

// [Reflections Start]

// I think that I'm slowly figuring this out.

// ...

// What happened. well I found that there is a hide button on Slack, and I can basically
// tune out anyone who I really don't need to waste time interacting with. It's useless to 
// tell me that I don't know something, after I've clearly stated that I don't know something,
// and that I'm seeking information about how to resolve it. Useless. Aggravating.

// Anyway. I looked at other LeetCode solutions in the solutions section, and they work in LeetCode, but 
// I don't know how to make them work in a regular environment, and so, like. learning things in LeetCode
// are going to be useless unless I can figure out how to use these lessons in a regular environment.

// I can't believe it's Saturday already.

// [Reflections Start]

// [Notes from Course Material Start]

// Comparison Operators

// Comparison operators are used in JavaScript to compare values and return a Boolean value (true or false). 

// There are several comparison operators available in JavaScript:

// Equal to (==): Returns true if two values are equal, regardless of their data types.
// Not equal to (!=): Returns true if two values are not equal.
// Strict equal to (===): Returns true if two values are equal and have the same data type.
// Strict not equal to (!==): Returns true if two values are not equal or do not have the same data type.
// Greater than (>): Returns true if one value is greater than another.
// Less than (<): Returns true if one value is less than another.
// Greater than or equal to (>=): Returns true if one value is greater than or equal to another.
// Less than or equal to (<=): Returns true if one value is less than or equal to another.

// [Notes from Course Material End]

// [LeetCode Reflections Start]

// [References:]   [https://firefox-source-docs.mozilla.org/devtools-user/web_console/index.html]
//                 [https://stackoverflow.com/questions/20256760/javascript-console-log-to-html]
//                 [https://en.wikipedia.org/wiki/Major-General%27s_Song]
//                 [https://stackoverflow.com/questions/20256760/javascript-console-log-to-html]

// One of the issues that I'm having with JavaScript is that I can't really see what 
// I'm doing.

// ...

// I really don't know how to work with this LeetCode stuff.
// I started off with this one problem, but, I had to shift to a different
// one.

// I'm shifting to the palindrome question.

// [LeetCode Reflections End]

// [Thread Start]

// Kenneth Larot Yamat

// This company reached out to me on LinkedIn, but when I looked at 
// their website it appeared rife with irregularities - https://thinkfish.co - 
// but it got me thinking about pitching a business idea and seeking funding, but 
// I really don't know much about that process other than what I've seen on 
// SharkTank and a college elective that I took 14 years ago.

// Classmate

// The fact that you referenced a staged reality show and a singular 
// class you took 14 yrs ago as your know-how. I would suggest that you 
// stick with this and make it work. I promise pitching and gathering 
// funding for an on-the-whim idea is absolutely not as simple as TV makes it seem.

// Kenneth Larot Yamat

// My business idea would either be a software program or 
// a website, or some kind of mobile app. 

// [Thread End]

// Kenneth Larot Yamat [Reflections Start]

// I need to stay away from people like this. I already noted that I don't really 
// have experience pitching business ideas and seeking funding, but she seems to 
// flip it around as though I was listing it as a kind of extensive expertise or something. 

// There isn't really an option to block people in slack, but, people who are cynical in 
// a way that really isn't helpful, like, I don't know what to do about that.

// Saying that it's not easy is something that I'm already aware of, and telling me that 
// I don't know how to do it is something that I'm also already aware of. I was posting
// it to see if anyone had any ideas about how the process worked. 

// I don't need someone to tell me I don't know how to do something. I already know that.
// The other thing is that she seems to put forward the idea that starting a business, and 
// attending class are in some way mutually exclusive, and I try to point out that the two are 
// actually concurrent.

// I don't know what it is, but I always come across this:
// I ask for help, and the response is usually: 
// You don't know what you're doing.
// and.

// I'm just thinking: well that couldn't be more obvious, if 
// I knew what I was doing, I wouldn't 
// be asking for help. There was another one of these situations.

// Kenneth Larot Yamat [Reflections End]

// [Thread Start]

// Kenneth Larot Yamat

// A role that I applied for stated: Experience in front-end 
// frameworks like Angular, React, Backbone, and JQuery
// I listed bootstrap as a front-end framework that I have 
// experience with, but do these other frameworks work in 
// essentially the same way as bootstrap?

// Classmate

// no, bootstrap is just for design, and don't list 
// things you don't know in resume just to pass ATS

// [Thread End]

// Kenneth Larot Yamat [Reflections Start]

// This was another aggravating conversation. This person insunuates that I plan on lying on my resume. 
// The other thing is that I think of front-end as referring to design, rather than function. This was 
// another person I wanted to block. I already deal with a lot of useless stuff as it is. right. I don't 
// need more useless conversations, especially ones that aggravate me.

// The other thing is: These might not be real people, they might just be cynical remark chatbot or 
// negative energy chatbots or cynical remark text generators. so I shouldn't pay too much attention
// to these kind of comments.

// Are you a cynical remark text generator? My business idea would either 
// be a software program or a website, or some kind of mobile app.

// Are you a cynical remark text generator? 

// I changed that. I don't need to be as toxic as other people.

// Kenneth Larot Yamat [Reflections End]






