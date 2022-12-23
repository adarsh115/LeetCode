# Special Stack
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Design a data-structure<strong> SpecialStack&nbsp;</strong>that supports all the stack operations like <strong>push()</strong>, <strong>pop()</strong>,<strong> isEmpty()</strong>, <strong>isFull()</strong> and an additional operation <strong>getMin()</strong> which should return <strong>minimum </strong>element from the SpecialStack. Your task is to <strong>complete all the functions</strong>, using stack data-Structure.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>Stack: 18 19 29 15 16<strong>
Output: </strong>15
<strong>Explanation:</strong>
The minimum element of the stack is 15.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/special-stack/1&amp;title=Special%20Stack%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AStack%3A%2018%2019%2029%2015%2016%0AOutput%3A%2015%0AExplanation%3A%0AThe%20minimum%20element%20of%20the%20stack%20is%2015.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><br>
<strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">Since this is a function problem, you don't need to take inputs. You just have to complete 5 functions,&nbsp;<strong>push()&nbsp;</strong>which takes the stack and an integer x&nbsp;as input and pushes it into the stack;&nbsp;<strong>pop()&nbsp;</strong>which takes the stack as input and pops out the topmost element from the stack;&nbsp;<strong>isEmpty()&nbsp;</strong>which takes the stack as input and returns true/false depending upon whether the stack is empty or not;&nbsp;<strong>isFull()&nbsp;</strong>which takes the stack and the size of the stack as input and returns true/false depending upon whether the stack is full or not (depending upon the<br>
given size);&nbsp;<strong>getMin()&nbsp;</strong>which takes the stack as&nbsp;input and returns the minimum element of the stack.&nbsp;<br>
<strong>Note:</strong>&nbsp;The output of the code will be the value returned by&nbsp;<strong>getMin()&nbsp;</strong>function.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N) for getMin, O(1) for remaining all 4 functions.<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1) for all the 5 functions.</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>4</sup></span></p>
</div>