/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cQv
 */
public final class cqv_1
extends cqf_1 {
    private final ArrayList<String> nlg = new ArrayList();
    private String niv;
    private boolean niw;
    private short nlh;
    private ArrayList<bCJ> atk;

    public cqv_1 eMg() {
        return new cqv_1();
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
        if (this.nlg.size() > 0) {
            for (String string2 : this.nlg) {
                ahv_22.ceH().ih(nim);
                ahv_22.c(string2);
            }
        }
        if (this.niv != null && this.niv.length() > 0) {
            ahv_22.ceH().c(this.niv);
        }
        return ahv_22.ceL();
    }

    public void U(ArrayList<bCJ> arrayList) {
        this.atk = arrayList;
    }

    public void cL(short s) {
        this.nlh = s;
    }

    public void pY(String string) {
        this.niv = string;
    }

    public void jU(boolean bl) {
        this.niw = bl;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        if (this.atk != null) {
            for (int i = 0; i < this.atk.size(); ++i) {
                bCJ bCJ2 = this.atk.get(i);
                bCJ2.bGy();
            }
        }
        super.run();
    }

    @Override
    protected rw_0 eLF() {
        return rw_0.Y(this.nlh);
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMg();
    }
}

