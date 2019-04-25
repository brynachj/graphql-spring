-- -----------------------------------------------------
-- Schema music
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS `music`;
USE `music`;

-- -----------------------------------------------------
-- Table `artists`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `artists` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `name_unique` ON `artists` (`name` ASC) VISIBLE;

-- -----------------------------------------------------
-- Table `songs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `songs` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `artist_id` INT NOT NULL,
  `single` BOOLEAN NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  CONSTRAINT `artist_id`
    FOREIGN KEY (`artist_id`)
    REFERENCES `artists` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE UNIQUE INDEX `artist_id_idx` ON `songs` (`artist_id` ASC) VISIBLE;

-- -----------------------------------------------------
-- USER `'music'@'%'`
-- -----------------------------------------------------

CREATE USER 'music'@'%' IDENTIFIED BY 'l0c4lP4ss';

GRANT ALL PRIVILEGES ON music.* TO 'music'@'%' WITH GRANT OPTION;

flush PRIVILEGES;
