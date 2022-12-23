# Overlapping Intervals
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a collection of Intervals, the task is to merge all of the overlapping Intervals.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="margin-bottom: 0px;"><strong><span style="font-size:18px">Input:</span></strong><span style="font-size:18px">
Intervals = {{1,3},{2,4},{6,8},{9,10}}
<strong>Output: </strong>{{1, 4}, {6, 8}, {9, 10}}<strong>
Explanation: </strong>Given intervals: [1,3],[2,4]
[6,8],[9,10], we have only two overlapping
intervals here,[1,3] and [2,4]. Therefore
we will merge these two and return [1,4],
[6,8], [9,10].</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/8a644e94faaa94968d8665ba9e0a80d1ae3e0a2d/1&amp;title=Overlapping%20Intervals%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AIntervals%20%3D%20%7B%7B1%2C3%7D%2C%7B2%2C4%7D%2C%7B6%2C8%7D%2C%7B9%2C10%7D%7D%0AOutput%3A%20%7B%7B1%2C%204%7D%2C%20%7B6%2C%208%7D%2C%20%7B9%2C%2010%7D%7D%0AExplanation%3A%20Given%20intervals%3A%20%5B1%2C3%5D%2C%5B2%2C4%5D%0A%5B6%2C8%5D%2C%5B9%2C10%5D%2C%20we%20have%20only%20two%20overlapping%0Aintervals%20here%2C%5B1%2C3%5D%20and%20%5B2%2C4%5D.%20Therefore%0Awe%20will%20merge%20these%20two%20and%20return%20%5B1%2C4%5D%2C%0A%5B6%2C8%5D%2C%20%5B9%2C10%5D.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><strong><span style="font-size:18px">Input:</span></strong><span style="font-size:18px">
Intervals = {{6,8},{1,9},{2,4},{4,7}}
<strong>Output: </strong>{{1, 9}}</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/8a644e94faaa94968d8665ba9e0a80d1ae3e0a2d/1&amp;title=Overlapping%20Intervals%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AIntervals%20%3D%20%7B%7B6%2C8%7D%2C%7B1%2C9%7D%2C%7B2%2C4%7D%2C%7B4%2C7%7D%7D%0AOutput%3A%20%7B%7B1%2C%209%7D%7D" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function<strong> overlappedInterval()</strong> that takes the list N intervals&nbsp;as input parameters and returns sorted list&nbsp;of intervals after merging.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N*Log(N)).<br>
<strong>Expected Auxiliary Space:</strong> O(Log(N)) or O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 100<br>
0 ≤ x ≤ y ≤ 1000</span></p>
</div>