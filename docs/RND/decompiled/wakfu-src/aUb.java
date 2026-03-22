/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

class aUb
implements Runnable {
    final /* synthetic */ bdj_2 gws;
    final /* synthetic */ ArrayList gwt;
    final /* synthetic */ aUa gwu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aUb(aUa aUa2, bdj_2 bdj_22, ArrayList arrayList) {
        this.gwu = aUa2;
        this.gws = bdj_22;
        this.gwt = arrayList;
    }

    @Override
    public void run() {
        this.gws.bqd().o(this.gwt);
        int n = this.gwt.size();
        for (int i = 0; i < n; ++i) {
            String string = (String)this.gwt.get(i);
            int n2 = -1;
            String string2 = string.substring(2, string.length());
            if (this.gwu.gwq.contains(string2)) continue;
            this.gwu.gwq.add(string2);
        }
        Collections.sort(this.gwu.gwq);
        fse_1.gFu().a((aef_2)this.gwu, "linkages");
        this.gws.bqd().btE();
        if (this.gwu.gwq.size() > 0) {
            this.gwu.ka(this.gwu.gwq.get(0));
        }
    }
}

