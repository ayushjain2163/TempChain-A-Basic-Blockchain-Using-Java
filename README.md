# TempChain-A-Basic-Blockchain-Using-Java


## Overview

TempChain is a simple implementation of a blockchain using Java. This project aims to provide a foundational understanding of how blockchains work by creating a basic chain of blocks that store data, validate new blocks through proof of work, and ensure data integrity through hashing.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Setting Up](#setting-up)
- [Implementation](#implementation)
- [Usage](#usage)
- [Contributing](#contributing)
- [Acknowledgements](#acknowledgements)

## Introduction

A blockchain is essentially a digital ledger composed of blocks. Each block contains a digital fingerprint (hash), the hash of the previous block, and some data (e.g., transactions). The integrity of the blockchain is maintained through these hashes, making it tamper-resistant.

## Features

- **Block Structure**: Each block contains a timestamp, data, the hash of the current block, and the hash of the previous block.
- **Proof of Work**: A simple mining mechanism to validate new blocks.
- **Data Integrity**: Ensures the blockchain is valid and unchanged by recalculating and comparing hashes.
- **GSON Integration**: Uses GSON library for JSON parsing and serialization.

## Setting Up

### Prerequisites

- **Java**: Ensure Java and JDK are installed.
- **Eclipse**: Or any other IDE/Text Editor of your choice.
- **GSON Library**: By Google for JSON handling.

### Installation

1. **Clone the repository**:
   ```bash
   https://github.com/ayushjain2163/TempChain-A-Basic-Blockchain-Using-Java
   ```
2. **Import the project into Eclipse** (or your preferred IDE).
3. **Add GSON library** to your project:
   - Download the GSON library [here](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/gson-2.6.2.jar).
   - Add the JAR file to your project's build path.

## Implementation

### Block Structure

A block in the blockchain consists of:
- **Index**: Position of the block in the chain.
- **Timestamp**: When the block was created.
- **Data**: The data contained within the block.
- **Previous Hash**: The hash of the previous block.
- **Hash**: The hash of the current block.

### Creating the Blockchain

1. **Define the Block class**:
   - Include attributes for index, timestamp, data, previous hash, and hash.
   - Implement methods to calculate the hash and validate the block.

2. **Chain the Blocks**:
   - Initialize the blockchain with a genesis block.
   - Add new blocks by calculating the proof of work and ensuring data integrity.

3. **Validation**:
   - Recalculate and compare hashes to ensure the blockchain is valid and unchanged.



## Usage

1. **Run the Main Class**:
   - Execute the main class to start the blockchain.
   - Add blocks and validate the chain.

2. **Check Data Integrity**:
   - Use the validation method to ensure no data has been tampered with.

## Contributing

We welcome contributions! Please follow these steps:
1. **Fork the repository**.
2. **Create a new branch** for your feature or bugfix.
3. **Commit your changes** with descriptive messages.
4. **Push to the branch**.
5. **Create a pull request**.


## Acknowledgements

- **Google GSON Library** for JSON parsing and serialization.
- **Open Source Community** for continuous learning and support.
