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
 * Renamed from jQ
 */
class jq_2
extends AbstractParser<jp_2> {
    jq_2() {
    }

    public jp_2 ga(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jp_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ga(codedInputStream, extensionRegistryLite);
    }
}

