from random import randint
from sympy import isprime, mod_inverse

# Generate a large prime number
def generate_large_prime(start=10**5, end=10**6):
    while True:
        num = randint(start, end)
        if isprime(num):
            return num

# Key generation: returns (public_key, private_key)
def generate_keys():
    p = generate_large_prime()
    g = randint(2, p - 1)
    x = randint(1, p - 2)       # Private key
    y = pow(g, x, p)            # Public key component
    public_key = (p, g, y)
    private_key = x
    return public_key, private_key

# Encrypts a message using the public key
def encrypt(public_key, message):
    p, g, y = public_key
    if not (0 < message < p):
        raise ValueError(f"Message must be between 1 and {p - 1}")
    k = randint(1, p - 2)
    c1 = pow(g, k, p)
    c2 = (message * pow(y, k, p)) % p
    return (c1, c2)

# Decrypts a ciphertext using the private key and public key
def decrypt(private_key, public_key, ciphertext):
    p, _, _ = public_key
    c1, c2 = ciphertext
    s = pow(c1, private_key, p)
    s_inv = mod_inverse(s, p)
    message = (c2 * s_inv) % p
    return message

# Main execution
def main():
    print("Generating keys...")
    public_key, private_key = generate_keys()
    p, g, y = public_key

    print(f"\nPublic Key (p, g, y): {public_key}")
    print(f"Private Key (x): {private_key}")

    try:
        message = int(input(f"\nEnter a message (integer < {p}): "))
        ciphertext = encrypt(public_key, message)
        print(f"\nEncrypted Message: {ciphertext}")

        decrypted = decrypt(private_key, public_key, ciphertext)
        print(f"Decrypted Message: {decrypted}")
    except ValueError as ve:
        print("Error:", ve)

if __name__ == "__main__":
    main()
