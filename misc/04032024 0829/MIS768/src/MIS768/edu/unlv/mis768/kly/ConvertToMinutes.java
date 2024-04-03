package edu.unlv.mis768.kly;

import java.util.Scanner;

public class ConvertToMinutes {

	public static void main(String[] args) {
		// variable declaration // TODO Auto-generated method stub
		//int hours; // user input - entered by user - user defined
		//int minutes;// user input - entered by user - user defined
		//int convertedMinutes; // result to be calculated
		//Scanner kb = new Scanner(System.in); // I have to remember to import the scanner // the was one other thing we learned to import, but I forgot what that was // 
		
		//System.out.print("Please enter the number of hours: ");
		//hours = kb.nextInt();
		//System.out.print("Please enter the number of minutes: ");
		//minutes = kb.nextInt();
		
		//convertedMinutes = convertToMinutes(hours, minutes);
		
		//System.out.println(hours+" hour(s) and "+minutes+" minute(s) is "+convertedMinutes+" minute(s).");
        
		/**
		 * the above code has been commented out 
		 * and a new set of code will be written to test the 
		 * convertToMinutes code below
		 * 
		
		 */
		Scanner kb = new Scanner(System.in); // this had to be reintroduced because i accidentally commented it out above
		
		System.out.println ("Testing Started");
		System.out.println (" "); // to create a line break
		
		System.out.println ("0:0, expecting 0, get "+convertToMinutes(0,0));
		System.out.println ("0:0, expecting 1, get "+convertToMinutes(0,1));
		System.out.println ("0:0, expecting 99, get "+convertToMinutes(0,99));
		System.out.println ("0:0, expecting 60, get "+convertToMinutes(1,0));
		System.out.println ("0:0, expecting 300, get "+convertToMinutes(5,0));
		System.out.println ("0:0, expecting 150, get "+convertToMinutes(2,30));
		System.out.println (" "); // to create a line break
		System.out.println ("Testing Completed");
		
		kb.close();
		

	}
	public static int convertToMinutes (int hr, int min) {
		// result variable and calculation
		int result = 60*hr+min;
		return result; // testing an invalid result // return min; // return result;
		
	}

} 
// it works. as simple as this is, I'm actually really excited about it.
// i need to work today, and this is the last day to turn in the assignment to calculating average grades
// i didn't realize that the course grade has weights for different assignment classes.
/*

public static int convertToMinutes(int hr, int min) {
//result variable and calculation
 
 int result = 60*hr + min;
 return result;
 
 
 public static void displayMessage () {
 
 System.out.println("Hello");
 }
 
 what does return type void mean
 static 
 
 private static double calcTrainingRate(int age, int restingRate) {
 // user the formula to calculate the target training heart rate
 return 0.6 *(220-age)+restingRate;
 }
 
 
 */

