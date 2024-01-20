### This branch contains automated tests focused on the login functionality 

 *Adding sensitive information like credentials.json to a public GitHub repository is generally not recommended. Credentials provided in this repository are only dummy data and used exclusively for learning purposes. They do not represent any real-world or sensitive information.

### herokuapp basic auth tests

Preconditions: opened http://the-internet.herokuapp.com/

| Steps to reproduce            |                 Expected result                 |
|-------------------------------|:-----------------------------------------------:|
| 1. Locate "Basic Auth" button |                 Button is found                 |
| 2. Click the button           |                New page is open                 |
| 3. Locate modal auth window   |             Modal window popped up              |
| 4. Fill in valid username     |               Username filled in                |
| 5. Fill in valid password     |               Password filled in                |
| 6. Click "Sign in"            | Sign in successful, congratulations page opened |

#### Negative test - herokuapp basic auth - Empty Username:

Preconditions: opened http://the-internet.herokuapp.com/

| Steps to reproduce            |    Expected result     |
|-------------------------------|:----------------------:|
| 1. Locate "Basic Auth" button |    Button is found     |
| 2. Click the button           |    New page is open    |
| 3. Locate modal auth window   | Modal window popped up |
| 4. Leave username field empty |   Username is empty    |
| 5. Fill in password "123"     |   Password filled in   |
| 6. Click "Sign in"            |    Sign in failed,     |

