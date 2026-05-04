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
