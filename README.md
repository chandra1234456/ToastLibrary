# 🔔 CustomToast - Android Toast Library

**A lightweight and customizable Android toast message library to show styled toast messages easily.
**

---

## 📦 Installation

Add this in your **root `build.gradle`** (if you're publishing to Maven Central or JitPack):

<details>
<summary>Via JitPack</summary>

Step 1: Add JitPack to your root `build.gradle`:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.YourUsername:CustomToast:1.0.0'
}
```

</details>

💡 Usage

```
CustomToast.show(
context = this,
message = "This is a custom toast!",
duration = Toast.LENGTH_SHORT,
type = ToastType.SUCCESS // SUCCESS, ERROR, INFO, WARNING
)
```
🔧 You can also customize background, text color, font, and icon.

🧰 Features
✅ Custom toast types: Success, Error, Warning, Info

🎨 Color and icon customization

📱 Lightweight and easy to use

⚡ Quick integration with one line

📜 License

```MIT License

Copyright (c) 2025 YourName

Permission is hereby granted, free of charge, to any person obtaining a copy...
```

---

Let me know if you're using **JitPack**, **Maven Central**, or hosting it privately, and I can tailor the instructions (and badge links) better for your library.

Would you like me to generate a live `README.md` file with your library name and usage snippet?

