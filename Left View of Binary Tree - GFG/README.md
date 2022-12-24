# Left View of Binary Tree
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function <strong>leftView()</strong>, which accepts root of the tree as argument.</span></p>

<p><span style="font-size:18px">Left view of following tree is 1 2 4 8.</span></p>

<p><span style="font-size:18px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp; \<br>
&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3<br>
&nbsp;&nbsp; /&nbsp;&nbsp; &nbsp; \ &nbsp;&nbsp; /&nbsp;&nbsp;&nbsp; \<br>
&nbsp; 4&nbsp;&nbsp;&nbsp;&nbsp; 5&nbsp;&nbsp; 6&nbsp;&nbsp;&nbsp; 7<br>
&nbsp;&nbsp; \<br>
&nbsp;&nbsp;&nbsp;&nbsp; 8&nbsp; &nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>&nbsp;  1
&nbsp;/&nbsp; \
3&nbsp; &nbsp; 2
<strong>Output: </strong>1 3<strong>
</strong></span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1&amp;title=Left%20View%20of%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%C2%A0%20%201%0A%C2%A0%2F%C2%A0%20%5C%0A3%C2%A0%20%C2%A0%202%0AOutput%3A%201%203%0A%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong><img alt="" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190221103723/leftview.jpg" style="height:272px; width:285px">
<strong>Output: </strong>10 20 40
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1&amp;title=Left%20View%20of%20Binary%20Tree%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0A%0AOutput%3A%2010%2020%2040%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You just have to <strong>complete </strong>the function <strong>leftView() </strong>that returns an array containing the nodes that are in&nbsp;the left view. The newline is automatically appended by the driver code.</span><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
0 &lt;= Number of nodes &lt;= 100<br>
1 &lt;= Data of a node &lt;= 1000</span></p>
</div>