/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class fbq
extends faZ {
    private long rRl;
    private final acd_1 rRn = new acd_1();
    private byte[] ayE;
    private int hDt;

    fbq() {
    }

    public fbq(long l, acd_1 acd_12, byte[] byArray, int n) {
        this.rRl = l;
        this.rRn.C(acd_12);
        this.ayE = byArray;
        this.hDt = n;
    }

    @Override
    public fbb fRz() {
        return fbb.rQr;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.rRl);
        azg_12.vC(this.rRn.getX());
        azg_12.vC(this.rRn.getY());
        azg_12.aG(this.rRn.bdi());
        azg_12.vC(this.ayE.length);
        azg_12.dH(this.ayE);
        azg_12.vC(this.hDt);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.rRl = byteBuffer.getLong();
        this.rRn.Q(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.ayE = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.ayE);
        this.hDt = byteBuffer.getInt();
    }

    @Override
    public void a(faR faR2) {
        faR2.a(this);
    }

    @Override
    public void a(faS faS2) {
        faS2.b(this);
    }

    public long fRJ() {
        return this.rRl;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    public int fRK() {
        return this.hDt;
    }

    public acd_1 aZw() {
        return this.rRn;
    }

    @Override
    public String toString() {
        return "InteractiveElementUpdate{m_data=" + Arrays.toString(this.ayE) + ", m_elementUid=" + this.rRl + ", m_position=" + String.valueOf(this.rRn) + "} " + super.toString();
    }
}

