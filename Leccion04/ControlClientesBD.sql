create database test;
use test;

CREATE TABLE Persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    genero VARCHAR(10),
    ocupacion VARCHAR(50),
    nacionalidad VARCHAR(50)
);


INSERT INTO Persona (nombre, edad, genero, ocupacion, nacionalidad) VALUES
    ('Juan', 30, 'Masculino', 'Ingeniero', 'Española'),
    ('María', 25, 'Femenino', 'Estudiante', 'Mexicana'),
    ('Ahmad', 40, 'Masculino', 'Médico', 'Siria'),
    ('Lisa', 35, 'Femenino', 'Abogada', 'Estadounidense');


USE test;
GRANT ALL PRIVILEGES ON test.* TO 'root'@'localhost';
FLUSH PRIVILEGES;

SELECT * FROM test.persona;

/*GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'tu_contraseña' WITH GRANT OPTION;
FLUSH PRIVILEGES;
