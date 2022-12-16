# Rotation
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an ascending&nbsp;sorted rotated&nbsp;array&nbsp;<strong>Arr&nbsp;</strong>of distinct integers&nbsp;of size <strong>N</strong>. The array is right rotated <strong>K</strong>&nbsp;times. Find the value of <strong>K</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 5
Arr[] = {5, 1, 2, 3, 4}
<strong>Output:</strong> 1
<strong>Explanation:</strong> The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background: rgb(15, 37, 51); padding: 5px; border-radius: 0px 0px 5px 5px; display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=rotation&amp;title=Rotation%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%205%0AArr%5B%5D%20%3D%20%7B5%2C%201%2C%202%2C%203%2C%204%7D%0AOutput%3A%201%0AExplanation%3A%20The%20given%20array%20is%205%201%202%203%204.%20%0AThe%20original%20sorted%20array%20is%201%202%203%204%205.%20%0AWe%20can%20see%20that%20the%20array%20was%20rotated%20%0A1%20times%20to%20the%20right.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input:
</strong>N = 5
Arr[] = {1, 2, 3, 4, 5}
<strong>Output:</strong> 0
<strong>Explanation:</strong>&nbsp;The given array is not rotated.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=rotation&amp;title=Rotation%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%0AN%20%3D%205%0AArr%5B%5D%20%3D%20%7B1%2C%202%2C%203%2C%204%2C%205%7D%0AOutput%3A%200%0AExplanation%3A%C2%A0The%20given%20array%20is%20not%20rotated.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function <strong>findKRotation()</strong>&nbsp;which takes array <strong>arr</strong> and size&nbsp;<strong>n</strong>,&nbsp;as input parameters&nbsp;and returns an integer representing the answer.&nbsp;You don't to print answer or take inputs.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(log(N))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;=10<sup>5</sup><br>
1 &lt;= Arr<sub>i</sub> &lt;= 10<sup>7</sup></span></p>

<p>&nbsp;</p>
</div>