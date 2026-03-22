/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bYu
 */
public class byu_2
implements bye_1 {
    private static final String lzr = "slotsList";
    private static final int lzs = 250;
    private static final int lzt = 1100;
    @NotNull
    private final ffV lzu;

    public byu_2(@NotNull ffV ffV2) {
        this.lzu = ffV2;
    }

    @Override
    @NotNull
    public byh_1 eoU() {
        return byh_1.lAu;
    }

    @Override
    @NotNull
    public String eoV() {
        return "slotsToastDialog";
    }

    @Override
    public byf_1 eoW() {
        return byf_1.lAp;
    }

    @Override
    public byg_1 eoX() {
        return new byg_1(250, 1100, 250);
    }

    @Override
    public void a(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("itemDetail", (Object)this.lzu, fey_22.getElementMap());
    }

    @Override
    public void b(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("itemDetail", (Object)this.lzu, fey_22.getElementMap());
        byu_2.d(fey_22);
    }

    @Override
    public void c(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("itemDetail", null, fey_22.getElementMap());
    }

    private static void d(@NotNull fey_2 fey_22) {
        fhv_1 fhv_12;
        ffV ffV2;
        Object object = fse_1.gFu().i("itemDetail", fey_22.getElementMap());
        if (object instanceof ffV && (ffV2 = (ffV)object).dXg() && (fhv_12 = fey_22.getChildWithId(lzr)) instanceof fbz_2) {
            bow_0.a((fbz_2)fhv_12, ffV2.eAZ());
        }
    }
}

