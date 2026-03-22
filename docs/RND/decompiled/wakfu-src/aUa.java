/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aUa
implements aeh_2 {
    private static final aUa gwm = new aUa();
    public static final String gwn = "linkages";
    public static final String gwo = "selectedLinkage";
    public static final String gwp = "type";
    final ArrayList<String> gwq = new ArrayList();
    private String gwr;
    private String aCR = "players";

    private aUa() {
    }

    public static aUa cUg() {
        return gwm;
    }

    public void cUh() {
        this.gwq.clear();
        ArrayList arrayList = new ArrayList();
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        bdj_22.d(new aUb(this, bdj_22, arrayList));
    }

    public void jY(String string) {
        this.aCR = string;
        fse_1.gFu().a((aef_2)this, gwp);
    }

    public void jZ(String string) {
        this.Z(this.aCR, string);
    }

    public void Z(String string, String string2) {
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        try {
            String string3 = bxr_2.aj(string, string2);
            bdj_22.k(string3, true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.cUh();
        if (this.gwq.size() > 0) {
            this.ka(this.gwq.get(0));
        }
    }

    public void ka(String string) {
        this.gwr = string;
        fse_1.gFu().a((aef_2)this, gwo);
        aue_0.cVJ().cVK().ddI().dT(string);
        this.ccA();
    }

    public void ccA() {
        if (this.gwr == null) {
            return;
        }
        aue_0.cVJ().cVK().ddI().dT(this.gwr);
        if (!aue_0.cVJ().c(cys_2.eXV())) {
            return;
        }
        dae_0 dae_02 = new dae_0(19795);
        dae_02.fa(this.gwr);
        aaw_1.bUq().h(dae_02);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(gwn)) {
            return this.gwq;
        }
        if (string.equals(gwo)) {
            return this.gwr;
        }
        if (string.equals(gwp)) {
            return this.aCR;
        }
        return null;
    }
}

