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
 * Renamed from ax
 */
public final class ax_1
extends GeneratedMessageV3
implements ac_1 {
    private static final long dY = 0L;
    public static final int dZ = 1;
    int dS;
    public static final int ea = 2;
    int eb;
    public static final int ec = 3;
    ap_2 dU;
    private byte Y = (byte)-1;
    private static final ax_1 ed = new ax_1();
    static final Parser<ax_1> ee = new ay_1();

    ax_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ax_1() {
        this.eb = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ax_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ax_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.dS = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        int n2;
                        this.eb = n2 = codedInputStream.readEnum();
                        continue block13;
                    }
                    case 26: {
                        ar_2 ar_22 = null;
                        if (this.dU != null) {
                            ar_22 = this.dU.eG();
                        }
                        this.dU = (ap_2)codedInputStream.readMessage(ap_2.z(), extensionRegistryLite);
                        if (ar_22 == null) continue block13;
                        ar_22.e(this.dU);
                        this.dU = ar_22.eM();
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl = true;
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

    public static final Descriptors.Descriptor fk() {
        return ak_1.dr;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.ds.ensureFieldAccessorsInitialized(ax_1.class, az_1.class);
    }

    @Override
    public int eR() {
        return this.dS;
    }

    @Override
    public int fl() {
        return this.eb;
    }

    @Override
    public aa_2 fm() {
        aa_2 aa_22 = aa_2.A(this.eb);
        return aa_22 == null ? aa_2.el : aa_22;
    }

    @Override
    public boolean eS() {
        return this.dU != null;
    }

    @Override
    public ap_2 eT() {
        return this.dU == null ? ap_2.eH() : this.dU;
    }

    @Override
    public as_2 eU() {
        return this.eT();
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.dS != 0) {
            codedOutputStream.writeInt32(1, this.dS);
        }
        if (this.eb != aa_2.ef.getNumber()) {
            codedOutputStream.writeEnum(2, this.eb);
        }
        if (this.dU != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.eT());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.dS != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dS);
        }
        if (this.eb != aa_2.ef.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.eb);
        }
        if (this.dU != null) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.eT());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ax_1)) {
            return super.equals(object);
        }
        ax_1 ax_12 = (ax_1)object;
        if (this.eR() != ax_12.eR()) {
            return false;
        }
        if (this.eb != ax_12.eb) {
            return false;
        }
        if (this.eS() != ax_12.eS()) {
            return false;
        }
        if (this.eS() && !this.eT().equals(ax_12.eT())) {
            return false;
        }
        return this.unknownFields.equals((Object)ax_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ax_1.fk().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.eR();
        n = 37 * n + 2;
        n = 53 * n + this.eb;
        if (this.eS()) {
            n = 37 * n + 3;
            n = 53 * n + this.eT().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ax_1 p(ByteBuffer byteBuffer) {
        return (ax_1)ee.parseFrom(byteBuffer);
    }

    public static ax_1 p(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ax_1)ee.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ax_1 J(ByteString byteString) {
        return (ax_1)ee.parseFrom(byteString);
    }

    public static ax_1 p(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ax_1)ee.parseFrom(byteString, extensionRegistryLite);
    }

    public static ax_1 p(byte[] byArray) {
        return (ax_1)ee.parseFrom(byArray);
    }

    public static ax_1 p(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ax_1)ee.parseFrom(byArray, extensionRegistryLite);
    }

    public static ax_1 E(InputStream inputStream) {
        return (ax_1)GeneratedMessageV3.parseWithIOException(ee, (InputStream)inputStream);
    }

    public static ax_1 E(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ax_1)GeneratedMessageV3.parseWithIOException(ee, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ax_1 F(InputStream inputStream) {
        return (ax_1)GeneratedMessageV3.parseDelimitedWithIOException(ee, (InputStream)inputStream);
    }

    public static ax_1 F(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ax_1)GeneratedMessageV3.parseDelimitedWithIOException(ee, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ax_1 p(CodedInputStream codedInputStream) {
        return (ax_1)GeneratedMessageV3.parseWithIOException(ee, (CodedInputStream)codedInputStream);
    }

    public static ax_1 T(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ax_1)GeneratedMessageV3.parseWithIOException(ee, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public az_1 fn() {
        return ax_1.fo();
    }

    public static az_1 fo() {
        return ed.fp();
    }

    public static az_1 c(ax_1 ax_12) {
        return ed.fp().e(ax_12);
    }

    public az_1 fp() {
        return this == ed ? new az_1() : new az_1().e(this);
    }

    protected az_1 p(GeneratedMessageV3.BuilderParent builderParent) {
        az_1 az_12 = new az_1(builderParent);
        return az_12;
    }

    public static ax_1 fq() {
        return ed;
    }

    public static Parser<ax_1> z() {
        return ee;
    }

    public Parser<ax_1> getParserForType() {
        return ee;
    }

    public ax_1 fr() {
        return ed;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.p(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.fp();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.fn();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.fp();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.fn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.fr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.fr();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(ax_1 ax_12) {
        return ax_12.unknownFields;
    }
}

