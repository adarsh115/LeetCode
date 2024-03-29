# Geek Jump
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">&nbsp;Geek wants to climb from the 0th stair to the (n-1)th stair. At a time the Geek can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps from stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. return the minimum energy that can be used by the Geek to jump from stair 0 to stair N-1.</span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Example:</strong>
<strong>Input:</strong>
n = 4
height = {10 20 30 10}
<strong>Output:</strong>
20
<strong>Explanation:</strong>
<code>Geek jump from 1st to 2nd stair(|20-10| = 10 energy lost).
Then a jump from the 2nd to the last stair(|10-20| = 10 energy lost).
so, total energy lost is 20 which is the minimum.</code></span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/geek-jump/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=geek-jump&amp;title=Geek%20Jump%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Example%3A%0AInput%3A%0An%20%3D%204%0Aheight%20%3D%20%7B10%2020%2030%2010%7D%0AOutput%3A%0A20%0AExplanation%3A%0AGeek%20jump%20from%201st%20to%202nd%20stair(%7C20-10%7C%20%3D%2010%20energy%20lost).%0AThen%20a%20jump%20from%20the%202nd%20to%20the%20last%20stair(%7C10-20%7C%20%3D%2010%20energy%20lost).%0Aso%2C%20total%20energy%20lost%20is%2020%20which%20is%20the%20minimum." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><strong><span style="font-size:18px"><code>Your Task:</code></span></strong><br>
<span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>MinimumEnergy()&nbsp;</strong>which takes the array&nbsp;<strong>height</strong>, and integer <strong>n,</strong>&nbsp;and returns the minimum energy that is lost.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n)<br>
<strong>Expected Space Complexity:</strong> O(n)</span></p>

<p><span style="font-size:18px"><strong>Constraint:</strong><br>
1&lt;=n&lt;=100000<br>
1&lt;=height[i]&lt;=1000</span></p>
</div>