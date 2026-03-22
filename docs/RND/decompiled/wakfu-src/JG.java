/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JG {
    private final List<kh_1> aKC = new ArrayList<kh_1>();

    public void e(kh_1 kh_12) {
        this.aKC.add(kh_12);
    }

    public List<kh_1> aPl() {
        return Collections.unmodifiableList(this.aKC);
    }

    public String toString() {
        return "EpsTags{" + String.valueOf(this.aKC) + "}";
    }
}

