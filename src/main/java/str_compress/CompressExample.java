package str_compress;


import java.io.IOException;
import static str_compress.GzipCompressor.compressAndBase64UrlEncode;
import static str_compress.GzipCompressor.uncompressAndBase64UrlDecode;

public class CompressExample {

    public static void main(String[] args) throws IOException {

        //String x = uncompressAndBase64UrlDecode("H4sIAAAAAAAAAA2OQWrDMBAA_6JzFq1WjiX5Vlp6zr3uQVqticGOTaQ4lJC_V8cZGJiX2mO9qkEVO2id5TDwKE8plYDzjmhgZYj7rj-_LvqD63zEOm83bdB5b4l0tD3CFBfebq0G4Y5iH7Jhwk5c9mSS6UNMTgKiJ01ICBiArO7PvU3unIGMc9DF4CCxTGA9C3YuGXJBndQ0L_K93ddY2yaXo6nCV1ljw9eo6t8uoxpGVer9wXVUp7ElsuTS7M_vW73_AamajdvkAAAA");
        String x = uncompressAndBase64UrlDecode("H4sIAAAAAAAAAA2Oy2rDMBAA_0XnLFo9bMu-lZaee697WK9WxGDHIlJcSsi_V8cZGJinylSvalLFTVpHOQ08yq-UaoFjRjSwM1DO-v3jS79xXU-q63HTBocQnLWaXI-QaOPjVlsG4sPQLdaOzMEz99QNEWNnJbgkJL22aBEMAlqNjgz2owPPxoO3mGCRkABj8r43bokjqYtK6yafx32n2j65nE0VvspODZ-zqn9ZZjXNqtT7g-usLnNLZIul2e-fl3r9AxlAt0LlAAAA");
        System.out.println(x);

        String y = compressAndBase64UrlEncode(x);
        System.out.println(y);
    }
}


