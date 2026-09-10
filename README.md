# 🔐 Cryptography Lab Programs (Java)

A compilation of all the Java programs written and executed during the **Cryptography Laboratory**. This repository demonstrates the implementation of classical cryptographic algorithms, including both **encryption** and **decryption**, for educational purposes.

---

## 📖 About the Repository

This project contains implementations of the three major categories of classical cryptography:

* **Substitution Ciphers** – Characters are replaced with other characters.
* **Polyalphabetic Ciphers** – Multiple substitution alphabets are used.
* **Transposition Ciphers** – Characters are rearranged without changing them.

Each program is written in **Java** and runs as a console application.

---

# 🧪 Lab 1 – Classical Substitution Ciphers

### 1. Caesar Cipher

A monoalphabetic substitution cipher where each letter is shifted by a fixed number of positions in the alphabet.

**Features**

* User-defined shift key
* Encryption
* Decryption
* Supports uppercase and lowercase letters

**File:** `CaesarCipher.java`

---

### 2. Monoalphabetic Cipher

A substitution cipher that replaces each alphabet with another fixed alphabet using a predefined key mapping.

**Features**

* Fixed substitution key
* Encrypts alphabetic characters
* Performs reverse mapping for decryption

**File:** `MonoalphabeticCipher.java`

---

### 3. Vigenère Cipher (Polyalphabetic Cipher)

A polyalphabetic cipher that uses a keyword to generate different shifts for each character.

**Features**

* Keyword-based encryption
* Repeating key mechanism
* Encryption and decryption support

**File:** `VigenereCipher.java`

---

# 🧪 Lab 2 – Matrix & Digraph Ciphers

### 4. Hill Cipher

A matrix-based encryption algorithm that converts plaintext into vectors and encrypts them using matrix multiplication.

**Features**

* 2×2 key matrix
* Inverse matrix for decryption
* Encrypts two-letter blocks

**File:** `hillcipher.java`

---

### 5. Playfair Cipher

A digraph substitution cipher that encrypts pairs of letters using a 5×5 key matrix.

**Features**

* Predefined Playfair matrix
* Same row, same column, and rectangle rules
* Encryption and decryption of digraphs

**File:** `PlayfairCipher.java`

---

# 🧪 Lab 3 – Transposition Ciphers

### 6. Columnar Transposition Cipher

A transposition technique where plaintext is written into rows and read according to a specified column order.

**Features**

* Custom column order key
* Matrix-based implementation
* Encryption and decryption

**File:** `ColumnarCipher.java`

---

### 7. Rail Fence Cipher

A zig-zag transposition cipher that rearranges characters across multiple rails.

**Features**

* Two-rail implementation
* Removes spaces before encryption
* Complete encryption and decryption process

**File:** `railfence.java`

---

# 💻 Technologies Used

* **Language:** Java
* **IDE:** VS Code / IntelliJ / Eclipse
* **Execution:** Java Console Applications

---

# ▶️ How to Run

Compile any program:

```bash
javac CaesarCipher.java
```

Run the program:

```bash
java CaesarCipher
```

Replace the class name with the desired cipher program.

---

# 📂 Repository Structure

```text
Cryptography-Lab/
│
├── CaesarCipher.java
├── MonoalphabeticCipher.java
├── VigenereCipher.java
├── hillcipher.java
├── PlayfairCipher.java
├── ColumnarCipher.java
└── railfence.java
```

---

# 🎯 Learning Outcomes

After completing these laboratory programs, the following concepts are demonstrated:

* Classical substitution techniques
* Polyalphabetic encryption
* Matrix-based cryptography
* Digraph encryption
* Transposition methods
* Encryption and decryption logic in Java

---

## 👨‍💻 Author

**Agastya Yedida**

*Cryptography Laboratory – Java Implementation*
