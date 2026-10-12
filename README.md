# Java DSA Practice

A focused, topic-wise record of Java solutions to coding interview problems. Each entry should show the reasoning, edge cases, and complexity—not just the final code.

This repository is for steady practice and review. Add solutions you have worked through and can explain in your own words.

## Repository map

- [Topic roadmap](topics/README.md) — data structures, algorithms, and useful Java topics.
- [Daily progress log](progress/README.md) — lightweight record of attempts, reviews, and weekly takeaways.
- [How to add a solution](docs/ADDING_A_SOLUTION.md) — the repeatable workflow.
- [Solution templates](templates/) — copyable notes and test templates.
- `src/main/java` — Java solutions, grouped by topic.
- `src/test/java` — tests for solutions.

## Topics

| Topic | Focus |
|---|---|
| [Arrays and hashing](topics/arrays-and-hashing.md) | Arrays, maps, sets, counting, prefix sums |
| [Strings](topics/strings.md) | Character processing, matching, palindromes |
| [Two pointers](topics/two-pointers.md) | Opposing pointers, fast/slow pointers |
| [Sliding window](topics/sliding-window.md) | Fixed and variable windows |
| [Stacks and queues](topics/stacks-and-queues.md) | Monotonic structures, deque, BFS queue |
| [Binary search and sorting](topics/binary-search-and-sorting.md) | Search spaces, bounds, sorting |
| [Linked lists](topics/linked-lists.md) | Reversal, cycles, merge, pointer patterns |
| [Trees and BSTs](topics/trees-and-bsts.md) | Traversals, recursion, properties |
| [Heaps and priority queues](topics/heaps-and-priority-queues.md) | Top-K, scheduling, streaming |
| [Recursion and backtracking](topics/recursion-and-backtracking.md) | Choices, pruning, permutations |
| [Graphs](topics/graphs.md) | BFS, DFS, topological order, shortest paths |
| [Union-Find](topics/union-find.md) | Disjoint sets and connectivity |
| [Greedy algorithms](topics/greedy.md) | Local choices, proof of correctness |
| [Intervals](topics/intervals.md) | Merge, overlap, scheduling |
| [Dynamic programming](topics/dynamic-programming.md) | State, transitions, memoization, tabulation |
| [Tries](topics/tries.md) | Prefix trees and word lookup |
| [Bit manipulation](topics/bit-manipulation.md) | Masks, shifts, XOR |
| [Math and geometry](topics/math-and-geometry.md) | Number theory, coordinates, numeric reasoning |
| [Java collections and language](topics/java-collections-and-language.md) | Collections, comparators, streams, correctness |
| [Design problems](topics/design-problems.md) | Data-structure design and API behavior |

## Add a problem

1. Pick one problem and make an honest attempt before looking at a solution.
2. Submit your solution on LeetCode and keep the code you can explain.
3. Add a Java class under the matching topic package and a JUnit test beside it.
4. Add a short problem entry to that topic page: link, difficulty, pattern, and complexity.
5. Record a brief takeaway in the [progress log](progress/README.md).
6. Run the tests, inspect the diff, then commit and push.

The exact file naming and notes format are in [How to add a solution](docs/ADDING_A_SOLUTION.md).

## Build and test

Requires Java 17+ and Maven 3.8+.

~~~bash
mvn test
~~~

## Suggested daily commit

Use a message that says what changed, for example:

~~~text
feat(arrays): add two-sum solution and tests
~~~

A meaningful review, test, or correction is useful progress too. There is no need to invent a change solely to keep a contribution streak.

## Guidelines

- Write the explanation yourself; use hints and references to learn, then close them and explain the idea from memory.
- Include time and space complexity, plus important edge cases.
- Prefer readable Java and focused tests over clever code.
- Don’t copy full problem statements; link to the original problem instead.
- Keep credentials, employer code, customer data, and private interview material out of this public practice repository.
- Treat this as a learning log, not a claim that every solution is production code.

## Current status

This is the starter structure. Add each problem after you have attempted and understood it.
