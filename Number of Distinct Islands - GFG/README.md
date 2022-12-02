# Number of Distinct Islands
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a boolean 2D matrix <strong>grid&nbsp;</strong>of size <strong>n</strong> * <strong>m</strong>. You have to find the number of distinct islands where a group of connected 1s (horizontally or vertically) forms an island. Two islands are considered to be distinct if and only if one island is not equal to another (not rotated or reflected).</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">grid[][] = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">grid[][] = {{<span style="color:#FF0000">1</span>, <span style="color:#FF0000">1</span>, 0, 0, 0}, 
&nbsp;           {<span style="color:#FF0000">1</span>, <span style="color:#FF0000">1</span>, 0, 0, 0}, 
&nbsp;           {0, 0, 0, <span style="color:#FF0000">1</span>, <span style="color:#FF0000">1</span>}, 
&nbsp;           {0, 0, 0, <span style="color:#FF0000">1</span>, <span style="color:#FF0000">1</span>}}
Same colored islands are equal.
We have 2 equal islands, so we 
have only 1 distinct island.</span>

</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1&amp;title=Number%20of%20Distinct%20Islands%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0Agrid%5B%5D%5B%5D%20%3D%20%7B%7B1%2C%201%2C%200%2C%200%2C%200%7D%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%7B1%2C%201%2C%200%2C%200%2C%200%7D%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%7B0%2C%200%2C%200%2C%201%2C%201%7D%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%7B0%2C%200%2C%200%2C%201%2C%201%7D%7D%0AOutput%3A%0A1%0AExplanation%3A%0Agrid%5B%5D%5B%5D%20%3D%20%7B%7B1%2C%201%2C%200%2C%200%2C%200%7D%2C%20%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B1%2C%201%2C%200%2C%200%2C%200%7D%2C%20%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B0%2C%200%2C%200%2C%201%2C%201%7D%2C%20%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B0%2C%200%2C%200%2C%201%2C%201%7D%7D%0ASame%20colored%20islands%20are%20equal.%0AWe%20have%202%20equal%20islands%2C%20so%20we%20%0Ahave%20only%201%20distinct%20island.%0A%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">grid[][] = {{1, 1, 0, 1, 1},
&nbsp;           {1, 0, 0, 0, 0},
&nbsp;           {0, 0, 0, 0, 1},
&nbsp;           {1, 1, 0, 1, 1}}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">3</span>
<span style="font-size:18px"><strong>Explanation:
</strong>grid[][] = {{<span style="color:#FF0000">1</span>, <span style="color:#FF0000">1</span>, 0, <span style="color:#00FF00">1</span>, <span style="color:#00FF00">1</span>}, 
&nbsp;           {<span style="color:#FF0000">1</span>, 0, 0, 0, 0}, 
&nbsp;           {0, 0, 0, 0, <span style="color:#0000CD">1</span>}, 
&nbsp;           {<span style="color:#00FF00">1</span>, <span style="color:#00FF00">1</span>, 0, <span style="color:#0000FF">1</span>, <span style="color:#0000FF">1</span>}}</span>
<span style="font-size:18px">Same colored islands are equal.
We have 4 islands, but 2 of them
are equal, So we have 3 distinct islands.</span>

</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1&amp;title=Number%20of%20Distinct%20Islands%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0Agrid%5B%5D%5B%5D%20%3D%20%7B%7B1%2C%201%2C%200%2C%201%2C%201%7D%2C%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B1%2C%200%2C%200%2C%200%2C%200%7D%2C%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B0%2C%200%2C%200%2C%200%2C%201%7D%2C%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B1%2C%201%2C%200%2C%201%2C%201%7D%7D%0AOutput%3A%0A3%0AExplanation%3A%0Agrid%5B%5D%5B%5D%20%3D%20%7B%7B1%2C%201%2C%200%2C%201%2C%201%7D%2C%20%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B1%2C%200%2C%200%2C%200%2C%200%7D%2C%20%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B0%2C%200%2C%200%2C%200%2C%201%7D%2C%20%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%20%7B1%2C%201%2C%200%2C%201%2C%201%7D%7D%0ASame%20colored%20islands%20are%20equal.%0AWe%20have%204%20islands%2C%20but%202%20of%20them%0Aare%20equal%2C%20So%20we%20have%203%20distinct%20islands.%0A%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">You don't need to read or print anything. Your task is to complete the function <strong>countDistinctIslands()&nbsp;</strong>which takes the <strong>grid</strong> as an input parameter and returns the total number of <strong>distinct</strong> islands.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n * m)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n * m)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n, m ≤ 500<br>
grid[i][j] == 0 or grid[i][j] == 1</span></p>

<ul>
</ul>
</div>