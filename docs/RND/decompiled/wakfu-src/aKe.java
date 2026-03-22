/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class aKe {
    private static final Logger edf = Logger.getLogger(aKe.class);
    private static final aKe edg = new aKe();
    private aKj edh = aKj.edx;
    private bsj_0 edi;
    private final EnumMap<aKj, Boolean> edj = new EnumMap(aKj.class);
    final EnumMap<aKj, Boolean> edk = new EnumMap(aKj.class);
    final EnumMap<aKj, aea_1> edl = new EnumMap(aKj.class);
    final EnumMap<aKj, aea_1> edm = new EnumMap(aKj.class);
    final aea_1 edn = aez_12 -> this.b((byte)aez_12.bZS(), false);
    protected final afg edo = new aKf(this);
    protected final afg edp = new aKg(this);
    protected final afg edq = new aKh(this);

    public static aKe cix() {
        return edg;
    }

    private aKe() {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        for (aKj aKj2 : aKj.values()) {
            bsn_1 bsn_12;
            aeb_1 aeb_12;
            aKk aKk2 = aKj2.ciA();
            if (aKk2 == null) continue;
            this.edk.put(aKj2, false);
            this.edj.put(aKj2, false);
            this.edl.put(aKj2, aez_12 -> this.a(aez_12.bZP(), aKj2));
            this.edm.put(aKj2, aez_12 -> this.b(aez_12.bZP(), aKj2));
            bsn_1 bsn_13 = aKk2.ciE();
            aeb_1 aeb_13 = bsn_13.e(bsg_12);
            if (aeb_13 != null) {
                aeb_13.a(bsn_13.getKey(), this.edm.get(aKj2));
                this.b(bsg_12.a(bsn_13), aKj2);
            }
            if ((aeb_12 = (bsn_12 = aKk2.ciD()).e(bsg_12)) == null) continue;
            aeb_12.a(bsn_12.getKey(), this.edl.get(aKj2));
            this.a(bsg_12.a(bsn_12), aKj2);
        }
        bsg_12.a(this.edq);
        aeb_1 aeb_14 = bsn_1.ljc.e(bsg_12);
        if (aeb_14 != null) {
            aeb_14.a(bsn_1.ljc.getKey(), this.edn);
            this.b((byte)bsg_12.d(bsn_1.ljc), false);
        }
        bsg_12.a(this.edp);
        bsg_12.a(this.edo);
    }

    public void a(boolean bl, aKj aKj2) {
        if (!this.edk.containsKey(aKj2)) {
            return;
        }
        if (this.edk.get(aKj2) == bl) {
            return;
        }
        this.edk.put(aKj2, bl);
        if (this.edh == aKj2) {
            this.ey(false);
        }
    }

    public boolean a(aKj aKj2) {
        return this.edk.getOrDefault(aKj2, false);
    }

    public void b(boolean bl, aKj aKj2) {
        if (!this.edj.containsKey(aKj2)) {
            return;
        }
        if (this.edj.get(aKj2) == bl) {
            return;
        }
        this.edj.put(aKj2, bl);
        if (this.edh == aKj2) {
            this.b(aie_0.cfn().bmC());
        }
    }

    public boolean b(aKj aKj2) {
        return this.edj.getOrDefault(aKj2, false);
    }

    public aKj ciy() {
        return this.edh;
    }

    public void b(byte by, boolean bl) {
        this.a(aKj.aP(by), bl);
    }

    public void a(aKj aKj2, boolean bl) {
        boolean bl2 = auc_0.cVq().b("disableTacticalView", false);
        if (bl2 && this.edh == aKj.edv) {
            return;
        }
        if (this.edh != aKj2) {
            this.edh = aKj2;
            this.ey(bl);
        }
    }

    public void a(bsj_0 bsj_02) {
        if (bsj_02 != this.edi) {
            this.edi = bsj_02;
            this.ey(false);
        }
    }

    private void ey(boolean bl) {
        aam_0 aam_02 = aie_0.cfn().bmC();
        if (this.edi == null) {
            this.a(aam_02, false);
            return;
        }
        switch (this.edh) {
            case edx: {
                try {
                    ajz_0 ajz_02 = new ajz_0(this.edi, this.edh.ciz(), this.edk.get(this.edh));
                    acq_0.cge.a((acx_0 acx_02) -> !ajz_02.cip().b(acx_02));
                    aam_02.a(ajz_02);
                    this.b(aam_02);
                }
                catch (Exception exception) {
                    edf.error((Object)"Error occured during activation of Full TacticalMode", (Throwable)exception);
                    this.a(aam_02, !bl);
                }
                break;
            }
            case edw: {
                try {
                    acq_0.cge.a((acy_0)null);
                    aam_02.a(new aKa(this.edi, this.edh.ciz(), this.edk.get(this.edh)));
                    this.b(aam_02);
                }
                catch (Exception exception) {
                    edf.error((Object)"Error occured during activation of Semi TacticalMode", (Throwable)exception);
                    this.a(aam_02, !bl);
                }
                break;
            }
            case edv: {
                this.a(aam_02, false);
                break;
            }
            default: {
                edf.error((Object)String.format("Unmanaged TacticalMode (%s) is used !", this.edh));
                this.a(aam_02, true);
            }
        }
    }

    private void b(aam_0 aam_02) {
        if (this.edj.get(this.edh).booleanValue()) {
            aam_02.bS(true);
            this.c(aam_02);
        } else {
            aam_02.bS(false);
            aam_02.a(this.edh.ciz().getBackgroundColor());
        }
    }

    private void a(aam_0 aam_02, boolean bl) {
        if (this.edh != aKj.edv && bl) {
            this.edh = aKj.edv;
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljc, this.edh.aJr());
        }
        acq_0.cge.a((acy_0)null);
        aam_02.a(aga.csK);
        aam_02.bS(true);
        this.c(aam_02);
    }

    private void c(aam_0 aam_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        long l = bgt_02.aqZ();
        bzq_2 bzq_22 = bzp_2.eqt().mA((short)l);
        if (bzq_22 != null) {
            aam_02.a(bzq_22.lEE);
        }
    }
}

