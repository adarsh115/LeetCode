# Implement two stacks in an array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Your task is to implement&nbsp;&nbsp;2 stacks in one array efficiently.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>push1(2)
push1(3)
push2(4)
pop1()
pop2()<strong>
</strong>pop2()

<strong>Output:
</strong>3 4 -1<strong>

Explanation:
</strong>push1(2) the stack1&nbsp;will be {2}
push1(3) the stack1&nbsp;will be {2,3}
push2(4) the stack2 will be {4}
pop1() &nbsp; the&nbsp;poped element will be 3&nbsp;
from stack1 and stack1 will be {2}
pop2() &nbsp; the poped element will be 4&nbsp;
from stack2 and now stack2 is empty
pop2()&nbsp;  the stack2 is now empty hence -1 .</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1&amp;title=Implement%20two%20stacks%20in%20an%20array%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0Apush1(2)%0Apush1(3)%0Apush2(4)%0Apop1()%0Apop2()%0Apop2()%0A%0AOutput%3A%0A3%204%20-1%0A%0AExplanation%3A%0Apush1(2)%20the%20stack1%C2%A0will%20be%20%7B2%7D%0Apush1(3)%20the%20stack1%C2%A0will%20be%20%7B2%2C3%7D%0Apush2(4)%20the%20stack2%20will%20be%20%7B4%7D%0Apop1()%20%C2%A0%20the%C2%A0poped%20element%20will%20be%203%C2%A0%0Afrom%20stack1%20and%20stack1%20will%20be%20%7B2%7D%0Apop2()%20%C2%A0%20the%20poped%20element%20will%20be%204%C2%A0%0Afrom%20stack2%20and%20now%20stack2%20is%20empty%0Apop2()%C2%A0%20%20the%20stack2%20is%20now%20empty%20hence%20-1%20." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You don't need to read input or print anything.&nbsp;You are required to complete the 4&nbsp;methods&nbsp;<strong>push1,&nbsp;push2&nbsp;</strong>which takes one argument an integer<strong> 'x' </strong>to be pushed into stack one and two<strong>&nbsp;</strong>and&nbsp;<strong>pop1, pop2</strong>&nbsp;which returns the integer&nbsp;poped out from stack one and two. If no integer is present in the array return -1.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(1) for all the four methods.<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1) for all the four methods.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;=<strong> </strong>Number of queries &lt;= 100<br>
1 &lt;= Number&nbsp;of elements in the stack</span><span style="font-size:18px">&nbsp;&lt;= 100</span><br>
<span style="font-size:18px">The sum of elements in both the stacks &lt; size of the given array</span></p>
</div>