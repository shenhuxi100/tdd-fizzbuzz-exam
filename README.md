# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

- 让所有学生排成一队，然后按顺序报数。

- 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。


## Tasking
when are reporting:
Given number is no multiple by 3, 5, 7： 1，4; then 1, 4
Given number is multiple by 3: 6, 12; then Fizz
Given number is multiple by 5: 10, 20; then Buzz
Given number is multiple by 7: 14, 21; then Whizz
Given number is multiple by 3 and 5: 60, 90; then FizzBuzz
Given number is multiple by 3 and 7: 21, 42; then FizzWhizz
Given number is multiple by 5 and 7: 140; then BuzzWhizz
Given number is multiple by 3, 5 and 7: 210; then FizzBuzzWhizz