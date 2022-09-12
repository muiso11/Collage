#!/bin/bash

clear
   echo -n "Masukan Nama Pemesan : "
   read nama
   echo "*****************************";
   echo "     MENU MAKAN HARI INI     ";
   echo "*****************************";
   echo "1. Bakso      ";
   echo "2. Gado-Gado  ";
   echo "3. siomay     ";
   echo "4. Es teh     ";
   echo "5. Exit       ";
   echo "-----------------------------"
   read -p "Pilihan anda [1-5] : " pil;
   echo "-----------------------------"
if [ $pil -eq 1 ];
then
   echo " "
   echo "******BAKSO******"
   echo -n "Jumlah Porsi = ";
   read jum
   let bayar=jum*12000;
elif [ $pil -eq 2 ];
then
   echo " "
   echo "******Gado-Gado******"
   echo -n "Jumlah Porsi = ";
   read jum
   let bayar=jum*10000;
elif [ $pil -eq 3 ];
then
   echo " "
   echo "******siomay******"
   echo -n "Jumlah Porsi = ";
   read jum
   let bayar=jum*5000;
elif [ $pil -eq 4 ];
then
   echo " "
   echo "******Es teh******"
   echo -n "Jumlah Porsi = ";
   read jum
   let bayar=jum*2500;
elif [ $pil -eq 5 ];
then
   exit 0
else
   echo " "
   echo "maaf pilihan tidak tersedia"
   exit 1
fi
   echo "Harga bayar  = Rp.$bayar"
   echo "terimakasih" $nama "sudah memesan di sini:)"
