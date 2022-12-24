# Postorder Traversal (Iterative)
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a binary tree. Find the postorder traversal of the tree <strong>without using recursion</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
<strong>           </strong>1
<strong>         /   \</strong>
        2     3
      /  \
     4    5

<strong>Output: </strong>4 5 2 3 1
<strong>Explanation:</strong>
Postorder traversal (Left-&gt;Right-&gt;Root) of 
the tree is 4 5 2 3 1.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/postorder-traversal-iterative/1&amp;title=Postorder%20Traversal%20(Iterative)%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%20%20%20%20%20%20%20%20%20%20%201%0A%20%20%20%20%20%20%20%20%20%2F%20%20%20%5C%0A%20%20%20%20%20%20%20%202%20%20%20%20%203%0A%20%20%20%20%20%20%2F%20%20%5C%0A%20%20%20%20%204%20%20%20%205%0A%0AOutput%3A%204%205%202%203%201%0AExplanation%3A%0APostorder%20traversal%20(Left-%3ERight-%3ERoot)%20of%20%0Athe%20tree%20is%204%205%202%203%201.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:</strong>
             8
          /      \
        1          5
         \       /   \
          7     10    6
           \   /
&nbsp;           10 6

<strong>Output: </strong>10 7 1 6 10 6 5 8&nbsp;
<strong>Explanation:</strong>
Postorder traversal (Left-&gt;Right-&gt;Root) 
of the tree is 10 7 1 6 10 6 5 8&nbsp;.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/postorder-traversal-iterative/1&amp;title=Postorder%20Traversal%20(Iterative)%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%20%20%20%20%20%20%20%20%20%20%20%20%208%0A%20%20%20%20%20%20%20%20%20%20%2F%20%20%20%20%20%20%5C%0A%20%20%20%20%20%20%20%201%20%20%20%20%20%20%20%20%20%205%0A%20%20%20%20%20%20%20%20%20%5C%20%20%20%20%20%20%20%2F%20%20%20%5C%0A%20%20%20%20%20%20%20%20%20%207%20%20%20%20%2010%20%20%20%206%0A%20%20%20%20%20%20%20%20%20%20%20%5C%20%20%20%2F%0A%C2%A0%20%20%20%20%20%20%20%20%20%20%2010%206%0A%0AOutput%3A%2010%207%201%206%2010%206%205%208%C2%A0%0AExplanation%3A%0APostorder%20traversal%20(Left-%3ERight-%3ERoot)%20%0Aof%20the%20tree%20is%2010%207%201%206%2010%206%205%208%C2%A0." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Your task:</strong></span></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>postOrder() </strong>which takes the root of the tree as input and returns a list containing the postorder traversal of the tree, calculated<strong> without using recursion.</strong></span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected time complexity: </strong>O(N)</span></div>

<div><span style="font-size:18px"><strong>Expected auxiliary space: </strong>O(N)</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Constraints:</strong></span></div>

<div><span style="font-size:18px">1 &lt;= Number of nodes &lt;= 10<sup>5</sup><br>
1 &lt;= Data of a node &lt;= 10<sup>5</sup></span></div>
</div>