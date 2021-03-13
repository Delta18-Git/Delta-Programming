REM Discounted price
CLS
PRINT "Enter price of a Harry Potter book."
INPUT CP
LET DISC = 3 / 100 * CP
LET DP = CP - DISC
PRINT " The discounted price = "; DP
END

