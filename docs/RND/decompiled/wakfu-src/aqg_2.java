/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;

/*
 * Renamed from aqg
 */
public final class aqg_2
implements aqh_2 {
    private int o;
    private short cPE;
    private byte[] ayE;

    public aqg_2(int n, short s, byte[] byArray) {
        this.o = n;
        this.cPE = s;
        this.ayE = byArray;
    }

    public aqg_2() {
    }

    public int d() {
        return this.o;
    }

    public short bGi() {
        return this.cPE;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    @Override
    public void f(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.o);
        dataOutputStream.writeShort(this.cPE);
        dataOutputStream.writeInt(this.ayE.length);
        dataOutputStream.write(this.ayE);
    }

    @Override
    public void d(DataInputStream dataInputStream) {
        this.o = dataInputStream.readInt();
        this.cPE = dataInputStream.readShort();
        int n = dataInputStream.readInt();
        this.ayE = new byte[n];
        dataInputStream.read(this.ayE);
    }

    public static int e(DataInputStream dataInputStream) {
        dataInputStream.readInt();
        dataInputStream.readShort();
        int n = dataInputStream.readInt();
        dataInputStream.skipBytes(n);
        return 10 + n;
    }
}

