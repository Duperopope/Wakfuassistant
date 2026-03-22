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
 * Renamed from fK
 */
class fk_2
extends AbstractParser<fj_2> {
    fk_2() {
    }

    public fj_2 ds(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new fj_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ds(codedInputStream, extensionRegistryLite);
    }
}

