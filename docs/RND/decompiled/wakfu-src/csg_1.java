/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cSg
 */
public class csg_1
implements adi_1 {
    private static final csg_1 nFf = new csg_1();
    private alx_2 ikv;

    public static adi_1 eNT() {
        return nFf;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18809: {
                aue_0.cVJ().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (string.equals("adminCharacterEditorDialog") && !fyw_0.gqw().to("adminCharacterColorEditorDialog") || string.equals("adminCharacterColorEditorDialog") && !fyw_0.gqw().to("adminCharacterEditorDialog")) {
                aue_0.cVJ().b(csg_1.eNT());
            }
        };
        fyw_0.gqw().a(this.ikv);
        fse_1.gFu().f("spellsList", (Object)null);
        fse_1.gFu().f("craftSkillsList", (Object)null);
        csg_1.eNU();
        csg_1.eNV();
        ccj_2.pd("adminCharacterEditorDialog");
        fyw_0.gqw().d("wakfu.adminCharacterEditor", cdj_2.class);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fse_1.gFu().vX("spellsList");
        fse_1.gFu().vX("craftSkillsList");
        fyw_0.gqw().tl("adminCharacterEditorDialog");
        fyw_0.gqw().tl("adminCharacterColorEditorDialog");
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tc("wakfu.adminCharacterEditor");
    }

    public static void eNU() {
        ArrayList<bmx_0> arrayList = new ArrayList<bmx_0>();
        for (bmx_0 bmx_02 : aue_0.cVJ().cVK().dkB()) {
            arrayList.add(bmx_02);
        }
        fse_1.gFu().f("spellsList", arrayList);
    }

    public static void eNV() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eki_0 eki_02 = bgt_02.dpK();
        ArrayList arrayList = new ArrayList();
        eKQ.qEb.q(eKW2 -> {
            if (eKQ.qEb.QV(eKW2.d()).cmw()) {
                return;
            }
            if (eki_02.tX(eKW2.d())) {
                return;
            }
            arrayList.add(new bmf_2(eKW2.d(), bgt_02.Xi(), eki_02));
        });
        fse_1.gFu().f("craftSkillsList", arrayList);
    }

    public String toString() {
        return "UIAdminCharacterEditorFrame{m_dialogUnloadListener=" + String.valueOf(this.ikv) + "}";
    }
}

