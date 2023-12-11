package mixed;

import java.util.Base64;

public class EncodeAndDecodeString {
	
	public static String getEncodedString(String str) {
		return Base64.getEncoder().encodeToString(str.getBytes());
	}
	
    public static String getDecodedString(String str) {
    	return new String(Base64.getDecoder().decode(str));
		
	}

	public static void main(String[] args) {

		String pass = "Automation123";

		// Encode
		String encodedPass = Base64.getEncoder().encodeToString(pass.getBytes());
		System.out.println(encodedPass);

		// Decode
		byte[] decodedPass = Base64.getDecoder().decode(encodedPass);

		String passDecoded = new String(decodedPass);

		System.out.println(passDecoded);

	}

}
