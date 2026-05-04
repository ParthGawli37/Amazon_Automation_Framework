# 🛒 Amazon India — Automation Framework

---

**A structured automation system built for real-world reliability — not just script execution.**

It focuses on:

* 🧠 Stability over flakiness  
* ⚡ Fast debugging  
* 🏗 Clean, scalable architecture  

---

## 🧩 Core Concept

This framework is designed around **strict separation of responsibilities**.

### 🔹 Test Logic — Behavior Layer

* Defined using **BDD (Cucumber)**
* Human-readable scenarios
* Maps business intent → execution

---

### 🔸 Execution — Automation Layer

* Selenium-driven interactions  
* Handles synchronization + dynamic elements  
* Designed for unstable, real-world UI  

> ⚠️ Logic and UI handling NEVER mix.

---

## 🎯 Purpose

This system is designed to:

* Reduce flaky failures  
* Improve debugging speed  
* Maintain clean test structure  
* Simulate real user journeys  

---

## ⚙️ System Philosophy

* ❌ Not script-heavy automation  
* ❌ Not tool-dependent design  
* ❌ Not fragile UI tests  

* ✅ Stability-first execution  
* ✅ Clean architecture  
* ✅ Scalable framework  

---

## 🧠 How It Works

| Layer            | Responsibility                          |
|------------------|----------------------------------------|
| Feature Files    | Business scenarios (BDD)               |
| Step Definitions | Logic mapping                         |
| Page Objects     | UI abstraction                        |
| Utils            | Retry, logs, screenshots              |

---

## 🚀 Core Capabilities

### 🔁 Retry Control System

* Built using TestNG `IRetryAnalyzer`  
* Handles transient failures  
* Prevents false negatives  

---

### 🧠 Stable Interaction Strategy

* Explicit waits only  
* Anchor-based validation  
* Works with dynamic DOM  

---

### 📸 Failure Visibility

* Screenshots on failure only  
* Attached to reports  
* Faster debugging  

---

### 📊 Execution Insight

* Extent Reports  
* Step-level logs  
* Clear execution flow  

---

## 🏗 Framework Structure
src/test/java/
├── base/ # Driver + core setup
├── pages/ # Page Objects
├── stepdefinitions/ # BDD mapping
├── runners/ # Execution control
└── utils/ # Retry, logs, screenshots

src/test/resources/
├── features/ # Test scenarios
├── config.properties # Environment config
└── log4j2.xml # Logging

---

## 🧪 Execution Flow

1. Launch Amazon  
2. Search product  
3. Validate results  
4. Add to cart  
5. Proceed to checkout  
6. Verify login page  

---

## 📈 Design Priorities

* Stability > Speed  
* Clarity > Complexity  
* Reusability > Duplication  

---

## 🛠 Tech Stack

* Java  
* Selenium WebDriver  
* Cucumber  
* TestNG  
* Extent Reports  
* Log4j2  
* Maven  

---

## ▶️ Run
mvn clean test

---

## 🚧 Status

> 🟡 Active Development  
> Core framework stable. Expanding reliability and scalability.

---

## 👨‍💻 Author

**Parth Suresh Gawli**  
QA Automation Engineer  

📧 10junespider@gmail.com  
🔗 linkedin.com/in/parthgawli  

---

## 📎 Vision

To build automation systems that:

* behave like real users  
* scale in real projects  
* and don’t break under change  

---

⭐ If this aligns with your mindset, explore the project.

