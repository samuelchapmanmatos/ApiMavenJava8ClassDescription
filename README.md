Compilamos el proyecto y lo ejecutamos por cmd
1-En Eclipse importar el proyecto.
2-Clic File
3-Clic Import 
4-Dar clic en Maven
5-Seleccionar la carpeta del proyecto 
6-Existing maven projects
7-Clic Browse y seleccionar la carpeta donde esta el proyecto.
8-Seleccionar la casilla donde dice /pom.xml
9-Click finis
10-clic secundario en el proyecto lecturaclasssamuelchapmanmatos
11-clic en java
12-click en runnable JAR file
13-click en next
14-seleccionar la clase LecturaclasssamuelchapmanmatosApplicaton
15-seleccionar la opción extract required libraries into generated JAR
16-click finis
17-click ok
18-click ok
19-ingresamos a la carpeta del proyecto y abrimos cmd en esta ruta
20-entramos por cmd a la carpeta target
21-Escribimos java -jar lecturaclasssamuelchapmanmatos-0.0.1-SNAPSHOT.jar
22-damos enter

Uso del servicio o Api Rest en Postman o su provador de servicios de su preferencia
Método lecturaclass post
http://localhost:8080/lecturaclass
Enviar:
{
"routelocalandnamefile":"C:\\texto.txt"
}
Devuelve:
[
    {
        "clMetodo": "",
        "clName": "Person",
        "clVari": "",
        "clScope": "public",
        "clSignature": "",
        "clDescription": "",
        "clConstructor": "Person",
        "clAtributo": "",
        "clMParams": ""
    },
    {
        "clMetodo": "",
        "clName": "",
        "clVari": "A",
        "clScope": "private",
        "clSignature": "int",
        "clDescription": "",
        "clConstructor": "",
        "clAtributo": "year",
        "clMParams": ""
    },
    {
        "clMetodo": "getOlder",
        "clName": "",
        "clVari": "M",
        "clScope": "public",
        "clSignature": "void",
        "clDescription": "",
        "clConstructor": "",
        "clAtributo": "",
        "clMParams": "(int year)"
    },
    {
        "clMetodo": "eat",
        "clName": "",
        "clVari": "M",
        "clScope": "public",
        "clSignature": "String",
        "clDescription": "",
        "clConstructor": "",
        "clAtributo": "",
        "clMParams": "()"
    },
    {
        "clMetodo": "eat",
        "clName": "",
        "clVari": "M",
        "clScope": "public",
        "clSignature": "String",
        "clDescription": "",
        "clConstructor": "",
        "clAtributo": "",
        "clMParams": "(String food)"
    },
    {
        "clMetodo": "eat",
        "clName": "Person",
        "clVari": "M",
        "clScope": "public",
        "clSignature": "String",
        "clDescription": "",
        "clConstructor": "Person",
        "clAtributo": "",
        "clMParams": "(String food)"
    }
]


Retorno de objeto a enviar para metodo get save
http://localhost:8080/save

Devuelve :
{
    "datetime": "Fecha07042023",
    "ruta": "C:\\Users\\Dell\\Downloads\\",
    "information": "Este es el texto de prueba para ver que debo enviar!"
}

Formato para metodo savearchivos post
http://localhost:8080/savearchivos
Enviar:
{
    "datetime": "Fecha07042023",
    "ruta": "C:\\Users\\Dell\\Downloads\\",
    "information": "Este es el texto de prueba para ver que debo enviar!"
}
Devuelve:
[
    "Response",
    "Archivo creado exitosamente!"
]
OR
[
    "Response",
    "Archivo ya existe!"
]

