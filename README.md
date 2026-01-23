# Cashflow Simulator

Cash flow simulation engine designed to evaluate financial sustainability, cash burn risk, and business scalability using deterministic daily modeling.

---

##  Problem Context

High interest rates, delayed receivables, and rising acquisition costs have transformed growth into a financial risk.

Many businesses show profit on paper while silently collapsing due to cash flow misalignment.

This project addresses a critical question:

> **If I scale today, will my cash survive?**

---

##  What This Project Does

This simulator models daily cash flow by considering:

- Current cash balance
- Daily operational and marketing costs
- Average daily revenue
- Revenue delay (receivables)
- Business scaling scenarios

The engine simulates future days until:
- Cash breaks (≤ 0), or
- A safe simulation horizon is reached

---

##  Core Features

- Daily cash flow simulation
- Break-even and cash break detection
- Delay-aware revenue modeling
- Scalability impact simulation
- Deterministic and transparent logic

---

##  Project Structure

cashflow-simulator/
├── src/main/java/simulator
│ ├── CashflowSimulator.java
│ ├── SimulationResult.java
│ └── TestCashflowSimulator.java
├── docs/
├── assets/
└── README.md

---

## ▶️ How to Run

Compile the project:

```bash
javac src/main/java/simulator/*.java


//RUN THE SIMULATION
java -cp src/main/java simulator.TestCashflowSimulator

//EXEMPLE OUTPUT
Cash breaks in 10 days.
Final cash balance: 0.0


//CURRENT STATUS 

✔ Core simulation engine implemented
✔ Cash break detection
✔ Scenario testing via console

//NEXT STEPS 

Add scale simulation scenarios

Add configurable simulation parameters

Extend to API (Spring Boot)

Build decision-focused interface
