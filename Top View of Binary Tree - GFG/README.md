# Top View of Binary Tree
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree</span></p>

<p><span style="font-size:18px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<br>
&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp; \<br>
&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3<br>
&nbsp; /&nbsp; \&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp; \<br>
4&nbsp;&nbsp;&nbsp; 5&nbsp; 6&nbsp;&nbsp; 7</span></p>

<p><span style="font-size:18px">Top view will be: 4 2 1 3 7<br>
<strong>Note: </strong>Return nodes from <strong>leftmost </strong>node to <strong>rightmost </strong>node. Also if 2 nodes are outside the shadow of the tree and are at same position then consider the extreme ones only(i.e. leftmost and rightmost).&nbsp;<br>
For ex -&nbsp;<strong>1 2 3 N 4 5 N 6 N 7 N 8 N 9 N N N N N</strong> will give&nbsp;<strong>8 2 1 3</strong> as answer. Here 8 and 9 are on the same position but 9 will get shadowed.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;     1
  &nbsp;/&nbsp;&nbsp;&nbsp; \
  2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3
<strong>Output: </strong>2 1 3<strong>
</strong></span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1&amp;title=Top%20View%20of%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%20%20%20%201%0A%20%20%C2%A0%2F%C2%A0%C2%A0%C2%A0%20%5C%0A%20%202%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%203%0AOutput%3A%202%201%203%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;      10
 &nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \
  20&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; 30
 /&nbsp;&nbsp; \&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp; &nbsp;&nbsp;\
40&nbsp;&nbsp; 60  90&nbsp; &nbsp;&nbsp;100
<strong>Output: </strong>40 20 10 30 100
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1&amp;title=Top%20View%20of%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%20%20%20%20%2010%0A%20%C2%A0%C2%A0%20%2F%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20%5C%0A%20%2020%C2%A0%20%C2%A0%C2%A0%C2%A0%20%C2%A0%2030%0A%20%2F%C2%A0%C2%A0%20%5C%C2%A0%C2%A0%C2%A0%C2%A0%2F%C2%A0%20%C2%A0%C2%A0%5C%0A40%C2%A0%C2%A0%2060%20%2090%C2%A0%20%C2%A0%C2%A0100%0AOutput%3A%2040%2020%2010%2030%20100%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">Since this is a function problem. You don't have to take input. Just complete the function<strong>&nbsp;topView() </strong>that takes <strong>root node </strong>as parameter and returns a list of nodes visible from the top view from left to right.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(NlogN)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤&nbsp;N ≤&nbsp;10<sup>5</sup><br>
1 ≤ Node Data ≤&nbsp;10<sup>5</sup></span><br>
&nbsp;</p>
</div>