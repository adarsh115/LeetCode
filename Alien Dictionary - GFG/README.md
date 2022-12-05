# Alien Dictionary
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a sorted dictionary of an alien language having N words and&nbsp;k starting alphabets of standard dictionary. Find the order of characters in the alien language.<br>
<strong>Note:</strong>&nbsp;Many orders may be&nbsp;possible for a particular test case, thus&nbsp;you may return any valid order and&nbsp;output will be 1 if the order of string returned by the function is correct else 0 denoting incorrect string returned.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: 
</strong>N = 5, K = 4
dict = {"baa","abcd","abca","cab","cad"</span><span style="font-size:18px">}
<strong>Output:
</strong>1
<strong>Explanation:
</strong>Here order of characters is 
'b', 'd', 'a', 'c' Note that words are sorted 
and in the given language "baa" comes before 
"abcd", therefore 'b' is before 'a' in output.
Similarly we can find other orders.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/alien-dictionary/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=eventual-safe-states&amp;title=Alien%20Dictionary%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%0AN%20%3D%205%2C%20K%20%3D%204%0Adict%20%3D%20%7B%22baa%22%2C%22abcd%22%2C%22abca%22%2C%22cab%22%2C%22cad%22%7D%0AOutput%3A%0A1%0AExplanation%3A%0AHere%20order%20of%20characters%20is%20%0A%2527b%2527%2C%20%2527d%2527%2C%20%2527a%2527%2C%20%2527c%2527%20Note%20that%20words%20are%20sorted%20%0Aand%20in%20the%20given%20language%20%22baa%22%20comes%20before%20%0A%22abcd%22%2C%20therefore%20%2527b%2527%20is%20before%20%2527a%2527%20in%20output.%0ASimilarly%20we%20can%20find%20other%20orders." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input: 
</strong>N = 3, K = 3
dict = {"caa","aaa","aab"}
<strong>Output:
</strong>1
<strong>Explanation:
</strong>Here order of characters is
'c', 'a', 'b' Note that words are sorted
and in the given language "caa" comes before
"aaa", therefore 'c' is before 'a' in output.
Similarly we can find other orders.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/alien-dictionary/1?utm_source=youtube&amp;utm_medium=collab_striver_ytdescription&amp;utm_campaign=eventual-safe-states&amp;title=Alien%20Dictionary%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%0AN%20%3D%203%2C%20K%20%3D%203%0Adict%20%3D%20%7B%22caa%22%2C%22aaa%22%2C%22aab%22%7D%0AOutput%3A%0A1%0AExplanation%3A%0AHere%20order%20of%20characters%20is%0A%2527c%2527%2C%20%2527a%2527%2C%20%2527b%2527%20Note%20that%20words%20are%20sorted%0Aand%20in%20the%20given%20language%20%22caa%22%20comes%20before%0A%22aaa%22%2C%20therefore%20%2527c%2527%20is%20before%20%2527a%2527%20in%20output.%0ASimilarly%20we%20can%20find%20other%20orders.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>findOrder()&nbsp;</strong>which takes </span>&nbsp;<span style="font-size:18px">the string array dict[], its size N&nbsp;and the integer K as input parameter&nbsp;and returns a string denoting the order of characters in the alien language.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N * |S| + K) , where |S| denotes maximum length.<br>
<strong>Expected Space Compelxity:&nbsp;</strong>O(K)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N, M ≤ 300<br>
1 ≤ K&nbsp;≤ 26<br>
1 ≤ Length of words&nbsp;≤ 50</span></p>
</div>