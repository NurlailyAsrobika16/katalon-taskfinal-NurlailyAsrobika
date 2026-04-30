# Final Project Katalon Studio - Mobile Testing
**Nama:** Nurlaily Asrobika  
**Aplikasi:** Todo App (Mobile Android)

---

## Deskripsi Project
Project ini merupakan implementasi pengujian otomatis menggunakan Katalon Studio 
pada aplikasi mobile Todo App berbasis Android. Pengujian mencakup skenario 
positif, negatif, dan data driven testing.

---

## Struktur Project
```
Test Cases/
├── Blocks/
│   ├── Negative/
│   │   └── TC_EmptyField
│   ├── Positive/
│   │   ├── TC_AlarmSholatSubuh
│   │   └── TC_DeleteTask
│   └── Reusable/
│       ├── StartAPP
│       └── CloseAPP
├── Scenario/
│   ├── TC_AlarmSholatSubuh
│   ├── TC_DeleteTask
│   └── TC_EmptyField
Test Suites/
├── Data Driven Test/
│   └── DDT_TS_AlarmData
└── Suites/
└── TS_Regression_Test
```
---

## Test Case

### 1. TC_AlarmSholatSubuh (Positif)
**Skenario:** Menguji fitur penambahan task alarm sholat subuh  
**Langkah:**
1. Buka aplikasi
2. Tap tombol Skip intro
3. Tap tombol Add Task (+)
4. Isi nama task, keterangan, dan kategori
5. Tap tombol Save
6. Verifikasi task berhasil tersimpan

**Expected Result:** Task alarm sholat subuh berhasil ditambahkan dan muncul di daftar

---

### 2. TC_DeleteTask (Positif)
**Skenario:** Menguji fitur menghapus task yang sudah ada  
**Langkah:**
1. Buka aplikasi
2. Tap task yang ingin dihapus
3. Tap tombol Delete
4. Konfirmasi penghapusan
5. Verifikasi task sudah tidak ada di daftar

**Expected Result:** Task berhasil dihapus dari daftar

---

### 3. TC_EmptyField (Negatif)
**Skenario:** Menguji validasi ketika field task dikosongkan  
**Langkah:**
1. Buka aplikasi
2. Tap tombol Add Task (+)
3. Biarkan field kosong
4. Tap tombol Save
5. Verifikasi pesan error muncul

**Expected Result:** Aplikasi menampilkan pesan error dan tidak menyimpan task kosong

---

## Data Driven Testing
Menggunakan **DDT_TS_AlarmData** dengan data file **AlarmData** yang berisi 3 variasi data:

| No | taskTitle | taskDone | category |
|----|-----------|----------|----------|
| 1  | Alarm Sholat Subuh | Berhasil Bangun | Personal |
| 2  | Meeting Client | Presentasi proposal ke client | Business |
| 3  | Belajar Katalon | Menyelesaikan modul automation testing | Personal |

---

## Hasil Pengujian

| Test Case | Tipe | Status |
|-----------|------|--------|
| TC_AlarmSholatSubuh | Positif | ✅ Passed |
| TC_DeleteTask | Positif | ✅ Passed |
| TC_EmptyField | Negatif | ✅ Passed |
| DDT_TS_AlarmData (3 data) | Data Driven | ✅ Passed 3/3 |

---

## Tools & Konfigurasi
- **Tool:** Katalon Studio Enterprise 10.4.3
- **Device:** Xiaomi Redmi Note 8 (Android 9)
- **Automation:** UIAutomator2
- **Appium:** via Katalon built-in
