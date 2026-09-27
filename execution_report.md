# Kredily – Intern QA Engineer Assignment
## QA Execution & Result Report

**Application:** Kredily HRMS Android APK  
**Assignment duration:** Maximum 2 days  
**Candidate:** Anuja Hachibatti  
**Assessment scope:** Manual/Functional Testing, Bug Reporting, Mobile Automation, API Testing and AI-Assisted QA

## 1. Assignment Requirements

The assessment requires:
- 20 functional test cases covering positive, negative and edge cases.
- Execution of the test cases with recorded results.
- At least 5 genuine bugs, if available, with reproduction steps, expected result, actual result, severity and evidence.
- 5 mobile automation journeys.
- At least 3 accessible APIs with positive and negative scenarios.
- At least one AI-assisted QA activity with the prompt, AI output and validation/changes.
- A GitHub repository containing test cases, bug reports, automation code, API collection/code, evidence, final QA summary and README.

## 2. Important Execution Note

**The email/assessment document specifies the required test scope, but it does not contain actual execution results. Therefore, this report does not invent Pass/Fail results or bugs.**

The test cases are prepared and ready for execution. The `PENDING` status must be replaced with the observed result after the APK is actually tested.

This distinction is important because the assignment specifically asks for **genuine bugs** and executed results.

## 3. Test Execution Summary

| Metric | Result |
|---|---:|
| Planned test cases | 20 |
| Executed | 0 |
| Passed | 0 |
| Failed | 0 |
| Blocked | 0 |
| Pending execution | 20 |
| Genuine bugs confirmed | 0 |
| Execution status | Pending |

### Final result formula

After execution:

**Pass % = Passed / Executed × 100**

**Fail % = Failed / Executed × 100**

Do not count unexecuted cases as Pass or Fail.

## 4. Test Cases

See `test_cases.csv`.

The planned coverage includes:
- Login
- Dashboard
- Attendance / Check-in
- Leave
- Profile
- Network/error handling
- Logout/session behavior

The assessment itself specifically gives Login, Invalid Login, Dashboard validation, Attendance/Check-in and Leave as example mobile-automation journeys.

## 5. Bug Report

Create one report for each confirmed genuine defect.

Recommended fields:

| Field | Value |
|---|---|
| Bug ID | BUG-001 |
| Module | [Actual module] |
| Title | [Short defect title] |
| Severity | Critical / High / Medium / Low |
| Preconditions | [If any] |
| Steps to Reproduce | 1. ... 2. ... 3. ... |
| Expected Result | [What should happen] |
| Actual Result | [What actually happened] |
| Reproducibility | [e.g. 3/3] |
| Environment | Android version/device/app version |
| Evidence | Screenshot/video filename |
| Status | New |

**Do not create five bugs just to meet the number. Report only genuine, reproducible defects.**

## 6. Mobile Automation

The assignment asks for five important user journeys using Appium or another suitable mobile automation framework.

Planned journeys:
1. Valid Login
2. Invalid Login
3. Dashboard validation
4. Attendance / Check-in
5. Leave workflow or another major HRMS workflow

Suggested repository location:

`automation/`

Include:
- Source code
- Configuration
- Test data
- Test execution report
- Screenshots/logs for failed automation where applicable
- Setup instructions

## 7. API Testing

The assignment requires at least three relevant APIs, where accessible, with positive and negative scenarios.

Suggested repository location:

`api-testing/`

Include:
- Postman collection
- Environment file with secrets excluded
- Positive tests
- Negative tests
- Execution evidence/report

**Never commit passwords, access tokens, API keys or other secrets to GitHub.**

## 8. AI-Assisted QA

The assignment requires at least one AI-assisted testing/automation activity.

Suggested activity:
- Use AI to generate an initial set of test scenarios or help create automation code.
- Review the generated output manually.
- Execute/validate it.
- Document corrections.

Required documentation:
1. Prompt used
2. AI-generated output
3. What was changed
4. What was validated
5. Final result

Suggested location:

`ai-assisted-qa/AI_USAGE.md`

## 9. Final QA Summary

This section must be completed after execution.

### Functional Testing
- Total: 20
- Passed: [ ]
- Failed: [ ]
- Blocked: [ ]
- Pass percentage: [ ]%

### Bug Findings
- Genuine bugs found: [ ]
- Critical: [ ]
- High: [ ]
- Medium: [ ]
- Low: [ ]

### Mobile Automation
- Journeys automated: 5
- Passed: [ ]
- Failed: [ ]

### API Testing
- APIs tested: [ ]
- Positive scenarios: [ ]
- Negative scenarios: [ ]

### AI-Assisted QA
- Activity completed: Yes/No
- AI output reviewed and validated: Yes/No

## 10. Overall QA Conclusion

**To be completed after actual execution.**

Example structure:

> The Kredily HRMS Android application was evaluated across functional workflows, mobile automation and API scenarios within the available assessment scope. A total of 20 functional test cases were executed, with [X] passed, [Y] failed and [Z] blocked. [N] genuine defects were identified and documented with reproducible evidence. Five important user journeys were automated, and relevant APIs were tested using positive and negative scenarios. AI was used as an assisting tool and the generated output was manually reviewed and validated.

## 11. Evidence

Store screenshots/videos in:

`evidence/`

Suggested naming:
- `TC-001-valid-login.png`
- `TC-002-invalid-password.png`
- `BUG-001-login-error.png`
- `BUG-001-reproduction.mp4`
- `automation-login.png`

## 12. Repository Structure

```text
Kredily-QA-Assignment/
│
├── README.md
├── test_cases.csv
├── execution_report.md
│
├── bug-reports/
│   └── bug_report.csv
│
├── automation/
│   ├── src/
│   ├── tests/
│   └── README.md
│
├── api-testing/
│   ├── postman_collection.json
│   └── README.md
│
├── ai-assisted-qa/
│   └── AI_USAGE.md
│
└── evidence/
    ├── screenshots/
    └── videos/
```

## 13. Assessment Weight

| Area | Weight |
|---|---:|
| Manual & Functional Testing | 25% |
| Bug Finding & Reporting | 20% |
| Mobile Automation | 30% |
| API Testing | 10% |
| AI Usage | 10% |
| Documentation & Code Quality | 5% |
| **Total** | **100%** |
