USE sistematelefonico;
CREATE TABLE Contato (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    email VARCHAR(255)
);
