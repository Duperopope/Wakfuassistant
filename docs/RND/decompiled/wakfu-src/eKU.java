/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public class eKU
extends eKR {
    public static final eKV qED = new eKV(-1, 0);
    public static final byte qEE = -1;

    public eKU(int n, short s) {
        super(-1, n, s, 10000L, 100, null, null, false, null, eKV.qEF, 0, null);
    }

    @Override
    public byte aFW() {
        return -1;
    }

    @Override
    public void a(eKS eKS2) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public void e(Collection<eKS> collection) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public void b(eKS eKS2) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public void g(Collection<eKS> collection) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public double dU(short s) {
        return 1.0;
    }

    @Override
    public long a(short s, eve_2 eve_22) {
        return 0L;
    }

    @Override
    public eKV fyZ() {
        return qED;
    }

    public void u(int n, short s) {
        this.qEs.put(n, new Bu<Short, Short>(s, (short)-1));
    }
}

