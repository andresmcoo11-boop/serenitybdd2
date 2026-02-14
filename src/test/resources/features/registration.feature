Feature: Registration

  Scenario Outline: successful registration

    Given Juan wants to sign up in the application
   When  Juan step sends the required information to sing up

     | <name> | <Last name> | <age> | <email> | <country> |
   Then  Juan should have a new accont created

   Examples:

     | name   | Last name | age | email       | country  |
      | Andres | Morales   | 28  | example@123 | Colombia |
     | Julian | Perea     | 15  | perea@123   | Colombia |


  Scenario: Missing requiered fields for registration

    Given Juan wants to sign up in the application
    When Juan does not dent the required information
    Then Juan should be told all fields are requiered



