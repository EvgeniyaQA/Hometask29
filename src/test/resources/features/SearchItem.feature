
# here is a comments
  #below is a tag for identifying of specific tests
  @first-TestCase
  Feature: Open ebay.com
    As a client I want to open ebay.com
    and navigate to Electronics menu
    and navigate to Advanced search
    and enter "obag" word into search field
    Scenario: Search all obag items by entering obag words into Advanced search field
      Given I am on the Home Page "https://www.ebay.com" of our site
      When I move to the menu
      | Menu          |
      | Electronics   |
      | Fashion       |
      And click on "Camera Drones" link
      And user clicks on "Advanced" link
      And user enters words "obag" into "Search" field

      Then I should get the list of OBag items "List"


