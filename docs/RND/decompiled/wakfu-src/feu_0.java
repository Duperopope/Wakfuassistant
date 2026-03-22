/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from feU
 */
class feu_0
implements fey_0 {
    private ffV iWZ;

    feu_0() {
    }

    feu_0(ffV ffV2) {
        this.iWZ = ffV2;
    }

    @Override
    public byte[] apI() {
        uy_1 uy_12 = new uy_1();
        this.iWZ.b(uy_12);
        ByteBuffer byteBuffer = ByteBuffer.allocate(uy_12.DN());
        uy_12.aF(byteBuffer);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        uy_1 uy_12 = new uy_1();
        uy_12.aG(byteBuffer);
        this.iWZ = fgD.fXh().a(uy_12);
    }

    @Override
    public void a(fej_0 fej_02) {
        fej_02.cj(this.iWZ);
    }

    @Override
    public ffa fUP() {
        return ffa.sfc;
    }

    public String toString() {
        return "AddItemChange{m_item=" + String.valueOf(this.iWZ) + "}";
    }
}

