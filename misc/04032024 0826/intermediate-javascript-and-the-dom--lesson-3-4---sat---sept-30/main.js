// Import team data from JSON file
import team from './team.json' assert { type: 'json' }


// Get all DOM elements
const noIssuesMsg = document.getElementById('no-issues-msg')
const issuesListElement = document.getElementById('active-issues__list')
const teamListElement = document.getElementById('team-members__list')
const issueAssignSelect = document.getElementById('assign-to')
const form = document.getElementById('add-issues-form')
const issueSummary = document.getElementById('issue-summary')
const issueDescription = document.getElementById('issue-description')
const dateAssigned = document.getElementById('date-assigned')
const dueDate = document.getElementById('due-date')
const assignTo = document.getElementById('assign-to')
const issuePriority = document.getElementById('issue-priority')
const issueStatus = document.getElementById('issue-status')
const feedbackElements = document.querySelectorAll('.feedback')
const formSubmit = document.getElementById('modal-save-changes')
const modalDismissBtns = document.querySelectorAll('button:not(#modal-save-changes)[data-mdb-dismiss="modal"]')
const clearIssuesBtn = document.querySelector('.clear-issues-btn')


// Child elements of 'team-members__list' as an array
const teamListContents = [ ...teamListElement.children ]

// Team data from JSON file as an array
const teamDataFromJSON = Object.values(team)

/*
  Assign the value of each form field's 'id' attribute to variables, 
  then store the variables in an object
*/
const issueSummaryId = issueSummary.id
const issueDescriptionId = issueDescription.id
const assignToId = assignTo.id
const issuePriorityId = issuePriority.id
const issueStatusId = issueStatus.id
const dateAssignedId = dateAssigned.id
const dueDateId = dueDate.id

const formInputs = {
  [issueSummaryId]: {
    notEmpty: false,
    sanitizedValue: ''
  },
  [issueDescriptionId]: {
    notEmpty: false,
    sanitizedValue: ''
  },
  [assignToId]: {
    notEmpty: false,
    sanitizedValue: ''
  },
  [issuePriorityId]: {
    notEmpty: false,
    sanitizedValue: ''
  },
  [issueStatusId]: {
    notEmpty: false,
    sanitizedValue: ''
  },
  [dateAssignedId]: {
    notEmpty: false,
    sanitizedValue: ''
  },
  [dueDateId]: {
    notEmpty: false,
    sanitizedValue: ''
  }
}

/*
  Hydrate (load) all team details elements from team data in localStorage,
  create <option> elements for each team member and append them as children
  to the "Assign To" <select> element in the form
*/
const hydrateTeamElementsDOM = () => {
  const teamData = getTeamData()

  if (teamListContents.length === teamData.length) {
    teamData.forEach((teamMember, index) => {
      teamListContents[index].id = teamMember.id
      teamListContents[index].children[0].src = teamMember.imgSrc
      teamListContents[index].children[1].textContent = `${teamMember.firstName} ${teamMember.lastName}`
      teamListContents[index].children[2].children[0].textContent = teamMember.issuesAssigned.toString()

      const option = document.createElement('option')
      option.id = teamMember.id
      option.value = `${teamMember.firstName} ${teamMember.lastName}`
      option.textContent = `${teamMember.firstName} ${teamMember.lastName}`
    
      issueAssignSelect.appendChild(option)
    })
  }
}

/*
  Initialize localStorage with an entry for issues, and an entry for the team members 
  (both arrays)
*/
const initDataStorage = () => {
  if (!localStorage.getItem('issueLogger.issues')) {
    localStorage.setItem('issueLogger.issues', '[]')
  } else {
    updateActiveIssuesDOM()
  }

  if (
      !localStorage.getItem('issueLogger.team') || 
      localStorage.getItem('issueLogger.team') === '[]'
    ) {

    localStorage.setItem('issueLogger.team', JSON.stringify(teamDataFromJSON))
  }
}

// Get all active issues from localStorage
const getActiveIssues = () => {
  const issues = JSON.parse(localStorage.getItem('issueLogger.issues') || "[]")
  
  return issues
}

// Get all team data from localStorage
const getTeamData = () => {
  const team = JSON.parse(localStorage.getItem('issueLogger.team') || "[]")
  
  return team
}

// Update active issues data in localStorage when a new issue is added
const updateActiveIssues = (issue) => {
  const issues = JSON.parse(localStorage.getItem('issueLogger.issues') || "[]")

  while (!issue.id) {
    const issueID = Math.floor(Math.random() * 99999)

    if (issues.find((item) => item.id === issueID)) {
      continue
    } else {
      issue.id = issueID
    }
  }

  const issueWithId = issue

  issues.push(issueWithId)
  localStorage.setItem('issueLogger.issues', JSON.stringify(issues))

  return issueWithId
}


