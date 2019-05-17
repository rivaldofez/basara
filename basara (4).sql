-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2019 at 07:13 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `basara`
--

-- --------------------------------------------------------

--
-- Table structure for table `belanja_produk`
--

CREATE TABLE `belanja_produk` (
  `id_belanja` varchar(50) NOT NULL,
  `tgl_belanja` date DEFAULT NULL,
  `waktu` time DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `kode_produk` varchar(50) DEFAULT NULL,
  `no_pengguna` varchar(50) DEFAULT NULL,
  `no_pegawai` varchar(50) DEFAULT NULL,
  `kode_branch` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `belanja_produk`
--

INSERT INTO `belanja_produk` (`id_belanja`, `tgl_belanja`, `waktu`, `jumlah`, `status`, `kode_produk`, `no_pengguna`, `no_pegawai`, `kode_branch`) VALUES
('1111111', '2019-04-16', '01:57:13', 20, 'PENDING', '12345', '12345678', 'PGW110', 'BR01');

-- --------------------------------------------------------

--
-- Table structure for table `beli_sampah`
--

CREATE TABLE `beli_sampah` (
  `id_beli` varchar(50) NOT NULL,
  `tgl_beli` date DEFAULT NULL,
  `waktu` time DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `kode_sampah` varchar(50) DEFAULT NULL,
  `no_pengrajin` varchar(50) DEFAULT NULL,
  `no_pegawai` varchar(50) DEFAULT NULL,
  `kode_branch` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `beli_sampah`
--

INSERT INTO `beli_sampah` (`id_beli`, `tgl_beli`, `waktu`, `jumlah`, `status`, `kode_sampah`, `no_pengrajin`, `no_pegawai`, `kode_branch`) VALUES
('BBB112', '2019-05-01', '12:06:00', 12, 'PENDING', 'SPH02', 'A11', 'PGW110', 'BR01');

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `kode_branch` varchar(50) NOT NULL,
  `nama_branch` varchar(50) NOT NULL,
  `alamat_branch` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`kode_branch`, `nama_branch`, `alamat_branch`) VALUES
('BR01', 'ITERA', 'JLN RYACUDU');

-- --------------------------------------------------------

--
-- Table structure for table `jual_produk`
--

CREATE TABLE `jual_produk` (
  `id_jual` varchar(50) NOT NULL,
  `tgl_jual` date DEFAULT NULL,
  `waktu` time DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `no_pengrajin` varchar(50) DEFAULT NULL,
  `no_pegawai` varchar(50) DEFAULT NULL,
  `kode_branch` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `no_pegawai` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` char(1) NOT NULL,
  `kode_branch` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`no_pegawai`, `username`, `password`, `nama`, `alamat`, `jenis_kelamin`, `kode_branch`) VALUES
('PGW110', 'pegawai', '12345', 'pegawai', 'dkjhdfjkg', 'L', 'BR01');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `no_pengguna` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` char(1) NOT NULL,
  `rekening` int(10) NOT NULL,
  `saldo` int(10) DEFAULT NULL,
  `kode_branch` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`no_pengguna`, `username`, `password`, `nama`, `alamat`, `jenis_kelamin`, `rekening`, `saldo`, `kode_branch`) VALUES
('12345678', 'mama', 'papa', 'alala', 'JALALA', 'p', 1234, 100, 'BR01');

-- --------------------------------------------------------

--
-- Table structure for table `pengrajin`
--

CREATE TABLE `pengrajin` (
  `no_pengrajin` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengrajin`
--

INSERT INTO `pengrajin` (`no_pengrajin`, `username`, `password`, `nama`, `alamat`) VALUES
('A11', 'anana', 'anana', 'mama', 'jalala');

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `kode_produk` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `harga_jual` int(11) DEFAULT NULL,
  `modal` int(11) DEFAULT NULL,
  `jumlah_stok` int(11) DEFAULT NULL,
  `no_pengrajin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`kode_produk`, `nama`, `kategori`, `harga_jual`, `modal`, `jumlah_stok`, `no_pengrajin`) VALUES
('12345', 'payung', 'alat rumah tangga', 1000, 900, 100, 'A11');

-- --------------------------------------------------------

--
-- Table structure for table `sampah`
--

CREATE TABLE `sampah` (
  `kode_sampah` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `harga_beli` int(11) DEFAULT NULL,
  `harga_jual` int(11) DEFAULT NULL,
  `jumlah_stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sampah`
--

INSERT INTO `sampah` (`kode_sampah`, `nama`, `kategori`, `harga_beli`, `harga_jual`, `jumlah_stok`) VALUES
('SPH01', 'Botol Plastik', 'Botol', 1000, 1500, 1000),
('SPH02', 'Gelas Plastik', 'Gelas', 2000, 2500, 100);

-- --------------------------------------------------------

--
-- Table structure for table `setor_sampah`
--

CREATE TABLE `setor_sampah` (
  `id_setor` varchar(50) NOT NULL,
  `tgl_setor` date DEFAULT NULL,
  `waktu` time DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `kode_sampah` varchar(50) DEFAULT NULL,
  `no_pengguna` varchar(50) DEFAULT NULL,
  `no_pegawai` varchar(50) DEFAULT NULL,
  `kode_branch` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `setor_sampah`
--

INSERT INTO `setor_sampah` (`id_setor`, `tgl_setor`, `waktu`, `jumlah`, `status`, `kode_sampah`, `no_pengguna`, `no_pegawai`, `kode_branch`) VALUES
('1111111', '2019-04-12', '11:51:39', 20, 'VERIFIED', 'SPH01', '12345678', 'PGW110', 'BR01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `belanja_produk`
--
ALTER TABLE `belanja_produk`
  ADD PRIMARY KEY (`id_belanja`),
  ADD KEY `kode_produk` (`kode_produk`),
  ADD KEY `no_pengguna` (`no_pengguna`),
  ADD KEY `no_pegawai` (`no_pegawai`),
  ADD KEY `kode_branch` (`kode_branch`);

--
-- Indexes for table `beli_sampah`
--
ALTER TABLE `beli_sampah`
  ADD PRIMARY KEY (`id_beli`),
  ADD KEY `kode_sampah` (`kode_sampah`),
  ADD KEY `no_pengrajin` (`no_pengrajin`),
  ADD KEY `no_pegawai` (`no_pegawai`),
  ADD KEY `kode_branch` (`kode_branch`);

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`kode_branch`);

--
-- Indexes for table `jual_produk`
--
ALTER TABLE `jual_produk`
  ADD PRIMARY KEY (`id_jual`),
  ADD KEY `no_pengrajin` (`no_pengrajin`),
  ADD KEY `kode_branch` (`kode_branch`),
  ADD KEY `no_pegawai` (`no_pegawai`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`no_pegawai`),
  ADD KEY `kode_branch` (`kode_branch`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`no_pengguna`),
  ADD KEY `kode_branch` (`kode_branch`);

--
-- Indexes for table `pengrajin`
--
ALTER TABLE `pengrajin`
  ADD PRIMARY KEY (`no_pengrajin`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`kode_produk`),
  ADD KEY `no_pengrajin` (`no_pengrajin`);

--
-- Indexes for table `sampah`
--
ALTER TABLE `sampah`
  ADD PRIMARY KEY (`kode_sampah`);

--
-- Indexes for table `setor_sampah`
--
ALTER TABLE `setor_sampah`
  ADD PRIMARY KEY (`id_setor`),
  ADD KEY `kode_sampah` (`kode_sampah`),
  ADD KEY `no_pengguna` (`no_pengguna`),
  ADD KEY `no_pegawai` (`no_pegawai`),
  ADD KEY `kode_branch` (`kode_branch`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `belanja_produk`
--
ALTER TABLE `belanja_produk`
  ADD CONSTRAINT `belanja_produk_ibfk_1` FOREIGN KEY (`kode_produk`) REFERENCES `produk` (`kode_produk`),
  ADD CONSTRAINT `belanja_produk_ibfk_2` FOREIGN KEY (`no_pengguna`) REFERENCES `pengguna` (`no_pengguna`),
  ADD CONSTRAINT `belanja_produk_ibfk_3` FOREIGN KEY (`no_pegawai`) REFERENCES `pegawai` (`no_pegawai`),
  ADD CONSTRAINT `belanja_produk_ibfk_4` FOREIGN KEY (`kode_branch`) REFERENCES `branch` (`kode_branch`);

--
-- Constraints for table `beli_sampah`
--
ALTER TABLE `beli_sampah`
  ADD CONSTRAINT `beli_sampah_ibfk_1` FOREIGN KEY (`kode_sampah`) REFERENCES `sampah` (`kode_sampah`),
  ADD CONSTRAINT `beli_sampah_ibfk_2` FOREIGN KEY (`no_pengrajin`) REFERENCES `pengrajin` (`no_pengrajin`),
  ADD CONSTRAINT `beli_sampah_ibfk_3` FOREIGN KEY (`no_pegawai`) REFERENCES `pegawai` (`no_pegawai`),
  ADD CONSTRAINT `beli_sampah_ibfk_4` FOREIGN KEY (`kode_branch`) REFERENCES `branch` (`kode_branch`);

--
-- Constraints for table `jual_produk`
--
ALTER TABLE `jual_produk`
  ADD CONSTRAINT `jual_produk_ibfk_1` FOREIGN KEY (`no_pengrajin`) REFERENCES `pengrajin` (`no_pengrajin`),
  ADD CONSTRAINT `jual_produk_ibfk_2` FOREIGN KEY (`kode_branch`) REFERENCES `branch` (`kode_branch`),
  ADD CONSTRAINT `jual_produk_ibfk_3` FOREIGN KEY (`no_pegawai`) REFERENCES `pegawai` (`no_pegawai`);

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`kode_branch`) REFERENCES `branch` (`kode_branch`);

--
-- Constraints for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD CONSTRAINT `pengguna_ibfk_1` FOREIGN KEY (`kode_branch`) REFERENCES `branch` (`kode_branch`);

--
-- Constraints for table `produk`
--
ALTER TABLE `produk`
  ADD CONSTRAINT `produk_ibfk_1` FOREIGN KEY (`no_pengrajin`) REFERENCES `pengrajin` (`no_pengrajin`);

--
-- Constraints for table `setor_sampah`
--
ALTER TABLE `setor_sampah`
  ADD CONSTRAINT `setor_sampah_ibfk_1` FOREIGN KEY (`kode_sampah`) REFERENCES `sampah` (`kode_sampah`),
  ADD CONSTRAINT `setor_sampah_ibfk_2` FOREIGN KEY (`no_pengguna`) REFERENCES `pengguna` (`no_pengguna`),
  ADD CONSTRAINT `setor_sampah_ibfk_3` FOREIGN KEY (`no_pegawai`) REFERENCES `pegawai` (`no_pegawai`),
  ADD CONSTRAINT `setor_sampah_ibfk_4` FOREIGN KEY (`kode_branch`) REFERENCES `branch` (`kode_branch`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
