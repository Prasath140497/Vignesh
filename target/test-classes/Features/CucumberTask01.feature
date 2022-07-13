Feature: Verifying Adactin Hotel Login Details

  Scenario Outline: verifying Adactin Hotel Login details with valid credentials
    Given user is on Adactin Hotel Login Page
    When user should login "<username>","<password>"
    And user Should click login "Hello Prasath14"

    Examples: 
      | username  | Password |
      | Prasath14 | 83594P   |

  Scenario Outline: verifying Adactin Hotel Search details with valid credentials
    Given user is on Adactin Hotel search Page on after successfully login
    And user should search Hotel"<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrenPerRoom>"
    And user should click on search button
    Then user should verify valid credentials after search "select Hotel"

    Examples: 
      | Location | Hotel        | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | London   | Hotel Hervey | Double    | 2-Two           | 21/06/2022    | 22/06/2022     | 1- One          | 0 - None          |

  Scenario Outline: verifying Adactin Hotel SelectHotel details with valid credentials
    Given user is on Adactin Hotel SelectHotel Page on after successfully Search Hotel
    And user should Select Hotel"<select>","<hotelName">,"<location>", "<rooms>","<arrivalDate>","<departureDate>","<no.OfDays>","<roomsType>","<pricePerNight>"and"<totalPrice(excl. GST)>"
    And user should click on Continue button
    Then user should verify valid credentials after search "Book a Hotel"

    Examples: 
      | Select   | 	Hotel Name   | Room Type |  Rooms     | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      |          |  Hotel Creek  | Sydney    |1 Rooms     | 21/06/2022    | 22/06/2022     | 1- One          | 0 - None          |
