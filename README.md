# 📦 File Packer & Unpacker with Encryption

## 📌 Overview

A Java-based file utility application that allows users to **pack multiple files into a single archive** and **unpack them back** while preserving metadata.
The project also includes **encryption and decryption** to ensure data security, along with a **GUI interface** for user-friendly interaction.

---

## 🚀 Features

* 🔹 Pack multiple files into a single archive file
* 🔹 Unpack files while restoring original metadata
* 🔹 Metadata handling (file name, size, timestamp)
* 🔹 Built-in encryption and decryption for data security
* 🔹 User-friendly GUI using Java Swing
* 🔹 Cross-platform support (JRE-based)

---

## 🛠️ Technologies Used

* ☕ Java
* 📁 File Handling (Java I/O Streams)
* 🔐 Encryption & Decryption
* 🖥️ Swing (GUI)

---

## 📂 Project Structure

```bash id="fp1"
File-Packer-Unpacker/
│── MarvellousFilePacker.java
│── MarvellousFileUnpacker.java
│── GUI.java
│── README.md
```

---

## ⚙️ How to Run

### 1️⃣ Compile

```bash id="fp2"
javac MarvellousFilePacker.java
javac MarvellousFileUnpacker.java
```

### 2️⃣ Pack Files

```bash id="fp3"
java MarvellousFilePacker Demo MarvellousPack.txt
```

### 3️⃣ Unpack Files

```bash id="fp4"
java MarvellousFileUnpacker MarvellousPack.txt
```

---

## 💻 Example Usage

```bash id="fp5"
# Packing
java MarvellousFilePacker Demo MarvellousPack.txt

# Unpacking
java MarvellousFileUnpacker MarvellousPack.txt
```

---

## ⚠️ Limitations

* ❗ Basic encryption (can be enhanced for stronger security)
* ❗ Limited error handling
* ❗ No compression (only packing)

---

## 🔮 Future Enhancements

* ✅ Add file compression (ZIP-like functionality)
* ✅ Improve encryption (AES/RSA)
* ✅ Multi-file selection via GUI
* ✅ Progress bar for packing/unpacking

---

## 👨‍💻 Author

**Aditya Kotewar**
