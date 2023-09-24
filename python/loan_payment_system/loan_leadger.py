from python.loan_payment_system.loan_account import LoanAccount


class LoanLeadger:
    __instance = None
    bank_name = str("")
    borrower_name = str("")
    leadger = {(str(""), str("")): LoanAccount}

    @staticmethod
    def getInstance():
        if LoanLeadger.__instance is None:
            LoanLeadger()
        return LoanLeadger.__instance

    def __init__(self):
        if LoanLeadger.__instance is not None:
            raise Exception("This class is a singleton!")
        else:
            LoanLeadger.__instance = self
