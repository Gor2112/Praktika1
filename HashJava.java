import java.security.MessageDigest;

String input = "text";
MessageDigest md = MessageDigest.getInstance("SHA-256");
byte[] hash = md.digest(input.getBytes());
