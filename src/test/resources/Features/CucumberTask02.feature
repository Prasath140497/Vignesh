Feature: Verifying Adactin Search Hotel Page in details

  Scenario Outline: Verifying Adactin Search Hotel Page details with vaild credentials
    Given User Should on the Adactin Hotel Login page
    When User Should Login "<username>" and "<password>"
    Then User Should Click login
    And User Should Search "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>"and"<Children per Room>"
    And User Should Click Search Button

    Examples: 
      | username     | password    | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Prasath14    | 83594P      | paris    | Hotel Creek | Double    | 1 - One         | 21/06/2022    | 21/06/2022     | 1 - One         | 1 - One           |
      | Prasath14    | 83594P      | london   | Hotel Creek | Double    | 1 - One         | 21/06/2022    | 21/06/2022     | 1 - One         | 2 - Two           |
      | Prasath14    | 83594P      | paris    | Hotel Hervey| Deluxe    | 2 - Two         | 21/06/2022    | 21/06/2022     | 2 - Two         | 1 - One           |
      | Prasath14    | 83594P      | paris    | Hotel Creek | Double    | 1 - One         | 22/06/2022    | 23/06/2022     | 1 - One         | 2 - Two           |
      | Prasath14    | 83594P      | london   | Hotel Hervey| Deluxe    | 1 - One         | 21/06/2022    | 21/06/2022     | 2 - Two         | 1 - One           |
      | Prasath14    | 83594P      | paris    | Hotel Creek | Double    | 2 - Two         | 24/06/2022    | 25/06/2022     | 1 - One         | 1 - One           |
      | Prasath14    | 83594P      | paris    | Hotel Creek | Double    | 1 - One         | 21/06/2022    | 21/06/2022     | 1 - One         | 2 - Two           |
      | Prasath14    | 83594P      |new york  | Hotel Creek | Deluxe    | 2 - Two         | 21/06/2022    | 21/06/2022     | 2 - Two         | 1 - One           |
      | Prasath14    | 83594P      | paris    | Hotel Creek | Double    | 1 - One         | 21/06/2022    | 21/06/2022     | 1 - One         | 1 - One           |
      | Prasath14    | 83594P      | paris    | Hotel Creek | Double    | 1 - One         | 21/06/2022    | 21/06/2022     | 1 - One         | 1 - One           |
