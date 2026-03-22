/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRQ
 */
public class brq_2
implements aeh_2 {
    public static final String lcO = "titleText";
    public final String[] lcP = new String[]{"titleText"};
    private final brp_2 lcQ;

    public brq_2(brp_2 brp_22) {
        this.lcQ = brp_22;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lcO)) {
            return this.lcQ == null ? null : aum_0.cWf().c(this.lcQ.ely(), new Object[0]);
        }
        return null;
    }

    public brp_2 elA() {
        return this.lcQ;
    }

    public short elB() {
        return this.lcQ == null ? (short)-1 : this.lcQ.aIi();
    }
}

