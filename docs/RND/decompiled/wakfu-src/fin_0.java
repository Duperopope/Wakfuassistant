/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from fin
 */
public class fin_0 {
    public static final fin_0 srJ = new fin_0();
    public static final int srK = 1;
    public static final int srL = 2;
    private final TIntObjectHashMap<fim_0> srM = new TIntObjectHashMap();

    public fin_0() {
        this.srM.put(1, (Object)new fim_0(1));
        this.srM.put(2, (Object)new fim_0(2));
    }

    public void a(fim_0 fim_02) {
        this.srM.put(fim_02.d(), (Object)fim_02);
    }

    public fim_0 VL(int n) {
        return (fim_0)this.srM.get(n);
    }

    public boolean tX(int n) {
        return this.srM.contains(n);
    }

    public String toString() {
        return "PetDefinitionManager{m_definitions=" + this.srM.size() + "}";
    }
}

