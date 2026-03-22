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
 * Renamed from cG
 */
class cg_2
extends AbstractParser<cf_1> {
    cg_2() {
    }

    public cf_1 bx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cf_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bx(codedInputStream, extensionRegistryLite);
    }
}

