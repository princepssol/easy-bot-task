## Запустить проект:

* `cd hardware-store`
* `./gradlew bootRun`

## Зайти в бд через браузер:

### Адрес
* `localhost:8080/h2-console`

### Креды
* Юзер: `usr`
* Пароль `pass`

## Рабочие эндпоинты
````
---
GET  /computer
GET  /computer/:id
POST /computer
POST /computer/:id
---
GET  /monitor
GET  /monitor/:id
POST /monitor
POST /monitor/:id
---
GET  /memory
GET  /memory/:id
POST /memory
POST /memory/:id
---
GET  /laptop
GET  /laptop/:id
POST /laptop
POST /laptop/:id
````

## Пара слов:
В проекте используется MapStruct и Liquibase.
При старте Liquibase создает БД и проливает туда скрипты.
озадачиваться с новой схемой не стал. 
MapStruct пришлось фиксить для взаимодействия с Lombok, нашел библиотеку, которая фиксит это, но не нравится ее версия 0.2.0.
Стоит поискать другое решение. Не использовал возможности java 17 c records, понимаю зачем они, но лучше писать в таком случае на Kotlin :-) На счет тетсов - не успел. Верхнеуровнево пробежался, вроде работает. Всех кейсов не учел - мало времени.
