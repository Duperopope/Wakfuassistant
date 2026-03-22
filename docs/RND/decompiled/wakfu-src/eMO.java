/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Optional;

public class eMO {
    public static final eMO qNB = new eMO();
    private final HashMap<Bu<Integer, Short>, Bu<Integer, Integer>> qNC = new HashMap();
    public static final int qND = 1;
    public static final int qNE = 2;
    public static final int qNF = 3;

    private eMO() {
    }

    public void a(int n, short s, int n2, int n3) {
        Bu<Integer, Short> bu = new Bu<Integer, Short>(n, s);
        Bu<Integer, Integer> bu2 = new Bu<Integer, Integer>(n2, n3);
        this.qNC.put(bu, bu2);
    }

    public Optional<Bu<Integer, Integer>> y(int n, short s) {
        return Optional.ofNullable(this.qNC.get(new Bu<Integer, Short>(n, s)));
    }
}

