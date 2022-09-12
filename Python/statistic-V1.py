import matplotlib.pyplot as pla
import math as mat
def dataku():
    print("------------------------------------")
    print("Selamat Datang Di Program Statistika")
    print("------------------------------------")
    print("\nSilahkan Melakukan Input Data\n")

    data = []
    banyakdata = int(input("Silahkan Masukkan Banyaknya Data : "))
    # Untuk Memasukkan Data Ke dalam Array
    for i in range(0,banyakdata):
        datake = i
        print("Data ke-",datake+1, end=" ")
        inputdata = int(input(" : "))
        data.append(inputdata)
    # Menampilkan Data Yang Di input Oleh User
    print("Data Yang Anda Masukkan Sebanyak ",banyakdata," Dengan Isi Data Sebagai Berikut : ")
    print(data)
    # Menyortir Data Dari Terkecil
    print("Data Terurut Dari Terkecil :")
    data.sort(reverse=False)
    print(data)
    kelas(data,banyakdata)

def kelas(data,banyakdata):
  # Mencari Jangkauan Kelas
    jangkauan  = banyakdata - int(data[0])
  # Mencari Banyak Kelas
    kel = mat.log10(banyakdata)
    banyak_kelas = 1 + 3.3 * kel
  # Mencari Panjang Kelas
    interval_kelas = jangkauan / banyak_kelas
  # Membulatkan Kelas Keatas
    interval_bulat = round(interval_kelas)
    if (interval_bulat < interval_kelas):
      interval_bulat = interval_bulat + 1
  # Mengembalikan Nilai Kelas
    return data,banyak_kelas,interval_bulat

def histogram(data,banyak_kelas,interval_bulat):
  nilai = []
  banyak_kelas = round(banyak_kelas)
  data1 = data[0]
  data1 = data1 - 0.5

  for j in range(1,banyak_kelas):
    nilai.append(data1)
    data1 = data1 + interval_bulat

  pla.hist(data,banyak_kelas,ec="red")
  pla.xlabel("Nilai")
  pla.ylabel("Frekuensi")

  pla.title("Data Nilai Fisika Siswa Kelas XI")

  pla.show()

def menu():
  print("--------------------------------------")
  print("      Program Grafik Statistika")
  print("--------------------------------------")
  print("1. Bentuk Histogram")
  print("2. Bentuk Balok")
  print("3. Keluar")
  pil = eval(input("Silahkan Masukkan Pilihan Anda : "))
  if pil == 1:
    histogram(data,banyak_kelas,interval_bulat)
menu()