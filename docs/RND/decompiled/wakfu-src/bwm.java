/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bwm
implements aeh_2 {
    public static final String jwZ = "nameFilter";
    public static final String jxa = "hasFilterOtherThanName";
    public static final String jxb = "levelFilterType";
    public static final String jxc = "rarities";
    public static final String[] jxd = new String[]{"nameFilter", "hasFilterOtherThanName", "levelFilterType", "rarities"};
    private static final int jxe = 0;
    private static final int jxf = 1;
    private static final int jxg = 2;
    private final @Unmodifiable List<bug_0<ffV>> jxh;
    private final @Unmodifiable List<bil_1> jxi = bil_1.a(new fgj[0]);

    bwm(@Unmodifiable List<bug_0<ffV>> list) {
        this.jxh = list;
        this.dLH();
    }

    private void dLH() {
        Optional optional = this.b(buh_0.jov);
        if (optional.isEmpty()) {
            return;
        }
        Set<fgj> set = ((bEp)optional.get()).dCk();
        if (set.isEmpty()) {
            return;
        }
        this.jxi.forEach(bil_12 -> bil_12.setSelected(set.contains(bil_12.dxF())));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "nameFilter": {
                Optional<bEn> optional = this.b(buh_0.jot);
                return optional.map(buj_0::dIR).orElse(null);
            }
            case "hasFilterOtherThanName": {
                for (bug_0<ffV> bug_02 : this.jxh) {
                    if (bug_02.dcz() == buh_0.jot) continue;
                    return true;
                }
                return false;
            }
            case "levelFilterType": {
                Optional optional = this.b(buh_0.jou);
                if (optional.isEmpty()) {
                    return 0;
                }
                return ((bww)optional.get()).dMw() ? 1 : 2;
            }
            case "rarities": {
                return this.jxi;
            }
        }
        return null;
    }

    private <T extends bug_0<ffV>> Optional<T> b(buh_0 buh_02) {
        for (bug_0<ffV> bug_02 : this.jxh) {
            if (bug_02.dcz() != buh_02) continue;
            return Optional.of(bug_02);
        }
        return Optional.empty();
    }

    @Override
    public String[] bxk() {
        return jxd;
    }
}

