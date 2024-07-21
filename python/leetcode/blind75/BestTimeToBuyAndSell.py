class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        b, s = prices[0], prices[0]
        maxProf = 0

        for i in range(len(prices)):
            if b > prices[i]:
                b = prices[i]
                s = prices[i]
            if s < prices[i]:
                s = prices[i]
            maxProf = max(maxProf, (s - b))

        return (maxProf)