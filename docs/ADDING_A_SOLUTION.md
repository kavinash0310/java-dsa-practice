# How to add a solution

Keep each solution small, easy to find, and easy to explain.

## 1. Choose a topic and class name

Use the topic package and the problem’s short title. For example:

~~~text
src/main/java/com/kavinash/dsaprac/arrays/TwoSum.java
src/test/java/com/kavinash/dsaprac/arrays/TwoSumTest.java
~~~

Use a descriptive Java class name rather than naming every class `Solution`. Keep the method signature close to LeetCode’s required signature.

## 2. Add a short explanation

Add a JavaDoc comment above the method, or write the explanation in the topic page. Include:

- The main idea or pattern.
- Why it works, in a few sentences.
- Time and extra-space complexity.
- Edge cases worth testing.

Do not paste the full problem statement. Link to it from the topic page.

## 3. Add focused tests

Cover the normal case and useful edge cases. Tests should be deterministic and should not depend on network access.

## 4. Update the topic page

Add one row to the relevant table:

~~~markdown
| [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | Hash map | O(n) | O(n) |
~~~

Use the actual complexity for your implementation.

## 5. Run, inspect, commit

~~~bash
mvn test
git status
git diff
git add src topics progress
git commit -m "feat(arrays): add two-sum solution and tests"
git push
~~~

Before pushing, check that the code is yours to publish and that no secrets or private information are included.

## Problem notes template

Copy [PROBLEM_NOTES_TEMPLATE.md](../templates/PROBLEM_NOTES_TEMPLATE.md) into your own scratch notes if it helps. Keep public topic pages concise; the code and tests are the source of truth.
