# Trading Risk Manager

Trading Risk Manager is a Java console application built while learning Java fundamentals and problem-solving with arrays, loops, methods, and data analysis.

The program allows users to enter multiple trades, analyze trading risk statistics, and calculate reward-to-risk ratios for each trade.

# Features

## Trade Input System
- User selects how many trades to analyze
- Stores trade risks using arrays
- Stores reward targets using arrays

## Risk Analysis
- Calculates total risk across all trades
- Finds highest risk trade
- Finds lowest risk trade
- Calculates average risk
- Counts number of high-risk trades

## Reward-to-Risk Analysis
- Calculates reward-to-risk ratio for every trade
- Finds which trade had the best reward-to-risk ratio
- Displays which trade contained the highest risk

## Risk Classification
Trades are automatically categorized as:
- Low Risk
- Medium Risk
- High Risk

# Java Concepts Practiced
- Arrays
- Parallel arrays
- Methods
- Return values
- Loops
- Searching algorithms
- Index tracking
- Scanner input
- Conditional statements
- Formatted output using `printf`
- Reusable program structure

# Example Output

```text
Risk/Reward Ratios:
Trade #1 Ratio: 3.00
Trade #2 Ratio: 3.21
------------------

Stored Risks:
Risk #1: 300
Risk #2: 140
------------------

Trade Statistics:
------------------
Total Risk: 440
Highest Risk: 300
Occurred on Trade #1
Trade #2 had the best ratio: 3.21
Lowest Risk: 140
Average Risk: 220.00
High Risk Trade Count: 1
```
# Future Improvements

- Save trade history to files
- Add win/loss tracking
- Add account balance tracking
- Export trade reports
- Add graphical user interface (GUI)
- Add trade timestamps
- Store trade history using objects/classes

# Technologies Used
- Java
- Eclipse IDE

# Versions

## V1
Basic single-trade risk calculator

## V2
Added loops and multi-trade analysis

## V3
Added position sizing and advanced calculations

## V4
Added arrays, reusable methods, ratio analysis, and trade statistics
