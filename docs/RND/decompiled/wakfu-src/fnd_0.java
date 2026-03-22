/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fnd
 */
public class fnd_0 {
    private final int sHK;
    private final long sHL;
    private fjo_0 laU;
    private long mbg;
    private float nWO;
    private int sHM;
    private final int sHN;
    private boolean sHO;
    private final String sHP;

    protected fnd_0(int n, long l, fjo_0 fjo_02, boolean bl, long l2, float f2, int n2, int n3) {
        this(n, l, fjo_02, bl, l2, f2, n2, n3, null);
    }

    protected fnd_0(int n, long l, fjo_0 fjo_02, boolean bl, long l2, float f2, int n2, int n3, String string) {
        this.sHK = n;
        this.sHL = l;
        this.laU = fjo_02;
        this.sHO = bl;
        this.uq(l2);
        this.nWO = f2;
        this.sHM = n2;
        this.sHN = n3;
        this.sHP = string;
    }

    public int d() {
        return this.sHK;
    }

    public static fnd_0 gn(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        long l = byteBuffer.getLong();
        fjo_0 fjo_02 = fjt.syH.WG(byteBuffer.getInt());
        return new fnd_0(n, l, fjo_02, byteBuffer.get() != 0, byteBuffer.getLong(), byteBuffer.getFloat(), byteBuffer.getInt(), byteBuffer.getInt());
    }

    public fjo_0 ems() {
        return this.laU;
    }

    public int Xt() {
        return this.laU.Xt();
    }

    public void h(fjo_0 fjo_02) {
        this.laU = fjo_02;
    }

    public boolean exj() {
        return this.sHO;
    }

    public void iP(boolean bl) {
        this.sHO = bl;
    }

    public long emK() {
        return this.mbg;
    }

    public void uq(long l) {
        this.mbg = Math.min(1000000000L, this.mbg + l);
    }

    public void Xb(int n) {
        this.sHM = n;
    }

    public float gdP() {
        return this.nWO;
    }

    public void b(frk frk2, float f2) {
        switch (frk2) {
            case sXG: {
                this.nWO = f2;
                break;
            }
            default: {
                throw new UnsupportedOperationException("Context de taxe non g\u00e9r\u00e9 : " + String.valueOf((Object)frk2));
            }
        }
    }

    public int emO() {
        return this.sHM;
    }

    public int emM() {
        return this.sHN;
    }

    public String gdQ() {
        return this.sHP;
    }

    public static int DN() {
        return 37;
    }

    public String toString() {
        return "NationProtectorInfo{m_id=" + this.sHK + ", m_territoryId=" + this.sHL + ", m_nation=" + String.valueOf(this.laU) + ", m_isChaos=" + this.sHO + ", m_cash=" + this.mbg + ", m_marketTaxValue=" + this.nWO + ", m_currentSatisfaction=" + this.sHM + " / " + this.sHN + ", m_serverIdString=" + this.sHP + "}";
    }

    public long dYx() {
        return this.sHL;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.sHK);
        byteBuffer.putLong(this.sHL);
        byteBuffer.putInt(this.laU.Xt());
        byteBuffer.put(this.sHO ? (byte)1 : 0);
        byteBuffer.putLong(this.mbg);
        byteBuffer.putFloat(this.nWO);
        byteBuffer.putInt(this.sHM);
        byteBuffer.putInt(this.sHN);
    }
}

