#### PARTE 4

## Cómo identificar fallos en los logs

Cuando se ejecuta el pipeline, GitHub Actions (o act) va mostrando cada paso en la consola. Si algo falla, normalmente el mensaje queda muy claro porque aparece marcado como ERROR, o el step termina con un mensaje diciendo que salió con código 1.

### Fallos del linter

Normalmente Checkstyle se queja por cosas simples como:

Mala indentación

Nombre de variables incorrecto

Falta de comentarios o formato

El pipeline se detiene ahí mismo porque el linter tiene prioridad y debe pasar limpio.

### Fallos de pruebas unitarias

Failed tests:
SumaTest.testSuma: expected <5> but was <4>  y el resuTests run: X  Failures: 1  Errors: 0  Skipped: 0

### Fallos de cobertura

Rule violated: LINE coverage ratio is 0.72, minimum is 0.80
Esto básicamente significa que las pruebas no cubren suficiente código, entonces el pipeline falla aunque las pruebas pasen.


### Run Fallido

Un run fallido se nota porque GitHub Actions lo marca en rojo y dice “Failed”.
El log se queda detenido exactamente en el paso donde ocurrió el error.

Sale más o menos así:
Error: Rule violated... coverage ratio is lower than allowed
Error: Process completed with exit code 1


### Run exitoso 

Run exitoso

Aquí todos los pasos pasan sin problemas:

Linter ok

Build ok

Pruebas ok

Cobertura ok

Al final sale el mensaje de : Job Succeeded


### PARTE 5

1. Analizan el estilo del código: Nombres muy genéricos, comentarios con una redacción muy parecida en todas las funciones.
2. Analizan la probabilidad del texto: Otros detectores analizan la “naturalidad” del lenguaje. 

¿Por qué no se puede asegurar al 100%?

Porque todas estas herramientas funcionan por probabilidad.
No existe una forma real de saber quién escribió algo, solo estiman qué tan probable es.

### Políticas razonables de uso de IA en la educación

1. Permitir usar IA solo para investigar, no para escribir el código
2. Pedir explicaciones del código