---
name: Custom issue template
about: Describe this issue template's purpose here.
title: ''
labels: ''
assignees: ''

---

name: 🧩 Custom Issue
description: Report a bug, request a feature, or ask a question
title: "[Issue]: "
labels: ["needs-review"]
assignees: []

body:
  - type: dropdown
    id: issue-type
    attributes:
      label: Issue Type
      description: What type of issue is this?
      options:
        - Bug
        - Feature Request
        - Documentation
        - Question
    validations:
      required: true

  - type: textarea
    id: description
    attributes:
      label: Description
      description: Clearly describe the issue or request
      placeholder: Explain the problem or idea clearly...
    validations:
      required: true

  - type: textarea
    id: steps
    attributes:
      label: Steps to Reproduce (if applicable)
      description: Help us reproduce the issue
      placeholder: |
        1. Go to...
        2. Click on...
        3. See error...
    validations:
      required: false

  - type: textarea
    id: expected
    attributes:
      label: Expected Outcome
      description: What did you expect to happen?
    validations:
      required: false

  - type: textarea
    id: additional
    attributes:
      label: Additional Information
      description: Logs, screenshots, references, or suggestions
    validations:
      required: false

  - type: checkboxes
    id: agreement
    attributes:
      label: Code of Conduct
      options:
        - label: I agree to follow this project's Code of Conduct
          required: true
