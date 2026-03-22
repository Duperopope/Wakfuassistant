/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from evk
 */
public class evk_2 {
    @SerializedName(value="account")
    private final long osT;
    @SerializedName(value="name")
    private final String osU;
    @SerializedName(value="rights")
    private final List<evt_2> osV = new ArrayList<evt_2>();
    @SerializedName(value="wise_rights")
    private f osW;

    public evk_2(long l, String string) {
        this.osT = l;
        this.osU = string;
    }

    public boolean a(evt_2 evt_22) {
        try {
            boolean bl = this.osV.add(evt_22);
            return bl;
        }
        finally {
            this.osV.sort(evq_2.ovJ);
        }
    }

    public f fea() {
        return this.osW;
    }

    public void a(f f2) {
        this.osW = f2;
    }

    public long xl() {
        return this.osT;
    }

    public String feb() {
        return this.osU;
    }

    public List<evt_2> h() {
        return Collections.unmodifiableList(this.osV);
    }

    public Optional<evt_2> On(int n) {
        for (evt_2 evt_22 : this.osV) {
            if (evt_22.vY() != n) continue;
            return Optional.of(evt_22);
        }
        return Optional.empty();
    }

    public String toString() {
        return "Admin{m_accountId=" + this.osT + ", m_adminName='" + this.osU + "', m_rights=" + String.valueOf(this.osV) + "}";
    }
}

