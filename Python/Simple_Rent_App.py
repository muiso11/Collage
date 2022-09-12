def menu():
    print("Pilihan Menu")
    print('1. 4X4')
    print('2. SUV')
    print('3. Sedan')
    print('4. MPV')

    def kembali (tipe,jns,hsewa):
        


        hari = int(input('Berapa Lama Anda Ingin Menyewa: '))
        denda = 0
        telatkembali = int(input('Berapa Lama Kamu telat Mengembalikan mobil: '))
        if telatkembali == 0:
            total = (hsewa * hari) + denda
        elif telatkembali >= 7:
            denda += 1000000
            total = (hsewa * hari) + denda
        elif telatkembali >= 5:
            denda += 500000
            total = (hsewa * hari) + denda
        elif  telatkembali >= 1:
            denda += 300000
            total = (hsewa * hari) + denda
        else:
            print('Kata Kunci yang dimasukkan salah')

        print('----------------------------------')
        print('...NOTA...')
        print('Type Mobil: ',tipe)
        print('Jenis: ',jns)
        print('Biaya Sewa Perhari: Rp',hsewa)
        print('Lama Penyewaan: ',hari)
        print('Jatuh tempo: ',telatkembali)
        print('Denda: Rp',denda)
        print('Biaya Yang Harus Dibayar: Rp',total)
        print('--------------------------------------')    
        print("Kembali [Y/N]?")
        back = input().upper()
        if back == "Y":
            print(" ")
            menu()
        else:
            exit()
    

def program_4X4():
    print('==========================================')
    print('Pilihan Mobil')
    print('1. Honda Brio Rp 150.000/hari\n2. Toyota Agya Rp 120.000/hari\n'
    +'3. Suzuki Jimny Rp 350.000/hari\n4. Daihatsu Ayla Rp 100.000/hari\n5. Suzuki Karimun Rp 80.000/hari')
    print('===========================================')
    tipemobil = '4X4'
    pilihmobil = int(input('Masukkan Pilihan: '))
    if pilihmobil == 1:
        print('\nSEWA MOBIL Honda Brio')
        hargasewa = 150000
        jenis = 'Honda Brio'
    elif pilihmobil == 2:
        print('\nSEWA MOBIL Toyota Agya')
        hargasewa = 120000
        jenis = 'Toyota Agya'
    elif pilihmobil == 3:
        print('\nSEWA MOBIL Suzuki Jimny')
        hargasewa = 350000
        jenis = 'Suzuki Jimny'
    elif pilihmobil == 4:
        print('\nSEWA MOBIL Daihatsu Ayla')
        hargasewa = 100000
        jenis = 'Daihatsu Ayla'
    elif pilihmobil == 5:
        print('\nSEWA MOBIL Suzuki Karimun')
        hargasewa = 80000
        jenis = 'Suzuki Karimun'
    else: 
        print('Keyword yang dimasukkan salah, silahkan ulangi kembali')
        menu()
    print('----------------------------------')
    
    
# def program_SUV():
#     print('==========================================')
#     print('Pilihan Mobil')
#     print('1. Toyota Avanza Rp 350.000/hari\n2. Mitsubishi Xpander Rp 400.000/hari\n'
#     +'3. Daihatsu Xenia Rp 350.000/hari\n4. Kijang Inova Rp 450.000/hari\n5. Pajero Sport Rp 650.000/hari')
#     print('==========================================')
#     tipemobil = 'SUV'
#     pilihmobil = int(input('Masukkan Pilihan: '))
#     if pilihmobil == 1: 
#         print('\nSEWA MOBIL Toyota Avanza')
#         hargasewa = 350000
#         jenis = 'Toyota Avanza'
#     elif pilihmobil == 2:
#         print('\nSEWA MOBIL Mitsubishi Xpander')
#         hargasewa = 400000
#         jenis = 'Mitsubishi Xpander'
#     elif pilihmobil == 3:
#         print('\nSEWA MOBIL Daihatsu Xenia')
#         hargasewa = 350000
#         jenis = 'Daihatsu Xenia'
#     elif pilihmobil == 4:
#         print('\nSEWA MOBIL Kijang Inova')
#         hargasewa = 450000
#         jenis = 'Kijang Inova'
#     elif pilihmobil == 5:
#         print('\nSEWA MOBIL Pajero Sport')
#         hargasewa = 650000
#         jenis = 'Pajero Sport'
#     else: 
#         print('Keyword yang dimasukkan salah, silahkan ulangi kembali')
#         menu()
#     print('----------------------------------')
    
    

