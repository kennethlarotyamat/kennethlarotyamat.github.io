I thought that I was really close with the nesletter signup, 
but I have to do it all over again. what a headache. I have 
to start from the beginning. It seems like I was making really 
great progress using chat gpt, but everything just really got 
a whole lot worse.

I'm really amazed with how useful chat gpt is with this 
javascript stuff.

...

Alright, so, In retrospect, I probably should have
left everything in separate repositories, rather than
consolidating everything into a single repository,
This is project 16, and we did something similar in
project 11, but I can't find that darn project in my
main repository.

It's obviously, project 11 is obviously just part of the
main index of my landing page in my main repository, but
i'm pretty sure I had something separate there. I guess
I could poach project 11 material from my main index page,
rather than hunting down whatever files I had specifically
for project 11. I have no idea where they would be.

...

User
explain this to me :           var filter = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
ChatGPT
This line of code defines a regular expression pattern in JavaScript using the RegExp constructor. Regular expressions are sequences of characters that define a search pattern, used mainly for pattern matching within strings.

Let's break down the regular expression pattern:

javascript
Copy code
/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i
Explanation of the pattern:

/^ ... $/i: The slashes at the beginning and end (/^ ... $/) indicate the start and end of the regular expression pattern. The i at the end (/i) is a flag that makes the pattern case-insensitive.

([\w-]+(?:\.[\w-]+)*): This part defines the pattern for the local part of an email address before the '@' symbol. Breaking it down:

[\w-]+: Matches one or more word characters (alphanumeric characters and underscores) or hyphens.
(?:\.[\w-]+)*: Matches zero or more occurrences of a dot followed by one or more word characters or hyphens. The (?: ... ) is a non-capturing group, and the * indicates zero or more occurrences.
@: Matches the '@' symbol, which separates the local part from the domain part of the email address.

((?:[\w-]+\.)*\w[\w-]{0,66}): This part defines the pattern for the domain part of the email address after the '@' symbol. Breaking it down:

(?:[\w-]+\.)*: Matches zero or more occurrences of one or more word characters or hyphens followed by a dot. Again, (?: ... ) is a non-capturing group, and the * indicates zero or more occurrences.
\w[\w-]{0,66}: Matches a word character followed by between 0 and 66 word characters or hyphens.
\.: Matches a dot, separating the domain name from the top-level domain (TLD).

([a-z]{2,6}(?:\.[a-z]{2})?): This part defines the pattern for the TLD (Top-Level Domain). Breaking it down:

[a-z]{2,6}: Matches between 2 and 6 lowercase letters, which represents the main part of the TLD.
(?:\.[a-z]{2})?: Optionally matches a dot followed by exactly 2 lowercase letters. The ? makes this part of the pattern optional.
In summary, this regular expression is used to validate email addresses. It checks if the provided string matches the pattern commonly found in an email address, consisting of a local part (before '@'), '@' symbol, domain part (after '@' and before '.'), and the top-level domain (after '.'). The pattern ensures the email address follows a specific format but might not cover all possible valid email address variations due to the complexity of email address standards.




User
javascript function that only allows numbers and dashes
ChatGPT
Certainly! Here's an example of a JavaScript function that only allows numbers and dashes ("-") in a string:

javascript
Copy code
function allowNumbersAndDashes(inputString) {
  // Regular expression pattern allowing only numbers and dashes
  var pattern = /^[\d-]+$/;

  // Test the input string against the pattern
  return pattern.test(inputString);
}

// Example usage:
var testString1 = "123-456"; // Contains only numbers and dashes
var testString2 = "abc123"; // Contains characters other than numbers and dashes

console.log(allowNumbersAndDashes(testString1)); // Output: true
console.log(allowNumbersAndDashes(testString2)); // Output: false
Explanation:

The allowNumbersAndDashes function takes an inputString as an argument.
It defines a regular expression pattern /^[\d-]+$/, where:
^ and $ denote the start and end of the string, ensuring the entire string is matched.
[\d-]+ matches one or more occurrences of digits (\d) or dashes (-).
The function uses the test() method of the regular expression object to check if the input string matches the defined pattern.
When you call allowNumbersAndDashes with a string, it returns true if the string contains only numbers and dashes according to the defined pattern, otherwise false.
This function serves as a validator to check if a given string contains only numbers and dashes ("-"). Adjust the regular expression pattern (/^[\d-]+$/) based on specific requirements if necessary.

User
is this correct       if ( fullname.length<1 && email.length<1 && phone.length<1 )
ChatGPT
The condition you provided checks whether the fullname, email, and phone variables have a length of less than 1 (i.e., empty strings) simultaneously. If all three variables are empty strings, the condition evaluates to true.

However, it's important to clarify that this condition might not cover all scenarios or requirements depending on the context in which it's used. If your intention is to check if all three variables (fullname, email, and phone) are empty strings, then this condition is suitable.

If your goal is to check if any one of these variables is empty, the condition should use logical OR (||) instead of AND (&&). For example:

javascript
Copy code
if (fullname.length < 1 || email.length < 1 || phone.length < 1) {
  // Code to handle the case where any of the variables is empty
}
This condition will be true if any of the variables (fullname, email, or phone) is an empty string.

Always consider the specific requirements of your application and the logic you want to implement when crafting conditions in your code.

