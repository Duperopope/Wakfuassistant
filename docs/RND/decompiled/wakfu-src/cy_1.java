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
 * Renamed from cY
 */
class cy_1
extends AbstractParser<cx_1> {
    cy_1() {
    }

    public cx_1 bG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cx_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bG(codedInputStream, extensionRegistryLite);
    }
}

