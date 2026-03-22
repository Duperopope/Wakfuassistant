/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEB
 */
@fyf_0
public class ceb_1 {
    public static final String PACKAGE = "wakfu.eventsCalendar";

    public static void closeDialog(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cun_1.eRJ())) {
            aue_0.cVJ().b(cun_1.eRJ());
        } else {
            aue_0.cVJ().a(cun_1.eRJ());
        }
    }

    public static void changeCurrentMonth(flk_2 flk_22) {
        if (flk_22.bqr()) {
            bsh bsh2 = (bsh)flk_22.getValue();
            bsf.dEU().Fm(bsh2.dFb());
        }
    }

    public static void changeCurrentYear(flk_2 flk_22) {
        if (flk_22.bqr()) {
            Integer n = (Integer)flk_22.getValue();
            bsf.dEU().Fn(n);
        }
    }

    public static void changeEditableCurrentMonth(flk_2 flk_22) {
        if (flk_22.bqr()) {
            bsd bsd2 = (bsd)fse_1.gFu().vY("calendar.editable");
            bsh bsh2 = (bsh)flk_22.getValue();
            bsd2.Fm(bsh2.dFb());
        }
    }

    public static void changeEditableCurrentYear(flk_2 flk_22) {
        if (flk_22.bqr()) {
            bsd bsd2 = (bsd)fse_1.gFu().vY("calendar.editable");
            Integer n = (Integer)flk_22.getValue();
            bsd2.Fn(n);
        }
    }

    public static void displayEventDescriptionPopup(flg_2 flg_22, frx_1 frx_12) {
        fse_1.gFu().f("calendar.event.detail", flg_22.getItemValue());
        fyd_0.popup(frx_12, (fes_2)flg_22.gBE());
    }

    public static void hideEventDescriptionPopup(fiq_1 fiq_12, frx_1 frx_12) {
        fyd_0.closePopup(fiq_12, frx_12);
    }

    public static void openCreateEventDialog(fiq_1 fiq_12) {
        dae_0.cV((short)16682);
    }

    public static void openEditEventDialog(flg_2 flg_22) {
        dbc dbc2 = new dbc();
        dbc2.lK(19697);
        dbc2.b((bsi)flg_22.getItemValue());
        aaw_1.bUq().h(dbc2);
    }

    public static void selectStartDate(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16642);
        dae_02.cC(true);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectEndDate(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16642);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void closeCalendar(fiq_1 fiq_12) {
        dae_0.cV((short)16642);
    }

    public static void selectDate(fiq_1 fiq_12, fak_2 fak_22, fdy_2 fdy_22, fdy_2 fdy_23) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19892);
        dae_02.ay((byte)fak_22.getDayOver());
        dae_02.az((short)fak_22.getMonthOver());
        dae_02.sY(fak_22.getYearOver());
        dae_02.gj(fdy_22.getValue());
        dae_02.cL(fdy_23.getValue());
        aaw_1.bUq().h(dae_02);
    }

    public static void setParticipantsLimited(flv_2 flv_22) {
        bsi bsi2 = (bsi)fse_1.gFu().vY("calendar.event.editable");
        bsi2.gR(flv_22.bqr());
    }

    public static void changeMaxParticipants(fli_2 fli_22) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        String string = fdu_12.getText();
        if (string.length() == 0 || string.equals("0")) {
            fdu_12.setText(String.valueOf(2));
        }
    }

    public static void changeMaxRegistrations(fli_2 fli_22) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        String string = fdu_12.getText();
        if (string.length() == 0 || string.equals("0")) {
            fdu_12.setText(String.valueOf(2));
        }
    }

    public static void closeCreateEventDialog(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19210);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void closeEditEventDialog(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17833);
        dae_02.cC(false);
        aaw_1.bUq().h(dae_02);
    }

    public static void createEvent(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, fdu_1 fdu_14, fdu_1 fdu_15) {
        String string = fdu_12.getText();
        String string2 = fdu_13.getText();
        if (string.isEmpty()) {
            fiq_2.gCw().d(fik_2.gBZ().l("calendar.event.creation.formIncomplete", new Object[0]).abQ(1000).vG(ccp_2.mRF.byf()));
            return;
        }
        byte by = Bw.a((Object)fdu_15.getText(), (byte)0);
        byte by2 = Bw.a((Object)fdu_14.getText(), (byte)0);
        dbb dbb2 = new dbb(string, string2, by2, by);
        dbb2.lK(19210);
        dbb2.cC(true);
        aaw_1.bUq().h(dbb2);
    }

    public static void editEvent(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, fdu_1 fdu_14, fdu_1 fdu_15) {
        String string = fdu_12.getText();
        String string2 = fdu_13.getText();
        if (string.isEmpty() || string2.isEmpty()) {
            fiq_2.gCw().d(fik_2.gBZ().l("calendar.event.creation.formIncomplete", new Object[0]).abQ(1000).vG(ccp_2.mRF.byf()));
            return;
        }
        byte by = Bw.a((Object)fdu_15.getText(), (byte)-1);
        byte by2 = Bw.a((Object)fdu_14.getText(), (byte)-1);
        dbb dbb2 = new dbb(string, string2, by2, by);
        dbb2.lK(17833);
        dbb2.cC(true);
        aaw_1.bUq().h(dbb2);
    }

    public static void registerEvent(fiq_1 fiq_12) {
        dae_0.cV((short)16767);
    }

    public static void unregisterEvent(fiq_1 fiq_12) {
        dae_0.cV((short)19543);
    }

    public static void setEventType(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        byte by = Byte.parseByte(fcu_12.getValue());
        bsi bsi2 = (bsi)fse_1.gFu().vY("calendar.event.editable");
        bsi2.a(by);
        if (!flv_22.bqr()) {
            bsi2.gR(false);
        }
    }

    public static void setGuildEvent(flv_2 flv_22) {
        byte by = flv_22.bqr() ? (byte)2 : 1;
        bsi bsi2 = (bsi)fse_1.gFu().vY("calendar.event.editable");
        bsi2.a(by);
        if (!flv_22.bqr()) {
            bsi2.gR(false);
        }
    }

    public static void validate(fiq_1 fiq_12, fbz_2 fbz_22) {
        bsc bsc2 = (bsc)fbz_22.getSelectedValue();
        if (bsc2 != null) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16066);
            dae_02.gj(bsc2.Sn());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void unvalidate(fiq_1 fiq_12, fbz_2 fbz_22) {
        bsc bsc2 = (bsc)fbz_22.getSelectedValue();
        if (bsc2 != null) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16034);
            dae_02.gj(bsc2.Sn());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void inviteAllParticipants(fiq_1 fiq_12) {
        dae_0.cV((short)17124);
    }

    public static void inviteToEvent(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string.length() == 0) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16189);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void deleteEvent(fiq_1 fiq_12) {
        dae_0.cV((short)19809);
    }
}

