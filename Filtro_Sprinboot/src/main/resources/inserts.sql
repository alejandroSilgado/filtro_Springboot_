
INSERT INTO marca (nombre) VALUES
  ('Marca A'),
  ('Marca B'),
  ('Marca C');
  
INSERT INTO modelo (nombre, descripcion) VALUES
  ('Modelo 1', 'Descripción del Modelo 1'),
  ('Modelo 2', 'Descripción del Modelo 2'),
  ('Modelo 3', 'Descripción del Modelo 3');

INSERT INTO bicicletas (marca_id, modelo_id, color, precio) VALUES
  (1, 1, 'Azul', 20000),
  (1, 2, 'Negro', 25000),
  (1, 3, 'Blanco', 30000),
  (2, 1, 'Rojo', 22000),
  (2, 2, 'Verde', 27000),
  (2, 3, 'Amarillo', 32000),
  (3, 1, 'Gris', 24000),
  (3, 2, 'Caf' , 29000),
  (3, 3, 'Celeste' , 35000);