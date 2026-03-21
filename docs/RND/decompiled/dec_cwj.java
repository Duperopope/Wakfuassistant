Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  azy
 *  cwi
 *  fsn
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cwj
extends cwi {
    private int mfZ;
    byte[] hvy;
    private boolean mga;
    private boolean mkP = false;
    private final ArrayList<azy<Integer, Integer, Long>> mkQ = new ArrayList();

    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fk(byteBuffer);
        this.mkP = byteBuffer.get() == 1;
        this.mga = byteBuffer.get() == 1;
        this.mfZ = byteBuffer.getInt();
        this.hvy = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvy);
        while (byteBuffer.hasRemaining()) {
            this.mkQ.add((azy<Integer, Integer, Long>)new azy((Object)byteBuffer.getInt(), (Object)byteBuffer.getInt(), (Object)byteBuffer.getLong()));
        }
        return true;
    }

    public int d() {
        return 12265;
    }

    public int avZ() {
        return this.mfZ;
    }

    public fsn eEH() {
        return fsn.tcB;
    }

    public int ezG() {
        return this.mfZ;
    }

    public ArrayList<azy<Integer, Integer, Long>> eEI() {
        return this.mkQ;
    }

    public byte[] ezH() {
        return this.hvy;
    }

    public boolean eEJ() {
        return this.mkP;
    }

    public boolean ezI() {
        return this.mga;
    }
}

