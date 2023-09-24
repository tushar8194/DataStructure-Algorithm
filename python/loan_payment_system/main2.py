# Take all user input
from python.loan_payment_system.loan import IssueLoan
from python.loan_payment_system.payment import MakePayment
from python.loan_payment_system.balance import BalanceEnquiry
from python.loan_payment_system.loan_leadger import LoanLeadger


def input_instrctn(cmd, input, ledgeObj):
    if cmd == 'LOAN':
        IssueLoan(input, ledgeObj)
    elif cmd == 'PAYMENT':
        MakePayment(input, ledgeObj)
    elif cmd == 'BALANCE':
        BalanceEnquiry(input, ledgeObj)
    else:
        print("Bad Input")



f = open("/Users/tarzan/code/IdeaProjects/DataStructureAlgoritham/python/loan_payment_system/instr.txt", "r")
ledgeObj = LoanLeadger.getInstance()
for instructn in f:
    cmd = instructn.split(" ")[0]
    input_instrctn(cmd, instructn, ledgeObj)





