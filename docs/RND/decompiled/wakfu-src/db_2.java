/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from db
 */
public final class db_2
extends GeneratedMessageV3
implements de_1 {
    private static final long jn = 0L;
    int an;
    public static final int jo = 1;
    int dL;
    public static final int jp = 2;
    int jq;
    private byte Y = (byte)-1;
    private static final db_2 jr = new db_2();
    @Deprecated
    public static final Parser<db_2> js = new dc_2();

    db_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private db_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new db_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    db_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.dL = codedInputStream.readUInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.jq = codedInputStream.readUInt32();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor oM() {
        return cw_1.jf;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return cw_1.jg.ensureFieldAccessorsInitialized(db_2.class, dd_1.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    @Override
    public boolean oO() {
        return (this.an & 2) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeUInt32(1, this.dL);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeUInt32(2, this.jq);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeUInt32Size((int)1, (int)this.dL);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeUInt32Size((int)2, (int)this.jq);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof db_2)) {
            return super.equals(object);
        }
        db_2 db_22 = (db_2)object;
        if (this.oN() != db_22.oN()) {
            return false;
        }
        if (this.oN() && this.d() != db_22.d()) {
            return false;
        }
        if (this.oO() != db_22.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != db_22.oP()) {
            return false;
        }
        return this.unknownFields.equals((Object)db_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + db_2.oM().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + this.d();
        }
        if (this.oO()) {
            n = 37 * n + 2;
            n = 53 * n + this.oP();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static db_2 U(ByteBuffer byteBuffer) {
        return (db_2)js.parseFrom(byteBuffer);
    }

    public static db_2 U(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (db_2)js.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static db_2 aC(ByteString byteString) {
        return (db_2)js.parseFrom(byteString);
    }

    public static db_2 U(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (db_2)js.parseFrom(byteString, extensionRegistryLite);
    }

    public static db_2 U(byte[] byArray) {
        return (db_2)js.parseFrom(byArray);
    }

    public static db_2 U(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (db_2)js.parseFrom(byArray, extensionRegistryLite);
    }

    public static db_2 aO(InputStream inputStream) {
        return (db_2)GeneratedMessageV3.parseWithIOException(js, (InputStream)inputStream);
    }

    public static db_2 aO(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (db_2)GeneratedMessageV3.parseWithIOException(js, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static db_2 aP(InputStream inputStream) {
        return (db_2)GeneratedMessageV3.parseDelimitedWithIOException(js, (InputStream)inputStream);
    }

    public static db_2 aP(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (db_2)GeneratedMessageV3.parseDelimitedWithIOException(js, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static db_2 U(CodedInputStream codedInputStream) {
        return (db_2)GeneratedMessageV3.parseWithIOException(js, (CodedInputStream)codedInputStream);
    }

    public static db_2 bI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (db_2)GeneratedMessageV3.parseWithIOException(js, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dd_1 oQ() {
        return db_2.oR();
    }

    public static dd_1 oR() {
        return jr.oS();
    }

    public static dd_1 b(db_2 db_22) {
        return jr.oS().d(db_22);
    }

    public dd_1 oS() {
        return this == jr ? new dd_1() : new dd_1().d(this);
    }

    protected dd_1 U(GeneratedMessageV3.BuilderParent builderParent) {
        dd_1 dd_12 = new dd_1(builderParent);
        return dd_12;
    }

    public static db_2 oT() {
        return jr;
    }

    public static Parser<db_2> z() {
        return js;
    }

    public Parser<db_2> getParserForType() {
        return js;
    }

    public db_2 oU() {
        return jr;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.U(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.oS();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.oQ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.oS();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.oQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.oU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.oU();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(db_2 db_22) {
        return db_22.unknownFields;
    }
}

