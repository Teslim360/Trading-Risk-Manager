# Trading Risk Manager — Version 6

## Overview

A Java console application for recording, searching, editing, and managing options trades. Trade data is saved to a CSV file and automatically loaded when the program starts.

## Features

- Add new trades
- Display all trades
- Search trades by ticker
- Edit trades using a unique Trade ID
- Remove trades using a unique Trade ID
- Automatically generate Trade IDs
- Save trades to CSV
- Load saved trades automatically
- Preserve data between program sessions

## Project Structure

- `Main.java` — Runs the menu and handles user input
- `Trade.java` — Represents one trade and contains its fields, constructors, getters, setters, and formatting methods
- `TradeManager.java` — Stores, searches, edits, removes, saves, and loads trades

## Java Concepts Demonstrated

- Object-oriented programming
- Encapsulation
- Constructor overloading
- Getters and setters
- Method overriding
- Static fields
- `ArrayList`
- Enhanced and indexed `for` loops
- `Scanner`
- `while` loops and `switch` statements
- Exception handling
- File I/O
- `FileWriter`
- `BufferedReader`
- CSV serialization and parsing

## Future Improvements

- Trade outcome tracking
- Profit and loss calculations
- Win rate and expectancy
- Position-size calculator
- Statistics dashboard
- Graphical user interface
- Database storage
