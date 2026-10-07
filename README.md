# Laboratorio Android - Navegabilidad con ListView y Adapters

## Objetivo
Comprender los mecanismos disponibles para diseñar la navegabilidad de una aplicación Android.

## Propuesta de navegación

La aplicación propuesta corresponde a un sistema de **Gestión de Encomiendas**.

Siguiendo la clasificación del material del laboratorio, la navegación se divide en tres niveles:

### 1. Top-level activity
`TopLevelActivity`

Es la pantalla principal de la aplicación y contiene las opciones más importantes:

- Encomiendas
- Remitentes
- Destinatarios

La navegación se presenta mediante un `ListView`.

### 2. Category activity
`CategoryActivity`

Cuando el usuario selecciona una opción en la pantalla principal se abre una actividad de categoría.

Ejemplos:

- Encomiendas → lista de encomiendas
- Remitentes → lista de remitentes
- Destinatarios → lista de destinatarios

La lista se carga utilizando un `ArrayAdapter`.

### 3. Detail/edit activity
`DetailActivity`

Cuando el usuario selecciona un elemento de una categoría se abre una pantalla con la información detallada del registro.

Ejemplo de flujo:

```text
TopLevelActivity
│
├── Encomiendas
│   ├── ENV-001
│   ├── ENV-002
│   └── ENV-003
│
├── Remitentes
│   ├── Laura Gómez
│   ├── Carlos Rodríguez
│   └── Andrea Martínez
│
└── Destinatarios
    ├── Juan Pérez
    ├── María Torres
    └── Sofía Hernández
```

El flujo general es:

```text
TOP-LEVEL
   ↓
CATEGORY
   ↓
DETAIL / EDIT
```

## Elementos utilizados

- `ListView`
- `ArrayAdapter`
- `setOnItemClickListener`
- `Intent`
- `putExtra`
- Tres `Activity`
- Layouts XML independientes

## Archivos principales

```text
TopLevelActivity.java
CategoryActivity.java
DetailActivity.java

activity_top_level.xml
activity_category.xml
activity_detail.xml
```

