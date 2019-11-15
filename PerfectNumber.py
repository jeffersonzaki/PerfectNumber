def perfectNumber(n):
    sum = 0
    temp = n
    # Half the value
    temp = temp / 2
    #find all divisors and add them
    while temp > 0:
        if n % temp == 0:
            sum = sum + temp
        temp = temp - 1
        if sum == n:
            return 1
        else:
            return -1

while True:
    num = int(input("\nEnter a positive integer e.g. 8 "))
    if num == 1:
        print("\nThe number ", num, " is a perfect number")