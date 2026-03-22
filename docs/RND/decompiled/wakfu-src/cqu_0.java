/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cqU
 */
public class cqu_0
extends cqQ {
    private final List<Long> mfH = new ArrayList<Long>();
    private final List<Long> mfI = new ArrayList<Long>();
    private final List<Long> mfJ = new ArrayList<Long>();
    private boolean htA;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 13, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        boolean bl = this.htA = byteBuffer.get() == 1;
        if (!this.htA) {
            long l;
            int n;
            int n2 = byteBuffer.get();
            for (n = 0; n < n2; ++n) {
                l = byteBuffer.getLong();
                this.mfH.add(l);
            }
            n2 = byteBuffer.get();
            for (n = 0; n < n2; ++n) {
                l = byteBuffer.getLong();
                this.mfI.add(l);
            }
            n2 = byteBuffer.get();
            for (n = 0; n < n2; ++n) {
                l = byteBuffer.getLong();
                this.mfJ.add(l);
            }
        }
        return true;
    }

    @Override
    public int d() {
        return 12275;
    }

    public List<Long> ezi() {
        return this.mfH;
    }

    public List<Long> ezj() {
        return this.mfI;
    }

    public List<Long> ezk() {
        return this.mfJ;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsi;
    }

    public boolean ezl() {
        return this.htA;
    }
}

