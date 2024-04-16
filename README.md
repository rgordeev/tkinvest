# Как запустить приложение

Для начала необходимо получить токен АПИ Тинькофф Инвест, это можно сделать в
личном кабинете брокера Тинькофф.

Далее необходимо полученный токен поместить в файл `application.yml` приложения,
расположенный в каталоге 
```
./src/main/resources/application.yml
```
В файле необходимо изменить значение свойства
```
tinkoff:
  starter:
    apiToken:
      fullAccess: <put-api-token-here>
```

После этого необходимо собрать приложение, выполнив 
```
./gradlew clean build
```

Далее следует собрать контейнеры Docker приложения, выполнив
```
docker compose build
```

Затем следует запустить БД, выполнив
```
docker compose up -d postgres
```

Если БД успешно запустилась, можно запустить приложение из IDE или в контейнере,
выполнив
```
docker compose up -d app
```

После запуска приложения, если биржа ММВБ открыта, в БД будут записываться значения
цены токена `SBER` в таблицу `price`.
