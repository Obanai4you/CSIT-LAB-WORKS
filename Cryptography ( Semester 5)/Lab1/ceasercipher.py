def encryptMessage(plainText, key):
    cipherText = ''
    for letter in plainText:
        if letter in lowerCase:
            index = lowerCase.index(letter)
            shiftedIndex = (index + key) % 26
            cipherText += lowerCase[shiftedIndex]
        elif letter in upperCase:
            index = upperCase.index(letter)
            shiftedIndex = (index + key) % 26
            cipherText += upperCase[shiftedIndex]
        else:
            cipherText += letter
    return cipherText

def decryptMessage(ciphertext, key):
    plainText = ''
    for letter in ciphertext:
        if letter in lowerCase:
            index = lowerCase.index(letter)
            shiftedIndex = (index - key) % 26
            plainText += lowerCase[shiftedIndex]
        elif letter in upperCase:
            index = upperCase.index(letter)
            shiftedIndex = (index - key) % 26
            plainText += upperCase[shiftedIndex]
        else:
            plainText += letter
    return plainText  # Added return statement

# Initialize uppercase and lowercase lists before they are used
upperCase = [chr(i) for i in range(65, 91)]  # A-Z
lowerCase = [chr(j) for j in range(97, 123)]  # a-z

# User input for message and key
message = input('Enter your message here: ')
while True:
    try:
        key = int(input('Enter your key here (must be a number): '))
        break
    except ValueError:
        print("Invalid input! Please enter a number.")

# Encrypting message
ciphertext = encryptMessage(message, key)
print(f'Others will see: {ciphertext}')

# User input for decryption key
while True:
    try:
        key2 = int(input('Please enter the key to decrypt your message: '))
        break
    except ValueError:
        print("Invalid input! Please enter a number.")

# Decrypting message
plainText = decryptMessage(ciphertext, key2)
print(f'Hidden Message seen by receiver: {plainText}')
