# Right View of Binary Tree
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary Tree, find&nbsp;<strong>Right view</strong> of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from <strong>right </strong>side.</span></p>

<p><span style="font-size:18px">Right view of following tree is 1 3 7 8.</span></p>

<p><span style="font-size:18px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp; \<br>
&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3<br>
&nbsp;&nbsp; /&nbsp;&nbsp; \&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp; \<br>
&nbsp; 4&nbsp;&nbsp;&nbsp;&nbsp; 5&nbsp;&nbsp; 6&nbsp;&nbsp;&nbsp; 7<br>
&nbsp;&nbsp;&nbsp; \<br>
&nbsp;&nbsp;&nbsp;&nbsp; 8</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;1
 &nbsp; &nbsp;/&nbsp;&nbsp;&nbsp; \
 &nbsp;&nbsp;3 &nbsp;&nbsp;&nbsp;&nbsp; 2
<strong>Output: </strong>1 2
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1&amp;title=Right%20View%20of%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%C2%A0%20%C2%A0%20%C2%A01%0A%20%C2%A0%20%C2%A0%2F%C2%A0%C2%A0%C2%A0%20%5C%0A%20%C2%A0%C2%A03%20%C2%A0%C2%A0%C2%A0%C2%A0%202%0AOutput%3A%201%202%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10
 &nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;\
 &nbsp;20&nbsp; &nbsp;&nbsp; 30
 /&nbsp;&nbsp; \
40&nbsp; 60 
<strong>Output: </strong>10 30 60
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1&amp;title=Right%20View%20of%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%C2%A0%C2%A0%C2%A010%0A%20%C2%A0%C2%A0%C2%A0%2F%C2%A0%C2%A0%C2%A0%5C%0A%20%C2%A020%C2%A0%20%C2%A0%C2%A0%2030%0A%20%2F%C2%A0%C2%A0%20%5C%0A40%C2%A0%2060%20%0AOutput%3A%2010%2030%2060%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">Just complete the <strong>function rightView()&nbsp;</strong>that takes <strong>node </strong>as <strong>parameter </strong>and returns&nbsp;the right view as a list.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the Tree).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ Number of nodes ≤ 10<sup>5</sup></span><br>
<span style="font-size:18px">1 ≤ Data of a node ≤ 10<sup>5</sup></span></p>
</div>