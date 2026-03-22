/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cok
extends nr_0 {
    private byte[] mcH;
    private final ArrayList<byte[]> mcI = new ArrayList();
    private final ArrayList<fnd_0> mcJ = new ArrayList();
    private byte[] mcK;

    @Override
    public boolean dn(byte[] byArray) {
        Object object;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcH = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(this.mcH);
        byte[] byArray2 = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray2);
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray2);
        int n = byteBuffer2.getShort();
        for (int i = 0; i < n; ++i) {
            object = new byte[byteBuffer2.getShort() & 0xFFFF];
            byteBuffer2.get((byte[])object);
            this.mcI.add((byte[])object);
        }
        byte[] byArray3 = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray3);
        object = ByteBuffer.wrap(byArray3);
        int n2 = ((ByteBuffer)object).getShort();
        for (int i = 0; i < n2; ++i) {
            this.mcJ.add(fnd_0.gn((ByteBuffer)object));
        }
        this.mcK = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(this.mcK);
        return true;
    }

    @Override
    public int d() {
        return 12830;
    }

    public byte[] evU() {
        return this.mcH;
    }

    public ArrayList<byte[]> evV() {
        return this.mcI;
    }

    public ArrayList<fnd_0> evW() {
        return this.mcJ;
    }

    public byte[] evX() {
        return this.mcK;
    }
}

