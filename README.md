# Automation Test Practice Site


 A robust, scalable, and modular Selenium Test Automation Framework built using Java, following the Page Object Model (POM) design pattern, integrated with industry-standard tools like TestNG, Log4j2, ExtentReports, and Apache POI.

This framework is designed to reflect real-world best practices in UI automation, emphasizing clean code architecture, data-driven testing, and maintainable reporting and logging structures. It serves as a comprehensive learning and demonstration project for QA professionals and developers seeking to understand or showcase a fully integrated test automation solution.

The project is ideal for:

    🔹 Learning purposes: Understand how each tool fits into a complete framework

    🔹 Professional portfolios: Display framework skills on GitHub or during interviews

    🔹 Rapid setup: Use it as a boilerplate to kickstart enterprise-level automation projects



---

## 🚀 Key Features

✅ **Selenium WebDriver with Page Object Model (POM)**  
- Clean separation of page logic using the Page Object Design Pattern  
- Promotes maintainability and reusability of code

✅ **TestNG Integration**  
- Supports parallel test execution, grouping, and prioritization  
- Includes `@Annotations`, properties and parameterization features

✅ **Apache POI for Excel-based Data-Driven Testing**  
- External test data managed using Excel sheets  
- Dynamic form-filling and validation using Apache POI

✅ **Log4j2 for Logging**  
- Custom logger integrated into all major components  
- Logs generated at different levels: INFO, DEBUG, ERROR, etc.

✅ **ExtentReports for Advanced Test Reporting**  
- Rich, interactive HTML reports with:
  - Pass/fail status  
  - Screenshot embedding on failure  
  - Custom test metadata and logs

✅ **BaseClass & Utilities Layer**  
- `TestBase` class for initializing WebDriver and configuration  
- Utility classes for:
  - Common actions (waits, screenshots, element handling)  
  - Excel reading  
  - Logger setup  
  - Report generation

---

## 🏗️ Project Structure

<details> <summary>🛠️ Click to view correct Markdown</summary>
```
AutomationTest_PracticeSite/
├── pom.xml             # Maven build configuration
├── README.md           # Project documentation
├── uBlock.xpi          # Firefox adblocker extension for test stability
├── test-output/        # Auto-generated TestNG reports
├── logs/               # Application logs generated via Log4j2
├── reports/            # ExtentReports HTML output
├── screenshots/        # Screenshots during test execution
├── testCasesImages/    # Static image assets for test cases
├── testData/           # Excel or CSV files used for data-driven testing
├── target/             # Maven compiled classes and reports
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── automationtestexercise/
│   │   │           ├── pageObjects/    # Page Object Model classes
│   │   │           ├── testBase/       # WebDriver config & base setup
│   │   │           ├── testCases/      # Test classes using TestNG
│   │   │           └── utilities/      # Common helpers (paths, waits, logger)
│   └── test/
│       └── resources/
│           └── log4j2.xml    # Log4j2 configuration file

```
</details>


## ⚙️ Tools & Technologies Used

| Category       | Tool/Library                  |
|----------------|-------------------------------|
| Programming    | Java                          |
| Testing        | Selenium WebDriver, TestNG    |
| Logging        | Log4j2                        |
| Reporting      | ExtentReports                 |
| Data Handling  | Apache POI                    |
| Build Tool     | Maven                         |
| Versioning     | Git + GitHub                  |
| IDE            | Eclipse                       |



