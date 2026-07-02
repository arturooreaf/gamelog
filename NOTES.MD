## GameController - RestController
@RestController = esta clase responde peticiones HTTP con datos (no vistas HTML)

Constructor con GameRepository = inyección de dependencias:
Spring me da automáticamente la implementación (@Repository) sin que yo la cree con "new"
## Spring Boot - Verbos HTTP
- GET = leer datos (no modifica nada). Ej: @GetMapping("/games") -> findAll()
- POST = enviar datos nuevos para guardar. Ej: @PostMapping("/games") -> save()

## @RequestBody
Convierte el JSON que llega en una petición en un objeto Java real.
Ej: si mandan {"titulo": "X"}, Spring crea un objeto con ese dato ya puesto.

## Repaso rápido
GET  -> pido información
POST -> mando información nueva
@PostMapping("/games") -> POST = enviar información nueva (save)
@RequestBody = convierte el JSON en objeto Java real