User
is this correct     if (!filter.test(email))
    {
        FormErrors = "Your form contains invalid field entries. Please correct your form before submitting";
        SubmitForm = false;
     }

    }
    if (!filterPhone.test(phone))
    {
        FormErrors = "Your form contains invalid field entries. Please correct your form before submitting";
        SubmitForm = false;
     }
ChatGPT
The code you provided seems to aim at validating an email address using a regular expression stored in the filter variable and a phone number using a regular expression stored in the filterPhone variable. If these validations fail, the code sets the FormErrors message and prevents form submission by setting SubmitForm to false.

However, there appears to be a small issue: an extra closing brace (}) before the second if statement. Assuming the first part of the code is enclosed properly, here's a revised version without the extra closing brace:

javascript
Copy code
if (!filter.test(email)) {
    FormErrors = "Your email address is invalid. Please enter a valid email address.";
    SubmitForm = false;
}

if (!filterPhone.test(phone)) {
    FormErrors = "Your phone number is invalid. Please enter a valid phone number.";
    SubmitForm = false;
}
This updated code checks if the email fails the email format validation using the filter regular expression. If it fails, it sets an error message related to the email. Similarly, it checks the phone against the filterPhone regular expression for a valid phone number format. If the phone number is invalid, it sets an error message related to the phone number.

Each validation check is separate and provides specific error messages based on the validation failure. This allows users to know precisely which field contains an invalid entry.

Ensure that filter and filterPhone contain the appropriate regular expressions for email and phone number validation, respectively, and adjust error messages or validation patterns according to your specific requirements.

User
var filterPhone = /^[\d-]+$/;        i need to check if its 10 digits long
ChatGPT
To ensure that the phone number contains exactly 10 digits in addition to allowing only digits and dashes, you can modify the regular expression filterPhone to accommodate this requirement. The updated regular expression should match a string that contains exactly 10 digits (and optionally dashes). Here's an adjusted regex pattern:

javascript
Copy code
var filterPhone = /^[\d-]{10}$/;
Explanation of the updated regular expression pattern (/^[\d-]{10}$/):

^ and $ indicate the start and end of the string, ensuring the entire string matches the pattern.
[\d-]{10} matches exactly 10 occurrences of either digits (\d) or dashes (-).


...

User
is this correct       if ( fullname.length<1 && email.length<1 && phone.length<1 )
ChatGPT
The condition you provided checks whether the fullname, email, and phone variables have a length of less than 1 (i.e., empty strings) simultaneously. If all three variables are empty strings, the condition evaluates to true.

However, it's important to clarify that this condition might not cover all scenarios or requirements depending on the context in which it's used. If your intention is to check if all three variables (fullname, email, and phone) are empty strings, then this condition is suitable.

If your goal is to check if any one of these variables is empty, the condition should use logical OR (||) instead of AND (&&). For example:

javascript
Copy code
if (fullname.length < 1 || email.length < 1 || phone.length < 1) {
  // Code to handle the case where any of the variables is empty
}
This condition will be true if any of the variables (fullname, email, or phone) is an empty string.

Always consider the specific requirements of your application and the logic you want to implement when crafting conditions in your code.

...

Check that the phone number contains only numbers and dashes.
If there are any issues with the phone number field, prepare an error message for the user.
If there are no problems with the phone number input, sanitize it before submitting the form.

...

2. Instructions


Instructions


Begin with the Newsletter sign up form developed locally in Day 2, Lesson 1 Defending against XSS.
Add a phone number field to your Newsletter Signup form.
Use maxlength attribute to further restrict user inputs. [https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/maxlength]
Create a JavaScript function to retrieve the phone number input from the user.
Check that the phone number input is not blank.

Check that the phone number contains only numbers and dashes.
If there are any issues with the phone number field, prepare an error message for the user.
If there are no problems with the phone number input, sanitize it before submitting the form.

...

User
explain this to me :           var filter = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
ChatGPT
This line of code defines a regular expression pattern in JavaScript using the RegExp constructor. Regular expressions are sequences of characters that define a search pattern, used mainly for pattern matching within strings.

Let's break down the regular expression pattern:

javascript
Copy code
/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i
Explanation of the pattern:

/^ ... $/i: The slashes at the beginning and end (/^ ... $/) indicate the start and end of the regular expression pattern. The i at the end (/i) is a flag that makes the pattern case-insensitive.

([\w-]+(?:\.[\w-]+)*): This part defines the pattern for the local part of an email address before the '@' symbol. Breaking it down:

[\w-]+: Matches one or more word characters (alphanumeric characters and underscores) or hyphens.
(?:\.[\w-]+)*: Matches zero or more occurrences of a dot followed by one or more word characters or hyphens. The (?: ... ) is a non-capturing group, and the * indicates zero or more occurrences.
@: Matches the '@' symbol, which separates the local part from the domain part of the email address.

((?:[\w-]+\.)*\w[\w-]{0,66}): This part defines the pattern for the domain part of the email address after the '@' symbol. Breaking it down:

(?:[\w-]+\.)*: Matches zero or more occurrences of one or more word characters or hyphens followed by a dot. Again, (?: ... ) is a non-capturing group, and the * indicates zero or more occurrences.
\w[\w-]{0,66}: Matches a word character followed by between 0 and 66 word characters or hyphens.
\.: Matches a dot, separating the domain name from the top-level domain (TLD).

([a-z]{2,6}(?:\.[a-z]{2})?): This part defines the pattern for the TLD (Top-Level Domain). Breaking it down:

