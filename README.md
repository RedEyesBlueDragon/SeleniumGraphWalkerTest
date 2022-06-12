# SeleniumGraphWalkerTest
Selenium Web UI Test with Graphwalker


This project is testing http://automationpractice.com/index.php

There are 4 test case model that can be run with chancing class in Runner.java line 17
Each test model has System.setProperty() method that past must be updated with geckodriver.exe path before execute.

In order to run project command that must run:
 mvn compile "exec:java" "-Dexec.mainClass=com.company.Runner"  


Test cases are shown in firefox window.


LoginTest:
Click sign in.
Two actions that one of them try to login correct data and the other incorrect data.
If login go to account information page.
Then change the username enter password and save.
Finally logout and go two login page.

SearchTest:
Use searchbar and search the keyword "dress".
Select one of the dress from search result page.
Open dress page by clicking more.

BucketTest:
Click sign in.
Login with correct data.
After authorization click dress title and open dresses page.
Select one of the dress and click more to open dress page.
Add selected dress to bucket.

VisitTest:
Click sign in.
Two actions that one of them try to login correct data and the other incorrect data
If login go to account information page.
Select either Credit card slip page or Whishlist page.
After opening selected page go back to account page by clicking their own go to account button.
Loop this procces.
	

