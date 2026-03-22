/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class clX
extends cmy_0 {
    private mg mau;
    private fjc maq;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.mau = mg.bV(byArray);
        this.maq = fjc.Wt(byteBuffer.get());
    }

    @Override
    public int d() {
        return 12294;
    }

    @Generated
    public mg evC() {
        return this.mau;
    }

    @Generated
    public fjc evB() {
        return this.maq;
    }
}

