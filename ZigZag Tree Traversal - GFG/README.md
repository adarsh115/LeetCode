# ZigZag Tree Traversal
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;1
 &nbsp;  &nbsp; /&nbsp; &nbsp;\
     2&nbsp; &nbsp;  3
&nbsp;   / \   /  \
&nbsp;  4   5 6    7
<strong>Output:
</strong>1 3 2 4 5 6 7</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1&amp;title=ZigZag%20Tree%20Traversal%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%C2%A01%0A%20%C2%A0%20%20%C2%A0%20%2F%C2%A0%20%C2%A0%5C%0A%20%20%20%20%202%C2%A0%20%C2%A0%20%203%0A%C2%A0%20%20%20%2F%20%5C%20%20%20%2F%20%20%5C%0A%C2%A0%20%204%20%20%205%206%20%20%20%207%0AOutput%3A%0A1%203%202%204%205%206%207%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;7
 &nbsp; &nbsp; &nbsp; &nbsp;/&nbsp; &nbsp; &nbsp;\
 &nbsp; &nbsp; &nbsp; 9&nbsp; &nbsp; &nbsp; &nbsp;7
 &nbsp; &nbsp; /&nbsp; \&nbsp;    /&nbsp; &nbsp;
&nbsp;  &nbsp;8&nbsp; &nbsp; 8&nbsp; &nbsp;6&nbsp; &nbsp; &nbsp;
 &nbsp; /&nbsp; \
&nbsp; 10&nbsp; &nbsp;9&nbsp;
<strong>Output:
</strong></span><span style="font-size:18px">7 7 9 8 8 6 9 10 </span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1&amp;title=ZigZag%20Tree%20Traversal%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%20%C2%A07%0A%20%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%2F%C2%A0%20%C2%A0%20%C2%A0%5C%0A%20%C2%A0%20%C2%A0%20%C2%A0%209%C2%A0%20%C2%A0%20%C2%A0%20%C2%A07%0A%20%C2%A0%20%C2%A0%20%2F%C2%A0%20%5C%C2%A0%20%20%20%20%2F%C2%A0%20%C2%A0%0A%C2%A0%20%20%C2%A08%C2%A0%20%C2%A0%208%C2%A0%20%C2%A06%C2%A0%20%C2%A0%20%C2%A0%0A%20%C2%A0%20%2F%C2%A0%20%5C%0A%C2%A0%2010%C2%A0%20%C2%A09%C2%A0%0AOutput%3A%0A7%207%209%208%208%206%209%2010%20" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>zigZagTraversal()</strong>&nbsp;which takes the root node of the Binary Tree as its input and returns a list containing the node values as they appear in the&nbsp;Zig-Zag Level-Order Traversal of the Tree.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong><strong>Constraints:</strong></strong><br>
1 &lt;= N &lt;= 10<sup>4</sup></span></p>

<p dir="ltr">&nbsp;</p>
</div>