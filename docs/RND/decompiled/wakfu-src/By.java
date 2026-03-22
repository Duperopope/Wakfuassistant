/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class By
implements Collector<String, StringBuilder, String> {
    public static final String auJ = "%n * %s";
    private final String auK;
    protected static final Map<String, By> auL = new HashMap<String, By>();

    public static By aHQ() {
        return By.aL(auJ);
    }

    public static By aL(String string) {
        if (auL.containsKey(string)) {
            return auL.get(string);
        }
        By by = new By(string);
        auL.put(string, by);
        return by;
    }

    protected By(String string) {
        this.auK = string;
    }

    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, String> accumulator() {
        return (stringBuilder, string) -> stringBuilder.append(String.format(this.auK, string));
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (stringBuilder, stringBuilder2) -> {
            stringBuilder.append(stringBuilder2.toString());
            return stringBuilder;
        };
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return StringBuilder::toString;
    }

    @Override
    public Set<Collector.Characteristics> characteristics() {
        return Collections.emptySet();
    }
}

