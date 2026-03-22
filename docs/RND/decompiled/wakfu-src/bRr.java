/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class bRr
extends Enum<bRr>
implements aoq_1 {
    public static final /* enum */ bRr lab = new bRr(-1);
    public static final /* enum */ bRr lac = new bRr(4);
    public static final /* enum */ bRr lad = new bRr(13);
    public static final /* enum */ bRr lae = new bRr(1);
    public static final /* enum */ bRr laf = new bRr(11);
    public static final /* enum */ bRr lag = new bRr(12);
    public static final /* enum */ bRr lah = new bRr(3);
    public static final /* enum */ bRr lai = new bRr(5);
    public static final /* enum */ bRr laj = new bRr(6);
    public static final /* enum */ bRr lak = new bRr(7);
    public static final /* enum */ bRr lal = new bRr(8);
    public static final /* enum */ bRr lam = new bRr(10);
    private final byte lan;
    private static final /* synthetic */ bRr[] lao;

    public static bRr[] values() {
        return (bRr[])lao.clone();
    }

    public static bRr valueOf(String string) {
        return Enum.valueOf(bRr.class, string);
    }

    private bRr(byte by) {
        this.lan = by;
    }

    public byte aFW() {
        return this.lan;
    }

    @Nullable
    public static bRr cM(byte by) {
        for (bRr bRr2 : bRr.values()) {
            if (bRr2.lan != by) continue;
            return bRr2;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.lan);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ bRr[] ekP() {
        return new bRr[]{lab, lac, lad, lae, laf, lag, lah, lai, laj, lak, lal, lam};
    }

    static {
        lao = bRr.ekP();
    }
}

