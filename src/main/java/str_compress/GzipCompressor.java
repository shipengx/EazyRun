package str_compress;

import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompressor {
    public GzipCompressor() {
    }

    public static byte[] compress(String text) throws IOException {
        ByteArrayOutputStream rstBao = new ByteArrayOutputStream();
        GZIPOutputStream zos = new GZIPOutputStream(rstBao);
        zos.write(text.getBytes(Charset.defaultCharset()));
        IOUtils.closeQuietly(zos);
        return rstBao.toByteArray();
    }

    public static String compressAndBase64UrlEncode(String text) throws IOException {
        return Base64.getUrlEncoder().encodeToString(compress(text));
    }

    public static String uncompress(byte[] zippedBytes) throws IOException {
        GZIPInputStream zi = null;

        String var2;
        try {
            zi = new GZIPInputStream(new ByteArrayInputStream(zippedBytes));
            var2 = IOUtils.toString(zi);
        } finally {
            IOUtils.closeQuietly(zi);
        }

        return var2;
    }

    public static String uncompressAndBase64UrlDecode(String zippedBase64Str) throws IOException {
        byte[] bytes = Base64.getUrlDecoder().decode(zippedBase64Str);
        return uncompress(bytes);
    }
}
