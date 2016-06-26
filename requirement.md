## 需求描述:
1. 老师说出三个不同个位数: 3, 5, 7;
2. 学生依次报数;
3. 如果是3的倍数, 要说Fizz; 如果是5的倍数, 要说Buzz; 如果是7的倍数, 要说Whizz。
4. 如果是3和5的倍数，要说FizzBuzz; 如果是3和7的倍数，要说FizzWhizz；如果是5和7的倍数，要说BuzzWhizz; 如果是3，5，7的倍数，要说FizzBuzzWhizz;
5. 如果包含数字3，要说Fizz，同时忽略规则3，4。


## 核心需求分解:
1. 如果是3的倍数, 返回Fizz;
2. 如果是5的倍数, 返回Buzz;
3. 如果是7的倍数, 返回Whizz;
4. 如果是3和5的倍数, 返回FizzBuzz;
5. 如果是3和7的倍数，返回FizzWhizz；
6. 如果是5和7的卑俗，返回BuzzWhizz；
7. 如果是3，5，7的倍数，返回FizzBuzzWhizz；
8. 如果包含数字3，返回Fizz；
9. 如果不满足上面所有条件，返回原始数字。

## 需求优先级：
8 > 

7 > 

4, 5, 6 >

1, 2, 3 >

9

## 实现步骤：

1. 实现核心需求1（3的倍数, 返回Fizz）：FizzHandlerTest -> FizzHandler；
2. 实现核心需求2（5的倍数, 返回Buzz）：BuzzHandlerTest -> BuzzHnalder；
3. 实现核心需求3（7的倍数, 返回Whizz）：WhizzHandlerTest ->WhizzHnalder；
4. 组合核心需求1，2，3，实现游戏规则：如果是3的倍数，返回Fizz; 如果不是3的倍数，是5的倍数，返回Buzz；如果不是3的倍数，不是5的倍数，是7的倍数 ，返回Whizz；FizzBuzzWhizzGameTest -> FizzBuzzWhizzGame
5. 出现bad smell：两个if语句；
6. 选择使用“责任链”模式重构FizzHandler，BuzzHnalder，WhizzHnalder；
7. 根据第6步的重构，重构FizzBuzzWhizzGame。
8. 实现核心需求4（3和5的倍数, 返回FizzBuzz）：FizzBuzzHandlerTest -> FizzBuzzHandler；
9. 实现核心需求5（3和7的倍数, 返回FizzWhizz）：FizzWhizzHandlerTest -> FizzWhizzHandler；
10. 实现核心需求6（5和7的倍数, 返回BuzzWhizz）：BuzzWhizzHandlerTest -> BuzzWhizzHandler；
11. 在第4步游戏规则之上，添加游戏规则：如果是3和5的倍数，返回FizzBuzz，如果是3和7的倍数，返回FizzWhizz，如果是5和7的倍数，返回BuzzWhizz；此时需修改签名的测试名称。FizzBuzzWhizzGameTest -> FizzBuzzWhizzGame
12. 出现bad smell：两个if语句，使用“责任链”重构FizzBuzzHandler，FizzWhizzHandler，BuzzWhizzHandler，FizzBuzzWhizzGame；
13. 发现bad smell：当修改游戏规则的时候，需要修改FizzBuzzWhizzGame；
14. 使用抽取新类的方式重构FizzBuzzWhizzGame, 添加游戏规则类FizzBuzzWhizzGamerRule；（此时出现新接口FizzBuzzWhizzGamerRule.handler, 是否需增加测试，但是cobertura显示测试覆盖率100%）
15. 实现核心需求7(是3，5，7的倍数，返回FizzBuzzWhizz),FizzBuzzWhizzHandlerTest -> FizzBuzzWhizzHandler；
16. 在前面的游戏规则之上，添加游戏规则7:如果是3，5，7的倍数，返回FizzBuzzWhizz；FizzBuzzWhizzGameTest －> FizzBuzzWhizzGamerRule
17.  实现核心需求8(包含数字3，返回Fizz), ContainFizzHandlerTest -> ContainFizzHandler;
18. 在前面的游戏规则之上，添加游戏规则：如果包含3，返回Fizz；此时的测试会受到核心需求1的干扰，因此测试数据需选择13，而不能用3.
19. 完成上一步之后，会发现有些测试不通过，此时需修改后面测试中包含3的的测试数据,以及测试方法名，以表明不包含3.
20. 发现bad smell：magic number/string，使用常量进行重构。



