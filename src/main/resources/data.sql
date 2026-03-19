INSERT INTO Polaznik (ime, prezime) VALUES
('Mate', 'Matić'),
('Ana', 'Anić'),
('Marko', 'Markić');

INSERT INTO ProgramObrazovanja (naziv, csvet) VALUES
('Java', 180),
('Spring', 200),
('Hibernate', 150);

INSERT INTO Upis (IDPolaznik, IDProgramObrazovanja) VALUES
(1, 1),
(2, 2),
(3, 3);

INSERT INTO users (id, username, password) VALUES
(1, 'user', '$2a$12$mTpZNhXZyRWZKHBwS.0j4urntAbd9J6Sv5Juodh4XzWdkemTB7dO6'), -- password = user
(2, 'admin', '$2a$12$i.K1KRYFblCkkBUA0ydXveZdh05F3h/V.fuZ3qN00NNcLwVfUCQhK'); -- password = admin


INSERT INTO authority (id, authority_name) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');


INSERT INTO users_authority (user_id, authority_id) VALUES
(1, 2),
(2, 1);