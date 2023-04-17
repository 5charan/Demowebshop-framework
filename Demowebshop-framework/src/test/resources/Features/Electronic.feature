 @tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline:  verify Electronics
    Given user open the browser
    When user enter url "<url>"
    Then user Mousehover on the Electronics
    And user click on the Camera and photo
    Then user click any one camera 
    And user click on the Addtocart 
    
    #Scenario: verify the cellphones in Electronics
    #Then user click on the cellphones
    #When user click any one cellphone
    #Then user click ADDcart 