# def program_sedan():
#     print('==========================================')
#     print('Pilihan Mobil')
#     print('1. BMW i8 Rp 800.000/hari\n2. Honda City Rp 400.000/hari\n'
#     +'3. Mustang  Rp 500.000/hari\n4. Toyota Atlas Rp 350.000/hari\n5. Toyota Vios Rp 300.000/hari')
#     print('==========================================')
#     tipemobil = 'SEDAN'
#     pilihmobil = int(input('Masukkan Pilihan: '))
#     if pilihmobil == 1: 
#         print('\nSEWA MOBIL BMW i8')
#         hargasewa = 800000
#         jenis = 'BMW i8'
#     elif pilihmobil == 2:
#         print('\nSEWA MOBIL Honda City')
#         hargasewa = 400000
#         jenis = 'Honda City'
#     elif pilihmobil == 3:
#         print('\nSEWA MOBIL Mustang ')
#         hargasewa = 500000
#         jenis = 'Mustang '
#     elif pilihmobil == 4:
#         print('\nSEWA MOBIL Toyota Atlas')
#         hargasewa = 350000
#         jenis = 'Toyota Atlas'
#     elif pilihmobil == 5:
#         print('\nSEWA MOBIL Toyota Vios')
#         hargasewa = 300000
#         jenis = 'Toyota Vios'
#     else: 
#         print('Keyword yang dimasukkan salah, silahkan ulangi kembali')
#         program_sedan()
    
   
    
# def program_mpv(): 
#     print('==========================================')
#     print('Pilihan Mobil')
#     print('1. Toyota Alphard Rp 950.000/hari\n2. Toyota Fortuner Rp 750.000/hari\n'
#     +'3. Toyota Rush Rp 550.000/hari\n4. Daihatsu Terios Rp 550.000/hari\n5. Isuzu Panther Rp 200.000/hari')
#     print('==========================================')
#     tipemobil = 'MPV'
#     pilihmobil = int(input('Masukkan Pilihan: '))
#     if pilihmobil == 1: 
#         print('\nSEWA MOBIL Toyota Alphard')
#         hargasewa = 950000
#         jenis = 'Toyota Alphard'
#     elif pilihmobil == 2:
#         print('\nSEWA MOBIL Toyota Fortuner')
#         hargasewa = 750000
#         jenis = 'Toyota Fortuner'
#     elif pilihmobil == 3:
#         print('\nSEWA MOBIL Toyota Rush')
#         hargasewa = 550000
#         jenis = 'Toyota Rush'
#     elif pilihmobil == 4:
#         print('\nSEWA MOBIL Daihatsu Terios')
#         hargasewa = 550000
#         jenis = 'Daihatsu Terios'
#     elif pilihmobil == 5:
#         print('\nSEWA MOBIL Isuzu Panther')
#         hargasewa = 200000
#         jenis = 'Isuzu Panther'
#     else: 
#         print('Keyword yang dimasukkan salah, silahkan ulangi kembali')
#         program_sedan()
    
    
    

print("\nPROGRAM PENYEWAAN MOBIL")
print('-----------------------------')
menu()
print('-----------------------------')
while 1:
    pilih=int(input('\nMasukkan Pilihan: '))
    if pilih == 1:
        program_4X4()
    elif pilih == 2:
        program_SUV()
    elif pilih == 3:
        program_sedan()
    elif pilih == 4:
        program_mpv()
    else:
        print('Pilihan tidak ada')
        print("Kembali [Y/N] ? ")
        coba = input().upper()
        if coba == "Y":
            menu()
        else:
            exit()