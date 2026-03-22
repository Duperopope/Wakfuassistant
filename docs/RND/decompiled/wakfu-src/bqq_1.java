/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqq
 */
public class bqq_1
implements aeh_2 {
    public static final String iZA = "itemName";
    public static final String iZB = "quests";
    public static final String iZC = "achievements";
    public static final String[] iZD = new String[]{"itemName", "quests", "achievements"};
    private final int iZE;
    private final List<bci_1> iZF = new ArrayList<bci_1>();
    private final List<bci_1> iZG = new ArrayList<bci_1>();

    public bqq_1(int n) {
        this.iZE = n;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        for (bbu_2 bbu_22 : bcb_1.hDb.AP(n)) {
            bci_1 bci_12 = bcm_1.hIK.t(bgt_02.Sn(), bbu_22.d());
            if (bci_12 == null) continue;
            (bbu_22.dax() ? this.iZF : this.iZG).add(bci_12);
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iZA -> bgv_2.Dm(this.iZE);
            case iZB -> {
                if (this.iZF.isEmpty()) {
                    yield null;
                }
                yield this.iZF;
            }
            case iZC -> {
                if (this.iZG.isEmpty()) {
                    yield null;
                }
                yield this.iZG;
            }
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return iZD;
    }
}

