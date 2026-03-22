/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cot
 */
public class cot_0
extends nr_0 {
    private int mcV;
    private int bap;
    private int baq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcV = byteBuffer.getInt();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12678;
    }

    public int evL() {
        return this.mcV;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }
}

