# API Testing – Kredily QA Engineer Intern Assessment

## 1. Overview

As part of the QA assessment, I performed API testing using **Postman**.

The objective of this activity was to verify API functionality by testing different request methods, validating response status codes and response data, and covering both **positive and negative test scenarios**.

The Postman collection containing my API testing work can be accessed here:

**Postman Collection:**
https://ahachibatti-7730698.postman.co/workspace/Anuja-Hachibatti's-Workspace~4809c9ac-a028-4f28-8f1d-1d297632a8a8/collection/58187245-6e8f3e1c-003f-4e43-b27e-c9048a865c0d?action=share&source=copy-link&creator=58187245

---

## 2. Tool Used

* **Tool:** Postman
* **Testing Type:** API Testing
* **Request Formats:** JSON
* **HTTP Methods Tested:** GET, POST
* **Validation:** Status codes, response body, response format and data

---

## 3. API Testing Approach

I followed these steps to perform API testing:

1. Identified the APIs that were accessible for testing.
2. Created a Postman collection named **Kredily QA - API Testing**.
3. Created individual requests for the APIs.
4. Tested valid requests to verify positive scenarios.
5. Tested invalid inputs and invalid IDs to verify negative scenarios.
6. Checked HTTP response status codes.
7. Validated the response body and JSON structure.
8. Added Postman test scripts for automated validations.
9. Executed the complete collection using the Postman Collection Runner.
10. Reviewed the test results and documented the observations.

---

## 4. APIs Tested

### API 1 – Get Users

**Method:** GET

The GET API was tested to verify that user information could be retrieved successfully.

### Positive Scenario

* Sent a valid GET request.
* Verified that the response was received successfully.
* Verified the HTTP status code.
* Verified that the response was returned in JSON format.
* Verified that user information was present in the response.

### Negative Scenario

* Sent a request using an invalid/non-existing user ID.
* Verified that the API returned an appropriate error response.

---

### API 2 – Create User

**Method:** POST

The POST API was tested to verify that a new user could be created using JSON request data.

### Request Body

```json
{
    "name": "Anuja",
    "username": "anuja123",
    "email": "anuja@test.com"
}
```

### Positive Scenario

* Sent a valid POST request with valid user information.
* Verified the response status code.
* Verified that the response contained the submitted user information.
* Verified that an ID was returned in the response.

### Negative Scenario

* Tested the API with missing/empty request data.
* Observed and documented the response returned by the API.

---

### API 3 – Get Single User

**Method:** GET

This API was tested to verify whether information for a specific user could be retrieved.

### Positive Scenario

* Sent a GET request with a valid user ID.
* Verified the status code.
* Verified the user ID in the response.
* Verified that required user details were present.

### Negative Scenario

* Sent a GET request using a non-existing user ID.
* Verified that an appropriate error response was returned.

---

## 5. Positive Test Scenarios

The following positive scenarios were covered:

| Test Case                       | Expected Result               |
| ------------------------------- | ----------------------------- |
| Send valid GET request          | Successful response           |
| Retrieve valid user             | User details returned         |
| Send valid POST request         | User created successfully     |
| Verify JSON response            | Valid JSON response           |
| Verify required response fields | Required fields are present   |
| Verify status code              | Expected status code returned |

---

## 6. Negative Test Scenarios

The following negative scenarios were covered:

| Test Case                       | Expected Result                               |
| ------------------------------- | --------------------------------------------- |
| Send invalid user ID            | Appropriate error response                    |
| Request non-existing user       | Appropriate error response                    |
| Send empty/invalid request body | API should return validation/error response   |
| Verify invalid input handling   | API should handle invalid input appropriately |

---

## 7. Postman Test Scripts

I also added automated assertions in Postman to validate the API responses.

Example:

```javascript
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Response is JSON", function () {
    pm.response.to.be.json;
});
```

For the POST request, I also validated the response data:

```javascript
pm.test("Status code is 201", function () {
    pm.response.to.have.status(201);
});

pm.test("User name is correct", function () {
    let data = pm.response.json();
    pm.expect(data.name).to.eql("Anuja");
});
```

These assertions helped me verify the API results automatically instead of checking every response manually.

---

## 8. What I Validated

During API testing, I mainly validated:

* HTTP method
* Request URL
* Request body
* Response status code
* Response body
* JSON format
* Required fields
* Response data
* Positive scenarios
* Negative scenarios
* Error handling
* Automated Postman assertions

---

## 9. Collection Execution

After creating the API requests and test scripts, I executed the requests using the **Postman Collection Runner**.

I reviewed the test results to make sure that the API requests and assertions were working as expected.

---

## 10. Conclusion

Through this API testing activity, I gained practical experience in using Postman to test REST APIs.

I performed both positive and negative testing and validated API responses using status codes, response data, JSON structure, and automated Postman test scripts.

The complete API testing collection is available at the following link:

**Postman Collection:**
https://ahachibatti-7730698.postman.co/workspace/Anuja-Hachibatti's-Workspace~4809c9ac-a028-4f28-8f1d-1d297632a8a8/collection/58187245-6e8f3e1c-003f-4e43-b27e-c9048a865c0d?action=share&source=copy-link&creator=58187245