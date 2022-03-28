#Autor: Maileth Rivero Palacio

  @stories

  Feature: User registration on the Utest page

    @scenario
    Scenario: Mays registration on the Utest website

      Given May wants to register on the Utest website
      When enter all requested information
      |strFirstName |strLastName|strEmail          |strMonthBirth| strDayBirth | strYearBirth | strCity   | strZip |strCountry|strPC  |strVersionPC|strLenguagePC|strMobil|strModelMobil|strSOMobil|strPassword |
      |Mai          | Rivero    |may507@gmail.com  | July        | 30          | 1990         | Bogota    | 100001 |Canada    |Windows|10          |Spanish      |Apple   |iPhone 11    |iOS 13    |1Mariposa9  |
      Then  registration is successfully completed
      |strFinishText |
      |Complete Setup|