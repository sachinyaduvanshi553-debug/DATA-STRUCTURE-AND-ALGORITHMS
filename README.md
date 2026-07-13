# 📚 DATA‑STRUCTURE‑AND‑ALGORITHMS

![Banner](assets/repo_demo_1783955754739.png)

A **modern, high‑tech collection** of Java implementations covering core data structures and algorithms. Ideal for interview preparation, learning, and quick reference.

---

## 🚀 Quick Start

```bash
# Ensure JDK 17+ is installed
javac src/**/*.java   # Compile all source files
java -cp src Main      # Run the demo driver (if needed)
```

> The `src` folder is organized by topic:
> - `ARRAYS` – array manipulations, two‑sum, rotation, etc.
> - `BASICS` – language fundamentals, loops, patterns.
> - `SORTING_ALGOS` – sorting algorithms (quick‑sort, merge‑sort, …).
> - `Main.java` – a tiny driver you can adapt.

---

## 📁 Project Structure

```
DATA-STRUCTURE-AND-ALGORITHMS-main/
├─ .gitignore                # Standard Java ignores
├─ assets/                   # Media assets (banner, etc.)
├─ README.md                 # This file
├─ pom.xml                   # Maven build configuration
├─ src/                      # Source code
│   ├─ ARRAYS/               # Array‑centric examples
│   ├─ BASICS/               # Core Java basics
│   ├─ SORTING_ALGOS/        # Sorting implementations
│   └─ Main.java             # Entry point for quick demos
└─ JAVA DSA.iml             # IntelliJ IDEA module file
```

---

## 🛠️ Build & Run (Maven optional)

```bash
# Initialise Maven wrapper (once)
mvn -N io.takari:maven:wrapper

# Compile and execute
./mvnw compile
./mvnw exec:java -Dexec.mainClass=Main
```

*Feel free to use Gradle if you prefer.*

---

## 💻 Tech Stack

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-LeetCode-yellow?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-In%20Progress-brightgreen?style=for-the-badge)
![DSA](https://img.shields.io/badge/DSA-100%20Days-blue?style=for-the-badge)

---

## 📚 Topics Covered

### ✅ Arrays
- Basics, Prefix Sum, Two Pointer, Sliding Window, Hashing

### ✅ Binary Search
- Basics, Variations, Lower/Upper Bound, Search on Answer, Advanced

### ✅ Sorting
- Bubble, Selection, Insertion, Merge, Quick, Counting, Heap, Advanced

### ✅ Strings
- Basics, Frequency, Two Pointer, Manipulation, Pattern Matching, Advanced

### ✅ 2D Arrays
- Traversal, Operations, Spiral, Search, Transformations

### ✅ Linked Lists
- Singly, Fast & Slow, Reverse, Merge, Cycle Detection, Reorder, Partition, Rotate, Add Two Numbers, Reverse K‑Group, Copy Random Pointer, Flatten Multilevel, Palindrome, Split

---

## 🤝 Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feat/your-feature`).
3. Follow Java conventions (CamelCase, Javadoc).
4. Add unit tests under `src/test/` (JUnit 5 recommended).
5. Submit a Pull Request.

---

## 📜 License

Distributed under the **MIT License**. See `LICENSE` for details.

---

## 👨‍💻 Author

**Sachin Yadav** – Java Developer, DSA enthusiast, MERN Stack & AI/ML fan.

---

*Happy coding!*