[a-z]{2,6}: Matches between 2 and 6 lowercase letters, which represents the main part of the TLD.
(?:\.[a-z]{2})?: Optionally matches a dot followed by exactly 2 lowercase letters. The ? makes this part of the pattern optional.
In summary, this regular expression is used to validate email addresses. It checks if the provided string matches the pattern commonly found in an email address, consisting of a local part (before '@'), '@' symbol, domain part (after '@' and before '.'), and the top-level domain (after '.'). The pattern ensures the email address follows a specific format but might not cover all possible valid email address variations due to the complexity of email address standards.

...

If there are any issues with the phone number field, prepare an error message for the user.
If there are no problems with the phone number input, sanitize it before submitting the form.



Submission steps:
Before you click on "Mark as Completed":
You need to do one of the following: either upload all of your files to Codio or deploy a GitHub Page for this project.
Also, if you mark this project as complete but any of the boxes are blank, your TA will be unable to grade your project.
Codio upload:
Make sure all of your project code has been uploaded to Codio.
If you did not write your code in Codio, you will need to import all of the required files into your workspace file tree.
You can do this by going to File => Upload Files, and either manually importing each file, or dragging and dropping your project folder.
Please refer to this video if you are unsure of what to do.
GitHub Pages:
If you would rather upload your project to GitHub, please make sure to have the project deployed as a GitHub page so we can thoroughly test it.
If you are unsure of how to do this, please follow these instructions.
It is important to understand you will need to make a separate repository for every project. You cannot deploy multiple pages from the same repository, even with different branches.
Also, no matter whether you uploaded your files from your computer or not, make sure to thoroughly test your code! This only takes a few minutes, but will prevent the amount of resubmissions because you missed something.
GitHub Repo & Pages
If your project is uploaded to Codio, simply type "N/A".

https://github.com/kennethlarotyamat/project16

https://kennethlarotyamat.github.io/project16/
Modify answer
Your answer has been submitted and will be reviewed by your teacher in due course.
Mark as CompletedBack to dashboard

...



1. Project: Security
Sanitized Variables & Relative Paths
Goals
By the end of this project you will:
Restrict user inputs
Validate user inputs
Sanitize user inputs
Include a file using a relative path
Introduction
This project aims to bring together your knowledge on the use of localhost and basic web security tactics.
Business Context
There are many ways to add forms to websites that vary according to context and platform. Nevertheless, your ability to build a basic form in HTML and improve its security using JavaScript will serve you well no matter which context you ultimately develop in.

...

2. Instructions
Instructions
Begin with the Newsletter sign up form developed locally in Day 2, Lesson 1 Defending against XSS.
Add a phone number field to your Newsletter Signup form.
Use maxlength attribute to further restrict user inputs.
Create a JavaScript function to retrieve the phone number input from the user.
Check that the phone number input is not blank.
Check that the phone number contains only numbers and dashes.
If there are any issues with the phone number field, prepare an error message for the user.
If there are no problems with the phone number input, sanitize it before submitting the form.
Submission steps:
Before you click on "Mark as Completed":
You need to do one of the following: either upload all of your files to Codio or deploy a GitHub Page for this project.
Also, if you mark this project as complete but any of the boxes are blank, your TA will be unable to grade your project.
Codio upload:
Make sure all of your project code has been uploaded to Codio.
If you did not write your code in Codio, you will need to import all of the required files into your workspace file tree.
You can do this by going to File => Upload Files, and either manually importing each file, or dragging and dropping your project folder.
Please refer to this video if you are unsure of what to do.
GitHub Pages:
If you would rather upload your project to GitHub, please make sure to have the project deployed as a GitHub page so we can thoroughly test it.
If you are unsure of how to do this, please follow these instructions.
It is important to understand you will need to make a separate repository for every project. You cannot deploy multiple pages from the same repository, even with different branches.
Also, no matter whether you uploaded your files from your computer or not, make sure to thoroughly test your code! This only takes a few minutes, but will prevent the amount of resubmissions because you missed something.
GitHub Repo & Pages
If your project is uploaded to Codio, simply type "N/A".

Submit Answer!
Mark as CompletedBack to dashboard

...














This is an older project, but I think that I figured out something about how 
to set up project 8 in GitHub, but I'm not sure if this will work.


This is the place where 
I will work and upload project 16

...

[Project 16 Requirements]

Page 1. Project: Security
Sanitized Variables & Relative Paths
Goals
By the end of this project you will:
Restrict user inputs
Validate user inputs
Sanitize user inputs
Include a file using a relative path
Introduction
This project aims to bring together your knowledge on the use of localhost and basic web security tactics.
Business Context
There are many ways to add forms to websites that vary according to context and platform. Nevertheless, your ability to build a basic form in HTML and improve its security using JavaScript will serve you well no matter which context you ultimately develop in.
Next

