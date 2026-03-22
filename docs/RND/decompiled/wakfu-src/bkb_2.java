/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKB
 */
public class bkb_2
implements aeh_2 {
    public static final String koY = "mustDisplay";
    public static final String koZ = "currentPact";
    public static final String kpa = "pendingPact";
    public static final String kpb = "pendingPactTimer";
    public static final String kpc = "altars";
    public static final String kpd = "hasAltars";
    private fpu_0 kpe;
    private fpu_0 kpf;
    private byte kpg;
    private final Map<Long, bkz_2> kph = new HashMap<Long, bkz_2>();
    private final Runnable kpi = () -> {
        this.kpg = (byte)(this.kpg - 1);
        fse_1.gFu().a((aef_2)this, kpb);
        if (this.kpg <= 0) {
            this.kpf = null;
            fse_1.gFu().a((aef_2)this, kpa);
        }
    };

    @Override
    public String[] bxk() {
        return new String[]{koY, koZ, kpa, kpb, kpc, kpd};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (koY.equals(string)) {
            return this.kpe != null && this.kpe != fpu_0.sRd || this.kpf != null && this.kpf != fpu_0.sRd;
        }
        if (koZ.equals(string)) {
            return this.kpe != null && this.kpe != fpu_0.sRd ? this.a(this.kpe) : null;
        }
        if (kpa.equals(string)) {
            return this.kpf != null && this.kpf != fpu_0.sRd ? this.a(this.kpf) : null;
        }
        if (kpb.equals(string)) {
            return this.kpg;
        }
        if (kpc.equals(string)) {
            return this.kph.values();
        }
        if (kpd.equals(string)) {
            return this.kph.size() > 0;
        }
        return null;
    }

    private String a(fpu_0 fpu_02) {
        return aum_0.cWf().c("pvp." + fpu_02.name().toLowerCase() + ".title", new Object[0]);
    }

    private void ebB() {
        this.kpe = bbs_2.a(eva_1.owx).map(evv_22 -> (fpQ)evv_22).map(fpQ::dkC).orElse(fpu_0.sRd);
        fse_1.gFu().a((aef_2)this, koY, koZ);
    }

    private void ebC() {
        bbs_2.a(eva_1.owx).ifPresent(evv_22 -> {
            this.kpf = ((fpQ)evv_22).ghp();
            this.kpg = this.kpf != null ? this.kpf.ghv() : (byte)0;
        });
        fse_1.gFu().a((aef_2)this, koY, kpa, kpb);
    }

    public void b(fpu_0 fpu_02) {
        if (this.kpe == null) {
            this.ebB();
        }
        if (this.kpe != fpu_0.sRd && fpu_02 != fpu_0.sRd) {
            this.deS();
            return;
        }
        if (fpu_02 == fpu_0.sRd) {
            this.deS();
            return;
        }
        this.kpe = fpu_0.sRd;
        this.kpf = fpu_02;
        this.kpg = fpu_02.ghv();
        abg_2.bUP().a(this.kpi, 1000L, (int)this.kpg);
        fse_1.gFu().a((aef_2)this, koY, koZ, kpb, kpb);
    }

    public void a(fps_0 fps_02, String string) {
        bkz_2 bkz_22 = new bkz_2(string, fps_02);
        this.kph.put(fps_02.bhh(), bkz_22);
        bkz_22.ebA();
        fse_1.gFu().a((aef_2)this, kpc, kpd);
    }

    public void a(bkz_2 bkz_22) {
        this.kph.remove(bkz_22.bhh());
        fse_1.gFu().a((aef_2)this, kpc, kpd);
    }

    public void deS() {
        this.ebB();
        this.ebC();
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    public void ebD() {
        abg_2.bUP().h(this.kpi);
    }

    public byte ebE() {
        return this.kpg;
    }

    public void bZ(byte by) {
        this.kpg = by;
        abg_2.bUP().h(this.kpi);
        abg_2.bUP().a(this.kpi, 1000L, (int)this.kpg);
    }
}