// Update all DOM nodes related to active issues both when a new issue is added
// and when the page is reloaded
const updateActiveIssuesDOM = (newIssueId) => {
  const issues = getActiveIssues()
  let newIssue

  
  if (issues.length > 0 && newIssueId) {
    noIssuesMsg.style.display = "none"
    noIssuesMsg.parentElement.style.justifyContent = "flex-start"
    if (issues[issues.length - 1].id === newIssueId) {
  
      newIssue = issues[issues.length - 1]
  
    } else {
      newIssue = issues.find((issue) => {
        return issue.id === newIssueId
      })
    }

    const placeholderElement = document.createElement('div')
    const template = issueCardTemplate(newIssue)

    issuesListElement.appendChild(placeholderElement)

    placeholderElement.outerHTML = template
    

  } else if (issues.length > 0 && !newIssueId) {
    noIssuesMsg.style.display = "none"
    noIssuesMsg.parentElement.style.justifyContent = "flex-start"


    issues.forEach((issue) => {
      const placeholderElement = document.createElement('div')
      const template = issueCardTemplate(issue)
  
      issuesListElement.appendChild(placeholderElement)
  
      placeholderElement.outerHTML = template
    })

  } 
}

// Delete all issue card elements from the DOM when issues data gets cleared
const deleteActiveIssuesDOM = () => {
    const nodesForDeletion = [ ...issuesListElement.children ].slice(1)

    nodesForDeletion.forEach((node) => {
      issuesListElement.removeChild(node)
    })

    noIssuesMsg.style.display = "block"
    noIssuesMsg.parentElement.style.justifyContent = "center"

}



// CONTINUE WRITING YOUR CODE BELOW

// Update team data in localStorage
const updateTeamData = (assignedTeamMember) => {
  const teamData = getTeamData()


  const index = getTeamData().findIndex(
    (teamMember) => assignedTeamMember === `${teamMember.firstName} ${teamMember.lastName}`
  )


  if (assignedTeamMember) {
    teamData[index].issuesAssigned++
  } else {
    teamData.forEach((teamMember) => teamMember.issuesAssigned = 0)
  }


  localStorage.setItem('issueLogger.team', JSON.stringify(teamData))
}



// Update issues count for a team member when a new issue is added or when the issues data gets cleared
const updateTeamDataDOM = (assignedTeamMember) => {
  const teamData = getTeamData()


  const index = getTeamData().findIndex(
    (teamMember) => assignedTeamMember === `${teamMember.firstName} ${teamMember.lastName}`
  )


  if (assignedTeamMember) {
    teamListContents[index].children[2].children[0].textContent = teamData[index].issuesAssigned.toString()
  } else {
    teamListContents.forEach((node) => node.children[2].children[0].textContent = 0)
  }
}


/*
  Create a string template for the issue card that will get added to the DOM
  when an issue is created
*/
const issueCardTemplate = (issue) => `
  <div class="card">
    <div class="card-body issue">
      <div class="issue-card-segment issue-id">
        <div class="issue-id__heading" >Issue ID: </div>
        <div class="issue-id__value">${issue.id}</div>
      </div>
      <div class="issue-card-segment issue-summary">
        <div class="issue-id__heading" >Summary: </div>
        <div class="issue-id__value issue-summary">${issue.issueSummary}</div>
      </div>
      <div class="issue-card-segment issue-priority">
        <div class="issue-id__heading" >Priority: </div>
        <div class="issue-id__value">${issue.issuePriority}</div>
      </div>
      <div class="issue-card-segment issue-status">
        <div class="issue-id__heading" >Status: </div>
        <div class="issue-id__value">${issue.issueStatus}</div>
      </div>
      <div class="issue-card-segment issue-assigned-date">
        <div class="issue-id__heading" >Date Assigned: </div>
        <div class="issue-id__value">${issue.dateAssigned}</div>
      </div>
      <div class="issue-card-segment issue-due-date">
        <div class="issue-id__heading" >Due Date: </div>
        <div class="issue-id__value">${issue.dueDate}</div>
      </div>
      <div class="issue-card-segment issue-asignee">
        <div class="issue-id__heading" >Assigned To: </div>
        <div class="issue-id__value">${issue.assignTo}</div>
      </div>
    </div>
  </div>
`.trim()




// Define functions to handle displaying or hiding the validation message
const setInputInvalidState = (input, msg) => {
  input.parentElement.parentElement.nextElementSibling.style.display = "block"
  input.parentElement.parentElement.nextElementSibling.innerHTML = msg
}

const setInputValidState = (input) => {
  input.parentElement.parentElement.nextElementSibling.style.display = "none"
  input.parentElement.parentElement.nextElementSibling.innerHTML = ""
}


