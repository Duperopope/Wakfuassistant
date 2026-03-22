/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsi
 */
public final class fsi_0
extends Enum<fsi_0>
implements aoq_1 {
    public static final /* enum */ fsi_0 tbU = new fsi_0(0, false, 10, false, 0, 0.0f, "2  [taille <  perso / vent /       / sous   le perso]");
    public static final /* enum */ fsi_0 tbV = new fsi_0(1, false, 30, true, 3, 1.0471976f, "3  [taille ~= perso / vent / ombre / devant le perso]");
    public static final /* enum */ fsi_0 tbW = new fsi_0(2, true, 80, true, 5, 1.5707964f, "4  [taille >  perso /      / ombre / devant le perso]");
    public static final /* enum */ fsi_0 tbX = new fsi_0(3, false, 10, false, 0, 0.0f, "1  [ras du sol      /      /       / sous   le perso]");
    public static final /* enum */ fsi_0 tbY = new fsi_0(4, false, 10, false, 0, 0.0f, "2b [taille < perso  / vent /       / devant le perso]");
    public static final /* enum */ fsi_0 tbZ = new fsi_0(5, false, 30, true, 3, 1.0471976f, "3b [taille ~= perso /      / ombre / devant le perso]");
    public static final /* enum */ fsi_0 tca = new fsi_0(6, true, 80, false, 0, 0.0f, "4b [taille > perso /       /       / devant le perso]");
    private final int tcb;
    private final boolean tcc;
    private final int tcd;
    private final boolean tce;
    private final int tcf;
    private final float tcg;
    private final String tch;
    private static final /* synthetic */ fsi_0[] tci;

    public static fsi_0[] values() {
        return (fsi_0[])tci.clone();
    }

    public static fsi_0 valueOf(String string) {
        return Enum.valueOf(fsi_0.class, string);
    }

    private fsi_0(int n2, boolean bl, int n3, boolean bl2, int n4, float f2, String string2) {
        this.tcb = n2;
        this.tcc = bl;
        this.tcd = n3;
        this.tce = bl2;
        this.tcf = n4;
        this.tcg = f2;
        this.tch = string2;
    }

    public final boolean gkP() {
        return this.tcc;
    }

    public final int gkQ() {
        return this.tcd;
    }

    public final boolean gkR() {
        return this.tce;
    }

    public final int gkS() {
        return this.tcf;
    }

    public final float gkT() {
        return this.tcg;
    }

    @Override
    public final String aXA() {
        return String.valueOf(this.tcb);
    }

    @Override
    public final String aXB() {
        return this.tch;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static boolean b(fsi_0 fsi_02) {
        return fsi_02 == tbX || fsi_02 == tbU;
    }

    public static boolean c(fsi_0 fsi_02) {
        return fsi_02 == tbU || fsi_02 == tbY || fsi_02 == tbV;
    }

    private static /* synthetic */ fsi_0[] gkU() {
        return new fsi_0[]{tbU, tbV, tbW, tbX, tbY, tbZ, tca};
    }

    static {
        tci = fsi_0.gkU();
    }
}

