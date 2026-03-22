/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxW
extends bCA
implements bDo {
    static final Logger jCb = Logger.getLogger(bxW.class);
    private bDp jCc;

    @Override
    protected fi_1 bey() {
        return this.jCc != null ? this.jCc.bex() : fi_1.oX;
    }

    public void aPg() {
        this.bev();
        this.aVQ();
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
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
    public short chU() {
        return 60;
    }

    @Override
    public String getName() {
        eIz eIz2 = this.dNV();
        return eIz2 == null ? "" : eIz2.getName();
    }

    @Override
    public void dNq() {
        String[] stringArray = this.baB.split(";");
        int n = stringArray.length;
        if (n != 2) {
            jCb.error((Object)("[LevelDesign] La CharacterStatue " + this.aXv + " n'a pas le bon nombre de param\u00e8tres"));
            return;
        }
        String string = stringArray[0];
        this.jCc = new bDt(this, string);
        super.dNq();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jCc = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        this.bf(true);
        this.bi(true);
        this.jHu = true;
        this.jHv = false;
        assert (this.jCc == null);
    }

    @Override
    public bDp dNU() {
        return this.jCc;
    }

    @Override
    public eIz dNV() {
        return this.jCc.dNV();
    }

    static /* synthetic */ void a(bxW bxW2, ayv_2 ayv_22) {
        bxW2.a(ayv_22);
    }
}

