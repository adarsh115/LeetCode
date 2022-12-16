# Delete a Node in Single Linked List
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a singly linked list and an integer x.Delete x<sup>th</sup> node from the&nbsp;singly&nbsp;linked list. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span><span style="font-size:18px"><strong> </strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: </strong>1 -&gt; 3 -&gt; 4 
&nbsp;     </span> <span style="font-size:18px">x = 3</span>
<span style="font-size:18px"><strong>Output: </strong>1 -&gt; 3</span>
<span style="font-size:18px"><strong>Explanation:
</strong></span><span style="font-size:18px">After deleting the node at 3rd
</span><span style="font-size:18px">position (1-base indexing), the
</span><span style="font-size:18px">linked list is as 1 -&gt; 3. </span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=delete-a-node-in-single-linked-list&amp;title=Delete%20a%20Node%20in%20Single%20Linked%20List%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%201%20-%3E%203%20-%3E%204%20%0A%C2%A0%20%20%20%20%20%20x%20%3D%203%0AOutput%3A%201%20-%3E%203%0AExplanation%3A%0AAfter%20deleting%20the%20node%20at%203rd%0Aposition%20(1-base%20indexing)%2C%20the%0Alinked%20list%20is%20as%201%20-%3E%203.%20%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: </strong>1 -&gt; 5 -&gt; 2 -&gt; 9 </span>
<span style="font-size:18px">x = 2<strong>
Output: </strong>1 -&gt; 2 -&gt; 9
<strong>Explanation: </strong></span>
<span style="font-size:18px">After deleting the node at 2nd</span>
<span style="font-size:18px">position (1-based indexing), the</span>
<span style="font-size:18px">linked list is as 1 -&gt; 2 -&gt; 9.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=delete-a-node-in-single-linked-list&amp;title=Delete%20a%20Node%20in%20Single%20Linked%20List%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%201%20-%3E%205%20-%3E%202%20-%3E%209%20%0Ax%20%3D%202%0AOutput%3A%201%20-%3E%202%20-%3E%209%0AExplanation%3A%20%0AAfter%20deleting%20the%20node%20at%202nd%0Aposition%20(1-based%20indexing)%2C%20the%0Alinked%20list%20is%20as%201%20-%3E%202%20-%3E%209." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your task:&nbsp;</strong>Your task is to complete the method <strong>deleteNode()</strong> which takes two arguments: the address of the head of the linked list and an integer x. The function returns the head of the modified linked list.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= T &lt;= 300<br>
2 &lt;= N &lt;= 100<br>
1 &lt;= x &lt;= N</span><br>
&nbsp;</p>
</div>