// Create a function to check the input value from the provided input field
const checkInput = (e) => {
  const validation = runValidation(e.value)
  let id = e.getAttribute('id')

  if (!validation.valid) {
    setInputInvalidState(e, validation.msg)
    formInputs[id].notEmpty = false
    return false
  } else {
    setInputValidState(e)
    formInputs[id].notEmpty = true

    return true
  }
}


// Create helper function to check validity of the provided input value using the Validator.js package
const runValidation = (inputValue) => {
  if (!validator.isEmpty(inputValue)) {
    return {
      valid: true,
      msg: null
    }
  } else {

    if (validator.isEmpty(inputValue)) {
      return {
        valid: false,
        msg: "Required"
      }
    } else {
      return {
        valid: false,
        msg: "Input invalid"
      }
    }
  }
}


// Create a function to check if all inputs are valid, then enable submit button
const enableSubmitIfInputsValid = () => {
  const allInputsValid = Object.keys(formInputs).every((input) => formInputs[input].notEmpty === true)


  if (allInputsValid) {
    formSubmit.removeAttribute('disabled')
  } else {
    formSubmit.setAttribute('disabled', '')
  }
}




// Create function to handle the "blur" event of form unputs
const handleFieldBlur = (e) => {
  if (checkInput(e)) {
    const sanitizedInput = DOMPurify.sanitize(e.value)
    const trimmedInput = validator.trim(sanitizedInput)
    const escapedInput = validator.escape(trimmedInput)


    formInputs[e.id].sanitizedValue = escapedInput
    enableSubmitIfInputsValid()
  }
}


// Create function to handle the "input" event of form unputs
const handleFieldInput = (e) => {
  if (checkInput(e)) {
    enableSubmitIfInputsValid()
  }
}


// Create function to handle the "click" event of modal close buttons
const handleModalClose = (e) => {
  form.reset()
  feedbackElements.forEach((el) => el.style.display = "none")
  formSubmit.setAttribute('disabled', '')
}


// Clear all active issues
const clearActiveIssues = () => {
  localStorage.setItem('issueLogger.issues', '[]')
  updateTeamData()
  updateTeamDataDOM()
  deleteActiveIssuesDOM()
}


// Create function to handle the submit event on the form
const handleSubmit = (e) => {
  e.preventDefault()


  const issue = {
    issueSummary: formInputs[issueSummaryId].sanitizedValue,
    issueDescription: formInputs[issueDescriptionId].sanitizedValue,
    assignTo: formInputs[assignToId].sanitizedValue,
    issuePriority: formInputs[issuePriorityId].sanitizedValue,
    issueStatus: formInputs[issueStatusId].sanitizedValue,
    dateAssigned: formInputs[dateAssignedId].sanitizedValue,
    dueDate: formInputs[dueDateId].sanitizedValue
  }

  const issueWithId = updateActiveIssues(issue)
  updateActiveIssuesDOM(issueWithId.id)

  updateTeamData(issueWithId.assignTo)
  updateTeamDataDOM(issueWithId.assignTo)

  form.reset()
  formSubmit.setAttribute('disabled', '')
}

/*
   Check if DOM's readyState is "complete", then call the initDataStorage
   and hydrateTeamElementsDOM functions
*/
document.onreadystatechange = (e) => {
  if (document.readyState === "complete") {
    initDataStorage()
    hydrateTeamElementsDOM()
  }
}

// Attach all event listeners
clearIssuesBtn.addEventListener('click', clearActiveIssues)


modalDismissBtns.forEach((btn) => btn.addEventListener('click', handleModalClose))


issueSummary.addEventListener('input', (e) => handleFieldInput(e.target))
issueSummary.addEventListener('blur', (e) => handleFieldBlur(e.target))


issueDescription.addEventListener('input', (e) => handleFieldInput(e.target))
issueDescription.addEventListener('blur', (e) => handleFieldBlur(e.target))


assignTo.addEventListener('input', (e) => handleFieldInput(e.target))
assignTo.addEventListener('blur', (e) => handleFieldBlur(e.target))


dateAssigned.addEventListener('input', (e) => handleFieldInput(e.target))
dateAssigned.addEventListener('blur', (e) => handleFieldBlur(e.target))


dueDate.addEventListener('input', (e) => handleFieldInput(e.target))
dueDate.addEventListener('blur', (e) => handleFieldBlur(e.target))


issuePriority.addEventListener('input', (e) => handleFieldInput(e.target))
issuePriority.addEventListener('blur', (e) => handleFieldBlur(e.target))


issueStatus.addEventListener('input', (e) => handleFieldInput(e.target))
issueStatus.addEventListener('blur', (e) => handleFieldBlur(e.target))


form.addEventListener('submit', (e) => handleSubmit(e))