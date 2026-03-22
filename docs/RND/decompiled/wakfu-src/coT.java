/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class coT
extends nr_0 {
    private final ArrayList<azy_1<Integer, Long, Short>> mdz = new ArrayList();
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            this.mdz.add(new azy_1<Integer, Long, Short>(byteBuffer.getInt(), byteBuffer.getLong(), byteBuffer.getShort()));
        }
        return true;
    }

    @Override
    public int d() {
        return 12260;
    }

    public ArrayList<azy_1<Integer, Long, Short>> ewO() {
        return this.mdz;
    }

    public long KU() {
        return this.aDh;
    }
}

