#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Government form and V1 Training Form and  Datadriven testing for the form


  
  
  @tag2
  Scenario Outline: Title of your scenario outline
    Given user is open the chrome browser and navigate to the govt form
    When user is entering Account information like "<Username>","<Email>"
    And user is entering Personal Information like "<First_Name>", "<Last_Name>"
    And  select the dropdowns user is entering pin code "<PIN_Code>" 
    And  select the dropdown as education
    And  click on check box and write a text "<text>" 
    And click on the create new account button 
    Then error msg should be displayed
    
    

    Examples: 
      | Username  | Email          | First_Name  | Last_Name  | PIN_Code | text           |
      | Nethra    | N@gmail.com    | Nethra      | R        	| 234567	 | Hello hi		  	|
      | megha     | M@gmail.com    | Meghi       | R        	| 234565	 | Hello how r u	|
      | jansi     | J@gmail.com    | janu        | R        	| 234566	 | Hello	hello		|
      | druva     | D@gmail.com    | duvi        | R        	| 234564	 | Hello	hiii		|
      | sweety    | S@gmail.com    | sweet       | R        	| 234568	 | Hello	hi			|
      
      
    
  

  @tag1
  Scenario: To Verify the simple form
    Given User Opens the browser and navigate to v1 training form website
    When User Enters Firstname, Last name, Email
    And Contact Number, Message
    And Users clicks on Submit
    Then A Confirmation popup is Displayed
    
    
    
     @tag2
  Scenario Outline: Title of your scenario outline
    Given User Opens the chrome browser and navigate to form website 
    When User is entering "<Firstname>", "<Lastname>", "<Email>"
    And user is entering  "<Number>", "<Message>"
    And clicking on submit button 
    Then All the data enetered successfully

    Examples: 
      | Firstname  | Lastname | Email                  | Number      | Message  |
      | Nethra     |  R       | nethrar1111@gmail.com  | 9786543201  | Hi       |
      | raj        |  r       | nethrar2222@gmail.com  | 9786673201  | Hi raj   |
      | Nethravathi|  s       | nethrar3333@gmail.com  | 9788543201  | Hi ram   |
      | Nethraraj  |  R       | nethrar4444@gmail.com  | 9787543201  | Hi nethra|
      | *******    |  R       |&*99999*M               | @#$#@       | Hi nethra|
      
      
      
      
