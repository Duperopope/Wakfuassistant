/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpu
 */
public final class cpu_0
extends nr_0 {
    private byte[] mdT;
    private byte[] mcL;
    private byte[] mcM;

    public byte[] evZ() {
        return this.mcL;
    }

    public byte[] ewa() {
        return this.mcM;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdT = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mdT);
        this.mcL = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mcL);
        this.mcM = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mcM);
        return false;
    }

    public byte[] exn() {
        return this.mdT;
    }

    @Override
    public int d() {
        return 13145;
    }
}

