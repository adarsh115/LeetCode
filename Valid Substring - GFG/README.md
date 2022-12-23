# Valid Substring
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string <strong>S </strong>consisting only of opening and closing parenthesis 'ie <strong>'(' &nbsp;</strong>and <strong>')'</strong>, find out the length of the longest valid(well-formed) parentheses</span><span style="font-size:18px"> substring.</span><br>
<span style="font-size:18px"><strong>NOTE: </strong>Length of&nbsp;the smallest&nbsp;valid substring&nbsp;<strong>( )</strong> is <strong>2</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: S</strong> = "(()(</span><span style="font-size:18px">"
<strong>Output:</strong> 2
<strong>Explanation: </strong>The longest valid 
substring is "()". Length = 2.</span>
</pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/valid-substring0624/1&amp;title=Valid%20Substring%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20S%20%3D%20%22(()(%22%0AOutput%3A%202%0AExplanation%3A%20The%20longest%20valid%20%0Asubstring%20is%20%22()%22.%20Length%20%3D%202.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: S</strong> = "()(())(</span><span style="font-size:18px">"
<strong>Output:</strong> 6
<strong>Explanation: </strong>The longest valid 
substring is "()(())</span><span style="font-size:18px">". Length = 6.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/valid-substring0624/1&amp;title=Valid%20Substring%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20S%20%3D%20%22()(())(%22%0AOutput%3A%206%0AExplanation%3A%20The%20longest%20valid%20%0Asubstring%20is%20%22()(())%22.%20Length%20%3D%206." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><br>
<span style="font-size:18px"><strong>Your Task: &nbsp;</strong><br>
You dont need to read input or print anything. Complete the function <strong>findMaxLen()&nbsp;</strong>which takes S&nbsp;as input parameter and returns the maxlength.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(n)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1)&nbsp; &nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |S|&nbsp;&lt;= 10<sup>5</sup></span></p>

<p>&nbsp;</p>
</div>