<h3 align="center">LAPORAN PRAKTIKUM</h3>
<h3 align="center">PEMROGRAMAN BERORIENTASI OBJEK</h3>
<p align="center">
  <img width="286" height="286" alt="image" src="https://github.com/user-attachments/assets/c2271d06-376d-46e9-ac2f-8856b022f5ec" /><br>
</p>
<b>
  Nama  : Azis Fauzi Ramadhan<br>
  NIM   : L0325043
</b>


### Implementasi Polymorphism (Method Overriding):
Hewan.java berperan sebagai class induk yang menjadi dasar bagi Kucing.java dan Anjing.java. Kedua class tersebut merupakan class turunan yang mewarisi perilaku dari Hewan.java, kemudian mendefinisikan ulang method tertentu menggunakan method overriding. Dengan demikian, method yang sama dapat menghasilkan perilaku berbeda sesuai jenis objeknya. PoliTester.java berfungsi untuk menguji penerapan polymorphism dengan membuat objek dari class Kucing dan Anjing, kemudian memanggil method yang telah di-override. Hasilnya menunjukkan bahwa Java menjalankan implementasi method sesuai jenis objek yang digunakan.

### Implementasi Abstract Class:
BangunDatar.java berperan sebagai abstract class yang menjadi kerangka dasar bagi berbagai bentuk bangun datar. Class ini mendefinisikan abstract method yang harus diimplementasikan oleh class turunannya. Karena merupakan abstract class, BangunDatar tidak dapat diinstansiasi secara langsung.Lingkaran.java merupakan class turunan dari BangunDatar yang mengimplementasikan abstract method dari class induknya. Melalui method overriding, Lingkaran memberikan implementasi sesuai karakteristik lingkaran, misalnya untuk menghitung luas atau keliling berdasarkan rumus lingkaran.

### Implementasi Interface (Multiple Implementation):
AlatElektronik.java dan Kamera.java berperan sebagai interface yang mendefinisikan kontrak perilaku untuk class yang mengimplementasikannya. Setiap interface menetapkan method yang harus disediakan oleh class implementasi. Smartphone.java mengimplementasikan lebih dari satu interface, yaitu AlatElektronik dan Kamera, menggunakan kata kunci implements. Class Smartphone kemudian mendefinisikan ulang method yang diwajibkan oleh kedua interface tersebut. Dengan demikian, satu class dapat memiliki kemampuan dari beberapa interface sekaligus.
