/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteIntProcedure
 */
import gnu.trove.procedure.TByteIntProcedure;

/*
 * Renamed from fnk
 */
public class fnk_0
implements TByteIntProcedure {
    private int sIn = 0;
    private int sIo = 0;

    public boolean execute(byte by, int n) {
        this.sIn += by * n;
        this.sIo += n;
        return true;
    }

    public void clear() {
        this.sIn = 0;
        this.sIo = 0;
    }

    public float gdX() {
        return this.sIo == 0 ? 0.0f : (float)this.sIn / (float)this.sIo;
    }

    public int geb() {
        return this.sIo;
    }
}

