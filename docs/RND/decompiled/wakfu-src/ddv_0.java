/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddv
 */
final class ddv_0
implements alx_2 {
    ddv_0() {
    }

    @Override
    public void dialogUnloaded(String string) {
        int n = string.hashCode();
        ddr_0 ddr_02 = dds_0.fcD().NR(n);
        if (ddr_02 == null) {
            return;
        }
        ddr_02.bAs();
        dds_0.fcD().NS(n);
    }
}

