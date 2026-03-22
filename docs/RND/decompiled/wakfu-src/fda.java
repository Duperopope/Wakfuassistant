/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class fda {
    public static final List<abi_1> rUP = List.of(abi_1.dzk, abi_1.dzm);

    private fda() {
    }

    public static abi_1 p(abi_1 abi_12) {
        int n = abi_12.wp();
        if (n < abi_1.dzk.wp() || n >= abi_1.dzm.wp()) {
            return abi_1.dzk;
        }
        return abi_1.dzm;
    }

    public static abi_1 q(abi_1 abi_12) {
        if (rUP.contains(abi_12)) {
            return abi_12;
        }
        if (abi_12 == abi_1.dzo) {
            return abi_1.dzk;
        }
        return abi_1.dzm;
    }
}

