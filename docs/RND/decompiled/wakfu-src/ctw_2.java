/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTw
 */
public class ctw_2
implements adi_1,
fsk_1 {
    private static final ctw_2 nJm = new ctw_2();
    private alx_2 ikv;

    public static ctw_2 ePU() {
        return nJm;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18034: {
                daA daA2 = (daA)aam_22;
                apc_0 apc_02 = daA2.eZT();
                return false;
            }
            case 16335: {
                daA daA3 = (daA)aam_22;
                apc_0 apc_03 = daA3.eZT();
                if (apc_03 != null) {
                    apc_03.eJ(!apc_03.cAK());
                }
                return false;
            }
            case 17148: {
                dau dau2 = (dau)aam_22;
                apc_0 apc_04 = dau2.eZN();
                switch (dau2.clb()) {
                    case 1: {
                        apa_0.e(apc_04);
                        break;
                    }
                    case 2: {
                        apa_0.f(apc_04);
                        break;
                    }
                    case 4: {
                        aue_0.cVJ().cVK().dnQ().mz(apc_04.xO());
                        break;
                    }
                }
                return false;
            }
            case 16992: {
                dau dau3 = (dau)aam_22;
                apc_0 apc_05 = dau3.eZN();
                switch (dau3.clb()) {
                    case 1: {
                        ni_0 ni_02 = new ni_0();
                        ni_02.u(apc_05.Sn());
                        aue_0.cVJ().etu().d(ni_02);
                        break;
                    }
                    case 2: {
                        NJ nJ = new NJ();
                        nJ.v(apc_05.Sn());
                        aue_0.cVJ().etu().d(nJ);
                    }
                }
                return false;
            }
            case 18167: {
                daA daA4 = (daA)aam_22;
                apc_0 apc_06 = daA4.eZT();
                apc_06.eK(true);
                fse_1.gFu().a((aef_2)apc_06, "commentaryEdition");
                return false;
            }
            case 19255: {
                daA daA5 = (daA)aam_22;
                String string = daA5.bCt();
                apc_0 apc_07 = daA5.eZT();
                apc_07.jo(string);
                apc_07.eK(false);
                fse_1.gFu().a((aef_2)apc_07, "commentaryEdition", "commentary");
                nc_1 nc_12 = new nc_1();
                nc_12.cU(apc_07.xO());
                nc_12.cV(string);
                aue_0.cVJ().etu().d(nc_12);
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
        if (!bl) {
            apd_0.cAO().eL(true);
            this.ikv = new ctx_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("contact.list", apd_0.cAO());
            ccj_2.g("contactListDialog", 32768L);
            fyw_0.gqw().d("wakfu.contactList", cdz_1.class);
            cAY.eHc().eHq();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            apd_0.cAO().cAQ().cAG();
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("contactListDialog");
            fse_1.gFu().vX("contact.list");
            fyw_0.gqw().tc("wakfu.contactList");
            cAY.eHc().eHr();
        }
    }

    @Override
    public void eX(String string) {
        if (string != null && !string.equals("contactListDialog")) {
            aue_0.cVJ().b(this);
        }
    }
}

