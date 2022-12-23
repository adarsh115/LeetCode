# Diameter of a Binary Tree
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).&nbsp;</span></p>

<p><span style="font-size:18px"><a href="http://geeksforgeeks.org/wp-content/uploads/tree_diameter.GIF"><img alt="" class="aligncenter size-full wp-image-5737" src="https://contribute.geeksforgeeks.org/wp-content/uploads/diameter.jpg" style="height:319px; width:635px" title="tree_diameter"></a></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;   1
 &nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;\
 &nbsp;&nbsp; 2 &nbsp;&nbsp; 3
<strong>Output: </strong>3</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1&amp;title=Diameter%20of%20a%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%C2%A0%C2%A0%20%20%201%0A%20%C2%A0%C2%A0%C2%A0%20%2F%C2%A0%C2%A0%5C%0A%20%C2%A0%C2%A0%202%20%C2%A0%C2%A0%203%0AOutput%3A%203%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp; \
 &nbsp;&nbsp;&nbsp;&nbsp; 20&nbsp;&nbsp;&nbsp; 30
 &nbsp;&nbsp; /&nbsp;&nbsp; \ 
&nbsp;&nbsp; 40&nbsp;&nbsp; 60
<strong>Output: </strong>4
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1&amp;title=Diameter%20of%20a%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A010%0A%20%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20%2F%C2%A0%C2%A0%20%5C%0A%20%C2%A0%C2%A0%C2%A0%C2%A0%2020%C2%A0%C2%A0%C2%A0%2030%0A%20%C2%A0%C2%A0%20%2F%C2%A0%C2%A0%20%5C%20%0A%C2%A0%C2%A0%2040%C2%A0%C2%A0%2060%0AOutput%3A%204%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You need to <strong>complete </strong>the <strong>function diameter()&nbsp;</strong>that takes <strong>root&nbsp;</strong>as <strong>parameter </strong>and <strong>returns </strong>the <strong>diameter</strong>.<br>
<br>
<strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the Tree).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 10000<br>
1 &lt;= Data of a node &lt;= 1000</span></p>

<p dir="ltr">&nbsp;</p>
</div>