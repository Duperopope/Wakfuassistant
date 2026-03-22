/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cis
 */
public class cis_0
extends nr_0 {
    private byte[] lUI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        this.lUI = new byte[n];
        byteBuffer.get(this.lUI);
        return true;
    }

    @Override
    public int d() {
        return 439;
    }

    public byte[] evg() {
        return (byte[])this.lUI.clone();
    }
}