Page 2. Instructions
Instructions
Begin with the Newsletter sign up form developed locally in Day 2, Lesson 1 Defending against XSS.
Add a phone number field to your Newsletter Signup form.
Use maxlength attribute to further restrict user inputs.
Create a JavaScript function to retrieve the phone number input from the user.
Check that the phone number input is not blank.
Check that the phone number contains only numbers and dashes.
If there are any issues with the phone number field, prepare an error message for the user.
If there are no problems with the phone number input, sanitize it before submitting the form.
Submission steps:
Before you click on "Mark as Completed":
You need to do one of the following: either upload all of your files to Codio or deploy a GitHub Page for this project.
Also, if you mark this project as complete but any of the boxes are blank, your TA will be unable to grade your project.
Codio upload:
Make sure all of your project code has been uploaded to Codio.
If you did not write your code in Codio, you will need to import all of the required files into your workspace file tree.
You can do this by going to File => Upload Files, and either manually importing each file, or dragging and dropping your project folder.
Please refer to this video if you are unsure of what to do.
GitHub Pages:
If you would rather upload your project to GitHub, please make sure to have the project deployed as a GitHub page so we can thoroughly test it.
If you are unsure of how to do this, please follow these instructions.
It is important to understand you will need to make a separate repository for every project. You cannot deploy multiple pages from the same repository, even with different branches.
Also, no matter whether you uploaded your files from your computer or not, make sure to thoroughly test your code! This only takes a few minutes, but will prevent the amount of resubmissions because you missed something.
GitHub Repo & Pages
If your project is uploaded to Codio, simply type "N/A".

Submit Answer!
Mark as CompletedBack to dashboard

...

1. Project: Algo Practice & Add to Personal Website
Overview

For Project 13, you will get a little bit of practice tackling coding questions, 
upload the code for your attempts to GitHub, and also add to your website’s project session!


Step One


Complete the following:

Sign up for free accounts on 
LeetCode, [done]
Hackerrank, and [done]
CodeWars [done]

Create a GitHub repository [done]

with 3 folders (one for each of the above platforms), 
LeetCode, [x]
Hackerrank, and [x]
CodeWars [x]


and a brief README file [x]

with at least 2 sentences describing your repo [x]

