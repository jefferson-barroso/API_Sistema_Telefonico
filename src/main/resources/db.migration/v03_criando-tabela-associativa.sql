USE sistematelefonico;
CREATE TABLE CONTATO_GRUPOS (
    contatos_id BIGINT NOT NULL,
    grupos_id BIGINT NOT NULL,
    PRIMARY KEY (contatos_id, grupos_id),
    FOREIGN KEY (contatos_id) REFERENCES CONTATO(id),
    FOREIGN KEY (grupos_id) REFERENCES GRUPO(id)
);
