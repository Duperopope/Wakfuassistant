/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class cpz
extends nr_0 {
    private long aDh;
    private List<fm_1> mdX;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        int n = byteBuffer.getShort();
        this.mdX = new ArrayList<fm_1>(n);
        for (int i = 0; i < n; ++i) {
            this.mdX.add(fm_1.ce(byteBuffer.getInt()));
        }
        return true;
    }

    @Override
    public int d() {
        return 13256;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public List<fm_1> exr() {
        return this.mdX;
    }
}

