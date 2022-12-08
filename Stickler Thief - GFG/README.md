# Stickler Thief
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Stickler</span><span style="font-size:18px"> the thief wants to loot money from a society<strong> </strong>having<strong> n</strong> houses in a single line. He is a weird person and follows a certain <strong>rule </strong>when looting the houses. According to the rule, he will <strong>never loot two consecutive houses</strong>. At the same time, he wants to <strong>maximize </strong>the amount he <strong>loots</strong>. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to <strong>find the maximum money he can get</strong> if he strictly <strong>follows </strong>the <strong>rule</strong>. Each house has </span><strong><span style="font-size:18px">a[i]</span></strong><span style="font-size:18px"><strong>amount of money</strong> present in it.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>n = 6
a[] = {5,5,10,100,10,5}
<strong>Output: </strong>110
<strong>Explanation: </strong>5+100+5=110</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=stickler-theif-&amp;title=Stickler%20Thief%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0An%20%3D%206%0Aa%5B%5D%20%3D%20%7B5%2C5%2C10%2C100%2C10%2C5%7D%0AOutput%3A%20110%0AExplanation%3A%205%2B100%2B5%3D110" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>n = 3
a[] = {1,2,3}
<strong>Output: </strong>4
<strong>Explanation: </strong>1+3=4</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=stickler-theif-&amp;title=Stickler%20Thief%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0An%20%3D%203%0Aa%5B%5D%20%3D%20%7B1%2C2%2C3%7D%0AOutput%3A%204%0AExplanation%3A%201%2B3%3D4" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function<strong>FindMaxSum()</strong>which takes an array <strong>arr[]</strong> and <strong>n</strong> as input which returns the maximum money he can get following the rules</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(N).<br>
<strong>Expected Space Complexity:</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 10<sup>4</sup><br>
1 ≤ a[i] ≤ 10<sup>4</sup></span></p>
</div>