# Level order traversal
## Easy
<div class="problems_problem_content__Xm_eO"><p>Given a binary tree, find its level order traversal.<br>
Level order traversal of a tree is <a href="http://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/">breadth-first traversal f</a>or the tree.</p>

<p><br>
<strong>Example 1:</strong></p>

<pre style="margin-bottom: 0px;"><strong>Input:
</strong>&nbsp;&nbsp;  1
 &nbsp;/&nbsp;&nbsp;&nbsp;\ 
&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp; 2
<strong>Output:</strong>1 3 2
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/level-order-traversal/1&amp;title=Level%20order%20traversal%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%20%201%0A%20%C2%A0%2F%C2%A0%C2%A0%C2%A0%5C%20%0A%C2%A03%C2%A0%C2%A0%C2%A0%C2%A0%202%0AOutput%3A1%203%202%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong>Example 2:</strong></p>

<pre style="margin-bottom: 0px;"><strong>Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 10
 &nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \
 &nbsp;  20&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 30
&nbsp; /&nbsp;&nbsp; \
 40&nbsp;&nbsp; 60
<strong>Output:</strong>10 20 30 40 60
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/level-order-traversal/1&amp;title=Level%20order%20traversal%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20%C2%A0%2010%0A%20%C2%A0%C2%A0%C2%A0%20%2F%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20%5C%0A%20%C2%A0%20%2020%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%2030%0A%C2%A0%20%2F%C2%A0%C2%A0%20%5C%0A%2040%C2%A0%C2%A0%2060%0AOutput%3A10%2020%2030%2040%2060%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<strong>Your Task:</strong><br>
You don't have to take any input. Complete the function <strong>levelOrder()</strong> that takes the root node&nbsp;as input parameter and returns a list of integers&nbsp;containing the level order traversal of the given Binary Tree.</p>

<p><br>
<strong>Expected Time Complexity:&nbsp;</strong>O(n)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(n)</p>

<p><br>
<strong>Constraints:</strong><br>
1 ≤&nbsp;Number of nodes ≤&nbsp;105<br>
1 ≤&nbsp;Data of a node ≤&nbsp;105</p>
</div>