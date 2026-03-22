/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fbs
extends faZ {
    private short rRo;
    private short rRp;
    private short rRq;
    private short ndR;

    fbs() {
    }

    public fbs(short s, short s2, short s3, short s4) {
        this.rRo = s;
        this.rRp = s2;
        this.rRq = s3;
        this.ndR = s4;
    }

    @Override
    public fbb fRz() {
        return fbb.rQm;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.aG(this.rRo);
        azg_12.aG(this.rRp);
        azg_12.aG(this.rRq);
        azg_12.aG(this.ndR);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.rRo = byteBuffer.getShort();
        this.rRp = byteBuffer.getShort();
        this.rRq = byteBuffer.getShort();
        this.ndR = byteBuffer.getShort();
    }

    @Override
    public void a(faR faR2) {
        faR2.a(this);
    }

    @Override
    public void a(faS faS2) {
        faS2.b(this);
    }

    public short fRL() {
        return this.rRo;
    }

    public short fRM() {
        return this.rRp;
    }

    public short fRN() {
        return this.rRq;
    }

    public short eLf() {
        return this.ndR;
    }

    @Override
    public String toString() {
        return "TopologyUpdate{m_oldPatchId=" + this.ndR + ", m_patchX=" + this.rRo + ", m_patchY=" + this.rRp + ", m_patchId=" + this.rRq + "} " + super.toString();
    }
}

