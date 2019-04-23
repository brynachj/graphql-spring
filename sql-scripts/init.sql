SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

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

SET SQL_MODE=@@OLD_SQL_MODE;
SET UNIQUE_CHECKS=@@OLD_UNIQUE_CHECKS;
SET FOREIGN_KEY_CHECKS=@@OLD_FOREIGN_KEY_CHECKS;