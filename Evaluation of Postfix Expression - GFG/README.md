# Evaluation of Postfix Expression
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given string <strong>S</strong>&nbsp;representing a&nbsp;postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like <strong>*, /, + and -</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: S = "231*+9-"
<strong>Output</strong>: -4
<strong>Explanation</strong>:
After solving the given expression, 
we have -4 as result.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1&amp;title=Evaluation%20of%20Postfix%20Expression%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20S%20%3D%20%22231*%2B9-%22%0AOutput%3A%20-4%0AExplanation%3A%0AAfter%20solving%20the%20given%20expression%2C%20%0Awe%20have%20-4%20as%20result.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: S = "123+*8-"
<strong>Output</strong>: -3
<strong>Explanation</strong>:
After solving the given postfix 
expression, we have -3 as result.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1&amp;title=Evaluation%20of%20Postfix%20Expression%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20S%20%3D%20%22123%2B*8-%22%0AOutput%3A%20-3%0AExplanation%3A%0AAfter%20solving%20the%20given%20postfix%20%0Aexpression%2C%20we%20have%20-3%20as%20result.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You do not need to read input or print anything. Complete the function<strong> evaluatePostfixExpression()&nbsp;</strong>that takes the string S denoting the expression as input parameter and&nbsp;returns<strong> </strong>the evaluated value.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong>: O(|S|)<br>
<strong>Expected Auixilliary Space</strong>: O(|S|)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |S| ≤ 10<sup>5</sup></span></p>

<p><span style="font-size:18px">0 ≤ |S<sub>i</sub>|≤ 9 (And given operators)</span></p>
</div>