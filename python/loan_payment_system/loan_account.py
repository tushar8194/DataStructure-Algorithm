import math


class LoanAccount:
    def init_repay_amount(self, principal, years, rate):
        interest = (principal * years * rate) / 100
        return interest + self.principal

    def init_emi_amount(self, balance_repay_amount, years):
        return balance_repay_amount / (years * 12)

    def __init__(self, bank_name, borrower_name, principal, years, rate):
        self.payment_statement = {}
        self.bank_name = bank_name
        self.borrower_name = borrower_name
        self.principal = principal
        self.years = years
        self.rate = rate

        self.initial_repay_amount = self.init_repay_amount(principal, years, rate)
        self.emi_amount = math.ceil(self.init_emi_amount(self.initial_repay_amount, years))
        self.initial_num_emi = math.ceil(self.initial_repay_amount / self.emi_amount)

        for x in range(1, self.initial_num_emi + 1):
            self.payment_statement[x] = self.emi_amount

