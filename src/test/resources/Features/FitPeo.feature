Feature: FitPeo

 Scenario: Adjust the Slider
    When Navigate to the "Revenue Calculator" Page
    Then Scroll to revenue calculator slider
    When Enter the value 560 in the text field
    Then verify slider's position is updated to 560.
    When Adjust the slider to 820
    Then bottom text field value should be updated to 820
    When select the checkboxes
      | Checkboxes |
      | CPT-99091  |
      | CPT-99453  |
      | CPT-99454  |
      | CPT-99474  |
    Then Verify that the header displaying "Total Recurring Reimbursement for all Patients Per Month: $110700"
 
 