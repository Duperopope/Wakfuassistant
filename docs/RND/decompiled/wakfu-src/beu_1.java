/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEu
 */
public class beu_1
implements aeh_2 {
    public static final String jOq = "name";
    public static final String jOr = "iconUrl";
    public static final String jOs = "itemType";
    protected final fhy_0 jOt;
    public final String[] jOu = new String[]{"name", "iconUrl", "itemType"};

    public beu_1(fhy_0 fhy_02) {
        this.jOt = fhy_02;
    }

    @Override
    public String[] bxk() {
        return this.jOu;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jOq)) {
            return this.jOt == null ? aum_0.cWf().c("all", new Object[0]) : this.jOt.getName();
        }
        if (string.equals(jOr)) {
            return auc_0.cVq().aZ(this.jOt == null ? (short)-1 : this.jOt.aIi());
        }
        if (string.equals(jOs)) {
            return this.jOt;
        }
        return null;
    }

    public fhy_0 dGh() {
        return this.jOt;
    }

    public boolean equals(Object object) {
        if (!(object instanceof beu_1)) {
            return false;
        }
        return this.jOt == ((beu_1)object).dGh();
    }
}

