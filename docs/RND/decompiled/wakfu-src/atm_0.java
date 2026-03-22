/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumSet;
import org.apache.log4j.Logger;

/*
 * Renamed from aTm
 */
public class atm_0
extends aRY {
    private static final Logger eQJ = Logger.getLogger(atm_0.class);
    public static final byte eQK = 0;
    public static final byte eQL = 1;
    public static final byte eQM = 2;
    public static final byte eQN = 3;
    public static final byte eQO = 4;
    public static final byte eQP = 5;
    public static final byte eQQ = 6;
    public static final byte eQR = 7;
    public static final byte eQS = 8;
    public static final byte eQT = 9;
    public static final byte eQU = 10;
    public static final byte eQV = 11;
    public static final byte eQW = 12;
    private final int eQX;
    private final String[] eQY;

    public atm_0(int n, String ... stringArray) {
        this.eQX = n;
        this.eQY = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eQX) {
            case 0: 
            case 1: 
            case 4: 
            case 7: 
            case 8: 
            case 12: {
                return this.eQY.length == 0;
            }
            case 2: 
            case 3: {
                return this.eQY.length == 0 || this.eQY.length == 1;
            }
            case 5: 
            case 6: 
            case 9: 
            case 10: 
            case 11: {
                return this.eQY.length == 1;
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
            switch (this.eQX) {
                case 0: {
                    atm_0.cBS();
                    return;
                }
                case 1: {
                    atm_0.cDP();
                    return;
                }
                case 2: {
                    this.cDO();
                    return;
                }
                case 3: {
                    this.cDN();
                    return;
                }
                case 4: {
                    atm_0.cDM();
                    return;
                }
                case 5: {
                    this.cDL();
                    return;
                }
                case 6: {
                    this.cDK();
                    return;
                }
                case 7: {
                    atm_0.cDJ();
                    return;
                }
                case 8: {
                    atm_0.cDI();
                    return;
                }
                case 9: {
                    this.cDH();
                    return;
                }
                case 10: {
                    this.cDG();
                    return;
                }
                case 11: {
                    this.cDF();
                    return;
                }
                case 12: {
                    atm_0.cDE();
                    return;
                }
            }
        }
        catch (Exception exception) {
            eQJ.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private static void cDE() {
        atm_0.jF("Demande de mise a jour des donn\u00e9es d'abonnement");
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ciq_0 ciq_02 = new ciq_0(evu_1.owU.aJr());
        ayf_22.d(ciq_02);
    }

    private void cDF() {
        int n = Integer.parseInt(this.eQY[0]);
        evt_1 evt_12 = evt_1.Oq(n);
        if (evt_12 == null) {
            atm_0.jF("Niveau de souscription inconnu");
            return;
        }
        atm_0.jF("Droits pour le niveau d'abonnement " + evt_12.name());
        EnumSet<evv_1> enumSet = evt_12.fex();
        for (evv_1 evv_12 : enumSet) {
            atm_0.jF(evv_12.toString());
        }
    }

    private void cDG() {
        int n = Integer.parseInt(this.eQY[0]);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        evv_1 evv_12 = evv_1.Or(n);
        if (evv_12 == null) {
            atm_0.jF("Droit inconnu");
            return;
        }
        bgt_02.dpL().c(evv_12);
        atm_0.jF("Ajout du droit " + String.valueOf((Object)evv_12) + " pour le client seulement");
    }

    private void cDH() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)256);
        ns_02.nX(Integer.parseInt(this.eQY[0]));
        ayf_22.d(ns_02);
    }

    private static void cDI() {
        evv_1[] evv_1Array = evv_1.values();
        for (int i = 0; i < evv_1Array.length; ++i) {
            evv_1 evv_12 = evv_1Array[i];
            atm_0.jF(evv_12.toString());
        }
    }

    private static void cDJ() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        atm_0.jF(bgt_02.dpL().toString());
    }

    private void cDK() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)173);
        ns_02.nX(Integer.parseInt(this.eQY[0]));
        ayf_22.d(ns_02);
    }

    private void cDL() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)49);
        ns_02.nX(Integer.parseInt(this.eQY[0]));
        ayf_22.d(ns_02);
    }

    private static void cDM() {
        evt_1[] evt_1Array = evt_1.values();
        for (int i = 0; i < evt_1Array.length; ++i) {
            evt_1 evt_12 = evt_1Array[i];
            atm_0.jF(evt_12.toString());
        }
    }

    private void cDN() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)438);
        if (this.eQY.length == 0) {
            ns_02.cX(aue_0.cVJ().cVK().Xi());
        } else {
            ns_02.cX(Long.parseLong(this.eQY[0]));
        }
        ayf_22.d(ns_02);
    }

    private void cDO() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)399);
        if (this.eQY.length == 0) {
            ns_02.cX(aue_0.cVJ().cVK().Xi());
        } else {
            ns_02.cX(Long.parseLong(this.eQY[0]));
        }
        ayf_22.d(ns_02);
    }

    private static void cDP() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)462);
        ns_02.cX(aue_0.cVJ().cVK().Xi());
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        atm_0.jF("(subscriber | sub) (help | h) :  show full documentation");
        atm_0.jF("(subscriber | sub) (serverStatus | ss) :  show account subscription type");
        atm_0.jF("(subscriber | sub) on :  enable default subscription for this account");
        atm_0.jF("(subscriber | sub) id on :  same for another account");
        atm_0.jF("(subscriber | sub) off :  disable subscription for current account and set EU_FREE");
        atm_0.jF("(subscriber | sub) id off :  same for another account");
        atm_0.jF("(subscriber | sub) (showLevels | sl) :  show subscription levels");
        atm_0.jF("(subscriber | sub) (showRights | sr) :  show subscription rights");
        atm_0.jF("(subscriber | sub) (showSubscriptionRightsSet | ssrs) levelID :  show rights for a specified subscription level");
        atm_0.jF("(subscriber | sub) (addRight | ar) rightId :  add subscription right for this session");
        atm_0.jF("(subscriber | sub) (addRightInClient | arc) rightId :  same but only for the client");
        atm_0.jF("(subscriber | sub) (removeRight | rr) rightId :  remove a right given for session");
        atm_0.jF("(subscriber | sub) (setSubscriptionLevel | ssl) typeId :  change current subscription type");
        atm_0.jF("(subscriber | sub) (showClientInfo | sci) :  show client info about subscription");
        atm_0.jF("(subscriber | sub) (refreshSubscription | rs) :  update subscription");
    }
}

