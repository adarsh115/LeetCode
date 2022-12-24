# Check for Balanced Tree
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a binary tree, find if it is height balanced or not.&nbsp;<br>
A tree is height balanced if difference between heights of left and right subtrees is <strong>not more than one</strong> for all nodes of tree.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>A height balanced tree</strong><br>
&nbsp; &nbsp; &nbsp; &nbsp; 1<br>
&nbsp; &nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp; \<br>
&nbsp;&nbsp; 10&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 39<br>
&nbsp; /<br>
5</span></p>

<p><span style="font-size:18px"><strong>An unbalanced tree</strong><br>
&nbsp; &nbsp; &nbsp; &nbsp; 1<br>
&nbsp; &nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp;<br>
&nbsp;&nbsp; 10&nbsp;&nbsp;&nbsp;<br>
&nbsp; /<br>
5</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1
 &nbsp;&nbsp;&nbsp;/
&nbsp;&nbsp; 2
 &nbsp; &nbsp;\
 &nbsp; &nbsp; 3&nbsp;
<strong>Output: </strong>0<strong>
Explanation: </strong>The max difference in height
of left subtree and right subtree is 2,
which is greater than 1. Hence unbalanced</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1&amp;title=Check%20for%20Balanced%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%201%0A%20%C2%A0%C2%A0%C2%A0%2F%0A%C2%A0%C2%A0%202%0A%20%C2%A0%20%C2%A0%5C%0A%20%C2%A0%20%C2%A0%203%C2%A0%0AOutput%3A%200%0AExplanation%3A%20The%20max%20difference%20in%20height%0Aof%20left%20subtree%20and%20right%20subtree%20is%202%2C%0Awhich%20is%20greater%20than%201.%20Hence%20unbalanced%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10
 &nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp; \
 &nbsp;&nbsp;&nbsp;20&nbsp;&nbsp; 30 
&nbsp;&nbsp;/&nbsp;&nbsp; \
 40&nbsp;&nbsp; 60
<strong>Output:</strong> 1<strong>
Explanation: </strong>The max difference in height
of left subtree and right subtree is 1.
Hence balanced.<strong> </strong></span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1&amp;title=Check%20for%20Balanced%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A010%0A%20%C2%A0%C2%A0%C2%A0%C2%A0%2F%C2%A0%C2%A0%20%5C%0A%20%C2%A0%C2%A0%C2%A020%C2%A0%C2%A0%2030%20%0A%C2%A0%C2%A0%2F%C2%A0%C2%A0%20%5C%0A%2040%C2%A0%C2%A0%2060%0AOutput%3A%201%0AExplanation%3A%20The%20max%20difference%20in%20height%0Aof%20left%20subtree%20and%20right%20subtree%20is%201.%0AHence%20balanced.%20%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You don't need to take input. Just complete the function<strong> isBalanced() </strong>that takes root <strong>node </strong>as parameter and returns <strong>true, </strong>if the tree is balanced else returns <strong>false</strong>.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 10<sup>5</sup><br>
0 &lt;= Data of a node &lt;= 10<sup>6</sup></span></p>

<p><span style="font-size:18px"><strong>Expected time complexity:&nbsp;</strong>O(N)</span><br>
<span style="font-size:18px"><strong>Expected auxiliary space:&nbsp;</strong>O(h) , where h = height of tree</span></p>
</div>