/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.ScheduledReporter
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Provides
 *  com.google.inject.Singleton
 */
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.google.common.collect.ImmutableList;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import java.util.List;

/*
 * Renamed from Hy
 */
public class hy_2
extends AbstractModule {
    protected void configure() {
    }

    @FT
    public static List<Module> aPa() {
        return ImmutableList.of((Object)((Object)new hx_2()));
    }

    @Provides
    @Singleton
    protected static ScheduledReporter a(MetricRegistry metricRegistry) {
        return new hz_2(metricRegistry);
    }
}

