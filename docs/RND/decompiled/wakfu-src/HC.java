/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Function;
import com.google.common.base.Predicate;

final class HC {
    private HC() {
    }

    static Predicate<kh_1> a(JI ... jIArray) {
        return new HD(jIArray);
    }

    static Function<kh_1, JH> aPd() {
        return new HE();
    }

    static Function<JH, Iterable<kh_1>> aPe() {
        return new HF();
    }

    static <T extends ki_1> Function<kh_1, T> aPf() {
        return new HG();
    }
}

