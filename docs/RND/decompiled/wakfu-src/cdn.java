/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cdn
implements adi_1 {
    protected static final Logger lQt = Logger.getLogger(cdn.class);
    private static final cdn lQu = new cdn();
    private static final cbz_2 lQv = cwj_1.nTI.eWl();

    public static cdn eua() {
        return lQu;
    }

    private cdn() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 348: {
                nt_0 nt_02 = (nt_0)aam_22;
                if (nt_02.aWa()) {
                    cdn.ol(nt_02.getMessage());
                }
                return true;
            }
            case 336: {
                nu_1 nu_12 = (nu_1)aam_22;
                short s = nu_12.aVZ();
                switch (s) {
                    case 284: {
                        nE nE2;
                        short s2 = nu_12.aWg();
                        if (s2 == 0) {
                            cdn.ol("No players found");
                            return false;
                        }
                        short s3 = nu_12.aWg();
                        fud_0 fud_02 = fud_0.hL(nu_12.aWe());
                        try {
                            nE2 = nE.ck(nu_12.aWi());
                        }
                        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                            lQt.error((Object)"[Moderation] Error while parsing ProtoPlayerInfos in moderation panel", (Throwable)invalidProtocolBufferException);
                            return false;
                        }
                        cdn.a(fud_02, nE2, s2, s3);
                        break;
                    }
                    case 272: {
                        lQv.of(nu_12.aWb());
                        return false;
                    }
                    case 472: {
                        int n = nu_12.aWc();
                        ArrayList<String> arrayList = new ArrayList<String>();
                        for (int i = 0; i < n; ++i) {
                            arrayList.add(nu_12.aWb());
                        }
                        lQv.Q(arrayList);
                        return false;
                    }
                    case 38: {
                        int n = nu_12.aWe();
                        ArrayList<fsh_0> arrayList = new ArrayList<fsh_0>();
                        for (int i = 0; i < n; ++i) {
                            arrayList.add(fsh_0.hG(nu_12.aWe()));
                        }
                        lQv.A(arrayList);
                        return false;
                    }
                    case 54: {
                        cwj_1.nTI.eWl().esQ().my(nu_12.aWb());
                        return false;
                    }
                    case 348: {
                        boolean bl = nu_12.aWd();
                        if (bl) {
                            try {
                                lQv.a(cbr_2.ed(nu_12.aWi()));
                            }
                            catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                                cdn.ol("[ERROR] Error while retrieving guild infos, contact a dev with your logs");
                                lQt.error((Object)"Cannot parse guild infos from message", (Throwable)invalidProtocolBufferException);
                                return false;
                            }
                            lQv.a(cbx_2.lMb);
                        } else {
                            cdn.ol("[ERROR] " + nu_12.aWb());
                        }
                        return false;
                    }
                    case 177: {
                        boolean bl = nu_12.aWd();
                        String string = nu_12.aWb();
                        cdn.ol((bl ? "" : "[ERROR] ") + string);
                    }
                }
                break;
            }
            case 22309: {
                czk czk2 = (czk)aam_22;
                cwj_1.nTI.b(czk2.etg());
                return false;
            }
            case 22484: {
                czj czj2 = (czj)aam_22;
                cwj_1.nTI.aB(czj2.eGb());
                cwj_1.nTI.eWl().iX(false);
                fse_1.gFu().a((aef_2)cwj_1.nTI.eWl(), "penalFile", "penalFileUiTitle", "isPenalFileLoading");
                return false;
            }
            case 23247: {
                czl czl2 = (czl)aam_22;
                cwj_1.nTI.K(czl2.eGc(), czl2.eGd());
            }
        }
        return true;
    }

    private static void a(fud_0 fud_02, nE nE2, short s, short s2) {
        switch (fud_02) {
            case thA: {
                if (s2 == 0) {
                    lQv.esS();
                }
                lQv.og(nE2.getName());
                cwj_1.nTI.eWl().f(nE2);
                if (s != 1 && !nE2.aqh()) break;
                cwj_1.nTI.eWl().oe(nE2.getName());
                break;
            }
            case thz: {
                lQv.esQ().d(nE2);
                if (nE2.Ya() <= 0L) break;
                cwj_1.c((short)54, nE2.Ya());
                break;
            }
            case thB: {
                if (!lQv.esQ().getName().equals(nE2.getName())) break;
                lQv.esQ().e(nE2);
            }
        }
    }

    public static void ol(String string) {
        ux_0 ux_02 = Uq.buK.bjc();
        String string2 = "[" + ux_02.bjE() + ":" + ux_02.bjF() + "] ";
        cwj_1.nTI.eWl().oh(string2 + string);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

