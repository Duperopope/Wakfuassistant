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
 * Renamed from bv
 */
class bv_1
extends AbstractParser<bu_2> {
    bv_1() {
    }

    public bu_2 aB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bu_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aB(codedInputStream, extensionRegistryLite);
    }
}

