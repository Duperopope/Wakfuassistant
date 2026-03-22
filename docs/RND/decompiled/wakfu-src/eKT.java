/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

public class eKT
extends eKR {
    public static final eKV qEA = new eKV(-2, 0);
    public static final byte qEB = -2;
    private final eKR qEC;

    public eKT(eKR eKR2, int n, short s) {
        super(-2, n, s, eKR2.fyY(), eKR2.cuj(), eKR2.bdo(), null, eKR2.cui(), EnumSet.noneOf(eKS.class), eKV.qEF, eKR2.cuo(), null);
        this.qEC = eKR2;
    }

    @Override
    public int d() {
        return this.qEC.d();
    }

    @Override
    public byte aFW() {
        return -2;
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
        return qEA;
    }

    @Override
    public Iterator<Map.Entry<Integer, Bu<Short, Short>>> fza() {
        return this.qEC.fza();
    }

    @Override
    public String toString() {
        return "FailingSecretCraftRecipe{m_secretRecipe=" + String.valueOf(this.qEC) + "}";
    }
}

