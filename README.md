# Assignment 2 — Boyer–Moore Majority Vote Algorithm

## Overview
This project implements the **Boyer–Moore Majority Vote algorithm**, which identifies the majority element in an integer array in linear time and constant space.  
It was developed as part of **Assignment 2 (Pair 3)** for the course *Design and Analysis of Algorithms (RIAA 2310)* under the supervision of **Aidana Aidynkyzy**.

## Algorithm Description
The algorithm iterates through the array maintaining a candidate element and a counter:
- If the counter is 0, the current element becomes the new candidate.
- If the element equals the candidate, the counter increases.
- Otherwise, the counter decreases.

At the end of the pass, the candidate is the majority element (appearing more than ⌊n/2⌋ times).

**Time complexity:** Θ(n)  
**Space complexity:** Θ(1)  
**Best / Worst / Average case:** All Θ(n)

## Implementation Structure
The project consists of the following main components:
- `BoyerMooreMajority.java` — core algorithm implementation
- `PerformanceTracker.java` — measures time, comparisons, and memory accesses
- `BenchmarkRunner.java` — runs performance tests on random data
- `BoyerMooreMajorityTest.java` — unit tests using JUnit 5
- `docs/analysis-report.pdf` — detailed algorithm analysis
- `docs/comparison-summary.pdf` — comparison with other algorithms  



src/

main/java/edu/astanait/algorithms/boyermoore/
 
      BoyerMooreMajority.java

      PerformanceTracker.java

      BenchmarkRunner.java


test/java/edu/astanait/algorithms/boyermoore/

      BoyerMooreMajorityTest.java


docs/

      analysis-report.pdf

      comparison-summary.pdf


## Empirical Validation
Benchmarks were executed on multiple input sizes (10³–10⁶).  
Collected metrics include:
- Total execution time (ns)
- Element accesses
- Comparisons performed

### Results Summary
| Input Size | Time (ms) | Accesses | Comparisons |
|-------------|-----------|-----------|--------------|
| 1,000       | 0.2       | 1,000     | 600          |
| 10,000      | 2.1       | 10,000    | 6,000        |
| 100,000     | 21.7      | 100,000   | 60,000       |

The measured results confirm linear scaling consistent with Θ(n).

## Git Workflow
- `main` — release-ready branch
- `feature/algorithm` — Boyer–Moore implementation
- `feature/testing` — test suite
- `feature/metrics` — performance tracking
- `feature/cli` — command-line benchmarking interface

Commits follow the course guidelines (`feat()`, `test()`, `docs()`, `fix()`, etc.).

## Reports
[Individual Algorithm Analysis Report — Boyer–Moore Majority Vote Algorithm](docs/analysis-report.pdf)  
[Comparison Summary Report](docs/comparison-summary.pdf)

## Authors
- **Aset Syrgabaev** — Algorithm design, benchmarking, and documentation
- **Assem Tutkabay** — Testing, validation, and report preparation

## Course Information
*Design and Analysis of Algorithms (RIAA 2310)*  
Instructor: **Aidana Aidynkyzy**  
Fall Semester 2025 — Astana IT University

## Acknowledgment
This project was developed by **Aset Syrgabaev** and **Assem Tutkabay**  
as part of the *Design and Analysis of Algorithms (RIAA 2310)* course  
at **Astana IT University**, Academic Year 2025–2026.
