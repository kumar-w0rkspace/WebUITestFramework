# Automation Test Practice Site
<p>
  <a href="https://automationexercise.com/">
    <img src="https://automationexercise.com/static/images/home/logo.png" alt="Automation Practice Logo" width="250"/>
  </a>
</p>
<p><a href="https://automationexercise.com/">Visit the Automation Practice Site</a></p>


A robust, scalable, and modular `Selenium` Test Automation Framework built using `Java`, following the Page Object Model (POM) design pattern, integrated with industry-standard tools like `TestNG`, `Log4j2`, `ExtentReports`, and `Apache POI`.

This framework reflects real-world best practices in UI automation, emphasizing clean code architecture, `data-driven testing`, `modular design`, and `maintainable reporting/logging` structures. It serves as a comprehensive learning and demonstration project for QA professionals and developers aiming to understand or showcase a fully integrated test automation solution.

The project is ideal for:

🔹 Learning purposes: Understand how each tool fits into a complete framework  
🔹 Professional portfolios: Showcase framework skills during interviews or online  
🔹 Rapid setup: Use it as a boilerplate to kickstart enterprise-level automation projects  

This framework emphasizes:

- 🔁 Modularity: Page Object Model & utility-driven design  
- 🔍 Readability: Intuitive method names and logical folder structure  
- 📊 Traceability: Clear reports, structured logs, and organized screenshots  
- 🧪 Scalability: Easily extendable to more complex projects and test suites  

📌 More features and improvements will be added as the framework matures.

> 🔍 Note: The `reports/demo-testng-output/` folder is added only for demonstration purposes.  
> This shows what the TestNG native output looks like after a successful test suite execution.

---

## 🚀 Key Features

✅ **Selenium WebDriver with Page Object Model (POM)**  
- Clean separation of page logic using the `Page Object Design` Pattern  
- Promotes maintainability and reusability of code

✅ **TestNG Integration**  
- Supports `parallel test execution`, `grouping`, and `prioritization`  
- Includes `@Annotations`, `properties` and `parameterization` features

✅ **Apache POI for Excel-based Data-Driven Testing**  
- External test data managed using Excel sheets  
- Dynamic form-filling and validation using `Apache POI`

✅ **Log4j2 for Logging**  
- Custom `logger` integrated into all major components  
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

```
AutomationTest_PracticeSite/
├── pom.xml                    # Maven build configuration
├── README.md                  # Project documentation
├── .gitignore                 # Excludes logs, target, test-output, etc.
├── uBlock.xpi                 # Firefox adblocker extension for test stability

├── test-output/               # Auto-generated TestNG reports (GIT IGNORED)

├── demo-logs/                 # Static Log4j2 demo logs
│   └── sampleLog4j2.txt       # Snapshot of Log4j2 logs (for demo)

├── reports/                   # ExtentReports HTML output
│   └── demo-testng-outputs/   # Static demo: index.html, emailable-report.html (for demo)

├── screenshots/               # Screenshots captured during test execution
├── testCasesImages/           # Static image assets for test steps
├── testData/                  # Excel or CSV files for data-driven testing
├── target/                    # Maven compiled classes and reports (GIT IGNORED)

├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── automationtestexercise/
│       │           ├── pageObjects/    
│       │           ├── testBase/       
│       │           ├── testCases/      
│       │           └── utilities/      
│       └── resources/
│           ├── config.properties    # Centralized framework config
│           └── log4j2.xml           # Logging configuration for Log4j2


```


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

## 🔄 Future Updates

This framework is a work-in-progress and will continue to evolve. Planned enhancements include:
- Cross-browser and parallel execution support
- Cloud/grid integration (Selenium Grid, BrowserStack)
- Integration with CI/CD tools (GitHub Actions, Jenkins)

Example coverage includes:
- ✅ User registration and login flow  
- 
- 
- 
- 

-------------------
- ✅ - Done
- 🛠️ - In Progress  
- 🚧 - Under Construction  
- ⏳ - Ongiong
-------------------

## 🔗 Related Repositories

- ☕ **Core Java Practice**  
  [Java_Tests →](https://github.com/kumar-w0rkspace/Java_Tests)  
  Practice programs and foundational Java concepts for QA automation.

- 🧪 **Selenium Basics**  
  [Selenium_Basics →](https://github.com/kumar-w0rkspace/Selenium_Basics)  
  Hands-on Selenium WebDriver examples covering UI automation fundamentals.


## 🙋‍♂️ Author

👤 Arun Kumar M.S.
📫 Connect: [LinkedIn](https://www.linkedin.com/in/kumar-tvm)
