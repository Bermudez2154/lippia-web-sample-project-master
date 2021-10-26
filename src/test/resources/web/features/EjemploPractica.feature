Feature: Practicas del 14/10


  @Smoke
  Scenario Outline:: Usuario busca en campo "Search"
    Given el usuario navega a la web de Automation Practice
    When Usuario busca <datos>
    Then Usuario verifica resultado correctamente
    Examples:
      | datos                     |
      | Printed Chiffon Dress     |

  @Smoke
  Scenario Outline: El usuario navega a "Sign in"
    Given el usuario navega a la web de Automation Practice
    When el usuario pulsa el botón "Sign in"
    And el usuario ingresa datos <usuario> y <pass>
    Then el usuario verifica que se enseña la pagina My account
    Examples:
      | usuario                       | pass     |
      | comafiauditorqa@hotmail.com   | academy  |

  @Smoke
  Scenario Outline:: Usuario busca en campo "Search" y ordena de menor a mayor
    Given el usuario navega a la web de Automation Practice
    When Usuario busca <datos>
    And usuario ordena productos
    Then Usuario verifica resultado correctamente
    Examples:
      | datos                     |
      | Printed Chiffon Dress     |
