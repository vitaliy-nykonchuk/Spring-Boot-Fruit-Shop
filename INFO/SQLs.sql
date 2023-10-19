CREATE DATABASE demo_db;


CREATE TABLE IF NOT EXISTS stone_fruits
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS rosy_fruits
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS citrus_fruits
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS orders
( id INTEGER NOT NULL AUTO_INCREMENT,
  order_code VARCHAR(255) NOT NULL,
  buyer_name VARCHAR(255) NOT NULL,
  buyer_phone VARCHAR(255) NOT NULL,
  buyer_email VARCHAR(255) NOT NULL,
  content VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
 citrus_fruits (img, name, article, description, price)
VALUES
 ('citrus-fruit-grapefruit.jpg', 'Grapefruit', 'G001', 'Grapefruits are tangy citrus fruits.', 3.00),
 ('citrus-fruit-lemon.jpg', 'Lemon', 'L001', 'Lemons are zesty citrus fruits.', 2.50),
 ('citrus-fruit-orange.jpg', 'Orange', 'O001', 'Oranges are sweet citrus fruits.', 2.25),
 ('citrus-fruit-pomelo.jpg', 'Pomelo', 'P001', 'Pomelos are large, mild citrus fruits.', 4.00);


INSERT INTO
 rosy_fruits (img, name, article, description, price)
VALUES
 ('rosy-fruit-apple.jpg', 'Apple', 'A001', 'Apples are a common fruit in many countries.', 1.50),
 ('rosy-fruit-hawthorn.jpg', 'Hawthorn', 'H001', 'Hawthorns are small, red fruits often used in jams and jellies', 2.00),
 ('rosy-fruit-pears.jpg', 'Pears', 'P010', 'Pears are known for their juicy and sweet flesh.', 1.75),
 ('rosy-fruit-quince.jpg', 'Quince', 'Q001', 'Quince is a fragrant fruit used in various culinary dishes.', 2.50);


INSERT INTO
 stone_fruits (img, name, article, description, price)
VALUES
 ('stone-fruit-cherry.jpg', 'Cherry', 'C001', 'Cherries are small, red or black fruits with a sweet and tart flavor.', 4.50),
 ('stone-fruit-peach.jpg', 'Peach', 'P101', 'Peaches are soft, fuzzy fruits known for their juicy, sweet flesh.', 2.50),
 ('stone-fruit-plum.jpg', 'Plum', 'P100', 'Plums are round, often purple fruits with a sweet and slightly tart taste.', 3.00),
 ('stone-fruit-apricot.jpg', 'Apricot', 'A010', 'Apricots are small, orange fruits with a sweet and slightly tangy flavor.', 3.50);