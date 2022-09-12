def menu
    puts "---------------------------"
    puts "      Menu Restaurant      "
    puts "---------------------------"
    puts "| 1. Menu Makanan         |"
    puts "| 2. Menu Minuman         |"
    puts "| 3. Menu Snack           |"
    puts "| 4. Exit                 |"
    puts "---------------------------"
    print "Masukkan Pilihan Menu : "
    pilih = gets.to_i
    if pilih == 1
        makanan()
    elsif pilih == 2
        minuman()
    elsif pilih == 3 
        snack()
    elsif pilih == 4 
        balik()
    else
        print "Pilihan tidak tersedia"
        puts
        menu()
    end
end

def makanan
    puts "-------------------------------------"
    puts "             Menu Makanan            "
    puts "-------------------------------------"
    puts "| 1. Paket Ayam Bakar    Rp. 20.000  |"
    puts "| 2. Soto Ayam           Rp. 15.000  |"
    puts "| 3. Nasi Goreng         Rp. 10.000  |"
    puts "| 4. Exit                            |"
    puts "--------------------------------------"
    print "Masukkan Pilihan Menu : "
    makan = gets.to_i
    if makan == 1
        puts "PAKET AYAM BAKAR"
        print "Masukkan jumlah porsi makanan: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 20000
        puts "Paket Ayam Bakar = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif makan == 2
        puts "PAKET SOTO AYAM"
        print "Masukkan jumlah porsi makanan: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 15000
        puts "Paket Soto Ayam = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif makan == 3
        puts "PAKET NASI GORENG"
        print "Masukkan jumlah porsi makanan: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 10000
        puts "Paket Nasi Goreng = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif makan == 4 
        balik()
    else
        puts "Silahkan Pilih Angka Yang Benar"
    end
end

def minuman
    puts "-------------------------------------"
    puts "             Menu Minuman            "
    puts "-------------------------------------"
    puts "| 1. Es Teh              Rp. 5.000  |"
    puts "| 2. Kopi                Rp. 8.000  |"
    puts "| 3. Air Putih           Rp. 3.000  |"
    puts "| 4. Exit                            |"
    puts "--------------------------------------"
    print "Masukkan Pilihan Menu : "
    minum = gets.to_i
    if minum == 1
        puts "Es Teh"
        print "Masukkan jumlah porsi minuman: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 5000
        puts "Es Teh = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif minum == 2
        puts "Kopi"
        print "Masukkan jumlah porsi minuman: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 8000
        puts "Kopi = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif minum == 3
        puts "Air Putih"
        print "Masukkan jumlah porsi minuman: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 3000
        puts "Air Putih = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif minum == 4 
        balik()
    else
        puts "Silahkan Pilih Angka Yang Benar"
    end
end

def snack
    puts "-------------------------------------"
    puts "             Menu Snack            "
    puts "-------------------------------------"
    puts "| 1. Kentang Goreng      Rp. 8.000  |"
    puts "| 2. Tahu Goreng         Rp. 5.000  |"
    puts "| 3. Jamur Crispy       Rp. 10.000  |"
    puts "| 4. Exit                           |"
    puts "--------------------------------------"
    print "Masukkan Pilihan Menu : "
    minum = gets.to_i
    if minum == 1
        puts "Kentang Goreng"
        print "Masukkan jumlah porsi snack: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 8000
        puts "Kentang Goreng = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif minum == 2
        puts "Tahu Goreng"
        print "Masukkan jumlah porsi snack: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 5000
        puts "Tahu Goreng = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif minum == 3
        puts "Jamur Crispy"
        print "Masukkan jumlah porsi snack: "
        porsi = gets.to_i
        puts "Total untuk #{porsi} porsi"
        total = porsi * 10000
        puts "Jamur Crispy = #{porsi}"
        puts "----------------------------------"
        balik()
    elsif minum == 4 
        balik()
    else
        puts "Silahkan Pilih Angka Yang Benar"
    end
end

def balik
    print "Apakah Anda ingin kembali lagi? : "
    kembali = gets.chomp
    if kembali == "y" || "Y" 
        menu()
    elsif kembali == "N" || "n"
        puts "------Terimakasih Atas Kunjungan Anda------"
        exit()
    else
        print "Pilihan yang Anda masukkan salah"
        puts
    end
end

menu()