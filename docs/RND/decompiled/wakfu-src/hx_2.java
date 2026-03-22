/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.MetricRegistry
 *  com.google.inject.AbstractModule
 *  com.google.inject.Scopes
 */
import com.codahale.metrics.MetricRegistry;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

/*
 * Renamed from Hx
 */
public class hx_2
extends AbstractModule {
    hx_2() {
    }

    protected void configure() {
        this.bind(MetricRegistry.class).in(Scopes.SINGLETON);
        this.bind(gg_2.class).in(Scopes.SINGLETON);
    }
}

