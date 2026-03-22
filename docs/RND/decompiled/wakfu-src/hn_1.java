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
 * Renamed from hn
 */
class hn_1
extends AbstractParser<hm_1> {
    hn_1() {
    }

    public hm_1 eo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new hm_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eo(codedInputStream, extensionRegistryLite);
    }
}

