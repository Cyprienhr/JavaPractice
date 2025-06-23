def words_to_number(s):
    units = {
        "zero": 0, "one": 1, "two": 2, "three": 3, "four": 4,
        "five": 5, "six": 6, "seven": 7, "eight": 8, "nine": 9,
        "ten": 10, "eleven": 11, "twelve": 12, "thirteen": 13,
        "fourteen": 14, "fifteen": 15, "sixteen": 16, "seventeen": 17,
        "eighteen": 18, "nineteen": 19
    }

    tens = {
        "twenty": 20, "thirty": 30, "forty": 40,
        "fifty": 50, "sixty": 60, "seventy": 70,
        "eighty": 80, "ninety": 90
    }

    multiples = {
        "hundred": 100,
        "thousand": 1000,
        "million": 1000000,
        "billion": 1000000000,
    }

    s = s.lower().replace("-", " ").split()
    current = total = 0

    for word in s:
        if word in units:
            current += units[word]
        elif word in tens:
            current += tens[word]
        elif word == "hundred":
            current *= multiples[word]
        elif word in multiples:
            current *= multiples[word]
            total += current
            current = 0
        else:
            continue

    return total + current


# 🚀 Test cases
print(words_to_number("Three hundred million"))       # Output: 300000000
print(words_to_number("Five Hundred Thousand"))       # Output: 500000
print(words_to_number("One thousand two hundred"))    # Output: 1200
