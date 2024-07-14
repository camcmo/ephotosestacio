CREATE TABLE tb_users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    enabled BOOLEAN NOT NULL
);
-- Inserir usuário admin
INSERT INTO tb_users (username, password, enabled) VALUES ('admin', '1234', true);

-- Inserir usuário normal
INSERT INTO tb_users (username, password, enabled) VALUES ('usuario', 'senha_usuario', true);
