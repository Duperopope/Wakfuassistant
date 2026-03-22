/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bYr
 */
public class byr_2
implements bye_1 {
    private final @Unmodifiable @NotNull List<bys_2> lzf;

    public byr_2(@NotNull List<bci_1> list) {
        this.lzf = list.stream().map(bys_2::new).toList();
    }

    @Override
    @NotNull
    public byh_1 eoU() {
        return byh_1.lAE;
    }

    @Override
    @NotNull
    public String eoV() {
        return "achievementCompleteToastDialog";
    }

    @Override
    public byf_1 eoW() {
        return byf_1.lAn;
    }

    @Override
    public byg_1 eoX() {
        return byb_1.lzV;
    }

    @Override
    public void a(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("completeAchievements", this.lzf, fey_22.getElementMap());
    }

    @Override
    public void b(@NotNull fey_2 fey_22) {
        this.a(fey_22);
    }

    @Override
    public void c(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("completeAchievements", null, fey_22.getElementMap());
    }
}

