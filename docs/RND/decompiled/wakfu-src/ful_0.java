/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.apache.log4j.Logger;

/*
 * Renamed from ful
 */
public abstract class ful_0 {
    protected static final Logger tyk = Logger.getLogger(ful_0.class);
    protected final String tyl;
    protected final AlgorithmParameterSpec tym;
    protected Cipher tyn;

    protected ful_0(String string, AlgorithmParameterSpec algorithmParameterSpec) {
        this.tyl = string;
        this.tym = algorithmParameterSpec;
        try {
            this.tyn = Cipher.getInstance(this.tyl);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            tyk.fatal((Object)("Algorithme non support\u00e9 : " + this.tyl), (Throwable)noSuchAlgorithmException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            tyk.fatal((Object)("Padding non support\u00e9 pour " + this.tyl), (Throwable)noSuchPaddingException);
        }
    }

    protected EncodedKeySpec eX(byte[] byArray) {
        return new X509EncodedKeySpec(byArray);
    }

    public String gnh() {
        return this.tyl;
    }

    public abstract byte[] eo(byte[] var1);

    public abstract byte[] ep(byte[] var1);
}

