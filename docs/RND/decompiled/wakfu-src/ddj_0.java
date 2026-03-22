/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from ddj
 */
class ddj_0 {
    private final afx_1 ogs;
    private final String ogt;
    private final String ogu;
    private final String ogv;
    private final String ogw;
    private final String ogx;

    ddj_0(ddi ddi2, afx_1 afx_12, String string, String string2, String string3, String string4) {
        this.ogu = string;
        this.ogt = string2;
        this.ogv = string3;
        this.ogw = string4;
        this.ogs = afx_12;
        this.ogx = "|" + string2 + "|" + string + "|" + string3 + "|" + string4;
    }

    public String fcx() {
        return this.ogu;
    }

    public String fcy() {
        return this.ogt;
    }

    public String aMC() {
        return this.ogv;
    }

    public String fcz() {
        return this.ogw;
    }

    public afx_1 fcA() {
        return this.ogs;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ddj_0 ddj_02 = (ddj_0)object;
        return Objects.equals(this.ogx, ddj_02.ogx);
    }
}

