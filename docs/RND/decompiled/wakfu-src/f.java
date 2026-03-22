/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class f {
    @SerializedName(value="rights")
    private final List<e> A;
    @SerializedName(value="groups")
    private final List<c> B;

    public f(List<e> list, List<c> list2) {
        this.A = list;
        this.B = list2;
    }

    public List<e> h() {
        return this.A;
    }

    public List<c> i() {
        return this.B;
    }

    public String toString() {
        return "WISERights{m_rights=" + String.valueOf(this.A) + ", m_groups=" + String.valueOf(this.B) + "}";
    }
}

