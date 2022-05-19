Feature: yo como usuario necesito usar el filtro en la opcion de sales para realizar una consulta

  Scenario: busqueda filtro exitoso
    Given Se ingresa a la pagina web de opencart
    When Iniciar sesion, luego entrar en el apartado de Sales
    Then Se observa el filtro de busqueda en returns
