/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class Cr {
    private int awP = -1;
    private Cq[] awU;

    public void a(Cq ... cqArray) {
        this.awU = (Cq[])cqArray.clone();
        this.awP = cqArray.length == 0 ? -1 : ((Cq)Ordering.natural().onResultOf(Cr.aIu()).nullsFirst().max(Arrays.asList(this.awU))).aIn();
    }

    public int aIn() {
        return this.awP;
    }

    public List<Cq> aIt() {
        return Collections.unmodifiableList(Arrays.asList(this.awU));
    }

    @NotNull
    private static Function<Cq, Integer> aIu() {
        return new Cs();
    }
}

