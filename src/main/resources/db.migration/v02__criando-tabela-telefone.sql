USE sistematelefonico; 
CREATE TABLE Telefone (
    id BIGINT NOT NULL AUTO_INCREMENT,
    numero VARCHAR(11) NOT NULL,
    tipo_contato ENUM('RESIDENCIAL', 'TRABALHO', 'PERSONALIZADO') NOT NULL,
    contato_id BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT FK_contato FOREIGN KEY (contato_id) REFERENCES Contato(id)
);
