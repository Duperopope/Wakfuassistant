/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from kt
 */
class kt_0
extends AbstractParser<ks_0> {
    kt_0() {
    }

    public ks_0 gv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ks_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gv(codedInputStream, extensionRegistryLite);
    }
}

