# Sistema de Gestión Hotelera

Este proyecto consiste en el desarrollo de un sistema de gestión hotelera utilizando Java y aplicando los principios de Programación Orientada a Objetos (POO). El sistema permite registrar diferentes tipos de habitaciones, calcular costos de hospedaje y generar facturas de manera automática.

---

## Descripción

El programa trabaja mediante consola y permite ingresar información de distintas habitaciones (simple, suite y familiar), almacenarlas en una lista y procesar sus datos para mostrar detalles y generar facturación.

Se aplican conceptos importantes como herencia, polimorfismo, clases abstractas, sobrecarga y encapsulamiento.

---

## Funcionalidades

* Registro de habitaciones desde consola
* Manejo de tres tipos de habitaciones:
    - Habitación Simple
    - Suite
    - Habitación Familiar
* Cálculo automático del hospedaje
* Aplicación de descuentos y recargos
* Generación de facturas con IVA
* Uso de lista para manejar múltiples reservas
* Modificación de atributos mediante setters

---

## Conceptos aplicados

* Clases abstractas
* Herencia
* Polimorfismo
* Sobrescritura (`@Override`)
* Sobrecarga de métodos
* Encapsulamiento

---

## Estructura del proyecto

* `Habitacion` → clase abstracta base
* `HabitacionSimple` → clase hija
* `Suite` → clase hija
* `HabitacionFamiliar` → clase hija
* `Main` → ejecución del programa

---

## Ejecución

1. Compilar el proyecto en un entorno Java (IntelliJ, NetBeans o consola).
2. Ejecutar la clase `Main`.
3. Ingresar los datos solicitados.
4. Visualizar el detalle y la factura generada.

---

## UML

El proyecto incluye un diagrama UML donde se representa la relación entre la clase abstracta y sus clases hijas, mostrando la aplicación de herencia y polimorfismo.

---

## Notas

* Se utilizaron setters para modificar atributos durante la ejecución, tal como se solicitó en el ejercicio.
* El sistema está diseñado para ser escalable, permitiendo agregar nuevos tipos de habitaciones en el futuro.

---

## Autor

Trabajo realizado como parte del repaso de Programación Orientada a Objetos.
