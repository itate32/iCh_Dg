-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-03-20 00:27:39 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE alternativa (
    id_alternativa  VARCHAR2(1 CHAR) NOT NULL,
    descripcion     CHAR(30 CHAR),
    valor_logico    CHAR(1 CHAR),
    porcentaje      NUMBER(4),
    id_pregunta     NUMBER(1) NOT NULL,
    id_test         NUMBER(2) NOT NULL
);

ALTER TABLE alternativa ADD CONSTRAINT alternativa_pk PRIMARY KEY ( id_alternativa );

CREATE TABLE alumno (
    id_alumno   NUMBER(2) NOT NULL,
    nombre      VARCHAR2(30 CHAR),
    id_curso    NUMBER(1) NOT NULL,
    rut_alumno  NUMBER(10)
);

ALTER TABLE alumno ADD CONSTRAINT alumno_pk PRIMARY KEY ( id_alumno );

CREATE TABLE curso (
    id_curso          NUMBER(1) NOT NULL,
    cantidad_alumnos  NUMBER(2)
);

ALTER TABLE curso ADD CONSTRAINT curso_pk PRIMARY KEY ( id_curso );

CREATE TABLE nota (
    id_nota           NUMBER(2) NOT NULL,
    puntaje_total     NUMBER(3),
    nota              NUMBER(4),
    alumno_id_alumno  NUMBER(2) NOT NULL,
    test_id_test      NUMBER(2) NOT NULL,
    curso_id_curso    NUMBER(1) NOT NULL
);

CREATE UNIQUE INDEX nota__idx ON
    nota (
        test_id_test
    ASC );

ALTER TABLE nota ADD CONSTRAINT nota_pk PRIMARY KEY ( id_nota );

CREATE TABLE pregunta (
    id_pregunta  NUMBER(1) NOT NULL,
    enunciado    VARCHAR2(50 CHAR),
    puntaje      NUMBER(3),
    id_test      NUMBER(2) NOT NULL
);

ALTER TABLE pregunta ADD CONSTRAINT pregunta_pk PRIMARY KEY ( id_pregunta );

CREATE TABLE respuesta (
    correcta_incorrecta  VARCHAR2(10 CHAR),
    id_respuesta         NUMBER(1) NOT NULL,
    id_pregunta          NUMBER(1) NOT NULL,
    id_test              NUMBER(2) NOT NULL,
    id_alternativa       VARCHAR2(1 CHAR) NOT NULL
);

CREATE UNIQUE INDEX respuesta__idx ON
    respuesta (
        id_alternativa
    ASC );

ALTER TABLE respuesta ADD CONSTRAINT respuesta_pk PRIMARY KEY ( id_respuesta );

CREATE TABLE test (
    id_test         NUMBER(2) NOT NULL,
    nombre          VARCHAR2(30 CHAR),
    descripcion     VARCHAR2(50 CHAR),
    programa        VARCHAR2(40 CHAR),
    unidad          VARCHAR2(30 CHAR),
    autor           VARCHAR2(30 CHAR),
    fecha_creacion  NUMBER(8),
    id_alumno       NUMBER(2) NOT NULL
);

ALTER TABLE test ADD CONSTRAINT test_pk PRIMARY KEY ( id_test );

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_pregunta_fk FOREIGN KEY ( id_pregunta )
        REFERENCES pregunta ( id_pregunta );

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_test_fk FOREIGN KEY ( id_test )
        REFERENCES test ( id_test );

ALTER TABLE alumno
    ADD CONSTRAINT alumno_curso_fk FOREIGN KEY ( id_curso )
        REFERENCES curso ( id_curso );

ALTER TABLE nota
    ADD CONSTRAINT nota_alumno_fk FOREIGN KEY ( alumno_id_alumno )
        REFERENCES alumno ( id_alumno );

ALTER TABLE nota
    ADD CONSTRAINT nota_curso_fk FOREIGN KEY ( curso_id_curso )
        REFERENCES curso ( id_curso );

ALTER TABLE nota
    ADD CONSTRAINT nota_test_fk FOREIGN KEY ( test_id_test )
        REFERENCES test ( id_test );

ALTER TABLE pregunta
    ADD CONSTRAINT pregunta_test_fk FOREIGN KEY ( id_test )
        REFERENCES test ( id_test );

ALTER TABLE respuesta
    ADD CONSTRAINT respuesta_alternativa_fk FOREIGN KEY ( id_alternativa )
        REFERENCES alternativa ( id_alternativa );

ALTER TABLE respuesta
    ADD CONSTRAINT respuesta_pregunta_fk FOREIGN KEY ( id_pregunta )
        REFERENCES pregunta ( id_pregunta );

ALTER TABLE respuesta
    ADD CONSTRAINT respuesta_test_fk FOREIGN KEY ( id_test )
        REFERENCES test ( id_test );

ALTER TABLE test
    ADD CONSTRAINT test_alumno_fk FOREIGN KEY ( id_alumno )
        REFERENCES alumno ( id_alumno );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             2
-- ALTER TABLE                             18
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
