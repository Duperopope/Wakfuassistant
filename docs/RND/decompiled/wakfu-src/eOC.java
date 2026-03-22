/*
 * Decompiled with CFR 0.152.
 */
public class eOC
extends ero_0 {
    public static final int rbB = 0;
    public static final int rbC = 1;
    public static final int rbD = 2;
    public static final int rbE = 3;
    public static final int rbF = 4;
    public static final int rbG = 5;
    public static final int rbH = 6;
    public static final int rbI = 7;
    public static final int rbJ = 8;
    public static final int rbK = 9;
    public static final int rbL = 10;
    public static final int rbM = 11;
    private static final aox_1 rbN = new enz_0(new eny_0("Direction/Type", new enx_0(" 0:cellule, 1-2-3-4:NW-NE-SE-SW, 5:rand, ,6:sameCaster, 7:invCaster, 8:turnCasterTowardTarget, 9:turnTargetTowardCaster10:perpendiculaire caster, 11:inverse target", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rbN;
    }

    public eOC fCO() {
        eOC eOC2 = new eOC();
        return eOC2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        abi_1 abi_12 = abi_1.wG(this.aQL);
        if (abi_12 == abi_1.dzt) {
            this.mk(true);
            return;
        }
        abi_1 abi_13 = this.bgF.bcB();
        this.bgF.a(abi_12);
        if (abi_13 == abi_12) {
            this.mk(true);
        }
    }

    @Override
    public void E(QD qD) {
        abi_1 abi_12;
        short s = this.fHf();
        this.aQL = this.bgC != null ? ((enk_0)this.bgC).a(0, s, ene_0.qPu) : 5;
        if (this.aQL == 5) {
            this.aQL = ve_0.ao(1, 4);
        }
        if (this.bgF == null) {
            this.aQL = abi_1.dzt.wp();
            return;
        }
        switch (this.aQL) {
            case 0: {
                acq_1 acq_12 = new acq_1(this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.bgG.getX(), this.bgG.getY(), this.bgG.bdi());
                abi_12 = acq_12.bXb();
                break;
            }
            case 2: {
                abi_12 = abi_1.dzq;
                break;
            }
            case 1: {
                abi_12 = abi_1.dzo;
                break;
            }
            case 3: {
                abi_12 = abi_1.dzk;
                break;
            }
            case 4: {
                abi_12 = abi_1.dzm;
                break;
            }
            case 6: {
                abi_12 = this.bgE.bcB();
                break;
            }
            case 7: {
                abi_12 = this.bgE.bcB().bVN();
                break;
            }
            case 8: {
                acq_1 acq_13 = new acq_1(this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE());
                abi_12 = acq_13.bXb();
                this.bgF = this.bgE;
                break;
            }
            case 9: {
                acq_1 acq_14 = new acq_1(this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE());
                abi_12 = acq_14.bXb();
                break;
            }
            case 10: {
                abi_1 abi_13 = this.bgE.bcB();
                abi_12 = abi_1.cB(abi_13.dzA, abi_13.dzz);
                break;
            }
            case 11: {
                abi_12 = this.bgF.bcB().bVN();
                break;
            }
            default: {
                abi_12 = abi_1.dzt;
            }
        }
        if (this.bgF == null || this.bgF.a(exe_1.rDZ)) {
            abi_12 = abi_1.dzt;
        }
        this.aQL = abi_12.wp();
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCO();
    }
}

