drop database if exists db_crime;
create database db_crime;
use db_crime;


-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2014 at 10:29 AM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_crime`
--
CREATE DATABASE IF NOT EXISTS `db_crime` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `db_crime`;

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE IF NOT EXISTS `application` (
  `AppId` varchar(50) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Dob` varchar(50) NOT NULL,
  `UnitNo` varchar(50) NOT NULL,
  `StName` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `AppDate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `application`
--

INSERT INTO `application` (`AppId`, `FirstName`, `LastName`, `Dob`, `UnitNo`, `StName`, `Phone`, `AppDate`) VALUES
('1', 'vaibhav', 'kapse', '12-11-1989', '01252', '1515', '959595', '19/12/2014'),
('2', 'vaibhav', 'kapse', '12-11-1989', '151', '1515', '9595793227', '19/12/2014'),
('3', 'vaibhav', 'kapse', '12-11-1989', '123', '123', '123', '19/12/2014'),
('4', 'vaibhav', 'kapse', '12-11-1989', '123', '123', '123', '19/12/2014'),
('5', 'sagar', 'warma', '15-5-1989', '123', '123', '123', '21/12/2014');

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE IF NOT EXISTS `status` (
  `AppId` varchar(20) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Verification` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`AppId`, `Status`, `Verification`) VALUES
('1', 'Checked', 'Accepted'),
('2', 'Checked', 'Accepted'),
('3', 'Checked', 'Accepted'),
('4', 'Checked', 'Rejected'),
('5', 'Checked', 'Accepted');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
