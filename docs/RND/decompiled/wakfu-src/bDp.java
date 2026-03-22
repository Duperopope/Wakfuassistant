/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 */
import gnu.trove.map.hash.TByteIntHashMap;

public abstract class bDp {
    private final bxW jJY;
    private final String jJZ;
    private final TByteIntHashMap jKa = new TByteIntHashMap();

    public bDp(bxW bxW2, String string) {
        this.jJY = bxW2;
        this.jJZ = string;
    }

    public int d(byte by, int n) {
        return this.jKa.put(by, n);
    }

    public void dQL() {
        this.jKa.clear();
    }

    public bxW dQM() {
        return this.jJY;
    }

    public String getAnimName() {
        return this.jJZ;
    }

    public TByteIntHashMap dQN() {
        return this.jKa;
    }

    public abstract eIz dNV();

    public abstract fi_1 bex();
}

