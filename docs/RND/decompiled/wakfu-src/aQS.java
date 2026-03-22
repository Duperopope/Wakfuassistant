/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aQS
extends aRY {
    public static final int eHP = 0;
    public static final int eHQ = 1;
    public static final int eHR = 2;
    private final int eHS;
    private final int eHT;
    private final long eHU;

    public aQS(int n) {
        this.eHS = n;
        this.eHT = -1;
        this.eHU = -1L;
    }

    public aQS(int n, int n2) {
        this.eHS = n;
        this.eHT = n2;
        this.eHU = -1L;
    }

    public aQS(int n, long l) {
        this.eHS = n;
        this.eHT = -1;
        this.eHU = l;
    }

    public aQS(int n, int n2, long l) {
        this.eHS = n;
        this.eHT = n2;
        this.eHU = l;
    }

    @Override
    public boolean isValid() {
        return this.eHS >= 0 && this.eHS <= 2;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Requires to be connected!");
            return;
        }
        try {
            switch (this.eHS) {
                case 2: {
                    aQS.jF("Available options are : LIST (targetAccountId) or DELETE (targetAccountId) {presetId}. \n If no target account is specified, yours will be used (current account id).");
                    break;
                }
                case 0: {
                    if (this.eHU == -1L) {
                        bgt_0 bgt_02 = aue_0.cVJ().cVK();
                        if (bgt_02 == null) {
                            aQS.jI("Unable to fetch local player. Cannot proceed with the command.");
                            return;
                        }
                        long l = bgt_02.Xi();
                        Optional optional = evx_2.feo().b(l, eva_1.owz);
                        if (optional.isEmpty()) {
                            aQS.jI("Unable to fetch preset account data for " + l);
                            return;
                        }
                        aQS.jF(ekj_0.e((ekr_0)optional.get()));
                        break;
                    }
                    ns_0 ns_02 = new ns_0();
                    ns_02.Q((short)146);
                    ns_02.cX(this.eHU);
                    ns_02.C((byte)3);
                    ayf_22.d(ns_02);
                }
                case 1: {
                    ns_0 ns_02 = new ns_0();
                    ns_02.Q((short)406);
                    ns_02.nX(this.eHT);
                    ns_02.cX(this.eHU);
                    ns_02.C((byte)3);
                    ayf_22.d(ns_02);
                    break;
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Command error " + String.valueOf(exception));
        }
    }
}

