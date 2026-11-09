# Ödev: Deneme Sınavı Değerlendirme Sistemi

> Bu bir ödev şablonudur. Ödevi **yapay zekâ kullanmadan**, kendi başınıza yapmanız beklenir.

## Repo Yapısı

```
.
├── README.md        -> Ödev tanımı (bu dosya)
├── RAPOR.md         -> Doldurmanız gereken rapor
├── src/
│   └── Main.java    -> Java çözümünüzü buraya yazın
└── docs/
    └── akis-semasi.png  -> Çizdiğiniz akış şemasını buraya koyun
```

## Nasıl Çalıştırılır?

```bash
javac src/Main.java
java -cp src Main
```

## Problem

Bir eğitim kurumunda öğrencilerin 20 soruluk çoktan seçmeli sınav sonuçları otomatik değerlendirilecektir. Sistem, öğrencinin doğru ve yanlış cevap sayılarını alarak netini hesaplamalı ve sınav sonucunu değerlendirmelidir. Sistem aynı zamanda girilen verilerin doğruluğunu da kontrol etmelidir.

## Gereksinimler

1. **Girdi:** Kullanıcıdan doğru cevap sayısı ve yanlış cevap sayısı alınır. Sınav toplam 20 sorudur.
2. **Girdi kontrolü:**
   - Doğru sayısı negatif olamaz.
   - Yanlış sayısı negatif olamaz.
   - Doğru + yanlış toplamı 20'yi geçemez.
   - Her iki değer de tam sayı olmalıdır.
   - Geçersiz girişte hesaplama **yapılmaz**.
3. **Net hesaplama:** 4 yanlış 1 doğruyu götürür.

   `Net = Doğru - Yanlış / 4`

   Örnek: Doğru 15, Yanlış 4 → Net = 15 - 4/4 = 14

4. **Boş sayısı:** Kullanıcı girmez, sistem hesaplar.

   `Boş = 20 - (Doğru + Yanlış)`

5. **Başarı değerlendirmesi:**

   | Net aralığı | Başarı durumu |
   |---|---|
   | 0–5 | Geliştirilmeli |
   | 5'ten büyük – 10 | Orta |
   | 10'dan büyük – 15 | İyi |
   | 15'ten büyük – 20 | Çok iyi |

   Sınır değerlerinde çakışma olmaması için koşulları doğru sırayla ve uygun karşılaştırma operatörleriyle (`<`, `<=`, `>`, `>=`) yazın.

6. **Çıktı:** Toplam soru, doğru, yanlış, boş sayısı, net ve başarı durumu ekrana yazılır.

## Örnek Test Senaryoları

| Doğru | Yanlış | Boş | Net | Beklenen durum |
|---|---|---|---|---|
| 20 | 0 | 0 | 20 | Çok iyi |
| 15 | 4 | 1 | 14 | İyi |
| 10 | 8 | 2 | 8 | Orta |
| 5 | 0 | 15 | 5 | Geliştirilmeli |
| 0 | 20 | 0 | -5 | Geliştirilmeli |
| 10 | 10 | 0 | 7,5 | Orta |
| 15 | 10 | - | - | Geçersiz giriş |
| 12 | 9 | - | - | Geçersiz giriş |
| -1 | 5 | - | - | Geçersiz giriş |

## Sizden İstenenler

1. Problemi analiz edin. (`RAPOR.md`)
2. Girdileri, işlemleri ve çıktıları belirleyin. (`RAPOR.md`)
3. Kullanılacak matematiksel formülleri yazın. (`RAPOR.md`)
4. Çözümü adım adım sözde kod (pseudocode) olarak yazın. (`RAPOR.md`)
5. Akış şemasını çizin. (`docs/akis-semasi.png`)
6. Java kodunu yazın. (`src/Main.java`)
7. Tüm test senaryolarını deneyin ve sonuçları yazın. (`RAPOR.md`)
8. Başarı durumunu belirleyen koşulları açıklayın. (`RAPOR.md`)

## Teslim

Bu repoyu kendi hesabınıza kopyalayın, çalışmanızı commit'leyip sistemin belirttiği şekilde teslim edin.
