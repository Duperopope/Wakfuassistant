/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class aQK
extends aRY {
    public static final byte eGP = 1;
    public static final byte eGQ = 2;
    private final byte eGR;
    private final String[] eGS;

    public aQK(byte by, String ... stringArray) {
        this.eGR = by;
        this.eGS = new String[stringArray.length];
        System.arraycopy(stringArray, 0, this.eGS, 0, stringArray.length);
    }

    @Override
    public boolean isValid() {
        switch (this.eGR) {
            case 1: {
                return this.eGS.length == 1 || this.eGS.length == 2;
            }
            case 2: {
                return this.eGS.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        switch (this.eGR) {
            case 1: {
                this.start();
                return;
            }
            case 2: {
                this.bhk();
                return;
            }
        }
        aqh_0.cBI().jI("Commande " + this.eGR + " invalide!");
    }

    private void start() {
        int n = Integer.parseInt(this.eGS[0]);
        int n2 = this.eGS.length >= 2 ? Integer.parseInt(this.eGS[1]) : -1;
        ns_0 ns_02 = new ns_0();
        ns_02.Q((short)274);
        ns_02.C((byte)3);
        ns_02.nX(n);
        ns_02.nX(n2);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ayf_22.d(ns_02);
    }

    private void bhk() {
        int n = Integer.parseInt(this.eGS[0]);
        ns_0 ns_02 = new ns_0();
        ns_02.Q((short)343);
        ns_02.C((byte)3);
        ns_02.nX(n);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ayf_22.d(ns_02);
    }

    public String toString() {
        return "ChaosCommand{m_cmd=" + this.eGR + ", m_args=" + String.valueOf(this.eGS == null ? null : Arrays.asList(this.eGS)) + "}";
    }
}

