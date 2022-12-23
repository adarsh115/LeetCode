# Next Greater Element
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[ ]</strong> of size <strong>N</strong> having&nbsp;elements, the&nbsp;task is to find the next greater element for each element of the array in order of their appearance in the array.<br>
Next greater element of an element in the array is the nearest element on the right which is greater than the current element.<br>
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: 
N = 4, arr[] = [1 3 2 4]
<strong>Output</strong>:
3 4 4 -1
<strong>Explanation</strong>:
In the array, the next larger element 
to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
since it doesn't exist, it is -1.
</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1&amp;title=Next%20Greater%20Element%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%0AN%20%3D%204%2C%20arr%5B%5D%20%3D%20%5B1%203%202%204%5D%0AOutput%3A%0A3%204%204%20-1%0AExplanation%3A%0AIn%20the%20array%2C%20the%20next%20larger%20element%20%0Ato%201%20is%203%20%2C%203%20is%204%20%2C%202%20is%204%20and%20for%204%20%3F%20%0Asince%20it%20doesn%2527t%20exist%2C%20it%20is%20-1.%0A" class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="margin-bottom: 0px;"><span style="font-size:18px"><strong>Input</strong>: 
N = 5, arr[] [6 8 0 1 3]
<strong>Output</strong>:
8 -1 1 3 -1
<strong>Explanation</strong>:
In the array, the next larger element to 
6 is 8, for 8 there is no larger elements 
hence it is -1, for 0 it is 1 , for 1 it 
is 3 and then for 3 there is no larger 
element on right and hence -1.</span></pre><div class="saveCodeBtnTag" style="text-align:right; margin-bottom:17px;"><span class="saveCodeBtnSpan saveCodeBtnTag" style="background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;" onmouseover="this.style=`background:#797979;;padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`" ;="" onmouseout="this.style=`background:#0f2533; padding: 5px; border-radius: 0 0 5px 5px;  display: inline-block;`;"><a src="?&amp;url=https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1&amp;title=Next%20Greater%20Element%20%7C%20Practice%20%7C%20GeeksforGeeks&amp;hashtags=&amp;code=Input%3A%20%0AN%20%3D%205%2C%20arr%5B%5D%20%5B6%208%200%201%203%5D%0AOutput%3A%0A8%20-1%201%203%20-1%0AExplanation%3A%0AIn%20the%20array%2C%20the%20next%20larger%20element%20to%20%0A6%20is%208%2C%20for%208%20there%20is%20no%20larger%20elements%20%0Ahence%20it%20is%20-1%2C%20for%200%20it%20is%201%20%2C%20for%201%20it%20%0Ais%203%20and%20then%20for%203%20there%20is%20no%20larger%20%0Aelement%20on%20right%20and%20hence%20-1." class="saveCodeBtn saveCodeBtnTag" style="color: white; text-decoration: none; text-shadow: none; background-color: transparent;"><img src="chrome-extension://annlhfjgbkfmbbejkbdpgbmpbcjnehbb/images/saveicon.png" style="margin:0; display: inline-block; vertical-align: middle; height: 19px; width: 19px;background: #ffffff00; border: none;" class="saveCodeBtnTag"> Save</a><a></a></span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a <strong>function </strong>problem. You only need to complete the function <strong>nextLargerElement()&nbsp;</strong>that takes list of integers&nbsp;<strong>arr[ ] </strong>and<strong>&nbsp;N</strong>&nbsp;as input parameters<strong> </strong>and returns list of integers&nbsp;of length N&nbsp;denoting the next greater elements for all the corresponding elements in the input array.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(N)<br>
<strong>Expected Auxiliary Space</strong> : O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤&nbsp;10<sup>6</sup><br>
1 ≤&nbsp;A<sub>i</sub> ≤&nbsp;10<sup>18</sup></span></p>
</div>