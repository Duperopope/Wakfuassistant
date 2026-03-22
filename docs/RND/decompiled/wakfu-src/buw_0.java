/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from buw
 */
public class buw_0
implements aeh_2,
bek_0 {
    private static final String jpA = "furniture";
    private static final String jpB = "usable";
    private static final String jpC = "furnitureBackgroundStyle";
    private static final String[] jpD = new String[]{"furniture"};
    private final bgv_2 jpE;

    public buw_0(bgv_2 bgv_22) {
        this.jpE = bgv_22;
    }

    @Override
    public String[] bxk() {
        return jpD;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jpA)) {
            return this.jpE;
        }
        if (string.equals(jpB)) {
            return this.dJa();
        }
        if (string.equals(jpC)) {
            return this.dJa() != false ? null : beh_1.jNG.getStyle();
        }
        return null;
    }

    public Boolean dJa() {
        ang_2 ang_22 = this.jpE.a(ffj_0.sgc);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return Boolean.FALSE;
        }
        if (ewo_0.oBF.o(ewr_0.oDC).contains(this.jpE.d())) {
            return Boolean.FALSE;
        }
        return ang_22 == null || ang_22.b(bgt_02, bgt_02.aZw(), ffV.k(this.jpE), bgt_02.bdV());
    }

    @Override
    public bgv_2 duo() {
        return this.jpE;
    }

    public String getName() {
        return this.jpE.getName();
    }

    public String dah() {
        return this.jpE.dah();
    }
}

