#include <stdio.h> // 标准输入输出的库，指向printf

int main() { // main函数，程序的入口

/*
    重复执行某个动作：
    - while: 当...的时候
    - 永远执行： 1 = 1 -> true（语法糖 / Syntax sugar）
        - true / false: boolean expression
        - Binary code:
            - 1: ture, on, yes
            - 0: false, off, no
*/
    while(ture) { // int n = 1; while (!n) 当n不等于0时
        printf("hello, world!\n"); //
    }


// - 在某个条件下执行：
    int i = 0; // 先声明
    while (i < 10) { // 后使用（循环执行的条件1：判断条件）
    // 语句放在括号中
        printf("%d\n", i); // 调用stdio.h库，进行格式化输出（在命令行打印一条命令）
        i++; //循环执行的条件2：驱动循环
    }

// - 变形：（Syntax sugar）
    for (int k = 0; k < 10; k++) {
        printf("%d\n", k);
        k++;
    }

// 改进：先执行一次，再进行判断
// 适用情况：...
    int j = 0;
    do {
        printf("%d\n", j);
        j++;
    } while (j < 10);

    
    return 0; // 返回值，类型与声明类型对应
}

/*
Summary:
1. 循环（Loop）的使用方法及语法糖的介绍
    - while (condition) {...}
    - for (varible; condition; transform;) {...}
    - do {...} while(condition); 注意分号

2. 语法糖：缩写，简写，略写
3. Boolean（布尔）逻辑表达式：0 / 1 -> false / true 注意区分大小写
4. Reading + Lab + Assignment
*/