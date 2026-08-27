<h2><a href="https://www.geeksforgeeks.org/problems/excel-sheet-part-21138/1">Excel Column Number from Name</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a string <strong>s</strong> representing the column title of an Excel sheet, return its corresponding column number.</span></p>
<p><span style="font-size: 18px;">In Excel, columns are labeled using uppercase English letters as follows:</span></p>
<p><strong><span style="font-size: 18px;">A → 1, B → 2, ..., Z → 26, AA → 27, AB → 28, ..., AZ → 52, BA → 53, ...</span></strong></p>
<p><span style="font-size: 18px;">The column titles follow a 1-indexed base-26 system, where the letters A–Z represent the values 1–26 respectively.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "A"
<strong>Output: </strong>1<br></span><span style="font-size: 14pt;"><strong>Explanation</strong>: The column title "A" corresponds to column number 1.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "AA"
<strong>Output: </strong>27<br></span><strong style="font-size: 14pt;">Explanation</strong><span style="font-size: 14pt;">: </span><span style="font-size: 18.6667px;">Since Z corresponds to column number 26, the next column title is AA, which corresponds to column number 27.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s|&nbsp;</span><span style="font-size: 18px;">≤ </span><span style="font-size: 18px;">7</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Number Theory</code>&nbsp;