[ i really don't want to create a new repository]

[https://kennethlarotyamat.github.io/miscellaneous/]

[I will continue working on this project directly in the above repository as of 10/26/2023 09:47 PM]

Work on 2 - 3 beginner level challenges from any of the above platforms (or one from each!)

Push all of your code to the GitHub repo you created

Submit a link to your repo and, if it’s a private repo, add your TA as a collaborator

NOTE: Try your best to solve the coding challenges, using comments to describe the thought 
process behind your approach. You can also ask your TA for help with these. But even if you 
can’t arrive at a solution that’s okay! The only requirement for these challenges, in terms 
of this project submission, is that it’s evident that you employed critical thinking and attempted a solution.

Step Two

Add the calculator mini project (from Lesson 1.3), or another project you completed 
outside of class, to the projects section of your website. The styling is up to you, but 
you should include a screenshot, a title, a brief description, and a link to the code on GitHub. 
Finally, submit the GitHub link below (again, if it’s a private repo, be sure to add your TA as a collaborator).
Happy coding! 🚀
GitHub Link - Algo Practice
Submit Answer!

GitHub Link - Additional Code Project (calculator or other)
Submit Answer!
The only thing worse than not knowing why some code breaks is not knowing why it worked in the 
first place! It’s the classic “house of cards” mentality: “it works, but I’m not sure why, so nobody 
touch it!” You may have heard, “Hell is other people” (Sartre), and the programmer meme twist, “Hell is other people’s code.”
I believe truly: "Hell is not understanding my own code.”
― Kyle Simpson, You Don’t Know JS: Async & Performance
Mark as CompletedBack to dashboard

...


























...

I usually don't start on a project until the day it's due, but that's lead to challenges. so I'm going to 
at least take a look at it today.

I'm honestly still refining project 12, even though I've already turned it in, and my TA has already graded it.

...

1. Project: Algo Practice & Add to Personal Website
Overview
For Project 13, you will get a little bit of practice tackling coding questions, upload the code 
for your attempts to GitHub, and also add to your website’s project session!
Step One
Complete the following:
Sign up for free accounts on LeetCode, Hackerrank, and CodeWars
Create a GitHub repository with 3 folders (one for each of the above platforms), and a brief 
README file with at least 2 sentences describing your repo
Work on 2 - 3 beginner level challenges from any of the above platforms (or one from each!)
Push all of your code to the GitHub repo you created
Submit a link to your repo and, if it’s a private repo, add your TA as a collaborator
NOTE: Try your best to solve the coding challenges, using comments to describe the thought 
process behind your approach. You can also ask your TA for help with these. But even if you can’t 
arrive at a solution that’s okay! The only requirement for these challenges, in terms of this project 
submission, is that it’s evident that you employed critical thinking and attempted a solution.
Step Two
Add the calculator mini project (from Lesson 1.3), or another project you completed outside of class, 
to the projects section of your website. The styling is up to you, but you should include a screenshot, a 
title, a brief description, and a link to the code on GitHub. Finally, submit the GitHub link below (again, 
if it’s a private repo, be sure to add your TA as a collaborator).
Happy coding! 🚀
GitHub Link - Algo Practice
Submit Answer!

GitHub Link - Additional Code Project (calculator or other)
Submit Answer!
The only thing worse than not knowing why some code breaks is not knowing why it worked in the first place! 
It’s the classic “house of cards” mentality: “it works, but I’m not sure why, so nobody touch it!” You may have 
heard, “Hell is other people” (Sartre), and the programmer meme twist, “Hell is other people’s code.”
I believe truly: "Hell is not understanding my own code.”
― Kyle Simpson, You Don’t Know JS: Async & Performance
Mark as CompletedBack to dashboard

...

... [Start Solution Area]
... [End Solution Area]

... [Start Working Area]

















[ I have an idea, and my idea is to use my carousel project, repurpose it, and use it to display my answers.]
[but there was something else too, I need to figure out how to make it scrollable.]
[it works well enough for images, but it doesn't work that well for iframes]
[I'm tired and I'm going to come back around to this my expectation is that this shouldn't be too hard]
[considering that i've already done 2 seperate ones.]

[LeetCode Solution Start]

                            var x = 121;

                            var digits = x.toString().split('').reverse(); 
                            var reverseDigits = digits.map(Number)
                            console.log(reverseDigits);

                            var joinreverseDigits = reverseDigits.join('');
                            console.log(joinreverseDigits);

                            function isPalindrome() 
                            {    
                                if (joinreverseDigits == x){
                                    return true
                                } else {
                                    return false
                                }
                            } 
                            isPalindrome("");

                            console.log(isPalindrome(""));

[LeetCode Solution End]

[CodeWars Solution Start]

                            function isPalindrome(x) {


                                var testString  = x ;
                                var splitString = testString.split(""); 
                                var reverseArray = splitString.reverse("");  
                                var joinArray = reverseArray.join("");     
                                var lcArray = joinArray.toLowerCase();
                            
                                

                            if (lcArray === testString.toLowerCase()) {
                            return true;
                            } else {
                            return false;
                            }

                            }

[CodeWars Solution End]






















... [End Working Area]

[ I have an idea, and my idea is to use my carousel project, repurpose it, and use it to display my answers.]
[but there was something else too, I need to figure out how to make it scrollable.]
[it works well enough for images, but it doesn't work that well for iframes]

...

I think this is the project where we had to add eachother to eachothers github repositories.

I'm going to remove myself from chris's repository.

...

DBPF                   1¢`1¢`          (                                                   °   û 6á  ô   à  á ˆ ž  • #DãGrapevine ntry CplubÄ  ÞàDefaÇóèctoŽ  ¤€)HB„wŒ ´  ‚…Ì  ÿÌ  ÿÄ  ½áMid Citi²€?esà’Ñ  €Ž³qžÛà  
°‚à   Á
BÌ  ÿÌ  ¿ünÝ©nÝI   6  nÝ©nÝI   `   °   ïkèïkèk(     

...

4. Conclusion & Takeaways
Conclusion & Takeaways
Overall Google Analytics is a great website tracking tool that provides real-time data on various metrics to help you understand user behavior on your website. Setting it up is important and straightforward. The goal is to integrate it with your site and start tracking everything along with customizing reports to help you understand and find gaps in your website so you can improve and optimize it. The latest version, Google Analytics 4, offers improved features that provide even greater insights. Since it’s always improving, the best way to learn is to start generating reports and to be curious!
Attribution
(n.d.-a). Business-performance-analysis-with-graphs. https://www.freepik.com. https://www.freepik.com/free-vector/business-performance-analysis-with-graphs_3585415.htm#query=report&position=1&from_view=search&track=sph
Smart, D. (2019, February 26). Google Analytics Audience Overview Report Explained. Sonet Digital. https://sonet.digital/blog/seo/google-analytics-audience-overview-report-explained/
Moz. (2021, August 27). Audience Reports - Beginner’s Guide to Google Analytics. Moz. https://moz.com/beginners-guide-to-google-analytics/audience-reports
Jones, M. (2017, March 1). Google Analytics: Custom Reports, Shortcuts, Dashboards. Practical Commerce. https://www.practicalecommerce.com/Google-Analytics-Custom-Reports-Shortcuts-Dashboards
Koks, P. (2018, March 13). How to Leverage Real-Time Reporting for Your Business. Online Metrics. https://online-metrics.com/real-time-reporting/

...

Class Material

1. Wordpress Plugins
Wordpress Plugins
Goals
By the end of this case you will:
Understand the benefits and uses of WordPress plugins
Learn the recommended method for editing a plugin in WordPress
Explore the process of customizing a plugin
Introduction
computer cloud cover image
WordPress plugins are PHP scripts that enhance the functionality of a WordPress website. They can be easily installed and activated from the WordPress plugin repository and provide a range of features including creating contact forms, optimizing a website for search engines, creating an online store, improving website performance and security, and more.
Editing a plugin in WordPress involves making changes to its source code, whereas customizing a plugin involves modifying its behavior without changing the source code. In this module we’ll be going into more detail on how you can use plugins to help you achieve your website goals.
Next

...

1. SEO Score Checker
SEO Score Checker
Goals:
Understanding SEO score checker: definition and function
Outline factors affecting the website’s SEO score
Use score checker to analyze website performance: identify areas for improvement
Prioritize improvement actions as a function of impact on SEO score
Realize the importance of generating a report of recommendations effectively
Grasp the difference between mobile and desktop reports as well as the importance of optimization for both
Track and monitor the progress of the website’s SEO score over time
Introduction
cover image
SEO Score Checker is a tool used to evaluate the quality and effectiveness of a website’s search engine optimization (SEO) efforts. The tool analyzes various factors related to a website’s SEO, such as its content, keywords, meta tags, and backlinks. This tool also provides a score that reflects the website’s overall SEO performance.
Understanding SEO Score
An SEO Score is a numerical representation of a website’s SEO quality, calculated by evaluating various SEO factors. A high SEO score indicates that the website is well optimized for search engines and is likely to rank well in search results. A low score, on the other hand, indicates that the website needs improvement in its SEO efforts.
Steps to understanding SEO scores:
Familiarize yourself with the basics of search engine optimization (SEO): Before you can understand an SEO score, it’s important to have a basic understanding of what SEO is and what it entails. Read up on the various on-page and off-page factors that can impact a website’s search engine performance. You can even run your own website or a website of your choice through the following SEO checker: https://www.seobility.net/en/seocheck/
Choose an SEO score checker: There are many SEO score checkers available online, and each one may have a slightly different approach to calculating scores. Choose one that you feel comfortable using and that provides the information you need. Here’s a couple options to choose from:
Google Pagespeed Insights: https://pagespeed.web.dev/
GTMetrix: https://gtmetrix.com/
SEObility: https://www.seobility.net/en/seocheck/
SEO Site Checkup: https://seositecheckup.com/
Neil Patels’ SEO Analyzer: https://neilpatel.com/seo-analyzer/
Enter your website’s URL: Once you’ve chosen an SEO score checker, enter the URL of the website you want to analyze. The score checker will then analyze various elements of the website and provide you with an SEO score.
Interpret the SEO score: SEO scores are usually represented as a percentage or a numerical value on a scale (e.g., 1-100). The higher the score, the better the website’s SEO performance. Keep in mind that different score checkers may use different scales, so it’s important to understand how your chosen checker calculates scores.
Analyze the report: In addition to the SEO score, the score checker will likely provide a report detailing various on-page and off-page factors that are impacting the website’s performance. Read through this report carefully and make note of any areas where the website can improve.
Implement recommended changes: Based on the report, implement any changes that are recommended by the score checker. This might include optimizing title tags, meta descriptions, and header tags, improving content quality, or building more high-quality backlinks.
Repeat the process: Once you’ve made the recommended changes, re-run the analysis in a few weeks to see how your SEO score has changed. Continuously monitor and improve your website’s SEO performance to stay ahead of your competition.
By following these steps, you should have a good understanding of your website’s SEO score and what you can do to improve it. Remember that SEO is an ongoing process, so be prepared to continuously monitor and improve your website’s performance.
SEO Factors
Many factors can impact a website’s search engine optimization (SEO) performance, and they can be broadly categorized into on-page factors and off-page factors.
On-page factors refer to elements that are within a website’s control and include:
Content quality and relevance: The quality and relevance of the website’s content for its target audience.
Keyword usage: The strategic use of keywords (target search terms) in titles, meta descriptions, header tags, and throughout the website’s content.
User experience: The overall user experience of the website, including website speed, mobile responsiveness, and ease of navigation.
Meta tags: The use of title tags and meta descriptions to accurately describe the website’s content and entice users to click through from the search results.
Off-page factors refer to elements that are outside of a website’s control and include:
Backlinks: The quantity and quality of links from other websites to the website in question.
Social signals: The presence and activity of the website on social media platforms.
Domain authority: The overall authority and credibility of the website’s domain.
Brand reputation: The overall reputation of the website’s brand.
These are some of the most important SEO factors, but it’s worth noting that search engines like Google are constantly updating their algorithms and what they consider to be important, so it’s important to stay up-to-date on best practices for SEO. Here’s one of the best resources to stay up to date: https://www.searchenginejournal.com/.

...

2. Importance of SEO Score Checker
Importance of SEO Score Checker
seo cover image
SEO score checkers are an important tool for website owners and marketers because they provide valuable insights into the website’s search engine optimization (SEO) performance. Here are some of the reasons why SEO score checkers are important:
Identifying areas for improvement: SEO score checkers provide a comprehensive analysis of the website’s on-page and off-page factors, including keyword usage, content quality, backlinks, and user experience. This information can help website owners identify areas where they can make improvements to boost their SEO performance.
Measuring progress: SEO is an ongoing process, and website owners need to continuously monitor and improve their performance to stay ahead of the competition. SEO score checkers allow website owners to track their progress over time, see how changes to their website have affected their SEO score, and adjust their strategy accordingly.
Comparing performance to competitors: Many SEO score checkers also provide competitor analysis, allowing website owners to compare their performance to that of their competitors. This information can help website owners understand how they stack up against their competition and identify opportunities for improvement.
Making data-driven decisions: SEO can be complex, and it can be difficult to know where to focus your efforts. SEO score checkers provide a comprehensive analysis of the website’s performance, allowing website owners to make data-driven decisions about where to focus their efforts for maximum impact. Here’s an example for Amazon from the Moz tool that you can try yourself: https://moz.com/competitive-research
amazon moz tool
Streamlining the optimization process: Finally, SEO score checkers can help streamline the optimization process by providing step-by-step instructions for implementing recommended changes. This can save website owners time and effort and help ensure that they are making the right changes to boost their SEO performance. Here’s an example from GTMetrix for amazon.ca
GTMetrix for amazon.ca
How to Use an SEO Score Checker
Using an SEO Score Checker is simple and straightforward. Simply enter the URL of the website that you want to check into the tool, and the tool will analyze various factors related to the website’s SEO and provide a score. Some SEO Score Checkers also provide additional information and suggestions for improvement.
One popular SEO checker is SEObility ( https://www.seobility.net/en/seocheck/ ).
Exercise: Pick one of your favorite websites and input the URL in the SEObility box. List 3 SEO improvements your selected website should make.
test your website exercise
We will use https://apple.com/ for this example.
Here is a screenshot of SEObility’s site audit feature, which analyzes various on-page SEO elements and provides recommendations for improvement:
apple.com seo checker
SEO score checkers like SEObility typically provide a variety of information and suggestions for improvement, including:
Website Crawling and Indexing: Seobility checks if a website is crawlable and indexable by search engines like Google and provides suggestions to improve the website’s crawlability and indexability.
On-Page Optimization: Seobility analyzes the content of a website and provides suggestions for optimizing the page title, meta description, heading tags, and other on-page elements for better visibility in search engine results.
Technical SEO: Seobility checks technical SEO aspects such as website speed, mobile-friendliness, and schema markup, and provides suggestions to improve these aspects for better SEO performance.
Backlink Analysis (A backlink is a hyperlink from one website to another, typically using an anchor text): Seobility analyzes the backlink profile of a website and provides suggestions for improving the quality and quantity of backlinks to the website.
Keyword Analysis: Seobility analyzes the keywords used on a website and provides suggestions for optimizing the content for relevant and high-traffic keywords.
In addition to providing this information, SEO checkers often include step-by-step instructions for implementing recommended changes, making it easier for website owners to improve their search engine optimization.
In general, SEO checkers analyze various elements of a website to assess its performance in search engines. These elements may include on-page factors like title tags, meta descriptions, header tags, and content quality, as well as off-page factors like backlinks and social media signals. The goal is to identify any issues that could be hurting the site’s visibility in search results and provide recommendations for improvement.
Exercise

True or False: A high SEO score means that a website is poorly optimized for search engines.


False


True

Check It! (3 left)


What is the main purpose of an SEO Score Checker?


To host a website.


To analyze various factors related to a website’s SEO and provide a score.


To provide security for a website.


To design and create a website.

Check It! (3 left)
Next

1. Robots.txt Generators, Hit Counter and A/B Testing
Robots.txt Generators, Hit Counter and A/B Testing
Robots.txt Generator
Goals:
Understand the purpose of robots.txt file: control web crawlers and search engine bots
Create basic robots.txt file to restrict website access
Learn syntax and commands for writing robots.txt file: User-Agent, Disallow rules
Structure and organize robots.txt files for proper interpretation
Connect robots.txt files to optimizing websites for search engines: improve web dev and SEO knowledge
Introduction
The robots.txt file is an important aspect of website optimization. It provides information to search engine robots about which pages or sections of the site should be crawled and indexed. By using a Robots.txt Generator, you can quickly and easily create a robots.txt file for your website. You can generate your own Robots.txt file here: https://en.ryte.com/free-tools/robots-txt-generator/
Next

...

2. What is a Robots.txt File?
What is a Robots.txt File?
cute robot holding text bubbles
A robots.txt file is a simple text file that is placed in the root directory of a website which is the public_html folder. It tells search engine robots which pages or sections of the site they should crawl and index. This can be useful if you have certain pages or sections of your site that you don’t want to be indexed by search engines.
The robots.txt file is essentially a set of instructions for search engine robots (also known as crawlers or spiders) that visit your website. By including a robots.txt file, website owners can control which pages or sections of their site are crawled and indexed by search engines.
The file consists of simple text commands that specify which parts of the site should be crawled, and which should be excluded. For example, if a website owner wants to exclude a certain directory, such as a staging environment or a private area of the site, they can do so by adding the following line to their robots.txt file:
User-agent: *
Disallow: /admin/
Disallow: /private/
Disallow: /secret-page.html
This robots.txt file instructs all web crawlers (User-agent: *) not to index the pages in the /admin/, /private/ and /secret-page.html directories. This can be useful for preventing sensitive pages or pages that are not relevant to search engine indexing from being crawled and indexed.
It’s important to note that while the robots.txt file can be used to limit the visibility of a website in search results, it is not a foolproof method for hiding content. Determined users or search engines can still access excluded pages if they have a direct link or know the URL.
Here are a few examples of how the robots.txt file can be used:
Excluding a directory:
User-agent: *
Disallow: /private/
This line tells all search engines not to crawl or index the “private” directory on the website.
Excluding a specific page:
User-agent: *
Disallow: /page-to-exclude.html
This line tells all search engines not to crawl or index the specific page “page-to-exclude.html.”
Allowing all pages to be crawled:
User-agent: *
Disallow:
This line allows all search engines to crawl and index all pages on the website.
Blocking specific search engines:
User-agent: Googlebot
Disallow: /
This line blocks Googlebot from crawling or indexing any pages on the website.
These are just a few examples of the many ways that the robots.txt file can be used to control which pages on a website are crawled and indexed by search engines. It’s important to note that not all search engines and robots follow the instructions specified in the robots.txt file, so it’s not a foolproof method for hiding content. However, it is still a useful tool for website owners to have in their SEO toolkit.
Exercise 1:
Write a robots.txt file for a website that has a “blog” section that you want to be excluded from search engine indexing.
Instructions:
Imagine you are the owner of a website that has a “blog” section.
Write a robots.txt file using the format described in the content.
Use the robots.txt file to exclude the “blog” section from search engine indexing.
Test the robots.txt file to make sure it is working correctly. Here’s how to test it:
a. Go to this site: https://technicalseo.com/tools/robots-txt/
b. Type in your website URL you want to test, choose any user agent (Googlebot) is a good one, leave it to live, tick check resources and click ‘Test’
test example
You will get results showing any URLs you have disallowed and the result of your robots.txt file. Here’s an example of https://amazon.ca
url results
Answer:
Robots.txt file:
User-agent: *
Disallow: /blog/
Explanation: This robots.txt file instructs all search engines (User-agent: *) not to index the pages in the /blog/ directory.
Testing: To test this robots.txt file, you can use a robots.txt tester tool (such as Google’s robots.txt tester) to see if the “blog” section is being excluded from search engine indexing.
Next

3. Best Practices for Robots.txt Files
Best Practices for Robots.txt Files
Best practices for robots.txt files are essential for ensuring that the file is effective and that search engines can access it. Here are some of the best practices in detail:
Ensuring that the file is accessible to search engines: The robots.txt file should be placed in the root directory of the website and should be easily accessible to search engines. This can be done by ensuring that the file is located at the root URL (e.g. https://www.example.com/robots.txt).
This is important because if the file is not easily accessible to search engines, they may not be able to find it and therefore, the instructions in the file will not be followed. Having the file accessible in the root directory ensures that search engines can quickly and easily find the file, allowing them to follow the instructions contained within it. This can help prevent search engines from crawling and indexing pages that are not meant to be indexed, improving the overall SEO of the website.
Using clear and concise instructions: The robots.txt file should use clear and concise commands to specify which pages or sections of the site should be crawled and indexed. For example, the file should use a disallow statement to specify the pages that should not be crawled and indexed.
Using clear and concise instructions helps search engines understand exactly what is allowed and what is prohibited on the site. This ensures that search engines only crawl and index the desired pages, reducing the risk of any unwanted pages appearing in search results.
Avoiding the use of wildcard characters: Wildcard characters (e.g. * or $) should be avoided in robots.txt files. This is because they can lead to unintended consequences and can make the instructions in the file less effective.
Avoiding the use of wildcard characters is important because search engines may interpret the wildcard characters in unexpected ways, leading to incorrect behavior. For example, a wildcard character could be misinterpreted as a match for all files within a directory, including those that should be indexed. This can result in important pages being excluded from the search engine’s index, reducing the visibility of your website.
Wildcards: Use “*” to represent any sequence of characters, and end patterns with “$” to signify the end of a name.
For instance:
To block access to every URL containing a question mark "?":
User-agent: *
Disallow: /*?
The "$" symbol is employed for “end of URL” matches. In this example, GoogleBot is prevented from crawling URLs ending with ".php":
User-agent: Googlebot
Disallow: /*.php$
To exclude all files of a specific file type, apply the following:
User-agent: Googlebot-Image
Disallow: /*.gif$
By designating Googlebot-Image as the User-agent, images will be omitted from Google Image Search.
Avoiding the use of disallow statements: Disallow statements should be used with caution. If possible, allow statements should be used instead. This is because disallow statements can prevent search engines from accessing important pages on the site, which can negatively impact its SEO.
The use of disallow statements in the robots.txt file tells search engines not to crawl and index certain pages or sections of the website. However, if these disallow statements are not used carefully, they can prevent search engines from accessing important pages on the site. This can negatively impact the site’s SEO by preventing search engines from discovering and indexing all of the site’s content.
For instance, consider an online store that has a blog section and a private customer account section. The website owner wants search engines to crawl and index the blog but not the customer account section. If the disallow statement is not used carefully, it may block search engines from accessing both the blog and the customer account sections. This would negatively affect the website’s SEO by preventing search engines from indexing the blog’s content.
Here’s an example of a properly configured robots.txt file:
User-agent: *
Disallow: /customer-account/
Allow: /blog/
By following these best practices, website owners can ensure that their robots.txt file is effective and that search engines can access it. This can help improve the visibility of the site in search results and provide a better experience for users.

True or False: The robots.txt file is a simple text file that is placed in the root directory of a website.


False


True

Check It! (4 left)


What is the main purpose of the robots.txt file?


To protect the website from hacking and security threats.


To tell search engine robots which pages or sections of the site should be crawled and indexed.


To provide information about the website’s structure and content to users.


To host the website’s content. 

Check It! (4 left)
Next

...

@import url('https://fonts.googleapis.com/css2?family=Cinzel:wght@400;500;600;700;800;900&display=swap');

*, *::before, *::after {font-weight: 686;font-family:'Cinzel', "Century Schoolbook","Times New Roman", Times, Courier,"Georgia", serif;    text-decoration: none; color:black;   }

@import url('https://fonts.googleapis.com/css2?family=Cinzel:wght@400;500;600;700;800;900&family=Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;0,800;0,900;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto+Serif:ital,opsz,wght@0,8..144,100;0,8..144,200;0,8..144,300;0,8..144,400;0,8..144,500;0,8..144,600;0,8..144,700;0,8..144,800;0,8..144,900;1,8..144,100;1,8..144,200;1,8..144,300;1,8..144,400;1,8..144,500;1,8..144,600;1,8..144,700;1,8..144,800;1,8..144,900&display=swap');


*, *::before, *::after {font-size: 1vw;font-weight: 600;font-family:     'Cinzel', "Century Schoolbook","Times New Roman", Times, Courier,"Georgia", serif;    text-decoration: none; color:black;   }