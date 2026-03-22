/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cYk
 */
public class cyk_1
implements adi_1 {
    private static final cyk_1 nXY = new cyk_1();
    String nXZ;
    private alx_2 ikv;

    public static cyk_1 eXO() {
        return nXY;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18231: {
                dcC dcC2 = (dcC)aam_22;
                if (dcC2.fca() == 3) {
                    this.a(dcC2.eeW(), dcC2.bCt(), false);
                } else {
                    bmx_0 bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", dcC2.bCt());
                    fse_1.gFu().b("editableDescribedSpell", dcC2.eeW(), dcC2.bCt());
                    if (bmx_02 != null) {
                        bgy bgy2 = aue_0.cVJ().cVM();
                        ArrayList arrayList = bgy2.dkB().pd(((bmt_0)bmx_02.giP()).d());
                        if (arrayList.size() != 1) {
                            fse_1.gFu().a((aef_2)bmx_02.giP(), "id");
                            return false;
                        }
                        fse_1.gFu().a((aef_2)((bmx_0)arrayList.get(0)).giP(), "id");
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void a(bmx_0 bmx_02, String string, boolean bl) {
        String string2 = "spellDescriptionDialog" + bmx_02.avr();
        if (!fyw_0.gqw().to(string2)) {
            fyw_0.gqw().a(string2, ccj_2.pe("spellDescriptionDialog"), this.nXZ == null ? string : this.nXZ, string, "spellDescriptionDialog");
            if (bl) {
                fyw_0.gqw().a(new cym_1(string, string2));
            }
            this.nXZ = string2;
            fse_1.gFu().b("describedSpell", bmx_02, string2);
            fse_1.gFu().b("describedSpellRealLevel", bmx_02.cmL(), string2);
            fse_1.gFu().b("editableDescribedSpell", bmx_02.ic(false), string2);
        } else {
            fyw_0.gqw().tl(string2);
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cyl_2(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.spellDetails", cgz_2.class);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.spellDetails");
            cdv_0.euj().e(this);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

