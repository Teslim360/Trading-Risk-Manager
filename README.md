# Trading Risk Manager

Trading Risk Manager is a Java console application developed while learning Java programming fundamentals.

The project evolved through multiple versions, with each version introducing more advanced programming concepts such as methods, loops, arrays, statistics calculations, and multi-trade analysis.

---

## Features

### Version 1

* Calculates maximum allowed risk using the 2% rule
* Calculates reward-to-risk ratio
* Approves or rejects trades
* Single-trade analysis

### Version 2

* Multi-trade analysis
* Running total risk tracking
* Approved/rejected trade counters
* Trade-by-trade processing using loops

### Version 3

* Position sizing calculator
* Risk-per-share calculations
* Entry and stop-loss validation
* Rounded position size recommendations

### Version 4

* Dynamic trade storage using arrays
* Risk and reward tracking
* Reward-to-risk ratio calculations
* Total risk calculation
* Highest risk tracking
* Lowest risk tracking
* Average risk calculation
* High-risk trade counter
* Highest-risk trade index tracking
* Reusable methods for statistics processing
* Dynamic loops using `.length`

---

## Concepts Practiced

* Variables and data types
* Scanner user input
* If/else statements
* For loops
* While loops
* Methods and return values
* Arrays
* Array processing
* Running totals
* Highest/lowest value tracking
* Average calculations
* Reusable program design
* Code refactoring
* Formatted decimal output using `printf`

---

## Technologies Used

* Java
* Eclipse IDE

---

## Example Output

How many trades? 3

Enter risk for trade #1: 100
Enter your targeted reward: 300
Medium Risk

Enter risk for trade #2: 250
Enter your targeted reward: 750
High Risk

Enter risk for trade #3: 75
Enter your targeted reward: 150
Low Risk

## Risk/Reward Ratios

Trade #1 Ratio: 3.00
Trade #2 Ratio: 3.00
Trade #3 Ratio: 2.00

Stored Risks:
Risk #1: 100
Risk #2: 250
Risk #3: 75

Total Risk: 425
Highest Risk: 250
Occurred on Trade #2
Lowest Risk: 75
Average Risk: 141.67
High Risk Trade Count: 1

---

## Future Improvements

* Save trade history to files
* Add win/loss tracking
* Add percentage-based risk calculations
* Add graphical user interface (GUI)
* Store trade timestamps
* Export trade statistics
