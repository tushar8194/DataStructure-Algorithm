from python.loan_payment_system.loan_leadger import LoanLeadger
from python.loan_payment_system.loan_account import LoanAccount

class MakePayment:

    def __init__(self, input_cmd, ledgeObj):

        instr = str(input_cmd).split(" ")

        bank_name = str(instr[1])
        borrower_name = str(instr[2])
        lumpsum = int(instr[3])
        no_paid_emi = int(instr[4])

        # Fetch account details
        borrower_account = ledgeObj.leadger[(bank_name,borrower_name)]

        # Modify account with payment details
        borrower_account.payment_statement[no_paid_emi] = borrower_account.payment_statement[no_paid_emi] + lumpsum
