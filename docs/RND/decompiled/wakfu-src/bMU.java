/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bMU
extends bMT {
    private static final Comparator<bmx_0> kzZ = Comparator.comparingInt(bmx_02 -> ((bmt_0)bmx_02.giP()).cvD());
    private final List<bmx_0> kAa = new ArrayList<bmx_0>();
    private final List<bmx_0> kAb = new ArrayList<bmx_0>();

    public void k(bhx_0 bhx_02) {
        bMm bMm2 = bhx_02.doH();
        bMm2.a(bhx_02.doQ().dry(), bhx_02.cmL(), bhx_02);
        for (bmx_0 bmx_02 : bMm2.dkJ()) {
            if (((bmt_0)bmx_02.giP()).eeY()) {
                this.kAb.add(bmx_02);
                continue;
            }
            this.kAa.add(bmx_02);
        }
        this.kAa.sort(kzZ);
        this.kAb.sort(kzZ);
    }

    @Override
    protected @Unmodifiable List<Integer> dfY() {
        return this.kAa.stream().map(fqE::axA).toList();
    }

    @Override
    protected @Unmodifiable List<Integer> dfZ() {
        return this.kAb.stream().map(fqE::axA).toList();
    }

    @Override
    @Nullable
    protected bmx_0 Ih(int n) {
        for (bmx_0 bmx_02 : this.kAa) {
            if (bmx_02.axA() != n) continue;
            return bmx_02;
        }
        for (bmx_0 bmx_02 : this.kAb) {
            if (bmx_02.axA() != n) continue;
            return bmx_02;
        }
        return null;
    }
}

