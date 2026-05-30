# Trading Risk Manager V5

Trading Risk Manager V5 is a Java console application built while learning Java fundamentals, arrays, methods, parallel arrays, and search algorithms.

The program allows users to enter stock ticker symbols, trade risk amounts, and reward targets. It then analyzes trade statistics and identifies the best and worst trades based on risk and reward metrics.

## Features

### Trade Input System

* User selects how many trades to analyze
* Stores ticker symbols using a String array
* Stores trade risks using an integer array
* Stores reward targets using a double array

### Risk Analysis

* Calculates total risk across all trades
* Finds highest risk trade
* Finds lowest risk trade
* Calculates average risk
* Counts low-risk trades
* Counts medium-risk trades
* Counts high-risk trades

### Reward Analysis

* Finds the ticker with the highest reward
* Finds the ticker with the lowest reward

### Risk-to-Reward Analysis

* Calculates risk-to-reward ratio for every trade
* Finds the best ratio trade
* Finds the worst ratio trade
* Displays the ticker associated with each ratio

### Ticker Analysis

* Finds the ticker with the highest risk
* Finds the ticker with the lowest risk
* Finds the ticker with the highest reward
* Finds the ticker with the lowest reward
* Finds the ticker with the best risk-to-reward ratio
* Finds the ticker with the worst risk-to-reward ratio

### Risk Classification

Trades are automatically categorized as:

* Low Risk (< 100)
* Medium Risk (100–199)
* High Risk (200+)

## Java Concepts Practiced

* Arrays
* Parallel Arrays
* Methods
* Return Values
* Loops
* Searching Algorithms
* Index Tracking
* Scanner Input
* Conditional Statements
* Formatted Output using printf
* String Arrays
* Double Arrays
* Data Analysis
* Program Organization
* Reusable Code

## Example Output

```text
Risk/Reward Ratios:
------------------
Trade #1 Ratio: 3.00
Trade #2 Ratio: 2.00
Trade #3 Ratio: 4.00
------------------

Stored Trades:
------------------
Trade #1 | Ticker: SPY | Risk: 100 | Reward: 300
Trade #2 | Ticker: QQQ | Risk: 200 | Reward: 400
Trade #3 | Ticker: NVDA | Risk: 150 | Reward: 600
------------------

Trade Statistics:
------------------
Total Risk: 450
Highest Risk: 200
Occurred on Trade #2

Highest Risk Ticker: QQQ
Lowest Risk Ticker: SPY

Highest Reward Ticker: NVDA
Lowest Reward Ticker: SPY

Best Ratio Ticker: NVDA
Worst Ratio Ticker: QQQ

Average Risk: 150.00
High Risk Trade Count: 1
Medium Risk Trade Count: 2
Low Risk Trade Count: 0
```

## Future Improvements

* Save trade history to files
* Add win/loss tracking
* Add account balance tracking
* Export trade reports
* Add graphical user interface (GUI)
* Replace arrays with ArrayLists
* Store trades using custom Trade objects
* Import trades from CSV files

## Technologies Used

* Java
* Eclipse IDE

## Version History

### V1

Basic single-trade risk calculator.

### V2

Added loops and multi-trade analysis.

### V3

Added position sizing and advanced calculations.

### V4

Added arrays, reusable methods, ratio analysis, and trade statistics.

### V5

Added ticker tracking, parallel arrays, reward analysis, risk classification counts, and advanced search algorithms for identifying the best and worst trades.
