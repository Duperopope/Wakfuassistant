/*
 * Decompiled with CFR 0.152.
 */
public final class aRC
extends aRY {
    public static final int eKU = 4;
    public static final int eKV = 5;
    public static final int eKW = 6;
    public static final int eKX = 7;
    public static final int eKY = 10;
    public static final int eKZ = 11;
    public static final int eLa = 12;
    public static final int eLb = 13;
    public static final int eLc = 14;
    public static final int eLd = 0x8080FF;
    private final int eLe;
    private final String[] eLf;

    public aRC(int n, String ... stringArray) {
        this.eLe = n;
        this.eLf = (String[])stringArray.clone();
    }

    private static void cBS() {
        aRC.jF("hw building create x y buildingRefId : create a building from given refId at given position");
        aRC.jF("hw building delete buildingUID : delete the given building");
        aRC.jF("hw topology create x y : create a topology at given position");
        aRC.jF("hw topology update x y refId: change the topology at given position to topology with given ref id");
        aRC.jF("hw (addResources|ar) guildId resourcesAmount : add resource points");
        aRC.jF("hw (setAdminBuildingFactor|sabf) guildId factor : change % of building speed (-100 to 100)");
        aRC.jF("hw (closeOne | co) instanceId : close haven world with instanceId");
        aRC.jF("hw (closeAll | ca) : close all haven worlds");
        aRC.jF("hw (help|h) : show full documentation");
    }

    @Override
    public boolean isValid() {
        switch (this.eLe) {
            case 10: 
            case 14: {
                return this.eLf.length == 0;
            }
            case 7: 
            case 13: {
                return this.eLf.length == 1;
            }
            case 4: 
            case 11: {
                return this.eLf.length == 2;
            }
            case 5: 
            case 6: {
                return this.eLf.length == 3;
            }
            case 12: {
                return this.eLf.length == 2;
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
            switch (this.eLe) {
                case 4: {
                    this.ag(ayf_22);
                    break;
                }
                case 5: {
                    this.ah(ayf_22);
                    break;
                }
                case 6: {
                    this.ai(ayf_22);
                    break;
                }
                case 7: {
                    this.aj(ayf_22);
                    break;
                }
                case 11: {
                    this.af(ayf_22);
                    break;
                }
                case 12: {
                    this.ae(ayf_22);
                    break;
                }
                case 13: {
                    this.ak(ayf_22);
                    break;
                }
                case 14: {
                    this.al(ayf_22);
                    break;
                }
                case 10: {
                    aRC.cBS();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me d'une commande" + String.valueOf(exception));
        }
    }

    private void ae(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)452);
        ns_02.cX(Long.parseLong(this.eLf[0]));
        ns_02.nX(Integer.parseInt(this.eLf[1]));
        ayf_22.d(ns_02);
    }

    private void af(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)297);
        ns_02.cX(Long.parseLong(this.eLf[0]));
        ns_02.nX(Integer.parseInt(this.eLf[1]));
        ayf_22.d(ns_02);
    }

    private void ag(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 25) {
            aqh_0.cBI().jI("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            short s = Short.valueOf(this.eLf[0]);
            short s2 = Short.valueOf(this.eLf[1]);
            fbr fbr2 = new fbr(s, s2);
            ((bkv_1)bkb_02).dsz().a(fbr2);
            aqh_0.cBI().n("Action enregistr\u00e9e : " + String.valueOf(fbr2), 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aqh_0.cBI().jI("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void ah(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 25) {
            aqh_0.cBI().jI("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            short s = Short.valueOf(this.eLf[0]);
            short s2 = Short.valueOf(this.eLf[1]);
            short s3 = Short.valueOf(this.eLf[2]);
            fbs fbs2 = new fbs(s, s2, s3, 0);
            ((bkv_1)bkb_02).dsz().a(fbs2);
            aqh_0.cBI().n("Action enregistr\u00e9e : " + String.valueOf(fbs2), 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aqh_0.cBI().jI("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void ai(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 25) {
            aqh_0.cBI().jI("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            short s = Short.valueOf(this.eLf[0]);
            short s2 = Short.valueOf(this.eLf[1]);
            short s3 = Short.valueOf(this.eLf[2]);
            faU faU2 = new faU(s3, s, s2);
            ((bkv_1)bkb_02).dsz().a(faU2);
            aqh_0.cBI().n("Action enregistr\u00e9e : " + String.valueOf(faU2), 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aqh_0.cBI().jI("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void aj(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 25) {
            aqh_0.cBI().jI("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            long l = Long.valueOf(this.eLf[0]);
            faV faV2 = new faV(l);
            ((bkv_1)bkb_02).dsz().a(faV2);
            aqh_0.cBI().n("Action enregistr\u00e9e : " + String.valueOf(faV2), 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aqh_0.cBI().jI("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void ak(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)178);
        ns_02.cX(Long.parseLong(this.eLf[0]));
        ayf_22.d(ns_02);
    }

    private void al(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)319);
        ayf_22.d(ns_02);
    }
}

