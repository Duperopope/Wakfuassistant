/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fay
 */
public class fay_0 {
    private static final Logger rPC = Logger.getLogger(fay_0.class);
    private final long rPD;
    private final String rPE;
    private final long rPF;

    private fay_0(long l, String string, long l2) {
        this.rPD = l;
        this.rPE = string;
        this.rPF = l2;
    }

    public long Ya() {
        return this.rPD;
    }

    public String HR() {
        return this.rPE;
    }

    public long Yc() {
        return this.rPF;
    }

    public String toString() {
        return "GuildInfo{m_guildId=" + this.rPD + ", m_guildName='" + this.rPE + "', m_blazon=" + this.rPF + "}";
    }

    public static long d(faz_0 faz_02) {
        return faz_02.Ya();
    }

    public static fay_0 fN(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        if (l == 0L) {
            return null;
        }
        long l2 = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = BH.dc(byArray);
        return new fay_0(l, string, l2);
    }

    public static void a(fay_0 fay_02, azg_1 azg_12) {
        if (fay_02 == null) {
            azg_12.gK(0L);
            return;
        }
        azg_12.gK(fay_02.Ya());
        azg_12.gK(fay_02.Yc());
        byte[] byArray = BH.aP(fay_02.HR());
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
    }

    public static fay_0 a(long l, String string, long l2) {
        if (l == 0L) {
            return null;
        }
        return new fay_0(l, string, l2);
    }
}

