/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class aQn
extends aRY {
    private static final Logger eCl = Logger.getLogger(aQn.class);
    public static final int eCm = 0;
    public static final int eCn = 1;
    public static final int eCo = 2;
    private final int eCp;
    private final String[] eCq;

    public aQn(int n, String ... stringArray) {
        this.eCp = n;
        this.eCq = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eCp) {
            case 0: {
                return this.eCq.length == 0;
            }
            case 1: 
            case 2: {
                return this.eCq.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.eCp) {
                case 0: {
                    this.cBS();
                    return;
                }
                case 1: {
                    this.cBR();
                    return;
                }
                case 2: {
                    this.cBQ();
                    return;
                }
            }
        }
        catch (Exception exception) {
            eCl.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void cBQ() {
        String string = this.eCq[0];
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)75);
        ns_02.cT(string);
        ayf_22.d(ns_02);
    }

    private void cBR() {
        String string = this.eCq[0];
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)370);
        ns_02.cT(string);
        ayf_22.d(ns_02);
    }

    private void cBS() {
        aQn.jF("ai (help | h) : show command help");
        aQn.jF("ai on serverId : permit the specified server to manage fights");
        aQn.jF("ai off serverId : disable the management of fights for this server");
    }
}

