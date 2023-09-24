from python.loan_payment_system.loan_account import LoanAccount
from python.loan_payment_system.loan_leadger import LoanLeadger


class IssueLoan:

    def __init__(self, input_cmd, ledgeObj):
        instr = str(input_cmd).split(" ")
        bank_name = str(instr[1])
        borrower_name = str(instr[2])
        principal = int(instr[3])
        year = int(instr[4])
        rate = int(instr[5])

        new_account = LoanAccount(bank_name, borrower_name, principal, year, rate)

        ledgeObj.leadger[(bank_name,borrower_name)] = new_account

