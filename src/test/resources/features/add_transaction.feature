Feature: Add transaction


  Scenario: Add new transaction


    Given Juan ingresa a la aplicacion
      | user | pass |
    When Juan introduce la informacion requerida para la nueva transaccion
      | 12-122025 | 500 | testing |
    Then Juan deberia ver una nueva transaccion con los detalles correcto

  #Shoul see a new transaction in the transaction list with corret details