-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2023 at 09:11 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hoteltracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_client`
--

CREATE TABLE `tbl_client` (
  `cl_id` int(10) NOT NULL,
  `cl_fname` varchar(20) NOT NULL,
  `cl_lname` varchar(20) NOT NULL,
  `cl_mobile` int(15) NOT NULL,
  `cl_gender` varchar(15) NOT NULL,
  `cl_status` varchar(30) NOT NULL,
  `cl_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_client`
--

INSERT INTO `tbl_client` (`cl_id`, `cl_fname`, `cl_lname`, `cl_mobile`, `cl_gender`, `cl_status`, `cl_address`) VALUES
(1, 'russ', 'eel', 0, 'male', 'single', 'cebu');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_hotel`
--

CREATE TABLE `tbl_hotel` (
  `h_id` int(10) NOT NULL,
  `cl_id` int(10) NOT NULL,
  `us_id` int(10) NOT NULL,
  `h_hotelname` varchar(30) NOT NULL,
  `h_type` varchar(30) NOT NULL,
  `h_desc` varchar(50) NOT NULL,
  `h_rent` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_hotel`
--

INSERT INTO `tbl_hotel` (`h_id`, `cl_id`, `us_id`, `h_hotelname`, `h_type`, `h_desc`, `h_rent`) VALUES
(1, 1, 1, 'pinoybigbrother', 'condo', 'highrise kapoi explain', 1000000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `us_id` int(10) NOT NULL,
  `us_fname` varchar(20) NOT NULL,
  `us_lname` varchar(20) NOT NULL,
  `us_email` varchar(25) NOT NULL,
  `us_username` varchar(15) NOT NULL,
  `us_password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`us_id`, `us_fname`, `us_lname`, `us_email`, `us_username`, `us_password`) VALUES
(1, 'kc', 'karl', 'kc@karl.com', 'kckarl', 'kckarl');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_client`
--
ALTER TABLE `tbl_client`
  ADD PRIMARY KEY (`cl_id`);

--
-- Indexes for table `tbl_hotel`
--
ALTER TABLE `tbl_hotel`
  ADD PRIMARY KEY (`h_id`),
  ADD KEY `hotel_userid` (`us_id`),
  ADD KEY `hotel_clientid` (`cl_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`us_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_client`
--
ALTER TABLE `tbl_client`
  MODIFY `cl_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_hotel`
--
ALTER TABLE `tbl_hotel`
  MODIFY `h_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `us_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_hotel`
--
ALTER TABLE `tbl_hotel`
  ADD CONSTRAINT `hotel_clientid` FOREIGN KEY (`cl_id`) REFERENCES `tbl_client` (`cl_id`),
  ADD CONSTRAINT `hotel_userid` FOREIGN KEY (`us_id`) REFERENCES `tbl_user` (`us_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
