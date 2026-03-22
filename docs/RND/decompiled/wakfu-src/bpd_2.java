/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bPD
 */
public class bpd_2
extends bpw_1<String, Integer> {
    private final int kSj;
    private final String kSk;

    public bpd_2(int n, String string, String string2, String string3, String string4, String string5, ArrayList<bPh> arrayList, bpt_1<?, ?> bpt_12, Integer n2) {
        super(string, string2, string3, string4, arrayList, bpt_12, n2);
        this.kSj = n;
        this.kSk = string5;
    }

    public int d() {
        return this.kSj;
    }

    public String eiI() {
        return this.kSk;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{m_id=" + this.kSj + ", m_name='" + this.getName() + "', m_link='" + this.eiy() + "', m_type='" + (String)this.ehV() + "', m_mode='" + this.kSk + "', m_iconUrl=" + String.valueOf(this.eiA()) + "}";
    }
}

