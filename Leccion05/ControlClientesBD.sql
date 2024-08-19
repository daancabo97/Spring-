create database test;
use test;
DROP DATABASE test;

CREATE TABLE Persona (
    id_persona INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    genero VARCHAR(10),
    ocupacion VARCHAR(50),
    nacionalidad VARCHAR(50),
    apellido VARCHAR(50),
    celular VARCHAR(50),
    email VARCHAR(50)
);


INSERT INTO Persona(nombre, edad, genero, ocupacion, nacionalidad, apellido, celular, email) VALUES
    ('Juan', 30, 'Masculino', 'Ingeniero', 'Española', 'Perez', '123456789', 'juan@example.com'),
    ('María', 25, 'Femenino', 'Estudiante', 'Mexicana', 'Gomez', '987654321', 'maria@example.com'),
    ('Ahmad', 40, 'Masculino', 'Médico', 'Siria', 'Ali', '1122334455', 'ahmad@example.com'),
    ('Lisa', 35, 'Femenino', 'Abogada', 'Estadounidense', 'Smith', '5566778899', 'lisa@example.com');


SELECT * FROM test.persona;

/*GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'tu_contraseña' WITH GRANT OPTION;
FLUSH PRIVILEGEzS;
*/


