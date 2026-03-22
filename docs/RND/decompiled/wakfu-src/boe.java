/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class boe {
    private boe() {
    }

    @NotNull
    public static String a(fic_0 fic_02, int n) {
        fia_0 fia_02 = fic_02.dmD();
        ahv_2 ahv_22 = new ahv_2();
        if (fia_02.VT(n)) {
            fif_0 fif_02 = fia_02.VQ(n);
            ahv_22.c(aum_0.cWf().c("dungeon.unlockDate", new Object[0])).c(aum_0.cWf().v(fif_02.fZQ()));
        } else if (fia_02.VR(n)) {
            ux_0 ux_02 = fia_02.VU(n);
            ahv_22.c(aum_0.cWf().c("dungeon.lockedUntil", new Object[0])).c(aum_0.cWf().v(ux_02));
        } else if (fia_02.VV(n) != 0) {
            fif_0 fif_03 = fia_02.VQ(n);
            int n2 = fif_03.cqm() - fia_02.VV(n);
            ux_0 ux_03 = fia_02.VU(n);
            String string = aum_0.cWf().v(ux_03);
            ahv_22.c(aum_0.cWf().c("dungeon.remainingTriesBefore", n2, string));
        }
        if (fia_02.VP(-1) && !fia_0.VN(n)) {
            boe.a(fia_02, ahv_22);
        }
        return ahv_22.ceL();
    }

    private static void a(fia_0 fia_02, ahv_2 ahv_22) {
        int n = -1;
        if (fia_02.VR(-1)) {
            if (ahv_22.bXe() != 0) {
                ahv_22.ceH();
            }
            ahv_22.c(aum_0.cWf().c("dungeon.daily.locked", new Object[0]));
        } else if (fia_02.VV(-1) != 0) {
            fif_0 fif_02 = fia_02.VQ(-1);
            int n2 = fif_02.cqm() - fia_02.VV(-1);
            if (ahv_22.bXe() != 0) {
                ahv_22.ceH();
            }
            ahv_22.c(aum_0.cWf().c("dungeon.daily.remainingTries", n2));
        } else {
            int n3 = 3;
            if (ahv_22.bXe() != 0) {
                ahv_22.ceH();
            }
            ahv_22.c(aum_0.cWf().c("dungeon.daily.remainingTries", 3));
        }
    }
}

