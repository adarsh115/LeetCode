# Preorder Traversal
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a&nbsp;binary tree, find&nbsp;its&nbsp;preorder traversal.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
&nbsp; &nbsp; &nbsp; &nbsp; 1 &nbsp; &nbsp; &nbsp;
      /&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    4 &nbsp; &nbsp;
  /&nbsp; &nbsp; \ &nbsp; 
4&nbsp; &nbsp; &nbsp; &nbsp;2
<strong>Output: </strong>1 4 4 2</span><span style="font-size:22px">&nbsp;</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/preorder-traversal/1&amp;title=Preorder%20Traversal%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%201%20%C2%A0%20%C2%A0%20%C2%A0%0A%20%20%20%20%20%20%2F%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%20%0A%20%20%20%204%20%C2%A0%20%C2%A0%0A%20%20%2F%C2%A0%20%C2%A0%20%5C%20%C2%A0%20%0A4%C2%A0%20%C2%A0%20%C2%A0%20%C2%A02%0AOutput%3A%201%204%204%202%C2%A0%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
       6
&nbsp;    /   \
&nbsp;   3     2
&nbsp;    \   / 
&nbsp;     1 2
<strong>Output: </strong>6 3 1 2 2&nbsp;</span>

</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/preorder-traversal/1&amp;title=Preorder%20Traversal%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%20%20%20%20%20%20%206%0A%C2%A0%20%20%20%20%2F%20%20%20%5C%0A%C2%A0%20%20%203%20%20%20%20%202%0A%C2%A0%20%20%20%20%5C%20%20%20%2F%20%0A%C2%A0%20%20%20%20%201%202%0AOutput%3A%206%203%201%202%202%C2%A0%0A%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You just have to complete the function <strong>preorder() </strong>which takes the root node of the tree as input and returns an array containing the preorder traversal of the tree.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 10<sup>4</sup><br>
0 &lt;= Data of a node &lt;= 10<sup>5</sup></span></p>
</div>