/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSV
 */
class csv_2
extends bgx_0 {
    private final bfo_2 nHH = new csw_1(this);

    csv_2(csp_1 csp_12) {
        super(null);
    }

    @Override
    public String[] bxk() {
        return bfo_2.hSU;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("breedInfo")) {
            return this.nHH;
        }
        return super.eu(string);
    }
}

