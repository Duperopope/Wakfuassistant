/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYm
 */
class cym_1
implements alx_2 {
    private final String nYb;
    private final String nYc;

    cym_1(String string, String string2) {
        this.nYb = string;
        this.nYc = string2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals(this.nYb)) {
            fyw_0.gqw().tl(this.nYc);
            fyw_0.gqw().b(this);
        } else if (string.equals(this.nYc)) {
            fyw_0.gqw().b(this);
        }
    }
}

