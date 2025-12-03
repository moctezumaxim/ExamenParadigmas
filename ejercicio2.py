from functools import reduce 
#Formato: (nombre_producto, peso_kg, costo_base)
envios = [
    ("Tasa", 0.5, 10.0),
    ("Mesa", 15.0, 50.0),
    ("Libro", 0.8, 4.0),
    ("Silla", 5.0, 30.0),
    ("Bateria", 1.0, 25.0),
]
#Filtrar peso <= 1kg, precio > 5kg 
envios_elegibles = list(filter(lambda i: i[1] <= 1.0 and i[2] > 5.0, 
    envios 
))
costos_envio = list (map(
    lambda i: i[2] + (i[1] * 2), envios_elegibles 
))

costo_total_envio = reduce (
    lambda total, c: total + c, costos_envio
)

print ("Productos elegibles: ", envios_elegibles)
print ("Costos de envio de producto elegible: ", costos_envio)
print ("suma del costo total de los productos: ", costo_total_envio)



