/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cQL
 */
public final class cql_2
extends cqf_1 {
    private final ArrayList<String> nlB = new ArrayList();
    private String niv;
    private boolean niw;

    public cql_2 eMq() {
        return new cql_2();
    }

    @Override
    public boolean isEnabled() {
        if (!this.niw) {
            return false;
        }
        return super.isEnabled();
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        ahv_2 ahv_22 = new ahv_2().c(string);
        if (this.nlB.size() > 0) {
            for (String string2 : this.nlB) {
                ahv_22.ceH().ceC().ih(nim);
                ahv_22.c(string2).ceD();
            }
        }
        if (this.niv != null && this.niv.length() > 0) {
            ahv_22.ceH().c(this.niv);
        }
        return ahv_22.ceL();
    }

    public void qc(String string) {
        this.nlB.add(string);
    }

    public void pY(String string) {
        this.niv = string;
    }

    public void jU(boolean bl) {
        this.niw = bl;
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMq();
    }
}

