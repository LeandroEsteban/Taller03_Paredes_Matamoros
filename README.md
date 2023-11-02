# Taller03_Paredes_Matamoros

Liata de clases identificadas y sus relaciones

# Clase 1: Empresa

Tiene como atributos: Nombre, direccion.

Relacion: Una empresa puede tener una o mas sucursales.


Existe una relacion de asoaciación entre empresa y sucursal.

# Clase 2: Sucursal

Tiene como atributos: Codigo sucursal, region.

Relacion: Una sucursal pertenece a una sola empresa y cada sucursal puede tener uno o muchos camiones.

Existe una relacion de asoaciación entre sucursal y camión.

# Clase 3: Camión

Tiene como atributos: Código de camión, patente, descripcion, estado.

Relacion: Una camion pertenece a una sola sucursal y puede realizar uno o muchos fletes.

Existe una relacion de asoaciación entre camión y flete.

# Clase 4: Flete

Tiene como atributos: Código de flete, descripción.

Relacion: Un flete puede ser realizado por un solo camión y cada flete esta compuesto por 1 a 5 packs.

Existe una relacion de agregacion entre flete y pack.

# Clase 5: Pack.
Tiene como atributos: No tiene.

Relacion: Un pack esta compuesto por 20 productos.

Existe una relacion de composicion entre  pack y producto.

# Clase 6: Producto.
Tiene como atributos: Codigo de producto, tipo de producto.

Relacion: Un producto pertenece a un solo pack
