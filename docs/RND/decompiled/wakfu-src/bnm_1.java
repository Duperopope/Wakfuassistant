/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnm
 */
public class bnm_1
implements aeh_2 {
    public static final String iHp = "id";
    public static final String iHq = "name";
    private final long iHr;
    private final String iHs;

    public bnm_1(bnl_1 bnl_12, long l, String string) {
        this.iHr = l;
        this.iHs = string;
    }

    public long Sn() {
        return this.iHr;
    }

    public String getName() {
        return this.iHs;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iHp)) {
            return this.iHr;
        }
        if (string.equals(iHq)) {
            return this.iHs;
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bnm_1 bnm_12 = (bnm_1)object;
        return this.iHr == bnm_12.iHr;
    }

    public int hashCode() {
        return (int)(this.iHr ^ this.iHr >>> 32);
    }
}

