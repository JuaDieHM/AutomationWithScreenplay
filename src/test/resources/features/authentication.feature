Feature: Autenticación en Saucedemo
  Yo como usuaria quiero autenticarme en saucedemo.

  @Caso1
  Scenario Outline: Autenticacion exitosa en Saucedemo.
    Given Ella carga la informacion de la compra
    When Ella realiza la autenticacion con <username> y <password> en la plataforma
    Then Ella verifica la autenticacion exitosa

    Examples:
      |username|password|
      |standard_user|secret_sauce|