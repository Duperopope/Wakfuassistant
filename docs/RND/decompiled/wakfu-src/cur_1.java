/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUr
 */
public class cur_1
implements adi_1 {
    private static final cur_1 nLX = new cur_1();

    public static cur_1 eRP() {
        return nLX;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19204: {
                dbd_0 dbd_02 = (dbd_0)aam_22;
                ckc_0 ckc_02 = new ckc_0();
                ckc_02.setExchangeId(dbd_02.faD());
                ckc_02.dl((byte)0);
                aue_0.cVJ().etu().d(ckc_02);
                return false;
            }
            case 16397: {
                dbe_0 dbe_02 = (dbe_0)aam_22;
                ckc_0 ckc_03 = new ckc_0();
                ckc_03.setExchangeId(dbe_02.faD());
                ckc_03.dl((byte)1);
                aue_0.cVJ().etu().d(ckc_03);
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
}

