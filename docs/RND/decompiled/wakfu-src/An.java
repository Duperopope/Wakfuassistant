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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class An
extends GeneratedMessageV3
implements Aq {
    private static final long aqm = 0L;
    int an;
    public static final int aqn = 1;
    long Dj;
    public static final int aqo = 2;
    an_0 aqp;
    private byte Y = (byte)-1;
    private static final An aqq = new An();
    @Deprecated
    public static final Parser<An> aqr = new ao_0();

    An(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private An() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new An();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    An(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.Dj = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        AP aP = null;
                        if ((this.an & 2) != 0) {
                            aP = this.aqp.aEP();
                        }
                        this.aqp = (an_0)codedInputStream.readMessage(an_0.aro, extensionRegistryLite);
                        if (aP != null) {
                            aP.e(this.aqp);
                            this.aqp = aP.aEV();
                        }
                        this.an |= 2;
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

    public static final Descriptors.Descriptor aCy() {
        return zS.apl;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apm.ensureFieldAccessorsInitialized(An.class, ap_0.class);
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    @Override
    public boolean aBk() {
        return (this.an & 2) != 0;
    }

    @Override
    public an_0 aCz() {
        return this.aqp == null ? an_0.aEQ() : this.aqp;
    }

    @Override
    public AW aCA() {
        return this.aqp == null ? an_0.aEQ() : this.aqp;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Xh()) {
            this.Y = 0;
            return false;
        }
        if (!this.aBk()) {
            this.Y = 0;
            return false;
        }
        if (!this.aCz().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.Dj);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aCz());
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.Dj);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aCz());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof An)) {
            return super.equals(object);
        }
        An an = (An)object;
        if (this.Xh() != an.Xh()) {
            return false;
        }
        if (this.Xh() && this.Xi() != an.Xi()) {
            return false;
        }
        if (this.aBk() != an.aBk()) {
            return false;
        }
        if (this.aBk() && !this.aCz().equals(an.aCz())) {
            return false;
        }
        return this.unknownFields.equals((Object)an.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + An.aCy().hashCode();
        if (this.Xh()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Xi());
        }
        if (this.aBk()) {
            n = 37 * n + 2;
            n = 53 * n + this.aCz().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static An ev(ByteBuffer byteBuffer) {
        return (An)aqr.parseFrom(byteBuffer);
    }

    public static An cJ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (An)aqr.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static An el(ByteString byteString) {
        return (An)aqr.parseFrom(byteString);
    }

    public static An cJ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (An)aqr.parseFrom(byteString, extensionRegistryLite);
    }

    public static An cL(byte[] byArray) {
        return (An)aqr.parseFrom(byArray);
    }

    public static An cJ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (An)aqr.parseFrom(byArray, extensionRegistryLite);
    }

    public static An gs(InputStream inputStream) {
        return (An)GeneratedMessageV3.parseWithIOException(aqr, (InputStream)inputStream);
    }

    public static An gs(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (An)GeneratedMessageV3.parseWithIOException(aqr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static An gt(InputStream inputStream) {
        return (An)GeneratedMessageV3.parseDelimitedWithIOException(aqr, (InputStream)inputStream);
    }

    public static An gt(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (An)GeneratedMessageV3.parseDelimitedWithIOException(aqr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static An cJ(CodedInputStream codedInputStream) {
        return (An)GeneratedMessageV3.parseWithIOException(aqr, (CodedInputStream)codedInputStream);
    }

    public static An kb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (An)GeneratedMessageV3.parseWithIOException(aqr, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ap_0 aCB() {
        return An.aCC();
    }

    public static ap_0 aCC() {
        return aqq.aCD();
    }

    public static ap_0 a(An an) {
        return aqq.aCD().c(an);
    }

    public ap_0 aCD() {
        return this == aqq ? new ap_0() : new ap_0().c(this);
    }

    protected ap_0 cJ(GeneratedMessageV3.BuilderParent builderParent) {
        ap_0 ap_02 = new ap_0(builderParent);
        return ap_02;
    }

    public static An aCE() {
        return aqq;
    }

    public static Parser<An> z() {
        return aqr;
    }

    public Parser<An> getParserForType() {
        return aqr;
    }

    public An aCF() {
        return aqq;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cJ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aCD();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aCB();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aCD();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aCB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aCF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aCF();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(An an) {
        return an.unknownFields;
    }
}

