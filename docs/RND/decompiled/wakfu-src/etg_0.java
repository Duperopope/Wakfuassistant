/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTg
 */
public final class etg_0
extends Enum<etg_0>
implements pt_0 {
    private final byte rmL;
    private final int rmM;
    private final int rmN;
    private final int rmO;
    private final int rmP;
    private final int rmQ;
    private static final /* synthetic */ etg_0[] rmR;

    public static etg_0[] values() {
        return (etg_0[])rmR.clone();
    }

    public static etg_0 valueOf(String string) {
        return Enum.valueOf(etg_0.class, string);
    }

    private etg_0(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.rmL = (byte)n2;
        this.rmM = n3;
        this.rmN = n4;
        this.rmO = n5;
        this.rmP = n6;
        this.rmQ = n7;
    }

    @Override
    public byte aJr() {
        return this.rmL;
    }

    @Override
    public byte aYW() {
        return 2;
    }

    @Override
    public int aYX() {
        return this.rmM;
    }

    @Override
    public int aYY() {
        return this.rmN;
    }

    @Override
    public int aYZ() {
        return this.rmO;
    }

    @Override
    public int aZa() {
        return this.rmP;
    }

    @Override
    public int aZb() {
        return this.rmQ;
    }

    @Override
    public boolean isExpandable() {
        return false;
    }

    @Override
    public boolean aYJ() {
        return false;
    }

    @Override
    public int aZc() {
        return -1;
    }

    public static etg_0 b(Byte by) {
        for (etg_0 etg_02 : etg_0.values()) {
            if (etg_02.aJr() != by.byteValue()) continue;
            return etg_02;
        }
        return null;
    }

    private static /* synthetic */ etg_0[] fIV() {
        return new etg_0[0];
    }

    static {
        rmR = etg_0.fIV();
    }
}

