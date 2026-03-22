/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from cRk
 */
public class crk_1
extends cpm_1
implements adm_0 {
    private static final byte nlY = 0;
    private static final byte nlZ = 1;
    private static final byte nma = 2;
    private static final byte nmb = 3;
    private byte kIf;
    private boolean irR;

    @Override
    public cps_1 eLz() {
        return cps_1.niZ;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        this.eMA();
    }

    @Override
    public boolean isEnabled() {
        return this.irR && super.isEnabled();
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        bkb_0 bkb_02 = bhJ2.dps();
        if (bkb_02 == null || bkb_02.dsm() != 4) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02.Sn() == bhJ2.Sn() || !bgt_02.doP();
    }

    @Override
    public void aH(Object object) {
        bhJ bhJ2;
        super.aH(object);
        this.kIf = 0;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_0 bgt_03 = null;
        int n = 0;
        TLongHashSet tLongHashSet = fcL.rUh.sx(bgt_02.Xi());
        Object object2 = tLongHashSet.iterator();
        while (object2.hasNext()) {
            bhJ2 = (bgt_0)fcL.rUh.sw(object2.next());
            if (bhJ2 == null || (n = ((bgt_0)bhJ2).dno().UN(9247)) <= 0) continue;
            bgt_03 = bhJ2;
            break;
        }
        if (n < 1 || bgt_03 == null) {
            this.setEnabled(false);
            this.kIf = 1;
            return;
        }
        object2 = fgD.fXh().Vd(9247);
        if (bgt_03.dnG() < ((fhc_0)object2).cmL()) {
            this.setEnabled(false);
            this.kIf = (byte)2;
        }
        if (!(this.cqO instanceof bhJ)) {
            return;
        }
        bhJ2 = (bhJ)this.cqO;
        bkb_0 bkb_02 = bhJ2.dps();
        if (!(bkb_02 instanceof bkk_2)) {
            return;
        }
        this.irR = ((bkk_2)bkb_02).dsR();
        if (!this.irR) {
            this.kIf = (byte)3;
        }
    }

    private void eMA() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        bhJ bhJ2 = (bhJ)this.cqO;
        int n = bgt_02.aZw().A(bhJ2.aZw());
        if (n > 1) {
            bdj_22.b(this);
            if (!bgt_02.c(bhJ2.aZw(), true, false)) {
                bdj_22.c(this);
                bNG.egl();
                bNG.a(2, new Object[0]);
            }
            return;
        }
        abi_1 abi_12 = bdj_22.bqg().x(bhJ2.aZw());
        if (abi_12 != null) {
            bdj_22.a(abi_12);
        }
        ciP ciP2 = new ciP(bhJ2.Sn());
        aue_0.cVJ().etu().d(ciP2);
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.eMA();
    }

    @Override
    public String ely() {
        return "desc.mru.resurrect";
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(nik);
        ahv_22.c(aum_0.cWf().c(this.ely(), new Object[0]));
        ahv_22.cev();
        if (this.kIf != 0) {
            ahv_22.ceH().ceC().ih(awx_2.dnJ.bQk());
            Object r = fgD.fXh().Vd(9247);
            if (this.kIf == 1) {
                ahv_22.c(aum_0.cWf().c("action.error.resurrectionItemNotOwned", ((fhc_0)r).getName()));
            } else if (this.kIf == 2) {
                ahv_22.c(aum_0.cWf().c("collect.error.ItemNotUsable", new Object[0]));
            } else if (this.kIf == 3) {
                ahv_22.c(aum_0.cWf().c("error.pvp.diedByAgro", new Object[0]));
            }
        }
        return ahv_22.ceL();
    }

    @Override
    public cpm_1 eLD() {
        return new crk_1();
    }

    @Override
    protected int eLB() {
        return crc_2.nmY.nnW;
    }
}

