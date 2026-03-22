/*
 * Decompiled with CFR 0.152.
 */
public final class fga
extends Enum<fga>
implements pt_0 {
    public static final /* enum */ fga shH = new fga(1, 0, Integer.MAX_VALUE, 0, 50, 50);
    private final byte shI;
    private final int shJ;
    private final int shK;
    private final int shL;
    private final int shM;
    private final int shN;
    private static final /* synthetic */ fga[] shO;

    public static fga[] values() {
        return (fga[])shO.clone();
    }

    public static fga valueOf(String string) {
        return Enum.valueOf(fga.class, string);
    }

    private fga(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.shI = (byte)n2;
        this.shJ = n3;
        this.shK = n4;
        this.shL = n5;
        this.shM = n6;
        this.shN = n7;
    }

    @Override
    public byte aJr() {
        return this.shI;
    }

    @Override
    public byte aYW() {
        return 1;
    }

    @Override
    public int aYX() {
        return this.shJ;
    }

    @Override
    public int aYY() {
        return this.shK;
    }

    @Override
    public int aYZ() {
        return this.shL;
    }

    @Override
    public int aZa() {
        return this.shM;
    }

    @Override
    public int aZb() {
        return this.shN;
    }

    @Override
    public boolean isExpandable() {
        return true;
    }

    @Override
    public boolean aYJ() {
        return false;
    }

    @Override
    public int aZc() {
        return -1;
    }

    public static fga d(Byte by) {
        for (fga fga2 : fga.values()) {
            if (fga2.aJr() != by.byteValue()) continue;
            return fga2;
        }
        return null;
    }

    private static /* synthetic */ fga[] fWD() {
        return new fga[]{shH};
    }

    static {
        shO = fga.fWD();
    }
}

