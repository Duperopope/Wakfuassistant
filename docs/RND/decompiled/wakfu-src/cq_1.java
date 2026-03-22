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
 * Renamed from cq
 */
class cq_1
extends AbstractParser<cp_2> {
    cq_1() {
    }

    public cp_2 bl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cp_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bl(codedInputStream, extensionRegistryLite);
    }
}

