import matplotlib.pyplot as pla
import math as mat

# data = [89,72,56,73,62,83,74,75,51,92,82,74,76,77,98,98,73,76,78,82,92,75,77,78,97,96,72,89,89,74,72,80,75,79,95,93,83,84,
#             90,64,73,62,86,66,74,92,84,75,91,78,75,92,75,67,92,82,87,90,90,62,71,88,72,70,90,55,88,76,75,82,66,64,71,68,60,65,
#             90,52,83,71,78,75,70,100,52,75,81,71,92,91,61,82,80,100,73,59,93,80,91,74]
# banyakdata = 100
data = []
nilai = []
sort_data = []
integrated_data = {}

# 89,72,56,73,62,83,74,75,51,92,82,74,76,77,98,98,73,76,78,82,92,75,77,78,97,96,72,89,89,74,72,80,75,79,95,93,83,84,90,64,73,62,86,66,74,92,84,75,91,78,75,92,75,67,92,82,87,90,90,62,71,88,72,70,90,55,88,76,75,82,66,64,71,68,60,65,90,52,83,71,78,75,70,100,52,75,81,71,92,91,61,82,80,100,73,59,93,80,91,74

# Melakukan Input Data

def fixed_length(text,length):
    if len(text) > length:
      text = text[:length]
    elif len(text) < length:
      text = (text + " " * length)[:length]
    return text

def tabel():
  header = ['Kelas','Frekuensi','Tepi Bawah', 'Tepi Atas']
  interv = integrated_data["interval"]
  bawah = data[0]
  atas = data[0] + interv - 1
  kelas = round(integrated_data["kelas"])
  banyak_data = len(data)
  data1 = data[0]
  frekuensi = []
  batas_bawah = []
  batas_atas = []
  tepi_atas = []
  tepi_bawah = []
  for i in range (0,kelas):
    batas_bawah.append(bawah)
    bawah = bawah + interv
    batas_atas.append(atas)
    atas = atas + interv
    
  for j in range (0,kelas):
    tepi_bawah1 = batas_bawah[j] - 0.5
    tepi_bawah.append(tepi_bawah1)
    tepi_atas1 = batas_atas[j] - 0.5
    tepi_atas.append(tepi_atas1)
  for x in range (0,kelas):
    frek1 = 0
    for y in range (0,interv):
      frek = 0
      for z in range (0,banyak_data):
        if data1 == data[z]:
          frek = frek+1
      # print(frek)
      # print(x, end=' ')
      # print(y)
      # print("Data 1 = ",data1," Dengan frek = ",frek)
      # print(y)
      # banyak_data = banyak_data - frek
      data1 = data1+1
      frek1 = frek1 + frek
    frekuensi.append(frek1)
  # print(frekuensi)
  # print(tepi_atas)
  print("#" * 101)
  print("# ", end=" ")
  for i in range(0,len(header)):
    print(fixed_length(header[i],20), end = "  #  ")
  print()
  print("#" * 101)

  for j in range(0,kelas):
    print("# ", end=" ")
    kel = "%a - %a" %(batas_bawah[j],batas_atas[j])
    print(fixed_length(kel, 20), end="  #  ")
    print(fixed_length(str(frekuensi[j]),20), end="  #  ")
    print(fixed_length(str(tepi_bawah[j]),20), end="  #  ")
    print(fixed_length(str(tepi_atas[j]),20), end="  #  ")
    print()
  print("#"*101)
  menu()

def dataku():
  print("\nSilahkan Melakukan Input Data\n")
  print("1. Input Data satu - satu")
  print("2. Input Data Sekaligus")
  pilih = eval(input("Masukkan Pilihan [1-2] : "))
  if pilih == 1:
    print("..........................................................")
    banyakdata = eval(input("Silahkan Masukkan Banyaknya Data : "))
    integrated_data["banyakdata"] = banyakdata
    i = 0
    # Untuk Memasukkan Data Ke dalam Array
    while i < banyakdata:
        print("Data ke-",i+1, end=" ")
        inputdata = input(" : ")
        if inputdata.strip().isdigit():
            inputdata = int(inputdata)
            data.append(inputdata)
            i += 1
        else:
          print("Hanya Menerima Data Angka")
  else:
    print("..........................................................")
    print("\nAnda Dianggap Memilih Angka 2")
    print("Silahkan Masukkan Angka Sekaligus Dan Pisahkan Dengan Koma")
    print("Contoh = 1,2,3,4,5 (Dilarang Memasukkan Huruf)")
    
# Mengambil inputan secara langsung dengan koma
  try:
    x = [int(x) for x in input("Masukkan Data : ").split(",")]
  except:
    print("Hanya Menerima Data Angka")
    exit()
  else:
    for i in range(0,len(x)):
      data.append(x[i])
    banyakdata = len(data)
    
# Menampilkan Data Yang Di input Oleh User
  print("\nData Yang Anda Masukkan Sebanyak ",banyakdata," Dengan Isi Data Sebagai Berikut : \n")
  print(data)
  # Menyortir Data Dari Terkecil
  menu()

