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

/*
 * Renamed from AB
 */
public final class ab_0
extends GeneratedMessageV3
implements ae_0 {
    private static final long aqP = 0L;
    int an;
    public static final int aqQ = 1;
    long Dj;
    public static final int aqR = 2;
    AS aqS;
    public static final int aqT = 3;
    long wf;
    private byte Y = (byte)-1;
    private static final ab_0 aqU = new ab_0();
    @Deprecated
    public static final Parser<ab_0> aqV = new ac_0();

    ab_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ab_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ab_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ab_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Dj = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 18: {
                        AU aU = null;
                        if ((this.an & 2) != 0) {
                            aU = this.aqS.aFm();
                        }
                        this.aqS = (AS)codedInputStream.readMessage(AS.arM, extensionRegistryLite);
                        if (aU != null) {
                            aU.h(this.aqS);
                            this.aqS = aU.aFt();
                        }
                        this.an |= 2;
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.wf = codedInputStream.readInt64();
                        continue block13;
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

    public static final Descriptors.Descriptor aDI() {
        return zS.apr;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.aps.ensureFieldAccessorsInitialized(ab_0.class, ad_0.class);
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
    public boolean aDJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public AS aDK() {
        return this.aqS == null ? AS.aFn() : this.aqS;
    }

    @Override
    public AV aDL() {
        return this.aqS == null ? AS.aFn() : this.aqS;
    }

    @Override
    public boolean KT() {
        return (this.an & 4) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
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
        if (!this.aDJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.aDK().isInitialized()) {
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
            codedOutputStream.writeMessage(2, (MessageLite)this.aDK());
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.wf);
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
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aDK());
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.wf);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ab_0)) {
            return super.equals(object);
        }
        ab_0 ab_02 = (ab_0)object;
        if (this.Xh() != ab_02.Xh()) {
            return false;
        }
        if (this.Xh() && this.Xi() != ab_02.Xi()) {
            return false;
        }
        if (this.aDJ() != ab_02.aDJ()) {
            return false;
        }
        if (this.aDJ() && !this.aDK().equals(ab_02.aDK())) {
            return false;
        }
        if (this.KT() != ab_02.KT()) {
            return false;
        }
        if (this.KT() && this.KU() != ab_02.KU()) {
            return false;
        }
        return this.unknownFields.equals((Object)ab_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ab_0.aDI().hashCode();
        if (this.Xh()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Xi());
        }
        if (this.aDJ()) {
            n = 37 * n + 2;
            n = 53 * n + this.aDK().hashCode();
        }
        if (this.KT()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.KU());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ab_0 ey(ByteBuffer byteBuffer) {
        return (ab_0)aqV.parseFrom(byteBuffer);
    }

    public static ab_0 cM(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ab_0)aqV.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ab_0 eq(ByteString byteString) {
        return (ab_0)aqV.parseFrom(byteString);
    }

    public static ab_0 cM(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ab_0)aqV.parseFrom(byteString, extensionRegistryLite);
    }

    public static ab_0 cO(byte[] byArray) {
        return (ab_0)aqV.parseFrom(byArray);
    }

    public static ab_0 cM(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ab_0)aqV.parseFrom(byArray, extensionRegistryLite);
    }

    public static ab_0 gy(InputStream inputStream) {
        return (ab_0)GeneratedMessageV3.parseWithIOException(aqV, (InputStream)inputStream);
    }

    public static ab_0 gy(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ab_0)GeneratedMessageV3.parseWithIOException(aqV, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ab_0 gz(InputStream inputStream) {
        return (ab_0)GeneratedMessageV3.parseDelimitedWithIOException(aqV, (InputStream)inputStream);
    }

    public static ab_0 gz(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ab_0)GeneratedMessageV3.parseDelimitedWithIOException(aqV, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ab_0 cM(CodedInputStream codedInputStream) {
        return (ab_0)GeneratedMessageV3.parseWithIOException(aqV, (CodedInputStream)codedInputStream);
    }

    public static ab_0 kk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ab_0)GeneratedMessageV3.parseWithIOException(aqV, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ad_0 aDM() {
        return ab_0.aDN();
    }

    public static ad_0 aDN() {
        return aqU.aDO();
    }

    public static ad_0 a(ab_0 ab_02) {
        return aqU.aDO().c(ab_02);
    }

    public ad_0 aDO() {
        return this == aqU ? new ad_0() : new ad_0().c(this);
    }

    protected ad_0 cM(GeneratedMessageV3.BuilderParent builderParent) {
        ad_0 ad_02 = new ad_0(builderParent);
        return ad_02;
    }

    public static ab_0 aDP() {
        return aqU;
    }

    public static Parser<ab_0> z() {
        return aqV;
    }

    public Parser<ab_0> getParserForType() {
        return aqV;
    }

    public ab_0 aDQ() {
        return aqU;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cM(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aDO();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aDM();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aDO();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aDM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aDQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aDQ();
    }

    static /* synthetic */ boolean cQ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ab_0 ab_02) {
        return ab_02.unknownFields;
    }
}

