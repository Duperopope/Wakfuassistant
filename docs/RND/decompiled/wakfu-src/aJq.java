/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;

public class aJq {
    private static final Logger eaF = Logger.getLogger(aJq.class);
    private final ZC eaG;
    private final String eaH;
    private final String eaI;
    private Anm eaJ;
    private Anm eaK;

    private aJq(ZC zC, String string, String string2) {
        this.eaG = zC;
        this.eaH = string;
        this.eaI = string2;
    }

    public void chD() {
        this.eaG.a(arx_1.cTu, null);
        this.eaG.a(arx_1.cTv, null);
        if (this.eaJ != null) {
            this.eaG.bqd().c(this.eaJ);
            this.eaJ = null;
        }
        if (this.eaK != null) {
            this.eaG.bqd().c(this.eaK);
            this.eaK = null;
        }
    }

    public void a(axb_2 axb_22, axb_2 axb_23, short s, short s2) {
        Anm anm;
        this.eaG.a(arx_1.cTu, axb_22.bQj());
        this.eaG.a(arx_1.cTv, axb_23.bQj());
        boolean bl = false;
        Anm anm2 = this.a(this.eaH, s, this.eaJ);
        if (anm2 != null) {
            bl = true;
            this.eaJ = anm2;
        }
        if ((anm = this.a(this.eaI, s2, this.eaK)) != null) {
            bl = true;
            this.eaK = anm;
        }
        if (bl) {
            this.eaG.bpy();
        }
    }

    private Anm a(String string, int n, Anm anm) {
        if (string == null) {
            return null;
        }
        String string2 = string + n;
        try {
            String string3 = auc_0.cVq().bS("ANMEquipmentPath");
            String string4 = String.format(string3, string2);
            if (anm != null && anm.aLM().equals(string2)) {
                return null;
            }
            Anm anm2 = ZC.dR(string4);
            if (anm2 == null) {
                eaF.error((Object)("Pas de blason trouv\u00e9 ID=" + string2));
                return null;
            }
            this.eaG.bqd().b(anm2);
            this.eaG.bpy();
            return anm2;
        }
        catch (fu_0 fu_02) {
            eaF.error((Object)"", (Throwable)fu_02);
            return null;
        }
    }

    public static aJq a(ZC zC, bjn_1 bjn_12, String string, String string2) {
        return aJq.a(zC, bjn_12.Yc(), string, string2);
    }

    public static aJq a(ZC zC, long l, String string, String string2) {
        if (l == 0L) {
            return null;
        }
        try {
            ezb ezb2 = new ezb(l);
            axb_2 axb_22 = buH.dJn().Fz(ezb2.fme());
            axb_2 axb_23 = buH.dJn().Fz(ezb2.fmg());
            aJq aJq2 = new aJq(zC, string, string2);
            aJq2.a(axb_22, axb_23, ezb2.fmf(), ezb2.fmd());
            return aJq2;
        }
        catch (Exception exception) {
            eaF.error((Object)"", (Throwable)exception);
            return null;
        }
    }
}

