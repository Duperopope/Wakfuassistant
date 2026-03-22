/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPw
 */
public abstract class bpw_1<Type, CategoryId>
implements aeh_2,
aen_2 {
    public static final String kQB = "name";
    public static final String kQC = "description";
    public static final String kQD = "iconUrl";
    public static final String kQE = "article";
    public static final String kQF = "hasCategory";
    public static final String kQG = "hasLink";
    private final String kQH;
    private final String kQI;
    private final String kQJ;
    private final Type kQK;
    private final ArrayList<bPh> kQL;
    private final bpt_1<?, ?> kQM;
    private final CategoryId kQN;
    private static final int kQO = 50;
    private static final int kQP = 100;
    private aem_2 kQe;

    protected bpw_1(String string, String string2, String string3, Type Type2, ArrayList<bPh> arrayList, bpt_1<?, ?> bpt_12, CategoryId CategoryId) {
        this.kQH = string;
        this.kQI = string2;
        this.kQJ = string3;
        this.kQK = Type2;
        this.kQL = arrayList;
        this.kQM = bpt_12;
        this.kQN = CategoryId;
        this.eio();
    }

    public String getName() {
        return this.kQH;
    }

    public String eiy() {
        return this.kQJ;
    }

    public CategoryId eiz() {
        return this.kQN;
    }

    public Type ehV() {
        return this.kQK;
    }

    protected aem_2 eiA() {
        return this.kQe;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kQB)) {
            if (this.kQH == null) {
                return null;
            }
            if (this.kQH.length() > 50) {
                return this.kQH.substring(0, 47) + "...";
            }
            return this.kQH;
        }
        if (string.equals(kQC)) {
            if (this.kQI == null) {
                return null;
            }
            if (this.kQI.length() > 100) {
                return this.kQI.substring(0, 97) + "...";
            }
            return this.kQI;
        }
        if (string.equals(kQD)) {
            return this.kQe == null ? null : this.kQe.bZo();
        }
        if (string.equals(kQE)) {
            if (this.kQM != null) {
                return this.kQM;
            }
            return null;
        }
        if (string.equals(kQF)) {
            return this.aEc();
        }
        if (string.equals(kQG)) {
            return this.eiB();
        }
        return null;
    }

    public boolean aEc() {
        return this.kQN != null;
    }

    public boolean eiB() {
        return this.kQJ != null;
    }

    private void eio() {
        if (this.kQL == null) {
            return;
        }
        bPh bPh2 = bPj.a(this.kQL, 667, 240, bPp.kOZ);
        if (bPh2 != null) {
            this.kQe = bPj.a(bPh2, this, kQD);
        }
    }

    @Override
    public void F(String string, String string2) {
        fse_1.gFu().a((aef_2)this, string);
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{, m_name='" + this.kQH + "', m_link='" + this.kQJ + "', m_type='" + String.valueOf(this.kQK) + "', m_iconUrl=" + String.valueOf(this.kQe) + "}";
    }
}

