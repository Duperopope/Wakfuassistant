/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bxk
 */
public class bxk_0
extends bCA {
    static final Logger jAY = Logger.getLogger(bxk_0.class);
    private static final Pattern jAZ = Pattern.compile(";");
    private int jBa;
    private boolean jBb;

    bxk_0() {
        this.beC();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.setVisible(true);
        this.jBa = 0;
        this.jBb = false;
        this.ac((short)0);
        this.bf(false);
        this.bi(false);
        this.hu(false);
    }

    @Override
    public void c(ng_1 ng_12) {
        jAY.debug((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    public rw_0[] dNf() {
        return rw_0.bly;
    }

    @Override
    public byte bcN() {
        return 0;
    }

    public int dNt() {
        return this.jBa;
    }

    public void dNu() {
        if (!(this.aXZ && this.jBb && this.isVisible())) {
            return;
        }
        int n = this.bcC();
        int n2 = this.bcD();
        short s = this.bcE();
        int n3 = aie_0.cfn().bmC().n(n, n2, s);
        cAY.eHc().a(this.aXv, cBj.LA(this.jBa), new aha_2(n, n2, s, false, n3));
    }

    @Override
    public void aVR() {
        super.aVR();
        this.dNu();
    }

    @Override
    public void aVS() {
        this.dNv();
        super.aVS();
    }

    private void dNv() {
        if (this.jBb) {
            cAY.eHc().nT(this.aXv);
        }
    }

    @Override
    public void setVisible(boolean bl) {
        boolean bl2 = this.isVisible();
        super.setVisible(bl);
        if (bl2 == bl) {
            return;
        }
        if (bl) {
            this.dNu();
        } else {
            this.dNv();
        }
    }

    @Override
    public void dNq() {
        int n;
        super.dNq();
        String[] stringArray = jAZ.split(this.baB);
        if (stringArray.length != 1) {
            jAY.error((Object)("[LD] L'audioMarker " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        try {
            n = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            jAY.error((Object)("[LD] L'audioMarker " + this.aXv + " a un parametre [" + stringArray[0] + "] qui n'est pas du bon type (id attendu)"));
            return;
        }
        fdh fdh2 = (fdh)fda_0.rWI.a(fdv_0.rZe, n);
        if (fdh2 == null) {
            jAY.error((Object)("[LD] L'audioMarker " + this.aXv + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jBa = fdh2.cku();
        this.jBb = fdh2.ckv();
    }

    @Override
    public boolean a(rw_0 rw_02, RG rG) {
        return false;
    }

    static /* synthetic */ void a(bxk_0 bxk_02, ayv_2 ayv_22) {
        bxk_02.a(ayv_22);
    }
}

