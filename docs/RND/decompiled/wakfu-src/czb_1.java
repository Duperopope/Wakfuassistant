/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from cZb
 */
public final class czb_1
extends Enum<czb_1> {
    public static final /* enum */ czb_1 nZV = new czb_1(true);
    public static final /* enum */ czb_1 nZW = new czb_1();
    public static final /* enum */ czb_1 nZX = new czb_1();
    public static final /* enum */ czb_1 nZY = new czb_1();
    private final boolean nZZ;
    private static final /* synthetic */ czb_1[] oaa;

    public static czb_1[] values() {
        return (czb_1[])oaa.clone();
    }

    public static czb_1 valueOf(String string) {
        return Enum.valueOf(czb_1.class, string);
    }

    private czb_1() {
        this(false);
    }

    private czb_1(boolean bl) {
        this.nZZ = bl;
    }

    @Generated
    public boolean isValid() {
        return this.nZZ;
    }

    private static /* synthetic */ czb_1[] eYG() {
        return new czb_1[]{nZV, nZW, nZX, nZY};
    }

    static {
        oaa = czb_1.eYG();
    }
}

