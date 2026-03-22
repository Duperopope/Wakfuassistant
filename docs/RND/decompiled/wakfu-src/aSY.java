/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aSY
extends aRY {
    public static final int ePV = 0;
    public static final int ePW = 1;
    public static final int ePX = 2;
    public static final int ePY = 3;
    public static final int ePZ = 4;
    public static final int eQa = 5;
    public static final int eQb = 6;
    public static final int eQc = 7;
    public static final int eQd = 8;
    public static final int eQe = 9;
    private final float eQf;
    private final int eQg;
    private List<Integer> ePj;
    private String ePk;
    private String ePl;

    public aSY() {
        this(3);
    }

    public aSY(int n) {
        this(n, -1.0f);
    }

    public aSY(int n, float f2) {
        this.eQf = f2;
        this.eQg = n;
    }

    public aSY(int n, float f2, List<Integer> list) {
        this(n, f2);
        this.ePj = list;
    }

    public aSY(int n, float f2, List<Integer> list, String string, String string2) {
        this(n, f2, list);
        this.ePk = string;
        this.ePl = string2;
    }

    @Override
    public boolean isValid() {
        switch (this.eQg) {
            case 0: 
            case 1: 
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return this.eQf == -1.0f || this.eQf == 0.0f || this.ePk != null && this.ePl != null;
            }
            case 3: 
            case 4: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        Object object;
        short s;
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.eQf < 0.0f && this.eQf != -1.0f) {
            aqh_0.cBI().jI("Il faut que le facteur d'xp soit >= 0, re\u00e7u=" + this.eQf);
            return;
        }
        switch (this.eQg) {
            case 1: {
                s = 119;
                break;
            }
            case 0: {
                s = 469;
                break;
            }
            case 2: {
                s = 320;
                break;
            }
            case 3: {
                s = 366;
                break;
            }
            case 5: {
                s = 172;
                break;
            }
            case 6: {
                s = 193;
                break;
            }
            case 7: {
                s = 217;
                break;
            }
            case 8: {
                s = 48;
                break;
            }
            case 9: {
                s = 285;
                break;
            }
            case 4: {
                String string = "setBonusFactor|sbf help : show full documentation\nsetBonusFactor|sbf : show current bonuses and provided events\nsetBonusFactor|sbf fxp : show current xp bonus\nsetBonusFactor|sbf fxp instanceId : same for an instance\nsetBonusFactor|sbf fxp -1.0 : reset bonus xp for all the server\nsetBonusFactor|sbf fxp -1.0 instanceId : same for instance\nsetBonusFactor|sbf fxp value startDate endDate : apply value as xp bonus from startDate to endDate\nsetBonusFactor|sbf fxp value startDate endDate instanceId : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nreplace fxp by cxp : craft xp\nreplace fxp by k : money loot\nreplace fxp by loot : number of loots try\nreplace fxp by gblf : bonus learning factor for guilds\nreplace fxp by pp : prospection rate\nreplace fxp by pvp : pvp merit and glory orbs limit\nreplace fxp by rights : id of subscription right\n";
                aqh_0.cBI().jF("setBonusFactor|sbf help : show full documentation\nsetBonusFactor|sbf : show current bonuses and provided events\nsetBonusFactor|sbf fxp : show current xp bonus\nsetBonusFactor|sbf fxp instanceId : same for an instance\nsetBonusFactor|sbf fxp -1.0 : reset bonus xp for all the server\nsetBonusFactor|sbf fxp -1.0 instanceId : same for instance\nsetBonusFactor|sbf fxp value startDate endDate : apply value as xp bonus from startDate to endDate\nsetBonusFactor|sbf fxp value startDate endDate instanceId : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nreplace fxp by cxp : craft xp\nreplace fxp by k : money loot\nreplace fxp by loot : number of loots try\nreplace fxp by gblf : bonus learning factor for guilds\nreplace fxp by pp : prospection rate\nreplace fxp by pvp : pvp merit and glory orbs limit\nreplace fxp by rights : id of subscription right\n");
                return;
            }
            default: {
                return;
            }
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q(s);
        ns_02.br(this.eQf);
        if (this.ePk != null) {
            object = arz_0.jT(this.ePk);
            ns_02.cX(((uw_0)object).bjB());
            if (object == null) {
                aqh_0.cBI().jI("Erreur de syntaxe dans la date de d\u00e9part - taper setBonusFactor help pour voir la syntaxe");
                return;
            }
        }
        if (this.ePl != null) {
            object = arz_0.jT(this.ePl);
            ns_02.cX(((uw_0)object).bjB());
            if (object == null) {
                aqh_0.cBI().jI("Erreur de syntaxe dans la date de fin - taper setBonusFactor help pour voir la syntaxe");
                return;
            }
        }
        if (this.ePj != null) {
            for (Integer n : this.ePj) {
                ns_02.nX(n);
            }
        }
        ayf_22.d(ns_02);
    }

    public static String cCL() {
        return null;
    }
}

