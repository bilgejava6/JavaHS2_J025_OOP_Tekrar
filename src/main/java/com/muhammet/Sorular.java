package com.muhammet;

public class Sorular {
    /**
     * 1- Inheritance ve Overriding
     * bir okul yönetmi sistemi olacak
     * - Person sınıfı. age, name, displayInfo() olacak
     * - Teacher ve Student sınıfları olacak. Persondan miras alacaklar.
     * - displayInfo() method u alt sınıflarda override edilecek.
     * Örnek:
     * Name: Ayşe, Age: 44, Role: Teacher
     * Name: deniz, age: 12, Role: Student
     *---------------------------------------------------
     * 2- Constructor - Encapsulation
     * bankacılık uygylqması yapıyoruz
     * - BankAccount adında bir sınıf oluşturun. accountNumber, balance iki değişken
     * - yeni kullanıcı için hesap tanımlanırken, banka hesap no ve bakiye mutlaka işlenmeli
     * - hesabını görntüleömek için getBalance(), hesabına para yüklemek için deposit(double amount)
     * kullanılacak
     * - müşteri para çekmek isterse, withdraw(double amount) çekilmek istenilen tutar bakiyeden
     * büyük olup olmadığı kontrol edilmeli.
     * (Runner da)en az birer kez para ekleme ve yükleme işlemi yapınız ve son durumu yazdırınız.
     */

    /**
     *  ***   ÖDEV  *****
     * Bir araç yönetim sistemi tasarlamak istiyorsunuz. Bu sistem aşağıdaki gereksinimleri karşılamalı:
     *
     * 	1.	Inheritance:
     * 	•	Vehicle isimli bir üst sınıf oluşturun. Bu sınıfta brand (marka) ve maxSpeed (maksimum hız) özellikleri ile bir displayInfo() metodu tanımlayın.
     * 	•	Car ve Truck sınıfları Vehicle sınıfından türesin.
     * 	2.	Constructor:
     * 	•	Vehicle sınıfında bir constructor tanımlayarak brand ve maxSpeed değerlerini ayarlayın.
     * 	•	Car sınıfında, seatingCapacity (oturma kapasitesi) özelliğini içeren bir constructor tanımlayın ve Vehicle constructor’ını super ile çağırın.
     * 	•	Truck sınıfında, loadCapacity (yük kapasitesi) özelliğini içeren bir constructor tanımlayın ve super ile Vehicle constructor’ını çağırın.
     * 	3.	Encapsulation:
     * 	•	Car ve Truck sınıflarında seatingCapacity ve loadCapacity özelliklerini kapsüllü (private) yapın. Bu özellikleri ayarlamak ve almak için getter ve setter metodları tanımlayın.
     * 	4.	Overriding:
     * 	•	Car ve Truck sınıflarında displayInfo() metodunu ezerek (@Override), ilgili sınıfın bilgilerini yazdırın.
     * 	5.	Overloading:
     * 	•	Car sınıfında iki farklı calculateRent() metodu tanımlayın:
     * 	•	İlki günlük kira ücreti ve gün sayısını alıp toplam ücreti hesaplasın.
     * 	•	İkincisi ise günlük kira ücreti, gün sayısı ve indirim oranını alıp toplam ücreti hesaplasın.
     *
     * 	Brand: Toyota, Max Speed: 180, Seating Capacity: 5
     *  Total Rent (Without Discount): 3000
     *  Total Rent (With Discount): 2700
     *
     *  Brand: Volvo, Max Speed: 120, Load Capacity: 2000kg
     *
     * Çözüm için İpuçları:
     *
     * 	1.	Sınıflar ve inheritance ilişkisini kurarken extends anahtar kelimesini kullanmayı unutmayın.
     * 	2.	Getter ve setter metodları, kapsüllemeyi doğru bir şekilde göstermek için önemlidir.
     * 	3.	super ile üst sınıf constructor’ını çağırmayı ve ezme (@Override) işlemlerini doğru bir şekilde yapın.
     * 	4.	Overloading işlemi için iki calculateRent() metodunun farklı parametrelerle tanımlandığından emin olun.
     *
     *
     */
}
