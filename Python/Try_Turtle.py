import turtle


def biodata():
    print("     Biodata Mahasiswa    ")
    print("==========================")
    nama = input("Masukkan Nama   : ")
    kelas = input("Masukkan Kelas  : ")
    npm = int(input("Masukkan NPM    : "))
    alamat = input("Masukkan Alamat : ")
    agama = input("Masukkan Agama  : ")

    print("==========================")
    print("Nama   = ", nama)
    print("Kelas  = ", kelas)
    print(f"NPM    = {npm}")
    print("Alamat = ", alamat)
    print("Agama  = ", agama)


def konvert_suhu():
    print("     Converter Suhu       ")
    print("==========================")
    celcius = float(input("Masukkan Suhu Celcius : "))
    reamur = (4 / 5) * celcius
    fahrenheit = (9 / 5) * celcius + 32

    # KONVERSI Suhu
    print(f"Suhu Celcius          = {celcius}°C")
    print(f"Suhu dalam reamur     = {reamur}°R")
    print(f"Suhu dalam fahrenheit = {fahrenheit}°F")
    return celcius + 273


def persegi():
    print("     Gambar Persegi       ")
    print("==========================")
    baris = int(input("Masukan Jumlah Baris : "))
    for i in range(baris):
        for j in range(baris):
            if(i == 0 or i == baris-1 or j == 0 or j == baris-1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
        print()


def persegi_turtle():
    persegi = turtle.Turtle()
    for i in range(4):
        persegi.speed(1)
        persegi.forward(100)
        persegi.left(90)
    turtle.done()


def menu():
    print("Selamat Datang Di Program Pilihan Menu Yang Bastian Buat :)")
    print()
    print("* * ** * * * * * Pilih Menu * * * * * * * * * *")
    print("* 1. Biodata Mahasiswa                        *")
    print("* 2. Converter Suhu                           *")
    print("* 3. Gambar Persegi                           *")
    print("* 4. Gambar Persegi menggunkan library turtle *")
    print("* 5. Exit                                     *")
    print("* * * * * * * * * * * * * * * * * * * * * * * *")
    print()


while True:
    menu()
    print("Silahkan Pilih Menu Yang Tersedia!")
    user = int(input("Pilihan Anda : "))
    print()

    if user == 1:
        biodata()
        print()
    elif user == 2:
        kelvin = konvert_suhu()
        print(f"Suhu dalam Kelvin     = {kelvin}°K")
        print()
    elif user == 3:
        persegi()
        print()
    elif user == 4:
        persegi_turtle()
        print()
    elif user == 5:
        break
    else:
        print("Menu Tidak Tersedia, Silahkan Pilih Kembali!")

print("Terimakasih Sudah Berkunjung :)")
