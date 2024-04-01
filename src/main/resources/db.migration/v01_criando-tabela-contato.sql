USE sistematelefonico;
CREATE TABLE CONTATO (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    email VARCHAR(255),
    numero VARCHAR(20) NOT NULL,
    tipo_contato ENUM('RESIDENCIAL' /* 0 */, 'TRABALHO' /* 1 */, 'FAMILIA' /* 2 */, 'PERSONALIZADO' /* 3 */) NOT NULL,
    PRIMARY KEY (id)
);
