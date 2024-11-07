# Fisher-Yates Shuffling Algorithm

### Repository: [TheAlgorithms - Java](https://github.com/TheAlgorithms/Java)

### Feature Request:
**Add Fisher-Yates Shuffling Algorithm**  
This feature request proposes adding a Fisher-Yates Shuffling Algorithm to the repository. The Fisher-Yates Shuffling Algorithm is a widely used method for randomly shuffling elements in a list. It ensures that each permutation of the list is equally probable, making it ideal for scenarios where unbiased randomization is needed.

This implementation provides a simple, efficient solution for shuffling any list of elements in Java, making it a valuable addition to the repository.

---

## Algorithm Overview

The **Fisher-Yates algorithm** iterates through the array, swapping each element with a randomly selected element that has not been shuffled yet. This guarantees that every possible permutation of the array elements is equally likely, providing a true random shuffle.

**Key Features**
- Efficient Shuffling in O(n): The algorithm shuffles an array of elements in linear time, making it efficient even for large lists.
- In-place Operation: Requires no additional space beyond the input list, ensuring O(1) auxiliary space complexity.
- Java Best Practices: Follows clean, modular code principles for maintainability and readability.

---

## Implementation Details

The implementation will include:
- Initialize:
  - Start with a list or array of elements that you want to shuffle.
  - If the array is empty or has only one element, there’s nothing to shuffle, so we can return the array as it is.
  
- Set Up Randomization:
  - Create a random number generator that will be used to pick indices in the array.

- Shuffle by Swapping Elements:
  - Begin at the last element of the array.
  - For each element in the array (moving backwards), randomly pick an index from the start of the array up to the current element’s position.
  - Swap the element at the current position with the element at the randomly chosen index.
  - Continue this process until every element in the array has been swapped at least once.

- Completion:
  - By the end of this process, each element has had an equal chance of being placed in any position, resulting in a completely shuffled array.

- Display Results (if testing):
  - Before starting the shuffle, print the array to show the original order.
  - After shuffling, print the array again to display the new randomized order.

---

## Contribution Details

### Branch Information:
- **Target Branch:** `main`

### Commit Messages:
Each commit will contain detailed messages to explain the progress made on the feature request, including code implementation, testing, and refactoring.

---

**Testing and Validation**

The implementation has been tested to ensure accurate and unbiased shuffling across various cases.

Test Cases
  - Standard Lists: Mixed data types (integers, strings).
  - Edge Cases: Empty arrays and single-element arrays.

Test Environment
  - Testing Framework: JUnit for automated testing.
  - Manual Testing: Ensures randomness over multiple executions.

---

## Milestones and Issues

**Milestone 1: Week 1 - Fisher-Yates Shuffle Algorithm Development**
- Objective: Document progress on the implementation of the Fisher-Yates Shuffle Algorithm, addressing feature development, testing, and preparation for pull request submission.

Issue #7.2: Feature Development
- Tasks:
  - Define the core components and implement the Fisher-Yates Shuffle in Java.
  - Handle input/output specifications for various array configurations, including empty and single-element arrays.

- Progress:
  - The algorithm was implemented with O(n) time complexity, ensuring efficient in-place shuffling.
  - Code was modularized for maintainability, with separate logic for random number generation and swapping.

- Challenges:
  - Special handling was required for cases with empty or single-element arrays to prevent unnecessary operations.

Key Commit: feat: implemented Fisher-Yates shuffle algorithm in Java

Next Steps: Continue refining edge case handling and optimize performance for large datasets.


**Milestone 2: Week 2 - Testing and Validation**

Issue #7.3: Testing and Validation
- Tasks:
  - Create test cases for typical, boundary, and edge scenarios.
  - Use JUnit for unit testing and debugging, verifying the randomness and stability of the shuffle algorithm.

- Progress:
  - Comprehensive test cases were developed, covering arrays with unique elements, duplicates, empty arrays, and large datasets.
  - Verified correctness across edge cases and typical usage, ensuring the algorithm maintains consistent behavior.

Challenges:
  - Addressed challenges with random behavior verification and handling of duplicate elements.

Key Commit: test: added test cases for Fisher-Yates shuffle including edge cases

Next Steps: Perform additional stress tests to ensure the algorithm performs well with large datasets.


**Milestone 3: Week 3 - Pull Request Preparation**

Issue #7.4: Pull Request Submission
- Tasks:
  - Prepare code for pull request submission, ensuring compliance with coding standards.
  - Provide detailed documentation for reviewers, covering algorithm design, edge cases, and test results.

- Progress:
  - Code was thoroughly documented, and issues related to testing and validation were linked for easy review.
  - The pull request includes a summary of changes, challenges encountered, and a checklist of completed tasks.

- Challenges:
  - Ensuring all test cases passed consistently in various environments, with attention to randomness validation.

Key Commit: chore: prepared pull request for Fisher-Yates shuffle algorithm and linked issues

Next Steps: Complete final testing, including performance tests, and gather peer feedback for any necessary refinements.
---

## Pull Request Overview

A pull request will be created to submit the code changes. The pull request will include:
- A description of the algorithm.
- Files impacted by the changes.
- Links to the issue tracker (e.g., **TheAlgorithms#5635**).
- Test results showing successful execution of test cases.

---

## Team Information

- **Team:** Group 1B
- **Work Plan:** Our team follows a structured weekly plan, where each member is responsible for various parts of the algorithm development, testing, and documentation. Collaboration is managed via GitHub and regular code reviews.

---

## License Information

This contribution will follow the **MIT License** guidelines, allowing for free reuse in open-source and proprietary software, with minimal restrictions. For more details on the license, visit [Open Source Initiative - MIT License](https://opensource.org/licenses/MIT).