# Melakukan Sorting Data Dari Terkecil Sampai Terbesar
def sorting(data):
  print("Program Menyusun Data Dari Terkecil")
  for i in range(0,len(data)):
    sort_data.append(data[i])
  sort_data.sort(reverse = False)
  print(sort_data)
  datas = input("Apakah Anda Ingin Data Tersortir Secara Permanen ? ")
  if datas.upper() == 'Y':
    for i in range(0,len(data)):
      data[i] = sort_data[i]
    print(data)
  else:
    print("Urutan Data Tidak Akan Berubah")
    print(data)
  kelas(sort_data)

# Menghitung Jangkauan, Kelas, Dan Interval
def kelas(sort_data):
  # Mencari Jangkauan Kelas
    jangkauan  = sort_data[len(sort_data) - 1] - sort_data[0]
  # Mencari Banyak Kelas
    banyakdata = len(sort_data)
    kel = mat.log10(banyakdata)
    kelas = 1 + 3.3 * kel
    integrated_data["kelas"] = kelas
  # Mencari Panjang Kelas
    interval_kelas = jangkauan / kelas
  # Membulatkan Kelas Keatas
    interval_bulat = round(interval_kelas)
    if (interval_bulat < interval_kelas):
      interval_bulat = interval_bulat + 1
    integrated_data["interval"] = interval_bulat
  # Mengeluarkan Hasil Jangkauan, Banyak Kelas, Dan Interval Kelas
    print("......................................")
    print("   Jangkauan, Kelas, Interval Kelas")
    print("......................................")
    print("Jangkauan = ",round(jangkauan))
    print("Banyaknya Kelas Yang Terbentuk = ",round(kelas))
    print("Interval Kelas = ",interval_bulat)
    print("......................................")
    menu()

# Melakukan Pengubahan Data
def ubahdata(data):
  print("###########################################")
  print("              Pengubahan Data")
  print("###########################################")
  print(data)
  ubah_data = input("Akan Dilakukan Pengubahan Pada Data Ke : ")
  if ubah_data.strip().isdigit():
    ubah_data = int(ubah_data)
    ubah_data = ubah_data - 1
    diubah = eval(input("Masukkan Data Terbaru : "))
    data[ubah_data] = diubah
    print("Data Berhasil Diubah")
    print(data)
    print("Data Akan Tersortir Kembali Dari Terkecil")
    ubah_lagi = input("Apakah Anda Ingin Mengubah Data Lagi [Y/N] : ")
    if ubah_lagi.upper() == 'Y':
      ubahdata()
    else:
      menu()
  else:
    print("Silahkan Masukkan Angka Yang Benar")
    ubahdata(data)

# Melakukan Penghapusan Data
def hapus(data):
  print("###########################################")
  print("                 Hapus Data")
  print("###########################################")
  print(data)
  hapus_data = eval(input("Data Ke Berapa Yang Akan Dihapus : "))
  if hapus_data.strip().isdigit():
    hapus_data -= 1
    data.pop[hapus_data]
    print("Data Berhasil Dihapus")
    print(data)
    ubah_lagi = input("Apakah Anda Ingin Menghapus Data Lagi [Y/N] : ")
    if ubah_lagi.upper() == 'Y':
      hapus(data)
    else:
      menu()
  else:
    print("Silahkan Masukkan Angka Yang Benar")
    hapus(data)

# Membuat Grafik Histogram Dari Data Yang Di Input
def histogram(data,integrated_data):
  banyak_kelas = round(integrated_data["kelas"])
  data.sort(reverse = False)
  data1 = data[0]
  data1 = data1 - 0.5

  for j in range(0,banyak_kelas+1):
    nilai.append(data1)
    data1 = data1 + integrated_data["interval"]

  pla.hist(data,bins =nilai ,ec="red")

  pla.xlabel("Nilai")
  pla.ylabel("Frekuensi")

  pla.title("Data Nilai Fisika Siswa Kelas XI")

  pla.show()
  menu()

def menu():
  print("-----------------------------------------------------")
  print("        Selamat Datang Di Program Statistika")
  print("-----------------------------------------------------")
  print("1. Input Data")
  print("2. Ubah Data")
  print("3. Hapus Data")
  print("4. Sorting Data dan Mencari Kelas")
  print("5. Membuat Grafik")
  print("6. Keluar")
  pil = eval(input("Silahkan Masukkan Pilihan [1-6] : "))
  if pil == 1:
    dataku()
  elif pil == 2:
    ubahdata(data)
  elif pil == 3:
    hapus(data)
  elif pil == 4:
    sorting(data)
  elif pil == 5:
    print("----------------------------------------------")
    print("     Selamat Datang Di Pembuatan Grafik")
    print("----------------------------------------------")
    if data == []:
      print("     Silahkan Melakukan Input Data")
      menu()
    else:
      
      print("\t 1. Grafik Histogram")
      print("\t 2. Tabel Distribusi")
      print("\t 3. Grafik Ogive")
      print("\t 4. Kembali Ke Menu")
      grafik = eval(input("Masukkan Pilihan Anda [1-3]: "))
      if grafik == 1:
        histogram(data,integrated_data)
      elif grafik == 2:
        tabel()
      elif grafik == 3:
        print("Masih Dalam Pengerjaan")
      else:
        print("Anda Akan Dialihkan Ke Menu")
  elif pil == 6:
    exit("Terimakasih :D")
  else:
    print("Masukkan Pilihan Yang Ada Di Menu")
    menu()

menu()    