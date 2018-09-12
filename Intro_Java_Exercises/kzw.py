# usr/bin/python
# coding: utf-8
balance = 4213 
annualInterestRate = 0.2 
monthlyPaymentRate = 0.04 
monthlyInterestRate = annualInterestRate/12
total =0 
for i in range(12):
    MIN = monthlyPaymentRate * balance
    total += MIN
    balance -= MIN
    balance = balance + balance * monthlyInterestRate

print ("月份:%d"%(i+1))
print ("最小还款:%.2f"%(MIN))
print ("余额:%.2f"%(balance))
print ("总计:%.2f"%(total))
