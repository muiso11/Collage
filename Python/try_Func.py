class bun():
    def matih(self, harga):
        price = harga * 7000
        return price

    def melati(self, harga):
        price = harga * 4000
        return price

    def marah(self, harga):
        price = harga * 10000
        return price

    def buck(self, harga):
        price = harga * 150000
        return price


def menu():
    print('==================================')
    print('Selamat Datang DI Toko Bunga Muiso')
    pilih = eval(input(
        '1.Mawar Putih\n2.Melati\n3.Mawar Merah\n4.Bucket\n5.Exit\nSilahkan Masukkan Pesanan Anda: '))
    bunga = bun()
    if pilih == 1:
        pil = eval(input('Anda ingin membeli berapa Mawar Putih? '))
        print('Anda membeli Mawar Putih sebanyak ',
              pil, ' dengan harga ', bunga.matih(pil))
        keluar()
    elif pilih == 2:
        pil = eval(input('Anda ingin membeli berapa Melati? '))
        print('Anda membeli Melati sebanyak ', pil,
              ' dengan harga ', bunga.melati(pil))
        keluar()
    elif pilih == 3:
        pil = eval(input('Anda ingin membeli berapa Mawar Merah? '))
        print('Anda membeli Mawar Merah sebanyak ',
              pil, ' dengan harga ', bunga.marah(pil))
        keluar()
    elif pilih == 4:
        pil = eval(input('Anda ingin membeli berapa Bucket? '))
        print('Anda membeli Bucket sebanyak ', pil,
              ' dengan harga ', bunga.buck(pil))
        keluar()
    elif pilih == 5:
        keluar()

def keluar():
    back = input("\nKembali [Y/N]? ").upper()
    if back == "Y":
        print(" ")
        menu()
    else:
        exit()


menu()

