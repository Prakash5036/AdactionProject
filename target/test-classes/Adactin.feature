Feature: Book the Hotel using POM

  Scenario Outline: Login to the Adactin website
    Given Lauch the browser
    When Enter the "<userName>" and "<password>"
    And Click the login
    And Book the hotels "<location>","<hotels>","<room_type>","<adult_room>","<child_room>"
    And Click the search button
    Then Check the booking status sucessfully or not

    Examples: 
      | userName        |  | password |  | location |  | hotels         |  | room_type |  | adult_room |  | child_room |
      | Prakash21031990 |  | 6IC187   |  | London   |  | Hotel Sunshine |  | Double    |  | 2 - Two    |  | 3 - Three  |
