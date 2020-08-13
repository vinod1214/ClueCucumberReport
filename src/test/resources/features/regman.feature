Feature: Regression Manager Tests	 			
    
    @Scenario2
    Scenario: Regression Manager Add
    	 Given user was provided with suites manager window
    	 Then user expand tree node
    	 Then user expand tree node13
    	 Then user will drag and drop mrl

    @Scenario3
    Scenario: Regression Manager Remove
       Given user provided with suites manager window
       Then user expand run testMrl suite tree node
       Then user select and remove mrl from suite

