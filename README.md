# Tree-Stock-Hecho-en-Java
Sistema de inventario desarrollado en Java utilizando un Árbol Binario de Búsqueda (ABB) para almacenar y organizar productos por su identificador (ID).

## Objetivo
Comprender el funcionamiento de un Árbol Binario de Búsqueda y aplicarlo en el desarrollo de un sistema de inventario capaz de:

- Registrar productos.
- Organizar automáticamente los productos según su ID.
- Mostrar el inventario ordenado.
- Buscar productos de manera eficiente.

## Tecnologías Utilizadas 
- Java
- JDK Oracle
- Visual Studio Code
- Git
- GitHub

## Estructura del Proyecto
<img width="197" height="127" alt="image" src="https://github.com/user-attachments/assets/a4d7fb10-dec0-422b-8174-2ef47ce2718b" />

### Producto.java
Representa cada nodo del árbol.

Atributos:
- ```id```
- ```nombre```
- ```izquierdo```
- ```derecho```

### ArbolInventario.java
Contiene toda la lógica del Árbol Binario de Búsqueda.

Funciones principales:
- Insertar productos.
- Buscar productos por ID.
- Mostrar inventario mediante recorrido Inorden.

### Main.java
Contiene la interfaz de consola.

Opciones disponibles:

1. Registrar Producto
2. Mostrar Inventario
3. Buscar Producto
0. Salir

## Funcionamiento del Árbol
Cuando se registra un producto:
- Si el ID es menor que el nodo actual, se ubica a la izquierda.
- Si el ID es mayor, se ubica a la derecha.
- Si el ID ya existe, el sistema evita registros duplicados.

Ejemplo:
  ```
          50
        /    \
      20      70
     /  \    /  \
   10   30  60   90
  ```
Al ejecutar el recorrido Inorden:
```
  10
  20
  30
  50
  60
  70
  90
```
Los productos se muestran automáticamente ordenados por ID.

## Instrucciones de Ejecución

1. Clonar el repositorio
   ``` git clone https://github.com/DavidZGP/Tree-Stock-Hecho-en-Java ```
2. Entrar a la carpeta
```cd src```
3. Compilar
```javac *.java```
4. Ejecutar
```java Main```

## Evidencias de Funcionamiento
### Menú Principal
<img width="227" height="133" alt="image" src="https://github.com/user-attachments/assets/cf55b74f-6fe7-4fef-aeae-da42d247dbe2" />

### Registro de Productos
<img width="368" height="101" alt="image" src="https://github.com/user-attachments/assets/20bb786d-5870-4d71-a3da-d06a58af6831" />

### Inventario Ordenado
<img width="287" height="162" alt="image" src="https://github.com/user-attachments/assets/46cfdc3d-64fd-4d53-9a2b-2aea45039d04" />

### Búsqueda de Productos
<img width="277" height="98" alt="image" src="https://github.com/user-attachments/assets/a344e6a0-2451-4c1a-8a82-0eedadf3fd1b" />

## Conclusiones
- Se comprendió la estructura y funcionamiento de los Árboles Binarios de Búsqueda.
- Se implementó una estructura dinámica utilizando referencias (punteros) entre nodos.
- Se aplicó el recorrido Inorden para visualizar los productos ordenados.
- Se fortaleció el uso de Git y GitHub para el control de versiones del proyecto.

## Link Video
