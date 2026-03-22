/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class fbo
extends faZ {
    private long rRl;
    private long mcW;
    private int baC;
    private final acd_1 rRm = new acd_1();
    private long ePP;
    private byte[] ayE;
    private int hDt;

    fbo() {
    }

    public fbo(long l, long l2, int n, acd_1 acd_12, long l3, byte[] byArray, int n2) {
        this.rRl = l;
        this.mcW = l2;
        this.baC = n;
        this.rRm.C(acd_12);
        this.ePP = l3;
        this.ayE = byArray;
        this.hDt = n2;
    }

    @Override
    public fbb fRz() {
        return fbb.rQs;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.rRl);
        azg_12.gK(this.mcW);
        azg_12.vC(this.baC);
        azg_12.vC(this.rRm.getX());
        azg_12.vC(this.rRm.getY());
        azg_12.aG(this.rRm.bdi());
        azg_12.gK(this.ePP);
        azg_12.vC(this.ayE.length);
        azg_12.dH(this.ayE);
        azg_12.vC(this.hDt);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.rRl = byteBuffer.getLong();
        this.mcW = byteBuffer.getLong();
        this.baC = byteBuffer.getInt();
        this.rRm.Q(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.ePP = byteBuffer.getLong();
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

    public long ZC() {
        return -1L;
    }

    public long fRJ() {
        return this.rRl;
    }

    public void rZ(long l) {
        this.rRl = l;
    }

    public long Xi() {
        return this.ePP;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    public int fRK() {
        return this.hDt;
    }

    public int cor() {
        return this.baC;
    }

    public acd_1 aZw() {
        return this.rRm;
    }

    public long ewl() {
        return this.mcW;
    }

    @Override
    public String toString() {
        return "InteractiveElementCreate{m_data=" + Arrays.toString(this.ayE) + ", m_elementUid=" + this.rRl + ", m_interactiveElementId=" + this.mcW + ", m_templateId=" + this.baC + ", m_position=" + String.valueOf(this.rRm) + ", m_ownerId=" + this.ePP + "} " + super.toString();
    }
}

