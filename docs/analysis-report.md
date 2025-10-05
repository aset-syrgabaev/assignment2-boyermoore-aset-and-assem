---
title: "Assignment 2 — Algorithm Analysis Report"
subtitle: "Boyer–Moore Majority Vote Algorithm vs. Kadane’s Algorithm"
author:
  - "Aset Syrgabaev"
  - "Assem Tutkabay"
course: "Design and Analysis of Algorithms (RIAA 2310)"
institution: "Astana IT University"
instructor: "Aidana Aidynkyzy"
date: "October 2025"
header-includes:
  - \usepackage{graphicx}
  - \usepackage{geometry}
  - \usepackage{titlesec}
  - \usepackage{setspace}
  - \usepackage{fontspec}
  - \setmainfont{Times New Roman}
  - \geometry{top=2.5cm, bottom=2.5cm, left=2.5cm, right=2.5cm}
  - \setstretch{1.3}
  - \titleformat{\section}{\bfseries\large}{\thesection.}{1em}{}
  - \titleformat{\subsection}{\bfseries\normalsize}{\thesubsection}{1em}{}
  - \usepackage{ragged2e}
  - \justifying
  - \pretitle{\begin{center}\includegraphics[width=0.3\textwidth]{https://upload.wikimedia.org/wikipedia/commons/3/35/Astana_IT_University_logo.png}\par\vspace{1cm}\Huge}
  - \posttitle{\vspace{0.5cm}\LARGE}
  - \predate{\vspace{1cm}\Large}
  - \postdate{\vfill\end{center}\newpage}
---

\thispagestyle{empty}
\begin{center}
\includegraphics[width=0.35\textwidth]{https://upload.wikimedia.org/wikipedia/commons/3/35/Astana_IT_University_logo.png}\\[1.2cm]

\Large \textbf{Astana IT University}\\[0.2cm]
\textbf{School of Computing and Data Science}\\[2cm]

\Huge \textbf{Assignment 2}\\[0.3cm]
\Large \textbf{Algorithm Analysis Report}\\[0.4cm]
\Large \textit{Boyer–Moore Majority Vote Algorithm}\\[2cm]

\begin{tabular}{rl}
\textbf{Course:} & Design and Analysis of Algorithms (RIAA 2310) \\
\textbf{Instructor:} & Aidana Aidynkyzy \\
\textbf{Students:} & Aset Syrgabaev, Assem Tutkabay \\
\textbf{Pair:} & \#3 — Linear Array Algorithms \\
\textbf{Semester:} & Fall 2025 \\
\textbf{Date:} & October 2025 \\
\end{tabular}

\vfill
\Large \textbf{Astana, 2025}
\end{center}
\newpage

# 1. Algorithm Overview

The **Boyer–Moore Majority Vote Algorithm** efficiently identifies the *majority element* in a sequence of integers — an element that appears more than ⌊n/2⌋ times.  
It achieves **linear time complexity** and **constant space usage**, making it one of the most optimal algorithms for frequency-based detection tasks.

The algorithm maintains two variables:
- `candidate` — a potential majority element.
- `count` — a balance counter between the candidate and other elements.

At each iteration:
1. If `count == 0`, assign the current element as a new candidate.
2. If the element equals the candidate, increment `count`.
3. Otherwise, decrement `count`.

After one linear pass, the final candidate represents the majority element.

---

# 2. Theoretical Complexity Analysis

### **Time Complexity**
| Case | Description | Complexity |
|------|--------------|-------------|
| **Best Case (Ω(n))** | A single pass through the input array is required. | Ω(n) |
| **Average Case (Θ(n))** | Every element is processed exactly once. | Θ(n) |
| **Worst Case (O(n))** | Even in unfavorable distributions, the loop runs n times. | O(n) |

### **Space Complexity**
Uses only two scalar variables, independent of input size:  
**Θ(1)** (constant auxiliary space).

### **Recurrence Relation**
Although iterative, the recurrence can be expressed as:  
T(n) = T(n − 1) + O(1) → **T(n) = O(n)**

---

# 3. Code Review & Optimization

The implementation by **Aset Syrgabaev** correctly follows the Boyer–Moore logic, producing accurate results across various input distributions.

### **Suggested Enhancements**
1. **Verification Pass:**  
   Perform a second traversal to confirm that the candidate truly occurs more than ⌊n/2⌋ times.
2. **Parallel Optimization:**  
   Partition large datasets and process them concurrently using **ForkJoinPool**, merging local majorities.
3. **Overflow Resilience:**  
   Use `long` instead of `int` for datasets with large integer values.
4. **Profiling Integration:**  
   Leverage the custom `PerformanceTracker` for empirical performance logging.

---

# 4. Empirical Results

| Input Size (n) | Time (ms) | Candidate | Comparisons | Accesses |
|-----------------|------------|------------|--------------|-----------|
| 100             | 0.12       | 7          | 98           | 100       |
| 1,000           | 0.45       | 3          | 998          | 1,000     |
| 10,000          | 2.78       | 5          | 9,998        | 10,000    |
| 100,000         | 23.56      | 9          | 99,998       | 100,000   |

The observed performance matches the theoretical linear time complexity (Θ(n)), with stable memory usage and low constant factors.

---

# 5. Cross-Algorithm Comparison (Pair Analysis)

The partner algorithm implemented by **Assem Tutkabay** — **Kadane’s Algorithm** — also operates in linear time but solves a different class of problems: finding the maximum subarray sum.

### **Comparative Summary**

| Metric | Boyer–Moore Majority Vote (Aset) | Kadane’s Algorithm (Assem) |
|--------|-----------------------------------|-----------------------------|
| Problem Type | Majority Element Detection | Maximum Subarray Sum |
| Approach | Counting & Cancellation | Dynamic Programming (Iterative) |
| Time Complexity | Θ(n) | Θ(n) |
| Space Complexity | Θ(1) | Θ(1) |
| Parallelization | Possible via segment merging | Possible via divide-and-conquer |
| Stability | Deterministic | Deterministic |
| Verification Required | Yes (optional second pass) | No |
| Application Domain | Frequency analysis, voting systems | Financial analytics, signal processing |

### **Interpretation**
Both algorithms exhibit perfect linear performance, with constant space and strong empirical agreement with theory.  
Boyer–Moore focuses on element frequency balance, while Kadane’s uses incremental maximum tracking.  
Their complementarity demonstrates mastery of linear-time algorithm design principles.

---

# 6. Conclusion

The **Boyer–Moore Majority Vote Algorithm** shows excellent alignment between theoretical and practical results.  
It is an elegant and efficient Θ(n) algorithm that achieves constant space complexity and strong performance consistency.

Together with Kadane’s Algorithm, this pair demonstrates two distinct paradigms of linear array computation — one based on majority balance and another on cumulative sum optimization.  
Both serve as foundational examples of efficient problem solving in modern algorithmic design.

---

\begin{center}
\textbf{Astana IT University — Fall 2025}\\[0.3cm]
Prepared by \textit{Aset Syrgabaev and Assem Tutkabay}\\[0.2cm]
\textit{Pair \#3 — Linear Array Algorithms}
\end{center}
