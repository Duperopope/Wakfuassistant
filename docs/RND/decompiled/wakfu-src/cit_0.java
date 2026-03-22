/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cit
 */
public class cit_0
extends nr_0 {
    private byte lUJ;
    private int lUK;
    private byte[] lUI;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lUJ = byteBuffer.get();
        if (this.lUJ == 5 || this.lUJ == 6 || this.lUJ == 121) {
            if (!this.h(byArray.length, 5, false)) {
                return false;
            }
            this.lUK = byteBuffer.getInt();
        }
        if (this.evh()) {
            if (!this.h(byArray.length, 3, false)) {
                return false;
            }
            int n = byteBuffer.getShort() & 0xFFFF;
            if (!this.h(byArray.length, n + 3, true)) {
                return false;
            }
            this.lUI = new byte[n];
            byteBuffer.get(this.lUI);
        }
        return true;
    }

    @Override
    public int d() {
        return 563;
    }

    public boolean evh() {
        return this.lUJ == 0;
    }

    public byte evi() {
        return this.lUJ;
    }

    public byte[] evg() {
        return this.lUI;
    }

    public int evj() {
        return this.lUK;
    }
}

