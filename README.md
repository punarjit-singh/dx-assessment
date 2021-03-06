# Solution for DX Technical Assessment

## Question 2. Coding Best Practices

- Very important to follow the DRY - Do Not Repeat Yourself principles.
- Make the code as usable as possible.
- Set standards for the teams so they can collective work and effectively contribute back to the code base.
- Keep reminding ourselves to stay away from spaghetti and bad code patterns.
- Follow OOPs and avoid use of multiple conditional or switch statements.
- Comment the code properly
- File names must be all lowercase and may include underscores
- All new source files should for logical package patterns e.g. com.dx.selenium.utils. or com.dx.ui.components.
- Import only required dependencies
- Variable naming should be camel case and the name should be self explanatory
example:
```java
dnsConnectionIndex  // Most people know what "DNS" stands for.
referrerUrl
customerId          // "Id" unlikely to be misunderstood.
```
- Class, interface, and typedef names should be written in UpperCamelCase
- Method names should be written in lowerCamelCase
- Any Enum and Constant names are written in UpperCamelCase
- Generate automatic documentation where feasible
- Structure wise keep clear split between app and test code within the same repository.
- gitignore any build or test artefact files.

For test automation specifically:
- Block unwanted network requests by default to make tests even faster
- Shared login methods
- Shared utils
- Shared stub/mock methods
- Tagging tests for @smoke @stubbed @integration
- Document any pending tests.
- Ability Retry tests
- Tweak test duration limits
- Shared API templates
- Clear split between Base and Test Layer
- Set config for the framework
- Parallel execution
- Multi view port testing
- Visual Tests where feasible
- Stub and block actual form submissions
- Encrypt Prod Data
- Add capabilities to remount UI components so server rendered backend response can be mocked.
- Add Git Hooks to notify committer about mandatory transactions
- Automatic Mock Data generation
- Automatic PR checklist to spread general awareness on things to avoid, including a few straightforward items that result in immediate PR rejection, e.g. a duplicate method.
- Test the test code. Motivate teams to treat the test code as production quality code.
- CI code reuse

## Question 3. Role of QE within agile cross functional team

Before explaining the day to day activities of a QE, I would mention some really important aspects of being a successful Quality Engineer.
- Quality Engineers are required to take care of the over process improvements, code quality and test innovations.
- QE should take ownership tp0 compliment the developers while working cross-functionally hand in hand.
- To achieve in-sprint test automation, it's very important that QE motivates the team to achieve this and creates a cross-functional test contribution environment.
- QE should be able to motivate the team to make the app most testable
- Regular innovations are really important - the team should work towards improving efficiency by making good use of technology overall.

A typical day for a QE:
- Start by checking the regularly running regression automation scripts. See if there's anything alarming and investigate if required.
- Really important to perform detailed code reviews from app code as there's always something to learn from the code or the comments.
- Create and maintain the Quality Engineering Strategy for the team.