/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bzm
 */
public class bzm_0
extends bCA {
    static final Logger jDF = Logger.getLogger(bzm_0.class);
    public static final short jDG = 0;
    public static final short jDH = 1;
    public static final short jDI = 2;
    private bzn jDJ;
    private boolean jDK;
    private boolean jDL;

    @Override
    public void aVI() {
        super.aVI();
        this.jJo = true;
        this.ac((short)1);
        this.bU((short)1);
        this.bf(true);
        this.bi(true);
        this.jDJ = bzn.jDM;
        this.jDK = false;
        this.jDL = false;
    }

    @Override
    public cpm_1[] dNh() {
        int n;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.jDJ.a(this, bgt_02)) {
            return cpm_1.nip;
        }
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        String string = switch (this.bmf) {
            case 0 -> {
                n = crc_2.nmC.nnW;
                yield "close";
            }
            case 1, 2 -> {
                n = crc_2.nnz.nnW;
                yield "containerOpen";
            }
            default -> {
                n = crc_2.nnz.nnW;
                yield "containerOpen";
            }
        };
        cqf_12.CV(n);
        cqf_12.qb("desc.mru." + string);
        return new cpm_1[]{cqf_12};
    }

    @Override
    public short chU() {
        return 60;
    }

    @Override
    public void c(ng_1 ng_12) {
        jDF.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jDF.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        if (!this.isUsable()) {
            return false;
        }
        if (!this.jDJ.a(this, rG)) {
            return false;
        }
        this.b(rw_02);
        this.c(rw_02);
        return true;
    }

    @Override
    public void setUsable(boolean bl) {
        super.setUsable(bl);
        this.setSelectable(bl);
    }

    @Override
    public boolean dNL() {
        return true;
    }

    @Override
    public void dNq() {
        super.dNq();
        String[] stringArray = this.baB.split(";");
        if (stringArray.length < 0 || stringArray.length > 3) {
            jDF.error((Object)("[LD] La porte " + this.aXv + " doit avoir 0, 1, 2 ou 3 param\u00e8tre(s)"));
            return;
        }
        if (stringArray.length == 0) {
            this.jDJ = bzn.jDM;
            this.jDK = false;
            this.jDL = false;
            return;
        }
        if (stringArray.length == 1) {
            try {
                this.jDJ = bzn.valueOf(stringArray[0].toUpperCase());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.jDJ = bzn.jDM;
            }
            this.jDK = false;
            this.jDL = false;
        }
        if (stringArray.length == 2) {
            this.jDJ = bzn.jDM;
            this.jDK = Boolean.parseBoolean(stringArray[0]);
            this.jDL = Boolean.parseBoolean(stringArray[1]);
        }
        if (stringArray.length == 3) {
            this.jDJ = bzn.valueOf(stringArray[0].toUpperCase());
            this.jDK = Boolean.parseBoolean(stringArray[1]);
            this.jDL = Boolean.parseBoolean(stringArray[2]);
        }
    }

    @Override
    public rw_0 dNn() {
        return this.bmf == 1 || this.bmf == 2 ? rw_0.bla : rw_0.blb;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bla, rw_0.blb, rw_0.blc, rw_0.bld};
    }

    @Override
    protected void dbu() {
        super.dbu();
        switch (this.bmf) {
            case 0: {
                this.bf(false);
                this.bi(false);
                this.hs(this.jDK);
                break;
            }
            case 1: 
            case 2: {
                this.bf(true);
                this.bi(true);
                this.hs(this.jDL);
            }
        }
    }

    private void hs(boolean bl) {
        for (ng_1 ng_12 : this.aVG()) {
            ng_12.aD(bl);
        }
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDa(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bzm_0 bzm_02, ayv_2 ayv_22) {
        bzm_02.a(ayv_22);
    }
}

