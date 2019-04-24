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
-- USER `'music'@'%'`
-- -----------------------------------------------------

CREATE USER 'music'@'%' IDENTIFIED BY 'l0c4lP4ss';

GRANT ALL PRIVILEGES ON music.* TO 'music'@'%' WITH GRANT OPTION;

flush PRIVILEGES;
