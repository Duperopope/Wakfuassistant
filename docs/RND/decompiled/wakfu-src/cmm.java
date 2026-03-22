/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cmm
extends cmy_0 {
    private mg maC;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.maC = mg.bV(byArray);
    }

    @Override
    public int d() {
        return 13728;
    }

    @Generated
    public mg evG() {
        return this.maC;
    }
}

