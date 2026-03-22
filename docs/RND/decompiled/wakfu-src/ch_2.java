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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ch
 */
public final class ch_2
extends GeneratedMessageV3
implements ck_1 {
    private static final long hO = 0L;
    public static final int hP = 1;
    long fG;
    public static final int hQ = 2;
    List<az_2> hR;
    private byte Y = (byte)-1;
    private static final ch_2 hS = new ch_2();
    static final Parser<ch_2> hT = new ci_2();

    ch_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ch_2() {
        this.hR = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ch_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ch_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        if (!(bl & true)) {
                            this.hR = new ArrayList<az_2>();
                            bl |= true;
                        }
                        this.hR.add((az_2)codedInputStream.readMessage(az_2.z(), extensionRegistryLite));
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
            if (bl & true) {
                this.hR = Collections.unmodifiableList(this.hR);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor lH() {
        return ae_1.eY;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eZ.ensureFieldAccessorsInitialized(ch_2.class, cj_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public List<az_2> lI() {
        return this.hR;
    }

    @Override
    public List<? extends bd_1> lJ() {
        return this.hR;
    }

    @Override
    public int lK() {
        return this.hR.size();
    }

    @Override
    public az_2 R(int n) {
        return this.hR.get(n);
    }

    @Override
    public bd_1 S(int n) {
        return this.hR.get(n);
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
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        for (int i = 0; i < this.hR.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.hR.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        for (int i = 0; i < this.hR.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.hR.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ch_2)) {
            return super.equals(object);
        }
        ch_2 ch_22 = (ch_2)object;
        if (this.fD() != ch_22.fD()) {
            return false;
        }
        if (!this.lI().equals(ch_22.lI())) {
            return false;
        }
        return this.unknownFields.equals((Object)ch_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ch_2.lH().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.lK() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.lI().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ch_2 K(ByteBuffer byteBuffer) {
        return (ch_2)hT.parseFrom(byteBuffer);
    }

    public static ch_2 K(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ch_2)hT.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ch_2 aq(ByteString byteString) {
        return (ch_2)hT.parseFrom(byteString);
    }

    public static ch_2 K(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ch_2)hT.parseFrom(byteString, extensionRegistryLite);
    }

    public static ch_2 K(byte[] byArray) {
        return (ch_2)hT.parseFrom(byArray);
    }

    public static ch_2 K(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ch_2)hT.parseFrom(byArray, extensionRegistryLite);
    }

    public static ch_2 au(InputStream inputStream) {
        return (ch_2)GeneratedMessageV3.parseWithIOException(hT, (InputStream)inputStream);
    }

    public static ch_2 au(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ch_2)GeneratedMessageV3.parseWithIOException(hT, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ch_2 av(InputStream inputStream) {
        return (ch_2)GeneratedMessageV3.parseDelimitedWithIOException(hT, (InputStream)inputStream);
    }

    public static ch_2 av(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ch_2)GeneratedMessageV3.parseDelimitedWithIOException(hT, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ch_2 K(CodedInputStream codedInputStream) {
        return (ch_2)GeneratedMessageV3.parseWithIOException(hT, (CodedInputStream)codedInputStream);
    }

    public static ch_2 be(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ch_2)GeneratedMessageV3.parseWithIOException(hT, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cj_1 lL() {
        return ch_2.lM();
    }

    public static cj_1 lM() {
        return hS.lN();
    }

    public static cj_1 a(ch_2 ch_22) {
        return hS.lN().c(ch_22);
    }

    public cj_1 lN() {
        return this == hS ? new cj_1() : new cj_1().c(this);
    }

    protected cj_1 K(GeneratedMessageV3.BuilderParent builderParent) {
        cj_1 cj_12 = new cj_1(builderParent);
        return cj_12;
    }

    public static ch_2 lO() {
        return hS;
    }

    public static Parser<ch_2> z() {
        return hT;
    }

    public Parser<ch_2> getParserForType() {
        return hT;
    }

    public ch_2 lP() {
        return hS;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.K(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.lN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.lL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.lN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.lL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.lP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.lP();
    }

    static /* synthetic */ boolean lQ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean lR() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ch_2 ch_22) {
        return ch_22.unknownFields;
    }
}

