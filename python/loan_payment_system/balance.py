import math

from python.loan_payment_system.loan_leadger import LoanLeadger


class BalanceEnquiry:

    def __init__(self, input_cmd, ledgeObj):
        instr = str(input_cmd).split(" ")

        bank_name = str(instr[1])
        borrower_name = str(instr[2])
        emi_no = int(instr[3])
        amount_paid = 0


        # Fetch account details
        account = ledgeObj.leadger[(bank_name, borrower_name)]

        # Fetch Balance
        for x in range(1, emi_no + 1):
            amount_paid = amount_paid + account.payment_statement[x]

        rmng_emi = math.ceil((account.initial_repay_amount - amount_paid) / account.emi_amount)

        print(f'{bank_name} {borrower_name} {amount_paid} {rmng_emi}')
