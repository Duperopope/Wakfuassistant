/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.debug.anim.AnmDebuggerCommand;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cDj
 */
@fyf_0
public class cdj_2 {
    protected static final Logger mSX = Logger.getLogger(cdj_2.class);
    public static final String PACKAGE = "wakfu.adminCharacterEditor";
    private static final ArrayList<cdl_2> mSY = new ArrayList();
    private static final ArrayList<cdl_2> mSZ = new ArrayList();

    public static void openCharacterColorEditor(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("adminCharacterEditorDialog")) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            mSY.clear();
            mSZ.clear();
            for (arx_1 arx_12 : arx_1.values()) {
                bjc_1 bjc_12 = new bjc_1(GC.aNJ(), GC.aNJ(), GC.aNJ());
                if (arx_12.bHJ() >= arx_1.cTB.bHJ()) {
                    mSY.add(new cdl_2(bjc_12, arx_12));
                    continue;
                }
                mSZ.add(new cdl_2(bjc_12, arx_12));
            }
            cdj_2.reloadAnmimation(null);
            fse_1.gFu().f("adminColors", mSY);
            fse_1.gFu().f("adminInactiveColors", mSZ);
            ccj_2.pd("adminCharacterColorEditorDialog");
            fyw_0.gqw().tl("adminCharacterEditorDialog");
        } else {
            ccj_2.pd("adminCharacterEditorDialog");
            fyw_0.gqw().tl("adminCharacterColorEditorDialog");
            fse_1.gFu().vX("adminAnimDirection");
            fse_1.gFu().vX("adminAnimName");
            fse_1.gFu().vX("adminColors");
            fse_1.gFu().vX("adminInactiveColors");
        }
    }

    public static void loadAnmDebugger(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("debugAnmDialog")) {
            fyw_0.gqw().tl("debugAnmDialog");
        } else {
            AnmDebuggerCommand.cUf();
        }
    }

    public static void reloadAnmimation(fiq_1 fiq_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        fse_1.gFu().a((aef_2)bgt_02, "actorDescriptorLibrary");
        fse_1.gFu().a((aef_2)bgt_02, "actorEquipment");
        fse_1.gFu().f("adminAnimDirection", bdj_22.bcB().dzy);
        fse_1.gFu().f("adminAnimName", bdj_22.bpT());
    }

    public static void deleteActiveColor(fiq_1 fiq_12, cdl_2 cdl_22) {
        mSY.remove(cdl_22);
        mSZ.add(cdl_22);
        fse_1.gFu().f("adminColors", (Object)null);
        fse_1.gFu().f("adminInactiveColors", (Object)null);
        fse_1.gFu().f("adminColors", mSY);
        fse_1.gFu().f("adminInactiveColors", mSZ);
    }

    public static void activateColor(fiq_1 fiq_12) {
        fas_1 fas_12 = (fas_1)((fhv_1)fiq_12.gBE()).getElementMap().uH("comboColor");
        cdl_2 cdl_22 = (cdl_2)fas_12.getSelectedValue();
        mSZ.remove(cdl_22);
        mSY.add(cdl_22);
        fse_1.gFu().f("adminColors", (Object)null);
        fse_1.gFu().f("adminInactiveColors", (Object)null);
        fse_1.gFu().f("adminColors", mSY);
        fse_1.gFu().f("adminInactiveColors", mSZ);
    }

    public static void setFilterRed(flw_2 flw_22, cdl_2 cdl_22) {
        if (cdl_22 != null) {
            cdl_22.i(flw_22.getValue());
            cdl_22.a((fax_1)((fhv_1)flw_22.gBD()).getElementMap().uH("localPlayerDisplay"));
        }
    }

    public static void setFilterGreen(flw_2 flw_22, cdl_2 cdl_22) {
        if (cdl_22 != null) {
            cdl_22.j(flw_22.getValue());
            cdl_22.a((fax_1)((fhv_1)flw_22.gBD()).getElementMap().uH("localPlayerDisplay"));
        }
    }

    public static void setFilterBlue(flw_2 flw_22, cdl_2 cdl_22) {
        if (cdl_22 != null) {
            cdl_22.k(flw_22.getValue());
            cdl_22.a((fax_1)((fhv_1)flw_22.gBD()).getElementMap().uH("localPlayerDisplay"));
        }
    }

    public static void setFilterRed(fiq_1 fiq_12, fdu_1 fdu_12, cdl_2 cdl_22) {
        if (fdu_12.getText().length() == 0) {
            return;
        }
        float f2 = (float)Bw.r(fdu_12.getText()) / 255.0f;
        cdl_22.i(f2);
        cdl_22.a((fax_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("localPlayerDisplay"));
    }

    public static void setFilterGreen(fiq_1 fiq_12, fdu_1 fdu_12, cdl_2 cdl_22) {
        if (fdu_12.getText().length() == 0) {
            return;
        }
        float f2 = (float)Bw.r(fdu_12.getText()) / 255.0f;
        cdl_22.j(f2);
        cdl_22.a((fax_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("localPlayerDisplay"));
    }

    public static void setFilterBlue(fiq_1 fiq_12, fdu_1 fdu_12, cdl_2 cdl_22) {
        if (fiq_12.gBy() != fzq_0.tJH) {
            return;
        }
        if (fdu_12.getText().length() == 0) {
            return;
        }
        float f2 = (float)Bw.r(fdu_12.getText()) / 255.0f;
        cdl_22.k(f2);
        cdl_22.a((fax_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("localPlayerDisplay"));
    }

    public static void applyColor(fiq_1 fiq_12, cdl_2 cdl_22) {
        cdl_22.a((fax_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("localPlayerDisplay"));
    }

    private static void a(fiq_1 fiq_12) {
        fad_1 fad_12 = (fad_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("applyColorButton");
        fad_12.setEnabled(true);
    }

    public static void validLevel(flp_2 flp_22) {
        fdu_1 fdu_12 = (fdu_1)fyw_0.gqw().gqC().uR("adminCharacterEditorDialog").uH("level");
        if (fdu_12 == null || fdu_12.getText() == null || fdu_12.getText().length() == 0) {
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)21);
        ns_02.R(Short.parseShort(fdu_12.getText()));
        ayf_22.d(ns_02);
        cdj_2.eec();
    }

    public static void validSpellLevel(flp_2 flp_22, bmx_0 bmx_02, fdu_1 fdu_12) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)324);
        ns_02.nX(bmx_02.avr());
        ns_02.R(Short.parseShort(fdu_12.getText()));
        ayf_22.d(ns_02);
        cdj_2.eec();
    }

    public static void learnSkill(flp_2 flp_22, bmf_2 bmf_22) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)229);
        ns_02.nX(bmf_22.dwk());
        ayf_22.d(ns_02);
        cdj_2.eec();
    }

    public static void addSkillXp(flp_2 flp_22, bmf_2 bmf_22, fdu_1 fdu_12) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        long l = 0L;
        try {
            l = Long.parseLong(fdu_12.getText());
        }
        catch (Exception exception) {
            mSX.error((Object)"Exception during addSkillXp", (Throwable)exception);
        }
        fdu_12.setText("0");
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)34);
        ns_02.nX(bmf_22.dwk());
        ns_02.cX(l);
        ayf_22.d(ns_02);
        cdj_2.eec();
    }

    private static void eec() {
        abg_2.bUP().a((Runnable)new cdk_2(), 1500L, 1);
    }
}

