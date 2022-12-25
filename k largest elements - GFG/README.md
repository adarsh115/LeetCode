# k largest elements
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>Arr</strong> of <strong>N</strong> positive integers and an integer <strong>K</strong>, find&nbsp;<strong>K</strong> <strong>largest elements </strong>from the array.&nbsp; The output elements should be printed in decreasing order.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
<strong>Output:</strong> 787 23
<strong>Explanation:</strong> 1st largest element in the
array is 787 and second largest is 23.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1&amp;title=k%20largest%20elements%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%205%2C%20K%20%3D%202%0AArr%5B%5D%20%3D%20%7B12%2C%205%2C%20787%2C%201%2C%2023%7D%0AOutput%3A%20787%2023%0AExplanation%3A%201st%20largest%20element%20in%20the%0Aarray%20is%20787%20and%20second%20largest%20is%2023.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 7, K = 3
Arr[] = {1, 23, 12, 9, 30, 2, 50}
<strong>Output:</strong> 50 30 23
<strong>Explanation:</strong>&nbsp;3 Largest element in the
array are 50, 30 and 23.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1&amp;title=k%20largest%20elements%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%207%2C%20K%20%3D%203%0AArr%5B%5D%20%3D%20%7B1%2C%2023%2C%2012%2C%209%2C%2030%2C%202%2C%2050%7D%0AOutput%3A%2050%2030%2023%0AExplanation%3A%C2%A03%20Largest%20element%20in%20the%0Aarray%20are%2050%2C%2030%20and%2023.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>kLargest()</strong>&nbsp;which takes the&nbsp;array of&nbsp;integers&nbsp;<strong>arr,</strong>&nbsp;<strong>n </strong>and<strong> k&nbsp;</strong>as parameters and returns an array of integers denoting the answer. The array should be in decreasing order.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N + KlogK)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(K+(N-K)*logK)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ K&nbsp;≤ N ≤ 10<sup>5</sup><br>
1 ≤ Arr[i] ≤ 10<sup>6</sup></span><br>
&nbsp;</p>
</div>