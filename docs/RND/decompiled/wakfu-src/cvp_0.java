/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvp
 */
public class cvp_0
extends nr_0 {
    private int mcV;
    private int bap;
    private int baq;
    private int bfF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcV = byteBuffer.getInt();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.bfF = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12379;
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

    public int avZ() {
        return this.bfF;
    }
}

