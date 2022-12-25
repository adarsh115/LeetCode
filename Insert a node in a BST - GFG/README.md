# Insert a node in a BST
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST.&nbsp;<br>
<strong>Note: </strong>If K is already present in the BST, don't modify the BST.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp;2
&nbsp;  /&nbsp;&nbsp; \
&nbsp; 1&nbsp;  &nbsp; 3
K = 4
<strong>Output: </strong>1 2 3 4<strong>
Explanation: </strong>After inserting the node 4
Inorder traversal will be 1 2 3 4.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1?utm_source=gfg&amp;utm_medium=article&amp;utm_campaign=bottom_sticky_on_article&amp;title=Insert%20a%20node%20in%20a%20BST%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%C2%A0%20%C2%A02%0A%C2%A0%20%20%2F%C2%A0%C2%A0%20%5C%0A%C2%A0%201%C2%A0%20%20%C2%A0%203%0AK%20%3D%204%0AOutput%3A%201%202%203%204%0AExplanation%3A%20After%20inserting%20the%20node%204%0AInorder%20traversal%20will%20be%201%202%203%204.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;2
&nbsp; &nbsp; &nbsp;&nbsp;/&nbsp;&nbsp; \
 &nbsp; &nbsp; 1 &nbsp; &nbsp; 3
 &nbsp;  &nbsp; &nbsp; &nbsp;   &nbsp;\
 &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;   &nbsp;6
K = 4
<strong>Output: </strong>1 2 3 4 6<strong>
Explanation: </strong>After inserting the node 4
Inorder traversal of the above tree
will be 1 2 3 4 6.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1?utm_source=gfg&amp;utm_medium=article&amp;utm_campaign=bottom_sticky_on_article&amp;title=Insert%20a%20node%20in%20a%20BST%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%C2%A0%20%C2%A0%20%C2%A0%C2%A02%0A%C2%A0%20%C2%A0%20%C2%A0%C2%A0%2F%C2%A0%C2%A0%20%5C%0A%20%C2%A0%20%C2%A0%201%20%C2%A0%20%C2%A0%203%0A%20%C2%A0%20%20%C2%A0%20%C2%A0%20%C2%A0%20%20%20%C2%A0%5C%0A%20%C2%A0%20%20%C2%A0%C2%A0%20%C2%A0%20%C2%A0%20%20%20%C2%A06%0AK%20%3D%204%0AOutput%3A%201%202%203%204%206%0AExplanation%3A%20After%20inserting%20the%20node%204%0AInorder%20traversal%20of%20the%20above%20tree%0Awill%20be%201%202%203%204%206." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>insert()</strong>&nbsp;which takes the root of the BST and Key K as input parameters&nbsp;and returns the root of the modified BST after inserting K.&nbsp;<br>
<strong>Note: </strong>The generated output contains the inorder traversal of the modified tree.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(Height of the BST).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(Height of the BST).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">1 &lt;= K &lt;= 10<sup>6</sup></span></p>
</div>