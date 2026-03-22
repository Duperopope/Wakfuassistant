/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.index.qual.Positive
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGT
 */
public class bgt_2
implements aeh_2 {
    public static final String jWC = "items";
    public static final String jWD = "itemAmountText";
    private final List<bgs_2> jWE = new ArrayList<bgs_2>(50);
    private final Map<Integer, bgr_2> jWF = new HashMap<Integer, bgr_2>();
    public static bgt_2 jWG = new bgt_2();

    private bgt_2() {
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "items": {
                return this.jWE;
            }
            case "itemAmountText": {
                return this.jWF.size() + "/50";
            }
        }
        return null;
    }

    private void dUo() {
        while (this.jWE.size() < 50) {
            this.jWE.add(null);
        }
        while (this.jWE.size() > 50 && this.jWE.contains(null)) {
            this.jWE.remove(null);
        }
        this.jWE.sort((bgs_22, bgs_23) -> {
            if (bgs_22 == null) {
                return bgs_23 == null ? 0 : 1;
            }
            if (bgs_23 == null) {
                return -1;
            }
            if (bgs_22.bfb() && !bgs_23.bfb()) {
                return 1;
            }
            if (!bgs_22.bfb() && bgs_23.bfb()) {
                return -1;
            }
            int n = fgj.fWS().compare(bgs_22.dwg(), bgs_23.dwg());
            if (n != 0) {
                return n;
            }
            return Integer.signum(bgs_23.cmL() - bgs_22.cmL());
        });
        fse_1.gFu().a((aef_2)this, jWC, jWD);
    }

    public boolean g(int n, short s) {
        return Optional.ofNullable(this.jWF.get(n)).map(bgr_22 -> bgr_22.oP() >= s).orElse(false);
    }

    public int dUp() {
        return this.jWF.size();
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    public void Y(List<bgr_2> list) {
        this.jWF.clear();
        list.forEach(bgr_22 -> this.jWF.put(bgr_22.avr(), (bgr_2)bgr_22));
        this.jWE.clear();
        this.jWF.forEach((n, bgr_22) -> this.jWE.addAll(bgq_2.a(bgr_22)));
        this.dUo();
    }

    public void y(Collection<bgr_2> collection) {
        collection.forEach(this::c);
        this.dUo();
    }

    public void b(bgr_2 bgr_22) {
        this.c(bgr_22);
        this.dUo();
    }

    private void c(bgr_2 bgr_22) {
        if (bgr_22 == null) {
            return;
        }
        int n = bgr_22.avr();
        if (this.jWF.containsKey(n)) {
            bgr_2 bgr_23 = this.jWF.get(n);
            int n2 = bgr_23.oP();
            int n3 = n2 + bgr_22.oP();
            bgr_23.Fq(n3);
            bgr_23.bl(bgr_22.bfb());
        } else {
            this.jWF.put(n, bgr_22);
        }
        this.jWE.removeIf(bgs_22 -> bgs_22 != null && bgs_22.avr() == n);
        this.jWE.addAll(bgq_2.a(this.jWF.get(n)));
    }

    public void dH(int n, @Positive int n2) {
        this.b(n, n2);
        this.dUo();
    }

    public void y(Map<Integer, Integer> map) {
        map.forEach(this::b);
        this.dUo();
    }

    public void GD(int n) {
        if (!this.jWF.containsKey(n)) {
            return;
        }
        this.jWF.remove(n);
        this.jWE.removeIf(bgs_22 -> bgs_22 != null && bgs_22.avr() == n);
        this.dUo();
    }

    public void GE(int n) {
        if (!this.jWF.containsKey(n)) {
            return;
        }
        this.jWF.get(n).bl(true);
        this.jWE.stream().filter(Objects::nonNull).filter(bgs_22 -> bgs_22.avr() == n).forEach(bgs_22 -> bgs_22.bl(true));
        this.dUo();
    }

    public void GF(int n) {
        if (!this.jWF.containsKey(n)) {
            return;
        }
        this.jWF.get(n).bl(false);
        this.jWE.stream().filter(Objects::nonNull).filter(bgs_22 -> bgs_22.avr() == n).forEach(bgs_22 -> bgs_22.bl(false));
        this.dUo();
    }

    public void dUq() {
        this.jWF.values().forEach(bgr_22 -> bgr_22.bl(false));
        this.jWE.stream().filter(Objects::nonNull).forEach(bgs_22 -> bgs_22.bl(false));
        this.dUo();
    }

    public void clear() {
        this.jWF.clear();
        this.jWE.clear();
        this.dUo();
    }

    private void b(Integer n, Integer n2) {
        if (!this.jWF.containsKey(n)) {
            return;
        }
        bgr_2 bgr_22 = this.jWF.get(n);
        int n3 = bgr_22.oP();
        if (n3 <= n2) {
            this.GD(n);
            return;
        }
        int n4 = n3 - n2;
        bgr_22.Fq(n4);
        this.jWE.removeIf(bgs_22 -> bgs_22 != null && bgs_22.avr() == n.intValue());
        this.jWE.addAll(bgq_2.a(this.jWF.get(n)));
    }
}

