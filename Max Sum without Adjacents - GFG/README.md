# Max Sum without Adjacents
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>Arr&nbsp;</strong>of size <strong>N</strong>&nbsp;containing&nbsp;positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 6
Arr[] = {5, 5, 10, 100, 10, 5}
<strong>Output:</strong> 110
<strong>Explanation:</strong> If you take indices 0, 3
and 5, then Arr[0]+Arr[3]+Arr[5] =
5+100+5 = 110.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=max-sum-without-adjacents&amp;title=Max%20Sum%20without%20Adjacents%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%206%0AArr%5B%5D%20%3D%20%7B5%2C%205%2C%2010%2C%20100%2C%2010%2C%205%7D%0AOutput%3A%20110%0AExplanation%3A%20If%20you%20take%20indices%200%2C%203%0Aand%205%2C%20then%20Arr%5B0%5D%2BArr%5B3%5D%2BArr%5B5%5D%20%3D%0A5%2B100%2B5%20%3D%20110." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 4
Arr[] = {3, 2, 7, 10}
<strong>Output:</strong> 13
<strong>Explanation: </strong>3 and 10 forms a non
continuous  subsequence with maximum
sum.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=max-sum-without-adjacents&amp;title=Max%20Sum%20without%20Adjacents%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%204%0AArr%5B%5D%20%3D%20%7B3%2C%202%2C%207%2C%2010%7D%0AOutput%3A%2013%0AExplanation%3A%203%20and%2010%20forms%20a%20non%0Acontinuous%20%20subsequence%20with%20maximum%0Asum." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findMaxSum()</strong>&nbsp;which takes the&nbsp;array of&nbsp;integers&nbsp;<strong>arr&nbsp;</strong>and&nbsp;<strong>n</strong><strong>&nbsp;</strong>as parameters and returns an integer denoting the answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>6</sup><br>
1 ≤ Arr<sub>i</sub> ≤ 10<sup>7</sup></span></p>
</div>