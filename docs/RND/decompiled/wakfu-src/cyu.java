/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

public class cyu
extends nr_0 {
    private List<fpv> mmz;

    public List<fpv> aul() {
        return this.mmz;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmz = fpd_0.gt(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 15811;
    }
}

