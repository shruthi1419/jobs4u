Feature: Login page Automation of JOBSUPPORT4U Application
 Scenario: check login is successfull with valid creds
 Given User on login page
 When User enters valid EmailAddress and Password
 And clicks on login Button
 Then User is navigated to Home Page
 And close the Browser
