# calidad-ci

## Investigacion

¿Qué es act?

Act es una herramienta que permite ejecutar localmente los workflows de GitHub Actions sin necesidad de subir commits al repositorio.
Funciona emulando el entorno d  e GitHub Actions mediante contenedores Docker, por lo que se puede probar el pipeline de CI en la máquina local antes de enviarlo al repositorio remoto.

---------------------------------------
¿Para qué sirve en este proyecto?


Verificar que el workflow .github/workflows/ci-quality.yml funciona correctamente.

Probar fallos de linter, pruebas o cobertura sin esperar al servidor de GitHub.

Mostrar evidencia de ejecución local si el profesor lo solicita.
-----------------------------------------
Requisitos para usar act

Para que act funcione, la máquina debe tener:

1. Docker instalado

act usa contenedores Docker para replicar el ambiente de GitHub Actions.


2. Tener el workflow en la carpeta correcta
.github/workflows/ci-quality.yml
-----------------------------------------
Instalar act
-----------------------------------------
Comando para ejecutar el workflow localmente: act -W .github/workflows/ci-quality.yml

## Estructura
- `src/main/java/...` : código fuente
- `src/test/java/...` : tests JUnit
- `src/main/resources/checkstyle.xml` : reglas de Checkstyle
- `pom.xml` : configuración Maven (Checkstyle, JaCoCo, Surefire)
- `.github/workflows/ci-quality.yml` : workflow de GitHub Actions

## Requisitos locales
- Java 21 (JDK)
- Maven 3.8+
- Docker (para ejecutar `act` localmente, ver más abajo)

## Comandos útiles (local)
- Ejecutar Checkstyle:
```bash
mvn checkstyle:check
