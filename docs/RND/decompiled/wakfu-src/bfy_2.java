/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bfy
 */
public class bfy_2 {
    static final Logger hTZ = Logger.getLogger(bfy_2.class);
    public static final String[] hUa = (String[])ArrayUtils.addAll((Object[])ary_2.fT("JAMBE"), (Object[])ary_2.fT("PIED"));
    private static final bfa_2 hUb = new bfa_2(0.0f, -7.2f, 1.8f, 48, 48);
    private static final bfa_2 hUc = new bfa_2(0.3f, -0.6f, 1.3f, 48, 100);
    private static final int hUd = abi_1.dzm.wp();
    private final String hUe;
    private final String hUf;
    @NotNull
    private bdj_2 hUg;

    public bfy_2(String string) {
        this.hUe = bfy_2.lx(string);
        this.hUg = bfy_2.dgE();
        this.hUf = bfy_2.dgF();
    }

    private static String lx(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Path cannot be null ");
        }
        File file = new File(string);
        if (!file.exists() || !file.isDirectory()) {
            throw new IllegalArgumentException("Path is not a valid directory=" + string);
        }
        return String.valueOf(Path.of(string, new String[0]).normalize().toAbsolutePath()) + File.separator;
    }

    @NotNull
    private static bdj_2 dgE() {
        bhJ bhJ2 = new bhJ();
        bhJ2.dC(1234L);
        bhJ2.aQ((byte)0);
        bhJ2.c(eym.phW);
        bhJ2.a(abi_1.dzm);
        bhJ2.dpo();
        bhJ2.fR(false);
        return bhJ2.ddI();
    }

    private static String dgF() {
        try {
            return auc_0.cVq().bS("ANMEquipmentPath");
        }
        catch (fu_0 fu_02) {
            throw new IllegalStateException("ANMEquipmentPath should be configured to start the export", fu_02);
        }
    }

    public void dgG() {
        hTZ.info((Object)("Export character faces image in " + this.hUe));
        for (eym eym2 : eyn.fhY()) {
            this.c(eym2);
        }
        hTZ.info((Object)("Export done in " + this.hUe));
    }

    public void c(@NotNull eym eym2) {
        short s = eym2.aWP();
        for (byte by = 0; by < 2; by = (byte)(by + 1)) {
            short s2 = bft_2.dgp().a(s, by);
            byte by2 = bft_2.dgp().b(s, by);
            for (short s3 = 0; s3 < s2; s3 = (short)((short)(s3 + 1))) {
                for (byte by3 = 0; by3 < by2; by3 = (byte)(by3 + 1)) {
                    this.b(s, by, s3, by3);
                }
            }
        }
    }

    public void b(short s, byte by, short s2, byte by2) {
        String string = bft_2.dgp().o(s, by, s2);
        if (string == null) {
            hTZ.error((Object)("Missing dress style for index " + s2 + " breed=" + s + " sex=" + by));
            return;
        }
        String string2 = bft_2.dgp().a(s, by, s2, by2);
        if (string2 == null) {
            hTZ.error((Object)("Missing hair style for index " + by2 + " breed=" + s + " sex=" + by));
            return;
        }
        this.a(this.hUg, s, by, s2, string, string2);
        String string3 = bft_2.a(s, by, s2, by2);
        bfz_2 bfz_22 = new bfz_2(this.hUe + "hair/", string3 + ".png");
        bfy_2.a((ZC)this.hUg, hUd, bfz_22, hUb, hUa);
    }

    public void dgH() {
        hTZ.info((Object)("Export character bodies image in " + this.hUe));
        for (eym eym2 : eyn.fhY()) {
            this.d(eym2);
        }
        hTZ.info((Object)("Export done in " + this.hUe));
    }

    public void d(@NotNull eym eym2) {
        short s = eym2.aWP();
        for (byte by = 0; by < 2; by = (byte)(by + 1)) {
            short s2 = bft_2.dgp().a(s, by);
            for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
                this.e(s, by, s3);
            }
        }
    }

    public void e(short s, byte by, short s2) {
        String string = bft_2.dgp().o(s, by, s2);
        if (string == null) {
            hTZ.error((Object)("Missing dress style for index " + s2 + " breed=" + s + " sex=" + by));
            return;
        }
        boolean bl = false;
        String string2 = bft_2.dgp().a(s, by, s2, (byte)0);
        if (string2 == null) {
            hTZ.error((Object)("Missing hair style for index 0 breed=" + s + " sex=" + by));
            return;
        }
        this.a(this.hUg, s, by, s2, string, string2);
        String string3 = bft_2.d(s, by, s2);
        bfz_2 bfz_22 = new bfz_2(this.hUe + "dress/", string3 + ".png");
        bfy_2.a((ZC)this.hUg, hUd, bfz_22, hUc, new String[0]);
    }

    private void a(bdj_2 bdj_22, short s, byte by, short s2, String string, String string2) {
        short s3 = bft_2.dgp().b(s, by, s2);
        bfy_2.a(bdj_22, s3);
        String string3 = String.format(this.hUf, string);
        bfy_2.a(bdj_22, string3, ary_2.fT("VETEMENTCUSTOM"));
        String string4 = String.format(this.hUf, string2);
        bfy_2.a(bdj_22, string4, ary_2.fT("CHEVEUXCUSTOM"));
        int n = bft_2.dgp().d(s, by, s2);
        bjc_1.a(new bjc_1(n), (ZC)bdj_22, arx_1.cTt, true);
        int n2 = bft_2.dgp().c((int)s, by, s2);
        bjc_1.a(new bjc_1(n2), (ZC)bdj_22, arx_1.cTs, true);
        int n3 = bft_2.dgp().e(s, by, s2);
        bjc_1.a(new bjc_1(n3), (ZC)bdj_22, arx_1.cTz, true);
        int n4 = bft_2.dgp().f(s, by, s2);
        bjc_1.a(new bjc_1(n4), (ZC)bdj_22, arx_1.cTB, true);
        int n5 = bft_2.dgp().g(s, by, s2);
        bjc_1.a(new bjc_1(n5), (ZC)bdj_22, arx_1.cTC, true);
        int n6 = bft_2.dgp().h(s, by, s2);
        bjc_1.a(new bjc_1(n6), (ZC)bdj_22, arx_1.cTD, true);
        int n7 = bft_2.dgp().i(s, by, s2);
        bjc_1.a(new bjc_1(n7), (ZC)bdj_22, arx_1.cTE, true);
        int n8 = bft_2.dgp().j(s, by, s2);
        bjc_1.a(new bjc_1(n8), (ZC)bdj_22, arx_1.cTF, true);
        int n9 = bft_2.dgp().k(s, by, s2);
        bjc_1.a(new bjc_1(n9), (ZC)bdj_22, arx_1.cTG, true);
    }

    private static void a(bdj_2 bdj_22, short s) {
        try {
            String string = bdf_1.By(s);
            bdj_22.dP(Integer.toString(s));
            bdj_22.k(string, false);
        }
        catch (fu_0 | IOException exception) {
            hTZ.error((Object)"Error when loading gfx", (Throwable)exception);
        }
    }

    private static void a(bdj_2 bdj_22, @NotNull String string, String ... stringArray) {
        Anm anm = ZC.i(string, false);
        if (anm == null) {
            hTZ.warn((Object)("Error when loading equipment " + string));
            return;
        }
        bdj_22.a(anm, arn_2.o(stringArray));
    }

    private static void a(ZC zC, int n, aeL aeL2, aeM aeM2, String ... stringArray) {
        aro_1 aro_12 = zC.bqd();
        if (aro_12 == null) {
            throw new RuntimeException("AnmInstance is null");
        }
        String string = n + "_AnimStatique";
        aeJ aeJ2 = new aeJ(aie_0.cfn().bmE(), aeM2);
        aeJ2.a(aro_12, string, stringArray);
        aeJ2.a("png", aeL2);
    }

    public String dgI() {
        return this.hUe;
    }
}

