/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cwj
 */
public class cwj_0
extends cwi_0 {
    private int mfZ;
    byte[] hvy;
    private boolean mga;
    private boolean mkP = false;
    private final ArrayList<azy_1<Integer, Integer, Long>> mkQ = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fk(byteBuffer);
        this.mkP = byteBuffer.get() == 1;
        this.mga = byteBuffer.get() == 1;
        this.mfZ = byteBuffer.getInt();
        this.hvy = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvy);
        while (byteBuffer.hasRemaining()) {
            this.mkQ.add(new azy_1<Integer, Integer, Long>(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getLong()));
        }
        return true;
    }

    @Override
    public int d() {
        return 12265;
    }

    @Override
    public int avZ() {
        return this.mfZ;
    }

    @Override
    public fsn eEH() {
        return fsn.tcB;
    }

    public int ezG() {
        return this.mfZ;
    }

    public ArrayList<azy_1<Integer, Integer, Long>> eEI() {
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

