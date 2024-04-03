$(function(){
  $("body").on('hidden.bs.modal', function (e) {
    var $iframes = $(e.target).find("iframe");
    $iframes.each(function(index, iframe){
      $(iframe).attr("src", $(iframe).attr("src"));
    });
  });
});

const body = document.querySelector('body');
const modeToggle = document.getElementById('mode-toggle');
const modeStatus = document.querySelector('.mode-status');

function toggleMode() {
  body.classList.toggle('dark-mode');

  const modeMessage = body.classList.contains('dark-mode') ?
    'Dark Mode' 
    : "Light Mode"

  modeStatus.innerText = "Currently in " + modeMessage;
}
/**
 * what is going on here. this is a long. this is a log of the issues.
 * 
 */
modeToggle.addEventListener('click', toggleMode);

/*

2024-02-21 03:03:09.680 [info] Log level: Info
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

I don't even want to think about all this garage door 
garbage
what a headache, what a nightmare.

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

...

Module 3: IT-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 

1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote = positive hita or impede = negative HITA
				Either situation can be leveraged to produce innovation
And innovative solutions
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment within an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance
			Coalignment - in contrast to dissonance - a kind of synergy
			Affordance Theory - what information technology allows human
users to do - affordance can increase as an operator becomes more adept at using a particular artifact of information technology - affordance is also - it affordance also depends on the goals of the user. - a crm doesn’t do much for a person interested in programming - an IDE doesn’t do much for a person looking to close a deal.
			Types of IT Affordance - Collaborative Affordance - 
organizational Memory Affordance - process management affordance
			Affordance - what is allowed - what is enabled
			Organizational inertia - describes the difficulties an 
organization may have in changing course or changing direction - in HITA terms - HITA = Zero
			Orthogonal - do not influence one another, either in a positive 
way or a negative way

2.1 Why Microtribes Are Wrecking Company Growth Plans

Dynamics:		Market fragmentation - has been increasing in an increasingly granular way - allowed by changes in how people 
				connect with one another
			Examples of how incumbents have adapted - have to combine some functions - keep other functions separate - these 
				can be used to describe when organizations 
					VF Corporation
					Match Group
					Omnicom
					Publicis
			Technologies change the way people interact - which changes the sizes of market segments - which changes how 
				companies manage product lineups - which changes how organizations are segmented
			I can demonstrate the non-linear/quadratic/parabolic/u-shaped relationship by using illustrations from 
				Fragmented organizations - VF Corp. - Match - Meta - Berkshire Hathaway
				Integrated Organizations - Apple - Google
				Mixed Integrated Organizations - Amazon
				


3: Strategic Relevance Of Organizational Virtues Enabled By IT

Terminology:	COPs - communities of practice - a conceptual framework for
Organizations.
Concepts:		Improvisation as innovation - improvisation involves developing
				novel solutions to address novel situations - and should be 
				considered a form of innovation - and should be fostered
				or promoted by an organization to address urgent and
				unpredictable, and unanticipated challenges
			Organizational Wisdom - required to improvise successfully - has
				a positive effect on the ability to improvise
			Mediating Variables - Mediating Factors - IT affordance doesn’t 
				have a direct connection to innovation - it’s mediated 
				through virtues and capabilities that can foster or hinder 
				Innovation.
			IT Capabilities are distinct from IT affordances - capabilities refer 
				to what can be done - affordances, specifically the aspect of 
				how technology is appropriated for a purpose - how 
				technologies might be used - a GPU could be used for 
				enhancing a computer game - or processing a large 
				language model - or processing a blockchain or 
				cryptocurrency - a GPU is capable of performing 
				calculations, but what functions a GPU affords to the user 
				depends on how the user appropriates or uses the GPU or
				what application the user uses it for.

Virtues:		Courage
			Justice - distributive and corrective
			Wisdom
			Temperance - particularly relevant during periods of radical 
				organizational change - needed to reduce anxiety, panic, 
				And Despair that coincides with radical organizational 
				change - Organizational Temperance serves to prevent or 
				reduce chaos

Frameworks:	The framework for organizational virtues is an extension of the 
				business ethics
			Organizational IT affordances - collaborative, process 
				management, and memory - Which in turn enable
				Organizational Virtues - These organizational virtues 
				determine the success of organizational improvisation - 
				improvisation is either a form of innovation - or a kind of 
				process that occurs before innovation - or is a kind of 
				preliminary step to innovation.

Catalysts:		improvisation - turbulent circumstances - spontaneous situations - unprecedented 
				Circumstances - truncated time horizons
Innovation - enhanced by formalizing the process of improvisation - or establishing or 
	practicing improvisation - having a process in place specifically for developing 
	novel solutions to unprecedented situations


Limitations:		ninety percent of innovations fail
Research showing reduced significance of information technology on organizational 
Outcomes
Organizational Wisdom - highest correlative variable to improvisational success - may 
potentially be highest among more established incumbent organizations - and less 
so among more recently established organizations.
In Business Ethics research, the virtue based ethical framework occupies a niche area, even 
within the information systems discipline - business ethics, the majority of business 
ethics scholarship - focuses on morality (“deontology”) or optimization as an 
ethical framework (“utilitarianism”)
Research based on subjects or observees or participants based in the united states


4: Information Technology And Organizational Innovation: 
Challenges:	Inconsistencies in literature
			Limitations on areas of study - Organizational courage - risk tolerance - risk aversion - and fit
			Limitations of agency in a corporate context
Concepts:		Fit -HITA, and how HITA influences organizational courage
			Gestalt - coherence of internal structures
			Stratification of Fit: proposes 3 levels of fit Level 1 - Level 2 - Level 3
			Actualization - application and implementation
			Innovation - 2 types - exploratory - exploitative - exploitative meaning commercializable - actually - it seems both 
				exploratory and exploitative are for commercial applications - exploratory refers to innovating new 
				products - exploitative refers to innovating existing products - exploratory innovation is radical - 
				Exploitative is Incremental. Exploratory innovation is more disruptive.
			Actualizing affordances - Requires experimentation, changes, tinkering - these processes can pose a perceived risk 
				that a less courageous organization may be averse to, and therefore will never benefit from affordances 
				that are never implemented or actualized.
			Moderation - one variable has an effect on another variable, but that intensity of that impact is affected by a
				third variable
			Mediation -  one variable has an effect on another variable, but this effect can only occur through an 
				intermediate variable, or intermediary, that transmits the effect from the first variable, to the second 
				Variable
			Profile deviation - expectations vs reality
			Matching - two variables
			Covariance
			Gestalt
			
			
Frameworks:	Agility -  the ability to adapt to changing circumstances
Terminology:	Organizational Courage - refers to the ability to take risks - 
			Fit - Alignment and harmony - FIT & HITA refer to the convergence of IT infrastructure and organizational
				objectives in a way that serves as a catalyst for innovation - fosters innovation
			Circumspect - risk averse - risk avoidance - wary or risk
			Transitive Effect - 
			Salience = prevalence -
			Parsimonious - used in this context to mean focused
			Spurious - dubious or contrived

Conflicts:		Exploratory innovation by a firm may create products that conflict with existing product lines the following are 
			a list of companies that innovated products that conflicted with existing products:
				Vanguard - passively managed index funds
				State Street - Exchange traded funds
				Xerox - GUI, Personal Computers
				Polaroid - Digital Cameras, digital photography, digital imaging
				Alphabet - Large Language Models
				Booking holdings - Vacation Rentals
				IBM - Personal Computers , Servers
				Altria - vape products
				Microsoft - Mobile Operating Systems, Mobile Devices
				Corteva - Bioengineered crops
				Blockbuster - video streaming services
				Palm, blackberry, motorola - touchscreen smartphones
				DR Horton, Lennar Greystone - Modular construction techniques
				Atari - console gaming - computer gaming - multiplayer gaming
Reflections:	Affordances must be actualized, having the best tools, having the best technology means nothing if it isn’t put
				into use, it’s useless if it isn’t used - and it’s useless if it isn’t used to produce anything, like to innovate new 
				products, or iterate and improve upon existing products. These new innovations have the potential to create 
				uncertainty and perceived risks to an organization, and an organization must have courage to overcome				 the fears of risk and uncertainty to actualize technology to innovate.
			What the data shows is that the rewards are there for organizations  willing to take risks, for organizations that
				have The organizational courage to take prudent and well calculated risks and address the uncertainties 
				that come with those, rewards, those innovations, however, in order for these rewards to materialize for an
				Organization, information Technology affordances must be actualized in combination with a strong 
				culture of organizational courage.
			There is a point in the article that shows that there is a strong relationship between exploratory and exploitative
				 innovation, that when one measurement measures high, that the other will also measure high. One thing we 
				discussed in class was that, a long series of incremental, exploitative innovations, can result in - or can add 
				up to something similarly to an exploratory, disruptive innovation
			


3.2: Disruptive Innovations With It

1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
Disruption:		The term disruption - Currently Overused - core concepts misunderstood - disruption usually occurs at the
				lower-end of the market. Incumbents produce over-developed products. New entrants develop inexpensive
				products.
					Fintech -	
					Rideshare -
					Vacation Rentals -
					Browser software - 
			The technology isn’t usually innovative, but the business model is what is disruptive
			Low-end encroachment - movement from the low-end of the market, upstream, to the higher end of the market is 
				Usually something incumbents tend not to pay attention to - and this results in an increased chance of 
				being disrupted
			Industry-Wide or Strategic Disruptions
				Green Revolution
				Automation, AI, robotics, drones
				Sensor Technologies, wireless sensor networks
				Additive Manufacturing techniques, 3d printing, digital production
Methods:		Used language analysis to screen 1078 research papers published between 1978 - 2016
			Diffusion patterns
			Ex-ante
			Ex-post
			Post-hoc conclusions
Dynamics:		incumbents, established organizations lose ground when innovations occur due to a focus on existing, 
				sophisticated customers
			It has been suggested that organizations develop units that guard against disruptions rather than focus on 
				customer needs
			Leadership structures that cause organizations to be disrupted, increase the risk of being disrupted, and have 
				difficulties adapting and reacting to disruptions
			Legislative barriers prevented or interfered with the adoption of e-readers in japan - copyrights and intellectual 
				property protections specifically



2: Agility In Responding To Disruptive Digital Innovation
Focus:		small and medium sized enterprises - firms

Terminology:	SME - small to medium sized enterprises
			DDI - disruptive digital innovation
			Rigidity & Agility - refers to or connects to the concept of organizational inertia and agility
			

Cases:			Kodak - failure to respond to digital photography
			Nokia - failure to respond to smartphones
			AirBNB - how will it adapt as the market for vacation rentals becomes increasingly competitive
			Uber Technologies - 
			Elixir Technologies - coding changes - programming disruptions - software delivery distribution disruptions - 
				moved from business reporting - to business intelligence software - then to providing this service through 
				the cloud or through a cloud based application. - Developed a system for dispatching taxis to taxi stands, 
				but this was disrupted by ride-hailing services, so the technology was modified to serve mass transit stations
				Elixir was in a somewhat unique position - since they were in a business reporting, business intelligence, 
				business analytics software business, they often had extensive external network relationships since they 
				had to work with a variety of businesses - through these networks, the leadership teams were often more 
				creative, and more open to new business ideas. Converted the transit system software to a smart-transit 
				software system. from off the shelf packages - to cloud based software as a service - from business reporting 
				software to business analytics software. Had to adapt to mobile devices - pdas - and later to smart phones - 
				to allow delivery of the software to mobile devices

Concepts:		Agility is the key factor in surviving disruptions caused by digital innovations - requires the ability to detect and 
				respond to the changes caused by the innovations
			Some innovations may require the combination of several different technologies, or may require the maturity of 
				some technologies to occur, prerequisite developments to take place.
			SME - do not require large amounts of slack resources - refers to emergency fund style resources - larger 
				organizations require more slack resources in a way that someone with higher monthly expenses may require 
				a larger emergency fund. SMEs tend to have owner/managers who tend to have a mindset or approach that is 
				different from someone who is an employee/manager
			External network relationships - people outside a firm who can assist an SME in various ways, support an SME in 
				various ways, provide external competencies, external insights, alternative viewpoints, identify 
				Opportunities
			SME - does experience greater resource constraints compared to larger organizations
			Organizational Ambidexterity - managing exploratory, and exploitative innovation at the same time.
			Exploratory vs Exploitative innovation - in elixer’s case - mentioned that 3 out of 10 exploitative pilot projects 
				work out, compared to 1 out of 10 for exploratory pilot projects
			Responding to changes - develop capabilities - preventing rigidities - sensing requires leadership to have strong 
				external networks boundary openness
			Sensing Capabilities - being able to detect changes in innovation that can disrupt a business.
			SME - has benefits as well as challenges, they don’t require extensive resource slack, or fall back resources, but 
				they also don’t have - this also is an issue because they may not have enough resources to reconfigure the 
				Business or to adapt in the necessary ways after a disruption.



3: The Disruptive Information Technology Innovation Model
Frameworks:	disruptive information technology innovation model (DITIM)
				adoption timing
				disruptive innovation cycle
			Variables that Differ between early and late adopters
				(1) adoption rate of radical IT innovations, 
				(2) strong order effects on downstream innovations related to the amount of innovation, 
				(3) perceived radicalness of innovations and 
				(4) strong effects on downstream innovations related to the radicalness of innovation.
			DITIM explains innovation patterns over time and articulates their sequence across three types of IT innovations: 
				(1) bases 
				(2) processes 
				(3) services
			Radical Innovations
				learning barriers - high during early period of innovation cycle, 
							    lower later on due to larger knowledge base

Timelines:		1995–1999, an early period of rapid, broad and deep industry-wide innovation
			2000 -  onward, a period in which industry-wide innovation slowed, 
			became dramatically standardized and posed lower learning requirements 
			for new entrants relative to the earlier stage.

Conclusions:	Goals of 
			(1) demonstrating the importance of considering temporal factors in the study of disruptive innovation 
			(2) illustrating that innovation types matter when theorizing about IT-innovation creation and adoption
			service innovation: primary engine of process innovation during the entire disruptive IT-innovation cycle
				Service innovation drives process innovation
			base technologies: ‘mature’ and become more standardized and powerful, they have more significant effects.
			process innovations: take more time to mature and evolve
			Process innovations: Process innovations may also have early substitutive effects when the causal links between 
				the base technologies and their effects are poorly understood and are later replaced with complementary
				Effects.
Reflections:	There is an early and late innovation cycle
			And there are early and late adopters of innovations
			
			


4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence
 
1: Artificial Intelligence In Organizations 
2: AI Innovation Typology
3: Artificial Intelligence (AI): Multidisciplinary Perspectives 




3.1 Leveraging large language models for predictive chemistry


Terminology:	Machine Learning
			Large Language Model
			LLM Training
			In context learning - this refers to how the LLM learns about a subject during the course 
                                       		of a chat session, rather than fine-tuning or training the model directly.		
			Inverse design - this refers to creating molecular structures - or chemicals - polymers or 
alloys - that react in a certain way, or have a specific set of properties - I think that it 
is called inverse design because, rather than creating a chemical, and describing its 
properties, - the desired properties are described, and then the molecule is designed
			Generative Models
			MLM - Machine Learning Model
			LLM - Large Language Model
			First-principles theory
                          Isomers - This is chemistry related
Polymers- This is chemistry related
Monomers - This is chemistry related
		Gaussian process regression - GPR
		Generative pretrained transformer - gpt

Applications:	Large Language Models and machine learning to chemistry, and physical sciences
			Computing, programming, AI, ML, LLM on Physical sciences, chemistry, and predictive
				Simulations
			Generating a specific type of dispersant - which I think is a kind of soap - generating a 
dispersant with a specific set of characteristics

Limitations:		The LLM was able to generate molecules using inverse design, or, it was able to 
Hypothesize the existence of chemicals with a desired set of characteristics,
But there were instances where the LLM generated invalid chemical structures
Even if an LLM is able to generate a new chemical, that chemical still has to be synthesized
	And there are instances where it’s not really possible or practical to synthesize the
	Chemical generated by the LLM
It can be difficult to train an LLM accurately, or train it well for accuracy because very 
large dataset are required, and there are limitations on how many chemicals can be 
tested and added to a given data set to train an LLM on

Variations:		Using a general LLM AI tool (GPT 3) trained on chemistry documents Rather than a 
chemistry specific AI tool, or existing chemistry simulation tools conventional machine learning models designed for chemistry
Existing machine learning models represent chemicals or molecular structures 
	mathematically, or symbolically, or as a kind of code or program that reacts  	
a certain way, rather than verbally. Existing machine learning models simulate 
molecular structures in an abstract way, rather than verbally, the approach used in 
this paper, by these researchers, describes chemicals verbally
The GPT 3 LLM was compared with a gaussian process regression mlm

Reflections:	this was a really interesting article - one of the things that I’m wondering is: if copyright 
protection isn’t or cannot be granted to ai generated text or ai generated artwork, will patents also not be granted to ai generated chemicals? Or AI generated medicines or Pharmaceuticals? Or ai generated chemical compounds.
AI is already used to create novel chemical structures, however, the prevailing AI tools 
used for the purpose of generating novel chemical structures are Machine learning 
models, rather than large language models, this research paper approaches 
generating novel chemical structures using LLMs rather than MLMs


Intersections:	This paper illustrates the concept of IT Affordances - LLMs have certain capabilities, and 
how LLMs are appropriated, in this case, an LLM is appropriated for the purpose of creating novel chemical compounds - this article illustrates a novel appropriation of an existing tool.



	
	
4: Strategic Use Of AI











References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002
Jablonka, K. M., Schwaller, P., Ortega-Guerrero, A., & Smit, B. (2024). Leveraging large language models for predictive chemistry. Nature Machine Intelligence. https://doi.org/10.1038/s42256-023-00788-1

Patnaik, D. (2024, February 11). Why Microtribes Are Wrecking Company Growth Plans. Forbes. https://www.forbes.com/sites/devpatnaik/2024/02/11/why-microtribes-are-wrecking-company-growth-plans/?sh=3307ddba509c
























Annotations

Testing the presentation - tested inserting videos - creating charts - creating diagrams - 

Created slides 21 - 24 - subsequently deleted.


Updated Module paper 3, just the references page

I came across an interesting scholarly article that I want to read, and cite in this paper
So i am skipping to 3.3 of the module 3 paper



Article Read Aloud Set up Area

– this was basically useless, you can’t print a pdf that has read aloud enabled, a document has to be downloaded, not printed – as a pdf in order for it to be read aloud enabled












Module 1 											Vicky
Module 2											Kelly
Module 3 											Kenneth
Module 4 											Group Paper
4.1. The Landscape of Emerging Technologies				Vicky
4.1.1 Blockchain Research in Information Systems		Vicky
4.1.2 Editorial Emergent Tech and Organizing			Vicky
4.1.3 the Fintech Revolution:						Vicky
4.1.4 Quantum Computing and Information Systems		Vicky


4.2. The Changing Nature of Work						Kelly
4.2.1 Editorial Future of Work Organizations Society		Kelly
4.2.2 Human Factors in AI and Future of Work			Kelly
4.2.3 Mental Health and Information Technology		Kelly
4.2.4 Waging war from remote cubicles				Kelly

4.3 Digitalization: Advances and Challenges 				Kenneth			Group Presentation
4.3.1 Digital Innovation Review 					Kenneth			Vicky
4.3.2 Unpacking The Difference 					Kenneth			Kelly
4.3.3 Digital Opportunities For Incumbents 			Kenneth			Kenneth
4.3.4 Digitalization Ethical Challenge 				Kenneth			Kenneth

...
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
2024-02-21 04:33:14.151 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:33:23.477 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [26ms]
2024-02-21 04:33:23.477 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [25ms]
2024-02-21 04:33:23.507 [info] > git cat-file -s 4eeef4bac7bc5191b03320efb5bec6c725fc0f1a [27ms]
2024-02-21 04:33:40.296 [info] > git add -A -- . [147ms]
2024-02-21 04:33:40.296 [info] warning: in the working copy of 'misc/project-91/project-91/src/script.js', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:33:40.403 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [104ms]
2024-02-21 04:33:40.429 [info] > git config --get commit.template [23ms]
2024-02-21 04:33:40.459 [info] > git config --get commit.template [27ms]
2024-02-21 04:33:40.462 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:33:40.489 [info] > git status -z -uall [25ms]
2024-02-21 04:33:40.529 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
2024-02-21 04:33:40.561 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 04:33:55.167 [info] > git push origin main:main [14672ms]
2024-02-21 04:33:55.167 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:33:55.197 [info] > git config --get commit.template [28ms]
2024-02-21 04:33:55.201 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:33:55.228 [info] > git status -z -uall [25ms]
2024-02-21 04:33:55.320 [info] > git config --get commit.template [48ms]
2024-02-21 04:33:55.324 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [49ms]
2024-02-21 04:33:55.358 [info] > git status -z -uall [31ms]
2024-02-21 04:34:17.088 [info] > git show --textconv :misc/project-91/project-91/src/script.js [32ms]
2024-02-21 04:34:17.089 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [31ms]
2024-02-21 04:34:17.120 [info] > git cat-file -s e6b0349998ad203cbd44dd9130c6d90fe0612739 [28ms]
2024-02-21 04:34:22.142 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [28ms]
2024-02-21 04:34:22.144 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [32ms]
2024-02-21 04:34:22.169 [info] > git cat-file -s 4eeef4bac7bc5191b03320efb5bec6c725fc0f1a [25ms]
2024-02-21 04:34:22.547 [info] > git config --get commit.template [27ms]
2024-02-21 04:34:22.551 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:34:22.580 [info] > git status -z -uall [27ms]
2024-02-21 04:34:27.745 [info] > git add -A -- . [46ms]
2024-02-21 04:34:27.745 [info] warning: in the working copy of 'misc/project-91/project-91/src/script.js', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:34:27.922 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [175ms]
2024-02-21 04:34:27.948 [info] > git config --get commit.template [24ms]
2024-02-21 04:34:27.978 [info] > git config --get commit.template [27ms]
2024-02-21 04:34:27.981 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:34:28.010 [info] > git status -z -uall [27ms]
2024-02-21 04:34:28.049 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
2024-02-21 04:34:28.080 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 04:35:35.095 [info] > git push origin main:main [67080ms]
2024-02-21 04:35:35.095 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:35:35.140 [info] > git config --get commit.template [43ms]
2024-02-21 04:35:35.143 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
2024-02-21 04:35:35.201 [info] > git status -z -uall [55ms]
2024-02-21 04:35:35.313 [info] > git config --get commit.template [51ms]
2024-02-21 04:35:35.317 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [48ms]
2024-02-21 04:35:35.360 [info] > git status -z -uall [40ms]
2024-02-21 04:35:36.753 [info] > git push origin main:main [230662ms]
2024-02-21 04:35:36.753 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:35:36.792 [info] > git config --get commit.template [35ms]
2024-02-21 04:35:36.795 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
2024-02-21 04:35:37.154 [info] > git status -z -uall [356ms]
2024-02-21 04:35:37.216 [info] > git config --get commit.template [29ms]
2024-02-21 04:35:37.219 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
2024-02-21 04:35:37.251 [info] > git status -z -uall [29ms]
2024-02-21 04:35:53.166 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\javascript\12project10script.js [27ms]
2024-02-21 04:35:53.285 [info] > git cat-file -s d17c5b1bcd6cde28bdca8e4de83a7e3fad4221b7 [116ms]
2024-02-21 04:35:53.285 [info] > git show --textconv :javascript/12project10script.js [149ms]
2024-02-21 04:35:58.831 [info] > git config --get commit.template [27ms]
2024-02-21 04:35:58.834 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:35:58.867 [info] > git status -z -uall [30ms]
2024-02-21 04:36:03.904 [info] > git config --get commit.template [26ms]
2024-02-21 04:36:03.906 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:36:03.939 [info] > git status -z -uall [29ms]
2024-02-21 04:36:08.981 [info] > git config --get commit.template [29ms]
2024-02-21 04:36:08.982 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:36:09.014 [info] > git status -z -uall [29ms]
2024-02-21 04:36:14.057 [info] > git config --get commit.template [33ms]
2024-02-21 04:36:14.062 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [36ms]
2024-02-21 04:36:14.098 [info] > git status -z -uall [32ms]
2024-02-21 04:36:20.131 [info] > git config --get commit.template [27ms]
2024-02-21 04:36:20.133 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:36:20.164 [info] > git status -z -uall [29ms]
2024-02-21 04:36:34.340 [info] > git add -A -- . [183ms]
2024-02-21 04:36:34.340 [info] warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:36:34.504 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [163ms]
2024-02-21 04:36:34.529 [info] > git config --get commit.template [23ms]
2024-02-21 04:36:34.560 [info] > git config --get commit.template [28ms]
2024-02-21 04:36:34.562 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:36:34.594 [info] > git status -z -uall [30ms]
2024-02-21 04:36:34.638 [info] > git merge-base refs/heads/main refs/remotes/origin/main [35ms]
2024-02-21 04:36:34.670 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
2024-02-21 04:36:40.752 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:36:41.989 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:36:45.921 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:36:47.063 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:36:47.886 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:36:50.083 [info] > git show --textconv :CSS/project16.css [34ms]
2024-02-21 04:36:50.084 [info] > git ls-files --stage -- D:\GitHub\project16\CSS\project16.css [32ms]
2024-02-21 04:36:50.113 [info] > git cat-file -s ec14e5b299d1127e6a64dec0fad00db120955596 [26ms]
2024-02-21 04:36:54.661 [info] > git config --get commit.template [26ms]
2024-02-21 04:36:54.663 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:36:54.689 [info] > git status -z -uall [24ms]
2024-02-21 04:36:59.728 [info] > git config --get commit.template [27ms]
2024-02-21 04:36:59.729 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:36:59.756 [info] > git status -z -uall [24ms]
2024-02-21 04:37:04.789 [info] > git config --get commit.template [26ms]
2024-02-21 04:37:04.791 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:37:04.817 [info] > git status -z -uall [24ms]
2024-02-21 04:37:08.339 [info] > git push origin main:main [33740ms]
2024-02-21 04:37:08.339 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:37:08.370 [info] > git config --get commit.template [28ms]
2024-02-21 04:37:08.371 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:37:08.401 [info] > git status -z -uall [27ms]
2024-02-21 04:37:08.471 [info] > git config --get commit.template [41ms]
2024-02-21 04:37:08.474 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
2024-02-21 04:37:08.503 [info] > git status -z -uall [27ms]
2024-02-21 04:37:12.414 [info] > git config --get commit.template [33ms]
2024-02-21 04:37:12.423 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [39ms]
2024-02-21 04:37:12.464 [info] > git status -z -uall [39ms]
2024-02-21 04:37:24.728 [info] > git config --get commit.template [27ms]
2024-02-21 04:37:24.731 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:37:24.761 [info] > git status -z -uall [28ms]
2024-02-21 04:37:34.074 [info] > git config --get commit.template [26ms]
2024-02-21 04:37:34.078 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:37:34.141 [info] > git status -z -uall [59ms]
2024-02-21 04:38:08.824 [info] > git config --get commit.template [29ms]
2024-02-21 04:38:08.827 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:38:08.857 [info] > git status -z -uall [26ms]
2024-02-21 04:38:27.489 [info] > git config --get commit.template [31ms]
2024-02-21 04:38:27.491 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:38:27.520 [info] > git status -z -uall [27ms]
2024-02-21 04:38:42.483 [info] > git config --get commit.template [26ms]
2024-02-21 04:38:42.485 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:38:42.514 [info] > git status -z -uall [27ms]
2024-02-21 04:38:52.510 [info] > git config --get commit.template [28ms]
2024-02-21 04:38:52.511 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:38:52.539 [info] > git status -z -uall [26ms]
2024-02-21 04:38:57.570 [info] > git config --get commit.template [26ms]
2024-02-21 04:38:57.572 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:38:57.600 [info] > git status -z -uall [25ms]
2024-02-21 04:39:16.210 [info] > git config --get commit.template [31ms]
2024-02-21 04:39:16.212 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
2024-02-21 04:39:16.245 [info] > git status -z -uall [31ms]
2024-02-21 04:39:20.593 [info] > git add -A -- . [66ms]
2024-02-21 04:39:20.738 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [144ms]
2024-02-21 04:39:20.764 [info] > git config --get commit.template [24ms]
2024-02-21 04:39:20.794 [info] > git config --get commit.template [28ms]
2024-02-21 04:39:20.798 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:39:20.825 [info] > git status -z -uall [25ms]
2024-02-21 04:39:20.873 [info] > git merge-base refs/heads/main refs/remotes/origin/main [35ms]
2024-02-21 04:39:20.941 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [65ms]
2024-02-21 04:39:22.019 [info] > git ls-files --stage -- D:\GitHub\project16\CSS\project16.css [26ms]
2024-02-21 04:39:22.049 [info] > git cat-file -s 74a72da8ccbdc9854d6789b878d5646d862f6f88 [28ms]
2024-02-21 04:39:22.085 [info] > git show --textconv :CSS/project16.css [32ms]
2024-02-21 04:40:40.501 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [25ms]
2024-02-21 04:40:40.503 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [30ms]
2024-02-21 04:40:40.528 [info] > git cat-file -s 2a5566a9b816e69ca702bcbc62b4402e96fc0404 [25ms]
2024-02-21 04:40:56.913 [info] > git config --get commit.template [26ms]
2024-02-21 04:40:56.915 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:40:56.946 [info] > git status -z -uall [28ms]
2024-02-21 04:41:01.987 [info] > git config --get commit.template [29ms]
2024-02-21 04:41:01.990 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:41:02.021 [info] > git status -z -uall [29ms]
2024-02-21 04:41:07.065 [info] > git config --get commit.template [26ms]
2024-02-21 04:41:07.067 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:41:07.097 [info] > git status -z -uall [27ms]
2024-02-21 04:41:39.982 [info] > git config --get commit.template [29ms]
2024-02-21 04:41:39.984 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:41:40.012 [info] > git status -z -uall [26ms]
2024-02-21 04:41:45.059 [info] > git config --get commit.template [31ms]
2024-02-21 04:41:45.061 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
2024-02-21 04:41:45.091 [info] > git status -z -uall [27ms]
2024-02-21 04:41:55.570 [info] > git config --get commit.template [26ms]
2024-02-21 04:41:55.572 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:41:55.600 [info] > git status -z -uall [26ms]
2024-02-21 04:42:00.633 [info] > git config --get commit.template [29ms]
2024-02-21 04:42:00.635 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:42:00.665 [info] > git status -z -uall [27ms]
2024-02-21 04:42:04.244 [info] > git add -A -- . [177ms]
2024-02-21 04:42:04.419 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [173ms]
2024-02-21 04:42:04.444 [info] > git config --get commit.template [22ms]
2024-02-21 04:42:04.473 [info] > git config --get commit.template [27ms]
2024-02-21 04:42:04.476 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:42:04.506 [info] > git status -z -uall [27ms]
2024-02-21 04:42:04.577 [info] > git merge-base refs/heads/main refs/remotes/origin/main [59ms]
2024-02-21 04:42:04.609 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
2024-02-21 04:42:34.445 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [28ms]
2024-02-21 04:42:34.445 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [26ms]
2024-02-21 04:42:34.474 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [25ms]
2024-02-21 04:44:30.752 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [25ms]
2024-02-21 04:44:30.755 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [30ms]
2024-02-21 04:44:30.782 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [28ms]
2024-02-21 04:46:39.292 [info] > git push origin main:main [438460ms]
2024-02-21 04:46:39.292 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:46:39.321 [info] > git config --get commit.template [27ms]
2024-02-21 04:46:39.326 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
2024-02-21 04:46:39.355 [info] > git status -z -uall [26ms]
2024-02-21 04:46:39.421 [info] > git config --get commit.template [42ms]
2024-02-21 04:46:39.424 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [44ms]
2024-02-21 04:46:39.451 [info] > git status -z -uall [25ms]
2024-02-21 04:46:45.097 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [29ms]
2024-02-21 04:46:45.097 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [27ms]
2024-02-21 04:46:45.130 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [31ms]
2024-02-21 04:46:56.350 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [25ms]
2024-02-21 04:46:56.353 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [30ms]
2024-02-21 04:46:56.377 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [24ms]
2024-02-21 04:47:38.183 [info] > git show --textconv :misc/project-91/project-91/src/script.js [31ms]
2024-02-21 04:47:38.185 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [29ms]
2024-02-21 04:47:38.214 [info] > git cat-file -s cfb8b3deac8f8a672c22f87ec29ce9c384a3c13d [26ms]
2024-02-21 04:47:45.036 [info] > git config --get commit.template [27ms]
2024-02-21 04:47:45.040 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:47:45.066 [info] > git status -z -uall [25ms]
2024-02-21 04:47:55.972 [info] > git config --get commit.template [27ms]
2024-02-21 04:47:55.975 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
2024-02-21 04:47:56.000 [info] > git status -z -uall [23ms]
2024-02-21 04:48:01.037 [info] > git config --get commit.template [27ms]
2024-02-21 04:48:01.040 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:48:01.065 [info] > git status -z -uall [24ms]
2024-02-21 04:48:06.105 [info] > git config --get commit.template [26ms]
2024-02-21 04:48:06.107 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:48:06.133 [info] > git status -z -uall [23ms]
2024-02-21 04:48:15.054 [info] > git config --get commit.template [27ms]
2024-02-21 04:48:15.056 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:48:15.082 [info] > git status -z -uall [24ms]
2024-02-21 04:48:20.201 [info] > git config --get commit.template [26ms]
2024-02-21 04:48:20.204 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:48:20.231 [info] > git status -z -uall [24ms]
2024-02-21 04:48:34.863 [info] > git config --get commit.template [27ms]
2024-02-21 04:48:34.864 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
2024-02-21 04:48:34.889 [info] > git status -z -uall [24ms]
2024-02-21 04:48:53.329 [info] > git push origin main:main [408819ms]
2024-02-21 04:48:53.329 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:48:53.358 [info] > git config --get commit.template [26ms]
2024-02-21 04:48:53.362 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:48:53.396 [info] > git status -z -uall [31ms]
2024-02-21 04:48:53.469 [info] > git config --get commit.template [42ms]
2024-02-21 04:48:53.472 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
2024-02-21 04:48:53.525 [info] > git status -z -uall [50ms]
2024-02-21 04:48:56.066 [info] > git config --get commit.template [40ms]
2024-02-21 04:48:56.069 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
2024-02-21 04:48:56.118 [info] > git status -z -uall [44ms]
2024-02-21 04:49:11.683 [info] > git config --get commit.template [25ms]
2024-02-21 04:49:11.685 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
2024-02-21 04:49:11.712 [info] > git status -z -uall [25ms]
2024-02-21 04:49:16.755 [info] > git config --get commit.template [26ms]
2024-02-21 04:49:16.760 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:49:16.787 [info] > git status -z -uall [25ms]
2024-02-21 04:49:31.509 [info] > git config --get commit.template [31ms]
2024-02-21 04:49:31.515 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [34ms]
2024-02-21 04:49:31.543 [info] > git status -z -uall [26ms]
2024-02-21 04:49:45.125 [info] > git add -A -- . [56ms]
2024-02-21 04:49:45.125 [info] warning: in the working copy of 'misc/project-91/project-91/src/script.js', LF will be replaced by CRLF the next time Git touches it
2024-02-21 04:49:45.349 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [222ms]
2024-02-21 04:49:45.373 [info] > git config --get commit.template [23ms]
2024-02-21 04:49:45.405 [info] > git config --get commit.template [29ms]
2024-02-21 04:49:45.408 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
2024-02-21 04:49:45.436 [info] > git status -z -uall [26ms]
2024-02-21 04:49:45.491 [info] > git merge-base refs/heads/main refs/remotes/origin/main [48ms]
2024-02-21 04:49:45.534 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [41ms]
2024-02-21 04:52:28.321 [info] > git ls-tree -l HEAD -- D:\GitHub\kennethlarotyamat.github.io\src\edu\unlv\mis768\kly\CreateTranscript.java [46ms]
2024-02-21 04:52:28.322 [info] > git show --textconv HEAD:src/edu/unlv/mis768/kly/CreateTranscript.java [50ms]
2024-02-21 04:52:34.454 [info] > git show --textconv :misc/project-91/project-91/src/script.js [29ms]
2024-02-21 04:52:34.455 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [26ms]
2024-02-21 04:52:34.483 [info] > git cat-file -s 78c80c29e9a67b130bbb96a5007020681cca79d5 [25ms]
2024-02-21 04:53:28.299 [info] > git log --format=%H%n%aN%n%aE%n%at%n%ct%n%P%n%D%n%B -z --shortstat --diff-merges=first-parent --author-date-order 0f74f39d9422082c4ddb1f2137ed007921979c60..6209828ef4296ae2596541fd5443dbc4e7deb5c9 [158ms]
2024-02-21 04:53:28.476 [info] > git diff --shortstat 0f74f39d9422082c4ddb1f2137ed007921979c60...6209828ef4296ae2596541fd5443dbc4e7deb5c9 [157ms]
2024-02-21 04:53:33.516 [info] > git diff --name-status -z --diff-filter=ADMR 0f9fbdb424d97038fd60295ab19f3c22ffd3b38e...6209828ef4296ae2596541fd5443dbc4e7deb5c9 [33ms]
2024-02-21 04:53:34.054 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:53:34.747 [info] > git diff --name-status -z --diff-filter=ADMR 211af98af473017c070c9035092f08addab11c18...0f9fbdb424d97038fd60295ab19f3c22ffd3b38e [25ms]
2024-02-21 04:53:35.291 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:53:36.421 [info] > git diff --name-status -z --diff-filter=ADMR c00e9ef1898daa76325260e190ee2095c9a61351...211af98af473017c070c9035092f08addab11c18 [27ms]
2024-02-21 04:53:36.964 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:53:37.269 [info] > git diff --name-status -z --diff-filter=ADMR 81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1...c00e9ef1898daa76325260e190ee2095c9a61351 [26ms]
2024-02-21 04:53:37.815 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:53:37.989 [info] > git diff --name-status -z --diff-filter=ADMR a42be9395dbfdd335ed9c26ec1a6f797dbb9b180...81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1 [27ms]
2024-02-21 04:53:38.535 [info] > git check-ignore -v -z --stdin [30ms]
2024-02-21 04:53:39.933 [info] > git diff --name-status -z --diff-filter=ADMR d86d04d32334f6cc21289ce37ebf57cce01b0ca5...a42be9395dbfdd335ed9c26ec1a6f797dbb9b180 [27ms]
2024-02-21 04:53:40.466 [info] > git check-ignore -v -z --stdin [23ms]
2024-02-21 04:53:41.459 [info] > git diff --name-status -z --diff-filter=ADMR 7e371f03b247c92726b32e43bd6367e7cec363ce...d86d04d32334f6cc21289ce37ebf57cce01b0ca5 [25ms]
2024-02-21 04:53:41.998 [info] > git check-ignore -v -z --stdin [27ms]
2024-02-21 04:53:42.548 [info] > git diff --name-status -z --diff-filter=ADMR 633ab65cbbc58fc92e09b97fd863e5d9a001acf3...7e371f03b247c92726b32e43bd6367e7cec363ce [26ms]
2024-02-21 04:53:43.094 [info] > git check-ignore -v -z --stdin [24ms]
2024-02-21 04:53:44.940 [info] > git diff --name-status -z --diff-filter=ADMR 0f74f39d9422082c4ddb1f2137ed007921979c60...633ab65cbbc58fc92e09b97fd863e5d9a001acf3 [42ms]
2024-02-21 04:53:45.495 [info] > git check-ignore -v -z --stdin [26ms]
2024-02-21 04:53:59.473 [info] > git log --oneline --cherry main...main@{upstream} -- [29ms]
2024-02-21 04:54:00.469 [info] > git pull --tags origin main [991ms]
2024-02-21 04:54:00.469 [info] From https://github.com/kennethlarotyamat/kennethlarotyamat.github.io
 * branch            main       -> FETCH_HEAD
2024-02-21 04:54:07.147 [info] > git add -A -- . [176ms]
2024-02-21 04:54:07.317 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [168ms]
2024-02-21 04:54:07.342 [info] > git config --get commit.template [23ms]
2024-02-21 04:54:07.373 [info] > git config --get commit.template [28ms]
2024-02-21 04:54:07.375 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
2024-02-21 04:54:07.405 [info] > git status -z -uall [28ms]
2024-02-21 04:54:07.444 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
2024-02-21 04:54:07.474 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
2024-02-21 04:54:29.102 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [25ms]
2024-02-21 04:54:29.105 [info] > git show --textconv :misc/project-91/project-91/src/script.js [30ms]
2024-02-21 04:54:29.159 [info] > git cat-file -s 78c80c29e9a67b130bbb96a5007020681cca79d5 [55ms]
2024-02-21 04:54:33.260 [info] > git check-ignore -v -z --stdin [25ms]
2024-02-21 04:54:34.701 [info] > git show --textconv :misc/project-91/project-91/dist/script.js [28ms]
2024-02-21 04:54:34.702 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\dist\script.js [26ms]
2024-02-21 04:54:34.731 [info] > git cat-file -s de46746d33bea9f0b36faba135cee5695a4b8701 [27ms]
2024-02-21 04:54:36.582 [info] > git push origin main:main [29173ms]
2024-02-21 04:54:36.582 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date
2024-02-21 04:54:36.618 [info] > git config --get commit.template [33ms]
2024-02-21 04:54:36.621 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
2024-02-21 04:54:36.651 [info] > git status -z -uall [28ms]
2024-02-21 04:54:36.708 [info] > git config --get commit.template [42ms]
2024-02-21 04:54:36.718 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [49ms]
2024-02-21 04:54:36.758 [info] > git status -z -uall [37ms]

> git push origin main:main
error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date

I don't know I guess it's a bad connection or something

*/