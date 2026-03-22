/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fiN {
    private final ArrayList<fhv> ssZ = new ArrayList();
    private short euL;

    public fiN a(fhv fhv2) {
        if (!this.ssZ.contains(fhv2)) {
            this.ssZ.add(fhv2);
        }
        return this;
    }

    public fiN b(fhw fhw2) {
        int n = fhw2.aVo();
        for (int i = 0; i < n; ++i) {
            this.a(fhw2.Vl(i));
        }
        return this;
    }

    public fiN bd(List<? extends fhv> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            this.a(list.get(i));
        }
        return this;
    }

    public short cyv() {
        return this.euL;
    }

    public void fi(short s) {
        this.euL = s;
    }

    List<fhv> fXW() {
        return Collections.unmodifiableList(this.ssZ);
    }

    public fhw gae() {
        return new fiM(this);
    }

    public String toString() {
        return "LootListDefinitionBuilder{m_loots=" + this.ssZ.size() + "}";
    }
}

