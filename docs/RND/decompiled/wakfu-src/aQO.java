/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class aQO
extends aRY {
    private static final Logger eHi = Logger.getLogger(aQO.class);
    public static final int eHj = 1;
    public static final int eHk = 2;
    private final int eHl;
    private final String[] eHm;

    public aQO(int n, String ... stringArray) {
        this.eHl = n;
        this.eHm = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eHl) {
            case 1: 
            case 2: {
                return this.eHm.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.eHl) {
                case 1: {
                    this.cCb();
                    break;
                }
                case 2: {
                    this.cCa();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de calendrier " + String.valueOf(exception));
        }
    }

    private void cCa() {
        bqq_0 bqq_02 = bqy_1.dx(bqy_1.jbO.d(), 0);
        ArrayList<amx_1> arrayList = new ArrayList<amx_1>();
        arrayList.add(new amb_2(Integer.parseInt(this.eHm[0])));
        arrayList.add(new amz_2(false));
        bqq_02.E(arrayList);
        bqq_02.bGy();
    }

    private void cCb() {
        bqq_0 bqq_02 = bqy_1.dx(bqy_1.jbO.d(), 0);
        ArrayList<amx_1> arrayList = new ArrayList<amx_1>();
        arrayList.add(new amb_2(Integer.parseInt(this.eHm[0])));
        arrayList.add(new amz_2(true));
        bqq_02.E(arrayList);
        bqq_02.bGy();
    }
}

