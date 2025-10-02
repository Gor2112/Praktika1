import hashlib

input = "text"
hash = hashlib.sha256(input.encode()).hexdigest()
