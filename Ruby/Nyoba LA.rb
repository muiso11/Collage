# Buatlah menu dengan 5 menu penyewaan Motor yaitu:

# 	1.Beat

# 	2.Vario

# 	3.Supra

# 	4.Mio

# 	5.Exit

# 	Kembali? (y/n)

# note: - setiap menu berisikan 4 Merk Motor beserta harga

#       - ketika telat mengembalikan akan terkena denda

# 		1.1 hari = 100.000

# 		2.5 hari = 300.000

# 		3.7 hari = 500.000

#       - rumus lamadenda + harga
i = 1
while i > 0 
    puts "Selamat Datang di Penyewaan Motor Muiso"
    puts "======= Motor Yang Disewakan =========="
    print "1. Beat\n2. Vario\n3. Supra\n4. Mio\n5. Exit\nSilahkan Masukkan Pilihan Yang Ada Di Menu : "
    pil = gets.to_i
    for pil in 1..1
        puts "Anda Akan Menyewa Motor Beat Dengan Harga 20.000/hari"
        print "Berapa Lama Anda Akan Menyewa Motor ? "
        sebat = gets.to_i
        a = sebat * 20000
        puts "Anda Akan Menyewa Motor Selama #{sebat} Dengan Harga #{a}"
        puts "Jika Anda Telat Mengembalikan Maka Akan Kena Denda Dengan Nominal : "
        puts "Telat 1 hari denda 100.000"
        puts "Telat 5 hari denda 300.000"
        puts "Te;at 7 hari denda 500,000"
        print "Hitung Jumlah Apabila Telat Mengembalikan : "
        tebat = gets.to_i
        b = tebat
        if b < 5 
            denda = tebat * 100000
            puts "Anda telat mengembalikan selama #{tebat} hari dan akan terkena denda sebanyak #{denda}"
            total = denda + a
            puts "Total Yang Harus Dibayar Adalah #{total}"
            
        end
            
    end
    
        
end
