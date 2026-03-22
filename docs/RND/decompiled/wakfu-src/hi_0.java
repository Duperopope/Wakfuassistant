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
 * Renamed from hI
 */
class hi_0
extends AbstractParser<hh_0> {
    hi_0() {
    }

    public hh_0 eA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new hh_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eA(codedInputStream, extensionRegistryLite);
    }
}

