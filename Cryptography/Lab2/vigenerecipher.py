import numpy as np

def extendKey(key, length):
    """ Extend the key to match the length of the plaintext """
    key = key.lower()  # Convert key to lowercase
    return (key * (length // len(key))) + key[:length % len(key)]

def encryptMessage(plainText, key):
    cipherText = ''
    key = extendKey(key, len(plainText))
    count = 0
    
    for letter in plainText:
        if letter in lowerCase:
            index = lowerCase.index(letter)
            shifter = lowerCase.index(key[count])
            shiftedIndex = (index + shifter) % 26
            cipherText += lowerCase[shiftedIndex]
            count += 1
        elif letter in upperCase:
            index = upperCase.index(letter)
            shifter = lowerCase.index(key[count])  # Use lowercase key for shift
            shiftedIndex = (index + shifter) % 26
            cipherText += upperCase[shiftedIndex]
            count += 1
        else:
            cipherText += letter  # Keep spaces, punctuation unchanged
    return cipherText

def decryptMessage(cipherText, key):
    plainText = ''
    key = extendKey(key, len(cipherText))
    count = 0
    
    for letter in cipherText:
        if letter in lowerCase:
            index = lowerCase.index(letter)
            shifter = lowerCase.index(key[count])
            shiftedIndex = (index - shifter) % 26
            plainText += lowerCase[shiftedIndex]
            count += 1
        elif letter in upperCase:
            index = upperCase.index(letter)
            shifter = lowerCase.index(key[count])  # Use lowercase key for shift
            shiftedIndex = (index - shifter) % 26
            plainText += upperCase[shiftedIndex]
            count += 1
        else:
            plainText += letter  # Keep spaces, punctuation unchanged
    return plainText

# Creating uppercase and lowercase letter lists
upperCase = [chr(i) for i in range(65, 91)]
lowerCase = [chr(i) for i in range(97, 123)]

# User Input
message = input('Enter your message: ')
while True:
    key = input('Enter the encryption key (letters only): ')
    if key.isalpha():
        break
    print("Invalid key! Please enter only alphabetic characters.")

# Encrypting Message
cipherText = encryptMessage(message, key)
print(f'Your encrypted message: {cipherText}')

# Decryption with user-provided key
while True:
    key2 = input('Please enter the secret key to decrypt the message: ')
    if key2.isalpha():
        break
    print("Invalid key! Please enter only alphabetic characters.")

plainText = decryptMessage(cipherText, key2)

print(f'Your hidden message is: {plainText}')
