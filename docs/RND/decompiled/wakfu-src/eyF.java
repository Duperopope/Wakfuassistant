/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class eyF
extends eyD {
    private final List<eyD> pjY = new ArrayList<eyD>();

    eyF(HashMap<Byte, Float> hashMap) {
        for (Map.Entry<Byte, Float> entry : hashMap.entrySet()) {
            Byte by = entry.getKey();
            this.pjY.add(new eyc_0(by, entry.getValue().floatValue()));
        }
    }

    @Override
    protected void a(exa_1<exf_2> exa_12, short s, short s2) {
        for (eyD eyD2 : this.pjY) {
            eyD2.a(exa_12, s, s2);
        }
    }

    @Override
    public void a(Map<exx_2, Integer> map, short s, short s2) {
        for (eyD eyD2 : this.pjY) {
            eyD2.a(map, s, s2);
        }
    }

    @Override
    public int a(exx_2 exx_22, short s, short s2) {
        int n = 0;
        for (eyD eyD2 : this.pjY) {
            n += eyD2.a(exx_22, s, s2);
        }
        return n;
    }
}

