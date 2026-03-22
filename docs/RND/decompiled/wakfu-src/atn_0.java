/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTn
 */
public class atn_0
extends aRY {
    public static final byte eQZ = 0;
    public static final byte eRa = 1;
    public static final byte eRb = 2;
    public static final byte eRc = 3;
    public static final byte eRd = 4;
    public static final byte eRe = 5;
    private final byte eRf;
    private final String[] eRg;

    public atn_0(byte by, String ... stringArray) {
        this.eRf = by;
        this.eRg = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eRf) {
            case 0: {
                return this.eRg.length == 1 || this.eRg.length == 2;
            }
            case 1: {
                return this.eRg.length == 1;
            }
            case 2: {
                return this.eRg.length == 2;
            }
            case 3: {
                return this.eRg.length == 1;
            }
            case 4: {
                return true;
            }
            case 5: {
                return true;
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
            switch (this.eRf) {
                case 0: {
                    this.aN(ayf_22);
                    break;
                }
                case 1: {
                    this.remove();
                    break;
                }
                case 2: {
                    this.aO(ayf_22);
                    break;
                }
                case 3: {
                    this.aP(ayf_22);
                    break;
                }
                case 4: {
                    atn_0.cCS();
                    break;
                }
                case 5: {
                    atn_0.cBS();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de calendrier " + String.valueOf(exception));
        }
    }

    private static void cBS() {
        aqh_0.cBI().jF("Commands to modify the symbiot, work always on your main symbiot not on downscaled ones");
        aqh_0.cBI().jF("-add breedId : add mosnter in symbiot");
        aqh_0.cBI().jF("-add breedId qty : same with qty");
        aqh_0.cBI().jF("-rm index : remove monster at index");
        aqh_0.cBI().jF("-rename index name : rename monster at index");
        aqh_0.cBI().jF("-index index : change selected index");
        aqh_0.cBI().jF("-i : show complete info about symbiot");
        aqh_0.cBI().jF("h | help : show full command documentation");
    }

    private static void cCS() {
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        blx_1 blx_12 = bgt_02.dmN();
        if (blx_12 != null) {
            byte by;
            aqh_0.cBI().n("Index courant : " + blx_12.fmR() + "\n", 0xAA00FF);
            for (by = 0; by < blx_12.fmQ(); by = (byte)(by + 1)) {
                ezw ezw2 = blx_12.Pm(by);
                aqh_0.cBI().n(String.valueOf(ezw2) + "\n", 0xAA00FF);
            }
            aqh_0.cBI().n("Creatures disponibles : ", 0xAA00FF);
            for (by = 0; by < blx_12.fmQ(); by = (byte)(by + 1)) {
                boolean bl = blx_12.Pn(by);
                if (!bl) continue;
                aqh_0.cBI().n(Byte.toString(by), 0xAA00FF);
            }
        } else {
            aqh_0.cBI().jF("pas de symbiote");
        }
    }

    private void aN(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)465);
        ns_02.D(this.eRf);
        ns_02.nX(Integer.parseInt(this.eRg[0]));
        if (this.eRg.length == 2) {
            ns_02.nX(Integer.parseInt(this.eRg[1]));
        } else {
            ns_02.nX(1);
        }
        ayf_22.d(ns_02);
    }

    private void remove() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && bgt_02.dmN() != null) {
            bgt_02.dmN().eH(Byte.parseByte(this.eRg[0]));
        }
    }

    private void aO(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        String string = this.eRg[1];
        byte by = Byte.parseByte(this.eRg[0]);
        if (bgt_02.dmN() == null) {
            aqh_0.cBI().jI("Pas de symbiote");
            return;
        }
        ezw ezw2 = bgt_02.dmN().Pm(by);
        if (ezw2 == null) {
            aqh_0.cBI().jI("Pas de creature dispo a l'index fourni");
            return;
        }
        if (!VV.bkY().dB(string)) {
            aqh_0.cBI().jI(" Nom invalide");
            return;
        }
        ezw2.setName(string);
        ciU ciU2 = new ciU();
        ciU2.db(bgt_02.Sn());
        ciU2.dg(by);
        ciU2.ou(string);
        ciU2.jh(true);
        ayf_22.d(ciU2);
    }

    private void aP(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dmN() == null) {
            aqh_0.cBI().jI("Pas de symbiote");
            return;
        }
        byte by = Byte.parseByte(this.eRg[0]);
        bgt_02.dmN().eG(by);
        aqh_0.cBI().jF("Nouvel index courant : " + by);
        bgt_02.dlH();
        ciV ciV2 = new ciV();
        ciV2.df(by);
        ayf_22.d(ciV2);
    }
}

