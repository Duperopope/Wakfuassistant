/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ctU
 */
public class ctu_0
extends nr_0 {
    private static final Logger miW = Logger.getLogger(ctu_0.class);
    private String lgq;
    int miX;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.miX = byteBuffer.getInt();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.lgq = BH.dc(byArray2);
        return true;
    }

    public exp_0 eCQ() {
        exp_0[] exp_0Array = exp_0.values();
        for (int i = 0; i < exp_0Array.length; ++i) {
            if (exp_0Array[i].ordinal() != this.miX) continue;
            return exp_0Array[i];
        }
        miW.error((Object)("Erreur \u00e0 lad\u00e9s\u00e9rialisation dun r\u00e9sultat de vote (alors qu'on \u00e9tait d\u00e9connect\u00e9) : r\u00e9sultat de type " + this.miX + " inconnu"));
        return exp_0.oXW;
    }

    public String eCI() {
        return this.lgq;
    }

    @Override
    public int d() {
        return 14489;
    }
}

