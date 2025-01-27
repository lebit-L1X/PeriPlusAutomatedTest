# PeriPlusAutomatedTest

## Overview

This repository contains automated tests for the Periplus website, with the primary focus on adding products to the cart. Features of the website tested are login, home page, search bar, products page, and shopping cart. Testing is conducted using the TestNG Framework while site navigation utilizes Selenium.


### Page Object Model (POM) for Code Reusability
The PeriPlusAutomatedTest repository uses the Page Object Model (POM) design pattern to ensure code reusability, maintainability, and readability. In this approach, each page of the Periplus website is represented by a class that contains methods for interacting with page elements (e.g., buttons, inputs). By separating the logic of page interactions from the test logic, POM helps in reducing code duplication and makes it easier to update tests as the application evolves. Changes in the page layout or element selectors only require updates in the respective page class, ensuring scalability and cleaner test code.

In applying the POM design pattern, pages of the website are stored inside pages package, with each page of the website is configured in its designated Class, inhreiting from an BasePage, an abstract class that contains abstracted methods to handle finding, clicking, inputting, and other Selenium actions.
Tests follow a similar structure, test scripts are stored inside the test package, where each tests scripts inerits from the BaseTest, an abstract class that contains setup (driver initialization, url access, initial page creation) and teardown (quitting driver after each test). Both are created utilizing TestNG annotations.

### Process Taken in Testing Shopping Cart
- Inputting email and password in the login field
- Signing in to account when given credentials
- Accesing the specified index in the home page's best seller carousel
- Clicking the add to cart button in the selected product page
- Clicking the cart icon to navigate to the cart page
- Validation of products by iterating through the cart and ensuring equal names of products

## Requirements
- Selenium WebDriver
- TestNG
- Java 8+
- Maven
- Chrome driver

## Setup Instructions
1. Clone the repository.
2. Install dependencies using Maven.
3. Ensure browser drivers are set up and accessible.
4. Run any of the tests created using Maven or Intellij. (Test for shopping cart is located in the CartTest class)
