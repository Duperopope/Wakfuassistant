/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cHx
 */
@fyf_0
public class chx_1 {
    public static final String PACKAGE = "wakfu.windowStick";
    private static final byte mZG = 0;
    private static final byte mZH = 1;

    public static void stickWindow(fmc_1 fmc_12) {
        chx_1.a(fmc_12, "", (byte)0);
    }

    private static String a(fey_2 fey_22, faa_2 faa_22, byte by) {
        switch (by) {
            case 0: {
                switch (faa_22) {
                    case tLL: 
                    case tLR: {
                        return fey_22.getHorizontalDialog();
                    }
                }
                return fey_22.getVerticalDialog();
            }
            case 1: {
                String string = fey_22.getElementMap().getId();
                switch (faa_22) {
                    case tLN: {
                        return fey_22.getVerticalDialog();
                    }
                    case tLP: {
                        return fey_22.getHorizontalDialog();
                    }
                }
                return string;
            }
        }
        return null;
    }

    private static fey_2 a(fmc_1 fmc_12, String string, byte by) {
        fey_2 fey_22 = (fey_2)fmc_12.gBE();
        String string2 = fey_22.getElementMap().getId();
        fki_2 fki_22 = fey_22.getStickData();
        faa_2 faa_22 = fmc_12.getAlign();
        int n = fbj_1.getInstance().getDragButton();
        String string3 = chx_1.a(fey_22, faa_22, by);
        if (string2.startsWith(string3)) {
            return fey_22;
        }
        fyw_0.gqw().J(string2, false);
        fey_2 fey_23 = (fey_2)fyw_0.gqw().a(string3 + string, ccj_2.pe(string3), 40976L);
        fey_23.setHorizontalDialog(fey_22.getHorizontalDialog());
        fey_23.setVerticalDialog(fey_22.getVerticalDialog());
        fkj_2.gCW().a(fey_23, fki_22.gCT(), false);
        fkj_2.gCW().bO(fey_23);
        ArrayList<fea_1> arrayList = fey_23.getMovePoints();
        if (!arrayList.isEmpty()) {
            fea_1 fea_12 = arrayList.get(0);
            chy_1 chy_12 = new chy_1(fea_12, fey_23, n);
            fea_12.setEnablePositionEvents(true);
            fea_12.setEnableResizeEvents(true);
            fea_12.a(fzq_0.tKh, chy_12, false);
            fea_12.a(fzq_0.tKi, chy_12, false);
        }
        return fey_23;
    }

    public static void stickShortcutBar(fmc_1 fmc_12, blg_2 blg_22) {
        byte by = (byte)(blg_22.deO() - blg_22.ecS().eFS());
        fey_2 fey_22 = chx_1.a(fmc_12, String.valueOf(by), (byte)0);
        cxx_2.eXH().s(by, fey_22.getElementMap().getId().startsWith(fey_22.getVerticalDialog()));
        cxx_2.eXH().el(by);
    }

    public static void stickStateBar(fmc_1 fmc_12) {
        fey_2 fey_22;
        fey_2 fey_23 = (fey_2)fmc_12.gBE();
        if (fey_23 != (fey_22 = chx_1.a(fmc_12, "", (byte)0))) {
            fey_22.a(fzq_0.tKh, new chz_1(fey_22), false);
        }
    }

    public static void stickFollowAchievements(fmc_1 fmc_12) {
        fey_2 fey_22;
        fey_2 fey_23 = (fey_2)fmc_12.gBE();
        if (fey_23 != (fey_22 = chx_1.a(fmc_12, "", (byte)1))) {
            csc_1.eNJ().bC(fey_22);
        }
    }
}

