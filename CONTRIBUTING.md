# Contributing to the Java Course Exercises repo 🎓💻

Thank you for your interest in contributing to the Java Course Exercises repo! 🚀
This repository is a fork of the [Intro to Java Course](https://github.com/cbfacademy/intro-to-java-course) repository which hosts a collection of coding exercises used across our Java-based bootcamps. This repo includes exercise solutions designed to assist bootcamp supporters **ONLY** and should not be shared with learners.

## How to Contribute ✨

We welcome contributions in the following areas:
- *Code Enhancements:* Fix bugs, improve performance, or add new exercises.
- *Documentation:* Improve explanations, add comments, or enhance readability.
- *Test Cases:* Add missing test cases or improve existing ones.
- *Bug Fixes:* Report and fix issues related to existing exercises.

## 🛠️ Getting Started

### Fork & Clone the repository
1. Fork this repository by clicking the Fork button at the top.
2. Clone your forked repository to your local machine:

```sh
git clone https://github.com/[your-username]/java-course-exercises.git
cd java-course-exercises
```

### Create a Branch
Before making changes, create a new branch following a structured naming convention:

```sh
git switch -c feature/your-feature-name
```

Use a prefix like:
- feature/ for new exercises or improvements.
- bugfix/ for fixing existing problems.
- docs/ for documentation updates.

For CBF staff, use the JIRA ticket number as the branch name, e.g.:

```sh
git switch -c JIRA-1234
```

### Install Dependencies (If Applicable)

Each exercise has its own dependencies; follow the instructions provided in the relevant README.md file.

## ✏️ Making Contributions

### ✅ Code Contributions
 - Follow the repository's coding style and conventions.
 - Ensure your code is well-documented and readable.
 - Include tests if modifying or adding new exercises.
 - Ensure your code runs successfully before submitting.

### 📖 Documentation Contributions
 - Keep documentation clear, concise, and beginner-friendly.
 - Use Markdown for formatting.
 - Ensure spelling and grammar are correct.

### 🔍 Running Tests

If the modified exercise includes tests, run them before submitting any code changes:

```sh
./mvnw clean test
```

Make sure all tests pass before creating a pull request.

### 📩 Submitting a Pull Request (PR)

#### Commit Your Changes
Use [Angular's style](https://github.com/angular/angular/blob/main/CONTRIBUTING.md#-commit-message-guidelines) of [Conventional Commits](https://www.conventionalcommits.org/) for your commit messages:

```sh
<type>(<scope>): <description>

[optional body]
[optional footer(s)]
```

##### Types
- `feat`: A new feature
- `fix`: A bug fix
- `docs`: Documentation only changes
- `style`: Changes that don't affect the meaning of the code (formatting, etc)
- `refactor`: A code change that neither fixes a bug nor adds a feature
- `test`: Adding missing tests or correcting existing tests
- `chore`: Changes to the build process or auxiliary tools

##### Scopes and Solutions
For changes intended for the upstream (student-facing) repository, prefix the scope with "upstream/":

```sh
feat(upstream/algorithms): add binary search exercise
test(upstream/spring-boot): add integration test for REST controller
```

When contributing solutions or modifying existing solutions, please ensure you create separate commits for solution code and upstream changes. This allows student-facing changes to be cleanly cherry-picked into the upstream repository:

```sh
# Commit for student-facing changes
feat(upstream/recursion): add factorial exercise boilerplate and tests

# Separate commit for solution code
feat(recursion): implement factorial solution
```

##### Examples
```sh
feat(algorithms): add recursion exercise
fix(java-primitives): correct array bounds check in sorting exercise
docs(spring-boot): update installation instructions
test(test-driven-development): test edge cases for Character Copier exercise
feat(upstream/collections): add new ArrayList exercise
feat(collections): implement ArrayList exercise solution
```

Keep the message concise and use the body where appropriate to provide a more detailed explanation of the changes.
When entering a commit message in the terminal, you can input multiple lines of text by pressing `Enter` after each line.

#### Push to Your Branch

```sh
git push origin feature/your-feature-name
```

#### Open a Pull Request
 - Go to the "Pull Requests" tab on the main repository.
 - Click "New Pull Request".
 - Select your branch and submit a descriptive title and summary of your changes.
 - Reference any related issues (if applicable).

### 🚦 Review Process
 - Your PR will be reviewed by maintainers and course staff.
 - You may receive feedback or change requests — please address them promptly.
 - Once approved, your changes will be merged.

### 🏆 Contributor Guidelines
 - Be respectful and supportive of all contributors.
 - Follow the Code of Conduct (if applicable).
 - Ensure changes align with the repository's goals and purpose.

## 💬 Need Help?

If you have any questions, open an issue or reach out to the maintainers.

Happy coding! 🎉🚀
The CBF Academy Team
