# JP Morgan actual coding challege
# Happy number
# given a positive integer, add the square of its digits until the final result is 1 or not
# if the final result is 1, then the integer is a happy number
# if it keeps working, is not a happy number


case = '7'


def happy_number(number):
    suma = 0
    for num1 in number:
        try:
            num = int(num1)  # convert digit to integer
            num = num * num  # get the square of the digit
            suma = suma + num  # add square to the sum

        except ValueError:
            pass

    if suma is 1:

        return suma
    else:
        return happy_number(str(suma))


print(f"final result {happy_number(case)}")
