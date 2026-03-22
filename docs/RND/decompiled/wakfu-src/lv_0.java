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
 * Renamed from lv
 */
class lv_0
extends AbstractParser<lu_1> {
    lv_0() {
    }

    public lu_1 hi(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new lu_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hi(codedInputStream, extensionRegistryLite);
    }
}

