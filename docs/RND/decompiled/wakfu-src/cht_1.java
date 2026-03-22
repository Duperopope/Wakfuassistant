/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHt
 */
@fyf_0
public class cht_1 {
    public static final String PACKAGE = "wakfu.voteInformation";

    public static void voteFor(fiq_1 fiq_12, brd_2 brd_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null || bgt_02.Sn() != brd_22.ela().Sn()) {
            fiq_2.gCw().d(fik_2.a(string -> {
                dca_0 dca_02 = new dca_0();
                dca_02.lK(16430);
                dca_02.a(brd_22);
                aaw_1.bUq().h(dca_02);
            }).l("nation.vote.voteFor.warning", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
        } else {
            dca_0 dca_02 = new dca_0();
            dca_02.lK(16430);
            dca_02.a(brd_22);
            aaw_1.bUq().h(dca_02);
        }
    }

    public static void closeDialog(fiq_1 fiq_12) {
        aue_0.cVJ().b(cyk_2.eYu());
    }

    public static void validate(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string2 = fdu_12.getText();
        String string3 = bYV.nU(string2);
        if (string3.isEmpty() && !string2.isEmpty()) {
            fiq_2.gCw().d(fik_2.gBZ().l("error.censoredSentence", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return;
        }
        fdu_12.setText(string3);
        fiq_2.gCw().d(fik_2.a(string -> {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(17030);
            dae_02.fa(fdu_12.getText());
            aaw_1.bUq().h(dae_02);
            fdu_12.setText("");
            fse_1.gFu().f("electionSloganDirty", false);
        }).l("nation.vote.candidateRegistration.warning", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
    }

    public static void onKeyPress(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJF) {
            fdu_1 fdu_12 = (fdu_1)fiq_12.gBE();
            if (!fdu_12.gxD()) {
                return;
            }
            fli_2 fli_22 = (fli_2)fiq_12;
            Object object = fdu_12.getText();
            int n2 = fli_22.gDW() == '\n' ? 1 : 0;
            for (int i = 0; i < ((String)object).length(); ++i) {
                if (((String)object).charAt(i) != '\n' || ++n2 <= 3) continue;
                object = ((String)object).substring(0, i) + " " + ((String)object).substring(i + 1, ((String)object).length());
            }
            if (n2 > 3) {
                fdu_12.setText((String)object);
                fiq_2.gCw().d(fik_2.gBZ().l("carriageReturnLimitError", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1).a((n, string) -> fhw_2.gAL().s(fdu_12)));
            }
            fse_1.gFu().f("electionSloganLength", aum_0.cWf().c("remainingLetters", 200 - fdu_12.getText().length()));
            fse_1.gFu().f("electionSloganDirty", true);
        }
    }

    public static void previousPage(fiq_1 fiq_12) {
        dae_0.cV((short)19103);
    }

    public static void nextPage(fiq_1 fiq_12) {
        dae_0.cV((short)19779);
    }
}

