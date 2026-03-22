/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxA
extends bCA {
    static final Logger jBq = Logger.getLogger(bxA.class);
    private fdj_0 jBr;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        return false;
    }

    @Override
    public rw_0 dNn() {
        return null;
    }

    @Override
    public rw_0[] dNf() {
        return rw_0.bly;
    }

    @Override
    public cpm_1[] dNh() {
        return cpm_1.nip;
    }

    @Override
    public byte bcN() {
        return 4;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bf(true);
        this.bi(true);
        this.ht(true);
        assert (this.jBr == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jBr = null;
    }

    @Override
    public String getName() {
        if (this.jBr != null) {
            return aum_0.cWf().a(78, (long)this.jBr.d(), new Object[0]);
        }
        return "#ERROR#";
    }

    @Override
    public int dND() {
        return 0;
    }

    @Override
    public void dNq() {
        int n;
        super.dNq();
        this.bmf = 1;
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jBq.error((Object)("[LD] Le panneau " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        try {
            n = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            jBq.error((Object)("[LD] Le panneau " + this.aXv + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui n'est pas du bon type (id attendu)"));
            return;
        }
        fdj_0 fdj_02 = (fdj_0)fda_0.rWI.a(fdv_0.rYX, n);
        if (fdj_02 == null) {
            jBq.error((Object)("[LD] Le panneau " + this.aXv + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jBr = fdj_02;
    }

    @Override
    public void c(ng_1 ng_12) {
        jBq.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public void dNE() {
        super.dNE();
        this.jJq = false;
    }

    static /* synthetic */ void a(bxA bxA2, ayv_2 ayv_22) {
        bxA2.a(ayv_22);
    }
}

