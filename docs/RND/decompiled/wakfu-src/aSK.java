/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class aSK
extends aRY {
    private static final Logger ePd = Logger.getLogger(aSK.class);
    private final String[] ePe;
    private final byte ePf;

    public aSK(byte by, String ... stringArray) {
        this.ePf = by;
        this.ePe = stringArray;
    }

    @Override
    public boolean isValid() {
        return this.ePe.length == 1;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.ePf) {
                case 0: {
                    this.aJ(ayf_22);
                    break;
                }
                case 1: {
                    this.aK(ayf_22);
                }
            }
        }
        catch (Exception exception) {
            ePd.error((Object)"Impossible d'executer la commande, Exception : ", (Throwable)exception);
        }
    }

    private void aJ(ayf_2 ayf_22) {
        int n = Integer.parseInt(this.ePe[0]);
        cje_0 cje_02 = new cje_0();
        cje_02.lT(n);
        ayf_22.d(cje_02);
    }

    private void aK(ayf_2 ayf_22) {
        int n = Integer.parseInt(this.ePe[0]);
        ns_0 ns_02 = new ns_0();
        ns_02.Q((short)362);
        ns_02.C((byte)3);
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }
}