//2024-02-29 02:29:20.961 [info] Log level: Info
//2024-02-29 02:29:20.961 [info] Validating found git in: "C:\Program Files\Git\cmd\git.exe"
//2024-02-29 02:29:20.961 [info] Using git "2.42.0.windows.1" from "C:\Program Files\Git\cmd\git.exe"
//2024-02-29 02:29:20.992 [info] > git rev-parse --show-toplevel [35ms]
//2024-02-29 02:29:20.992 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:21.040 [info] > git rev-parse --show-toplevel [46ms]
//2024-02-29 02:29:21.040 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:21.075 [info] > git rev-parse --show-toplevel [30ms]
//2024-02-29 02:29:21.115 [info] > git rev-parse --git-dir --git-common-dir [33ms]
//2024-02-29 02:29:21.121 [info] Open repository: d:\GitHub\kennethlarotyamat.github.io
//2024-02-29 02:29:21.178 [info] > git rev-parse --show-toplevel [46ms]
//2024-02-29 02:29:21.182 [info] > git config --get commit.template [57ms]
//2024-02-29 02:29:21.184 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [49ms]
//2024-02-29 02:29:21.222 [info] > git rev-parse --git-dir --git-common-dir [41ms]
//2024-02-29 02:29:21.225 [info] Open repository: d:\GitHub\MIS76810032024Sprg
//2024-02-29 02:29:21.252 [info] > git status -z -uall [59ms]
//2024-02-29 02:29:21.289 [info] > git config --get commit.template [61ms]
//2024-02-29 02:29:21.292 [info] > git rev-parse --show-toplevel [60ms]
//2024-02-29 02:29:21.316 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [80ms]
//2024-02-29 02:29:21.333 [info] > git config --get commit.template [71ms]
//2024-02-29 02:29:21.335 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [67ms]
//2024-02-29 02:29:21.354 [info] > git rev-parse --git-dir --git-common-dir [52ms]
//2024-02-29 02:29:21.358 [info] Open repository: d:\GitHub\miscellaneous
//2024-02-29 02:29:21.427 [info] > git status -z -uall [107ms]
//2024-02-29 02:29:21.427 [info] > git status -z -uall [89ms]
//2024-02-29 02:29:21.428 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [60ms]
//2024-02-29 02:29:21.428 [info] > git rev-parse --show-toplevel [63ms]
//2024-02-29 02:29:21.428 [info] > git config --get commit.template [67ms]
//2024-02-29 02:29:21.478 [info] > git config --get commit.template [40ms]
//2024-02-29 02:29:21.481 [info] > git rev-parse --git-dir --git-common-dir [45ms]
//2024-02-29 02:29:21.483 [info] Open repository: d:\GitHub\project15
//2024-02-29 02:29:21.503 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [56ms]
//2024-02-29 02:29:21.526 [info] > git status -z -uall [77ms]
//2024-02-29 02:29:21.549 [info] > git rev-parse --show-toplevel [58ms]
//2024-02-29 02:29:21.552 [info] > git config --get commit.template [65ms]
//2024-02-29 02:29:21.552 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [54ms]
//2024-02-29 02:29:21.588 [info] > git status -z -uall [82ms]
//2024-02-29 02:29:21.592 [info] > git config --get commit.template [59ms]
//2024-02-29 02:29:21.596 [info] > git rev-parse --git-dir --git-common-dir [44ms]
//2024-02-29 02:29:21.600 [info] Open repository: d:\GitHub\project16
//2024-02-29 02:29:21.617 [info] > git status -z -uall [54ms]
//2024-02-29 02:29:21.634 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [79ms]
//2024-02-29 02:29:21.684 [info] > git rev-parse --show-toplevel [72ms]
//2024-02-29 02:29:21.684 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:21.687 [info] > git config --get commit.template [82ms]
//2024-02-29 02:29:21.694 [info] > git config --get commit.template [68ms]
//2024-02-29 02:29:21.696 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [80ms]
//2024-02-29 02:29:21.698 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [68ms]
//2024-02-29 02:29:21.708 [info] > git status -z -uall [68ms]
//2024-02-29 02:29:21.742 [info] > git status -z -uall [40ms]
//2024-02-29 02:29:21.744 [info] > git status -z -uall [37ms]
//2024-02-29 02:29:21.781 [info] > git config --get commit.template [34ms]
//2024-02-29 02:29:21.781 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
//2024-02-29 02:29:21.808 [info] > git check-ignore -v -z --stdin [30ms]
//2024-02-29 02:29:21.811 [info] > git check-ignore -v -z --stdin [31ms]
//2024-02-29 02:29:21.814 [info] > git status -z -uall [30ms]
//2024-02-29 02:29:21.975 [info] > git merge-base refs/heads/main refs/remotes/origin/main [47ms]
//2024-02-29 02:29:21.982 [info] > git merge-base refs/heads/main refs/remotes/origin/main [48ms]
//2024-02-29 02:29:21.989 [info] > git merge-base refs/heads/main refs/remotes/origin/main [50ms]
//2024-02-29 02:29:21.993 [info] > git merge-base refs/heads/main refs/remotes/origin/main [50ms]
//2024-02-29 02:29:21.996 [info] > git merge-base refs/heads/main refs/remotes/origin/main [60ms]
//2024-02-29 02:29:22.025 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [46ms]
//2024-02-29 02:29:22.025 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [41ms]
//2024-02-29 02:29:22.034 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [39ms]
//2024-02-29 02:29:22.035 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [43ms]
//2024-02-29 02:29:22.037 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [37ms]
//2024-02-29 02:29:22.078 [info] > git rev-parse --show-toplevel [25ms]
//2024-02-29 02:29:22.078 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:22.107 [info] > git rev-parse --show-toplevel [26ms]
//2024-02-29 02:29:22.107 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:22.136 [info] > git rev-parse --show-toplevel [26ms]
//2024-02-29 02:29:22.136 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:22.164 [info] > git rev-parse --show-toplevel [25ms]
//2024-02-29 02:29:22.164 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:22.191 [info] > git rev-parse --show-toplevel [25ms]
//2024-02-29 02:29:22.191 [info] fatal: not a git repository (or any of the parent directories): .git
//2024-02-29 02:29:22.756 [info] > git check-ignore -v -z --stdin [42ms]
//2024-02-29 02:29:25.480 [info] > git add -A -- . [388ms]
//2024-02-29 02:29:25.480 [info] warning: in the working copy of 'media/text/kennethlarotyamatdictionaryeclipse.txt', LF will be replaced by CRLF the next time Git touches it
//warning: in the working copy of 'src/MIS768/edu/unlv/mis768/kly/individualassignment3/.gitignore', LF will be replaced by CRLF the next time Git touches it
//warning: in the working copy of 'src/MIS768/edu/unlv/mis768/labwork11/.gitignore', LF will be replaced by CRLF the next time Git touches it
//warning: in the working copy of 'src/MIS768/edu/unlv/mis768/w4/.gitignore', LF will be replaced by CRLF the next time Git touches it
//2024-02-29 02:29:25.856 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [373ms]
//2024-02-29 02:29:25.881 [info] > git config --get commit.template [23ms]
//2024-02-29 02:29:25.910 [info] > git config --get commit.template [25ms]
//2024-02-29 02:29:25.914 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
//2024-02-29 02:29:25.945 [info] > git status -z -uall [29ms]
//2024-02-29 02:29:25.993 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
//2024-02-29 02:29:26.026 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [31ms]
//2024-02-29 02:29:27.876 [info] > git push origin main:main [1925ms]
//2024-02-29 02:29:27.876 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//   c155c13..1901b2a  main -> main
//2024-02-29 02:29:27.907 [info] > git config --get commit.template [28ms]
//2024-02-29 02:29:27.908 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
//2024-02-29 02:29:27.939 [info] > git status -z -uall [28ms]
//2024-02-29 02:29:27.977 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
//2024-02-29 02:29:27.984 [info] > git config --get commit.template [34ms]
//2024-02-29 02:29:27.988 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
//2024-02-29 02:29:28.010 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [31ms]
//2024-02-29 02:29:28.022 [info] > git status -z -uall [32ms]
//2024-02-29 02:30:35.351 [info] > git show --textconv :src/MIS768/edu/unlv/mis768/kly/RoulettePocketDemo.java [64ms]
//2024-02-29 02:30:35.352 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\ unlv\mis768\kly\RoulettePocketDemo.java [61ms]
//2024-02-29 02:30:35.362 [info] > git check-ignore -v -z --stdin [69ms]
//2024-02-29 02:30:35.391 [info] > git cat-file -s 9ba51b7d9776a291ffb61e3ae819c58848467d56 [36ms]
//2024-02-29 02:30:56.513 [info] > git config --get commit.template [30ms]
//2024-02-29 02:30:56.516 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
//2024-02-29 02:30:56.554 [info] > git status -z -uall [35ms]
//2024-02-29 02:31:01.592 [info] > git config --get commit.template [33ms]
//2024-02-29 02:31:01.596 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
//2024-02-29 02:31:01.636 [info] > git status -z -uall [37ms]
//2024-02-29 02:35:13.778 [info] > git config --get commit.template [32ms]
//2024-02-29 02:35:13.781 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
//2024-02-29 02:35:13.815 [info] > git status -z -uall [32ms]
//2024-02-29 02:35:57.454 [info] > git add -A -- . [414ms]
//2024-02-29 02:35:57.633 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [177ms]
//2024-02-29 02:35:57.659 [info] > git config --get commit.template [24ms]
//2024-02-29 02:35:57.689 [info] > git config --get commit.template [27ms]
//2024-02-29 02:35:57.693 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
//2024-02-29 02:35:57.723 [info] > git status -z -uall [28ms]
//2024-02-29 02:35:57.763 [info] > git merge-base refs/heads/main refs/remotes/origin/main [31ms]
//2024-02-29 02:35:57.792 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
//2024-02-29 02:35:59.302 [info] > git push origin main:main [1573ms]
//2024-02-29 02:35:59.302 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//   1901b2a..5587231  main -> main
//2024-02-29 02:35:59.332 [info] > git config --get commit.template [28ms]
//2024-02-29 02:35:59.333 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
//2024-02-29 02:35:59.363 [info] > git status -z -uall [28ms]
//2024-02-29 02:35:59.401 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
//2024-02-29 02:35:59.405 [info] > git config --get commit.template [31ms]
//2024-02-29 02:35:59.409 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
//2024-02-29 02:35:59.432 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
//2024-02-29 02:35:59.443 [info] > git status -z -uall [32ms]
//2024-02-29 02:39:54.386 [info] > git config --get commit.template [30ms]
//2024-02-29 02:39:54.389 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
//2024-02-29 02:39:54.419 [info] > git status -z -uall [29ms]
//2024-02-29 02:39:57.090 [info] > git add -A -- . [101ms]
//2024-02-29 02:39:57.241 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [148ms]
//2024-02-29 02:39:57.266 [info] > git config --get commit.template [22ms]
//2024-02-29 02:39:57.297 [info] > git config --get commit.template [29ms]
//2024-02-29 02:39:57.299 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
//2024-02-29 02:39:57.331 [info] > git status -z -uall [30ms]
//2024-02-29 02:39:57.369 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
//2024-02-29 02:39:57.400 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
//2024-02-29 02:41:13.544 [info] > git push origin main:main [76208ms]
//2024-02-29 02:41:13.544 [info] fatal: unable to access 'https://github.com/kennethlarotyamat/MIS76810032024Sprg.git/': Failure when receiving data from the peer
//2024-02-29 02:41:13.574 [info] > git config --get commit.template [27ms]
//2024-02-29 02:41:13.575 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
//2024-02-29 02:41:13.605 [info] > git status -z -uall [28ms]
//2024-02-29 02:41:13.670 [info] > git config --get commit.template [34ms]
//2024-02-29 02:41:13.675 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [36ms]
//2024-02-29 02:41:13.708 [info] > git status -z -uall [31ms]
//2024-02-29 02:42:01.648 [info] > git config --get commit.template [30ms]
//2024-02-29 02:42:01.652 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
//2024-02-29 02:42:01.687 [info] > git status -z -uall [31ms]