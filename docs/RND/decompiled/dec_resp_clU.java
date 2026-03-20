/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class clU
extends cmy {
    private mI map;
    private fjc maq;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.map = mI.cb(byArray);
        this.maq = fjc.Wt(byteBuffer.get());
    }

    @Override
    public int d() {
        return 13653;
    }

    @Generated
    public mI evA() {
        return this.map;
    }

    @Generated
    public fjc evB() {
        return this.maq;
    }
}
