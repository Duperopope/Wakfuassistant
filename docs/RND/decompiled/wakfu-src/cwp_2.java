/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWp
 */
public class cwp_2
implements adi_1 {
    private static final cwp_2 nSD = new cwp_2();

    private cwp_2() {
    }

    public static cwp_2 eVR() {
        return nSD;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aue_0 aue_02 = aue_0.cVJ();
        switch (aam_22.d()) {
            case 19298: {
                if (!aue_02.c(csx_1.ePi())) {
                    aue_02.a(csx_1.ePi());
                }
                return false;
            }
            case 17523: {
                if (aue_02.c(csx_1.ePi())) {
                    aue_02.b(csx_1.ePi());
                } else {
                    aue_02.a(csx_1.ePi());
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            cdv_0.euj().e(this);
        }
    }
}

