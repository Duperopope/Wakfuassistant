/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class eHL {
    private final Map<Integer, Short> qtd = new HashMap<Integer, Short>();

    public short m(int n, short s) {
        short s2 = (short)(this.qtd.getOrDefault(n, (short)0) + s);
        this.qtd.put(n, s2);
        return s2;
    }

    public short n(int n, short s) {
        short s2 = this.qtd.get(n);
        short s3 = (short)Math.max(s2 - s, 0);
        this.qtd.put(n, s3);
        return s3;
    }

    public void b(Integer n, Short s) {
        this.qtd.put(n, s);
    }

    public Map<Integer, Short> fvX() {
        return this.qtd;
    }

    public short PE(int n) {
        return this.qtd.getOrDefault(n, (short)0);
    }

    public void f(BiConsumer<Integer, Short> biConsumer) {
        this.qtd.forEach(biConsumer);
    }

    public void clear() {
        this.qtd.clear();
    }

    public boolean a(eHL eHL2) {
        if (this.qtd.size() != eHL2.qtd.size()) {
            return true;
        }
        for (int n : this.qtd.keySet()) {
            if (eHL2.PE(n) == this.qtd.get(n).shortValue()) continue;
            return true;
        }
        return false;
    }

    public void b(eHL eHL2) {
        eHL2.D(this.fvX());
    }

    private void D(Map<Integer, Short> map) {
        this.qtd.clear();
        this.qtd.putAll(map);
    }

    public String toString() {
        return "AptitudeCategoryPoints{m_pointsByCategory=" + String.valueOf(this.qtd) + "}";
    }
}

