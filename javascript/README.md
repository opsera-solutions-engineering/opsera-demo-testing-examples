# Javascript
## WDIO - Chrome Headless
Tests are all written against WDIO website using the provided examples.

### Execution
1. Run `npm install` in the directory of the WDIO project
2. Run `npm test`

### Results
- Spec Reporter - CLI style reporter in the console
- JSON reporter - JSON style reporter in the console
- JUnit reporter - XML style reporter in the console
- Allure reporter - HTML style reporter in an /allure-results directory

### Report Generation
Run `npm run allure` to create the /allure-report directory and present the results in a web browser on localhost