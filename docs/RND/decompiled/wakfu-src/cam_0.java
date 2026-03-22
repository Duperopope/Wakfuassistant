/*
 * Decompiled with CFR 0.152.
 */
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/*
 * Renamed from cAm
 */
public class cam_0
extends ful_0 {
    public static final cam_0 mnz = new cam_0("RSA", ewN.oKj);
    private KeyFactory mnA;

    public cam_0(String string, AlgorithmParameterSpec algorithmParameterSpec) {
        super(string, algorithmParameterSpec);
        try {
            this.mnA = KeyFactory.getInstance(this.tyl);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            tyk.fatal((Object)("Algorithme non support\u00e9 : " + this.tyl), (Throwable)noSuchAlgorithmException);
        }
    }

    public void en(byte[] byArray) {
        try {
            EncodedKeySpec encodedKeySpec = this.eX(byArray);
            PublicKey publicKey = this.mnA.generatePublic(encodedKeySpec);
            this.tyn.init(1, publicKey);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            tyk.fatal((Object)("Spec de clef publique invalide : " + this.tyl), (Throwable)invalidKeySpecException);
        }
        catch (InvalidKeyException invalidKeyException) {
            tyk.fatal((Object)("Clef publique invalide : " + this.tyl), (Throwable)invalidKeyException);
        }
    }

    @Override
    public byte[] eo(byte[] byArray) {
        try {
            return this.tyn.doFinal(byArray);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            tyk.error((Object)"taille de bloc invalide", (Throwable)illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            tyk.error((Object)"padding invalide", (Throwable)badPaddingException);
        }
        return null;
    }

    @Override
    public byte[] ep(byte[] byArray) {
        throw new UnsupportedOperationException("le client ne doit pas decrypter de donn\u00e9es de connection");
    }
}

