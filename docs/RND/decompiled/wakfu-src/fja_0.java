/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fjA
 */
public abstract class fja_0 {
    private static final Logger syZ = Logger.getLogger(fja_0.class);

    public abstract fjz_0 gbX();

    public static byte[] c(fjz_0 fjz_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5 + fjz_02.DN());
        byteBuffer.put((byte)fjz_02.gbV().ordinal());
        byteBuffer.putInt(fjz_02.Xt());
        fjz_02.aF(byteBuffer);
        return byteBuffer.array();
    }

    @Nullable
    public static fjz_0 eT(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        fjz_0 fjz_02 = fjb_0.gR(by);
        if (fjz_02 == null) {
            syZ.error((Object)("Impossible de d\u00e9coder une NactionActionRequest : type inconnu : " + by));
            return null;
        }
        fjz_02.Le(byteBuffer.getInt());
        if (fjz_02.aG(byteBuffer)) {
            return fjz_02;
        }
        syZ.error((Object)("Erreur \u00e0 la d\u00e9s\u00e9rialisation d'une requ\u00eate de type " + by));
        return null;
    }
}

