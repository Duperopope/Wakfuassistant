/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from faA
 */
public class faa_0 {
    private final long rPG;
    private final String rPH;
    private final long rPI;
    private int mgw;
    private boolean kWv;
    private boolean kYO;

    public faa_0(long l, String string, long l2, int n, boolean bl) {
        this(l, string, l2, n, false, bl);
    }

    public faa_0(long l, String string, long l2, int n, boolean bl, boolean bl2) {
        this.rPG = l;
        this.rPH = string;
        this.rPI = l2;
        this.mgw = n;
        this.kWv = bl;
        this.kYO = bl2;
    }

    public long Ya() {
        return this.rPG;
    }

    public String HR() {
        return this.rPH;
    }

    public long HP() {
        return this.rPI;
    }

    public boolean bVe() {
        return this.kWv;
    }

    public void mO(boolean bl) {
        this.kWv = bl;
    }

    public static faa_0 fO(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        if (l == 0L) {
            return null;
        }
        long l2 = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = BH.dc(byArray);
        int n = byteBuffer.getInt();
        boolean bl = byteBuffer.get() == 1;
        boolean bl2 = byteBuffer.get() == 1;
        return new faa_0(l, string, l2, n, bl, bl2);
    }

    public static void a(faa_0 faa_02, azg_1 azg_12) {
        if (faa_02 == null) {
            azg_12.gK(0L);
            return;
        }
        azg_12.gK(faa_02.Ya());
        azg_12.gK(faa_02.HP());
        byte[] byArray = BH.aP(faa_02.HR());
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.vC(faa_02.eAn());
        azg_12.aF(faa_02.bVe() ? (byte)1 : 0);
        azg_12.aF(faa_02.dLd() ? (byte)1 : 0);
    }

    public int eAn() {
        return this.mgw;
    }

    public void TO(int n) {
        this.mgw = n;
    }

    public boolean dLd() {
        return this.kYO;
    }

    public void mP(boolean bl) {
        this.kYO = bl;
    }

    public long aqZ() {
        return this.rPG * -1L;
    }

    public String toString() {
        return "HavenWorldBasicInfo{m_guildId=" + this.rPG + ", m_guildName='" + this.rPH + "', m_guildBlazon=" + this.rPI + ", m_resources=" + this.mgw + ", m_open=" + this.kWv + ", m_guildOnly=" + this.kYO + "}";
    }
}

