/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bYB
 */
public class byb_1
implements bye_1 {
    private static final int lzT = 250;
    private static final int lzU = 8000;
    public static final byg_1 lzV = new byg_1(250, 8000, 250);
    @NotNull
    private final bci_1 lzW;

    public byb_1(@NotNull bci_1 bci_12) {
        this.lzW = bci_12;
    }

    @Override
    @NotNull
    public byh_1 eoU() {
        return byh_1.lAx;
    }

    @Override
    @NotNull
    public String eoV() {
        return "questStartedToastDialog";
    }

    @Override
    public byf_1 eoW() {
        return byf_1.lAn;
    }

    @Override
    public byg_1 eoX() {
        return lzV;
    }

    @Override
    public void a(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("quest", (Object)this.lzW, fey_22.getElementMap());
    }

    @Override
    public void b(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("quest", (Object)this.lzW, fey_22.getElementMap());
    }

    @Override
    public void c(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("quest", null, fey_22.getElementMap());
    }
}

