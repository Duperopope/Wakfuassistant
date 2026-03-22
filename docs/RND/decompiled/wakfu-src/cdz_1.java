/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDZ
 */
@fyf_0
public class cdz_1 {
    public static final String PACKAGE = "wakfu.contactList";

    public static void openContactPopupMenu(flg_2 flg_22) {
        Object object;
        if (flg_22.gEm() && (object = flg_22.getItemValue()) != null && object instanceof apc_0) {
            daA daA2 = new daA();
            daA2.h((apc_0)object);
            daA2.lK(18034);
            aaw_1.bUq().h(daA2);
        }
    }

    public static void closeContactList(fiq_1 fiq_12) {
        dae_0.cV((short)16466);
    }

    public static void checkNotify(fiq_1 fiq_12, apc_0 apc_02) {
        if (apc_02 != null) {
            daA daA2 = new daA();
            daA2.h(apc_02);
            daA2.lK(16335);
            aaw_1.bUq().h(daA2);
        }
    }

    public static void enableDisableFriendFilter(fiq_1 fiq_12) {
        dae_0.cV((short)19206);
    }

    public static void enableDisableIgnoreFilter(fiq_1 fiq_12) {
        dae_0.cV((short)17538);
    }

    public static void addFriend(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJU || fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() == 10) {
            cdz_1.a(fiq_12, (short)1, true);
        }
    }

    public static void addIgnore(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJU || fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() == 10) {
            cdz_1.a(fiq_12, (short)2, true);
        }
    }

    public static void removeIgnore(fiq_1 fiq_12) {
        cdz_1.a(fiq_12, (short)2, false);
    }

    public static void addToGroup(fiq_1 fiq_12) {
        cdz_1.a(fiq_12, (short)4, true);
    }

    private static void a(fiq_1 fiq_12, short s, boolean bl) {
        dau dau2 = new dau();
        dau2.lK(bl ? 17148 : 16992);
        dau2.cW(s);
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
        fdu_1 fdu_12 = (fdu_1)fhs_22.uH(s == 1 ? "customFriendName" : "customIgnoreName");
        if (fdu_12 != null) {
            String string = fdu_12.getText();
            if (string == null || string.isEmpty()) {
                return;
            }
            apc_0 apc_02 = apd_0.cAO().cAQ().jj(string);
            if (apc_02 == null && (apc_02 = apd_0.cAO().jk(string)) == null) {
                apc_02 = new apc_0(-1L, string, string);
            }
            dau2.g(apc_02);
            fdu_12.setText("");
        }
        aaw_1.bUq().h(dau2);
    }

    public static void addCommentary(fiq_1 fiq_12, apc_0 apc_02) {
        if (apc_02 == null) {
            return;
        }
        daA daA2 = new daA();
        daA2.h(apc_02);
        daA2.lK(18167);
        aaw_1.bUq().h(daA2);
    }

    public static void validCommentary(fiq_1 fiq_12, apc_0 apc_02, fdu_1 fdu_12) {
        if (apc_02 == null) {
            return;
        }
        if (fiq_12.gBy() == fzq_0.tJU || fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() == 10) {
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("contactListDialog");
            daA daA2 = new daA();
            daA2.h(apc_02);
            String string = fdu_12.getText();
            String string2 = bYV.nU(string);
            fdu_12.setText("");
            if (string2.length() == 0 && string.length() != 0) {
                cdz_1.a(aum_0.cWf().c("error.censoredSentence", new Object[0]), fdu_12);
                return;
            }
            daA2.fa(string2);
            daA2.lK(19255);
            aaw_1.bUq().h(daA2);
        }
    }

    private static void a(String string2, fdu_1 fdu_12) {
        fiq_2.gCw().d(fik_2.gBZ().vE(string2).vG(ccp_2.mRF.byf()).a((n, string) -> fhw_2.gAL().s(fdu_12)).abQ(1));
    }

    public static void playListSound(boolean bl) {
        cAY.eHc().nP(bl ? 600117L : 600118L);
    }

    public static void showIgnored(fiq_1 fiq_12) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("contactListDialog");
        fes_2 fes_22 = (fes_2)fhs_22.uH("ignoreList");
        boolean bl = !fes_22.isVisible();
        fes_22.setVisible(bl);
        fes_2 fes_23 = (fes_2)fhs_22.uH("ignoreButton");
        if (bl) {
            fes_23.setStyle("remove");
        } else {
            fes_23.setStyle("add");
        }
        fes_22 = (fes_2)fhs_22.uH("friendsOfflineList");
        fes_22.setVisible(!bl);
        fes_23 = (fes_2)fhs_22.uH("friendsOfflineButton");
        if (!bl) {
            fes_23.setStyle("remove");
        } else {
            fes_23.setStyle("add");
        }
        cdz_1.playListSound(bl);
    }

    public static void showOffline(fiq_1 fiq_12) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("contactListDialog");
        fes_2 fes_22 = (fes_2)fhs_22.uH("friendsOfflineList");
        boolean bl = !fes_22.isVisible();
        fes_22.setVisible(bl);
        fes_2 fes_23 = (fes_2)fhs_22.uH("friendsOfflineButton");
        if (bl) {
            fes_23.setStyle("remove");
        } else {
            fes_23.setStyle("add");
        }
        fes_22 = (fes_2)fhs_22.uH("ignoreList");
        fes_22.setVisible(!bl);
        fes_23 = (fes_2)fhs_22.uH("ignoreButton");
        if (!bl) {
            fes_23.setStyle("remove");
        } else {
            fes_23.setStyle("add");
        }
        cdz_1.playListSound(bl);
    }

    public static void removeFriend(fiq_1 fiq_12, apc_0 apc_02) {
        dau dau2 = new dau();
        dau2.lK(16992);
        dau2.cW((short)1);
        dau2.g(apc_02);
        aaw_1.bUq().h(dau2);
    }

    public static void addFriendToGroup(fiq_1 fiq_12, apc_0 apc_02) {
        dbs dbs2 = new dbs();
        dbs2.c(Vf.bxK);
        dbs2.setName(apc_02.xO());
        aaw_1.bUq().h(dbs2);
    }

    public static void addFriendToGuild(fiq_1 fiq_12, apc_0 apc_02) {
        dbx dbx2 = new dbx();
        dbx2.setName(apc_02.xO());
        aaw_1.bUq().h(dbx2);
    }

    public static void removeIgnore(fiq_1 fiq_12, apc_0 apc_02) {
        dau dau2 = new dau();
        dau2.lK(16992);
        dau2.cW((short)2);
        dau2.g(apc_02);
        aaw_1.bUq().h(dau2);
    }

    public static void displayDisconnectedPlayers(fiq_1 fiq_12) {
        apd_0.cAO().eL(((fdd_2)fiq_12.gBD()).getSelected());
    }
}

