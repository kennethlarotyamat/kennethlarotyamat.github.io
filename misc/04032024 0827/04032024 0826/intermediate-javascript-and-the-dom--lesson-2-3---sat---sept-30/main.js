// Write your code here
import questions from './questions.json' assert { type: 'json' }
import users from './users.json' assert { type: 'json' }
/*


> git push origin main:main
error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date



*/
// Get all DOM elements
const usernameInput = document.getElementById('username')
const validationMsg = document.getElementById('validation-msg')
const startBtn = document.getElementById('start-btn')
const nextBtns = document.querySelectorAll('.next-question')
const playAgainBtn = document.getElementById('play-again')
const startSection = document.getElementById('start')
const currentUserDisplay = document.getElementById('user-display')
const questionGroups = document.querySelectorAll('.question')
const endSection = document.getElementById('game-end')
const finalScoreSpan = document.querySelector('span[id="score"]')
const answerButtons = document.querySelectorAll('.answer')
const modal = document.getElementById('modal');
const openModal = document.getElementById('show-details');
const closeModal = document.getElementById('modal-close');
const questionsInModal = document.querySelectorAll('.game-question')
const userStatsItems = document.querySelectorAll('.user-stat')

// Create array from all the answer buttons
const answers = [...answerButtons]


// Create array from buttons which trigger the displayed <section> element to change
const nextSectionTriggers = [startBtn, ...nextBtns]


// Create an array from all the <section> elements
const sections = [startSection, ...questionGroups, endSection]


// Create an array from all question <li> elements in detailed results modal
const resultsQuestions = [ ...questionsInModal ]


// Create an array from all stat <li> elements at the end of the game
const resultsStats = [ ...userStatsItems ]


// Create array from the questions.json object keys, which will help in selecting random questions
const questionsKeysArray = Object.keys(questions)


// Create array from the users.json object values
const usersValuesArray = Object.values(users)


// Create a new set which will store 10 random questions
const randomTen = new Set()


// Create a set to store fake users
const gameUsers = new Set()


// Create a variable to store current user's chosen username
let currentUser


// Create a variable to store the user's running score
let runningScore = 0


// Declare necessary variables for cycling through the <section> elements
const lastSectionIndex = sections.length - 1
let displayedSectionIndex = 0
let sectionOffset


// Declare necessary variables to display a question and store the selected answer
let nextQuestionNumber = displayedSectionIndex + 1
let currentQuestion
let selectedAnswer
let correctAnswer
let userSelection = false


// Create map to store detailed results
const currentUserDetailedResults = new Map()
currentUserDetailedResults.set("results", [])


// Create map to store all users stats
const usersStats = new Map()
usersStats.set("stats", [])

// Add fake users’ usernames to gameUsers Set and the full fake user objects to userStats Map
for (const user of usersValuesArray) {
  gameUsers.add(user.username)
  usersStats.entries().next().value[1].push(user)
}

// Add 10 random questions from JSON file to the randomTen array
while (randomTen.size < 10) {
  const randomIndex = Math.floor(Math.random() * questionsKeysArray.length)
  const randomObjectKey = questionsKeysArray[randomIndex]
  if (randomTen.has(questions[randomObjectKey])) {
    continue;
  } else {
    randomTen.add(questions[randomObjectKey])
  }
}


// Get access to the set's values
const randomQuestionSet = randomTen.values()



