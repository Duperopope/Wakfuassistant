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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zF
 */
public final class zf_2
extends GeneratedMessageV3
implements zi_1 {
    private static final long aoK = 0L;
    public static final int aoL = 1;
    List<zj_1> aoM;
    private byte Y = (byte)-1;
    private static final zf_2 aoN = new zf_2();
    @Deprecated
    public static final Parser<zf_2> aoO = new zg_1();

    zf_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zf_2() {
        this.aoM = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zf_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zf_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.aoM = new ArrayList<zj_1>();
                            bl |= true;
                        }
                        this.aoM.add((zj_1)codedInputStream.readMessage(zj_1.aoV, extensionRegistryLite));
                        continue block11;
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
                this.aoM = Collections.unmodifiableList(this.aoM);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor azM() {
        return zc_2.aoy;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zc_2.aoz.ensureFieldAccessorsInitialized(zf_2.class, zh_1.class);
    }

    @Override
    public List<zj_1> azN() {
        return this.aoM;
    }

    @Override
    public List<? extends zm_1> azO() {
        return this.aoM;
    }

    @Override
    public int azP() {
        return this.aoM.size();
    }

    @Override
    public zj_1 kU(int n) {
        return this.aoM.get(n);
    }

    @Override
    public zm_1 kV(int n) {
        return this.aoM.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.azP(); ++i) {
            if (this.kU(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.aoM.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.aoM.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.aoM.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.aoM.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zf_2)) {
            return super.equals(object);
        }
        zf_2 zf_22 = (zf_2)object;
        if (!this.azN().equals(zf_22.azN())) {
            return false;
        }
        return this.unknownFields.equals((Object)zf_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zf_2.azM().hashCode();
        if (this.azP() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.azN().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zf_2 en(ByteBuffer byteBuffer) {
        return (zf_2)aoO.parseFrom(byteBuffer);
    }

    public static zf_2 cB(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zf_2)aoO.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zf_2 ec(ByteString byteString) {
        return (zf_2)aoO.parseFrom(byteString);
    }

    public static zf_2 cB(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zf_2)aoO.parseFrom(byteString, extensionRegistryLite);
    }

    public static zf_2 cD(byte[] byArray) {
        return (zf_2)aoO.parseFrom(byArray);
    }

    public static zf_2 cB(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zf_2)aoO.parseFrom(byArray, extensionRegistryLite);
    }

    public static zf_2 gc(InputStream inputStream) {
        return (zf_2)GeneratedMessageV3.parseWithIOException(aoO, (InputStream)inputStream);
    }

    public static zf_2 gc(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zf_2)GeneratedMessageV3.parseWithIOException(aoO, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zf_2 gd(InputStream inputStream) {
        return (zf_2)GeneratedMessageV3.parseDelimitedWithIOException(aoO, (InputStream)inputStream);
    }

    public static zf_2 gd(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zf_2)GeneratedMessageV3.parseDelimitedWithIOException(aoO, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zf_2 cB(CodedInputStream codedInputStream) {
        return (zf_2)GeneratedMessageV3.parseWithIOException(aoO, (CodedInputStream)codedInputStream);
    }

    public static zf_2 jD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zf_2)GeneratedMessageV3.parseWithIOException(aoO, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zh_1 azQ() {
        return zf_2.azR();
    }

    public static zh_1 azR() {
        return aoN.azS();
    }

    public static zh_1 a(zf_2 zf_22) {
        return aoN.azS().c(zf_22);
    }

    public zh_1 azS() {
        return this == aoN ? new zh_1() : new zh_1().c(this);
    }

    protected zh_1 cB(GeneratedMessageV3.BuilderParent builderParent) {
        zh_1 zh_12 = new zh_1(builderParent);
        return zh_12;
    }

    public static zf_2 azT() {
        return aoN;
    }

    public static Parser<zf_2> z() {
        return aoO;
    }

    public Parser<zf_2> getParserForType() {
        return aoO;
    }

    public zf_2 azU() {
        return aoN;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cB(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.azS();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.azQ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.azS();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.azQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.azU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.azU();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zf_2 zf_22) {
        return zf_22.unknownFields;
    }
}

