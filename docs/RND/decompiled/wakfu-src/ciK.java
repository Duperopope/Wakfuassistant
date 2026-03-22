/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import org.apache.commons.lang3.ArrayUtils;

public class ciK
extends nv_0 {
    private abj_2 lVi;
    private aea_0 lVj = aea_0.cmC;

    @Override
    public byte[] aVX() {
        if (this.lVi == null) {
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.lVj.d());
        byte[] byArray = ArrayUtils.addAll((byte[])byteBuffer.array(), (byte[])this.lVi.aVX());
        return this.a((byte)3, byArray);
    }

    @Override
    public int d() {
        return 12969;
    }

    public abj_2 evt() {
        return this.lVi;
    }

    public void c(abj_2 abj_22) {
        this.lVi = abj_22;
    }

    public void b(aea_0 aea_02) {
        this.lVj = aea_02;
    }
}

