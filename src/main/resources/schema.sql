CREATE TABLE IF NOT EXISTS Polaznik (
    polaznikID BIGINT PRIMARY KEY,
    ime VARCHAR(100) NOT NULL,
    prezime VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS ProgramObrazovanja (
    programObrazovanjaID BIGINT PRIMARY KEY,
    naziv VARCHAR(100) NOT NULL,
    csvet INT NOT NULL
);


CREATE TABLE IF NOT EXISTS Upis (
    upisID BIGINT PRIMARY KEY,
    IDPolaznik BIGINT NOT NULL,
    IDProgramObrazovanja BIGINT NOT NULL,
    CONSTRAINT fk_upis_polaznik FOREIGN KEY (IDPolaznik) REFERENCES Polaznik(polaznikID),
    CONSTRAINT fk_upis_program FOREIGN KEY (IDProgramObrazovanja) REFERENCES ProgramObrazovanja(programObrazovanjaID)
);


CREATE TABLE IF NOT EXISTS users (
    id BIGINT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);


CREATE TABLE IF NOT EXISTS authority (
    id BIGINT PRIMARY KEY,
    authority_name VARCHAR(50) NOT NULL
);


CREATE TABLE IF NOT EXISTS users_authority (
    user_id BIGINT,
    authority_id BIGINT,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_authority FOREIGN KEY (authority_id) REFERENCES authority(id)
);


CREATE TABLE IF NOT EXISTS RefreshToken (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    token VARCHAR(255) NOT NULL UNIQUE,
    user_id BIGINT NOT NULL,
    expiry_date TIMESTAMP NOT NULL,
    CONSTRAINT fk_refresh_user FOREIGN KEY (user_id) REFERENCES users(id)
);