/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cmu
 */
public class cmu_0
extends nv_0 {
    private mc kcW;
    private int ejM;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.kcW.toByteArray();
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length + 4);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putInt(this.ejM);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12640;
    }

    @Generated
    public void e(mc mc2) {
        this.kcW = mc2;
    }

    @Generated
    public void Fq(int n) {
        this.ejM = n;
    }
}

