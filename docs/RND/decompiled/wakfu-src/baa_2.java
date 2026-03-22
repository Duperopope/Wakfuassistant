/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAA
 */
public class baa_2
extends bCA {
    static final Logger jFg = Logger.getLogger(baa_2.class);
    private fdw_0 jFh;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public rw_0[] dNf() {
        return rw_0.bly;
    }

    @Override
    public cpm_1[] dNh() {
        return super.dNh();
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
        this.ht(true);
        assert (this.jFh == null);
    }

    @Override
    public boolean beq() {
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jFh = null;
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
            jFg.error((Object)("[LD] La borne de krosmoz " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        try {
            n = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            jFg.error((Object)("[LD] La borne de krosmoz " + this.aXv + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui n'est pas du bon type (id attendu)"));
            return;
        }
        fdw_0 fdw_02 = (fdw_0)fda_0.rWI.a(fdv_0.rZr, n);
        if (fdw_02 == null) {
            jFg.error((Object)("[LD] La borne de krosmoz " + this.aXv + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jFh = fdw_02;
    }

    @Override
    public void c(ng_1 ng_12) {
        jFg.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public void dNE() {
        super.dNE();
        this.jJq = false;
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDi(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    @Override
    public boolean isUsable() {
        return true;
    }

    static /* synthetic */ void a(baa_2 baa_22, ayv_2 ayv_22) {
        baa_22.a(ayv_22);
    }
}

