/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from for
 */
public class for_0
extends fop_0 {
    private final sm_0 sLv;

    public for_0(int n, int n2, int n3, long l, long l2, byte by, short s, short s2, @NotNull sm_0 sm_02) {
        super(n, n2, n3, l, l2, by, s, s2);
        this.sLv = sm_02;
    }

    public sm_0 gfy() {
        return this.sLv;
    }

    @Override
    public boolean gfz() {
        return true;
    }

    public String toString() {
        return "MountDefinition{m_mountType=" + String.valueOf(this.sLv) + ", m_id=" + this.sLh + ", m_gfxId='" + this.sLi + "', m_health=" + this.sLj + ", m_xpPerLevel=" + this.sLk + ", m_maxLevel=" + this.sLl + ", m_healItemRefIds=" + String.valueOf(this.sLm) + ", m_petDefinitionMeal=" + String.valueOf(this.sLn) + "}";
    }
}