/**
 * 2024-02-21 03:03:09.680 [info] Log level: Info
2024-02-21 03:03:09.680 [info] Validating found git in: "C:\Program Files\Git\cmd\git.exe"
2024-02-21 03:03:10.091 [info] Using git "2.42.0.windows.1" from "C:\Program Files\Git\cmd\git.exe"
2024-02-21 03:03:10.227 [info] > git rev-parse --show-toplevel [123ms]
2024-02-21 03:03:10.227 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:10.333 [info] > git rev-parse --show-toplevel [102ms]
2024-02-21 03:03:10.333 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:10.641 [info] > git rev-parse --show-toplevel [304ms]
2024-02-21 03:03:10.754 [info] > git rev-parse --git-dir --git-common-dir [100ms]
2024-02-21 03:03:10.765 [info] Open repository: d:\GitHub\kennethlarotyamat.github.io
2024-02-21 03:03:10.946 [info] > git config --get commit.template [158ms]
2024-02-21 03:03:11.004 [info] > git rev-parse --show-toplevel [186ms]
2024-02-21 03:03:11.210 [info] > git rev-parse --git-dir --git-common-dir [201ms]
2024-02-21 03:03:11.221 [info] Open repository: d:\GitHub\MIS76810032024Sprg
2024-02-21 03:03:11.769 [info] > git config --get commit.template [538ms]
2024-02-21 03:03:11.772 [info] > git rev-parse --show-toplevel [531ms]
2024-02-21 03:03:11.895 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [1066ms]
2024-02-21 03:03:12.405 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [1117ms]
2024-02-21 03:03:12.536 [info] > git rev-parse --git-dir --git-common-dir [747ms]
2024-02-21 03:03:12.552 [info] Open repository: d:\GitHub\miscellaneous
2024-02-21 03:03:12.671 [info] > git config --get commit.template [111ms]
2024-02-21 03:03:12.786 [info] > git check-ignore -v -z --stdin [972ms]
2024-02-21 03:03:13.046 [info] > git rev-parse --show-toplevel [480ms]
2024-02-21 03:03:13.064 [info] > git check-ignore -v -z --stdin [1263ms]
2024-02-21 03:03:13.173 [info] > git rev-parse --git-dir --git-common-dir [119ms]
2024-02-21 03:03:13.175 [info] Open repository: d:\GitHub\project15
2024-02-21 03:03:13.295 [info] > git status -z -uall [1370ms]
2024-02-21 03:03:13.341 [info] > git config --get commit.template [159ms]
2024-02-21 03:03:13.353 [info] > git rev-parse --show-toplevel [161ms]
2024-02-21 03:03:13.433 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [114ms]
2024-02-21 03:03:13.433 [info] > git config --get commit.template [120ms]
2024-02-21 03:03:13.518 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [947ms]
2024-02-21 03:03:13.518 [info] > git merge-base refs/heads/main refs/remotes/origin/main [147ms]
2024-02-21 03:03:13.526 [info] > git rev-parse --git-dir --git-common-dir [166ms]
2024-02-21 03:03:13.534 [info] Open repository: d:\GitHub\project16
2024-02-21 03:03:13.611 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [412ms]
2024-02-21 03:03:13.678 [info] > git config --get commit.template [129ms]
2024-02-21 03:03:13.698 [info] > git rev-parse --show-toplevel [143ms]
2024-02-21 03:03:13.698 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:14.025 [info] > git status -z -uall [446ms]
2024-02-21 03:03:14.062 [info] > git rev-parse --show-toplevel [361ms]
2024-02-21 03:03:14.062 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:14.119 [info] > git rev-parse --show-toplevel [52ms]
2024-02-21 03:03:14.119 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:14.195 [info] > git status -z -uall [609ms]
2024-02-21 03:03:14.200 [info] > git rev-parse --show-toplevel [68ms]
2024-02-21 03:03:14.200 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:14.265 [info] > git status -z -uall [615ms]
2024-02-21 03:03:14.538 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [1012ms]
2024-02-21 03:03:14.557 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [948ms]
2024-02-21 03:03:14.588 [info] > git rev-parse --show-toplevel [369ms]
2024-02-21 03:03:14.588 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:14.588 [info] > git config --get commit.template [377ms]
2024-02-21 03:03:14.613 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [389ms]
2024-02-21 03:03:14.658 [info] > git merge-base refs/heads/main refs/remotes/origin/main [102ms]
2024-02-21 03:03:14.671 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [199ms]
2024-02-21 03:03:14.686 [info] > git config --get commit.template [221ms]
2024-02-21 03:03:14.743 [info] > git status -z -uall [122ms]
2024-02-21 03:03:14.849 [info] > git status -z -uall [160ms]
2024-02-21 03:03:14.893 [info] > git status -z -uall [306ms]
2024-02-21 03:03:14.963 [info] > git config --get commit.template [62ms]
2024-02-21 03:03:14.970 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [56ms]
2024-02-21 03:03:15.037 [info] > git status -z -uall [57ms]
2024-02-21 03:03:15.062 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [398ms]
2024-02-21 03:03:15.424 [info] > git merge-base refs/heads/main refs/remotes/origin/main [62ms]
2024-02-21 03:03:15.429 [info] > git merge-base refs/heads/main refs/remotes/origin/main [62ms]
2024-02-21 03:03:15.671 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [239ms]
2024-02-21 03:03:15.672 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [244ms]
2024-02-21 03:03:15.731 [info] > git check-ignore -v -z --stdin [73ms]
2024-02-21 03:03:15.809 [info] > git status -z -uall [3281ms]
2024-02-21 03:03:15.904 [info] > git config --get commit.template [82ms]
2024-02-21 03:03:15.914 [info] > git merge-base refs/heads/main refs/remotes/origin/main [87ms]
2024-02-21 03:03:15.928 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [82ms]
2024-02-21 03:03:16.027 [info] > git status -z -uall [93ms]
2024-02-21 03:03:16.113 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [187ms]
2024-02-21 03:03:16.622 [info] > git config --get commit.template [89ms]
2024-02-21 03:03:16.630 [info] > git config --get commit.template [100ms]
2024-02-21 03:03:16.643 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [105ms]
2024-02-21 03:03:16.643 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [93ms]
2024-02-21 03:03:16.750 [info] > git status -z -uall [97ms]
2024-02-21 03:03:16.787 [info] > git status -z -uall [138ms]
2024-02-21 03:03:16.812 [info] > git check-ignore -v -z --stdin [93ms]
2024-02-21 03:03:16.817 [info] > git check-ignore -v -z --stdin [107ms]
2024-02-21 03:03:29.419 [info] > git rev-parse --show-toplevel [79ms]
2024-02-21 03:03:29.419 [info] fatal: not a git repository (or any of the parent directories): .git
2024-02-21 03:03:29.962 [info] > git add -A -- . [6738ms]
2024-02-21 03:03:36.062 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [8043ms]
2024-02-21 03:03:36.132 [info] > git config --get commit.template [66ms]
2024-02-21 03:03:36.201 [info] > git config --get commit.template [56ms]
2024-02-21 03:03:36.212 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [65ms]
2024-02-21 03:03:36.281 [info] > git status -z -uall [67ms]
2024-02-21 03:03:36.400 [info] > git merge-base refs/heads/main refs/remotes/origin/main [83ms]
2024-02-21 03:03:36.481 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [77ms]
2024-02-21 03:03:37.427 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [7455ms]
2024-02-21 03:03:37.512 [info] > git config --get commit.template [69ms]
2024-02-21 03:03:37.596 [info] > git config --get commit.template [81ms]
2024-02-21 03:03:37.603 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [76ms]
2024-02-21 03:03:37.688 [info] > git status -z -uall [77ms]
2024-02-21 03:03:37.825 [info] > git merge-base refs/heads/main refs/remotes/origin/main [89ms]
2024-02-21 03:03:37.902 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [72ms]
2024-02-21 03:03:38.411 [info] > git add -A -- . [5976ms]
2024-02-21 03:03:39.022 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [605ms]
2024-02-21 03:03:39.096 [info] > git config --get commit.template [70ms]
2024-02-21 03:03:39.151 [info] > git config --get commit.template [49ms]
2024-02-21 03:03:39.158 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [51ms]
2024-02-21 03:03:39.212 [info] > git status -z -uall [50ms]
2024-02-21 03:03:39.365 [info] > git push origin main:main [3066ms]
2024-02-21 03:03:39.365 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
   447d59a..66adf12  main -> main
2024-02-21 03:03:39.372 [info] > git merge-base refs/heads/main refs/remotes/origin/main [110ms]
2024-02-21 03:03:39.525 [info] > git config --get commit.template [153ms]
2024-02-21 03:03:39.541 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [154ms]
2024-02-21 03:03:39.543 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [164ms]
2024-02-21 03:03:39.668 [info] > git status -z -uall [121ms]
2024-02-21 03:03:39.832 [info] > git merge-base refs/heads/main refs/remotes/origin/main [133ms]
2024-02-21 03:03:39.845 [info] > git config --get commit.template [123ms]
2024-02-21 03:03:39.860 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [134ms]
2024-02-21 03:03:39.945 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [108ms]
2024-02-21 03:03:39.980 [info] > git status -z -uall [114ms]
2024-02-21 03:04:15.758 [info] > git add -A -- . [680ms]
2024-02-21 03:04:15.758 [info] warning: in the working copy of 'src/MIS768/edu/unlv/mis768/kly/indiv/.gitignore', LF will be replaced by CRLF the next time Git touches it
2024-02-21 03:04:16.199 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [439ms]
2024-02-21 03:04:16.247 [info] > git config --get commit.template [44ms]
2024-02-21 03:04:16.324 [info] > git config --get commit.template [68ms]
2024-02-21 03:04:16.327 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [64ms]
2024-02-21 03:04:16.406 [info] > git status -z -uall [68ms]
2024-02-21 03:04:16.531 [info] > git merge-base refs/heads/main refs/remotes/origin/main [90ms]
2024-02-21 03:04:16.587 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [44ms]
2024-02-21 03:04:18.436 [info] > git push origin main:main [2016ms]
2024-02-21 03:04:18.436 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
   66adf12..59290ab  main -> main
2024-02-21 03:04:18.517 [info] > git config --get commit.template [79ms]
2024-02-21 03:04:18.521 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [80ms]
2024-02-21 03:04:18.606 [info] > git status -z -uall [79ms]
2024-02-21 03:04:18.707 [info] > git merge-base refs/heads/main refs/remotes/origin/main [91ms]
2024-02-21 03:04:18.742 [info] > git config --get commit.template [88ms]
2024-02-21 03:04:18.757 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [94ms]
2024-02-21 03:04:18.790 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [78ms]
2024-02-21 03:04:18.848 [info] > git status -z -uall [85ms]
2024-02-21 03:11:24.574 [info] > git config --get commit.template [55ms]
2024-02-21 03:11:24.576 [info] > git config --get commit.template [54ms]
2024-02-21 03:11:24.576 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [51ms]
2024-02-21 03:11:24.580 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [53ms]
2024-02-21 03:11:24.612 [info] > git status -z -uall [34ms]
2024-02-21 03:11:24.623 [info] > git status -z -uall [38ms]
2024-02-21 03:11:25.289 [info] > git check-ignore -v -z --stdin [27ms]
2024-02-21 03:11:25.290 [info] > git check-ignore -v -z --stdin [27ms]
2024-02-21 03:11:29.658 [info] > git config --get commit.template [31ms]
2024-02-21 03:11:29.661 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
2024-02-21 03:11:29.691 [info] > git status -z -uall [27ms]
2024-02-21 03:11:30.880 [info] > git add -A -- . [1649ms]
2024-02-21 03:11:31.178 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [295ms]
2024-02-21 03:11:31.204 [info] > git config --get commit.template [24ms]
2024-02-21 03:11:31.234 [info] > git config --get commit.template [28ms]
2024-02-21 03:11:31.236 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:11:31.271 [info] > git status -z -uall [33ms]
2024-02-21 03:11:31.319 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
2024-02-21 03:11:31.352 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
2024-02-21 03:11:36.797 [info] > git add -A -- . [4350ms]
2024-02-21 03:11:37.078 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [278ms]
2024-02-21 03:11:37.103 [info] > git config --get commit.template [23ms]
2024-02-21 03:11:37.132 [info] > git config --get commit.template [27ms]
2024-02-21 03:11:37.135 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:11:37.162 [info] > git status -z -uall [25ms]
2024-02-21 03:11:37.224 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 03:11:37.251 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [24ms]
2024-02-21 03:19:24.552 [info] > git push origin main:main [473274ms]
2024-02-21 03:19:24.552 [info] To https://github.com/kennethlarotyamat/miscellaneous.git
   67f7983..9058e43  main -> main
2024-02-21 03:19:24.581 [info] > git config --get commit.template [26ms]
2024-02-21 03:19:24.582 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 03:19:24.613 [info] > git status -z -uall [29ms]
2024-02-21 03:19:24.646 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
2024-02-21 03:19:24.653 [info] > git config --get commit.template [29ms]
2024-02-21 03:19:24.654 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:19:24.676 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 03:19:24.689 [info] > git status -z -uall [32ms]
2024-02-21 03:24:07.480 [info] > git push origin main:main [1228250ms]
2024-02-21 03:24:07.480 [info] remote: 
remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
remote: 
To https://github.com/kennethlarotyamat/project15.git
   d54394b..b82007f  main -> main
2024-02-21 03:24:07.510 [info] > git config --get commit.template [26ms]
2024-02-21 03:24:07.511 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:24:07.537 [info] > git status -z -uall [24ms]
2024-02-21 03:24:07.571 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
2024-02-21 03:24:07.578 [info] > git config --get commit.template [28ms]
2024-02-21 03:24:07.581 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 03:24:07.601 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 03:24:07.611 [info] > git status -z -uall [28ms]
2024-02-21 03:24:08.801 [info] > git push origin main:main [1231100ms]
2024-02-21 03:24:08.801 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 03:24:08.830 [info] > git config --get commit.template [27ms]
2024-02-21 03:24:08.832 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:24:08.861 [info] > git status -z -uall [27ms]
2024-02-21 03:24:09.029 [info] > git config --get commit.template [34ms]
2024-02-21 03:24:09.034 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
2024-02-21 03:24:09.064 [info] > git status -z -uall [26ms]
2024-02-21 03:24:09.556 [info] > git check-ignore -v -z --stdin [28ms]
2024-02-21 03:24:14.700 [info] > git config --get commit.template [42ms]
2024-02-21 03:24:14.706 [info] > git config --get commit.template [45ms]
2024-02-21 03:24:14.707 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
2024-02-21 03:24:14.711 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
2024-02-21 03:24:14.753 [info] > git status -z -uall [38ms]
2024-02-21 03:24:14.757 [info] > git status -z -uall [47ms]
2024-02-21 03:25:59.108 [info] > git config --get commit.template [30ms]
2024-02-21 03:25:59.111 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
2024-02-21 03:25:59.143 [info] > git status -z -uall [29ms]
2024-02-21 03:25:59.798 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 03:26:11.338 [info] > git add -A -- . [1459ms]
2024-02-21 03:26:11.544 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [204ms]
2024-02-21 03:26:11.569 [info] > git config --get commit.template [23ms]
2024-02-21 03:26:11.599 [info] > git config --get commit.template [28ms]
2024-02-21 03:26:11.601 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:26:11.631 [info] > git status -z -uall [27ms]
2024-02-21 03:26:11.674 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 03:26:11.706 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
2024-02-21 03:26:17.643 [info] > git check-ignore -v -z --stdin [43ms]
2024-02-21 03:26:17.645 [info] > git check-ignore -v -z --stdin [40ms]
2024-02-21 03:26:17.646 [info] > git check-ignore -v -z --stdin [43ms]
2024-02-21 03:26:17.651 [info] > git check-ignore -v -z --stdin [43ms]
2024-02-21 03:26:17.651 [info] > git check-ignore -v -z --stdin [40ms]
2024-02-21 03:26:22.715 [info] > git check-ignore -v -z --stdin [26ms]
2024-02-21 03:26:24.989 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 03:26:26.420 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 03:26:28.054 [info] > git ls-files --stage -- D:\GitHub\project16\index.html [33ms]
2024-02-21 03:26:28.157 [info] > git cat-file -s ac24ffcf963501b08dd6b8e882b5d29c31f4cb55 [99ms]
2024-02-21 03:26:28.158 [info] > git show --textconv :index.html [142ms]
2024-02-21 03:26:40.713 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 03:26:41.326 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [24ms]
2024-02-21 03:26:41.427 [info] > git show --textconv :index.html [128ms]
2024-02-21 03:26:41.428 [info] > git cat-file -s 8474ddb3fcc0bee0d368890089173821eb6619a1 [99ms]
2024-02-21 03:26:46.231 [info] > git config --get commit.template [26ms]
2024-02-21 03:26:46.232 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:26:46.257 [info] > git status -z -uall [23ms]
2024-02-21 03:26:47.197 [info] > git check-ignore -v -z --stdin [27ms]
2024-02-21 03:26:48.456 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [25ms]
2024-02-21 03:26:48.466 [info] > git show --textconv :index.html [37ms]
2024-02-21 03:26:48.484 [info] > git cat-file -s 2877edd64405c37bc4ddb15b746d189b5a86656f [26ms]
2024-02-21 03:26:52.350 [info] > git config --get commit.template [28ms]
2024-02-21 03:26:52.352 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:26:52.383 [info] > git status -z -uall [29ms]
2024-02-21 03:26:54.353 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [26ms]
2024-02-21 03:26:54.439 [info] > git cat-file -s 25d07aba976876b5e5037538bc433f0c2773c2ae [84ms]
2024-02-21 03:26:54.439 [info] > git show --textconv :index.html [116ms]
2024-02-21 03:27:00.846 [info] > git config --get commit.template [26ms]
2024-02-21 03:27:00.847 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [24ms]
2024-02-21 03:27:00.875 [info] > git status -z -uall [25ms]
2024-02-21 03:27:02.263 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 03:27:03.215 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\index.html [26ms]
2024-02-21 03:27:03.355 [info] > git cat-file -s f8e5fa4325c8503a4690f87a4d31238581376636 [137ms]
2024-02-21 03:27:03.356 [info] > git show --textconv :index.html [170ms]
2024-02-21 03:27:20.646 [info] > git add -A -- . [48ms]
2024-02-21 03:27:20.897 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [249ms]
2024-02-21 03:27:20.931 [info] > git config --get commit.template [31ms]
2024-02-21 03:27:20.964 [info] > git config --get commit.template [29ms]
2024-02-21 03:27:20.966 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 03:27:20.995 [info] > git status -z -uall [26ms]
2024-02-21 03:27:21.033 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 03:27:21.063 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 03:27:22.310 [info] > git push origin main:main [1311ms]
2024-02-21 03:27:22.310 [info] remote: 
remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
remote: 
To https://github.com/kennethlarotyamat/project15.git
   b82007f..bac9f01  main -> main
2024-02-21 03:27:22.342 [info] > git config --get commit.template [29ms]
2024-02-21 03:27:22.344 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 03:27:22.371 [info] > git status -z -uall [25ms]
2024-02-21 03:27:22.412 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
2024-02-21 03:27:22.415 [info] > git config --get commit.template [32ms]
2024-02-21 03:27:22.419 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:27:22.443 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 03:27:22.449 [info] > git status -z -uall [27ms]
2024-02-21 03:27:23.312 [info] > git add -A -- . [193ms]
2024-02-21 03:27:23.508 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [195ms]
2024-02-21 03:27:23.534 [info] > git config --get commit.template [23ms]
2024-02-21 03:27:23.566 [info] > git config --get commit.template [28ms]
2024-02-21 03:27:23.568 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:27:23.603 [info] > git status -z -uall [32ms]
2024-02-21 03:27:23.645 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
2024-02-21 03:27:23.677 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 03:27:25.074 [info] > git push origin main:main [1465ms]
2024-02-21 03:27:25.074 [info] To https://github.com/kennethlarotyamat/miscellaneous.git
   9058e43..217ea4d  main -> main
2024-02-21 03:27:25.112 [info] > git config --get commit.template [35ms]
2024-02-21 03:27:25.115 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:27:25.156 [info] > git status -z -uall [38ms]
2024-02-21 03:27:25.192 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
2024-02-21 03:27:25.195 [info] > git config --get commit.template [30ms]
2024-02-21 03:27:25.197 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 03:27:25.221 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 03:27:25.233 [info] > git status -z -uall [33ms]
2024-02-21 03:27:25.714 [info] > git add -A -- . [140ms]
2024-02-21 03:27:25.838 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [121ms]
2024-02-21 03:27:25.863 [info] > git config --get commit.template [22ms]
2024-02-21 03:27:25.894 [info] > git config --get commit.template [29ms]
2024-02-21 03:27:25.896 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:27:25.925 [info] > git status -z -uall [26ms]
2024-02-21 03:27:25.964 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
2024-02-21 03:27:25.998 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
2024-02-21 03:27:27.219 [info] > git push origin main:main [1290ms]
2024-02-21 03:27:27.219 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
   59290ab..e5cee0f  main -> main
2024-02-21 03:27:27.248 [info] > git config --get commit.template [26ms]
2024-02-21 03:27:27.250 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 03:27:27.279 [info] > git status -z -uall [26ms]
2024-02-21 03:27:27.316 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
2024-02-21 03:27:27.335 [info] > git config --get commit.template [36ms]
2024-02-21 03:27:27.339 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:27:27.351 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [32ms]
2024-02-21 03:27:27.370 [info] > git status -z -uall [29ms]
2024-02-21 03:27:30.930 [info] > git log --format=%H%n%aN%n%aE%n%at%n%ct%n%P%n%D%n%B -z --shortstat --diff-merges=first-parent --author-date-order 0f74f39d9422082c4ddb1f2137ed007921979c60..7e371f03b247c92726b32e43bd6367e7cec363ce [155ms]
2024-02-21 03:27:31.084 [info] > git diff --shortstat 0f74f39d9422082c4ddb1f2137ed007921979c60...7e371f03b247c92726b32e43bd6367e7cec363ce [146ms]
2024-02-21 03:28:15.969 [info] > git merge-base refs/heads/main refs/remotes/origin/main [26ms]
2024-02-21 03:28:15.998 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
2024-02-21 03:28:23.680 [info] > git merge-base refs/heads/main refs/remotes/origin/main [25ms]
2024-02-21 03:28:23.709 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
2024-02-21 03:28:28.423 [info] > git merge-base refs/heads/main refs/remotes/origin/main [24ms]
2024-02-21 03:28:28.450 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
2024-02-21 03:28:32.817 [info] > git merge-base refs/heads/main refs/remotes/origin/main [26ms]
2024-02-21 03:28:32.846 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
2024-02-21 03:28:39.781 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [25ms]
2024-02-21 03:28:39.784 [info] > git show --textconv :index.html [31ms]
2024-02-21 03:28:39.811 [info] > git cat-file -s 96a2799305f6644f2545d9825ac1b7f2094c59ff [27ms]
2024-02-21 03:28:45.201 [info] > git config --get commit.template [28ms]
2024-02-21 03:28:45.202 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:28:45.229 [info] > git status -z -uall [25ms]
2024-02-21 03:28:49.257 [info] > git add -A -- . [43ms]
2024-02-21 03:28:49.463 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [203ms]
2024-02-21 03:28:49.488 [info] > git config --get commit.template [23ms]
2024-02-21 03:28:49.534 [info] > git config --get commit.template [42ms]
2024-02-21 03:28:49.535 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
2024-02-21 03:28:49.569 [info] > git status -z -uall [32ms]
2024-02-21 03:28:49.613 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 03:28:49.643 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 03:28:50.739 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [23ms]
2024-02-21 03:28:50.765 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [23ms]
2024-02-21 03:28:50.791 [info] > git show --textconv :index.html [24ms]
2024-02-21 03:28:50.924 [info] > git push origin main:main [1349ms]
2024-02-21 03:28:50.924 [info] remote: 
remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
remote: 
To https://github.com/kennethlarotyamat/project15.git
   bac9f01..124694a  main -> main
2024-02-21 03:28:50.952 [info] > git config --get commit.template [26ms]
2024-02-21 03:28:50.954 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:28:50.981 [info] > git status -z -uall [24ms]
2024-02-21 03:28:51.020 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
2024-02-21 03:28:51.030 [info] > git config --get commit.template [34ms]
2024-02-21 03:28:51.035 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:28:51.051 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 03:28:51.063 [info] > git status -z -uall [25ms]
2024-02-21 03:28:51.096 [info] > git config --get commit.template [28ms]
2024-02-21 03:28:51.098 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:28:51.125 [info] > git status -z -uall [25ms]
2024-02-21 03:28:52.123 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [25ms]
2024-02-21 03:28:52.152 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [26ms]
2024-02-21 03:28:52.186 [info] > git show --textconv :index.html [26ms]
2024-02-21 03:29:04.210 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [27ms]
2024-02-21 03:29:04.214 [info] > git show --textconv :index.html [33ms]
2024-02-21 03:29:04.237 [info] > git cat-file -s 2ad28e44da3d7be4c1ac939bf275ccd1e0812a58 [23ms]
2024-02-21 03:29:09.286 [info] > git config --get commit.template [27ms]
2024-02-21 03:29:09.288 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:29:09.320 [info] > git status -z -uall [30ms]
2024-02-21 03:29:13.060 [info] > git add -A -- . [119ms]
2024-02-21 03:29:13.335 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [273ms]
2024-02-21 03:29:13.360 [info] > git config --get commit.template [22ms]
2024-02-21 03:29:13.388 [info] > git config --get commit.template [26ms]
2024-02-21 03:29:13.391 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:29:13.423 [info] > git status -z -uall [30ms]
2024-02-21 03:29:13.458 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
2024-02-21 03:29:13.489 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 03:29:14.605 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [26ms]
2024-02-21 03:29:14.633 [info] > git cat-file -s e4112f44a003729ccfc66902b89d0ba5d08b5ba7 [25ms]
2024-02-21 03:29:14.662 [info] > git show --textconv :index.html [24ms]
2024-02-21 03:29:14.701 [info] > git push origin main:main [1274ms]
2024-02-21 03:29:14.701 [info] To https://github.com/kennethlarotyamat/miscellaneous.git
   217ea4d..ed4276f  main -> main
2024-02-21 03:29:14.731 [info] > git config --get commit.template [27ms]
2024-02-21 03:29:14.733 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:29:14.768 [info] > git status -z -uall [32ms]
2024-02-21 03:29:14.807 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
2024-02-21 03:29:14.811 [info] > git config --get commit.template [32ms]
2024-02-21 03:29:14.817 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:29:14.838 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 03:29:14.853 [info] > git status -z -uall [32ms]
2024-02-21 03:29:15.896 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [23ms]
2024-02-21 03:29:15.920 [info] > git cat-file -s e4112f44a003729ccfc66902b89d0ba5d08b5ba7 [23ms]
2024-02-21 03:29:15.947 [info] > git show --textconv :index.html [23ms]
2024-02-21 03:29:33.481 [info] > git show --textconv :index.html [27ms]
2024-02-21 03:29:33.482 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\index.html [25ms]
2024-02-21 03:29:33.510 [info] > git cat-file -s f8e5fa4325c8503a4690f87a4d31238581376636 [25ms]
2024-02-21 03:29:53.298 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [27ms]
2024-02-21 03:29:53.302 [info] > git show --textconv :index.html [32ms]
2024-02-21 03:29:53.326 [info] > git cat-file -s 5887efce1b64f0f3d67f4ed9efdd23cac962420e [25ms]
2024-02-21 03:29:57.699 [info] > git config --get commit.template [28ms]
2024-02-21 03:29:57.701 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:29:57.728 [info] > git status -z -uall [26ms]
2024-02-21 03:30:02.598 [info] > git add -A -- . [46ms]
2024-02-21 03:30:02.871 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [272ms]
2024-02-21 03:30:02.895 [info] > git config --get commit.template [22ms]
2024-02-21 03:30:02.926 [info] > git config --get commit.template [28ms]
2024-02-21 03:30:02.928 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:30:02.955 [info] > git status -z -uall [26ms]
2024-02-21 03:30:02.991 [info] > git merge-base refs/heads/main refs/remotes/origin/main [28ms]
2024-02-21 03:30:03.019 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
2024-02-21 03:30:04.133 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [23ms]
2024-02-21 03:30:04.160 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [24ms]
2024-02-21 03:30:04.185 [info] > git show --textconv :index.html [23ms]
2024-02-21 03:30:04.363 [info] > git push origin main:main [1403ms]
2024-02-21 03:30:04.363 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
   e5cee0f..723ef3d  main -> main
2024-02-21 03:30:04.392 [info] > git config --get commit.template [27ms]
2024-02-21 03:30:04.393 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:30:04.423 [info] > git status -z -uall [27ms]
2024-02-21 03:30:04.463 [info] > git merge-base refs/heads/main refs/remotes/origin/main [36ms]
2024-02-21 03:30:04.473 [info] > git config --get commit.template [39ms]
2024-02-21 03:30:04.474 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:30:04.494 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 03:30:04.505 [info] > git status -z -uall [29ms]
2024-02-21 03:30:05.476 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [28ms]
2024-02-21 03:30:05.504 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [26ms]
2024-02-21 03:30:05.532 [info] > git show --textconv :index.html [25ms]
2024-02-21 03:33:35.814 [info] > git config --get commit.template [35ms]
2024-02-21 03:33:35.817 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [34ms]
2024-02-21 03:33:35.852 [info] > git status -z -uall [32ms]
2024-02-21 03:33:40.665 [info] > git add -A -- . [185ms]
2024-02-21 03:33:40.842 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [175ms]
2024-02-21 03:33:40.868 [info] > git config --get commit.template [24ms]
2024-02-21 03:33:40.897 [info] > git config --get commit.template [26ms]
2024-02-21 03:33:40.900 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:33:40.930 [info] > git status -z -uall [27ms]
2024-02-21 03:33:40.974 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 03:33:41.005 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 03:33:42.102 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [25ms]
2024-02-21 03:33:42.127 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [24ms]
2024-02-21 03:33:42.154 [info] > git show --textconv :index.html [24ms]
2024-02-21 03:33:42.177 [info] > git push origin main:main [1241ms]
2024-02-21 03:33:42.177 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
   723ef3d..9b65e1b  main -> main
2024-02-21 03:33:42.206 [info] > git config --get commit.template [26ms]
2024-02-21 03:33:42.207 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:33:42.236 [info] > git status -z -uall [26ms]
2024-02-21 03:33:42.274 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
2024-02-21 03:33:42.283 [info] > git config --get commit.template [34ms]
2024-02-21 03:33:42.286 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [34ms]
2024-02-21 03:33:42.306 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 03:33:42.318 [info] > git status -z -uall [29ms]
2024-02-21 03:33:43.374 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [23ms]
2024-02-21 03:33:43.399 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [23ms]
2024-02-21 03:33:43.425 [info] > git show --textconv :index.html [23ms]
2024-02-21 03:33:52.082 [info] > git push origin main:main [1334915ms]
2024-02-21 03:33:52.082 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 03:33:52.113 [info] > git config --get commit.template [29ms]
2024-02-21 03:33:52.115 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 03:33:52.142 [info] > git status -z -uall [24ms]
2024-02-21 03:33:52.251 [info] > git config --get commit.template [39ms]
2024-02-21 03:33:52.256 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [40ms]
2024-02-21 03:33:52.288 [info] > git status -z -uall [28ms]
2024-02-21 03:33:52.805 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 03:35:33.825 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [25ms]
2024-02-21 03:35:33.827 [info] > git show --textconv :index.html [30ms]
2024-02-21 03:35:33.855 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [28ms]
2024-02-21 03:35:36.784 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 03:35:40.974 [info] > git ls-files --stage -- D:\GitHub\project15\my-react-app\package.json [27ms]
2024-02-21 03:35:41.011 [info] > git cat-file -s 08b21028b4f078db0bbe6f83d799ab9c2013eb4d [34ms]
2024-02-21 03:35:41.011 [info] > git show --textconv :my-react-app/package.json [66ms]
2024-02-21 03:35:47.712 [info] > git config --get commit.template [26ms]
2024-02-21 03:35:47.713 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 03:35:47.740 [info] > git status -z -uall [23ms]
2024-02-21 03:36:00.524 [info] > git config --get commit.template [26ms]
2024-02-21 03:36:00.526 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:36:00.553 [info] > git status -z -uall [25ms]
2024-02-21 03:36:01.421 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 03:36:03.195 [info] > git show --textconv :my-react-app/vite/.eslintrc.cjs [162ms]
2024-02-21 03:36:03.196 [info] > git ls-files --stage -- D:\GitHub\project15\my-react-app\vite\.eslintrc.cjs [160ms]
2024-02-21 03:36:03.244 [info] > git cat-file -s 4dcb43901a687f5fa7e3867d9964a76861973151 [44ms]
2024-02-21 03:36:06.839 [info] > git config --get commit.template [29ms]
2024-02-21 03:36:06.840 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 03:36:06.874 [info] > git status -z -uall [31ms]
2024-02-21 03:36:12.559 [info] > git config --get commit.template [26ms]
2024-02-21 03:36:12.562 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:36:12.589 [info] > git status -z -uall [25ms]
2024-02-21 03:36:17.628 [info] > git config --get commit.template [28ms]
2024-02-21 03:36:17.629 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:36:17.655 [info] > git status -z -uall [24ms]
2024-02-21 03:36:26.622 [info] > git show --textconv :index.html [26ms]
2024-02-21 03:36:26.624 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [26ms]
2024-02-21 03:36:26.649 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [23ms]
2024-02-21 03:36:38.088 [info] > git check-ignore -v -z --stdin [26ms]
2024-02-21 03:36:39.929 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 03:36:41.359 [info] > git show --textconv :misc/reactbuttons.js [34ms]
2024-02-21 03:36:41.360 [info] > git ls-files --stage -- D:\GitHub\project15\misc\reactbuttons.js [32ms]
2024-02-21 03:36:41.392 [info] > git cat-file -s d94050956cd29a385efb56dc0fe7e96d6a36e008 [30ms]
2024-02-21 03:36:59.027 [info] > git add -A -- . [1717ms]
2024-02-21 03:36:59.126 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [95ms]
2024-02-21 03:36:59.151 [info] > git config --get commit.template [24ms]
2024-02-21 03:36:59.181 [info] > git config --get commit.template [27ms]
2024-02-21 03:36:59.183 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:36:59.209 [info] > git status -z -uall [24ms]
2024-02-21 03:36:59.253 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 03:36:59.282 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 03:38:54.333 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 03:39:00.729 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 03:39:03.044 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 03:39:07.480 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\1EmpoyeeandEmployeeDemo.java [42ms]
2024-02-21 03:39:07.485 [info] > git show --textconv :src/1EmpoyeeandEmployeeDemo.java [51ms]
2024-02-21 03:39:07.550 [info] > git cat-file -s e69de29bb2d1d6434b8b29ae775ad8c2e48c5391 [66ms]
2024-02-21 03:39:09.634 [info] > git show --textconv :src/2EmpoyeeandEmployeeDemo.java [27ms]
2024-02-21 03:39:09.635 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\2EmpoyeeandEmployeeDemo.java [24ms]
2024-02-21 03:39:09.660 [info] > git cat-file -s e69de29bb2d1d6434b8b29ae775ad8c2e48c5391 [23ms]
2024-02-21 03:39:29.187 [info] > git config --get commit.template [35ms]
2024-02-21 03:39:29.190 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 03:39:29.227 [info] > git status -z -uall [33ms]
2024-02-21 03:39:49.965 [info] > git config --get commit.template [26ms]
2024-02-21 03:39:49.966 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 03:39:49.993 [info] > git status -z -uall [25ms]
2024-02-21 03:40:05.811 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
2024-02-21 03:40:05.812 [info] > git config --get commit.template [37ms]
2024-02-21 03:40:05.849 [info] > git status -z -uall [35ms]
2024-02-21 03:40:13.333 [info] > git config --get commit.template [30ms]
2024-02-21 03:40:13.334 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 03:40:13.362 [info] > git status -z -uall [26ms]
2024-02-21 03:40:24.811 [info] > git config --get commit.template [27ms]
2024-02-21 03:40:24.811 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 03:40:24.839 [info] > git status -z -uall [25ms]
2024-02-21 03:40:29.882 [info] > git config --get commit.template [25ms]
2024-02-21 03:40:29.884 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [24ms]
2024-02-21 03:40:29.912 [info] > git status -z -uall [26ms]
2024-02-21 03:40:59.290 [info] > git config --get commit.template [26ms]
2024-02-21 03:40:59.292 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:40:59.321 [info] > git status -z -uall [27ms]
2024-02-21 03:41:02.156 [info] > git add -A -- . [247ms]
2024-02-21 03:41:02.261 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [103ms]
2024-02-21 03:41:02.286 [info] > git config --get commit.template [23ms]
2024-02-21 03:41:02.315 [info] > git config --get commit.template [26ms]
2024-02-21 03:41:02.318 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 03:41:02.346 [info] > git status -z -uall [27ms]
2024-02-21 03:41:02.413 [info] > git merge-base refs/heads/main refs/remotes/origin/main [39ms]
2024-02-21 03:41:02.444 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 03:41:03.531 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\2EmpoyeeandEmployeeDemo.java [24ms]
2024-02-21 03:41:03.558 [info] > git cat-file -s b225a8bfb2d7d020cd32f23038be6449b9584057 [25ms]
2024-02-21 03:41:03.586 [info] > git show --textconv :src/2EmpoyeeandEmployeeDemo.java [25ms]
2024-02-21 03:41:05.381 [info] > git push origin main:main [3030ms]
2024-02-21 03:41:05.381 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
   9b65e1b..855d499  main -> main
2024-02-21 03:41:05.412 [info] > git config --get commit.template [27ms]
2024-02-21 03:41:05.414 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 03:41:05.445 [info] > git status -z -uall [28ms]
2024-02-21 03:41:05.485 [info] > git merge-base refs/heads/main refs/remotes/origin/main [36ms]
2024-02-21 03:41:05.504 [info] > git config --get commit.template [37ms]
2024-02-21 03:41:05.507 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
2024-02-21 03:41:05.522 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [33ms]
2024-02-21 03:41:05.540 [info] > git status -z -uall [31ms]
2024-02-21 03:41:06.489 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\2EmpoyeeandEmployeeDemo.java [28ms]
2024-02-21 03:41:06.517 [info] > git cat-file -s b225a8bfb2d7d020cd32f23038be6449b9584057 [26ms]
2024-02-21 03:41:06.553 [info] > git show --textconv :src/2EmpoyeeandEmployeeDemo.java [32ms]
2024-02-21 03:41:55.821 [info] > git push origin main:main [944187ms]
2024-02-21 03:41:55.821 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 03:41:55.853 [info] > git config --get commit.template [29ms]
2024-02-21 03:41:55.854 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 03:41:55.883 [info] > git status -z -uall [27ms]
2024-02-21 03:41:55.977 [info] > git config --get commit.template [44ms]
2024-02-21 03:41:55.980 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
2024-02-21 03:41:56.016 [info] > git status -z -uall [32ms]
2024-02-21 04:11:30.469 [info] > git push origin main:main [2071254ms]
2024-02-21 04:11:30.469 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:11:30.502 [info] > git config --get commit.template [31ms]
2024-02-21 04:11:30.503 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:11:30.531 [info] > git status -z -uall [27ms]
2024-02-21 04:11:30.598 [info] > git config --get commit.template [29ms]
2024-02-21 04:11:30.601 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:11:30.630 [info] > git status -z -uall [27ms]
2024-02-21 04:15:33.403 [info] > git add -A -- . [2535ms]
2024-02-21 04:15:33.574 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [169ms]
2024-02-21 04:15:33.599 [info] > git config --get commit.template [23ms]
2024-02-21 04:15:33.628 [info] > git config --get commit.template [26ms]
2024-02-21 04:15:33.631 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:15:33.660 [info] > git status -z -uall [27ms]
2024-02-21 04:15:33.703 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 04:15:33.734 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 04:15:45.423 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:15:45.909 [info] > git ls-files --stage -- D:\GitHub\project16\javascript\project16.js [26ms]
2024-02-21 04:15:46.011 [info] > git cat-file -s e69de29bb2d1d6434b8b29ae775ad8c2e48c5391 [100ms]
2024-02-21 04:15:46.011 [info] > git show --textconv :javascript/project16.js [131ms]
2024-02-21 04:15:51.147 [info] > git config --get commit.template [24ms]
2024-02-21 04:15:51.151 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:15:51.176 [info] > git status -z -uall [23ms]
2024-02-21 04:15:56.218 [info] > git config --get commit.template [26ms]
2024-02-21 04:15:56.220 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:15:56.247 [info] > git status -z -uall [24ms]
2024-02-21 04:16:01.308 [info] > git config --get commit.template [52ms]
2024-02-21 04:16:01.312 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [54ms]
2024-02-21 04:16:01.342 [info] > git status -z -uall [27ms]
2024-02-21 04:16:06.383 [info] > git config --get commit.template [25ms]
2024-02-21 04:16:06.386 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:16:06.412 [info] > git status -z -uall [24ms]
2024-02-21 04:16:14.322 [info] > git add -A -- . [44ms]
2024-02-21 04:16:14.579 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [255ms]
2024-02-21 04:16:14.605 [info] > git config --get commit.template [23ms]
2024-02-21 04:16:14.634 [info] > git config --get commit.template [26ms]
2024-02-21 04:16:14.639 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:16:14.666 [info] > git status -z -uall [25ms]
2024-02-21 04:16:14.703 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
2024-02-21 04:16:14.734 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 04:16:32.063 [info] > git push origin main:main [17392ms]
2024-02-21 04:16:32.063 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:16:32.093 [info] > git config --get commit.template [27ms]
2024-02-21 04:16:32.095 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:16:32.122 [info] > git status -z -uall [24ms]
2024-02-21 04:16:32.166 [info] > git config --get commit.template [37ms]
2024-02-21 04:16:32.170 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
2024-02-21 04:16:32.197 [info] > git status -z -uall [25ms]
2024-02-21 04:17:36.334 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 04:17:36.362 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
2024-02-21 04:17:41.589 [info] > git merge-base refs/heads/main refs/remotes/origin/main [359ms]
2024-02-21 04:17:41.616 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
2024-02-21 04:17:59.768 [info] > git ls-files --stage -- D:\GitHub\project16\javascript\project16.js [26ms]
2024-02-21 04:17:59.771 [info] > git show --textconv :javascript/project16.js [31ms]
2024-02-21 04:17:59.795 [info] > git cat-file -s bb6218ac752e1d1d6c7389558b52f829bcc1c0f4 [24ms]
2024-02-21 04:18:04.804 [info] > git config --get commit.template [25ms]
2024-02-21 04:18:04.807 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:18:04.833 [info] > git status -z -uall [24ms]
2024-02-21 04:18:09.881 [info] > git config --get commit.template [33ms]
2024-02-21 04:18:09.887 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [36ms]
2024-02-21 04:18:09.922 [info] > git status -z -uall [32ms]
2024-02-21 04:18:14.960 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:18:14.960 [info] > git config --get commit.template [29ms]
2024-02-21 04:18:14.991 [info] > git status -z -uall [29ms]
2024-02-21 04:18:21.026 [info] > git add -A -- . [44ms]
2024-02-21 04:18:21.249 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [220ms]
2024-02-21 04:18:21.274 [info] > git config --get commit.template [24ms]
2024-02-21 04:18:21.304 [info] > git config --get commit.template [27ms]
2024-02-21 04:18:21.306 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:18:21.334 [info] > git status -z -uall [24ms]
2024-02-21 04:18:21.373 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
2024-02-21 04:18:21.405 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 04:18:28.286 [info] > git add -A -- . [63ms]
2024-02-21 04:18:28.286 [info] warning: in the working copy of 'my-react-app/package.json', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'my-react-app/vite/.eslintrc.cjs', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:18:28.410 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [121ms]
2024-02-21 04:18:28.435 [info] > git config --get commit.template [23ms]
2024-02-21 04:18:28.464 [info] > git config --get commit.template [26ms]
2024-02-21 04:18:28.468 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:18:28.495 [info] > git status -z -uall [25ms]
2024-02-21 04:18:28.539 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
2024-02-21 04:18:28.569 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 04:18:32.071 [info] > git push origin main:main [3569ms]
2024-02-21 04:18:32.071 [info] remote: 
remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
remote: 
To https://github.com/kennethlarotyamat/project15.git
   124694a..4485fa3  main -> main
2024-02-21 04:18:32.102 [info] > git config --get commit.template [29ms]
2024-02-21 04:18:32.103 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:18:32.133 [info] > git status -z -uall [27ms]
2024-02-21 04:18:32.175 [info] > git merge-base refs/heads/main refs/remotes/origin/main [38ms]
2024-02-21 04:18:32.183 [info] > git config --get commit.template [40ms]
2024-02-21 04:18:32.185 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [38ms]
2024-02-21 04:18:32.208 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [31ms]
2024-02-21 04:18:32.216 [info] > git status -z -uall [28ms]
2024-02-21 04:18:48.525 [info] > git push origin main:main [194859ms]
2024-02-21 04:18:48.525 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:18:48.556 [info] > git config --get commit.template [29ms]
2024-02-21 04:18:48.558 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:18:48.589 [info] > git status -z -uall [28ms]
2024-02-21 04:18:48.664 [info] > git config --get commit.template [38ms]
2024-02-21 04:18:48.668 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [39ms]
2024-02-21 04:18:48.699 [info] > git status -z -uall [29ms]
2024-02-21 04:18:59.481 [info] > git push origin main:main [38142ms]
2024-02-21 04:18:59.481 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:18:59.513 [info] > git config --get commit.template [30ms]
2024-02-21 04:18:59.514 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:18:59.543 [info] > git status -z -uall [27ms]
2024-02-21 04:18:59.600 [info] > git config --get commit.template [42ms]
2024-02-21 04:18:59.602 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
2024-02-21 04:18:59.633 [info] > git status -z -uall [28ms]
2024-02-21 04:19:04.788 [info] > git ls-files --stage -- D:\GitHub\project16\javascript\project16.js [29ms]
2024-02-21 04:19:04.791 [info] > git show --textconv :javascript/project16.js [34ms]
2024-02-21 04:19:04.817 [info] > git cat-file -s 3272495dc406a3b28c7a809bab81332e5bb53f16 [26ms]
2024-02-21 04:19:11.471 [info] > git config --get commit.template [24ms]
2024-02-21 04:19:11.473 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [24ms]
2024-02-21 04:19:11.499 [info] > git status -z -uall [24ms]
2024-02-21 04:19:19.626 [info] > git add -A -- . [54ms]
2024-02-21 04:19:19.848 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [220ms]
2024-02-21 04:19:19.873 [info] > git config --get commit.template [23ms]
2024-02-21 04:19:19.903 [info] > git config --get commit.template [27ms]
2024-02-21 04:19:19.907 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:19:19.935 [info] > git status -z -uall [25ms]
2024-02-21 04:19:19.974 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 04:19:20.004 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 04:19:26.051 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:19:26.869 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [47ms]
2024-02-21 04:19:26.978 [info] > git cat-file -s 14e48f52ea409dc2cfb108357dcd59adcd1e1d24 [104ms]
2024-02-21 04:19:26.979 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [162ms]
2024-02-21 04:19:27.010 [info] > git check-ignore -v -z --stdin [32ms]
2024-02-21 04:19:42.775 [info] > git config --get commit.template [26ms]
2024-02-21 04:19:42.777 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:19:42.808 [info] > git status -z -uall [29ms]
2024-02-21 04:19:47.853 [info] > git config --get commit.template [27ms]
2024-02-21 04:19:47.855 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:19:47.885 [info] > git status -z -uall [27ms]
2024-02-21 04:19:52.917 [info] > git config --get commit.template [26ms]
2024-02-21 04:19:52.918 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:19:52.947 [info] > git status -z -uall [26ms]
2024-02-21 04:19:57.983 [info] > git config --get commit.template [27ms]
2024-02-21 04:19:57.985 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:19:58.013 [info] > git status -z -uall [27ms]
2024-02-21 04:20:03.066 [info] > git config --get commit.template [41ms]
2024-02-21 04:20:03.069 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
2024-02-21 04:20:03.103 [info] > git status -z -uall [30ms]
2024-02-21 04:20:08.136 [info] > git config --get commit.template [26ms]
2024-02-21 04:20:08.139 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:20:08.167 [info] > git status -z -uall [27ms]
2024-02-21 04:20:13.670 [info] > git config --get commit.template [29ms]
2024-02-21 04:20:13.673 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:20:13.702 [info] > git status -z -uall [27ms]
2024-02-21 04:20:15.151 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscriptDemo.java [31ms]
2024-02-21 04:20:15.274 [info] > git cat-file -s 31583d8399f209213d2b38b65e13d1078148dc5a [121ms]
2024-02-21 04:20:15.275 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscriptDemo.java [159ms]
2024-02-21 04:20:20.726 [info] > git config --get commit.template [25ms]
2024-02-21 04:20:20.729 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:20:20.758 [info] > git status -z -uall [26ms]
2024-02-21 04:20:27.085 [info] > git config --get commit.template [29ms]
2024-02-21 04:20:27.088 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:20:27.120 [info] > git status -z -uall [29ms]
2024-02-21 04:20:28.474 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [28ms]
2024-02-21 04:20:28.475 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [27ms]
2024-02-21 04:20:28.499 [info] > git cat-file -s 14e48f52ea409dc2cfb108357dcd59adcd1e1d24 [22ms]
2024-02-21 04:20:35.558 [info] > git add -A -- . [178ms]
2024-02-21 04:20:35.708 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [148ms]
2024-02-21 04:20:35.736 [info] > git config --get commit.template [25ms]
2024-02-21 04:20:35.765 [info] > git config --get commit.template [28ms]
2024-02-21 04:20:35.770 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:20:35.801 [info] > git status -z -uall [29ms]
2024-02-21 04:20:35.866 [info] > git merge-base refs/heads/main refs/remotes/origin/main [59ms]
2024-02-21 04:20:35.900 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [31ms]
2024-02-21 04:20:37.005 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [29ms]
2024-02-21 04:20:37.035 [info] > git cat-file -s 2a5566a9b816e69ca702bcbc62b4402e96fc0404 [28ms]
2024-02-21 04:20:37.067 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [28ms]
2024-02-21 04:22:01.077 [info] > git push origin main:main [85272ms]
2024-02-21 04:22:01.077 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:22:01.111 [info] > git config --get commit.template [32ms]
2024-02-21 04:22:01.113 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
2024-02-21 04:22:01.147 [info] > git status -z -uall [32ms]
2024-02-21 04:22:01.229 [info] > git config --get commit.template [39ms]
2024-02-21 04:22:01.231 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [38ms]
2024-02-21 04:22:01.265 [info] > git status -z -uall [32ms]
2024-02-21 04:22:17.691 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:22:20.248 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:22:22.962 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:22:25.412 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:22:28.266 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:22:31.524 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:22:36.250 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-3-4---sat---sept-30\style.scss [42ms]
2024-02-21 04:22:36.324 [info] > git cat-file -s 9afe0a43c321aa35521e160d0553330bd3b9b16b [69ms]
2024-02-21 04:22:36.325 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-3-4---sat---sept-30/style.scss [120ms]
2024-02-21 04:22:41.600 [info] > git config --get commit.template [27ms]
2024-02-21 04:22:41.602 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:22:41.630 [info] > git status -z -uall [26ms]
2024-02-21 04:22:46.674 [info] > git config --get commit.template [25ms]
2024-02-21 04:22:46.675 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:22:46.705 [info] > git status -z -uall [26ms]
2024-02-21 04:22:51.743 [info] > git config --get commit.template [28ms]
2024-02-21 04:22:51.745 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:22:51.775 [info] > git status -z -uall [28ms]
2024-02-21 04:22:56.807 [info] > git config --get commit.template [24ms]
2024-02-21 04:22:56.810 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:22:56.839 [info] > git status -z -uall [27ms]
2024-02-21 04:23:01.883 [info] > git config --get commit.template [31ms]
2024-02-21 04:23:01.884 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:23:01.913 [info] > git status -z -uall [27ms]
2024-02-21 04:23:05.607 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:23:07.498 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:23:08.545 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:23:09.575 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:23:10.592 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\javascript\1011052023333calculatorscript.js [43ms]
2024-02-21 04:23:10.713 [info] > git cat-file -s a5d772a454b09fd4765771a09c51495b4088d78a [117ms]
2024-02-21 04:23:10.714 [info] > git show --textconv :javascript/1011052023333calculatorscript.js [168ms]
2024-02-21 04:23:21.902 [info] > git config --get commit.template [29ms]
2024-02-21 04:23:21.904 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:23:21.935 [info] > git status -z -uall [29ms]
2024-02-21 04:23:23.748 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:23:26.351 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:23:27.088 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:23:28.836 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\CSS\_qQcW3.MsLR7ecB.css [26ms]
2024-02-21 04:23:28.943 [info] > git cat-file -s ca3a7e78bcc6f7172e5630f7b627905d5748b3ae [103ms]
2024-02-21 04:23:28.943 [info] > git show --textconv :CSS/_qQcW3.MsLR7ecB.css [136ms]
2024-02-21 04:23:33.440 [info] > git config --get commit.template [28ms]
2024-02-21 04:23:33.442 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:23:33.471 [info] > git status -z -uall [27ms]
2024-02-21 04:23:35.371 [info] > git check-ignore -v -z --stdin [38ms]
2024-02-21 04:23:39.000 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\TestScoreDemo.java [29ms]
2024-02-21 04:23:39.016 [info] > git show --textconv :src/edu/unlv/mis768/kly/TestScoreDemo.java [48ms]
2024-02-21 04:23:39.031 [info] > git cat-file -s 415496ed5bf8dc9e47dee422cf9d352accdf2d0f [27ms]
2024-02-21 04:23:44.303 [info] > git config --get commit.template [26ms]
2024-02-21 04:23:44.305 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:23:44.334 [info] > git status -z -uall [27ms]
2024-02-21 04:23:46.837 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\TestScore.java [26ms]
2024-02-21 04:23:46.948 [info] > git cat-file -s ed5817dc9e274bf43f6b3e7aecb336d375e8b110 [108ms]
2024-02-21 04:23:46.949 [info] > git show --textconv :src/edu/unlv/mis768/kly/TestScore.java [140ms]
2024-02-21 04:23:49.365 [info] > git config --get commit.template [27ms]
2024-02-21 04:23:49.368 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:23:49.404 [info] > git status -z -uall [33ms]
2024-02-21 04:23:54.440 [info] > git config --get commit.template [27ms]
2024-02-21 04:23:54.442 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:23:54.473 [info] > git status -z -uall [28ms]
2024-02-21 04:24:04.412 [info] > git config --get commit.template [27ms]
2024-02-21 04:24:04.415 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:24:04.445 [info] > git status -z -uall [28ms]
2024-02-21 04:24:20.511 [info] > git config --get commit.template [36ms]
2024-02-21 04:24:20.512 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
2024-02-21 04:24:20.543 [info] > git status -z -uall [29ms]
2024-02-21 04:24:27.865 [info] > git config --get commit.template [26ms]
2024-02-21 04:24:27.869 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:24:27.899 [info] > git status -z -uall [27ms]
2024-02-21 04:24:36.203 [info] > git add -A -- . [173ms]
2024-02-21 04:24:36.565 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [360ms]
2024-02-21 04:24:36.591 [info] > git config --get commit.template [24ms]
2024-02-21 04:24:36.623 [info] > git config --get commit.template [28ms]
2024-02-21 04:24:36.626 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:24:36.656 [info] > git status -z -uall [28ms]
2024-02-21 04:24:36.696 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 04:24:36.728 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 04:24:37.841 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\TestScore.java [34ms]
2024-02-21 04:24:37.877 [info] > git cat-file -s d1988a75520d65f8a0eb9b6009f9034f7997173a [33ms]
2024-02-21 04:24:37.915 [info] > git show --textconv :src/edu/unlv/mis768/kly/TestScore.java [34ms]
2024-02-21 04:27:04.049 [info] > git log --format=%H%n%aN%n%aE%n%at%n%ct%n%P%n%D%n%B -z --shortstat --diff-merges=first-parent --author-date-order 0f74f39d9422082c4ddb1f2137ed007921979c60..81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1 [157ms]
2024-02-21 04:27:04.222 [info] > git diff --shortstat 0f74f39d9422082c4ddb1f2137ed007921979c60...81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1 [151ms]
2024-02-21 04:27:32.866 [info] > git push origin main:main [176205ms]
2024-02-21 04:27:32.866 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:27:32.903 [info] > git config --get commit.template [34ms]
2024-02-21 04:27:32.904 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
2024-02-21 04:27:32.939 [info] > git status -z -uall [31ms]
2024-02-21 04:27:33.033 [info] > git config --get commit.template [40ms]
2024-02-21 04:27:33.035 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [40ms]
2024-02-21 04:27:33.073 [info] > git status -z -uall [34ms]
2024-02-21 04:27:56.174 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:27:58.890 [info] > git ls-files --stage -- D:\GitHub\project15\misc\tictactoe.js [34ms]
2024-02-21 04:27:58.922 [info] > git show --textconv :misc/tictactoe.js [71ms]
2024-02-21 04:27:58.927 [info] > git cat-file -s cca32428bfe0a0d9e0619a9a6e51a0efcb9ba6da [34ms]
2024-02-21 04:28:09.061 [info] > git config --get commit.template [26ms]
2024-02-21 04:28:09.062 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:28:09.088 [info] > git status -z -uall [23ms]
2024-02-21 04:28:14.128 [info] > git config --get commit.template [30ms]
2024-02-21 04:28:14.130 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:28:14.188 [info] > git status -z -uall [29ms]
2024-02-21 04:28:19.229 [info] > git config --get commit.template [28ms]
2024-02-21 04:28:19.230 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:28:19.257 [info] > git status -z -uall [25ms]
2024-02-21 04:28:34.348 [info] > git config --get commit.template [31ms]
2024-02-21 04:28:34.352 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
2024-02-21 04:28:34.420 [info] > git status -z -uall [66ms]
2024-02-21 04:28:40.168 [info] > git config --get commit.template [28ms]
2024-02-21 04:28:40.170 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:28:40.198 [info] > git status -z -uall [26ms]
2024-02-21 04:28:44.407 [info] > git ls-files --stage -- D:\GitHub\project15\misc\reactbuttons.js [26ms]
2024-02-21 04:28:44.410 [info] > git show --textconv :misc/reactbuttons.js [32ms]
2024-02-21 04:28:44.437 [info] > git cat-file -s d94050956cd29a385efb56dc0fe7e96d6a36e008 [28ms]
2024-02-21 04:28:48.596 [info] > git config --get commit.template [25ms]
2024-02-21 04:28:48.597 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:28:48.624 [info] > git status -z -uall [25ms]
2024-02-21 04:28:49.387 [info] > git ls-files --stage -- D:\GitHub\project15\misc\refactoredproject12.js [26ms]
2024-02-21 04:28:49.498 [info] > git cat-file -s 4f7587a9acc2c4dfe4832d54300ea55ee195ed7e [108ms]
2024-02-21 04:28:49.499 [info] > git show --textconv :misc/refactoredproject12.js [141ms]
2024-02-21 04:28:53.665 [info] > git config --get commit.template [25ms]
2024-02-21 04:28:53.667 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:28:53.695 [info] > git status -z -uall [24ms]
2024-02-21 04:29:04.016 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:29:10.564 [info] > git show --textconv :misc/project-91/project-91/dbPrestigeLevels.dat [31ms]
2024-02-21 04:29:10.565 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\dbPrestigeLevels.dat [29ms]
2024-02-21 04:29:10.593 [info] > git cat-file -s fa62f03d9dc78f33f5fdf3f6074370baee9f1381 [25ms]
2024-02-21 04:29:20.718 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:29:21.818 [info] > git show --textconv :misc/project-91/project-91/src/script.js [27ms]
2024-02-21 04:29:21.819 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [25ms]
2024-02-21 04:29:21.846 [info] > git cat-file -s de46746d33bea9f0b36faba135cee5695a4b8701 [25ms]
2024-02-21 04:29:34.760 [info] > git add -A -- . [164ms]
2024-02-21 04:29:34.889 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [127ms]
2024-02-21 04:29:34.915 [info] > git config --get commit.template [23ms]
2024-02-21 04:29:34.944 [info] > git config --get commit.template [26ms]
2024-02-21 04:29:34.947 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:29:34.974 [info] > git status -z -uall [25ms]
2024-02-21 04:29:35.017 [info] > git merge-base refs/heads/main refs/remotes/origin/main [31ms]
2024-02-21 04:29:35.047 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 04:29:36.644 [info] > git push origin main:main [1664ms]
2024-02-21 04:29:36.644 [info] remote: 
remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
remote: 
To https://github.com/kennethlarotyamat/project15.git
   4485fa3..0ba0a81  main -> main
2024-02-21 04:29:36.674 [info] > git config --get commit.template [28ms]
2024-02-21 04:29:36.676 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:29:36.703 [info] > git status -z -uall [25ms]
2024-02-21 04:29:36.770 [info] > git merge-base refs/heads/main refs/remotes/origin/main [62ms]
2024-02-21 04:29:36.787 [info] > git config --get commit.template [43ms]
2024-02-21 04:29:36.787 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [40ms]
2024-02-21 04:29:36.804 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [33ms]
2024-02-21 04:29:36.817 [info] > git status -z -uall [27ms]
2024-02-21 04:29:48.446 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:29:50.011 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [27ms]
2024-02-21 04:29:50.134 [info] > git cat-file -s d0861f1bb10e2095ee3ab7f1e2f0b757b3e6d441 [118ms]
2024-02-21 04:29:50.134 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [153ms]
2024-02-21 04:29:57.143 [info] > git config --get commit.template [27ms]
2024-02-21 04:29:57.144 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:29:57.174 [info] > git status -z -uall [28ms]
2024-02-21 04:30:01.333 [info] > git add -A -- . [177ms]
2024-02-21 04:30:01.333 [info] warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:30:01.549 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [213ms]
2024-02-21 04:30:01.576 [info] > git config --get commit.template [24ms]
2024-02-21 04:30:01.608 [info] > git config --get commit.template [29ms]
2024-02-21 04:30:01.610 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:30:01.642 [info] > git status -z -uall [29ms]
2024-02-21 04:30:01.684 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
2024-02-21 04:30:01.717 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 04:31:02.998 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [29ms]
2024-02-21 04:31:03.026 [info] > git cat-file -s 4eeef4bac7bc5191b03320efb5bec6c725fc0f1a [25ms]
2024-02-21 04:31:03.056 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [26ms]
2024-02-21 04:31:05.766 [info] > git push origin main:main [64121ms]
2024-02-21 04:31:05.766 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:31:05.797 [info] > git config --get commit.template [28ms]
2024-02-21 04:31:05.798 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:31:07.943 [info] > git status -z -uall [2143ms]
2024-02-21 04:31:08.020 [info] > git config --get commit.template [66ms]
2024-02-21 04:31:08.030 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [73ms]
2024-02-21 04:31:08.061 [info] > git status -z -uall [28ms]
2024-02-21 04:31:25.208 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\modal.js [25ms]
2024-02-21 04:31:25.535 [info] > git cat-file -s 65aebb75f89e209794918fcff09b92bb21b4bf19 [325ms]
2024-02-21 04:31:25.536 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js [357ms]
2024-02-21 04:31:32.852 [info] > git config --get commit.template [26ms]
2024-02-21 04:31:32.854 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:31:32.884 [info] > git status -z -uall [27ms]
2024-02-21 04:31:37.933 [info] > git config --get commit.template [30ms]
2024-02-21 04:31:37.935 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:31:37.965 [info] > git status -z -uall [27ms]
2024-02-21 04:31:43.001 [info] > git config --get commit.template [29ms]
2024-02-21 04:31:43.003 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:31:43.033 [info] > git status -z -uall [28ms]
2024-02-21 04:31:45.824 [info] > git add -A -- . [174ms]
2024-02-21 04:31:45.824 [info] warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:31:45.992 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [166ms]
2024-02-21 04:31:46.018 [info] > git config --get commit.template [24ms]
2024-02-21 04:31:46.050 [info] > git config --get commit.template [28ms]
2024-02-21 04:31:46.052 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:31:46.084 [info] > git status -z -uall [29ms]
2024-02-21 04:31:46.130 [info] > git merge-base refs/heads/main refs/remotes/origin/main [31ms]
2024-02-21 04:31:46.163 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
2024-02-21 04:31:47.274 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\modal.js [32ms]
2024-02-21 04:31:47.311 [info] > git cat-file -s feda1c26b2f2966029879a5fc0c29001c7578c56 [34ms]
2024-02-21 04:31:47.346 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js [30ms]
2024-02-21 04:32:54.910 [info] > git push origin main:main [814969ms]
2024-02-21 04:32:54.910 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:32:54.944 [info] > git config --get commit.template [31ms]
2024-02-21 04:32:54.947 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
2024-02-21 04:32:54.977 [info] > git status -z -uall [27ms]
2024-02-21 04:32:55.077 [info] > git config --get commit.template [49ms]
2024-02-21 04:32:55.080 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [48ms]
2024-02-21 04:32:55.115 [info] > git status -z -uall [33ms]
 */