#language: es

  Característica: Inicio de sesion
    Yo como analista de negocio necesito iniciar sesion
    en el sitio web con mis credenciales de acceso.

    @InicioExitoso
  Escenario: Iniciar sesion exitosamente
    Dado que el usuario navega a la pagina de inicio de sesion
    Cuando ingresa las credenciales de acceso correcta
    Entonces deberia ver la pagina principal